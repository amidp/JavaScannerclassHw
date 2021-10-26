import java.util.Scanner;
public class UserDefinedMathOperator {
    public static void main(String[] args) {
    Scanner  scanner = new Scanner(System.in);//scanner class called for user data input
        System.out.println(" Enter first value : ");
        int num1 = scanner.nextInt();
        System.out.println(" Enter second value :");
        int num2 = scanner.nextInt();
        System.out.println(" Enter the operator(+,-,*./) ");//asking user to enter operator as per their wish
        char operator = scanner.next().charAt(0);
        double addition = num1+num2;
        double subtraction = num1-num2;
        double multiply = num1*num2;
        double divide = num1/num2;
        //depending on condition and input from user accordingly output should be printed
        if (operator =='+'){
            System.out.println(" Two number's addition is : "+ addition);
        } else if (operator == '-') {
            System.out.println( " Two number's subtraction is : "+subtraction);
        }
        else if (operator=='*'){
            System.out.println( " Two number's multiplication is : "+multiply);
        }
        else if (operator=='/'){
            System.out.println( " Two number's division is : "+ divide);
        }
        else {
            System.out.println( " Invalid input.");
        }

    }
}
