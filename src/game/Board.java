package game;
import java.util.HashMap;

/**
 * Created by grantmerrill on 5/3/17.
 */
public class Board {
    private int size;
    private HashMap<Integer, Boolean> board;


    public Board(int size) {
        this.size = size;
        this.board = new HashMap<Integer, Boolean>();
        for (int i = 0; i < Math.pow(this.size,2); i++){
            board.put(i, false);
        }
    }

    public int getSize() {
        return size;
    }

    public HashMap<Integer, Boolean> getState() {
        return board;
    }
}


