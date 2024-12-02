package Example;


public class ReverseLinkedListAtIndex {

    public static void main(String[] args) {
        Node head = new Node(2);
        Node temp = new Node(4);
        Node temp1 = new Node(5);
        Node temp2 = new Node(-1);
        head.next = temp;
        temp.next = temp1;
        temp1.next = temp2;
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;

    }

}
