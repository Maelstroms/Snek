import game.Board;

/**
 * Created by grantmerrill on 9/12/17.
 */
public class Main {

    public static void main(String [] args){
        Board board = new Board(8);
        System.out.println(board.getSize());
        System.out.println(board.getState());
    }
}
