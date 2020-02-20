import java.util.*;
public class bitwise{
public static void main (String [] args){
int a=5; //0101
int b=6;  //0110
int c=a&b;  //0100 means 4
System.out.println(c);
int d=a|b;  // 0111 means 7
System.out.println("The OR operator is"+d);
int e=15; //1111
int g=e<<1;  
int f=e>>1;
System.out.println(g); //7
System.out.println(f);  //14
}
}

