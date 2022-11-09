package templateMode;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 9:55
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract  void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
