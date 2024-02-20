// Reverse The Array

import java.util.*;

public class Q2_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        System.out.println("Enter the Numbers:-");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        // Reversing using Swap First with last 
        int swap =a[0];
        int n =  a.length/2;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            swap = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = swap;
            System.out.println("Reversed Array Is "+ Arrays.toString(a));
        }
        System.out.println("Reversed Array Is "+ Arrays.toString(a));
        

    }
}

