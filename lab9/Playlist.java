import java.util.ArrayList;
import java.util.Collections;



public class Playlist 
{
    private String name, creator, genre;
    private ArrayList<Song> songs = new ArrayList<Song>();
    

    Playlist()
    {}

    Playlist(String name, String creator, String genre, ArrayList<Song> songs)
    {
        this.name = name;
        this.creator = creator;
        this.genre = genre;
        this.songs = songs;
    }

    //getter
    public String getName()
    {
        return this.name;
    }
    public String getCreator()
    {
        return this.creator;
    }
    public String getGenre()
    {
        return this.genre;
    }
    public ArrayList<Song> getSongs()
    {
        return this.songs;

    }
    //setter 
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    public void setCreator(String creator)
    {
        this.creator = creator;
    }
    public void setSongs(ArrayList<Song> songs)
    {
        this.songs = songs;
    }


    //methods
    public boolean songExists(Song song)
    {
        if(songs.contains(song))
        { 
            return true;
        }
        else
        { 
            return false;
        }
    }
    public void addSong(Song song)
    {
        if(songExists(song) == false)
        {
            songs.add(song);
        }
        else
        {}
    }
    public void removeSong (int index)
    {
        songs.remove(index);
    }
    public void sortByDurationDesc()
    {
        Collections.sort(songs);
        Collections.reverse(songs);
    }
    public String toString()
    {
        return "------------------------" + "\nPlaylist Name: " + this.getName() 
        + "\nCreator Name: " + this.getCreator() 
        + "\nGenre: " + this.getGenre() 
        + "\n------------------------" 
        + this.getSongs();
    }

    
}
