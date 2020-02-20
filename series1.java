import java.util.*;
public class series1{
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
float sum=0;
float sum1=0;
for(float i=0;i<=n;i=i+2){
sum=sum+i;
}
for(float i=1;i<=n;i=i+2){
sum1=sum1+i;
}
float result=sum+sum1;
System.out.println("The result is"+result);
}
}
