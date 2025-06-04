import java.util.*;
class Node{
    int data;
    Node next;
 Node(int n){
     this.data=n;
     this.next=null;
 }
}
  class linkedlist{
      Node head;
      void add(int n){
      Node newnode=new Node(n);
      if(head==null){
          head =newnode;}
      else{
          Node curr;
          curr =head;
          while(curr.next!=null){
              curr=curr.next;
          }
          curr.next=newnode;
      }
      }
      void display(){
          Node curr=head;
          while(curr!=null){
              System.out.println(curr.data);
              curr=curr.next;
          }
      }
  }
public class linkedlist_arrayinput
{
	public static void main(String[] args) {
		linkedlist l=new linkedlist();
		Scanner sc=new Scanner(System.in);
		int [] a= new int[5];
		for(int i=0;i<a.length;i++){
		    a[i]=sc.nextInt();
		l.add(a[i]);
		}
		l.display();
	}
}