import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next();
     int inputs = Integer.parseInt(s1);
     int i = 0;
     
     while(i < inputs) {
       String next = sc.next();
       int year = Integer.parseInt(next);
       if(year % 400 == 0) {
         System.out.println("Yes");
       }
       else if(year%4==0 && year%100!=0) {
         System.out.println("Yes");
       }
       else {
         System.out.println("No");
       }
       i++;
     }
   }
 }
