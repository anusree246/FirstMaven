package JavaPractice;

/*
If a number is divisible by 3 print Fizz, by 5 print Buzz, By both print FizzBuzz
 */
public class FizzBuzz {

    // write main method
    public static void main(String[] args) {
        //getFizzOrBuzz(1);

       // getFizzOrBuzz(int i);
        // Print number from 1 to 25
        for (int i = 1; i <= 25; i++) {
            //getFizzOrBuzz(int i);


        }
        //System.out.println(i);
        // check if i is divisible by 3 and 5 print FizzBuzz
    }

        // TODO write a method getFizzOrBizz. return String and takes input integer
        public static String getFizzOrBuzz( int i){


            // System.out.println("fizzBuzz");
            if (i % 3 == 0 && i % 5 == 0) return "fizzBuzz";
                // else if i is divisible by 3 print Fizz
            else if (i % 3 == 0) return "Fizz";
                // System.out.println("fizz");

                // else if i is divisible by 5 print Buzz
            else if (i % 5 == 0) return "Buzz";

                // System.out.println("Buzz");
                // else print i
            else
                //System.out.println(i);
            return String.valueOf(i);



        }
    }



