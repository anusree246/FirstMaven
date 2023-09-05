package HeadFirstJava;

public class PetWhileArray {
    public static void main(String[] petnames) {
        int x =petnames.length;
        System.out.println(x);
        int i=0;
        while (i<petnames.length){
            System.out.println(petnames[i]);
            i++;
        }

    }
}
