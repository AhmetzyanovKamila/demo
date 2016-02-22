package foo.bar.performers;

import foo.bar.instruments.Instrument;

import java.util.Collection;


public class OneManBand implements Performer {

    Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments){
            instrument.play();
        }
    }
}
