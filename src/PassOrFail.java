import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// calling scanner class for user input data
        System.out.println(" Enter the Marks for Maths");
        double mathsMarks = scanner.nextDouble();
        System.out.println(" Enter the Marks for Science : ");
        double scienceMarks = scanner.nextDouble();
        System.out.println(" Enter the Marks for English :  ");
        double englishMarks = scanner.nextDouble();
        String result = scanner.nextLine();
        //given condition output should be printed as per requirements
        if (( mathsMarks < 35) || (scienceMarks < 35) || (englishMarks < 35)) {
            result = " Fail";
            System.out.println(" Result is : Fail ");
        }
        else {
            System.out.println(" Result is : Pass ");
        }
    }
    }

