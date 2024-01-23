package HeadFirstJava;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n1=1;int n3=0;
        int n2=1;
        int i=3;
        int seq=8;
        while(i<=seq){
            n3=n1+n2;
           n1=n2;
           n2=n3;
           i++;
        }
        System.out.println(n3);


    }
}
