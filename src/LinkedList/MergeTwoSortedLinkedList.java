package LinkedList;

public class MergeTwoSortedLinkedList {


    public static Node mergeTwoSortedLinkedLists(Node head1, Node head2) {

        Node dummy = new Node(0);
        Node current = dummy;


        while (head1 != null && head2 != null) {

            if(head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            }
            else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        current.next = (head1 != null) ? head1 : head2;

        return dummy.next;

    }

    public static void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        l1.next.next = new Node(11);
        l1.next.next.next = new Node(112);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        Node mergedHead = mergeTwoSortedLinkedLists(l1,l2);

        traverse(mergedHead);

    }
}
