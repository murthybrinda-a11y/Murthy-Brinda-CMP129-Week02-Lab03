import java.util.Scanner;

public class FutureValue 
{
    public static void main (String[]args)

    {
        double PresentValue;
        double MonthlyinterestRate;
        int NumMonths;
        double FutureValue;
        double finalfuturevalue; // to store the return 
        finalfuturevalue = FutureValue( double pv,double ir, double nm )

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the accounts present value: ");
        PresentValue = keyboard.nextDouble();

        System.out.print("Enter the Monthly interest rate: ");
        MonthlyinterestRate = keyboard.nextDouble();

        System.out.println("Enter the number of months: ");
        NumMonths = keyboard.nextInt();     

    }
    
        public static double futureValue(double PresentValue, int NMonths,double mir)
        {
            System.out.println("The accounts Future Value is : " + "futurevalue");

            double finalfuturevalue = PresentValue * Math.pow (1 + MonthlyinterestRate,2);
            return finalfuturevalue;

        }
    
}
