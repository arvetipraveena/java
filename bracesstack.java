import java.util.*;
import java.util.Stack;
public class bracesstack{
public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 Stack <Character> s=new Stack<>();
	 String a=sc.nextLine();
	 for(int i=0;i<a.length();i++){
	      char ch=a.charAt(i);
		  if(ch=='('|| ch=='[' || ch=='{' ){s.push(ch);}
		  else{
		  if(ch==')' && s.pop()=='('){continue;}
		  else if(ch==']' && s.pop()=='['){continue;}
		  else if(ch=='}' && s.pop()=='{'){continue;}
		  }
		}
	    System.out.print(s);}}