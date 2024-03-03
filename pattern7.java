7.write a program to print the following pattern input format:4 output format: 4 34 234 1234
Example 1:

Input: 
 
6

Output:

6
56
456
3456
23456
123456

code:

import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=n;i>=1;i--){
      for(j=i;j<=n;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
