2.Write a program to print the below pattern Input Format:Number of rows to be printed--->5 Output Format: Pattern 5 5 4 5 4 3 5 4 3 2 5 4 3 2 1
Example 1:

Input: 
 
3

Output:

3
32
321

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
  int i,j,n;
  Scanner m=new Scanner(System.in);
  n=m.nextInt();
  for(i=n;i>=1;i--){
    for(j=n;j>=i;j--){
      System.out.print(j);
    }
    System.out.println();
  }
  }
}
