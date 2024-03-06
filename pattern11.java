11.Write a program to print the following pattern
Example 1:

Input: 
 
5

Output:

    5
   45
  345
 2345
12345

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,j,k; 
      n=m.nextInt();
    for(i=n;i>=1;i--)
    {
        for(k=i-1;k>=1;k--)
        {
            System.out.printf(" ");
        }

        for(j=i;j<=n;j++)
        {
            System.out.printf("%d",j);
        }
        System.out.println();
    }
  }
}
