class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class p07_linked_list {
    Node head;
    p07_linked_list(){
        head = null;
    }
    void insert_beginning(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }


    void insert_end(int val){
        Node newnode = new Node(val);

        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;

    }


    void delete_begining(){
        if(head == null){
            System.out.println("The linkedlist is empty");
            return;
        }
        head = head.next;

    }


    void delete_end(){
        if(head == null){
            System.out.println("The linkedlist is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

    }

    void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

}
