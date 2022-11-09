package iteratorMode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/8 22:00
 */
public class BookShelf implements Aggregate{

    private List books;
    //private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new ArrayList(maxsize);
    }

    public void appendBook(Book book) {
        books.add(book);
        //last++;
    }

    public int getLength() {
        return books.size() ;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book getBookAt(int index) {
        if (index < 0) {
            throw new RuntimeException("index must more than 0!");
        }

        return (Book) books.get(index);
    }

}
