package beginners_guide.middle_of_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        int lenght = 0;
        while (head != null) {
            nodes.add(head);
            head = head.next;
            lenght++;

        }
        return nodes.get(nodes.size() / 2);

    }

}
class Program {
    public static void main(String[] args) {

        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ListNode middle = new ListNode().middleNode(head);

        System.out.println("Middle node value: " + middle.val);
    }
}
