/**
 * This is Binary Tree, a tree which has 2 child nodes in every node
 *
 * @author Fatah Prakoso, fatahap27@gmail.com
 */

public abstract class BinaryTree <T extends Comparable<T>> {
    class BinaryNode {
        T data;
        BinaryNode right, left;

        BinaryNode(T data){
            this.data = data;
        }
    }

    // assign node to root node
    protected BinaryNode search(BinaryNode node, T search){
        // ...
        if(node.data == search) return node;

        // ...
        else if(search.compareTo(node.data)<0 && node.left!=null){
            return search(node.left, search);
        }

        // ...
        else if(search.compareTo(node.data)>0 && node.right!=null){
            return search(node.right, search);
        }

        return null;
    }


}