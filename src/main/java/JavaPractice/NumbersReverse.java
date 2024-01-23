package JavaPractice;
import java.util.Scanner;
//Write a to output  N natural numbers in reverse order.

public class NumbersReverse {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int N = sc.nextInt();

        System.out.println("Natural numbers from " + N + "-1 in reverse: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
