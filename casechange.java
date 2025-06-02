import java.util.*;
public class casechange{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
   String b="";
   for(int i=0;i<a.length();i++){
       char ch=a.charAt(i);
	   if(Character.isUpperCase(ch)){
	      b=b+Character.toLowerCase(ch);
	   }
	   else{
	     b=b+Character.toUpperCase(ch);}
		 }
		 System.out.println(b);
   }
}