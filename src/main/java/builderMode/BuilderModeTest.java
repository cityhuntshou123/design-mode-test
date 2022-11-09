package builderMode;

import javax.lang.model.element.VariableElement;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 16:30
 */
public class BuilderModeTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();

            String result = textBuilder.getResult();
            System.out.println(result);
        } else if(args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();

            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + "文件编写完成。");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main Plain      编写纯文本文档");
        System.out.println("Usage: java Main html       编写 HTML 文档");
    }
}
