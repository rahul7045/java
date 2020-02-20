import java.util.*;
import java.lang.*;
public class bubble{
public static void main (String [] args){
Scanner sc=new Scanner (System.in);
System.out.println("enter the no of data");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}

for(int k=0;k<n-1;k++){
    for(int j=0;j<n-1-k;j++){
        if(a[j+1]<a[j]){
           int temp=a[j+1];
           a[j+1]=a[j];
            a[j]=temp;
          }
       }
    }
 for(int item: a){
       System.out.print(item+" ");
      }

}
}
