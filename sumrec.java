import java.util.*;
public class sumrec{
public static int fun(int n,int s){
 if(n==6) return s;
 s=s+n;
 return fun(n+1,s);
}
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	System.out.println(fun(n,sum));
   }
}