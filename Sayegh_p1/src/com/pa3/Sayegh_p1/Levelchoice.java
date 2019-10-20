package com.pa3.Sayegh_p1;

import java.util.Scanner;
import java.util.Random;

public class Levelchoice {
    private Random rand = new Random();
    private Scanner scnr = new Scanner(System.in);
    private level1 c1 = new level1();
    private level2 c2 = new level2();
    private level3 c3 = new level3();
    private level4 c4 = new level4();

    public int difficultyLevel(Scanner scnr) {
        int choice = 0;

        do {
            System.out.println("What difficulty would you like to play?");
            System.out.println("Level 1");
            System.out.println("Level 2");
            System.out.println("Level 3");
            System.out.println("Level 4");
            choice = scnr.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;


    }

    public int gameChoice(Scanner scnr) {
        int game = 0;
        do {
            System.out.println("What game mode would you like to play?");
            System.out.println("1. Multiplication");
            System.out.println("2. Addition");
            System.out.println("3. Subtraction");
            System.out.println("4. Division");
            System.out.println("5. Mixed Algebra");
            game = scnr.nextInt();
        } while (game < 1 || game > 5);

        return game;
    }

    public void levelload(int choice, int game) {
        int[] randVal = new int[30];
        double[] ans = new double[30];

        if (choice == 1) {
            if (game == 1) {
                c1.generateMultQuestion(randVal, ans, scnr);
            }
            if (game == 2) {
                c1.generateSumQuestion(randVal, ans, scnr);
            }
            if (game == 3) {
                c1.generateSubQuestion(randVal, ans, scnr);
            }
            if (game == 4) {
                c1.generateDivQuestion(randVal, ans, scnr);
            }
            if (game == 5) {
                c1.generateMixedQuestion(randVal, ans, scnr);
            }
        }
        if (choice == 2) {
            if (game == 1) {
                c2.generateMultQuestion(randVal, ans, scnr);
            }
            if (game == 2) {
                c2.generateSumQuestion(randVal, ans, scnr);
            }
            if (game == 3) {
                c2.generateSubQuestion(randVal, ans, scnr);
            }
            if (game == 4) {
                c2.generateDivQuestion(randVal, ans, scnr);
            }
            if (game == 5) {
                c2.generateMixedQuestion(randVal, ans, scnr);
            }
        }

        if (choice == 3) {
            if (game == 1) {
                c3.generateMultQuestion(randVal, ans, scnr);
            }
            if (game == 2) {
                c3.generateSumQuestion(randVal, ans, scnr);
            }
            if (game == 3) {
                c3.generateSubQuestion(randVal, ans, scnr);
            }
            if (game == 4) {
                c3.generateDivQuestion(randVal, ans, scnr);
            }
            if (game == 5) {
                c3.generateMixedQuestion(randVal, ans, scnr);
            }
        }
        if (choice == 4) {
            if (game == 1) {
                c4.generateMultQuestion(randVal, ans, scnr);
            }
            if (game == 2) {
                c4.generateSumQuestion(randVal, ans, scnr);
            }
            if (game == 3) {
                c4.generateSubQuestion(randVal, ans, scnr);
            }
            if (game == 4) {
                c4.generateDivQuestion(randVal, ans, scnr);
            }
            if (game == 5) {
                c4.generateMixedQuestion(randVal, ans, scnr);
            }


        }


    }
}
