package books;

import java.util.Objects;

public class Book {
    private final int id;
    private String name;
    private String authors;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;

    public Book(int id, String name, String authors, String publisher, int yearOfPublishing, int numberOfPages, int price) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id &&
                yearOfPublishing == book.yearOfPublishing &&
                numberOfPages == book.numberOfPages &&
                price == book.price &&
                Objects.equals(name, book.name) &&
                Objects.equals(authors, book.authors) &&
                Objects.equals(publisher, book.publisher);
    }

    public int hashCode() {
        return Objects.hash(id, name, authors, publisher, yearOfPublishing, numberOfPages, price);
    }

    public String toString() {
        return "Book{" +
                "id = " + id +
                ", name ='" + name + '\'' +
                ", authors ='" + authors + '\'' +
                ", publisher ='" + publisher + '\'' +
                ", year of publishing :'" + yearOfPublishing + '\'' +
                ", number of pages ='" + numberOfPages + '\'' +
                ", price ='" + price + '\'' + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }
}
