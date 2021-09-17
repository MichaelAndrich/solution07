/*
 *  UCF COP3330 Fall 2021 Assignment 07 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt user for length and width of the room
    output their entered length and width
    calculate area in square feet
    convert from sq feet to sq meters while keeping calculations separate from the output
    conversion formula is m2 = fx * 0.09290304
    display sq feet area
    display sq meters area
 */




import java.util.Scanner;

public class solution07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double conversion =  0.092990304;


        System.out.println("What is the length of the room in feet? ");
        String num1 = sc.nextLine();
        int l = Integer.parseInt(""+num1);

        System.out.println("What is the width of the room in feet? ");
        String num2 = sc.nextLine();
        int w = Integer.parseInt(""+num2);

        System.out.println("You entered dimensions of "+(l)+ " feet by "+(w)+ " feet. ");

        int a = (l * w);
        int ma = (int) (a * conversion);

        System.out.println("The area is "+(a)+ " square feet and "+(ma)+" square meters. ");

    }
}
