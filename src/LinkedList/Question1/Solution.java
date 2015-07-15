
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        if(nextNode != null){
         node.next = nextNode.next;
        }else{
            node.next = null;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val){ this.val = val; }
    }

}
