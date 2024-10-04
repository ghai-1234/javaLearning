package Trees;

public class LowestCommonAncestor {


    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right = new Tree(3);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        root.left.right.left = new Tree(8);
        Tree p = root.left.right;
        Tree q = root.left.right.left;

        System.out.println(lowestCommonAncestor(root,p,q).data);
    }

    private static Tree lowestCommonAncestor(Tree root, Tree p , Tree q) {


        if(root == null || root == p || root == q) {
            return root;
        }

        Tree left = lowestCommonAncestor(root.left,p,q);
        Tree right = lowestCommonAncestor(root.right,p,q);

        if(left == null)
            return right;
        else if (right == null) {
            return left;
        }
        else
            return root;
    }
}