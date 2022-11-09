package singleMode;

import sun.security.jca.GetInstance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lipeitao
 * @apiNote Triple类，
 * 实现最多只能生成3个Triple类的实例，实例编号分别为0,1,2
 * 可以通过 getInstance(int id)来获取该编号对应的实例
 * @date 2022/11/9 11:21
 */
public class Triple {
    public static Map<Integer, Triple> triples = new HashMap<>(3);
    private Triple() {
    }

    static {
        triples.put(0, new Triple());
        triples.put(1, new Triple());
        triples.put(2, new Triple());
    }

    public static Triple getInstance(int id) {
        if (id < 0 || id > 2) {
            throw new RuntimeException("id值只限于[0, 2]");
        }
        return triples.get(id);
    }

}
