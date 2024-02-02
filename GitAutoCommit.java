/*
This is a file that can be run to automatically commit changes to a Git repository.
It is intended to be used with a cron job or other scheduling program.
It adds, commits, and pushes all unstaged changes in the repository.
It uses the file name to generate a commit message.
Thanks to https://stackoverflow.com/a/36376477/ for the idea.

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GitAutoCommit {

    public static void main(String[] args) {
        // Specify the parent directory where the program is located
        String parentDirectoryPath = System.getProperty("user.dir");

        try {
            // Get all directories and files in the parent directory
            List<File> allFiles = getAllFiles(parentDirectoryPath);

            List<File> unstagedChanges = new ArrayList<>();

            // Check each file for unstaged changes
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

                // Commit changes with appropriate messages
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

            // Create a copy to avoid ConcurrentModificationException
            List<File> subdirectories = new ArrayList<>(allFiles);

            // Recursive call for subdirectories
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
            return false;  // Ignore directories, hidden files, and compiled class files
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

            // Add changes
            ProcessBuilder addProcessBuilder = new ProcessBuilder("git", "add", file.getPath());
            Process addProcess = addProcessBuilder.start();
            addProcess.waitFor();

            // Commit changes
            ProcessBuilder commitProcessBuilder = new ProcessBuilder("git", "commit", "-m", commitMessage);
            Process commitProcess = commitProcessBuilder.start();
            commitProcess.waitFor();
        }

        // Push the changes
        ProcessBuilder pushProcessBuilder = new ProcessBuilder("git", "push");
        Process pushProcess = pushProcessBuilder.start();
        pushProcess.waitFor();
    }

    private static String getFileNameWithoutExtension(File file) {
        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf('.');
        return lastDotIndex != -1 ? fileName.substring(0, lastDotIndex) : fileName;
    }

}

