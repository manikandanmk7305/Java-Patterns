14.Write a program to print the following pattern
Example 1:

Input: 
 
5

Output:

a
ab
abc
abcd
abcde

code: 
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,j;
    n=m.nextInt();
    for(i=0;i<n;i++){
      for(j=0;j<=i;j++){
        System.out.printf("%c",97+j);
      }
      System.out.println();
    }
  }
}
