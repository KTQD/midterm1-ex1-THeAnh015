class Book extends Item {
    private String author;
    private int numberOfPages;
    private String genre;

    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    void showInfo() {
        System.out.println("Book - Name: " + name + ", Description: " + getDescription() + ", ID: " + ID + ", Price: " + price + ", Author: " + author + ", Number of Pages: " + numberOfPages + ", Genre: " + genre);
    }
}
