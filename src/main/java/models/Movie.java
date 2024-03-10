package models;

import java.util.ArrayList;

public class Movie {
    private String title;
    private int year;
    private Director director;
    private ArrayList<Actor> actors;
    private Genre genre;

    public Movie() {

    }

    public Movie(String title, int year, Genre genre, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.actors = actors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie:" +
                "\r\n   Title - " + title +
                "\r\n   year - " + year +
                "\r\n   Director - " + director +
                "\r\n   Genre - " + genre.toString().toLowerCase() +
                "\r\n   Actors - " + actors +
                "\r\n";
    }
}
