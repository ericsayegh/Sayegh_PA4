import java.util.Scanner;
import java.util.Random;


public class Sayegh_p2 {


    public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);

    SavingsAccount saver1 = new SavingsAccount();
    SavingsAccount saver2 = new SavingsAccount();
    double monthlyInt1;
    double monthlyInt2;
    double monthlyInt3;
    double monthlyInt4;
    int i;
    saver1.modifyInterestRate(.04);
    saver2.modifyInterestRate(.04);
    saver1.savingsBalance = 2000.00;
    saver2.savingsBalance = 3000.00;
    monthlyInt1 = saver1.calculateMonthlyInterest();
    monthlyInt2 = saver2.calculateMonthlyInterest();
    for(i=1; i<=12; i++) {
        saver1.savingsBalance += (monthlyInt1 * i);
        saver2.savingsBalance += (monthlyInt2 * i);
        System.out.println("Saver1's balance with " + i + " month(s) of interest is: " + saver1.savingsBalance);
        System.out.println("saver2's balance with " + i + " month(s) of interest is: " + saver2.savingsBalance);
    }
    saver1.modifyInterestRate(.05);
    saver2.modifyInterestRate(.05);
    monthlyInt3 = saver1.calculateMonthlyInterest();
    monthlyInt4 = saver2.calculateMonthlyInterest();
    saver1.savingsBalance += monthlyInt3;
    saver2.savingsBalance += monthlyInt4;
    System.out.println("Saver1's balance with a month of interest is: " + saver1.savingsBalance);
    System.out.println("saver2's balance with a month of interest is: " + saver2.savingsBalance);






    }


}



