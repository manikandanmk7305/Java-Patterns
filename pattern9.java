9.write a program to print the following pattern input format:4 output format: 2 24 246 2468
Example 1:

Input: 

5

Output:

2
24
246
2468
246810

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.print(j*2);
        }
      System.out.println();
    }
  }
}
