package IteratorMode;


/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/8 22:00
 */
public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book getBookAt(int index) {
        if (index < 0) {
            throw new RuntimeException("index must more than 0!");
        }

        return books[index];
    }

}
