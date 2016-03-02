package idol.etc;

/**
 * Created by aur on 17.02.2016.
 */
public class Song implements Composition {

    public String getLirycs() {
        return lirycs;
    }

    private String lirycs = "some song lyrics";

    public void setLirycs(String lirycs) {
        this.lirycs = lirycs;
    }

    @Override
    public void recite() {
        System.out.println("singing: " + lirycs);
    }
}
