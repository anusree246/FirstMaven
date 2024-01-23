package JavaPractice;

public class ReeverseString {
    public static void main(String[] args) {
        String word="CAT";
        String rev="";
        int length=word.length();
        for (int index=(length-1);index>=0;index--){
            rev=rev+word.charAt(index);
        }
        System.out.println(rev);
    }
}
