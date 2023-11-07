//class Node<T> {
 //   T val;
  //  Node<T> next;
    
   // public Node(T val) {
    //  this.val = val;
     // this.next = null;
   // }
 // }
  
  class Source {

    public static <T> Node<T> reverseList(Node<T> head) {
        // create new null node
        Node<T> prev = null;
       // get the current node as head
        Node<T> current = head;
        // next node as null
        Node<T> next = null;
        // run this loop as long as the current node has value
        while (current != null) {
            // save the node after the current
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    
    public static void main(String[] args) {
        //Node<String> x = new Node<>("x");
        //Node<String> y = new Node<>("y");
    
        //x.next = y; // x -> y
    
        //reverseList(x); // y -> x
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
// a -> b -> c -> d -> e -> f

        //reverseList(a); // f -> e -> d -> c -> b -> a
        // Printing solution
        Node<String> head = reverseList(a);

        while (head != null) {
            System.out.print(head.val);
            System.out.print("->");
            head = head.next;            
        }
    }
  }