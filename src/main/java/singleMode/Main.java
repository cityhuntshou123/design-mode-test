package singleMode;

import sun.java2d.pipe.SpanIterator;

import javax.lang.model.element.VariableElement;
import javax.naming.InitialContext;
import javax.swing.*;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 11:06
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start..");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 与 obj2 是相同的实例。");
        } else {
            System.out.println("obj1 与 obj2 不是相同的实例。");
        }
        System.out.println("End.");

        System.out.println("-----------------test--------------------");
        TicketMarker instance1 = TicketMarker.getInstance();
        TicketMarker instance2 = TicketMarker.getInstance();
        System.out.println(instance1 == instance2);

        System.out.println(instance1.getNextTicketNumber());
        System.out.println(instance2.getNextTicketNumber());

        System.out.println(String.valueOf(instance1.getNextTicketNumber()).equals(String.valueOf(instance2.getNextTicketNumber())));

        System.out.println("-----------------test--------------------");
        Triple triple1 = Triple.getInstance(0);
        Triple triple2 = Triple.getInstance(1);
        Triple triple3 = Triple.getInstance(2);
        //Triple triple4 = Triple.getInstance(3);
        System.out.println(triple1 == triple2);
        System.out.println(triple2 == triple3);
        System.out.println(triple1 == triple3);

        System.out.println(triple1);
        System.out.println(triple2);
        System.out.println(triple3);
    }
}
