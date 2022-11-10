package abstractFactory.listfactory;

import abstractFactory.factory.Tray;

import java.util.Iterator;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/10 10:25
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    /**
     * 返回HTML文件的内容
     *
     * @return
     */
    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Tray item = (Tray)iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        return buffer.toString();
    }
}
