import java.util.*;
public class leapyear{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int year=sc.nextInt();
if(year%4==0){
   if(year%100==0){
     if (year%400==0){System.out.print("leap");}
     else{System.out.print("not leap");}
	 }
    else{System.out.print("leap");}
}
else{System.out.print("not leap");}
}
}