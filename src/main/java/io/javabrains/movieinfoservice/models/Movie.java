package io.javabrains.movieinfoservice.models;

public class Movie {

    private String Title;
    private String Plot;
    private String Year;
    private String Genre;
    private String Director;
    private String Actors;

    public Movie(String title, String plot, String year, String genre, String director, String actors) {
        Title = title;
        Plot = plot;
        Year = year;
        Genre = genre;
        Director = director;
        Actors = actors;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }
}
