import java.util.*;
public class sumofdigit{
public static void main (String [] args){
 Scanner sc=new Scanner (System.in);
  int n=sc.nextInt();
  int sum=0;
int temp=n;
 while(temp>0){
  int lastdigit=temp%10;
  temp=temp/10;
  sum=sum+lastdigit;
    }
  System.out.println(sum);
}
}
