 
import java.util.Scanner;

public class ShortCalculator {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //prompt
        System.out.println("Please enter your first num to add. Note: cannot be < 0");
        int firstNum = sc.nextInt(); 

        System.out.println("Please enter your second num to add. Note: cannot be > 65535");
        int secondNum = sc.nextInt();
        
        // conversion to short
        short firstNumConverted = (short) firstNum;
        System.out.println(firstNumConverted);
        
        //conversion2 to short
        short secondNumConverted = (short) secondNum;
        
        int sum = firstNumConverted + secondNumConverted;
        int difference = firstNumConverted - secondNumConverted;
        int product = firstNumConverted * secondNumConverted;
        int quotient = firstNumConverted / secondNumConverted;
        int remainder = firstNumConverted % secondNumConverted;
        
        //sum conversion
        short convertedSum = (short)sum;
        short convertedDiff = (short)difference;
        short convertedProduct = (short)product;
        short convertedQuotient = (short)quotient;
        short convertedRemainder = (short)remainder;
        
        //PRINT LINES
        System.out.println("Your short sum is: "+convertedSum);
        System.out.println("Your short difference is: "+convertedDiff);
        System.out.println("Your short product is: "+convertedProduct);
        System.out.println("Your short quotient is: "+convertedQuotient);
        System.out.println("Your short remainder is: "+convertedRemainder);
    }
    
}
    

