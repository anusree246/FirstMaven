package HeadFirstJava;

public class SampleForAndWhile {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            System.out.println(i);
        }

        System.out.println("****************************");

        int sum = 0;
        int p = 1000;

        for (int i = 1; i <= p; ++i) {
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);


        System.out.println("****************************");

        int q = 1000;

        // for loop
        for (int i = q; i >= 1; --i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);

        int j=1,m=5;
        while (j<m){
            System.out.println(j);
            j++;
        }
    }
}

