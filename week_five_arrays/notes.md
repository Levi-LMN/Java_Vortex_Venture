# Arrays in Java
Arrays are a data structure that can store a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.  
The elements of an array are stored in a contiguous memory location.  
The array elements can be accessed using an index.  
The index of the first element in an array is 0, the second element is 1, and so on.  
The length of an array is established when the array is created. After creation, its length is fixed.  
Simply put an array is a collection of variables of the same type.  
Instead of declaring individual variables, such as number0, number1, ..., and number99, you declare one array variable such as numbers and use numbers[0], numbers[1], and ..., numbers[99] to represent individual variables.  

## Declaring Arrays
To declare an array, define the variable type with square brackets:  
```java
String[] cars;
int[] myNum;
```
We have now declared a variable that holds an array of strings. To add values to the array, we can use an array literal - place the values in a comma-separated list, inside curly braces:  
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};
```

## Access the Elements of an Array
You access an array element by referring to the index number.
This statement accesses the value of the first element in cars:  
```java
public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);
    }
}
```

## Change an Array Element
You can change the value of a specific element by referring to the index number:  
```java
public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "Opel";
    System.out.println(cars[0]);
    }
}
```
it will print out "Opel" instead of "Volvo".

## Array Length
To find out how many elements an array has, use the length property:  
```java
public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars.length);
    }
}
```
The output will be 4.

## Loop Through an Array