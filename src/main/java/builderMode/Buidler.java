package builderMode;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 16:10
 */
abstract class Builder {
    /**
     * 组装标题
     * @param title
     */
    abstract void makeTitle(String title);

    /**
     * 组装字符串
     * @param str
     */
    abstract void makeString(String str);

    /**
     * 组装数组型字符串
     * @param items
     */
    abstract void makeItems(String[] items);

    /**
     * 关闭
     */
    abstract void close();
}
