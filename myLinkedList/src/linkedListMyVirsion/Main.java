package linkedListMyVirsion;

public class Main {
    //LinkedListByMe ob = new LinkedListByMe();
    public static void main(String[] args){
        LinkedListByMe linkedListByMe = new LinkedListByMe();
        linkedListByMe.addValuesToTheList(Integer.valueOf(5));
        linkedListByMe.addValuesToTheList(Integer.valueOf(2));
        linkedListByMe.addValuesToTheList(Integer.valueOf(1));
        linkedListByMe.addValuesToTheList(Integer.valueOf(10));
        linkedListByMe.addValuesToTheList(Integer.valueOf(3));
        linkedListByMe.addValuesToTheList(Integer.valueOf(12));

        linkedListByMe.print();
        linkedListByMe.findElementByKey(Integer.valueOf(10));
        linkedListByMe.findElementByKey(Integer.valueOf(22));
        linkedListByMe.findElementByKey(Integer.valueOf(12));
        linkedListByMe.insertAnElement(2,1000);
        linkedListByMe.print();
        linkedListByMe.insertAnElement(50,1000);
        linkedListByMe.print();
        linkedListByMe.deleteAnElement(2);
        linkedListByMe.print();
        System.out.println("comp");
        linkedListByMe.soetLinkedList();
        System.out.println("comp");
        linkedListByMe.print();
        System.out.println("end");
    }
}
