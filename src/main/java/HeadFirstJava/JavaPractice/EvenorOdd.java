package HeadFirstJava.JavaPractice;

public class EvenorOdd {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            if(i%2==0) {
                System.out.println("Even number");
            }
            else{
                System.out.println("Odd number");
            }
            i++;
        }

    }
}
