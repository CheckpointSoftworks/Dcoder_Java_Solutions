import java.util.*;
 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    int inputs = Integer.parseInt(s1);
    StringBuilder sb = new StringBuilder();
    
    int i = 0;
    while(i < inputs) {
      String next = sc.next();
      sb.append(next);
      String nexttofind = sc.next();
      if(sb.indexOf(nexttofind) >= 0) {
        System.out.println("Yes");
      }
      else {
        System.out.println("No");
      }
      sb.delete(0,sb.length());
      i++;
    }
   }
 }