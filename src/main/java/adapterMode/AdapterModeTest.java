package adapterMode;

/**
 * @author lipeitao
 * @apiNote 结构性模式 - 适配器模式
 * @date 2022/11/9 9:11
 */
public class AdapterModeTest {
    public static void main(String[] args) {

        /**
         * 类的适配器模式
         */
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();

        System.out.println("---------------------------------------------");

        /**
         * 对象的适配器模式
         */
        adapterMode.ObjectAdapter.Print print1 = new adapterMode.ObjectAdapter.PrintBanner("World");
        print1.printWeak();
        print1.printStrong();
    }
}
