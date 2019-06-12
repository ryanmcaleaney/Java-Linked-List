public class linkedList {

    public class node{

        private int data;
        private node next;

        public int getData() {
            return data;
        }

        public node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(node next) {
            this.next = next;
        }

        public node(int data, node next) {
            this.data = data;
            this.next = null;
        }

    }

    static public class list extends linkedList{

        private node head;

        private node createNode(int data){

            node newNode = new node(data, null);
            return newNode;

        }

        public void createHead(int data){

            this.head = createNode(data);

        }

        public void addNode(int data){

            node head = this.head;
            if(head == null){
                System.out.println("You didn't create a head, but don't worry I'll do it for this time");
                this.createHead(data);
            }else {
                while (head != null) {
                    if (head.getNext() == null) {
                        head.setNext(this.createNode(data));
                        break;
                    }
                    head = head.getNext();
                }
            }

        }

        public void prependList(int data){

            node head = this.head;
            if(head == null){
                System.out.println("You didn't create a head, but don't worry I'll do it for this time");
                this.createHead(data);
            }else{
                node newNode = this.createNode(data);
                this.head = newNode;
                newNode.setNext(head);
            }

        }

        public void insertByKey(int key, int data){

            node head = this.head;
            while(head != null){
                if(head.getData() == key){
                    node newNode = this.createNode(data);
                    newNode.setNext(head.getNext());
                    head.setNext(newNode);
                    break;
                }
                head = head.getNext();
            }

        }

        public void printList(){
            node head = this.head;

            while(head != null){
                if(head.getNext() != null)
                    System.out.print(head.getData() + " -> ");
                else
                    System.out.println(head.getData());
                head = head.getNext();

            }

        }



    }

}

