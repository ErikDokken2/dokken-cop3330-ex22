package exercises.ex22;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */

import java.util.Scanner;

public class ex22 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex22 example22 = new ex22();

        String firstNum = example22.firstNum();
        String secondNum = example22.secondNum();
        String thirdNum = example22.thirdNum();

        //Str->Int
        int firstInt = example22.firstInt(firstNum);
        int secondInt = example22.secondInt(secondNum);
        int thirdInt = example22.thirdInt(thirdNum);

        example22.errorCheck(firstInt,secondInt,thirdInt);

        if(firstInt > secondInt && firstInt > thirdInt)
        {
            System.out.println("The largest number is "+ firstInt + ".");
        }
        if(secondInt > firstInt && secondInt > thirdInt)
        {
            System.out.println("The largest number is "+ secondInt + ".");
        }
        if(thirdInt > secondInt && thirdInt > firstInt)
        {
            System.out.println("The largest number is "+ thirdInt + ".");
        }

    }

    private void errorCheck(int firstInt, int secondInt, int thirdInt) {
        if((firstInt == secondInt)||(firstInt ==thirdInt)|| secondInt == thirdInt)
        {
            System.exit(0);
        }
    }


    private int thirdInt(String thirdNum) {
        return Integer.parseInt(thirdNum);
    }

    private int secondInt(String secondNum) {
        return Integer.parseInt(secondNum);
    }

    private int firstInt(String firstNum) {
        return Integer.parseInt(firstNum);
    }

    private String thirdNum() {
        System.out.print("Enter the third number: ");
        String thirdNum = in.nextLine();
        return thirdNum;
    }

    private String secondNum() {
        System.out.print("Enter the second number: ");
        String secondNum = in.nextLine();
        return secondNum;
    }

    private String firstNum() {
        System.out.print("Enter the first number: ");
        String firstNum = in.nextLine();
        return firstNum;
    }

}
