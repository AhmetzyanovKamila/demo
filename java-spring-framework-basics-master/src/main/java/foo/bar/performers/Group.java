package foo.bar.performers;
//название иблаблабал

import foo.bar.etc.Song;

import java.util.List;

public class Group implements Performer{
    String name;
    List<Performer> people;
    List<Song>  songs;

    public void setPeople(List<Performer> people) {
        this.people = people;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void perform() {
        System.out.println(name);
        for (Song song:songs) {
            System.out.println(song);
            for (Performer performer : people) {
                performer.perform();
            }
        }
    }
}
