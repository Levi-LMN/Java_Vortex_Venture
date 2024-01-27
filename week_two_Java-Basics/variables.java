/*
this is a file to learn all about the java variables and data types like int, double, float, char, boolean, string
 */
public class variables {
    public static void main(String[] args) {
        // int is a data type that stores whole numbers
        int myint = 10;
        System.out.println("The value of myint is :\t" + myint);
        // double is a data type that stores decimal numbers
        double mydouble = 10.5;
        System.out.println("The value of mydouble is :\t" + mydouble);
        // float is a data type that stores decimal numbers
        float myfloat = 10.5f;
        System.out.println("The value of myfloat is :\t" + myfloat);
        // char is a data type that stores single characters
        char mychar = 'A';
        System.out.println("The value of mychar is :\t" + mychar);
        // boolean is a data type that stores true or false
        boolean myboolean = true;
        System.out.println("The value of myboolean is :\t" + myboolean);
        // string is a data type that stores a sequence of characters
        String mystring = "Hello World";
        System.out.println("The value of mystring is :\t" + mystring);

        //You can also declare a variable without assigning the value, and assign the value later:
        int myint2;
        myint2 = 20;
        System.out.println("The value of myint2 which was declared without assigning a value is :\t" + myint2);

        //if you assign a new value to an existing variable, it will overwrite the previous value:
        int myint3 = 30;
        myint3 = 40;
        System.out.println("The value of myint3 which was declared and assigned a value is :\t" + myint3);

        //if you dont want to overwrite the previous value, you can use the final keyword
        final int myint4 = 50;
        System.out.println("The value of myint4 which was declared and assigned a value and declared final is :\t" + myint4);
        //myint4 = 60; //this will give an error because myint4 is declared final
        //System.out.println("The value of myint4 which was declared and assigned a value and declared final is :\t" + myint4);

        System.out.println("you use '\\n' to print on a new line \n");
        System.out.println("DECLARING VARIABLES \n");

        //displaying variables
        String name = "Levi";
        System.out.println("Hello " + name + " This is how to display variables in java");

        //You can also use the + character to add a variable to another variable:
        String firstname = "Levi";
        String lastname = "Mukuha";
        String fullname = firstname + " " + lastname;
        System.out.println("My full name written using the + character is :\t" + fullname);

        //for numeric values the + character works as a mathematical operator (addition) notice we use int (integer) data type
        int x = 5;
        int y = 6;
        System.out.println("The sum of x and y which uses the + character as a mathematical operator is :\t" + (x + y));

        System.out.println("Java Declare multiple variables \n");

        //to declare more than one variable of the same type, use a comma-separated list:
        int x =5;
        int y =6;
        int z =7;
        System.out.println("The sum of x, y and z which are each declared separately is :\t" + (x + y + z));
        int x =5, y =6, z =7;
        System.out.println("The sum of x, y and z which are  declared in one line is :\t" + (x + y + z));

    }
}

