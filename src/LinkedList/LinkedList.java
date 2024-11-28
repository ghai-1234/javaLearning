package LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node head;

    //Add in the last
    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    //Add in the start
    public void appendStart(int data) {
        Node newNode = new Node(data);
        Node current = head;
        head = newNode;
        newNode.next = current;
    }

    //Reverse the linked list
    public void reverse() {
       Node prev = null;
       Node current = head;
       Node next = null;

       while (current != null) {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       head = prev;

    }

    //Detect loop in linked list
    public static boolean detectLoop(Node head){
        if (head == null || head.next == null) {
            return false; // No cycle if list is empty or has only one node
        }

        Node slow = head; // Tortoise
        Node fast = head; // Hare

        // Move slow pointer by one step and fast pointer by two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast pointers meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        // If fast pointer reaches the end of the list, there is no cycle
        return false;
    }

    //middle node of a linked list in one go
    public Node middle() {

        if(head == null)
            return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    //Delete the node at a given number
    public void deleteNode(int number) {
        Node current = head;
        Node prev = null;
        int count = 1;
        while (current   != null) {
            if(count == number) {
                prev.next = current.next;
                current = current.next;
                break;
            }
            count ++;
            prev = current;
            current = current.next;

        }
    }

    //Remove loop in a linked list
    public void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }

        if(slow == fast) {

            if(fast == head) {
                while(slow.next != fast ) {
                    slow = slow.next;
                }
                slow.next = null;
            }

            else {
                slow = head;
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }

                fast.next = null;
            }
        }


    }

    //remove duplicate from sorted array
    public void removeDuplicate(Node head) {
        Node p1 = head;

        while(p1 != null && p1.next != null) {
            if(p1.data == p1.next.data) {
                p1.next = p1.next.next;
            }
           else {
               p1 = p1.next;
            }
        }

    }

    //Traverse
    public void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public Node rotateLeftByKPlaces(Node head, int nodes, int k) {
        if(head== null)
            return head;
        k = k % nodes;
        if(k==0)
            return head;
        Node current = head;

        for(int i = 1;i<k;i++) {
            current = current.next;
        }
        Node newHead = current.next;
        Node tempHead = newHead;
        while (tempHead.next != null)
        {
            tempHead = tempHead.next;
        }

        tempHead.next = head;
        current.next = null;

    return newHead;
    }
    public int countNodes(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Node rotateRightByKPlaces(Node head, int nodes, int k) {
        if(head== null)
            return head;
        k = k % nodes;
        if(k==0)
            return head;
        int diffNodes = nodes - k;
        Node current = head;
        Node tempHead;

        for (int i = 1; i < diffNodes; i++) {
            current = current.next;

        }
        tempHead = current.next;
        current.next = null;

        Node lastHead = tempHead;
        while (lastHead.next != null) {
            lastHead = lastHead.next;
        }
        lastHead.next = head;
        return tempHead;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.append(5);
//        list.append(4);
//        list.append(3);
//        list.append(2);
//        list.append(1);
//        //list.reverse();
//        list.deleteNode(11);

//        Node mid = list.middle();
//        System.out.println("middle is " + mid.data);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        // Create a loop (4->5->3->2)
       // head.next.next.next.next.next = head;

        ///list.removeLoop(head);
        //list.removeDuplicate(head);
        //list.traverse(head);
        int nodes = list.countNodes(head);
        int k = 5;
//       Node nh = list.rotateLeftByKPlaces(head,nodes,k);
       //list.traverse(head);
        Node rh = list.rotateRightByKPlaces(head,nodes,k);
        list.traverse(rh);

    }

}
