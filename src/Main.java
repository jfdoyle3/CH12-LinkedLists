public class Main {
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

    }

    public static Node<Integer> addNode(Node<Integer> head, int value) {
        Node<Integer> newNode = new Node<Integer>(value);

        if (head == null)
            return newNode;

        Node<Integer> trav = head;

        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = newNode;
        return newNode;
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

    public static void assertResult(boolean results) {
        if (results)
            System.out.println("ye");
        else
            System.out.println("nay");
    }
}

