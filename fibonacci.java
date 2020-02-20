import java.util.*;
public class fibonacci{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of term which u want to print");
int n=sc.nextInt();
int a=0;
int b=1;
int c;
System.out.println(a);
System.out.println(b);
for(int i=0;i<n-2;i++){
c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
