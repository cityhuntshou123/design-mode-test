package singleMode;

/**
 * @author lipeitao
 * @apiNote 创建者模式之 单例模式
 *  AbstractFactory Method
 *  Builder Method
 *  Facade Method
 *  Prototype Method
 *  以上模式中，多数情况下只会生成一个实例。
 * @date 2022/11/9 11:05
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("生成了一个实例。");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
