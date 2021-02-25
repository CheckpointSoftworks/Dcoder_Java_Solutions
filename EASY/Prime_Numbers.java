import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int M = Integer.parseInt(sc.next());
    int N = Integer.parseInt(sc.next());
    
    while(M <= N) {
      if(isPrime(M)) {
        System.out.println(M);
      }
      M++;
    }
   }
   
   static boolean isPrime(int M) {
     if(M ==0 || M == 1) {
       return false;
     }
     int k = 2;
     while(k < M) {
       if(M%k == 0) {
         return false;
       }
       k++;
     }
     return true;
   }
 }