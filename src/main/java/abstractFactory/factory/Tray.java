package abstractFactory.factory;

import java.util.ArrayList;

/**
 * @author lipeitao
 * @apiNote Tray类，一个含有多个 Link类和 Tray类的容器。
 * 虽然 Tray 类也继承了 Item 类的抽象方法 makeHTML,但并没有实现。因此，Tray 也是抽象类。
 * @date 2022/11/10 9:51
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }

    /**
     * add方法将 Link类和 Tray类集合在一起。为了表示集合的对象是 Link类和 Tray 类
     * 所以，参数为 Link类和 Tray类的父类 Item 类。
     * @param item
     */
    public void add(Item item) {
        tray.add(item);
    }
}
