package javaPractice;

import java.io.*;
import java.util.Scanner;

/**
 * Ways to read input from console in Java
 */

public class Example2 {

    public static void main(String[] args) throws IOException {
//        /**
//         * Using Buffered Reader Class
//         */
//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//        String input=bufferedReader.readLine();
//
//        System.out.println("Using Buffered Reader Class: "+input);
//
//        /**
//         * Using Scanner Class
//         */
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        System.out.println("Using Scanner Class: " + s);

        /**
         * Using Console Class
         */

        Console obj=System.console();
        System.out.println("Enter Username: ");
        String username=obj.readLine();
        System.out.println("Enter Password: ");
        String password=obj.readLine();
        System.out.println("Using Console Class: Username- "+username+"Password- "+password);

        /**
         * Using Command line argument
         */

        if(args.length>0){
            System.out.println("The command line arguments are:");

            for(String val:args){
                System.out.println(val);
            }
        }else
            System.out.println("No command line "
                    + "arguments found.");
    }
}
