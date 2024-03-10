package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Person {
    // @JsonProperty("nazwaKluczaWJson")
    // ta adnotacja jest przydatna kiedy w kluczu JSON mamy znaki
    // których nie możemy użyć jako nazwa pola klasy w javie
    // czyli np "-". wtedy używamy adnotacji nad polem klasy i bilbioteka
    // json jackson bedzie deserializować JSONa nie biorąc pod uwagę nazwy pola
    // ale customową nazwę podaną w @JsonProperty
    @JsonProperty("first-name")
    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
