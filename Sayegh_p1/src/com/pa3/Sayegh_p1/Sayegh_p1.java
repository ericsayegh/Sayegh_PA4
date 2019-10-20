package com.pa3.Sayegh_p1;

import java.util.Scanner;

public class Sayegh_p1 {
    public static void main(String[] args) {
        Levelchoice c = new Levelchoice();
        Scanner scnr = new Scanner(System.in);
        int choice;
        int game;
        int playAgain = 1;
        do {
            choice = c.difficultyLevel(scnr);
            game = c.gameChoice(scnr);
            c.levelload(choice, game);
            System.out.println("Would you like to play again?");
            System.out.println("1. yes");
            System.out.println("2. no");
            playAgain = scnr.nextInt();

        }while(playAgain == 1);

     }
}

