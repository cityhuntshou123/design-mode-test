package adapterMode;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 9:10
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
