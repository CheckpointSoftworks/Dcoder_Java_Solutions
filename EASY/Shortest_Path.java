import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int x1 = Integer.parseInt(sc.next());
    int y1 = Integer.parseInt(sc.next());
    int x2 = Integer.parseInt(sc.next());
    int y2 = Integer.parseInt(sc.next());
    boolean a = false;
    
    if(Math.sqrt((y2-0)^2 + (x2-0)^2) > 
       Math.sqrt((x1-0)^2 + (y1-0)^2)) {
       a = true;
    }
    
    if(a == true) {
      System.out.println("A");
    }
    else {
      System.out.println("B");
    }
   }
 }