package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int computerNumber =(int) Math.round(Math.random()* 100);
        System.out.println("Let the game begin!");
        System.out.println(computerNumber);
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input number: ");
        int userNumber = 0 ;

        do{
            userNumber = in.nextInt();
            System.out.println(userNumber);
            if(computerNumber > userNumber){
                System.out.println("Your number is too small. Please, try again");
                System.out.print("Input a number: ");
            }
            else if(computerNumber < userNumber){
                System.out.println("Your number is too big. Please, try again");
                System.out.print("Input a number: ");
            }
        }
        while (computerNumber != userNumber );
        System.out.print("Congratulations," + name + "!");

    }
}
