package abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Array;
import java.util.ArrayList;

/**
 * @author lipeitao
 * @apiNote 抽象表示HTML页面的类
 * Link 和 Tray 看作抽象的 “零件” 的话，
 * Page 类就是抽象的 ”产品“。
 * @date 2022/11/10 9:57
 */
public abstract class Page {
    /** 页面标题 **/
    protected String title;
    /** 页面作者 **/
    protected String author;

    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * add方法，添加组件 Link 或 Tray
     * @param item
     */
    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String fileName = title + ".html";
        try {
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(fileName + "编写完成。 ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
