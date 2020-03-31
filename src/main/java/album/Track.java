package album;

@lombok.Data
public class Track {

    private String title;
    private int length;

    public Track() {}

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

}