package album;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Album album = new Album();
        album.setArtist("Porcupine Tree");
        album.setTitle("Fear of a Blank Planet");
        album.setYear(2007);

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Fear of a Blank Planet", 448));
        tracks.add(new Track("My Ashes",  307));
        tracks.add(new Track("Anesthetize", 1062));
        tracks.add(new Track("Sentimental", 326));
        tracks.add(new Track("Way Out of Here", 457));
        tracks.add(new Track("Sleep Together", 448));
        album.setTracks(tracks);

        String json = gson.toJson(album);
        System.out.println(json);
        System.out.println(gson.fromJson(json, Album.class));
    }

}