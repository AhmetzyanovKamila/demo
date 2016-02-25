package foo.bar.performers;


import foo.bar.instruments.Instrument;

public class Guitargo implements Performer {
    @Override
    public void perform() {
        tol.play();
    }
    Instrument tol;

    public void setTol(Instrument tol) {
        this.tol = tol;
    }
}
