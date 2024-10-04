package Trees;



public class TreeTraversal {

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right = new Tree(3);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

        postorder(root);
    }

    public static void inorder(Tree root) {

        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(Tree root) {
        if(root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void postorder(Tree root) {
        if(root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");


    }


}
