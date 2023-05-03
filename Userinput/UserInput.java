package Userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        // Scanner in =new Scanner(System.in);
        // String s=in.nextLine();
        // System.out.println("Entered a string" + s);
        // int a=in.nextInt();
        // System.out.println("Entered a integar" + a);

        //Scanner
        // System.out.println("Enter a number");
        // Scanner a= new Scanner(System.in);
        // int b= a.nextInt();
        // System.out.println(b);

        //bufferreader
        // BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter your name");
        // String n=reader.readLine();
        // System.out.println(n);

        System.out.println("enter yout numbr");
        int n= System.in.read();
        System.out.println(n);

    }
    
}
