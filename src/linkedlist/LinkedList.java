package linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head.next = addNode(head, 8);
        head.next.next = addNode(head, 5);
        head.next.next.next = addNode(head, 9);


        assertResult(head.value == 2);
        assertResult(head.next.value == 8);
        assertResult(head.next.next.value == 5);
        assertResult(head.next.next.next.value == 9);

        displayList(head);
        System.out.println();
        find(head,9);

    }

    public static Node<Integer> addNode(Node<Integer> head, int value) {

    // Instantiate a new Node.
        Node<Integer> newNode = new Node<Integer>(value);

    // Set value to List if List is empty.
        if (head == null)
            return newNode;

    // Set Traveller
        Node<Integer> trav = head;

    // loop to the end of the list.
        while (trav.next != null)
            trav = trav.next;

    // Add value to the end of the list.
            trav.next = newNode;

    // return Node.
        return newNode;
    }

    public static Node<Integer> recAddNode(Node<Integer> head, int value){
        if (head==null)
            return new Node<Integer>(value);

        return recAddNode(head.next, value);
    }

    public static void displayList(Node<Integer> head) {
        // output should be 2859 additional challenge 2, 8, 5, 9
        Node<Integer> trav = head;

        while (trav.next != null) {
            // Output List
            System.out.print(trav.value + ",");

            // Look ahead to see where the List ends
            // and display the tail and break out of loop.
            if (trav.next.next == null) {
                System.out.print(trav.next.value);
                break;
            }
            trav = trav.next;
        }
    }

    public static Node<Integer> find(Node<Integer> head, int query){
        // 0. Integer return the query if found null or not.
        // 1. int return the index  if found or -1 if not found.
        // 2. Node return of the node object that contains the query of null if not found.

        //while loop - palindrome


        Node<Integer> trav=head;

        while(trav !=null ){

            if (trav.value==query) {
                System.out.print(trav.value);
                return trav;
            }
            trav=trav.next;
        }
        System.out.println("\n\nquery not found.");
        return null;
    }



    public static void assertResult(boolean results) {
        if (results)
            System.out.println("ye");
        else
            System.out.println("nay");
    }
}

