// Min Max in the array

import java.util.*;

public class Q1_MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the Numbers:-");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        // Finding Minimum and Maximum
        int max =a[0];
        for (int i = 0; i < a.length; i++) {
                if(max<a[i]){
                    max=a[i];
                };   
        }
        System.out.println("Maximum Number is "+max);
        
        int min =a[0];
        for (int i = 0; i < a.length; i++) {
                if(min>a[i]){
                    min=a[i];
                };   
        }
        System.out.println("Minimum Number is "+min);

    }
}
