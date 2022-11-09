package prototypeMode;

import prototypeMode.framework.Manager;
import prototypeMode.framework.Product;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 15:43
 */
public class Main {
    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');

        MessageBox mBox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.regist("strong message", upen);
        manager.regist("warning box", mBox);
        manager.regist("slash box", sbox);

        // 生成
        Product product = manager.create("strong message");
        product.use("Hello, World.");

        Product product1 = manager.create("warning box");
        product1.use("Hello, World.");

        Product product2 = manager.create("slash box");
        product2.use("Hello, World.");
    }
}
