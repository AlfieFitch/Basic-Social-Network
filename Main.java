public class Main {
    public static void main(String[] args) {
        BST tree = FileReader.readColleagues("colleagues.txt");
        System.out.println(tree.printReverseAlphabetic());
    }
}
