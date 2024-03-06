import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorclass {
    private LinkedList<String> listOfNames;
    public ListIteratorclass(){
        listOfNames = new LinkedList<>();
        createTheList();
        iteratorList();
    }

    private void createTheList(){
        listOfNames.add("sonny");
        listOfNames.add("jaz");
        listOfNames.add("jules");
        listOfNames.add("rony");
        listOfNames.add("marco");
    }
    //listIterator
    public void iteratorList(){
        ListIterator<String> i = listOfNames.listIterator();
        System.out.println(i.next());
        System.out.println(i.previous());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.previous());
        i.previous();i.previous();i.previous();i.previous();
        System.out.println(i.next());i.previous();
        System.out.println("================================");
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    public void printTheResult(){
        System.out.println(listOfNames);
    }


    public void addAName(String name){
        listOfNames.add(1,name);
    }

    public void addANameAfterAName(String nameat){
        int pos = listOfNames.indexOf(nameat);
        listOfNames.add(pos + 1,"added");
    }
}
