import java.util.*;
public class removespace{
public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  String a=sc.nextLine();
	  String b="";
	  for(int i=0;i<a.length();i++){
	       char ch=a.charAt(i);
		   if(ch!=' '){
		         b+=ch;}
				 }
		System.out.print(b);
}
}