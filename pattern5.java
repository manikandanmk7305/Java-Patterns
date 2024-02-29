5.write a program to print the following pattern input format:4 output format: 1234 234 34 4
Example :

Input: 
 
6

Output:

123456
23456
3456
456
56
6

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=i;j<=n;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
