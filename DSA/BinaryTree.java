import java.util.Stack;

public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode right;
        private TreeNode left;
        private int data;
        public TreeNode(int data){
            this .data=data;
        }
    }

    public void createBinaryTree(){
        TreeNode first= new TreeNode(5);
        TreeNode second= new TreeNode(6);
        TreeNode third= new TreeNode(7);
        root=first;
        root.right=second;
        root.left=third;
    }

    public void recursivePreOrder(TreeNode root){
        if (root==null){
            return;
        }
        System.out.println(root);
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }

    public void iterativePreOrder(TreeNode root){
        if(root==null){return;}
        Stack<TreeNode> stack= new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.println(temp);
            if(temp.right!=null){
            stack.push(temp.right);
            }
            if(temp.left!=null){
            stack.push(temp.left);
            }
        }
    }

    public void recursiveInOrder(TreeNode root){
        if (root==null){
            return;
        }
        recursivePreOrder(root.left);
        System.out.println(root);
        recursivePreOrder(root.right);
    }

    public void iterativeInOrder(TreeNode root){
        if(root==null){return;}
        Stack<TreeNode> stack= new Stack<>();
        TreeNode temp=root;
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                System.out.println(temp);
                temp=temp.right;
            }
        }
    }
}
