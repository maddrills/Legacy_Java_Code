package compair1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRecord implements Comparable<StudentRecord>{
    String name;
    int rollNumber;
    String address;

    public StudentRecord(String name,int rollNumber,String address){
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }
    @Override
    public String toString(){
        return "name " + name + " roll " +rollNumber + " address " + address;
    }
    public static void main(String[] args){
        //for simplicity’s sake
        List<StudentRecord> ob = new ArrayList<>();

        ob.add(new StudentRecord("Mat",456,"drdo"));
        ob.add(new StudentRecord("Geo",678,"abet"));
        ob.add(new StudentRecord("Vio",234,"banshanks"));
        ob.add(new StudentRecord("Tess", 123,"bregade"));
        ob.add(new StudentRecord("frn",21,"drdo"));
        ob.add(new StudentRecord("dcv",843,"abet"));
        ob.add(new StudentRecord("bnm",22,"banshanks"));
        ob.add(new StudentRecord("qaz", 1,"bregade"));

        Comparator obj = (o1, o2) -> {
            if((((StudentRecord)o1).rollNumber > ((StudentRecord)o2).rollNumber)){
                return 1;
            }
            else {
                return -1;
            }
        };

        //Collections.sort(ob);

        Collections.sort(ob,obj);

        for(StudentRecord i : ob){
            System.out.println(i);
        }
    }

    @Override
    public int compareTo(StudentRecord o) {
        return  this.rollNumber -((o.rollNumber));
    }
}
