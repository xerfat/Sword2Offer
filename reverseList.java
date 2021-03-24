/**
 *   剑指Offer第16题 递归与递推两种方法
 */
 
/** Iterative solution of revesing SLList
 *  @author xerfat (2021.03.24)
 */ 
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode ptr = head.next;
        head.next = null;
       
        while(ptr != null) {
            ListNode temp = ptr.next;     
            ptr.next = head;
            head = ptr;
            ptr = temp;  
        } 
        return head;
    }
}


/** Recursive solution of revesing SLList
 *  @author xerfat (2021.03.24)
 */ 
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ptr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return ptr;
    }
}