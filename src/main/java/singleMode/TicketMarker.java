package singleMode;

/**
 * @author lipeitao
 * @apiNote
 * @date 2022/11/9 11:14
 */
public class TicketMarker {
    private int ticket = 1000;
    public static TicketMarker instance = new TicketMarker();

    private TicketMarker() {
    }

    public static TicketMarker getInstance() {
        return instance;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }

}
