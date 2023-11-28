package Trees;

public class Tree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.leftNode = insertRec(root.leftNode, data);
        } else if (data > root.data) {
            root.rightNode = insertRec(root.rightNode, data);
        }
        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.leftNode);
            System.out.print(root.data + " ");
            inOrderRec(root.rightNode);
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    public void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.leftNode);
            preOrderRec(root.rightNode);
        }
    }

    int max = 0;
    int min = 0;

    public void max() {
        maxRec(root);
    }

    public void maxRec(Node root) {
        if (root != null) {
            maxRec(root.leftNode);
            max = Math.max(max, root.data);
            maxRec(root.rightNode);
        }
        min = max;
    }

    public void min() {
        minRec(root);
    }

    public void minRec(Node root) {
        if (root != null) {
            minRec(root.leftNode);
            min = Math.min(min, root.data);
            minRec(root.rightNode);
        }
    }

    public void showMinMax() {
        System.out.println();
        System.err.println("Min : " + min);
        System.err.println("Max : " + max);
    }

    int[] arr = new int[100];
    int top = -1;

    public void levelOrder() {
        levelOrderRec(root);
    }

    public void levelOrderRec(Node root) {
        if (root != null) {
            levelOrderRec(root.leftNode);
            arr[++top] = root.data;
            levelOrderRec(root.rightNode);
        }
    }

    public void showLevelOrder() {
        for (int i = 0; i <= top; i += 2) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i <= top - 1; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    int len = -1;
    int sum = 0;

    public void sumLen() {
        sumLenRec(root);
    }

    public void sumLenRec(Node root) {
        if (root != null) {
            sumLenRec(root.leftNode);
            sum += root.data;
            ++len;
            sumLenRec(root.rightNode);
        }
    }

    public void lenSum() {
        System.out.println(sum);
        System.out.println(len);
    }

}
