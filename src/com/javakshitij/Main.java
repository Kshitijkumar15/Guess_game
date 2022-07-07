package com.javakshitij;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("guess the number(1-100) :");
            userNumber = sc.nextInt();

            if (userNumber == myNumber){
                System.out.println("oh yeah,you guessed it right");
            break;
            }
            else if (userNumber > myNumber) {
                System.out.println("guessed number is large ");
            }
            else {
                System.out.println("guessed number is small");
            }
            } while(userNumber >= 0);
        System.out.println("the number is :");
        System.out.println(myNumber);



    }
}
