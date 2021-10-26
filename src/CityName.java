import java.util.Scanner;
public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//calling scanner class for user input
        System.out.println(" Enter a character : ");//printing for character and input
        char ch = scanner.next().charAt(0);
        if (ch == 'a') {
            //display using conditon
            System.out.println(" Ahmedabad ");}
            else if(ch=='b'){
            System.out.println(" Baroda ");}
            else if (ch=='c') {
            System.out.println(" Chicago");}
            else if (ch=='d'){
            System.out.println(" Delhi");}
            else if (ch=='e'){
            System.out.println(" Edinburgh ");}
            else if (ch=='f'){
            System.out.println(" Florence");}
        else {
            System.out.println(" Invalid alphabet.");}
        }
}