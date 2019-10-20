package com.pa3.Sayegh_p1;

import java.util.Random;
import java.util.Scanner;

public class level2 {
    private Random rand = new Random();
    private Scanner Scnr = new Scanner(System.in);

    public void secureRandom(int[] randValArray) {
        for (int i = 0; i < 20; i++) {
            randValArray[i] = rand.nextInt(99);
        }

    }

    public void generateDivQuestion(int[] rands, double[] ans, Scanner scnr) {
        double[] val = new double[10];
        double t = 0, j = 0;
        double percent;
        secureRandom(rands);
        for (int i = 0; i < 20; i += 2) {
            System.out.println("How much is " + rands[i] + " divided by " + rands[i + 1] + "?");
            ans[i / 2] = scnr.nextDouble();
            val[i / 2] = (double)rands[i] / (double)rands[i + 1];
            t++;
            if (ans[i / 2] == val[i / 2]) {

                j++;
            }
        }
        percent = ((j)*100) / (t);
        System.out.println("You scored a " + percent + " percent.");
        passOrFail(percent);

    }

    public void generateSubQuestion(int[] rands, double[] ans, Scanner scnr) {
        double[] val = new double[10];
        double t = 0, j = 0;
        double percent;
        secureRandom(rands);
        for (int i = 0; i < 20; i += 2) {
            System.out.println("How much is " + rands[i] + " subtracted by " + rands[i + 1] + "?");
            ans[i / 2] = scnr.nextDouble();
            val[i / 2] = rands[i] - rands[i + 1];
            t++;
            if (ans[i / 2] == val[i / 2]) {

                j++;
            }
        }
        percent = ((j)*100) / (t);
        System.out.println("You scored a " + percent + " percent.");
        passOrFail(percent);

    }

    public void generateSumQuestion(int[] rands, double[] ans, Scanner scnr) {
        double[] val = new double[10];
        double t = 0, j = 0;
        double percent;
        secureRandom(rands);
        for (int i = 0; i < 20; i += 2) {
            System.out.println("How much is " + rands[i] + " plus " + rands[i + 1] + "?");
            ans[i / 2] = scnr.nextDouble();
            val[i / 2] = rands[i] + rands[i + 1];
            t++;
            if (ans[i / 2] == val[i / 2]) {

                j++;
            }
        }
        percent = ((j)*100) / (t);
        System.out.println("You scored a " + percent + " percent.");
        passOrFail(percent);

    }



    public void generateMultQuestion(int[] rands, double[] ans, Scanner scnr) {
        double[] val = new double[10];
        double t = 0, j = 0;
        double percent;
        secureRandom(rands);
        for (int i = 0; i < 20; i += 2) {
            System.out.println("How much is " + rands[i] + " times " + rands[i + 1] + "?");
            ans[i / 2] = scnr.nextDouble();
            val[i / 2] = rands[i] * rands[i + 1];
            t++;
            if (ans[i / 2] == val[i / 2]) {

                j++;
            }
        }
        percent = ((j)*100) / (t);
        System.out.println("You scored a " + percent + " percent.");
        passOrFail(percent);

    }

    public void generateMixedQuestion(int[] rands, double[] ans, Scanner scnr) {
        double[] val = new double[10];
        double t = 0, j = 0;
        double percent;
        secureRandom(rands);
        int randnum;

        for (int i = 0; i < 20; i += 2) {
            randnum = rand.nextInt(4)+1;

            if (randnum == 1) {
                val[i / 2] = rands[i] * rands[i + 1];
                System.out.println("How much is " + rands[i] + " multiplied by " + rands[i + 1] + "?");


            }
            if (randnum == 2) {
                val[i / 2] = rands[i] + rands[i + 1];
                System.out.println("How much is " + rands[i] + " added to " + rands[i + 1] + "?");


            }
            if (randnum == 3) {
                val[i / 2] = rands[i] - rands[i + 1];
                System.out.println("How much is " + rands[i] + " subtracted by " + rands[i + 1] + "?");


            }
            if (randnum == 4) {
                val[i / 2] = (double)rands[i] / (double)rands[i + 1];
                System.out.println("How much is " + rands[i] + " divided by by " + rands[i + 1] + "?");


            }
            ans[i / 2] = scnr.nextDouble();
            t++;
            if (ans[i / 2] == val[i / 2]) {

                j++;
            }
        }
        percent = ((j)*100) / (t);
        System.out.println("You scored a " + percent + " percent.");
        passOrFail(percent);

    }

    public void passOrFail(double percent) {
        if (percent < 75) {
            System.out.println("Please ask your teacher for extra help.");
        }
        if (percent >= 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

    }





}
