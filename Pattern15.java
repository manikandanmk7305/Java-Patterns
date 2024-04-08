15.Write a program to print the following pattern
Example 1:

Input: 

7

Output:

2
23
235
2357
235711
23571113
2357111317

 
code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,count=0;
    n=m.nextInt();
    boolean flag=true;
    int a[]=new int [n];
    for(int i=2;count<n;i++){
      flag=true;
      for(int j=2;j<=i/2;j++){
        if(i%j==0){
          flag=false;
          break;
        }
      }if(flag){
        a[count]=i;
        count++;
      }
    }for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(a[j]);
      }
      System.out.println();
    }
  }
}15.Write a program to print the following pattern
Example 1:

Input: 

7

Output:

2
23
235
2357
235711
23571113
2357111317

 
code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,count=0;
    n=m.nextInt();
    boolean flag=true;
    int a[]=new int [n];
    for(int i=2;count<n;i++){
      flag=true;
      for(int j=2;j<=i/2;j++){
        if(i%j==0){
          flag=false;
          break;
        }
      }if(flag){
        a[count]=i;
        count++;
      }
    }for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(a[j]);
      }
      System.out.println();
    }
  }
}