package com.sparta.ss.week2.design_patterns.binary_tree;

// Don't see nodes. They see values
// Code to an API - Who is using your code?
public class BinaryTree {
    private final Node rootNode;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    // Interface for addNodeToTree
    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    // Interface for findNode
    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while(node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
//                node.setLeftChild(new Node(element));
//                Node leftChild = new Node(element);
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }
}
