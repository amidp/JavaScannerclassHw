import java.util.Scanner;
public class salesCommission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//calling scanner class for user input data
        System.out.println(" Enter sales id : ");
        String salid = scan.toString();
        System.out.println(" Enter seller's name : ");
        String sellname = scan.toString();
        System.out.println(" Enter sales amount : ");
        int salamt = scan.nextInt();
        System.out.println(" Enter basic salary : ");
        int basal = scan.nextInt();
        int commission;
        commission =(salamt/100* 35);
        //using condition depending on commission required output should be printed
        if (commission>=50000){
            System.out.println( " Sales commision is : "+ commission);
        }
        else if ( commission>=30000&& commission<=50000) {
            System.out.println(" Sales commision is : " + commission);
        }
        else if ( commission >= 20000&&commission<=30000) {
            System.out.println(" Sales commision is : " + commission);
        }
        else if (commission >=10000&&commission<=20000) {
            System.out.println(" Sales commision is :  " + commission);
        }
        else if (commission>=10000){
            System.out.println(" Sales commision is "+commission);
        }
        else if (commission<10000){
            System.out.println( " Sales commision is "+commission);
        }
    }
}
