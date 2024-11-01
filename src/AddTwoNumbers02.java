import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbers02 {
  public static void main(String[] args) {

  }

  public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
    ListNode Node = null;
    ListNode nodeAux = null;
    int remnant = 0, sum=0, sumTotal=0;


    ListNode listAux = l1;
    while (listAux != null || l2 != null) {
      // aqui você adiciona na Node
      // value = (listAux.val + l2.val) % 10
      // sobra = (listAux.val + l2.val) / 10 aqui é divisão
      int A = 0, B = 0;
      if (listAux != null) {
        A = listAux.val;
        listAux = listAux.next;
      }

      if (l2 != null) {
        B = l2.val;
        l2 = l2.next;
      }

      sum = A + B;
      sumTotal = (sum % 10 + remnant) % 10;
      remnant = (sum + remnant > 9) ? 1:0;
      // Add na lista de retorno


      //Node = new ListNode(sumTotal, Node);
      while (Node != null) {
        nodeAux = Node;
        Node = Node.next;
      }

      if (nodeAux != null) {
        nodeAux.next = new ListNode(sumTotal);
        Node = nodeAux;
      } else {
        Node = new ListNode(sumTotal);
      }
    }

    if (remnant == 1) {
      nodeAux = new ListNode(remnant, Node);
    }

    return Node;
  }

}

class ListNode {
      int val;
      ListNode next;

      ListNode() {}

      ListNode(int val) { this.val = val; }

      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class AddTwoNumbers02Test {

  void testAddTwoNumber(){
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(3);
    l1.next = l2;
    l2.next = l3;
//    l1 = new ListNode(4,l1);
//    l1 = new ListNode(3,l1);

    ListNode b1 = new ListNode(5);
    ListNode b2 = new ListNode(6);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;
//    b1 = new ListNode(6, b1);
//    b1 = new ListNode(4, b1);


    var newList = AddTwoNumbers02.addTwoNumber(l1, b1);
    while (newList != null){
      System.out.println(newList.val);
      newList = newList.next;
    }
  }
  public void listNode() {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(3);
    l1.next = l2;
    l2.next = l3;
  }
  public void listNode1() {
    ListNode l1 = new ListNode(5);
    ListNode l2 = new ListNode(6);
    ListNode l3 = new ListNode(4);
    l1.next = l2;
    l2.next = l3;
  }
  public void listNode2() {
    ListNode l1 = new ListNode(0);
  }
  public void listNode3() {
    ListNode l1 = new ListNode(0);
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

    var newList = AddTwoNumbers02.addTwoNumber(l1, b1);
    while (newList != null){
      System.out.println(newList.val);
      newList = newList.next;
    }
  }

  public void expectedListNode() {
    ListNode l1 = new ListNode(7);
    ListNode l2 = new ListNode(0);
    ListNode l3 = new ListNode(8);
    l1.next = l2;
    l2.next = l3;
  }
  public void expectedListNode1() {
    ListNode l1 = new ListNode(0);
  }
  public void expectedListNode2() {
    ListNode l1 = new ListNode(8);
    ListNode l2 = new ListNode(9);
    ListNode l3 = new ListNode(9);
    ListNode l4 = new ListNode(9);
    ListNode l5 = new ListNode(0);
    ListNode l6 = new ListNode(0);
    ListNode l7 = new ListNode(0);
    ListNode l8 = new ListNode(1);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;
    l5.next = l6;
    l6.next = l7;
    l7.next = l8;
  }

}
