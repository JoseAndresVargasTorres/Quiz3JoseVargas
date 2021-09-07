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
    public int size(){
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
        queue.show();
        queue.size();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.show();
        queue.size();
    }
}
