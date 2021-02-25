import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    int inputs = Integer.parseInt(s1);
    int i = 0;
    ArrayList<Integer> nums = new ArrayList<Integer>();
    while(i < inputs) {
      String next = sc.next();
      int nextint = Integer.parseInt(next);
      nums.add(nextint);
      i++;
    }
    Collections.reverse(nums);
    int[] prim = nums.stream()
                 .mapToInt(v -> v).toArray();
    Arrays.stream(prim)
          .forEach(j -> System.out.print(j +" "));
   }
 }