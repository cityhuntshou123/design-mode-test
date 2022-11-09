package templateMode;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 9:55
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
