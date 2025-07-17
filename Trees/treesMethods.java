package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class treesMethods {
    static int size=0;//global variable
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    //root left right
    public static void preorderTravelsal(Node root){
        if(root==null)return ;
        System.out.print(root.val+"->");
        if(root.left!=null)preorderTravelsal(root.left);
        if(root.right!=null)preorderTravelsal(root.right);
    }
    //left root right inorder
    public static void inorderTravelsal(Node root){
        if(root==null)return ;
        if(root.left!=null)inorderTravelsal(root.left);
        System.out.print(root.val+"->");
        if(root.right!=null)inorderTravelsal(root.right);
    }
    //left right root post order
    public static void postorderTravelsal(Node root){
        if(root==null)return ;
        if(root.left!=null)postorderTravelsal(root.left);
        if(root.right!=null)postorderTravelsal(root.right);
        System.out.print(root.val+"->");
    }
    //size method
    public static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left) + size(root.right);
    }
    //tree sum of all nodes method
    public static int sumOfAllNodes(Node root){
        if(root==null) return 0;
        return root.val+ sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    //max value
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null))return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    // print elements of nth level
    public static void nthLevel(Node root, int n){
        if(root==null)return ;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void nthLevel2(Node root, int n){
        if(root==null)return ;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel2(root.right,n-1);
        nthLevel2(root.left,n-1);
        
    }
    public static void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root==null)return;
        q.add(root);
        while (!q.isEmpty()) {
        Node temp = q.remove();
        System.out.print(temp.val+" ");

        if (temp.left  != null) q.add(temp.left);
        if (temp.right != null) q.add(temp.right);
        }
    }

    public static void zigZagTravelsal(Node root, int n){
        if(root==null)return ;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        if(n%2==1){
            zigZagTravelsal(root.left,n-1);
            zigZagTravelsal(root.right,n-1);
        }
        else{
            zigZagTravelsal(root.right,n-1);
            zigZagTravelsal(root.left,n-1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a= new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e= new Node(6);
        Node f= new Node(7);
        b.left=e;
        b.right=f;

        // preorderTravelsal(root);
        // System.out.println();
        // inorderTravelsal(root);
        // System.out.println();
        // postorderTravelsal(root);
        // System.out.println();
        // //System.out.println(size);
        // System.out.println(size(root));
        // System.out.println(sumOfAllNodes(root));
        // System.out.println(max(root));
        // System.out.println(height(root));
        // System.out.println(min(root));
        // System.out.println(product(root));
        // System.out.println();
        // nthLevel(root, 3);
        // for(int i=0;i<level;i++){

        // }
        int level = height(root) + 1;
        for(int i=1;i<=level;i++){
            if(i%2!=0)nthLevel(root, i);
            else nthLevel2(root, i);
        }
        System.out.println();
        for(int i=1;i<=level;i++){
            zigZagTravelsal(root, i);
        }
        //BFS(root);
    }
}
