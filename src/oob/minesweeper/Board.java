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
    int tile_value;
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

        // Check Adjacent Tiles doesnt workkkkk
//        for (int r = 0; r <= board_row; r++) {
//            for (int c = 0; c <= board_column; c++) {
//                int minr = r - 1;
//                int maxr = r + 1;
//                int minc = c - 1;
//                int maxc = c + 1;
//                for (int ar = minr; ar <= maxr; ar++) {
//                    for (int ac = minc; ac <= maxc; ac++) {
//                        if (ar >= 0 || ar < game_board.length || ac >= 0 || ac < game_board[0].length ) {
//                            if (!game_board[ar][ac].get_bomb()) {
//                              System.out.print("ok");
//                                game_board[ar][ac].set_reveal(true);
//                            } else {
//                                tile_value++;
//                                game_board[ar][ac].set_tile_value(tile_value);
//                            }
//                        }
//                        else {
//                            if (!game_board[ar][ac].get_bomb()) {
//                                game_board[ar][ac].set_reveal(true);
//                            } else {
//                                tile_value++;
//                                game_board[ar][ac].set_tile_value(tile_value);
//                            }
//                            System.out.print(game_board[r][c].get_tile_value());
//                        }
//                    }
//                }
//            }
//        }
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
        boolean boom = false;
        boolean tick;
        boolean tile_reveal;
        boolean row_input = false;
        boolean col_input = false;
        int array_row;
        int array_col;

        // Print Board
        for (int r = 0; r < board_row; r++) {
            for (int c = 0; c < board_column; c++) {
                System.out.print("[-]");
            }
            System.out.println();
        } System.out.println();

        do {
            do {
                System.out.print("Please choose the tile row: ");
                array_row = userInput.nextInt();
                if (array_row > board_row) {
                    System.out.println("You went out of bounds. Please try again.");
                    row_input = false;
                } else {
                    row_input = true;
                }
            } while (!row_input);
            do {
                System.out.print("Please choose the tile column: ");
                array_col = userInput.nextInt();
                if (array_col > board_column) {
                    System.out.println("You went out of bounds. Please try again.");
                    col_input = false;
                } else {
                    col_input = true;
                }
            } while (!col_input);
            tick = game_board[array_row][array_col].get_bomb();
            if (!tick) {
//                System.out.println("Safe");
//                game_board[arrayOne][arrayTwo].set_tile_value(1);
                System.out.println();
            } else {
                System.out.println("BOOM! Game Over");
                System.out.println();
                boom = true;
            }

            //not working?
            tile_reveal = true;
            game_board[array_row][array_col].set_reveal(tile_reveal);

            // Show Board
            for (int r = 0; r < board_row; r++) {
                for (int c = 0; c < board_column; c++) {
                    // Re-print board
                    if (game_board[r][c].get_reveal()) {
                        if (!game_board[r][c].get_bomb()) {
                            System.out.print("[" + game_board[r][c].tile_value + "]");
                        } else {
                            System.out.print("[X]");
                        }
                    } else {
                        System.out.print("[-]");
                    }
                }
                System.out.println();
            } System.out.println();

        } while (!boom);

    }

}
