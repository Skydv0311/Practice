package Algorithms;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}


public class LinkedListDemo {
    public Node head = null;
    public void insertAtBegining(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
        }else{
            Node temp=head;
            head=newNode;
            newNode.next=temp;
        }
    }

    public void popFront(){
        if(head==null){
            System.out.println("List is empty");
        }else {
            head=head.next;
        }
    }

    public void pushBack(int data){
        Node temp=head;
        Node newNode=new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
    }

    public void popBack(){
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedListDemo test=new LinkedListDemo();
        test.insertAtBegining(2);
        test.display();

        test.insertAtBegining(5);
        test.display();

        test.popFront();
        test.display();
        test.pushBack(5);
        test.display();
        test.popBack();
        test.display();
    }
}


