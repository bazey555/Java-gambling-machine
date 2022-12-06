package com.young_basey1;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        int credits = 1000;
        boolean winornot = false;
        int number = 0;
        int bet = 0;
        int x = 1;
        int b = 0;
        int c = 0;

        while ( credits > 0 ) {



            System.out.println("your credits: " + credits);

            Scanner scanner1 = new Scanner(System.in);







            while (true) {
                System.out.println("Bet: ");
                bet = scanner1.nextInt();
                if (bet > credits)

                    System.out.println("not enough credits");
                else
                    break;


            }



            while (true) {
                System.out.println("Number: ");
                number = scanner1.nextInt();
                if (number > 10)

                    System.out.println("enter a number between 0 and 10");
                else
                    break;


            }





            int result1 = (int) (Math.random() * 10);
            System.out.println(result1);

            int result2 = (int) (Math.random() * 10);
            System.out.println(result2);

            int result3 = (int) (Math.random() * 10);
            System.out.println(result3);




            if (number == result1) {
                winornot = true;
                System.out.println("YOU WON");

            } else if (number == result2) {
                System.out.println("YOU WON");
                winornot = true;
            } else if (number == result3) {
                System.out.println("YOU WON");
                winornot = true;
            } else {

                System.out.println("YOU LOST");
                winornot = false;
            }





            if (winornot == true && number == result1 && result1 == result2 && result1 == result3){

                x = 3;
                System.out.println("x 3");}

            else if (winornot == true && number == result1 && result1 == result2){

                x = 2;
                System.out.println("x 2");}

            else if (winornot == true && number == result1 && result1 == result3){

                x = 2;
                System.out.println("x 2");}


            else if (winornot == true && result2 == result3){

                x = 2;
                System.out.println("x 2");}



            if (winornot == false){
                c = bet;
                credits = credits - c;
            }
            if (winornot == true) {

                b = bet * x;
                System.out.println(b);
            }


            if (winornot == true) {
                credits = credits + b;

            }

            if (credits <= 0)
                System.out.println("GAME OVER");




        }
    }
}
