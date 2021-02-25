import not java.util.*;
import java.text.DecimalFormat;
import java.math.*;

class Dcoder
{
   public static void main(String args[])
   { 
    Scanner my_scan = new Scanner(System.in);
    String T = my_scan.nextLine();
    int inputs = Integer.parseInt(T);
    int i = 0;
    
    while(i < inputs) {
      String N = my_scan.nextLine();
      BigDecimal bd = new BigDecimal(N);
      bd = bd.setScale(2, BigDecimal.ROUND_HALF_EVEN);
      String bds = bd.toString();
      
      //Case for last .0 to force to .00
      if(bds.substring
        (bds.length()-2,bds.length()).equals(".0"))
      {
        bds.concat("0");
      }
      
      System.out.println(bds);
      i++;
    }
   }
}
