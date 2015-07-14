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
  public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        // Edge case: If the root is null , return null
        if(!root) return NULL;

        // If the root is itself the node, then it itself is the lca.
        if(root == p || root == q) return root;

        // We find the lca for the left and right node of the root.
        TreeNode *left = lowestCommonAncestor(root->left, p, q);
        TreeNode *right = lowestCommonAncestor(root->right, p, q);

        // If both are not null that means that one node is on the left branch
        // and the other is on the right branch. So the root itself is the
        // LCA.
        if(left != NULL && right != NULL) return root;

        // If any one is null return the other, which means we move to the branch
        // where one of the node is atleast present.
        return left ? left : right;

    }
};
