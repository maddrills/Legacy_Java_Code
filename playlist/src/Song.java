public class Song {
    String songName;
    int duration;
    public Song(String songName,int duration){
        this.songName = songName;
        this.duration = duration;
    }
    public Song(){
        this(null,0);
    }

    @Override
    public String toString(){
        return " Name:"+songName+" Time:"+duration+"min";
    }
}
