import java.util.*;
public class palindrome_rec{
public static boolean fun(String s,int i,int j){
 if(i>=j)
      return  true;
 if(s.charAt(i)!=s.charAt(j))
 return false;
 return(fun(s,i+1,j-1));

}
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int i=0;
	int j=s.length()-1;
	System.out.println(fun(s,i,j));
   }
}