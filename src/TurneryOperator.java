import java.util.Scanner;
public class TurneryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//calling scanner class for user data input
        System.out.println(" Please enter the First number to test : ");
        int number1 = scan .nextInt();
        System.out.println(" Please enter the Second number to test : ");
        int number2 = scan .nextInt();
        String s1 = number1%2==0 ? "Even" : "Odd";//applying turnery operator for true and false value to print
        String s2 = number2%2==0 ? "Even" : "Odd";
        System.out.println(" The number1 is " + s1);
        System.out.println(" The number2 is " + s2);
    }
}
