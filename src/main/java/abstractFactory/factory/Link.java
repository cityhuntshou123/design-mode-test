package abstractFactory.factory;

/**
 * @author lipeitao
 * @apiNote 抽象的零件 - HTML的超链接类
 * @date 2022/11/10 9:50
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
