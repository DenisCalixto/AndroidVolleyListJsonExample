package edu.wmdd.propertylistexample;

public class Property {

    public String summary;
    public int rating;
    public int id;

    public Property() {

    }

    public Property(String summary, int rating, int id) {
        this.summary = summary;
        this.rating = rating;
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}