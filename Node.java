class Node {
    int data;
    Node parent;
    Node left;
    Node right;
    int color; // 1 = red, 0 = black

    public Node() {
    }
 
    public Node(int key) {
        parent = null;
        data = key;
        left = null;
        right = null;
        color = 1;  // red color by default for new nodes
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Node{" + "data=" + data;
                
//        s += ", parent=";
//        
//        if (parent == null) {
//            s += "null";
//        }
//        else {
//            s += parent;
//        }
//        
//        s += ", left=";
//        
//        if (left == null) {
//             s += "null";
//        }
//        else {
//            s += left;
//        }
//        
//        s += ", right=";
//        
//        if (right == null) {
//             s += "null";
//        }
//        else {
//            s += right;
//        }

        s += ", color=" + color + '}';
        
        return s;
    }
    
}
