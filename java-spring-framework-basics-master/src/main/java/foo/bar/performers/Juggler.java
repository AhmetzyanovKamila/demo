package foo.bar.performers;

import foo.bar.etc.Poem;

public class Juggler implements Performer {

    private int countOfBeanbags;
    private Poem poem = null;

    public Juggler(){}

    public Juggler(int countOfBeanbags){
        this.countOfBeanbags = countOfBeanbags;
    }

    public Juggler(int countOfBeanbags, Poem poem){
        this.countOfBeanbags = countOfBeanbags;
        this.poem = poem;
    }

    public void perform(){
        System.out.println("juggling with " + countOfBeanbags + " beanbags");
        poem.recite();
    }

    public int getCountOfBeanbags() {
        return countOfBeanbags;
    }

    public void setCountOfBeanbags(int countOfBeanbags) {
        this.countOfBeanbags = countOfBeanbags;
    }

    public Poem getPoem() {
        return poem;
    }

    public void setPoem(Poem poem) {
        this.poem = poem;
    }
}
