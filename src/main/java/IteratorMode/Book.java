package iteratorMode;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/8 21:58
 */
public class Book {
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
