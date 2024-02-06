import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GitAutoCommit {

    public static void main(String[] args) {
        String parentDirectoryPath = System.getProperty("user.dir");

        try {
            List<File> allFiles = getAllFiles(parentDirectoryPath);

            List<File> unstagedChanges = new ArrayList<>();

            for (File file : allFiles) {
                if (isFileUnstaged(file)) {
                    unstagedChanges.add(file);
                }
            }

            if (!unstagedChanges.isEmpty()) {
                System.out.println("Unstaged changes detected:");
                for (File file : unstagedChanges) {
                    System.out.println(file.getPath());
                }

                commitChanges(unstagedChanges);
            } else {
                System.out.println("No unstaged changes found.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static List<File> getAllFiles(String directoryPath) {
        List<File> allFiles = new ArrayList<>();
        File parentDirectory = new File(directoryPath);

        if (parentDirectory.exists() && parentDirectory.isDirectory()) {
            allFiles.addAll(Arrays.asList(parentDirectory.listFiles()));

            List<File> subdirectories = new ArrayList<>(allFiles);

            for (File subdirectory : subdirectories) {
                if (subdirectory.isDirectory()) {
                    allFiles.addAll(getAllFiles(subdirectory.getPath()));
                }
            }
        }

        return allFiles;
    }

    private static boolean isFileUnstaged(File file) throws IOException, InterruptedException {
        if (!file.isFile() || file.isHidden() || file.getName().endsWith(".class")) {
            return false;
        }

        ProcessBuilder processBuilder = new ProcessBuilder("git", "diff", "--name-only", file.getPath());
        Process process = processBuilder.start();
        process.waitFor();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        return reader.readLine() != null;
    }

    private static void commitChanges(List<File> files) throws IOException, InterruptedException {
        for (File file : files) {
            String fileNameWithoutExtension = getFileNameWithoutExtension(file);

            String commitMessage = fileNameWithoutExtension + " updated";

            ProcessBuilder addProcessBuilder = new ProcessBuilder("git", "add", file.getPath());
            Process addProcess = addProcessBuilder.start();
            addProcess.waitFor();

            ProcessBuilder commitProcessBuilder = new ProcessBuilder("git", "commit", "-m", commitMessage);
            Process commitProcess = commitProcessBuilder.start();
            commitProcess.waitFor();
        }

        ProcessBuilder pushProcessBuilder = new ProcessBuilder("git", "push");
        Process pushProcess = pushProcessBuilder.start();
        int pushExitCode = pushProcess.waitFor();

        if (pushExitCode == 0) {
            System.out.println("Changes successfully pushed to the remote repository.");
        } else {
            System.out.println("Failed to push changes to the remote repository. Exit code: " + pushExitCode);
        }
    }

    private static String getFileNameWithoutExtension(File file) {
        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf('.');
        return lastDotIndex != -1 ? fileName.substring(0, lastDotIndex) : fileName;
    }
}
