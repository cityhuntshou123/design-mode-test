package factoryMode;

/**
 * @author lipeitao
 * @apiNote 抽象工厂类
 * @date 2022/11/9 10:18
 */
public abstract class Factory {

    /**
     * 创建 Product 的组合方法
     * @param owner
     * @return
     */
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    /**
     * 子类需要实现的 Product 创建方法
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     * 子类需实现的 注册 Product 方法
     * @param product
     */
    protected abstract void registerProduct(Product product);
}
