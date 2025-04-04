package EasyProblems;

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
    while (aux != null) {
      sb.append("," + aux.val);
      aux = aux.next;
    }
    sb.append(']');
    if (sb.length() > 2) sb.replace(1, 2, "");
    return sb.toString();
  }
}
