import java.util.*;
public class bubblesort{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	  int [] a=new int[5];
	  for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
	  }
	  for(int i=0;i<a.length-1;i++){
	    for(int j=0;j<a.length-1-i;j++){
		   if(a[j]>a[j+1]){
		     int temp=a[j];
			 a[j]=a[j+1];
			 a[j+1]=temp;
		   }
		}
		}
		for(int i=0;i<a.length;i++){
	     System.out.println(a[i]);
	  }
		
	  }
	  
}
