import java.util.Scanner;

public class MyMain {
    public static int binaryToDecimal(String binary) {
        //setting variables, converting input string to int 
        String bin = binary; 
        int b=Integer.parseInt(bin); //Got this method from google
        int dec = 0; 
        int base = 1; 
        int make = b; 

        //while loop uses modulo and += learned in class
        while (make > 0) { 
            int last_digit = make % 10; 
            make = make / 10; 
            dec += last_digit * base; 
            base = base * 2; 
        } 

      //return value in decimal(int) form
        return dec;  
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter a binary number: ");
        String x = scan.nextLine();
        System.out.print("That is equal to the decimal value: "+binaryToDecimal(x));
    }
    
    
}
