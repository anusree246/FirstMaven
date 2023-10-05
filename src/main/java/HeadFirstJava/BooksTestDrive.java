package HeadFirstJava;

public class BooksTestDrive {
    public static void main(String[] args) {

        Books[] myBooks = new Books[5];

       // myBooks[0]=new Books();
        //myBooks[1]=new Books();
        //myBooks[2]=new Books();
        for(int x=0;x<myBooks.length;x++){
          //  Books b= new Books();
          //  myBooks[x]= b;
            System.out.println(myBooks[x]);
            myBooks[x] = new Books();
            System.out.println(myBooks[x]);


        }

       String[] titles = {" The Grapes of Java "," The Java Gatsby "," The  Java CookBook "," The HeadFirstJava ","Mindstrom"};
        for(int x=0;x<myBooks.length;x++){
            System.out.println(myBooks[x]);
            System.out.println(myBooks[x].title);
            myBooks[x].title= titles[x];
            System.out.println(myBooks[x].title);

        }
        String[] author= { " Bob ", " Sue "," Ian ", " Trisha ", " Gee " };
        for(int x=0; x<myBooks.length;x++){
            System.out.println(myBooks[x]);
            System.out.println(myBooks[x].author);
            myBooks[x].author=author[x];
            System.out.println(myBooks[x].author);
        }



//        myBooks[0].title=" The Grapes of Java ";
//        myBooks[1].title=" The Java Gatsby ";
//        myBooks[2].title=" The  Java CookBook ";
//        myBooks[3].title=" The HeadFirstJava ";

       // myBooks[0].author=" Bob ";
       // myBooks[1].author=" Sue ";
       // myBooks[2].author=" Ian ";
      //  myBooks[3].author=" ";

        int x=0;
        while(x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x++;
            System.out.println("******************");
        }
    }


}
