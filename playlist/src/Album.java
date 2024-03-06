import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//class that holds a linked list of songs
public class Album {
    ArrayList<Song> albums;
    Scanner ob;
    boolean option,front,back;
    public Album(){
        albums = new ArrayList<>();
        ob = new Scanner(System.in);
        option = false;
        front = false;
        back = false;
    }
    public boolean addASongAndDuration(String songName, int duration){
        return album(songName,duration);
    }

    //now add all songs and there durations in the list
    private boolean album(String songName, int duration) {
        //logic to add to array
        if (!(songName == null || duration <= 0)) {
            if (albums.add(new Song(songName, duration))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void displayAlbum(){
        System.out.println(albums);
    }

    public void forwardOrBackwards(){
        iteratorOfSongs();
    }

    private boolean iteratorOfSongs(){
        ListIterator<Song> iterator = albums.listIterator();
        while(iterator.hasNext()){
            while(true) {
                System.out.println("Forward or backwards or type anything else to exit");
                //ob.next();
                char res = ob.next().toLowerCase().charAt(0);
                if (res == 'f' || res == 'b') {
                    option = (res == 'f') || !(res == 'b') ? true : false;
                } else {
                    System.out.println("wrong option");
                    return true;
                }
                if (option) {
                    if(back){
                        iterator.next();
                        back = false;
                    }
                    System.out.print("Now playing :");
                    System.out.println(iterator.next());
                    front = true;
                    if(!iterator.hasNext()){
                        System.out.print("End of the list ->:");
                        iterator.previous();
                        front = false;
                        continue;
                    }
                    continue;
                } else {
                    if(front){
                        iterator.previous();
                        front = false;
                    }
                    System.out.print("Now playing :");
                    System.out.println(iterator.previous());
                    back = true;
                    if(!iterator.hasPrevious()){
                        System.out.print(":<- End of the list");
                        iterator.next();
                        back = false;
                        continue;
                    }
                    continue;
                }
            }
        }
        System.out.println("list Null");
        return false;
    }
}
