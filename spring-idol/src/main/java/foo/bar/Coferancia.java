package foo.bar;

import java.util.Collection;

public class Coferancia {
    public void vcall(Performer lol){
       lol.perform();
    }
    public void bvocal(Collection <Performer> collection){
        for (Performer performer: collection){
            performer.perform();
        }
    }
}

