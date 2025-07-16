class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class BinaryTree {
    Node root = null;

    // Insert node based on priority (BST logic)
    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.data) {
            node.left = insert(node.left, key); // higher priority to left
        } else {
            node.right = insert(node.right, key);
        }
        return node;
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " -> ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " -> ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " -> ");
    }
    
    int minvalue(Node root){
        int minv = root.key;
        while(root != null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    
    int maxvalue(Node root){
        int minv = root.key;
        while(root != null){
            minv = root.right.key;
            root = root.right;
        }
        return minv;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 3);  
        tree.root = tree.insert(tree.root, 4);
        
        
        
        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
    }
}


