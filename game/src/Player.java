import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name,weapon;
    private int hitPoints,strength;

    public Player(String name,int hitPoints, int strength){
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    //add eleven methods
    @Override
    public List<String> write(){
        List addedItems = new ArrayList();
        addedItems.add(0,this.name);
        addedItems.add(1,this.weapon);
        addedItems.add(2,""+this.hitPoints);
        addedItems.add(3,String.valueOf(this.strength));
        return addedItems;
    }
    @Override
    public void read(List<String> fieldData){
        if(fieldData != null && fieldData.size() > 0){
            this.name = fieldData.get(0);
            this.weapon= fieldData.get(1);
            this.hitPoints= Integer.parseInt(fieldData.get(2));
            this.strength = Integer.parseInt(fieldData.get(3));
        }
    }
    //getters
    public String getName() {
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getHitPoints(){
        return  hitPoints;
    }
    public int getStrength(){
        return strength;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

    @Override
    public String toString(){
        return "name "+name+
                " weapon "+weapon+
                " hitpoints "+hitPoints+
                " strength "+strength;
    }
}
