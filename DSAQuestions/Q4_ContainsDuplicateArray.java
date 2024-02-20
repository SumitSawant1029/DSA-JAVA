
// Tell If Duplicate are there or not 
import java.util.*;

public class Q4_ContainsDuplicateArray {
    public static void main(String[] args) {
        public static void printArrayWithoutZeros(int[] array)args {
            boolean firstElement = true;
            for (int num : array) {
                if (num != 0) {
                    if (!firstElement) {
                        System.out.print(", ");
                    }
                    System.out.print(num);
                    firstElement = false;
                }
            }
        }
        
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5,5,4,4,3,2,2,2,1,1,1,1,1};
        int[] v = new int[a.length];
        int[] c = new int[a.length];
        System.out.println(Arrays.toString(a));
        int sum = 1;
        int d ;
        for (int i = 0; i < a.length; i++) {
            sum = 1;
            d = a[i];
            if (d == 0){
                break;
            }
            else if(d != 0){
                v[i] = a[i];
                a[i] = 0;
                for (int j = i; j < a.length; j++) {
                    if (v[i]==a[j] && a[j]!=0) {
                        sum = sum + 1;
                        a[j] = 0;
                    }
                }
                c[i]=sum;
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(c)+"\n"+Arrays.toString(v)+"\n"+Arrays.toString(a));
        printArrayWithoutZeros();

    }
}
