package tree;

public class tree {

    public static void main(String[] args) {
        Node<Integer> head=null;

        head=addNode(head,6);
        head=addNode(head, 3);
    }
    public static Node<Integer> addNode(Node<Integer> head, Integer val){
        if(head==null)
            return new Node<Integer>(val);

        Node<Integer> trav=head;
         while(true) {
             if (val<trav.value) {
                 if (trav.left ==null) {
                     trav.left = new Node<Integer>(val);
                     return head;
                 }
                 trav=trav.left;
                 continue;
             }

             if(val>trav.value){
                 if(trav.right==null){
                     trav.right=new Node<Integer>(val);
                     return head;
                 }
                 trav=trav.right;
                 continue;
             }


         return head;           
         }
    }
}
