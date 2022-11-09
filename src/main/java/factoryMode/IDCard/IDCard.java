package factoryMode.IDCard;

import factoryMode.Product;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 10:23
 */
public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("制作" + owner + "的 ID 卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的 ID 卡。");
    }

    public String getOwner() {
        return owner;
    }

}
