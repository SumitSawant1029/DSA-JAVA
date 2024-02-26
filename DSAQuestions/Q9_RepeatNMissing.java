// Tell the missing And Repeated Number in the array

import java.util.Arrays;

public class Q9_RepeatNMissing {
    public static void main(String[] args) {
        int[] a = {1,3,4,3,5,6,8,4,2,5};
        int[] b = new int[a.length];

        // initializing b with All 0
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }

        // Making the Logic
        for (int i = 0; i < a.length; i++) { //i=2
            if (b[a[i] - 1] != 0 ) {
                b[a[i] - 1]= -1;
            }
            else{
                b[a[i] - 1]= 1;
            }
        }

        // Finding Repeated and Missing
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < b.length; i++) {
            if(b[i]==0){
                System.out.println("Missing Element is :- "+ (i+1));
            }
            if(b[i]==-1){
                System.out.println("Repeated Element is :- "+ (i+1));
            }
        }
    }
}
