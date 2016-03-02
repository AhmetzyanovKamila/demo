package idol;


import idol.etc.Poem;
import idol.instruments.Bass;
import idol.instruments.Drums;
import idol.instruments.Guitar;
import idol.instruments.Instrument;
import idol.performers.Juggler;
import idol.performers.OneManBand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;

@Configuration
public class AppContext {

    @Bean
    public class OneManBand d(){
        idol.performers.OneManBand d=new idol.performers.OneManBand();
        ArrayList<String> instrum=new   ArrayList<String>();
         instrum.add("guitar");
        instrum.add("idol.instruments.Bass");
        instrum.add("idol.instruments.Drums");
        d.setInstruments(instrum);
        return this.getObject(OneManBand.class, d);
    }

@Bean
public class OneManBandWithMap none(){
        OneManBandWithMap none=new OneManBandWithMap();
        none.setInstruments(instruments);
    }


    @Bean
    public class OneManBandWithMap m(){
        OneManBandWithMap m=new OneManBandWithMap();
        HashMap instruments=new  HashMap();
        instruments.remove("guitar");
        instruments.remove("bass");
        instruments.remove("drums");
        m.setInstruments(instruments);

    }

    @Bean
  public class SongSelector song_selector(){
        SongSelector song_selector=new SongSelector();
        ArrayList<String> songs=new ArrayList<String>();
        songs.add("idol.etc.Song");
    }

    @Bean
public Guitar guitar(){
        return new Guitar();
    }

    @Bean
    public Bass bass(){
        return new Bass();
    }

    @Bean
    public Drums drums(){
        return new Drums();
    }




}

