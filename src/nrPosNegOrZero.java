import java.util.Scanner;
class PosNegZero{
    public static void main(String []s){
        int num; //Scanner class to read value
        Scanner scanner =new Scanner(System.in);//calling scanner for user input data
        System.out.print(" Enter any integer number: ");
        num=scanner.nextInt();//check condition for +ve, -ve and Zero
        //given condition the input should be printed as per requirements
        if(num>0)
            System.out.println(num + " is Positive number.");
        else if(num<0)
            System.out.println(num + " is Negative number.");
        else
            System.out.println(" Number is Zero.");

    }
}