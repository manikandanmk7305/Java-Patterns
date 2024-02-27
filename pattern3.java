3.write a program to print the following pattern input format:4 output format:. 4444 333 22 1
Example 1:

Input: 
 
5

Output:

55555
4444
333
22
1

code:

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=n;i>=1;i--){
      for(j=1;j<=i;j++){
        if(j!=i)
        System.out.print(i+"");
      else
          System.out.print(i);
      
      }
      System.out.println();
    }
  }
}
