
12.Write a program to print the following pattern
Example 1:

Input: 
 
4

Output:

   1
  12
 123
1234

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,j,k;
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=n-1;j>=i;j--){
        System.out.print(" ");
      }
      for(k=1;k<=i;k++){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
