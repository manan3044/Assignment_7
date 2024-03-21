package Assignment7P2;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FactorialException{
        Factorial fc = new Factorial();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter number for factorial: ");
            String numberStr = sc.next();
            int number1 = Integer.parseInt(numberStr);
            int factorial = fc.calc(number1);
            System.out.println("The Factorial = "+factorial);
        }

        catch (FactorialException | NumberFormatException e)
        {
            System.out.println(e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
