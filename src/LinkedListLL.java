
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    private Node head;
    private int length;

    public LinkedList1() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            length++;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            length++;
        }
    }

    public void remove() {
        Node random = head;
        Node previous = head;
        if (head == null) {
            System.out.println("there is no element in the list so we cannot remove any value in the list");
        } else {
            while (random.next != null) {
                previous = random;
                random = random.next;
            }
            previous.next = null;
            length--;
        }
    }

    public int remove(int position) {
        Node random = head;
        int count = 1;
        int ii;
        Node previous = head;
        if (position > length ||length==0) {
            return 0;
        }
        if (length == 1) {
            ii = head.data;
            head = null;
            length--;
            return ii;
        }
        if (position == 1) {
            ii = head.data;
            head = head.next;
            length--;
            return ii;
        } else {
            while (random.next != null) {
                if (position == count) {
                    ii = random.data;
                    previous.next = random.next;
                    length--;
                    return ii;
                }
                previous = random;
                random = random.next;
                count++;
            }
        }
        if (position == count) {
            previous.next = null;
            length--;
            return random.data;
        }
        return 0;
    }
    public int append(int position,int data) {
        Node newNode = new Node(data);
        int count =1;
        if (position > length ) {
            System.out.println("Given position is greater than element in the list so we are added the element in the list at last position");
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            length++;
            return 0;
        }
        if(position == 1){
            Node random = head;
            head = newNode;
            newNode.next = random;
            length++;
            return 0;
        }
        if(head == null || length ==0) {
            head = newNode;
            length++;
            return 0;
        }
        else {
            Node current = head;
            Node previous = head;
            while (current.next != null) {
                if (position == count) {
                    newNode.next = current;
                    previous.next = newNode;
                    length++;
                    return 0;
                }
                previous = current;
                current = current.next;
                count++;
            }
            if (position == count) {
                newNode.next = current;
                previous.next = newNode;
                length++;
                return 0;
            }
        }
        return 0;
    }
    public void getlength() {
        System.out.println(length);
    }

    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}


public class LinkedListLL {
    public static void main(String[] args) {
        LinkedList1 ki = new LinkedList1();
        ki.append(3);
        ki.append(5);
        ki.append(6);

        ki.printlist();
        ki.getlength();

        ki.remove();
        ki.printlist();
        ki.getlength();

        ki.append(89);
        ki.printlist();
        ki.getlength();


        System.out.println(ki.remove(1));
        ki.printlist();
        ki.getlength();

        ki.append(2,66);
        ki.printlist();
        ki.getlength();

        ki.append(5,63);
        ki.printlist();
        ki.getlength();

        ki.append(5,93);
        ki.printlist();
        ki.getlength();

        System.out.println(ki.remove(5));
        ki.printlist();
        ki.getlength();

        System.out.println(ki.remove(2));
        ki.printlist();
        ki.getlength();

        ki.append(1,88);
        ki.printlist();
        ki.getlength();
    }
}
