package prototypeMode.framework;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 15:28
 */
public interface Product extends Cloneable {

    abstract void use(String s);

    abstract Product createClone();

}
