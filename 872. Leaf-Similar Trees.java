/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        f(list1,root1);
        f(list2,root2);

        
      

        // for(int i:list1){
        //     if(!list2.contains(i))
        // }

        return Objects.equals(list1,list2);
    }
    public static void f(List<Integer> list, TreeNode root){

        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        f(list,root.left);
        f(list,root.right);
    }
}
