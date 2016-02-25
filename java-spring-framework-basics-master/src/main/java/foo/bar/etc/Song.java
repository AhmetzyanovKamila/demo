package foo.bar.etc;


public class Song implements Composition {

    public String getLirycs() {
        return lirycs;
    }

    private String lirycs ;

    public void setLirycs(String lirycs) {
        this.lirycs = lirycs;
    }

    @Override
    public void recite() {
        System.out.println("singing: " + lirycs);
    }
}
