package dll;

public class Main {
    public static void main(String[] args){
        //main call
        DoubliLinkedeList doubliLinkedeList = new DoubliLinkedeList();
        doubliLinkedeList.createANode("hello");
        doubliLinkedeList.createANode(" my");
        doubliLinkedeList.createANode(" name");
        doubliLinkedeList.createANode(" is");
        doubliLinkedeList.createANode(" Mathew");

        doubliLinkedeList.displayAll();
        doubliLinkedeList.movement();
    }
}
