import java.util.*;
public class linearsearch{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int [] a= new int[5];
  int n=sc.nextInt();
  int flag=1;
  for(int i=0;i<a.length;i++){
     a[i]=sc.nextInt();
	 }
    for(int i=0;i<a.length;i++){
	       if(a[i]==n){
	System.out.print("found at index"+i);
			  flag=0;
			  break;
         }
			}
   if (flag==1){
     System.out.print("not found"); }			
	}}