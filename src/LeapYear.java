import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//calling scanner class for user input data
        System.out.println(" Please enter the year to check : ");
        int year = scan.nextInt();
        //given condition year should be displayed if leap year or not
        if (year % 4 == 0)// add 400 and 100 conditon
            System.out.println(" The given year is leap year.");
        else
            System.out.println(" The given year is not leap year");
    }
}
