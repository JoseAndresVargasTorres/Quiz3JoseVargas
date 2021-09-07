package lists;

public class Queue {
    /*
    Realizar lo siguiente,
    Cuando uno encola a alguien, atrás y saca al primero
    Se usan en sistemas operativos
    Ejecuto la primera y la borro, luego esa segunda se ejecuta y se borra y así de esta manera

    Enqueue: Agrega un elemento al final de la tabla
    Dequeue: Remueve un elemento del frente
    Peek: Obtiene el elemento del frente sin removerlo
    Tengo dos referencias, rear y front. Atrás y adelante.


     */

    private DoubleLinkedList queueList;

    //Metodo constructor
    public Queue(){

        queueList = new DoubleLinkedList();
    }
    public void enqueue(Object newElement){
        this.queueList.insertLast(newElement);

    }
    public void dequeue(){
        this.queueList.deleteFirst();
    }

    public Node peak(){
        return this.queueList.getHead();
    }
    public void show(){
        this.queueList.displayForward();
    }
    public int size() {

        return this.queueList.size();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);

        //queue.size();
        queue.show();
        System.out.println("Size: "+ queue.size());

        Node first_node = queue.peak();
        int element = (int) first_node.getData();
        System.out.println("First element:  "+ element);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.show();
        System.out.println("Size: " + queue.size());

        Node first_node2 = queue.peak();
        int element2 = (int) first_node2.getData();
        System.out.println("First element:  "+ element2);

    }
}
/*Los resultados que se obtuvieron sí son los esperados, por lo tanto
se concluye que los métodos del queue, provenientes de una double linked list, funcionan
perfectamente
 */