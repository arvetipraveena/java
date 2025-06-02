import java.util.*;
public class strongnum{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int m=n;
int sum=0;
int fact=1;
while(n!=0){
	int rem=n%10;
	for (int i=1;i<=rem;i++){
		fact=fact*i;
	}
	sum+=fact;
	fact=1;
	n=n/10;
}
if(sum==m){
	System.out.println("strong"+sum);
}
else{
	System.out.println("not strong"+sum);
}
}
}