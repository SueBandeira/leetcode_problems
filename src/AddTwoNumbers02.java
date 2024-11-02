import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbers02 {
  public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
    ListNode Node = new ListNode();
    ListNode nodeAux = Node;
    int remnant = 0, sum, sumTotal;

    while(l2 != null || l1 != null || remnant != 0) {
      sumTotal = remnant;
      if(l1 != null) {
        sumTotal += l1.val;
        l1 = l1.next;
      }
      if(l2 != null) {
        sumTotal += l2.val;
        l2 = l2.next;
      }

      sum = sumTotal % 10;
      remnant = sumTotal / 10;
      // Add na ListNode de retorno
      Node.next = new ListNode(sum);
      Node = Node.next;
    }
    return nodeAux.next;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("[");
    ListNode aux = this;
    while(aux != null) {
      sb.append("," + aux.val);
      aux = aux.next;
    }
    sb.append(']');
    if(sb.length() > 2) sb.replace(1, 2, "");
    return sb.toString();
  }
}

class AddTwoNumbers02Test {
  @Test
  void testAddTwoNumber() {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(3);
//    l1.next = l2;
//    l2.next = l3;
    l1 = new ListNode(4, l1);
    l1 = new ListNode(3, l1);

    ListNode b1 = new ListNode(5);
    ListNode b2 = new ListNode(6);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;
//    b1 = new ListNode(6, b1);
//    b1 = new ListNode(4, b1);

    String expected = "[8,0,7]";
    var newList = AddTwoNumbers02.addTwoNumber(l1, b1);
    Assertions.assertEquals(expected, newList.toString());
  }

  @Test
  public void listNode4() {
    ListNode l1 = new ListNode(9);
    ListNode l2 = new ListNode(9);
    ListNode l3 = new ListNode(9);
    ListNode l4 = new ListNode(9);
    ListNode l5 = new ListNode(9);
    ListNode l6 = new ListNode(9);
    ListNode l7 = new ListNode(9);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;
    l5.next = l6;
    l6.next = l7;

    ListNode b1 = new ListNode(9);
    ListNode b2 = new ListNode(9);
    ListNode b3 = new ListNode(9);
    ListNode b4 = new ListNode(9);
    b1.next = b2;
    b2.next = b3;
    b3.next = b4;

    String expected = "[8,9,9,9,0,0,0,1]";
    var newList = AddTwoNumbers02.addTwoNumber(l1, b1);
    Assertions.assertEquals(expected, newList.toString());
  }

}
