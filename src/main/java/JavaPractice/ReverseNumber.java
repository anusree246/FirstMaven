package JavaPractice;

public class ReverseNumber {
    public static void main(String[] args) {
        int rev=0;
        int num=12345;
        while(num!=0){
            int rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }

}
