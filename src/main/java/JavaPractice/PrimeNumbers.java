package JavaPractice;

public class PrimeNumbers {

    public static void main(String[] args) {

        int n=5;
        int i=2;
        while(i<=5){
            if(n%i==0){
                if(i==n){
                    System.out.println("prime number");
                }
                else {
                   System.out.println("not prime number");
                }

            }
            i++;
        }

    }

}
