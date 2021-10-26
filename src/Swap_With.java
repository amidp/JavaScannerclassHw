import java.util.Scanner;
public class Swap_With {
    public static void main(String[] args) {
        int x, y, t;// x and y are to swap
        Scanner sc = new Scanner(System.in);//calling scanner for user data input
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping numbers: "+x +"  "+ y);
        t = x;//swapping values
        x = y;
        y = t;
        System.out.println("After swapping: "+x +"   " + y);
        System.out.println( );
    }
}