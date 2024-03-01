6.write a java program to print the following pattern input format:4 output format: 1 23 456 78910
Example 1:

Input: 

5

Output:

1
23
456
78910
1112131415

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    int c=1;
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.printf("%d",c);
        c++;
      }
      System.out.println();
    }
  }
}
