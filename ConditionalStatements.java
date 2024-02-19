import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i ;
        System.out.print("Enter The Option(1/2/3):-");
        i = sc.nextInt();

        if (i==1) {
            System.err.println("Hello");
        } else if (i==2) {
            System.out.println("konichiva");
        } else{
            System.out.println("Sarange");
        }

        switch (i) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Konichiva");
                break;
            case 3: 
                System.out.println("Sarange");
                break;
            default:
                System.out.println("Try AGAIn!!!!!1");
                break;
        }
    }
    
}
