package com.Practice.Day1PracticeProblem;

import java.util.Scanner;

public class InputNameUsingCommandLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        int name=sc.nextInt();
        System.out.println("My name is : "+name);
    }
}
