// Printing Patern in JAVA 
// *
// **
// ***
// ****
public class Loops {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("For Loop Output:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        int i = 0;
        int j = 0 ;
        System.out.println("While Loop Output:-");
        while (i < n ) {
            i++;
            j=0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println("\n");
        }
    }
}
