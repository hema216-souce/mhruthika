Type Casting
The process of converting the value of one data type (int, float, double, etc.) to another data type is known as typecasting.

In Java, there are 13 types of type conversion. However, in this tutorial, we will only focus on the major 2 types.

1. Widening Type Casting

2. Narrowing Type Casting

To learn about other types of type conversion, visit Java Type Conversion (official Java documentation).

Widening Type Casting
In Widening Type Casting, Java automatically converts one data type to another data type.

Example: Converting int to double
class Main {
  public static void main(String[] args) {
    // create int type variable
    int num = 10;
    System.out.println("The integer value: " + num);

    // convert into double type
    double data = num;
    System.out.println("The double value: " + data);
  }
}
Run Code
Output

The integer value: 10
The double value: 10.0
In the above example, we are assigning the int type variable named num to a double type variable named data.

Here, the Java first converts the int type data into the double type. And then assign it to the double variable.
