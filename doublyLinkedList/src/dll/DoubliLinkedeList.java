package dll;

import java.util.Scanner;

public class DoubliLinkedeList {
    private Node head;
    private Scanner ob;
    public DoubliLinkedeList(){
        ob = new Scanner(System.in);
    }

    private class Node{
        private Node forward;
        private Node backwards;
        private String data;

        Node(){
            this.data = null;
            this.forward = null;
            this.backwards = null;
        }
    }
    public void displayAll(){
        Node travel = this.head;
        while(travel != null){
            System.out.print(travel.data);
            travel = travel.forward;
        }
        System.out.print(" ");
    }

    public void movement(){
        Node traveler = this.head;
            while (traveler != null) {
                boolean input = ob.nextBoolean();
                if (input) {
                    //foreard
                    System.out.println(traveler.data);
                    traveler = traveler.forward;

                } else {
                    //backwards
                    System.out.println(traveler.data);
                    traveler = traveler.backwards;
                }
            }
    }

    //now make a method to store data to a node

    public void createANode(String value){
        //object of a node
        Node node = new Node();
        node.data = value;
        Node travel = this.head;
        if(travel == null){
            this.head= node;
        }
        else {
            while (travel.forward != null) {
                travel = travel.forward;
            }
            travel.forward = node;
            node.backwards = travel;
        }
    }
}
