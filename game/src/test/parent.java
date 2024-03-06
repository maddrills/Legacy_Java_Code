package test;

public class parent {
    int num;
    String name;

    public parent(int num, String name){
        this.num = num;
        this.name = name;
    }
    @Override
    public String toString(){
        return "number "+num+" Name "+name;
    }
}
