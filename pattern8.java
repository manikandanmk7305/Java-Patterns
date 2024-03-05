
8.write a program to print the following pattern input format:4 output format: 1 10 101 1010
Example 1:

Input: 
 
8

Output:

1
10
101
1010
10101
101010
1010101
10101010

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        if(j%2==0)
          System.out.print("0");
        else
          System.out.print("1");
      }
      System.out.println();
    }
  }
}
