package BinaryTree.Question1;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


/**
 * Created by harora on 7/14/15.
 * It is assumed that both the nodes are present in the tree, if not
 * we should first check for the presence of those nodes in the tree.
 */
public class Solution {

  public TreeNode lowestCommonAncestor(TreeNode rootNode, TreeNode p ,
    TreeNode q){

      //Edge case: If the root node is null we return null.
      if(rootNode == null) return null;

      // If both the nodes are less than the root node, we check
      // on the left side for the LCA.
      if(Math.max(p.val, q.val) < rootNode.val){
        return lowestCommonAncestor(rootNode.left, p, q);
      }

      // If both the nodes are more than the root node, we check
      // on the right side for the LCA.
      if(Math.min(p.val, q.val) > rootNode.val){
        return lowestCommonAncestor(rootNode.right, p, q);
      }

      return rootNode;
    }

    private class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
    }

}
