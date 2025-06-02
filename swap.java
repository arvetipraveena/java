import java.util.*;
public class swap{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int []a=new int[5];
	for(int i=0;i<a.length;i++){
	 a[i]=sc.nextInt();
	 }
	  int i=0;
	  int j=a.length-1;
	  int temp;
	  while(i<j){
	     temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 i++;
		 j--;
		 }
		 for(int k=0;k<a.length;k++){
	   System.out.print(a[k]);
	 }}}