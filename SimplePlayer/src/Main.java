import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static LinkedList<Song> playlist = new LinkedList<Song>();
    private static int playListIterator = 0;
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        LinkedList<Song> cocoSongs = new LinkedList<Song>();
        cocoSongs.add(new Song("JajaJambo","1:00"));
        cocoSongs.add(new Song("BadGuy","1:00"));
        cocoSongs.add(new Song("BadBoy","1:00"));
        cocoSongs.add(new Song("GoodBoi","1:00"));
        cocoSongs.add(new Song("BetterBoi","1:00"));
        cocoSongs.add(new Song("TheBestBoi","1:00"));
        albums.add(new Album("Coco Jambo", cocoSongs));
        LinkedList<Song> ace = new LinkedList<Song>();
        ace.add(new Song("qwe","1:00"));
        ace.add(new Song("asd","1:00"));
        ace.add(new Song("zxc","1:00"));
        ace.add(new Song("wer","1:00"));
        ace.add(new Song("sdf","1:00"));

        ace.add(new Song("xcv","1:00"));
        albums.add(new Album("ace", ace));

        boolean ifQuit = false;

        printMenu();
        while(!ifQuit){
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    printPlaylist();
                    break;
                case 2:
                    printAllAlbums();
                    break;
                case 3:
                    addSong();
                    break;
                case 4:
                    nextSong();
                    break;
                case 5:
                    previousSong();
                    break;
                case 6:
                    repeatSong();
                    break;
                case 7:
                    removeSong();
                    break;
                case 8:
                    addAlbum();
                    break;
                case 9:
                    ifQuit = true;
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Winamp Alfa 0.0.0.1 Music Player");
        System.out.println("========================================");
        System.out.print("1. Show playlist\n" +
                        "2. Show music library\n" +
                        "3. Add song to playlist\n" +
                        "4. Play next song\n" +
                        "5. Play previous song\n" +
                        "6. Repeat current song\n" +
                        "7. Remove current song from playlist\n" +
                        "8. Add new album with music\n" +
                        "9. Quit\n" +
                        "========================================\n\n");
    }

    private static void printPlaylist(){
        if(!playlist.isEmpty()) {
            System.out.println("Your playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.print("\t #" + (i+1)+ " ");
                if (i == playListIterator) {
                    System.out.print(" *Currently playing* ");
                }
                System.out.println("\"" + playlist.get(i).getName() +
                        "\" duration: " + playlist.get(i).getDuration());
            }
            System.out.println("===============================\n\n");
        }
        else{
            System.out.println("Playlist is empty!");
        }
    }


    private static void printAllAlbums(){
        System.out.println("Albums in library:");
        for (int i = 0; i < albums.size(); i++){
            Album item = albums.get(i);
            System.out.println("#" + (i+1) + " album: " + item.getName());
            item.listSongs();
        }
    }

    private static void addSong(){
        System.out.println("Enter album name: ");
        String albumName = input.nextLine();

        if(!albumName.equals("")) {

            System.out.println("Enter song name: ");
            String songName = input.nextLine();

            if(!songName.equals("")) {
                Album album = searchAlbum(albumName);

                if (album != null) {
                    Song song = album.getSong(songName);

                    if(song != null){
                        playlist.add(song);
                        System.out.println("Song added");
                    }
                    else{
                        System.out.println("Song not found");
                        return;
                    }
                }
                else {
                    System.out.println("Cannot found album");
                }
            }
        }
        else {
            System.out.println("Invalid data");
        }
    }

    private static void nextSong(){
        if(!playlist.isEmpty()) {
            if(playListIterator >= 0 && playListIterator < (playlist.size()-1)){
                playListIterator++;
                System.out.println("Now playing " + playlist.get(playListIterator).getName() + ", duration: " + playlist.get(playListIterator).getDuration());
            }
            else{
                System.out.println("Next song doesn't exist");
            }
        }else {
            System.out.println("Playlist is empty!");
        }
    }

    private static void previousSong(){
        if(!playlist.isEmpty()) {
            if (playListIterator > 0 && playListIterator < playlist.size()) {
                playListIterator--;
                System.out.println("Now playing " + playlist.get(playListIterator).getName() + ", duration: " + playlist.get(playListIterator).getDuration());
            } else {
                System.out.println("This is first song in playlist");
            }
        }else {
            System.out.println("Playlist is empty!");
        }
    }

    private static void repeatSong(){
        if(!playlist.isEmpty()){
            if(playListIterator >= 0 && playListIterator < playlist.size()){
                playlist.add(playListIterator, playlist.get(playListIterator));
            }
            else {
                System.out.println("Iterator out of bound");
            }
        }
        else{
            System.out.println("Playlist is empty");
        }
    }

    private static void removeSong(){
        if(!playlist.isEmpty()){
            if(playListIterator >= 0 && playListIterator < playlist.size()){
                playlist.remove(playListIterator);
                System.out.println("Removed song from playlist");
            }
            else {
                System.out.println("Iterator out of bound");
            }
        }
        else{
            System.out.println("Playlist is empty");
        }
    }


    private static void addAlbum(){
        System.out.println("Enter name of new album:");
        String albumName = input.nextLine();
        if(albumName != null && !albumName.equals("")){
            System.out.println("Enter how many songs it have (must have more than 0):");
            int count = input.nextInt();
            input.nextLine();
            if(count > 0){
                LinkedList<Song> songs = new LinkedList<Song>();
                System.out.println("Enter songs name and duration (duration format HH:MM:SS)");
                for(int i = 1; i <= count; i++){
                    System.out.println("Song #" + i + " title:");
                    String songName = input.nextLine();
                    System.out.println("Duration:");
                    String songDuration = input.nextLine();
                    songs.add(new Song(songName, songDuration));
                }
                albums.add(new Album(albumName, songs));
            }
            else{
                System.out.println("Can't add album with 0 or less songs :) try again");
            }
        }
        else{
            System.out.println("Entered invalid data");
        }
    }

    private static Album searchAlbum(String name){
        for( Album item : albums){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }




























}












//        1. song class
//            -Title
//            -duration
//        2. album class
//            - song list
//            - retrieving song and returning
//        3. ArrayList of albums
//            - retrieving of songs from albums
//        4. playlist for songs
//            - addAtEnd
//            - repeat
//            - remove current song
//        5. menu
//            - add album
//            - add songs to album
//            - add song from album to playlist
//            - if playlist not empty:
//                - repeat song
//                - skip forward
//                - skip backward
//                - remove current song
//                - quit
//            - quit
