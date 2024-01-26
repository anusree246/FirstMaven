package Operations;

public class NumberOperationsMain {
    public static void main(String[] args) {
        String result1=null;
       result1= NumberOperations.PrimeNumber(5);
       System.out.println(result1);

        int result2=0;
       result2= NumberOperations.ReverseNumber(12345);
        System.out.println(result2);

         for(int i=1;i<=10;i++) {
             String result3 = null;
             result3 = NumberOperations.EvenorOdd(i);
             System.out.println(result3);
         }
        }

    }

