import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Single{
    //insert at end
 Node head,tail;
 public void insertEnd(int data){
     Node n=new Node(data);
     if(head==null){
         head=n;
         tail=n;
     }else{
         tail.next=n;
         tail=n;
     }
 }
 //insert at first
 public void insertfirst(int data){
     Node nn=new Node(data);
     if(head==null){
         head=nn;
         tail=nn;
     }else{
     
     nn.next=head;
     head=nn;
     
 }
 }
 //insert at a position
 public void insert_atposition(int pos,int data){
     Node n=new Node(data);
     if(head==null){
         System.out.println("invalid pos");
     }else{
         Node temp=head;
         for(int i=0;i<pos;i++){
             temp=temp.next;
         }
         n.next=temp.next;
         temp.next=n;
         
     }
 }
 public void delatfirst(){
    if(head==null){
        System.out.println("List is empty");
    }
    else{
        head=head.next;
    }
 }
//  public void delatend(){
//     if(head==null){
//         System.out.println("List is empty");
//     }
//     else{
//         head.next=tail;
//     }
//  }
 // display or traversal
 public void display(){
     Node temp=head;
     while(temp!=null){
         System.out.print(temp.data+" "+"->");
         temp=temp.next;
     }
     System.out.print("none");
     System.out.println();
     
 }
}
public class Main
{
	public static void main(String[] args) {
		Single s=new Single();
	//	System.out.println("insert operation");
		s.insertEnd(30);
		s.insertEnd(20);
		s.insertEnd(10);
		s.insertfirst(50);
		s.insertfirst(60);
		s.insert_atposition(1,40);
		//System.out.println("Delete operation");
		s.delatfirst();
		//s.delatend();
		s.display();
	}
}