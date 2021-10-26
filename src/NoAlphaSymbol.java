import java.util.Scanner;
public class NoAlphaSymbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// calling scanner class for user input data
        System.out.println(" Enter any character,number or symbol.");
        char ch = scan.next().charAt(0);
        //upon given input and applying given condition accordingly requirement should be printed
        if((ch>= 'a' && ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println(ch + " is an alphabet.");
        }
        else if (ch >='0'&&ch <='9'){
            System.out.println(ch + " is a number.");
        }else {
            System.out.println(ch + " is a symbol.");
        }
    }


}
