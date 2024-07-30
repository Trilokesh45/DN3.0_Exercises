import java.util.*;
public class LibraryManagementSystem {
    private Book[] books;
    private int size;

     LibraryManagementSystem(int capacity) {
        books = new Book[capacity];
        size = 0;
    }
    public void addBook(Book book) {
        if (size == books.length) {
            System.out.println("Library is full.");
            return;
        }
        books[size] = book;
        size++;
    }
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
    public Book binarySearchByTitle(String title) {
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }
}
