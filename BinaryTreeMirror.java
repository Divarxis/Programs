// Define a class representing a node in the binary tree
class TreeNode {
    int val;
    TreeNode left, right;

    // Constructor to initialize a node with a given value
    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeMirror {

    // Function to mirror a binary tree
    public static void mirror(TreeNode root) {
        // Base case: If the tree is empty or has only one node, return
        if (root == null) {
            return;
        }

        // Swap the left and right subtrees of the current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively mirror the left subtree
        mirror(root.left);
        
        // Recursively mirror the right subtree
        mirror(root.right);
    }

    // Function to print the inorder traversal of a binary tree
    public static void inorder(TreeNode root) {
        if (root != null) {
            // Recursively traverse the left subtree
            inorder(root.left);
            
            // Print the value of the current node
            System.out.print(root.val + " ");
            
            // Recursively traverse the right subtree
            inorder(root.right);
        }
    }

    // Main method to test the mirror function
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Print the inorder traversal of the original tree
        System.out.println("Original tree (Inorder traversal):");
        inorder(root);
        System.out.println();

        // Mirror the binary tree
        mirror(root);

        // Print the inorder traversal of the mirrored tree
        System.out.println("Mirrored tree (Inorder traversal):");
        inorder(root);
        System.out.println();
    }
}
