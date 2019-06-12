public class Main {

    public static void main(String[] args) {
        linkedList.list l = new linkedList.list();
        l.addNode(1);
        l.addNode(13);
        l.addNode(14);
        l.addNode(15);
        l.prependList(0);
        l.insertByKey(1, 2);
        l.printList();
    }
}
