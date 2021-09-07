package lists;

public class Node {
    private Node next;
    private Node previous;
    private Object data;
    /*a diferencia de listas simplemente enlazadas, aqui se escribe una variable llamada previous
    que me servira para manejar la lista de atras para adelante
    * */
    //private Node previous;

    //creacion del constructor
    public Node(Object data) {
        this.next = null;
        this.previous = null;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getPrevious(){
        return this.previous;
    }
    public void setPrevious(Node node) {
        this.previous = node;
    }
    public String toString(){//clase nodo basica
        String sNode = "["+this.getData() + "]-->";
        return sNode;
    }


}
