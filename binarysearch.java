// array should be in sorted order
import java.util.*;
public class binarysearch{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	  int [] a=new int[5];
	  for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
	  }
	  int s=sc.nextInt();
	  int i=0;
      int j=a.length-1;
	  for(i=0;i<a.length;i++){
	       int m=(i+j)/2;
		   if(a[m]==s){
		     System.out.println("found at index"+m);
			  System.exit(0);
		   }
		   if(a[m]<s) i=m+1;
		   if(a[m]>s) j=m;
	  }
	     System.out.println("  not found ");
}
}