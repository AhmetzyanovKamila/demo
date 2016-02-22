package foo.bar.performers;

import foo.bar.instruments.Instrument;

import java.util.Map;

/**
 * Created by aur on 15.02.2016.
 */
public class OneManBandWithMap implements Performer {

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
