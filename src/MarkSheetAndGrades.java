import java.util.Scanner;
public class MarkSheetAndGrades {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);// calling scanner class for user input data
        System.out.println(" Enter Student's Name : ");
        String studentName = scanner.nextLine();
        System.out.println(" Enter the Roll No : ");
        int rollNo = scanner.nextInt();
        System.out.println(" Enter the Marks for Maths");
        double mathsMarks = scanner.nextDouble();
        System.out.println(" Enter the Marks for Science : ");
        double scienceMarks = scanner.nextDouble();
        System.out.println(" Enter the Marks for English :  ");
        double englishMarks = scanner.nextDouble();
        System.out.println( "Total Marks = " + ( mathsMarks+scienceMarks+englishMarks));
        double total = mathsMarks+scienceMarks+englishMarks;
        double percentage ;//declare variable percentage
        percentage = total * 100 / 300;//using percentage variable check given conditions
        System.out.println(" Student's Percentange : " + (percentage));
        String grade ;//declaring variable grade to meet required grade and to display output accordingly
        if (percentage >=35) {
            System.out.println(" Student is Pass.");
        }
        else {
            System.out.println(" Student is Fail.");
        }
        if ( percentage >= 80 ) {
            grade = " A+";
            System.out.println(" Student's grades is : A+");
        } else if (percentage>=60 && percentage<80){
            grade = "A";
            System.out.println(" Student's grade is : A ");
        } else if ( percentage >=50 && percentage<60) {
            grade = "B";
            System.out.println(" Student's grade is : B ");
        } else if ( percentage >=35 && percentage<50) {
            grade = "C";
            System.out.println(" Student's grade is : C");
        if ((mathsMarks >100) || (scienceMarks >100) || (englishMarks >100) ){
            System.out.println(" Invalid entry, Student's marks should be between 0-100");
        }
        }
    }
}
