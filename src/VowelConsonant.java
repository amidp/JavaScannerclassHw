import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//calling scanner class for user input data
        System.out.println(" Enter the Character : ");
        char ch = scanner.next().charAt(0);//givind condition for required output to be printed
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(" Entered character " + ch + " is vowel");
        }
        else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ ch+" is consonant");
        else
            System.out.println("Not an alphabet ");
    }
}




