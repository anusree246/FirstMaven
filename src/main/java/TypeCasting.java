public class TypeCasting {

    //  Implicit type casting
    byte b= 100;
    int i=b;
    int i1=400;
    long l=i1;

    //explicit type casting
    int a =200;
    byte b1= (byte) a;
    long l1=500;
    int d= (int) l1;
}
class A {
    void m1() {
        System.out.println("A-m1");
    }
}
class SuperClass {
    void m2() {
        System.out.println("SuperClass-m2");
    }
}
class SubClass extends SuperClass {
    void m3() {
        System.out.println("SubClass-m3");
    }


    public static void main(String[] args) {

        A obj1= new A();
        SuperClass obj2= new SuperClass();
        SubClass obj3= new SubClass();

        //object type casting
        obj2=obj3; //  Implicit type casting
        obj3= (SubClass) obj2; //explicit type casting

    }

}