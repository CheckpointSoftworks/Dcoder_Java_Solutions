import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    int x = Integer.parseInt(s1);
    int y = Integer.parseInt(s2);
    int opposite = ((x/2)+y)%x;
    System.out.println(opposite);
   }
 }