package idol.performers;

import idol.etc.Song;

/**
 * Created by aur on 17.02.2016.
 */
public class Vocalist implements Performer {

    Song song;

    public Vocalist() {
    }

    public Vocalist(Song song) {
        this.song = song;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public void perform() {
        song.recite();
    }

}
