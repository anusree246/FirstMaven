package HeadFirstJava;

public class MultiflicationTables {
    public static void main(String[] tables) {
        System.out.println("Number of Command Line Argument = " + tables.length);
        //int value =tables.length;
        for (int index = 0; index < tables.length; index++) {
            String value = tables[index];

            System.out.println(value);

            //System.out.println(value);
            int number = Integer.parseInt(value);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }

        }

    }
}
