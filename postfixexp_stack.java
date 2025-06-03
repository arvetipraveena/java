// only for inputs with condition (digits=operators+1)//
import java.util.*;
import java.util.Stack;
public class postfixexp_stack{
 public static void main(String[]  args){
   Scanner sc=new Scanner(System.in);
   Stack <Integer> st=new Stack<>();
   String a=sc.nextLine();
   int digit=0;
   int op=0;
   for (int i=0;i<a.length();i++){
	   char ch=a.charAt(i);
	   if(Character.isDigit(ch)){
		   digit+=1;
	   }
	   else{
		   op+=1;
	   }
   }
  if(digit>op){
   for(int i=0;i<a.length();i++){
       char ch=a.charAt(i);
	   if(Character.isDigit(ch))
	   { st.push(Character.getNumericValue(ch));}
	   else{
	       int p=st.pop();
		   int q=st.pop();
		    switch(ch){
			 case '+': st.push(p+q);break;
			 case '-': st.push(p-q);break;
			 case '*': st.push(p*q);break;
			 case '/': st.push(p/q);break;
			 }
			}	
			}
			System.out.print(st);
  }
  else{
	  System.out.print("cannot perform the postfixexpression with this input");
  }
			}}