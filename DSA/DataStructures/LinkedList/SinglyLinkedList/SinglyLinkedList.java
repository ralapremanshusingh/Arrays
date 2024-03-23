public class A_SinglyLinkedList {

    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data= data;
            this.next=null;
        }
    }

    
    public static void insertionAtEnd(int data) {

        Node newNode = new Node(data);
        if(head==null) {
            head= newNode;
            return;  
        }
        Node temp = head;
        while(temp.next!=null) {
            temp=temp.next; 
        }
        temp.next=newNode;
        return;

    }

    public static void insertionAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public static void insertionAfterNode(Node node, int data) {
        Node newNode = new Node(data);
        newNode.next=node.next;
        node.next=newNode;

    }


    public static void printSinglyLinkedList() {

        System.out.println("\n");

        Node temp= head;

        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println("\n");

    }


    public static void main(String[] args) {
        
        // Insertion at end
        insertionAtEnd(1);
        insertionAtEnd(2);
        insertionAtEnd(3);
        insertionAtEnd(4);
        insertionAtEnd(5);

        // Insertion at first
        insertionAtFirst(6);
        insertionAtFirst(7);
        insertionAtFirst(8);
        insertionAtFirst(9);

        // Insetion after node
        insertionAfterNode(head.next.next,10);

        // Print Singly Linked List
        printSinglyLinkedList();
    }

    
}
