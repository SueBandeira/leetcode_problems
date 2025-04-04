package EasyProblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedLists {
  public static ListNode mergeTwoLists2(ListNode listA, ListNode listB) {
    ListNode result = null;
    if (listA != null && listB != null) {
      Integer numberB, numberA;
      boolean run = true;
      while (listA != null || listB != null) {
        numberB = (listB != null) ? listB.val : Integer.MAX_VALUE;
        numberA = (listA != null) ? listA.val : Integer.MAX_VALUE;
        if (numberB < numberA) {
          result = new ListNode(numberB, result);
          listB = listB.next;
        } else {
          result = new ListNode(numberA, result);
          listA = listA.next;
        }
      }
    }
    System.out.println(listA);
    System.out.println(listB);
    return result;
  }

  public static ListNode mergeTwoLists(ListNode listA, ListNode listB) {
    ListNode raiz = new ListNode();//pega o início do ListNode
    ListNode aux = raiz;

    while (listA != null && listB != null) {
      if (listB.val < listA.val) {
        aux.next = listB;
        listB = listB.next;
      } else {
        aux.next = listA;
        listA = listA.next;
      }
      aux = aux.next;
    }
    aux.next = listA == null ? listB : listA;
    return raiz.next;
  }

}
class MergeTwoLists21Test {
  @Test
  @DisplayName("Testando primeiro case do 'LeetCode'")
  void testMergeTwoLists() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(4);

    l1.next = l2;
    l2.next = l3;

    ListNode b1 = new ListNode(1);
    ListNode b2 = new ListNode(3);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;

    String expected = "[1,1,2,3,4,4]";
    var newList = MergeTwoSortedLists.mergeTwoLists(l1, b1);
    Assertions.assertEquals(expected, newList.toString());
  }
  @Test
  @DisplayName("Testando primeiro case do 'LeetCode'")
  void testMergeTwoLists2() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(4);

    l1.next = l2;
    l2.next = l3;

    ListNode b1 = new ListNode(1);
    ListNode b2 = new ListNode(3);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;

    String expected = "[1,1,2,3,4,4]";
    var newList = MergeTwoSortedLists.mergeTwoLists(l1, b1);
    Assertions.assertEquals(expected, newList.toString());
  }
}