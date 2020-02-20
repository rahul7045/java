import java.util.*;
public class arrayaveragemarks{
public static void main (String [] args){
Scanner sc=new Scanner (System.in);
System.out.println("Enetr the no of students");
int n=sc.nextInt();
int marks[]=new int[n];
int average=0;
for(int i=0;i<n;i++){
   System.out.println("enter the marks");  
   marks[i]=sc.nextInt();
   }
  for(int i=0;i<n;i++){
    average=average=marks[i];
    }
  System.out.println("average marks is "+average);

}
}
