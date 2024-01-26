package Operations;

public class NumberOperations {

    public static  String PrimeNumber(int n) {
        String  output =null;
         int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                if (i == n) {
                    output = "prime number";
                } else {
                    output = "not prime number";
                }
            }
            i++;
        }
        return output;
    }
    public static String EvenorOdd(int n) {
        String output = null;
        int i = 1;
        while(i<=n) {
            if (i % 2 == 0) {
                output = "Even number";
            } else {
                output = "Odd number";
            }
            i++;
        }
        return output;
    }
    public static int ReverseNumber (int num) {
       // int output=0;
        int rev = 0;
        while (num != 0) {
            int rem=num%10;
            num=num/10;
            rev = rev * 10 + rem;
        }
        return rev;
    }

}

