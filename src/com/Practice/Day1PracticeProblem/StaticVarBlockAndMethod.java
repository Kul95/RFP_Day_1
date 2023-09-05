package com.Practice.Day1PracticeProblem;

public class StaticVarBlockAndMethod {
    //static variable...
    static int x=20;
    //static block...
    static{
        System.out.println("Static block");
        System.out.println("Static variable value is: "+x);
    }
    //static method.....
    static void display(){
        System.out.println("Static method....");
        System.out.println("Static Var: "+x);
    }

    public static void main(String[] args) {
        System.out.println(x);
        StaticVarBlockAndMethod.display();
    }
}
