import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private LinkedList<Song> Songs;

    public Album(String name, LinkedList<Song> Songs){
        this.name = name;
        this.Songs = Songs;
    }

    public String getName() {
        return name;
    }

    public Song getSong(String name) {
        Song searchedSong = searchSong(name);
        if(searchedSong != null){
            System.out.println("Song " + name + " found in album " + this.name);
            return searchedSong;
        }
        return null;
    }

    private Song searchSong (String name){
        if(!Songs.isEmpty()){
            ListIterator<Song> i = Songs.listIterator();
            while(i.hasNext()){
                if(i.next().getName().equals(name)){
                    return i.previous();
                }
            }
        }
        return null;
    }

}
