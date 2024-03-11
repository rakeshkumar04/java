package OOPs;
import java.util.ArrayList;
import java.util.List;

class Author {
    String name;
    String biography;

    Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    String getName() {
        return name;
    }

    String getBiography() {
        return biography;
    }
}

class Book {
    String title;
    Author author;
    int publicationYear;

    Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    String getTitle() {
        return title;
    }

    Author getAuthor() {
        return author;
    }

    int getPublicationYear() {
        return publicationYear;
    }
}

class Library {
    List<Book> bookCollection;

    Library() {
        this.bookCollection = new ArrayList<>();
    }

    void addBook(Book book) {
        bookCollection.add(book);
    }

    List<Book> searchBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookCollection) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                result.add(book);
            }
        }
        return result;
    }
}

class LibraryManagement {
    public static void main(String[] args) {
        
        Author author1 = new Author("Rakesh", "Engineer.");
        Author author2 = new Author("Kumar", "Self Published Author.");

        
        Book book1 = new Book("Book 1", author1, 2024);
        Book book2 = new Book("Book 2", author1, 2020);
        Book book3 = new Book("Book 3", author2, 2023);

        
        Library library = new Library();

        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        
        List<Book> booksByAuthor = library.searchBooksByAuthor("Rakesh");

    
        System.out.println("Books by Rakesh:");
        for (Book book : booksByAuthor) {
            System.out.println("Title: " + book.getTitle() + ", Publication Year: " + book.getPublicationYear());
        }
    }
}
