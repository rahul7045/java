import java.util.*;
public class rating{
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
switch(a){
case 1:
case 2:
   System.out.println("bad");
   break;
case 3:
case 4:
    System.out.println("Average");
    break;
case 5:
   System.out.println("Good");
   break;
default:
  System.out.println("Plzz enter ur rating");
}

}
}
