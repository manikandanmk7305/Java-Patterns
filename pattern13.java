13.Write a program to print the following pattern
Example 1:

Input: 
 
6

Output:

     6
    65
   654
  6543
 65432
654321

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    for(int i=n;i>=1;i--){
      for(int j=i;j>1;j--){
        System.out.print(" ");
      }
      for(int k=n;k>=i;k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
