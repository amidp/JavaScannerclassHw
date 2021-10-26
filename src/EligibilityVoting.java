import java.util.Scanner;
public class EligibilityVoting {
       public static void main(String[] args){
            int age;
            Scanner sc = new Scanner(System.in);// scanner class for user input data
            System.out.print(" Please enter your age : ");
            age = sc.nextInt();
            //using condition to allow user to vote or not
            if (age >= 18)
            {
              System.out.println(" You are eligible for voting.");
            }
            else
            {
              System.out.println(" You are not eligible for voting.");
            }
        }
    }