package HeadFirstJava;
import java.text.DecimalFormat;
// Write a Program to Calculate Area and Perimeter of Circle.
public class CircleRadius {
    public static void main(String[] args) {


    double radius = 50;

     double area = (Math.PI* radius *radius);
    double  perimeter = 2*(Math.PI)*radius;

    DecimalFormat df=new DecimalFormat("0.00");

        System.out.println("The area of the circle is "+ df.format(area)+" and The perimeter of the circle is "+df.format(perimeter));
}
}
