import java.util.*;
public class week{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  switch(n){
  case 1: {System.out.print("monday");}
  break;
    case 2: {System.out.print("tuesday");}
  break;
    case 3: {System.out.print("wedday");}
  break;
    case 4: {System.out.print("thursday");}
  break;
    case 5: {System.out.print("friday");}
  break;
    case 6: {System.out.print("saturday");}
  break;
    case 7: {System.out.print("sunday");}
  break;
  default:  {System.out.print("invalid");}
}
}}