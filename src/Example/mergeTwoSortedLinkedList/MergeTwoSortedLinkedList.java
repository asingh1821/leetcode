package Example.mergeTwoSortedLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node temp = new Node(2);
        Node temp1 = new Node(4);
        Node temp2 = new Node(7);
        head1.next = temp;
        temp.next = temp1;
        temp1.next = temp2;
        Node head2 = new Node(1);
        Node c1 = new Node(3);
        Node c2 = new Node(4);
        head2.next = c1;
        c1.next = c2;
        Solution s = new Solution();
        Node res = s.mergeLinkedList(head1, head2);
        printNode(res);
    }
    public static void printNode(Node res) {
        Node c = res;
        while (c != null) {
            System.out.print(c.data+" ");
            c = c.next;
        }
    }
}

class Solution{
    public static Node mergeLinkedList(Node head1, Node head2){
        Node curr1 = head1, curr2 = head2;
        Node node = new Node(-1);
        Node temp = node;
        while(curr1 != null && curr2 != null){
            if(curr1.data <= curr2.data){
                temp.next = curr1;
                temp = temp.next;
                curr1 = curr1.next;
            }else{
                temp.next = curr2;
                temp = temp.next;
                curr2 = curr2.next;
            }
        }
        if(curr1 == null){
            temp.next = curr2;
        }else{
            temp.next = curr1;
        }
        return node.next;
    }
}
