package JavaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetvsList {

    public static void main(String[] args) {
        Set set = new HashSet();
       // set= new HashSet();
       // set=new LinkedHashSet();
       // set=new TreeSet();
      //  HashSet hashSet=new HashSet();
         set.add("Anusha");
        set.add("Anusha1");
        set.add("Anusha2");
        set.add("Anusha");//duplicate object wiil not be stored

    }
}
