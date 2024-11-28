package LinkedList;

 class LL {
     int data;
     LL next;

     LL(int data) {
         this.data = data;
         this.next = null;
     }

     void append(int data,LL head) {
         LL newNode = new LL(data);
         LL current = head;

         while(current.next != null) {
             current = current.next;
         }
         current.next = newNode;

     }

     public static void main(String[] args) {
         LL list = new LL(5);
        list.append(50,list);
        printList(list);

     }

     private static void printList(LL head) {
         LL current = head;
         while (current != null)
         {
             System.out.println(current.data);
             current = current.next;
         }
     }

 }
