import java.util.*;
import java.util.Stack;
public class reverse_stack{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		Stack<Character> a=new Stack<>();
		String s=sc.nextLine();
		String s2="";
		for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		       a.push(ch);}
			for(int i=0;i<s.length();i++){
			  s2=s2+a.pop();
	}
	System.out.print(s2);
 }
}