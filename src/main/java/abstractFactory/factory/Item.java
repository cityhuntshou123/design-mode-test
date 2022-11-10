package abstractFactory.factory;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/10 9:48
 */
public abstract class Item {
    /**
     * 标题
     */
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 返回HTML文件的内容
     * @return
     */
    public abstract String makeHTML();
}
