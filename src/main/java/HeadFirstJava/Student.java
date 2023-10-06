package HeadFirstJava;

public class Student {
    String name;
    int marks;

    public static void main(String[] args) {
        Student[] st= new Student[5];
        String[] names={"Anvika "," Shreyan "," Tanvi "," Sriman ", " Srishti "};
        int[] marks={98,99,99,100,99};

        for (int x=0;x< st.length;x++){
            st[x]= new Student();
            st[x].name=names[x];
            st[x].marks=marks[x];
            System.out.print(st[x].name + " marks are ");
            System.out.println(st[x].marks);

        }

    }
}
