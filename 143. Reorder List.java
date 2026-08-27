/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        List<Integer> l = new ArrayList<>();
        int left = 0;
        int right = list.size()-1;
        while(left<=right){
            l.add(list.get(left));
            if(left!=right){
                l.add(list.get(right));
            }
            
            left++;
            right--;
        }
       
        
        System.out.println(l);
        ListNode t = head;
        for(int i=0;i<list.size() && t!=null ;i++){
            t.val = l.get(i);
            t = t.next;
        }
       // head = t;
        //return head;
    }
}
