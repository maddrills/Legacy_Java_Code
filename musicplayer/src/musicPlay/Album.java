package musicPlay;

//inner class having
public class Album {
    //music player class must have a song class
    Album.Song song;
    //ArrayList of songs
    public Album(int duration, String name){
        song = new Song(duration,name);
    }
    public  Album(){
        this(0,null);
    }

    private class Song{
        private int duration;
        private String name;

        public Song(int duration, String name){
            this.duration = duration;
            this.name = name;
        }

        //getters for duration and name
        public int getDuration(){
            return this.duration;
        }

        public String getName(){
            return this.name;
        }
    }



}
