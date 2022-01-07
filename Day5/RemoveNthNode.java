package Day5;
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = countNodes(head);
 
         int nthFromEnd= count-n;
         
         if(count == n){
             return head.next;
         }
 
         ListNode temp = head;
         ListNode prev = null;
         for(int i=0;i<nthFromEnd;i++){
             prev =temp;
             temp= temp.next;
         }
         prev.next= temp.next;
         
         return head;
     }
 
     private int countNodes(ListNode head) {
         ListNode temp = head;
         int count=0;
         while(temp!=null){
             count++;
             temp= temp.next;
         }
         return count;
     }

    public static void main(String[] args) {
        RemoveNthNode r= new RemoveNthNode();
        ListNode head =new ListNode(1);
        head.next= new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next= new ListNode(5);
        r.removeNthFromEnd(head, 2);
    }
}
