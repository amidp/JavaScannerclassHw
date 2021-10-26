import java.util.Scanner;
public class UpperCaseLowerCase {
           public static void main(String[] args) {
           System.out.println(" Please enter Uppercase alphabet to convert =  ");
           Scanner scan = new Scanner(System.in);// calling scanner class for user data input
           String s1 = scan.nextLine();
           String s2 = s1.toLowerCase();//changing alphabet to lowercase as per requirement
           System.out.println(" The Lowercase alphabet  =  " + s2);
        }
    }