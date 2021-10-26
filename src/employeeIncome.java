import java.util.Scanner;
public class employeeIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// calling scanner class for user input data
        System.out.println(" Enter Employee id : ");
        String employeeid = scanner.nextLine();
        System.out.println(" Enter Employee name : ");
        String employeename = scanner.nextLine();
        System.out.println(" Enter basic salary : ");
        //declare all required variables with scanner
        int salary = scanner.nextInt();
        int hra;
        int da;
        int ta;
        int pf;
        int gs;
        //counting allowances depending on given calculation
        hra = salary *10/100;
        System.out.println("HRA is : " + hra) ;
        da = salary * 8 / 100;
        System.out.println("DA is :" + da);
        ta = salary * 9/ 100;
        System.out.println(" TA is : " + ta);
        pf = salary * 20 /100;
        System.out.println(" PF is : " + pf);
        gs = salary+hra+ta+da-pf;
        System.out.println("GS is :" + gs);
    }
}
