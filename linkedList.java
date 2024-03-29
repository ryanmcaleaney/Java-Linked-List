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

        public void deleteByKey(int key){
            node head = this.head;
            node temp = head;
            while(head != null){
                if(head.getData() == key) {
                    if(head == this.head){
                        if(head.getNext() == null){
                            head = null;
                            break;
                        }else{
                            this.head = head.getNext();
                            break;
                        }
                    }else if(head.getNext() == null){
                        temp.setNext(null);
                        head = null;
                        break;
                    }else{
                        temp.setNext(head.getNext());
                        head = null;
                        break;
                    }
                }
                temp = head;
                head = head.getNext();
            }

        }

        public void pop(){
            node head = this.head;
            node temp = head;
            while(head != null){
                if(head.getNext() == null){
                    temp.setNext(null);
                    head = null;
                    break;

                }
                temp = head;
                head = head.getNext();
            }
        }

        public int getLength(){
            int counter = 0;
            node head = this.head;
            while(head != null){
                head = head.getNext();
                counter+=1;
            }

            return counter;
        }

        public void sortByData(){
            int counter = 0;
            int length = this.getLength();
            node head = this.head;

            while(counter < length){
                while(head.getNext() != null){
                    if(head.getData() > head.getNext().getData()){
                        int temp = head.getData();
                        head.setData(head.getNext().getData());
                        head.getNext().setData(temp);
                    }
                    head = head.getNext();
                }
                counter+=1;
                head = this.head;
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

