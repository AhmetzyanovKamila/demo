package foo.bar.etc;


public class Poem {

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
