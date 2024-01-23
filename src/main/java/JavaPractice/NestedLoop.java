package JavaPractice;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(" ** "+i+" --Table-- ");

            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+(i*j));

            }
        }
    }
}
