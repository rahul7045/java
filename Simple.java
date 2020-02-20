import java.util.*;
public class Simple{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principal amount");
int x=sc.nextInt();
System.out.println("Enter the rate");
double y=sc.nextDouble();
System.out.println("Enter the time");
int z=sc.nextInt();
double simple=x*y*z/100;
System.out.println("The simple interest is"+simple);


}
}
