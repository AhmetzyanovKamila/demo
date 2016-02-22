package foo.bar;


public class Poem {

//    public void Poem() {
//    }

    String txtPoem;

    public void recite() {
        System.out.println(txtPoem);
    }

    public Poem(String txtPoem) {
        this.txtPoem = txtPoem;
    }
}
