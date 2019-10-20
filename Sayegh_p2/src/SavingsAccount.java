public class SavingsAccount {

    private static double annualInterestRate = 0;
    double savingsBalance;

    public static void modifyInterestRate(double newInterestRate){

        annualInterestRate = newInterestRate;

    }



    public double calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (savingsBalance*annualInterestRate)/12;
        return monthlyInterest;
    }


}
