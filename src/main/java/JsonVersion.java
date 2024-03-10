import helpers.JsonHelper;
import models.MovieLibrary;

import java.io.IOException;

public class JsonVersion {
    public static void main(String[] args) throws IOException {
        MovieLibrary movieLibrary = new JsonHelper().deserializeJson("src/main/resources/movies.json", MovieLibrary.class);

        System.out.println(movieLibrary);
    }
}
