package typeadapter;

import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        String s1 = new Gson().toJson(LocalDate.now());
        System.out.println(s1);
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
        String s2 = gson.toJson(LocalDate.now());
        System.out.println(s2);
    }

}