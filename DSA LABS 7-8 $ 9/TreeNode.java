package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode root;

    public BinaryTree(int val) {
        root = new TreeNode(val);
    }

    public void addChild(TreeNode parent, TreeNode rightChild, TreeNode leftChild) {
        if (parent != null) {
            if (leftChild != null) {
                parent.left = leftChild;
            }
            if (rightChild != null) {
                parent.right = rightChild;
            }
        }
    }

    public void inOrderTraverse(TreeNode node) {
        if (node != null) {
            inOrderTraverse(node.left);
            System.out.print(node.data + " ---> ");
            inOrderTraverse(node.right);
        }
    }

    public void preOrderTraverse(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ---> ");
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
    }

    public void postOrderTraverse(TreeNode node) {
        if (node != null) {
            postOrderTraverse(node.left);
            postOrderTraverse(node.right);
            System.out.print(node.data + " ---> ");
        }
    }

    public void levelOrderTraverse() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.data + " ---> ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public int countNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree(10);
        TreeNode leftChild = new TreeNode(20);
        TreeNode rightChild = new TreeNode(30);
        b1.addChild(b1.root, rightChild, leftChild);
        TreeNode leftLeftChild = new TreeNode(40);
        TreeNode leftRightChild = new TreeNode(50);
        b1.addChild(leftChild, leftRightChild, leftLeftChild);
        TreeNode rightLeftChild = new TreeNode(60);
        TreeNode rightRightChild = new TreeNode(70);
        b1.addChild(rightChild, rightRightChild, rightLeftChild);

        System.out.println("Level Order Traversal:");
        b1.levelOrderTraverse();
        System.out.println();

        System.out.println("In-Order Traversal:");
        b1.inOrderTraverse(b1.root);
        System.out.println();

        System.out.println("Post-Order Traversal:");
        b1.postOrderTraverse(b1.root);
        System.out.println();

        System.out.println("Pre-Order Traversal:");
        b1.preOrderTraverse(b1.root);
        System.out.println();

        System.out.println("Number of Nodes: " + b1.countNodes(b1.root));
    }
}
