

import java.util.*;


public class InOut {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        //Output
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.println("Hello \n world");

        //Variables
        int i = 39 ;
        int b = 10 ;

        float c = (i * b) / (i - b);
        System.out.println("The Output of (a*b/a-b) :- " + c);

        // Input
        String name = sm.nextLine();
        // nextInt
        // nextFloat
        // nextDouble
        System.out.println(name);
        sm.close();

    }
}
