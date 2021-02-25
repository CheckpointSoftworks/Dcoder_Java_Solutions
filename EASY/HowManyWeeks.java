import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int ans = (int) Math.floor(10000/x);
    System.out.println(ans);
   }
 }
