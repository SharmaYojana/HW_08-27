package nyc.c4q.Yojana;

/**
 * Write a program that creates a single string that represents an 8×8 grid, using newline characters to separate lines.
 * At each position of the grid there is either a space or a “#” character.
 * Created by yojanasharma on 8/28/16.
 */
public class ProblemFive {
    public static void main(String[] args) {
        System.out.println(chessBoard());
    }

    public static String chessBoard() {
        String board = "";

        for (int j = 0; j < 8; j++) {
            if (j % 2 ==0) {
                board += " ";
            }
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    board += "#";
                } else {
                    board += " ";
                }
            }
            board += "\n";
        }
        return board;
    }
}
