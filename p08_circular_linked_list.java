class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class p08_circular_linked_list {
    Node head;
    p08_circular_linked_list(){
        head = null;
    }
    void insert_beginning(int val){
        Node newnode = new Node(val);

        if(head == null){
            head = newnode;
            newnode.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        newnode.next = head;
        temp.next = newnode;
        head = newnode;

    }

    void insert_end(int val){
        Node newnode = new Node(val);

        if(head == null){
            head = newnode;
            newnode.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        newnode.next = head;
        temp.next = newnode;

    }

    void delete_begining(){
        if(head== null){
            System.out.println("empty ll");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        
        head = head.next;
        temp.next = head;
    }

    void delete_end(){
        if(head== null){
            System.out.println("empty ll");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;

    }
}
