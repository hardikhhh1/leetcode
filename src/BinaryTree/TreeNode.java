package BinaryTree;

/**
 * Created by harora on 7/14/15.
 * Class representing the tree node of a binary tree.
 */
public class TreeNode {

    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode parentNode;

    public TreeNode(TreeNode leftNode, TreeNode rightNode, TreeNode parentNode){
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.parentNode = parentNode;

    }

}
