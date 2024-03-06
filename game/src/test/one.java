package test;

public class one extends parent{
    int number;
    public one(int num, String name,int number) {
        super(num, name);
        this.number = number;
    }
    @Override
    public String toString(){
        return " Name "+name+" Number "+number;
    }
}
