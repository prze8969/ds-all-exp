import java.lang.foreign.ValueLayout;

class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}
public class p10_binary_search_tree {
    Node root;

    Node insert(int val, Node root){

        if(root == null){
            return new Node(val);
        }

        if(val < root.data){
            root.left = insert(val, root.left);
        }
        else if(val > root.data){
            root.right = insert(val, root.right);
        }
        return root;
    }

    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +  " ");
        inorder(root.right);
    }

    void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +  " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root == null){
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +  " ");

    }
    
}
