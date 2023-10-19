package Ogilvy_SE_Test;

import java.util.Random;
import java.util.Scanner;

public class Question_06 {

    public static void main(String[] args) {



        while (true) {

            System.out.println("Guess What I'm Thinking");

            Scanner Input = new Scanner(System.in);
            System.out.println("Enter a number between 01 and 10! (For exit enter 100)");

            int numberInput = Input.nextInt();

            Random Think = new Random();
            int thinkingNumber = Think.nextInt(10);

            if (numberInput == thinkingNumber) {
                System.out.println("We got a winner!");
                System.out.println();
            } else if (numberInput == 100){
                break;
            }else{
                System.out.println("Bad luck! Try Again, What I'm thinking was " + thinkingNumber);
                System.out.println();
            }
        }
    }
}
