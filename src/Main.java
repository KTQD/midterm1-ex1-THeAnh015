public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3 Player", "Portable music player", "1234", 49.99f, 180);
        Book book = new Book("Java Programming", "Learn Java programming", "5678", 29.99f, "John Doe", 400, "Programming");

        mp3.showInfo();
        book.showInfo();
    }
}
