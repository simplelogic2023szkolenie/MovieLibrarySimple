import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.MovieLibrary;

import java.io.File;
import java.io.IOException;

public class JsonVersion {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        MovieLibrary movieLibrary = objectMapper.readValue(new File("src/main/resources/movies.json"), MovieLibrary.class);

        System.out.println(movieLibrary);
    }
}
