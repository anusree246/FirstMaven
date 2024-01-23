package HeadFirstJava;

class Outer{
    private int a=100;
    class Inner{
        void m1(){
            System.out.println("private member of outer class::"+a);
        }
    }
}

public class InnerClassMain {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.m1();

    }
}
