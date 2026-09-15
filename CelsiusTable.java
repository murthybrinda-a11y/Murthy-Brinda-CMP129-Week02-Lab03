public class CelsiusTable 
{
        public static void main(String[] args)
         { 
            double celsiusTemp; 
        
        System.out.println("Fahrenheit\tCelsius"); 
        System.out.println("------------------------"); 
        
        for (int fahrenheit = 0; fahrenheit <= 20; fahrenheit++) 
            { 
                celsiusTemp = celsius(fahrenheit); 
                System.out.printf("%d\t\t%.2f%n", fahrenheit, celsiusTemp); 
            } 
    } 
    
    public static double celsius(double fahrenheit)
     { 
        double result = (5.0 / 9.0) * (fahrenheit - 32.0); 
        return result; 
     } 
}
    

