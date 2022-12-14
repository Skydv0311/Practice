
class Node {
    Node left;
    Node right;
    int data;
}
public class BinaryTree {

    public int distanceBetweenTwoNodes(Node node, int n1, int n2) {
        if (node == null) {
            return -1;
        }

        Node lca = this.findLowestCommonAncestor(node, n1, n2);

        if (lca == null) {
            return -1;
        }

        int d1 = distanceFromParentToNode(lca, n1, 0);
        int d2 = distanceFromParentToNode(lca, n2, 0);

        return d1 + d2;
    }

    public int distanceFromParentToNode(Node node, int val, int distance) {
        if (node == null) {
            return -1;
        }

        if (node.data == val) {
            return distance;
        }

        int d = distanceFromParentToNode(node.left, val, distance + 1);

        if (d != -1) {
            return d;
        }

        d = distanceFromParentToNode(node.right, val, distance + 1);

        return d;
    }

    boolean ifN1Present = false;
    boolean ifN2Present = false;

    public Node findLowestCommonAncestor(Node node, int n1, int n2) {

        Node lca = this.findLowestCommonAncestorUtil(node, n1, n2);

        if (ifN1Present && ifN2Present) {
            return lca;
        } else {
            return null;
        }

    }
    public Node findLowestCommonAncestorUtil(Node node, int n1, int n2) {
        System.out.println(node.data);
        if (node == null) {
            return null;
        }

        if (node.data == n1) {
            ifN1Present = true;
            return node;
        }

        if (node.data == n2) {
            ifN2Present = true;
            return node;
        }

        Node leftLCA = findLowestCommonAncestorUtil(node.left, n1, n2);
        Node rightLCA = findLowestCommonAncestorUtil(node.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return node;
        }

        return leftLCA != null ? leftLCA : rightLCA;
    }

    public Node createNewNode(int val){
        Node newNode=new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    public static void main(String[] args) {
        BinaryTree t=new BinaryTree();
        Node root =t.createNewNode(2);
        root.left=t.createNewNode(7);
        root.right=t.createNewNode(9);
        root.right.right=t.createNewNode(3);
        root.left.left=t.createNewNode(10);
        root.left.right=t.createNewNode(6);
        root.left.right.right=t.createNewNode(11);
        root.left.right.left=t.createNewNode(5);

        System.out.println(t.distanceBetweenTwoNodes(root, 10, 5));
    }
}
