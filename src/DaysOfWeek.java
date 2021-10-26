import java.util.Scanner;
public class DaysOfWeek {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//scanner class for user input
    System.out.println(" Please enter the number for day.");// user input number to display day acccordingly.
    int day = scanner.nextInt();
    //day should be printed according to given condition
    if (day==1){
        System.out.println(" Monday ");
    }
    else if (day==2){
        System.out.println(" Tuesday ");
    }
    else if (day==3){
        System.out.println(" Wednesday ");
    }
    else if (day==4){
        System.out.println(" Thursday ");
    } else if (day == 5) {
        System.out.println(" Friday ");
    }
    else if (day==6){
        System.out.println( " Saturday ");
    }
    else if (day==7){
        System.out.println(" Sunday ");
    }
    //if condition doesn't meet then invalid input
    else {
        System.out.println( " Invalid input ");
    }
  }
}
