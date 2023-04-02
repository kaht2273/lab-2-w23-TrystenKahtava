package lab2;

import java.math.BigInteger;

public class ProgrammingProject_2_6 {

    public static void main(String[] args) {
        //"The BigInteger class represents integer numbers with an arbitrary number of digits.
        // (As you will see in Chapter 4, the int type cannot express very large integers.)
        // You can construct a BigInteger object by providing a string of its digits, such as
        //BigInteger a = new BigInteger("12345678987654321");
        //Write a program that prints the square, fourth power,
        // and eighth power of "a" using one of the methods of the BigInteger class."
        BigInteger a = new BigInteger("12345678987654321");
        BigInteger b = new BigInteger("0");
        BigInteger c = new BigInteger("0");

        b = a.sqrt();
        c = a.pow(4);

        System.out.println("a = " + a );
        System.out.println("Square root of a = " + b );
        System.out.println("a to the power of 4 = " + c );

    }
}
