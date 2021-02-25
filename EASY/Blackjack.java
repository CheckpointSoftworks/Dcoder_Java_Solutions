import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int sum = a + b;
    
    if(sum > 21) {
      if(a==11) {
        a = 1;
        System.out.println(a+b);
        return;
      }
      else if(b==11) {
        b=1;
        System.out.println(a+b);
        return;
      }
      else {
        System.out.println(0);
        return;
      }
    }
    else {
      System.out.println(a+b);
      return;
    }
   }
 }