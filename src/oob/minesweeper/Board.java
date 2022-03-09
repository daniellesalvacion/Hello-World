package oob.minesweeper;
import java.util.Random;
import java.util.Scanner;

public class Board {

    Scanner userInput = new Scanner(System.in);
    Random random = new Random();
    // Attribute
    Tile[][] game_board;
    int bomb_count;
    int board_row;
    int board_column;
    int random_row;
    int random_column;
    boolean random_bomb;

    // Constructor
    public Board(int board_row, int board_column, int bomb_count) {
        game_board = new Tile[board_row][board_column];

        this.board_row = board_row;
        this.board_column = board_column;
        this.bomb_count = bomb_count;

        int bomb_assigned = 1;

        for(int r = 0; r < board_row; r++)
        {
            for(int c = 0; c < board_column; c++)
            {

                game_board[r][c] = new Tile(false);
                //System.out.println(game_board[r][c].bomb);
                //System.out.print("[-]");
            }
            //System.out.println();
        }
        // Set Random Bombs
        do {
            random_row = (int)(Math.random() * board_row);
            random_column = (int)(Math.random() * board_column);
            random_bomb = random.nextBoolean();

            game_board[random_row][random_column].set_tile_bomb(true);
            //System.out.println(random_row + "" + random_column);
            bomb_assigned++;

        } while (bomb_assigned < bomb_count);
    }

    public void set_bomb_count(int bomb_count) {
        this.bomb_count = bomb_count;
    }
    public void set_board_row(int board_row) {
        this.board_row = board_row;
    }
    public void set_board_column(int board_column) {
        this.board_column = board_column;
    }

    public double get_bomb_count() {
        return bomb_count;
    }
    public double get_row_count() {
        return board_row;
    }
    public double get_column_count() {
        return board_column;
    }

    public void print_board() {
        Boolean boom = false;
        Boolean tick;
        Boolean row_input = false;
        Boolean col_input = false;
        int array_row;
        int array_col;
        do {
            do {
                System.out.print("Please choose the tile row. ");
                array_row = userInput.nextInt();
                if (array_row > board_row) {
                    System.out.println("You went out of bounds. Please try again.");
                    row_input = false;
                } else {
                    row_input = true;
                }
            } while (!row_input);
            do {
                System.out.print("Please choose the tile column. ");
                array_col = userInput.nextInt();
                if (array_col > board_column) {
                    System.out.println("You went out of bounds. Please try again.");
                    col_input = false;
                } else {
                    col_input = true;
                }
            } while (!col_input);
            tick = game_board[array_row][array_col].get_bomb();
            if (tick) {
                System.out.println("Safe");
                System.out.println(tick);
//                game_board[arrayOne][arrayTwo].set_tile_value(1);
            } else {
                System.out.println("Boom Game Over");
                System.out.println(tick);
                boom = true;
            }

        } while (!boom);

        for (int r = 0; r < board_row; r++) {
            for (int c = 0; c < board_column; c++) {
                System.out.print("[-]");
            }
            System.out.println();
        }
    }

}
