/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class Main {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);    //Scanner to obtain input

        System.out.println("What is your age? ");
        String age = sc.nextLine(); //Read input from the user
        int Age = Integer.parseInt(age);  //Convert user input from string to integer

        //Using ternary operator
        final String output = (Age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(output); //display output
        }
    }

