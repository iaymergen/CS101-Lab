//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicApp 
{
    public static void main(String[] args) 
    {
        int choice;
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Music App! Get Ready to create your playlist!");
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("1 - Create a new Playlist");
        System.out.println("2 - Display the Playlist");
        System.out.println("3 - Sort the Playlist");
        System.out.println("4 - Remove song by index from the current Playlist");
        System.out.println("5 - Display all Playlists");
        System.out.println("6 - Exit");
        choice = in.nextInt();
        
        
        String title, artist, album;
        int duration, timesPlayed;
        // ArrayList<Song> songs = new ArrayList<Song>();
        Playlist playlist = new Playlist();
        Playlist playlistNew = new Playlist();
        ArrayList<Playlist> playlists = new ArrayList<Playlist>();
    
        do
        {
            
            int i;
            if(choice == 1)
            {
                ArrayList<Song> songList = new ArrayList<Song>();
                System.out.println("How many songs do you want to add to playlist?:");
                int songNumber = in.nextInt();
                for(i = 1; i <= songNumber; i++)
                {
                    System.out.println("Enter artist name for Song " + i);
                    artist = in.next();
                    System.out.println("Enter album name for Song " + i);
                    album = in.next();
                    System.out.println("Enter song name for Song " + i);
                    title = in.next();
                    System.out.println("Enter song duration in seconds for Song " + i);
                    duration = in.nextInt();
                    System.out.println("Enter the times song has been played for Song " + i);
                    timesPlayed = in.nextInt();
                    Song  newSong  = new Song(title, artist, album, duration, timesPlayed);
                    //songList[i-1] = newSong;
                    songList.add(newSong);
                    //playlist.addSong(songList[i-1]);
                    
                    
                    
                }
            
                System.out.println("Enter playlist name: ");
                String name = in.next();
                System.out.println("Enter creator of playlist: ");
                String creator = in.next();


                System.out.printf("0-Country%n1-Electronic%n%n2-Pop Music%n3-Rock Music%n4-Jazz%n5-Classical%nSelect genre of playlist :%n");
                int playlistGenre = in.nextInt();
                in.nextLine();
                String[] genreList = new String[6];
                genreList[0] = "country";
                genreList[1] = "electronic";
                genreList[2] = "pop music";
                genreList[3] = "rock music";
                genreList[4] = "jazz";
                genreList[5] = "classical";
                String genre = genreList[playlistGenre];
                Playlist playlist1 = new Playlist(name, creator, genre, songList);
                System.out.println(playlist1);
                playlists.add(playlist);
            }

        if(choice == 2)
        {
            
            //System.out.println(playlist);
            //System.out.println(playlists.get(index).size()-1);
            //System.out.println(playlist);
            int z = playlists.size();
            Playlist playlist2 = playlists.get(z-1);
            System.out.println("Displaying the playlist: " + playlist2.getName());
            System.out.println("--------------------------------------------------------");
            System.out.println(playlist2);
        }

        if(choice == 3)
        {
            
            playlist.sortByDurationDesc();
            System.out.println(playlist);
        }
        if(choice == 4)
        {
            System.out.println("Which song do you want to remove? (Remove by index)");
            playlist.removeSong(in.nextInt());
        }
        if(choice == 5)
        {
            
                System.out.println("How many songs do you want to add to playlist?:");
                int songNumber = in.nextInt();
                for(i = 1; i <= songNumber; i++)
                {
                    System.out.println("Enter artist name for Song " + i);
                    artist = in.next();
                    System.out.println("Enter album name for Song " + i);
                    album = in.next();
                    System.out.println("Enter song name for Song " + i);
                    title = in.next();
                    System.out.println("Enter song duration in seconds for Song " + i);
                    duration = in.nextInt();
                    System.out.println("Enter the times song has been played for Song " + i);
                    timesPlayed = in.nextInt();
                    Song songList[] = new Song[songNumber];
                
                    Song  newSong  = new Song(title, artist, album, duration, timesPlayed);
                    songList[i-1] = newSong;
                    playlistNew.addSong(songList[i-1]);
                }
            
                System.out.println("Enter playlist name: ");
                playlistNew.setName(in.next());
                System.out.println("Enter creator of playlist: ");
                playlistNew.setCreator(in.next());


                System.out.printf("0-Country%n1-Electronic%n%n2-Pop Music%n3-Rock Music%n4-Jazz%n5-Classical%nSelect genre of playlist :%n");
                int playlistGenre = in.nextInt();
                String[] genreList = new String[6];
                genreList[0] = "country";
                genreList[1] = "electronic";
                genreList[2] = "pop music";
                genreList[3] = "rock music";
                genreList[4] = "jazz";
                genreList[5] = "classical";
                playlistNew.setGenre(genreList[playlistGenre]);
                playlists.add(playlistNew);
                System.out.println("All playlists:");
                System.out.println();
                System.out.println("--------------------------------------------------------");
                System.out.println(playlists);
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("1 - Create a new Playlist");
        System.out.println("2 - Display the Playlist");
        System.out.println("3 - Sort the Playlist");
        System.out.println("4 - Remove song by index from the current Playlist");
        System.out.println("5 - Display all Playlists");
        System.out.println("6 - Exit");
        choice = in.nextInt();

        }while(choice != 6);
        in.close();
   
    } 
}

