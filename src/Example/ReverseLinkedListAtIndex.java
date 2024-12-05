package Example;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;

    }
}
public  class ReverseLinkedListAtIndex {

    public static void main(String[] args) {
        Node head = new Node(2);
        Node temp = new Node(4);
        Node temp1 = new Node(5);
        Node temp2 = new Node(-1);
        head.next = temp;
        temp.next = temp1;
        temp1.next = temp2;
        Solution s = new Solution();
        Node last = s.reverseLinkedList(head);
        displayList(last);
    }
    static void displayList(Node last){
       Node curr = last;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}


class Solution {
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node tempCurrent = curr;
        // Node last = curr;
        while (curr.next != null) {
            Node storedNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = storedNode;
        }
        tempCurrent.next = curr;
        //prev = curr;
        return prev;
    }
}