import java.util.ArrayList;
import java.util.Scanner;


public class MusicApp_RevWed 
{
    public static void main(String[] args)
    {
    int choice;
    boolean open = true;
    System.out.println("--------------------------------------------------------");
    System.out.println("Welcome to Music App! Get Ready to create your playlist!");
    Scanner in = new Scanner(System.in);
    System.out.println("--------------------------------------------------------");
    ArrayList<String> username = new ArrayList<String>();
    ArrayList<String> password = new ArrayList<String>();
    
    //create a user
    System.out.println("Create a new user.How many users do you want to create?");
    int userCount = in.nextInt();
    
    for(int u = 0; u<userCount; u++)
    {
        System.out.println("Enter username:");
        username.add(in.next()); 
        System.out.println("Enter password:");
        password.add(in.next());
    }
    
    System.out.println("New user creation successful. Continue to login.");
    do
    {
        //login
        System.out.println("Enter username:");
        String loginName = in.next();
        System.out.println("Enter password:");
        String loginPassword = in.next();
    if(username.contains(loginName) && password.contains(loginPassword))
    {
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Music App! Get Ready to create your playlist!");
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
        ArrayList<Playlist> playlists = new ArrayList<Playlist>();
    
        do
        {
            int i;
            if(choice == 1)
            {
                ArrayList<Song> songList = new ArrayList<Song>();
                System.out.println("How many songs do you want to add to playlist?:");
                int songNumber = in.nextInt();
                in.nextLine();
                for(i = 1; i <= songNumber; i++)
                {
                    System.out.println("Enter artist name for Song " + i);
                    artist = in.nextLine();
                    System.out.println("Enter album name for Song " + i);
                    album = in.nextLine();
                    System.out.println("Enter song name for Song " + i);
                    title = in.nextLine();
                    System.out.println("Enter song duration in seconds for Song " + i);
                    duration = in.nextInt();
                    System.out.println("Enter the times song has been played for Song " + i);
                    timesPlayed = in.nextInt();
                    in.nextLine();
                    Song  newSong  = new Song(title, artist, album, duration, timesPlayed);
                    songList.add(newSong);
                }
            
                System.out.println("Enter playlist name: ");
                String name = in.next();
                System.out.println("Enter creator of playlist: ");
                String creator = in.next();
                System.out.printf("0-Country%n1-Electronic%n2-Pop Music%n3-Rock Music%n4-Jazz%n5-Classical%nSelect genre of playlist :%n");
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
                playlists.add(playlist1);
            }

        if(choice == 2)
        {
            int z = playlists.size();
            Playlist playlist2 = playlists.get(z-1);
            System.out.println("Displaying the playlist: " + playlist2.getName());
            System.out.println("--------------------------------------------------------");
            System.out.println(playlist2);
        }

        if(choice == 3)
        {
            
            int z = playlists.size();
            Playlist playlist2 = playlists.get(z-1);
            playlist2.sortByDurationDesc();
            System.out.println(playlist2);
        }
        if(choice == 4)
        {
            int z = playlists.size();
            Playlist playlist2 = playlists.get(z-1);
            System.out.println("Which song do you want to remove? (Remove by index)");
            playlist2.removeSong(in.nextInt());
            System.out.println(playlist2);
        }
        if(choice == 5)
        {
            System.out.println("All playlists:");
            System.out.println();
            System.out.println("--------------------------------------------------------");
            System.out.println(playlists);
        }
        if(choice == 6)
        {
            open = false;
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
    else
        {
            System.out.println("User " + loginName + " does not exist.");
            System.out.println("You need to login first.");
        }
    }while(open == true);
    
    }
    
}
