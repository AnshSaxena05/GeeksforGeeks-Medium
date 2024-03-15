import java.util.ArrayList;
import java.util.Collections;

public class gfg_Linked_List_Sorted {

    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        Collections.sort(list);
        current = head;
        for (int i = 0; i < list.size(); i++) {
            current.data = list.get(i);
            current = current.next;
        }
        
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(1);
        head.next.next = new Node(2);
        
        gfg_Linked_List_Sorted sorter = new gfg_Linked_List_Sorted();
        Node sortedHead = sorter.sort(head);
        
        // Printing sorted linked list
        while (sortedHead != null) {
            System.out.print(sortedHead.data + " ");
            sortedHead = sortedHead.next;
        }
    }
}
