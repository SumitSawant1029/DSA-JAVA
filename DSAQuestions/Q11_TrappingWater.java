import java.util.Arrays;

public class Q11_TrappingWater {

    public static int[] Min(int[] a , int[] b) {
        for (int i = 0; i < b.length; i++) {
        if(a[i]<b[i]){
            a[i]=a[i];
        }else{
            a[i]=b[i];
        }            
        }
        return a;
        
    }

    public static int[] Reverse(int[] a){
        int[] b = new int[a.length];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            b[i]=a[a.length-i-1];
        }
        return b;
     }

    public static int[] maxLeftRight(int[] a) {
        int[] maxLeft = new int[a.length];
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if(i==0){
               maxLeft[0]=0;
               max=a[0];
            }
            else{
               for (int j = 0; j < i; j++) {
                   if (max<a[j]) {
                       max=a[j];
                   }
               }
               maxLeft[i]=max;
            }           
       }
        return maxLeft;
    }

    public static int[] Calculate(int[] a,int[] b) {
        for (int i = 0; i < b.length; i++) {
            if(a[i]-b[i]>0){
                a[i]=a[i]-b[i];
            }
            else{
                a[i]=0;
            }
        }
        return a;
        
    }
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] maxLeft = maxLeftRight(a);
        int[] b = Reverse(a);
        int[] maxRight = maxLeftRight(b);
        maxRight = Reverse(maxRight);
        maxLeft = Min(maxLeft,maxRight);
        
        int[] depth = Calculate(maxLeft,a);
        System.out.println(Arrays.toString(depth));

        //Adding  the depth
        int dep = 0 ; 
        for (int i = 0; i < depth.length; i++) {
            dep = dep + depth[i];
            
        } 
        System.out.println(dep);
        }
}
