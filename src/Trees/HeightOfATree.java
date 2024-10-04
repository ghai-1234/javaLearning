package Trees;

import java.util.Collections;

public class HeightOfATree {

    public static int height(Tree root) {

        if(root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);


        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right = new Tree(3);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

        System.out.println(height(root));
    }
}
