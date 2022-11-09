package builderMode;


/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 16:12
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{"早上好.", "下午好."});
        builder.makeString("晚上");
        builder.makeItems(new String[]{"晚上好.", "晚安.", "再见."});
        builder.close();
    }
}
