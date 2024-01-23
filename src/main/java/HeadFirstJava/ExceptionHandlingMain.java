package HeadFirstJava;
class ExceptionClass{

    int[] array={1,2,3,4};
    void m1(){
        System.out.println("ExceptionClass -m1- starting");
        for (int i=0;i<=array.length-1;i++){
            System.out.println("index::::"+i+"value::"+array[i]);
        }
        System.out.println("value::"+array[4]);//0,1,2,3 -ArrayindexOutofBoundary-runtime exception

        System.out.println("ExceptionClass -m1- ending");

    }
}
     public class ExceptionHandlingMain {

    public static void main(String[] args) {
        System.out.println("main starting");


        ExceptionClass obj1=new ExceptionClass();
        obj1.m1();
        System.out.println("main ending");


    }
}
