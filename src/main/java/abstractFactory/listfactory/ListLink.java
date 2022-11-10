package abstractFactory.listfactory;

import abstractFactory.factory.Link;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/10 10:23
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /**
     * 返回HTML文件的内容
     *
     * @return
     */
    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
