import java.util.*;
public class primenumber{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int c=0;
for(int i=2;i<=n/2;i++){
if(n%i==0){
  c+=1;
}
}
if (c>=2){
	System.out.print("composite");
}
else{
	System.out.print("prime");
}
}
}
