package oob.minesweeper;

public class Board {
    // Attribute
    Tile[][] game_board;

    // Method

    // Constructor
    public Board(int board_row, int board_column) {

        game_board = new Tile[board_row][board_column];

        for(int r = 0; r < board_row; r++)
        {
            for(int c = 0; c < board_column; c++)
            {
                System.out.print("[-]");
            }
            System.out.println();
        }
    }
}
