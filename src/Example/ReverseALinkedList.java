package Example;


import static Example.Solution1.reverseLinkedList;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
    }

}

public class ReverseALinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode temp = new ListNode(15);
        ListNode temp1 = new ListNode(20);
        ListNode temp2 = new ListNode(25);
        ListNode temp3 = new ListNode(30);
        head.next = temp;
        temp.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        Solution1 s = new Solution1();
        ListNode res = s.reverseLinkedList(head);
        printNode(res);
    }
    public static void printNode(ListNode res){
        ListNode curr = res;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

}

class Solution1{
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode upcomingNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = upcomingNode;
        }
        return prev;
    }

}