import java.util.Scanner; 

public class FutureValue { 
    public static void main (String[] args) { 
        double presentValue; 
        double monthlyInterestRate; 
        int numMonths; 
        double finalFutureValue; 
        
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.print("Please enter the accounts present value: "); 
        presentValue = keyboard.nextDouble(); 
        
        System.out.print("Enter the Monthly interest rate: "); 
        monthlyInterestRate = keyboard.nextDouble(); 
        
        System.out.print("Enter the number of months: "); 
        numMonths = keyboard.nextInt(); 
        
        finalFutureValue = futureValue(presentValue, numMonths, monthlyInterestRate); 
        
        System.out.printf("The account's Future Value is: $%.2f%n", finalFutureValue);
    } 
    
    public static double futureValue(double presentValue, int nMonths, double mir) { 
        double result = presentValue * Math.pow(1 + mir, nMonths); 
        return result; 
    } 
}
