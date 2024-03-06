package linkedListMyVirsion;

public class LinkedListByMe {
    //create a start node
    Node<Object> root;
    //class node
    private class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    //add values to the linked list and chain them to the root
    public void addValuesToTheList(Object data){
        //create the mode on call
        Node node = new Node(data);
        if(this.root == null){
            node.data = data;
            this.root = node;
        }
        //root has something attached to it
        else{
            //travers through the nodes
            Node pointer = this.root;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            //node.data = data;
            //you only need to fit the node where you c null
            pointer.next = node;

        }
    }

    //print values
    public void print(){
        printTheList();
    }
    private void printTheList(){
        Node pointer = this.root;
        System.out.println("Values are ");
        while(pointer != null){
            System.out.print(pointer.data);
            pointer = pointer.next;
            if(pointer == null){
                continue;
            }
            System.out.print(",");
        }
        System.out.println(" EOL");
    }

    public boolean findElementByKey(Object key){
        Node value = null;
        if((value = findElement(key)) != null){
            System.out.println("Element found with reference  "+value);
            return true;
        }
        System.out.println("Element not found "+key);
        return false;
    }

    private Node findElement(Object key){
        Node pointer = this.root;
        Node justBefor = null;
        while(pointer != null){
            if(pointer.data.equals(key)){
                return justBefor;
            }
            justBefor = pointer;
            pointer = pointer.next;
        }
        return null;
    }

    //insert an element at said position
    public void insertAnElement(Object at,Object data){
        Node hold = null;
        if((hold = findElement(at)) != null){
            Node node = new Node(data);
            node.data = data;
            node.next = hold.next;
            hold.next = node;
        }
        else {
            System.out.println("inserting element at last position");
            addValuesToTheList(data);
        }
    }

    //delete an element
    public void deleteAnElement(Object data){
        Node delete = null;
        if((delete = findElement(data)) != null){
            //delete that element
            System.out.println("Deleting element "+ delete.next.data);
            delete.next = delete.next.next;
        }
        else{
            System.out.println("Elemnt doest excist");
        }
    }

    //sorting a linked list
    public void soetLinkedList(){
        boolean sorted = false;
        //makes a temp node holder
        Node temp = new Node(null);

        while(!sorted) {
            sorted = true;
            Node start = this.root;
            while (start != null) {
                if (start.next == null) {
                    start = start.next;
                    continue;
                }
                int compair = Integer.parseInt(start.data + "") - Integer.parseInt(start.next.data + "");
                //Integer compair = (start.data) - (start.next.data);
                if (compair > 0) {
                    sorted = false;
                    temp.data = start.data.toString();
                    start.data = start.next.data;
                    start.next.data = temp.data;
                }
                start = start.next;
            }
        }
    }
}