package HeadFirstJava;

public class ImprovedBooksTest {
    public static void main(String[] args) {
        Books[] myBooks = new Books[5];
        String[] titles = {" The Grapes of Java "," The Java Gatsby "," The  Java CookBook "," The HeadFirstJava ","Mindstrom"};
        String[] author= { " Bob ", " Sue "," Ian ", " Trisha ", " Gee " };

        for(int x=0;x<myBooks.length;x++) {
           // System.out.println(myBooks[x]);
            myBooks[x] = new Books();
           // System.out.println(myBooks[x]);
            myBooks[x].title= titles[x];
            myBooks[x].author=author[x];
            System.out.print(myBooks[x].title +"  by");
            System.out.println(myBooks[x].author);

        }
    }
}
