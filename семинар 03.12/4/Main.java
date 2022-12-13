public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree1 = new BinarySearchTree();

        tree1.Add(100, "a ");
        tree1.Add(50, "I ");
        tree1.Add(150, "Search ");
        tree1.Add(75, "am ");
        tree1.Add(125, "Binary ");
        tree1.Add(25, "Hello, ");

        tree1.Add(175, "Tree??? ");
        tree1.Add(175, "Tree! ");

        tree1.WalkInOrder(tree1.root);
        System.out.println("\n");

        try{
            tree1.findNode(150).describeNode();
        }catch (NullPointerException e){
            System.out.println("Узла не существует");
        }

    }
}

