/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {

  public :
      TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q){

        //Edge case: If the root node is null we return null.
        if(root == NULL){
          return null;
        }

        // If both the nodes are less than the root node, we check
        // on the left side for the LCA.
        if (max(p->val, q->val) < root->val){
          return lowestCommonAncestor(root->left, p, q);
        }

        // If both the nodes are more than the root node, we check
        // on the right side for the LCA.
        if (min(p->val, q->val) > root->val){
          return lowestCommonAncestor(root->right, p, q);
        }

        return root;
      }


}
