
package myproject;

/**
 *
 * @author Andrew
 */
public class Game {
    private int id;
    private int releaseYear;
    private double cost;
    private String title;
    private String rating;

    public Game() {
    
    }
    
    public Game(int id, int releaseYear, double cost, String title, String rating) {
        this.id = id;
        this.releaseYear = releaseYear;
        this.cost = cost;
        this.title = title;
        this.rating = rating;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
        
    @Override
    public String toString() {
        //return String.format("id = %d, Title =  %s, Release Year = %d, Price = %.2f, Rating = %s", id, title, releaseYear, cost, rating);
        return String.format("%5d %s %5d %5.2f %s", id, title, releaseYear, cost, rating);
    }
    
        
}
