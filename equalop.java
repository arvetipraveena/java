import java.util.*;
public class equalop{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 String a=sc.nextLine();
 String b=sc.nextLine();
 if(a.length()==b.length()){
    for(int i=0;i<a.length();i++){
	 if(a.charAt(i)!=b.charAt(i)){
	    System.out.print("Strings are not equal");
		System.exit(0);
		}
		}
		System.out.print("String are equal");
}
else{
System.out.print("Strings sre not equal");}
 }
 }