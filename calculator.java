import java.util.*;
class calculator{
public static void main (String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int d;
sc.nextLine();
char c=sc.nextLine().charAt(0);
switch(c){
case '+':
    d=a+b;
    System.out.println(d);
    break;
case '-':
    d=a-b;
    System.out.println(d);
    break;
case '*':
    d=a*b;
    System.out.println(d);
    break;
case '/':
    d=a/b;
    System.out.println(d);
    break;
default:
   System.out.println("Invalid");
}
}
}
