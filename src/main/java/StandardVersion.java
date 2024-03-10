import models.*;

import java.util.ArrayList;


public class StandardVersion {
    public static void main(String[] args) {
        MovieLibrary library = new MovieLibrary(new ArrayList<>() {{
            add(new Movie(
                    "The Shawshank Redemption",
                    1945,
                    Genre.DRAMA,
                    new Director("Frank", "Darabont"),
                    new ArrayList<>() {{
                        add(new Actor("Tim", "Robbins"));
                        add(new Actor("Morgan", "Freeman"));
                        add(new Actor("Bob", "Gunton"));
                    }}));
            add(new Movie(
                    "Seven",
                    1946,
                    Genre.THRILLER,
                    new Director("David", "Fincher"),
                    new ArrayList<>() {{
                        add(new Actor("Morgan", "Freeman"));
                        add(new Actor("Brad", "Pitt"));
                        add(new Actor("Gwyneth", "Paltrow"));
                    }}));
        }});

        System.out.println(library);
    }
}
