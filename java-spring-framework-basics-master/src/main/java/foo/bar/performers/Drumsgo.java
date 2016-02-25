package foo.bar.performers;

import foo.bar.instruments.Instrument;

public class Drumsgo implements Performer {

    @Override
    public void perform() {
pol.play();
    }
    Instrument pol;

    public void setPol(Instrument pol) {
        this.pol = pol;
    }
}
