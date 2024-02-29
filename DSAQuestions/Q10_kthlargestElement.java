//Kth-Largest Element in an Array without sorting

import java.util.*;

public class Q10_kthlargestElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,3,4,3,5,6,8,4,2,5};
        int max = 0;
        int b = 0;
        // Taking Input
        System.out.print("Enter the kth Number you Wanted:-");
        int k = sc.nextInt();

        // Deleting the highest Number till k is meet
        for (int j = 0; j < k; j++) {
            max = 0;
            for (int i = 0; i < a.length; i++) {
                if(max < a[i]){
                    max = a[i];
                    b = i;
                }
            }
            a[b]=0;
        }
        System.out.println("The Kth Largest Number is :-"+ max);

    }
}