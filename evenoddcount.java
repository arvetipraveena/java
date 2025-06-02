import java.util.*;
public class evenoddcount
{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int [] a= new int[5];
  for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
   }
   int ec=0;
   int oc=0;
   for(int i=0;i<a.length;i++){
       if(a[i]%2==0){
	    ec+=1;
       }
	else{
	    oc+=1;}}
System.out.println(ec);
System.out.println(oc);
}}