1.Write a program to print the below pattern Input Format:Number of rows to be printed--->4 Output Format: Pattern 1 1 2 1 2 3 1 2 3 4
Example 1:

Input: 

6

Output:

1
12
123
1234
12345
123456

code:

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
