package iteratorMode;

/**
 * Iterator 接口用于遍历集合中的元素，
 * 其作用相当于循环语句中的循环变量。
 */
public interface Iterator {
    /**
     * 获取下一个元素
     * @return
     */
    public abstract Object next();

    boolean hasNext();
}
