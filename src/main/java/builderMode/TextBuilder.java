package builderMode;

/**
 * @author lipeitao
 * @apiNote 纯文本编写文档，并以 String 返回结果
 * @date 2022/11/9 16:17
 */
public class TextBuilder extends Builder{

    private StringBuffer buffer = new StringBuffer();
    /**
     * 组装标题
     *
     * @param title
     */
    @Override
    void makeTitle(String title) {
        buffer.append("=====================================");
        buffer.append("[" + title + "]");
        buffer.append("\n");
    }

    /**
     * 组装字符串
     *
     * @param str
     */
    @Override
    void makeString(String str) {
        buffer.append("♦" + str + "\n");
        buffer.append("\n");
    }

    /**
     * 组装数组型字符串
     *
     * @param items
     */
    @Override
    void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ~" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    /**
     * 关闭
     */
    @Override
    void close() {
        buffer.append("=============================\n");
    }

    public String getResult() {
         return buffer.toString();
    }
}
