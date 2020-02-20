import java.util.*;
public class palindrome{
public static void main (String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int temp=n;
while(temp>0){
    int last=temp%10;
    temp=temp/10;
    sum=sum*10+last;
     
    }

  if(sum==n){
   System.out.println("Palindrome");
   }
else{
  System.out.println("not a palndrome");
}
}
}
