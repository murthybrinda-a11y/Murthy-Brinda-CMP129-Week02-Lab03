import java.util.Scanner;

public class KineticEnergy 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double KineticEnergyResult ;
        double m;
        double v;

        System.out.println("Enter the mass of the object (in kg) : ");
        m = keyboard.nextDouble();
        
        System.out.println ("Enter the velocity of the object (in m/s): ");
        v = keyboard.nextDouble();

        KineticEnergyResult = kineticEnergy( m,  v);
        System.out.println(" The objects kinetic Energy is " + KineticEnergyResult + "J");

        
        
    }
    public static double kineticEnergy(double mass, double velocity)
    {

        double KineticEnergyResult = 0.5* mass* Math.pow(velocity,2);
        return KineticEnergyResult;

    }

}
