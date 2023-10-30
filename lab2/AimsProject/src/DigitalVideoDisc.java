//Nguyen Xuan Tung - 20215162
public class DigitalVideoDisc {

    private String title;

    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor by title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Constructor by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Constructor by title, category , director, cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    // Constructor by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    //getter for title
    public String getTitle() {
        return title;
    }

    //getter for category
    public String getCategory() {
        return category;
    }

    //getter for director
    public String getDirector() {
        return director;
    }

    //getter for cost
    public float getCost() {
        return cost;
    }

    //getter for length
    public int getLength() {
        return length;
    }

}
