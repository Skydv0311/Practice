package javaPractice;

import java.util.Scanner;

/**
 * How to Read and Print an Integer value in Java
 */

public class Example1 {

    public static void main(String[] args) {
        int varName;

        System.out.println("Enter the Integer: ");

        Scanner scanner=new Scanner(System.in);

        varName=scanner.nextInt();

        System.out.println("Entered integer is: "+varName);
    }
}
