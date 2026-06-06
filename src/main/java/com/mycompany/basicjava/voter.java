package com.mycompany.basicjava;
import java.util.Scanner;

public class voter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter your age:");
        age = input.nextInt();
        
        if(age>=18){
            System.out.print("VOTER");
        }
        else{
            System.out.print("NO voter");
        }
    }
}


