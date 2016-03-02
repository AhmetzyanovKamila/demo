package idol.etc;

/**
 * Created by etc on 20.03.2015.
 */
public class Poem implements Composition {

    private String text = "some poem text";

    public Poem(){}

    public void recite(){
        System.out.println("reciting poem: " + text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
