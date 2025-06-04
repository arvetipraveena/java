import java.util.*;
import java.util.Stack;
import java.util.Queue;
public class queuereverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack <Character> s=new Stack<>();
		Queue <Character> q=new LinkedList<>();
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++){
		    q.add(a.charAt(i));
		}
		for(int i=0;i<a.length();i++){
		    s.push(q.remove());
		}
		for(int i=0;i<a.length();i++){
		    q.add(s.pop());
		}
		System.out.print(q);
		
	}
}