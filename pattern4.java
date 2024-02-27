4.write a program to print the following pattern input format:4 output format:. 1 2 1 3 2 1 4 3 2 1
Example 1:

Input: 
 
7

Output:

1
21
321
4321
54321
654321
7654321

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=0;j<=i-1;j++){
        System.out.print(i-j);
      }
      System.out.println();
    }
  }
}
