// Buy And Sell Stocks Based on max Profit
import java.util.Arrays;

public class Q8_BuyNSellSTockHighProfit {
    public static void main(String[] args) {
        int[] a = {100,50,1,100,10,9};
        System.out.println(Arrays.toString(a));
        int min = a[0];
        int pro = 0;
        String buyday = "" ;
        String sellday = "" ;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]){//i=2 min=5
                min = a[i];
            }
            for (int j = i + 1; j < a.length; j++) {
                    if (pro < a[j] - min){
                        pro = a[j] - min;
                        buyday  = "Buy at Day "+ i;
                        sellday = "Sell at Day " + j;

                    }
                    
                
            }
        }
        System.out.println( buyday+ " " + sellday+ " " + "Maimum Profit is "+ pro );
    }
}
