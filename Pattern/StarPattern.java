public class StarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i + 3; k++) {
                System.out.print(' ');
            }
            for (int j = 0; j < ((2* i) + 1); j++) {
                
                System.out.print("*");
            }
            System.out.println("");
        }
        n = 9;
        int x = 3;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                
                System.out.print(' ');
            }
            for (int k = 0; k < (n + 10 - (i*2)); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    
}

//         *
//        ***
//       *****
//      *******
// *******************
// `*****************

