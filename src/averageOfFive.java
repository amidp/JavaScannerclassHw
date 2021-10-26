import java.util.Scanner;
public class averageOfFive {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);//  scanner class for user input prupose
            System.out.print("Input first number: ");//printing for first number input
            int num1 = scanner.nextInt();
            System.out.print("Input second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Input third number: ");
            int num3 = scanner.nextInt();
            System.out.print("Input fourth number: ");
            int num4 = scanner.nextInt();
            System.out.print("Enter fifth number: ");
            int num5 = scanner.nextInt();
            //printing the average for five given numbers.
            System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);

        }
    }

