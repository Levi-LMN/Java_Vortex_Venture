/*
  This is a file to learn all about the Java variables and data types like int, double, float, char, boolean, string
*/
public class variables {
    public static void main(String[] args) {
        // int is a data type that stores whole numbers
        int myInt = 10;
        System.out.println("The value of myInt is :\t" + myInt);

        // double is a data type that stores decimal numbers
        double myDouble = 10.5;
        System.out.println("The value of myDouble is :\t" + myDouble);

        // float is a data type that stores decimal numbers
        float myFloat = 10.5f;
        System.out.println("The value of myFloat is :\t" + myFloat);

        // char is a data type that stores single characters
        char myChar = 'A';
        System.out.println("The value of myChar is :\t" + myChar);

        // boolean is a data type that stores true or false
        boolean myBoolean = true;
        System.out.println("The value of myBoolean is :\t" + myBoolean);

        // string is a data type that stores a sequence of characters
        String myString = "Hello World";
        System.out.println("The value of myString is :\t" + myString);

        // You can also declare a variable without assigning the value and assign the value later
        int myInt2;
        myInt2 = 20;
        System.out.println("The value of myInt2 which was declared without assigning a value is :\t" + myInt2);

        // If you assign a new value to an existing variable, it will overwrite the previous value
        int myInt3 = 30;
        myInt3 = 40;
        System.out.println("The value of myInt3 which was declared and assigned a value is :\t" + myInt3);

        // If you don't want to overwrite the previous value, you can use the final keyword
        final int myInt4 = 50;
        System.out.println("The value of myInt4 which was declared and assigned a value and declared final is :\t" + myInt4);

        // Printing a new line
        System.out.println("you use '\\n' to print on a new line \n");
        System.out.println("DECLARING VARIABLES \n");

        // Displaying variables
        String name = "Levi";
        System.out.println("Hello " + name + " This is how to display variables in Java");

        // You can also use the + character to add a variable to another variable
        String firstName = "Levi";
        String lastName = "Mukuha";
        String fullName = firstName + " " + lastName;
        System.out.println("My full name written using the + character is :\t" + fullName);

        // For numeric values, the + character works as a mathematical operator (addition) notice we use int (integer) data type
        int x = 5;
        int y = 6;
        System.out.println("The sum of x and y which uses the + character as a mathematical operator is :\t" + (x + y));

        System.out.println("Java Declare multiple variables \n");

        // To declare more than one variable of the same type, use a comma-separated list
        int x1 = 5, y1 = 6, z1 = 7;
        System.out.println("The sum of x1, y1, and z1 which are declared in one line is :\t" + (x1 + y1 + z1));

        // One value to multiple variables which means you can assign one value to multiple variables
        int x2, y2, z2;
        x2 = y2 = z2 = 10;
        System.out.println("The value of x2, y2, and z2 which are assigned one value is :\t" + (x2 + y2 + z2));

        //print Java intifiers
        System.out.println("Java Identifiers \n");
        // All Java variables must be identified with unique names. These unique names are called identifiers.
        // Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
        // Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
        // Rules for Java Identifiers
        // All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
        // After the first character, identifiers can have any combination of characters.
        // A key word cannot be used as an identifier.
        // Most importantly, identifiers are case sensitive.
        // Examples of legal identifiers: age, $salary, _value, __1_value.
        // Examples of illegal identifiers: 123abc, -salary.

        //good
        int minutesPerHour = 60;

        //Ok but not so easy to understand what m actually is
        int m = 60;

        //print general rules for naming variables
        System.out.println("General Rules for Naming Variables \n");
        System.out.println("Variable names are case sensitive (age, Age and AGE are three different variables)");
        System.out.println("Variable names cannot contain spaces or reserved keywords");
        System.out.println("Variable names can contain letters, digits, underscores, and dollar signs");
        System.out.println("Variable names should be short and descriptive");
        System.out.println("Variable names should not start with a digit, underscore or dollar sign");

        //print Java Data Types
        System.out.println("Java Data Types \n");
        // print data types are divided into two groups:
        System.out.println("Primitive data types - includes byte, short, int, long, float, double, boolean and char");
        System.out.println("Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)");
        // print Java Primitive Data Types
        System.out.println("Java Primitive Data Types \n");
        // print Primitive data types are the most basic data types available within the Java language.
        // There are 8: boolean, byte, char, short, int, long, float and double.
        // print boolean Data Type
        System.out.println("boolean Data Type \n");
        System.out.println("A boolean data type is declared with the boolean keyword and can only take the values true or false:");
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("The value of isJavaFun is :\t" + isJavaFun);
        System.out.println("The value of isFishTasty is :\t" + isFishTasty);
        // print byte Data Type
        System.out.println("byte Data Type \n");
        System.out.println("The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:");
        byte myByte = 100;
        System.out.println("The value of myByte is :\t" + myByte);
        // print short Data Type
        System.out.println("short Data Type \n");
        System.out.println("The short data type can store whole numbers from -32768 to 32767. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -32768 and 32767:");
        short myShort = 5000;
        System.out.println("The value of myShort is :\t" + myShort);
        // print int Data Type
        System.out.println("int Data Type \n");
        System.out.println("The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value:");
        int myInt5 = 100000;
        System.out.println("The value of myInt5 is :\t" + myInt5);
        // print long Data Type
        System.out.println("long Data Type \n");
        System.out.println("The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an \"L\":");
        long myLong = 15000000000L;
        System.out.println("The value of myLong is :\t" + myLong);
        // print float Data Type
        System.out.println("float Data Type \n");
        System.out.println("The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an \"f\":");
        float myFloat2 = 5.75f;
        System.out.println("The value of myFloat2 is :\t" + myFloat2);
        // print double Data Type
        System.out.println("double Data Type \n");
        System.out.println("The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a \"d\":");
        double myDouble2 = 19.99d;
        System.out.println("The value of myDouble2 is :\t" + myDouble2);
        // print char Data Type
        System.out.println("char Data Type \n");
        System.out.println("The char data type can store single characters. The character must be surrounded by single quotes, like 'A' or 'c':");
        char myChar2 = 'D';
        System.out.println("The value of myChar2 is :\t" + myChar2);
        // print String Data Type
        System.out.println("String Data Type \n");
        System.out.println("The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:");
        String myString2 = "Hello World";
        System.out.println("The value of myString2 is :\t" + myString2);



    }
}
