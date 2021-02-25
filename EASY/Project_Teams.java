import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    int stu = Integer.parseInt(s1);
    if(stu < 3) {
      System.out.println(1);
    }
    else if(stu%3 == 0) {
      System.out.println(stu/3);
    }
    else {
      stu = stu - (stu%3);
      System.out.println(stu/3);
    }
   }
 }
//1 1
//2 1
//3 1
//4 One group of 4
//5 One group of 5
//6 Two groups of 3
//7 Two groups, one of 3 one of 4
//11 Three groups.  2 Threes, One Four

//So basically the last group doesn't need to count the extra students.
//Answer is to subtract students mod 3 from the total, since extra don't matter.


