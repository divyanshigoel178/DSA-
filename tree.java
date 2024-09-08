
public class tree {
    public static void main(String[] args) {
        binarytree b=new binarytree();
        b.insert(8);
        b.insert(7);
        b.insert(12);
        b.insert(15);
        b.insert(2);
        b.insert(5);
        
        b.inorder();
    }
}
class Node{
    Node left,right;
    int data;
   public Node (int data){
    this.data=data;
}

}
class binarytree{
    Node root;
    public void insert(int data){
    root=insertRec(root,data);
    }
 Node insertRec(Node root,int data){
    if(root== null){
        root =new Node(data);
    }
    else if(data<root.data){
        root.left=insertRec(root.left, data);
    }
    else if(data>root.data){
        root.right=insertRec(root.right, data);
    }
    return root;
 }

 public void inorder(){
    inorderRec(root);
 }
 public void inorderRec(Node root){
    if(root!=null){
        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }
   
 }
}

