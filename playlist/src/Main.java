import java.util.Scanner;

public class Main {

    static Scanner ob = new Scanner(System.in);
    static Album album = new Album();
    public static void main(String[] args){
        //here is where the album will be created
        String songName;
        int duration,choice;

        while(true){
            try{System.out.println("Enter a chose 1 or 2 or 3 or 4");
                choice = ob.nextInt();}catch (Exception e){
                continue;
            }

            switch (choice){
                case 1:
                    //do some
                    addaSong();
                    continue;
                case 2:
                    album.displayAlbum();
                    continue;
                case 3:
                    album.forwardOrBackwards();
                    continue;
                case 4:
                    break;
                default:
                    continue;
            }
            break;
        }
    }


    static void addaSong() {
/*        System.out.println("Enter song name");
        ob.nextLine();
        String songName = ob.nextLine();
        System.out.println("enter the duration");
        int duration = ob.nextInt();

        if (album.addASongAndDuration(songName, duration)) {
            System.out.println("Song: " + songName + " of duration " + duration + " added");
        } else {
            System.out.println("Could not add name because Name is " + songName + " and or duration is " + duration);
        }*/
        album.addASongAndDuration("mat",4);
        album.addASongAndDuration("geo",2);
        album.addASongAndDuration("vio",1);
        album.addASongAndDuration("dad",6);

    }
}
