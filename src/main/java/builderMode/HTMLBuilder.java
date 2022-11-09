package builderMode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;

/**
 * @author lipeitao
 * @apiNote 使用HTML编写文档，
 * 其返回结果是 HTML 文件的名字。
 * @date 2022/11/9 16:23
 */
public class HTMLBuilder extends Builder{

    private String fileName;
    private PrintWriter printWriter;

    /**
     * 组装标题
     *
     * @param title
     */
    @Override
    void makeTitle(String title) {
        fileName = title + ".html";
        try {
            printWriter = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>" + title + "</title></head><body>");
        // 输出标题
        printWriter.println("<h1>" + title + "</h1>");
    }

    /**
     * 组装字符串
     *
     * @param str
     */
    @Override
    void makeString(String str) {
        printWriter.println("<p>" + str + "</p>");
    }

    /**
     * 组装数组型字符串
     *
     * @param items
     */
    @Override
    void makeItems(String[] items) {
        printWriter.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            printWriter.println("<li>" + items[i] + "</li>");
        }
        printWriter.println("</ul>");
    }

    /**
     * 关闭
     */
    @Override
    void close() {
        printWriter.println("</body></html>");
        printWriter.close();
    }

    public String  getResult() {
        return fileName;
    }
}
