package iteratorMode;

/**
 * @author lipeitao
 * @apiNote 行为型模式 - 迭代模式
 * @date 2022/11/8 22:13
 */
public class IteratorModeTest {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Grimm's Fairy Tales"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book bookShelf1 = (Book) iterator.next();
            System.out.println(bookShelf1);
        }
    }
}
