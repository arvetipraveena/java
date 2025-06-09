import java.util.*;
public class numrecursion{
    public static void fun(int n){
	 if(n==11) return;
	 System.out.println(n);
	 fun(n+1);
     System.out.println(n);
	}
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();	
    fun(n);
	
}
}