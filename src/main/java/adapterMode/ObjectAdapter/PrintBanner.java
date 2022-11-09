package adapterMode.ObjectAdapter;

import adapterMode.Banner;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 9:37
 */
public class PrintBanner extends Print{
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
