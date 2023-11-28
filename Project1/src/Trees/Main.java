package Trees;

public class Main {
     public static void main(String[] args) {
          Tree t = new Tree();
          t.insert(10);
          t.insert(20);
          t.insert(5);
          t.insert(6);
          t.insert(3);
          t.insert(14);
          t.insert(24);
          System.err.println("inorder");
          t.inOrder();
          System.out.println();
          System.err.println("Preorder");
          t.preOrder();
          System.out.println();
          System.out.println("level order");
          t.levelOrder();
          t.showLevelOrder();
          t.max();
          t.min();
          t.showMinMax();
          t.sumLen();
          ;
          t.lenSum();
     }
}
