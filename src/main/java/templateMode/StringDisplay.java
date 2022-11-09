package templateMode;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 9:55
 */
public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }


    @Override
    public void open() {
        System.out.println("+----------+");
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        System.out.println("+----------+");
    }

    private void printLine() {
        System.out.println("+");
        for (int i = 0; i < width; i++) {
            System.out.println("-");
        }
        System.out.println("+");
    }
}
