import java.util.HashSet;
import java.util.Set;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    int count = 0;
    Set<T> has_set = new HashSet<>();
    Node<T> temp = head;
    while(temp != null){
      count += 1;
      has_set.add(temp.val);
      temp = temp.next;
    }
    return has_set.size() == count;
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
    System.out.println((ECSource.isUnivalueList(z)));
    Node<Integer> u = new Node<>(2);
    Node<Integer> v = new Node<>(2);
    Node<Integer> w = new Node<>(3);
    Node<Integer> x = new Node<>(3);
    Node<Integer> y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;

// 2 -> 2 -> 3 -> 3 -> 2

    System.out.println(isUnivalueList(u)); // false
    }
}
