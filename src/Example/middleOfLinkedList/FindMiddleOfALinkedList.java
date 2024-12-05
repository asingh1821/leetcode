package Example.middleOfLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

}

public class FindMiddleOfALinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = new Node(2);
        Node temp1 = new Node(3);
        Node temp2 = new Node(4);
        Node temp3 = new Node(5);
        head.next = temp;
        temp.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        Solution s = new Solution();
        Node middleNode = s.findMiddleNode(head);
        System.out.print(middleNode.data);
    }
}

class Solution {
    public static Node findMiddleNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
