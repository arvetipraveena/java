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
      void addf(int n){
          Node newnode=new Node(n);
          newnode.next=head;
          this.head=newnode;
      }
      void delete(){
          Node curr=head;
          while(curr.next.next!=null){
              curr=curr.next;
          }
          curr.next=null;
      }
      void deletef(){
          Node curr=head;
          this.head=curr.next;
      }
      void display(){
          Node curr=head;
          while(curr!=null){
              System.out.println(curr.data);
              curr=curr.next;
          }
      }
  }
public class deleteflinkedlist
{
	public static void main(String[] args) {
		linkedlist l=new linkedlist();
		l.add(1);
		l.add(2);
		l.add(3);
		l.addf(3);
		l.delete();
		l.deletef();
		l.display();
	}
}