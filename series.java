import java.util.*;
public class series{
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
float sum=0;
for (float i=1;i<=n;i++){
sum=sum+1/i;
}
System.out.println(sum);
}
}
