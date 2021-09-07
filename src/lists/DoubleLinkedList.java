package lists;

import java.util.NoSuchElementException;

public class DoubleLinkedList {
    private Node head;
    //crear tail para conocer el fin de la lista
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        //se agrega tail en el metodo constructor
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {

        return size == 0;//head == null
    }

    public int size() {

        return size;
    }
    //method to print from beginning to last



    //method insert last object data
    public void insertLast(Object data) {
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;

        }else{
            tail.setNext(newNode) ;

        }
        newNode.setPrevious(tail);
        tail = newNode;
        size++;
    }
    public void insertFirst(Object data){
        Node newNode = new Node(data);
        if(isEmpty()){
            tail = newNode;


        }else{
            head.setPrevious(newNode);
        }
        newNode.setNext(head);
        head = newNode;
        size++;


    }



    public void displayForward(){
        if (isEmpty()){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.toString());
            temp = temp.getNext();
        }
        System.out.println();

    }
    public void displayBackward(){
        if(tail == null){
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.toString2());
            temp = temp.getPrevious();
        }
        System.out.println();
    }


    public Node deleteFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp = head;
        if (head ==tail){
            tail = null;
        }else{
           //aquí es donde no sé cómo poner head.next.previous = null con getters y setters

            //problema
        }
        //head = head.getNext();
        head.setNext(head);
        temp.setNext(null);
        size--;
        return temp;
    }


    public static void main(String[] args) {
        // Create an empty linked list
        DoubleLinkedList linked_list = new DoubleLinkedList();
        //linked_list.insertFirst(1);
        //linked_list.insertFirst(25);

        // Insert some elements in the list

        linked_list.insertLast(3);
        linked_list.insertLast(8);
        linked_list.insertLast(9);
        linked_list.insertLast(1);

        linked_list.displayForward();
        linked_list.deleteFirst();
        linked_list.displayForward();
        //linked_list.displayBackward();
        // Get and print the size of the list.
        // It should match the number of elements we inserted
        int size = linked_list.size();
        System.out.println(size);
    }


}
