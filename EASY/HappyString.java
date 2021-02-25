import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int x = Integer.parseInt(n); //str length
    int a = x + 96; //Starting value for ascii lowercase
    int j = x; //start val for countdown loop
    
    StringBuilder sb = new StringBuilder();
    
    while(j > 0) {
      char c = (char)(a);
      sb.append(c);
      a--;
      j--;
    }
    
    System.out.println(sb.toString());
   }
 }
