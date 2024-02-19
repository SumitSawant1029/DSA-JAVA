package Pattern;

public class RightPyramid {
   
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                sum = n - i - 1;
                if (j <= sum) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
