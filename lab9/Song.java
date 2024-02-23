

public class Song implements Comparable<Song>
{
    
    private String title, artist, album;
    private int duration, timesPlayed;

    Song (String title, String artist, String album, int duration, int timesPlayed)
    {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.timesPlayed = timesPlayed;
    }
   

    //getter

    public String getTitle()
    {
        return this.title;
    }
    public String getArtist()
    {
        return this.artist;
    }
    public String getAlbum()
    {
        return this.album;
    }
    public int getDuration()
    {
        return this.duration;
    }
    public int getTimesPlayed()
    {
        return this.timesPlayed;
    }

    //setter
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAlbum(String album)
    {
        this.album = album;
    }
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    public void setTimesPlayed(int timesPlayed)
    {
        this.timesPlayed = timesPlayed;
    }

    //methods
    @Override
    public int compareTo (final Song o)
    {
        return Integer.compare(this.duration, o.duration);
    }
    public String toString()
    {
        int minute = this.getDuration() / 60;
        int second = this.getDuration() % 60;
        String time = minute + ":" + second;
        return "\nSong name: " + this.getTitle() + "\nArtist name: " + this.getArtist() + "\nAlbum name: " + this.getAlbum() + "\nDuration: " + time + "\nTimes Played: " + this.getTimesPlayed() + "\n";
    }



}
