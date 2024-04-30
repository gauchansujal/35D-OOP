import java.util.Scanner;
//or
//import java.util.*;
public class InputOutput{

    public static void main(String[]args){
        //user output
        System.out.println("this sentence will have line breake");
        //system.out.print
        System.out.print("this will not have break");
        System.out.print("this line will continue. \n");
        //string formating using system.out.print
        // %s string, %d Integrat, %f floating point, %b boolen
        //this will also not break line

        System.out.printf( "hello %s, good morning",  "world");
        System.out.printf("the number is %d ", 10);
        //can use multiple formatter 
        System.out.printf("\nthe floating %f and boolen %b", 10.3f, false);

        // user Input
        // import java.unit,scanner:// copy this at the top of the code

        Scanner scan = new Scanner (System.in);
        System out.println("the following take whole sentence");
        String wholeOutput = scan.nextline();
        System.out.println("the input taken is " + wholeOutput);
        System.out.println("the following takes integre");
        int intInput = scan.nextInt();
        System.out.println("the input taken is " + intInput);
        System.out.println("the following take double");
        double doubleInput = scan .nextDouble();
        System.err.println("the following takes ");
        System.out.println("the following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("the input taken is " + booleanInput);
        scan.close();// you must close  the scanner once all input is taken 

        // task 
        // Make a new scanner object scan1
        // prompt the following and teh input 
        //what is your naem? usave the input to string = name

        //Are you  over 18? save the input to string = status
        // how many sibling? save the inoput to integer = sibling
        // print the following 
        // Hello name, 
        // over 18? , status
        // you have sibling number of sibling










    }
}