package prototypeMode.framework;

import java.util.HashMap;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 15:29
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void regist(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }

}
