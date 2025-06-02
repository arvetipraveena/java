import java.util.*;
public class greatestnumber
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
   
  if (a>=b){
     if(a>c)
	 {
		 System.out.println(a+"greater");
		 }
	 else if(a<c) 
	 {
		 System.out.println(c+"greater");
		 }
	 else
	 {
		 System.out.println(a+"greater");
		 }
  }
  else if (b>=a){
  if(b>c)
  {
	  System.out.println(b+"greater");
	  }
	 else if (b<c)
	 {
		 System.out.println(c+"greater");
		 }
	 else
	 {
		 System.out.println(b+"greater");
		 }
  }
  else
  {
  System.out.println(c+"greater");
  }
  }}