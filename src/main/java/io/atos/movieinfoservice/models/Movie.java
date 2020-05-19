package io.atos.movieinfoservice.models;

/**
 * @author Mohamed El Kawakibi
 * @author Puck School
 */
public class Movie {

    private String Title;
    private String Plot;
    private String Year;
    private String Genre;
    private String Director;
    private String Actors;
    private String Poster;

    public Movie() { }

    /** Gets the title of the movie
     * @return A String representing the movie title
     */
    public String getTitle() {
        return Title;
    }

    /** Gets the plot description of the movie
     * @return A String representing the movie plot
     */
    public String getPlot() {
        return Plot;
    }

    /** Gets the poster url of the movie
     * @return A String representing the movie poster url
     */
    public String getPoster() {
        return Poster;
    }

    /** Gets the publish year of the movie
     * @return A String representing the publish year of the movie
     */
    public String getYear() {
        return Year;
    }

    /** Gets the genre of the movie
     * @return A String representing the movie genre
     */
    public String getGenre() {
        return Genre;
    }

    /** Gets the director of the movie
     * @return A String representing the movie director
     */
    public String getDirector() {
        return Director;
    }

    /** Gets the actors of the movie
     * @return A String representing all the movie actors
     */
    public String getActors() {
        return Actors;
    }

}
