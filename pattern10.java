10.Write a program to print the below pattern Input Format:Number of rows to be printed--->4 Output Format: Pattern 1357 135 13 1
Example 1:

Input: 
 
6

Output:

1357911
13579
1357
135
13
1

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=n*2;i>=1;i-=2){
      for(j=1;j<=i;j+=2){
        System.out.print(j);
      }
      System.out.println();
    }
  }
    
}
