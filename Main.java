public class Main {

    public static void main(String[] args) {
        linkedList.list l = new linkedList.list();
        for(int i = 0; i<10; i++){
            l.prependList(i);
        }
        System.out.println(l.getLength());
        l.sortByData();
        l.printList();
    }
}
