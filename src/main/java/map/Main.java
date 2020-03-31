package map;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://country.io/names.json");
        Reader reader = new InputStreamReader(url.openStream());
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        Map<String, String> map = new Gson().fromJson(reader, type);
        System.out.println(map);
    }

}