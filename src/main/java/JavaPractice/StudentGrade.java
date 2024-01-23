package JavaPractice;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Subject1 marks: ");
        int s1=sc.nextInt();
        System.out.println("Enter Subject2 marks: ");
        int s2=sc.nextInt();
        System.out.println("Enter Subject3 marks: ");
        int s3=sc.nextInt();
        int p=(s1+s2+s3)/3;

        switch(p/10){
            case 9:
            case 8:
            case 7:    System.out.println("Grade A");
               break;
            case 6:  System.out.println("Grade B");
                break;
            case 5:  System.out.println("Grade C");
                break;
            case 4:  System.out.println("Grade D");
                break;
            default :  System.out.println("Grade f");



        }

    }
}
