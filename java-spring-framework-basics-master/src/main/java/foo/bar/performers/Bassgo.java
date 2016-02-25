package foo.bar.performers;


import foo.bar.instruments.Instrument;

public class Bassgo implements Performer {

    public void setLol(Instrument lol) {
        this.lol = lol;
    }

    @Override

    public void perform() {
        lol.play();
    }
    Instrument lol;

}
