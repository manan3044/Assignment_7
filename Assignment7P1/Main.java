package Assignment7P1;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        rNoFuncs rationalFunction = new rNoFuncs();
        Scanner sc = new Scanner(System.in);
        try{
//            int numer1 = Integer.parseInt(args[0]);
//            int deno1 = Integer.parseInt(args[0]);
            System.out.print("Enter Numerator of 1st Rational Number: ");
            int numer1 = Integer.parseInt(sc.next());
            System.out.print("Enter Denominator of 1st Rational Number: ");
            int deno1 = Integer.parseInt(sc.next());
            RationalNo rt1 = new RationalNo(numer1, deno1);

//            int numer2 = Integer.parseInt(args[0]);
//            int deno2 = Integer.parseInt(args[0]);

            System.out.print("Enter Numerator of 2nd Rational Number: ");
            int numer2 = Integer.parseInt(sc.next());
            System.out.print("Enter Denominator of 2nd Rational Number: ");
            int deno2 = Integer.parseInt(sc.next());
            RationalNo rt2 = new RationalNo(numer2, deno2);

            if (deno1==0 | deno2==0)
            {
                throw new ZeroException("Denominator cannot be zero");
            }

            else {
                RationalNo sum = rationalFunction.addRationals(rt1, rt2);
                System.out.println("\nSum of provided Rational Numbers = "+sum.getNume() +"/"+ sum.getDenom() );

                RationalNo sub = rationalFunction.subRationals(rt1, rt2);
                System.out.println("Subtraction of provided Rational Numbers = "+sub.getNume() +"/"+ sub.getDenom() );

                RationalNo multiply = rationalFunction.multiplyRationals(rt1, rt2);
                System.out.println("Multiplication of provided Rational Numbers = "+multiply.getNume() +"/"+ multiply.getDenom() );

                RationalNo divide = rationalFunction.divideRationals(rt1, rt2);
                System.out.println("Division of provided Rational Numbers = "+divide.getNume() +"/"+ divide.getDenom() );

                String compare = rationalFunction.compareRationals(rt1, rt2);
                System.out.println(rt1.getNume() +"/"+ rt1.getDenom()+" " + compare + " "+ rt2.getNume() + "/" + rt2.getDenom());

                float coverted = rationalFunction.convertToFloat(rt1);
                System.out.println("The floating point value of "+ rt1.getNume()+"/"+rt1.getDenom()+" is "+ coverted);

                RationalNo absValue = rationalFunction.absoluteRational(rt1);
                System.out.println("The absolute value of "+ rt1.getNume()+"/"+rt1.getDenom()+" is "+ absValue.getNume() + "/" + absValue.getDenom());
            }
        }

        catch (ZeroException | NumberFormatException e)
        {
            System.out.println(e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
