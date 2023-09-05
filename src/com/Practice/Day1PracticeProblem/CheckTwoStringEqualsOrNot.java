package com.Practice.Day1PracticeProblem;

import java.util.Scanner;

public class CheckTwoStringEqualsOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1=sc.next();
        System.out.println("Enter the second string: ");
        String str2=sc.next();
        if(str1.equals(str2)){
            System.out.println("Two string are equal");
        }else{
            System.out.println("Two string are not equal");
        }
    }
}
