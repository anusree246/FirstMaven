package JavaPractice;

public class Swap2Numbers {
    public static void main(String args[]) {
        int num1 = 2, num2 = 3;
        System.out.println("Before swapping: ");
        System.out.println("num1 is: " + num1 + " and num2 is: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: ");
        System.out.println("num1 is: " + num1 + " and num2 is: " + num2);

    }
}
