public class Book {
    private String bookName;
    private int size;
    private String genre;
    private String release;

    public Book(String harry_poter, int size, String fantastic, int i) {
    }

    public Book(String bookName, int size, String genre, String release) {
        this.bookName = bookName;
        this.size = size;
        this.genre = genre;
        this.release = release;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", size=" + size +
                ", genre='" + genre + '\'' +
                ", release='" + release + '\'' +
                '}';
    }
}
