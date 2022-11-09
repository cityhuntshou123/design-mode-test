package factoryMode.IDCard;

import factoryMode.Factory;
import factoryMode.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 10:26
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    /**
     * 子类需要实现的 Product 创建方法
     *
     * @param owner
     * @return
     */
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    /**
     * 子类需实现的 注册 Product 方法
     *
     * @param product
     */
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
