package oob.minesweeper;
import java.util.Random;
import java.util.Scanner;

public class Methods {

    Scanner userInput = new Scanner(System.in);
    Random random = new Random();
    int row_count;
    int column_count;
    double bomb_count;

    Board new_board;


//    // Choose game difficulty
//    public void set_game_difficulty() {
//        int tile_count = row_count * column_count;;
//        String game_difficulty;
//        boolean game_diff_input;
//        double bomb_ratio;
//        do {
//            System.out.printf("Please choose your game difficulty [Beginner, Intermediate, Expert, Custom]: ");
//            game_difficulty = userInput.nextLine();
//            if (game_difficulty.equalsIgnoreCase("Beginner")) {
//                bomb_ratio = 0.126;
//                game_diff_input = true;
//                bomb_count = tile_count * bomb_ratio;
//                if (bomb_count < 0) {
//                    bomb_count = 1;
//                }
//                System.out.println(bomb_count);
//            } else if (game_difficulty.equalsIgnoreCase("Intermediate")) {
//                bomb_ratio = 0.181;
//                game_diff_input = true;
//                bomb_count = tile_count * bomb_ratio;
//                if (bomb_count < 0) {
//                    bomb_count = 1;
//                }
//                System.out.println(bomb_count);
//            } else if (game_difficulty.equalsIgnoreCase("Expert")) {
//                bomb_ratio = 0.206;
//                game_diff_input = true;
//                bomb_count = tile_count * bomb_ratio;
//                if (bomb_count < 0) {
//                    bomb_count = 1;
//                }
//                System.out.println(bomb_count);
//            } else if (game_difficulty.equalsIgnoreCase("Custom")) {
//                do {
//                    System.out.printf("Please choose your bomb count: ");
//                    bomb_count = Integer.parseInt(userInput.nextLine());
//                    if (tile_count > bomb_count) {
//                        game_diff_input = true;
//                    } else {
//                        System.out.println("Your have too much bombs in the game. Please try again.");
//                        System.out.println();
//                        game_diff_input = false;
//                    }
//                } while (tile_count <= bomb_count);
//                if (bomb_count < 0) {
//                    bomb_count = 1;
//                }
//                System.out.println(bomb_count);
//            } else {
//                System.out.println("Please enter the correct difficulty. Please try again.");
//                System.out.println();
//                game_diff_input = false;
//            }
//
//            System.out.println();
//            System.out.println("last bomb count " + bomb_count);
//            new_board = new Board(row_count, column_count);
//            new_board.set_bomb_count((int)(bomb_count));
//            new_board.set_board_row(row_count);
//            new_board.set_board_column(column_count);
//
//        } while (!game_diff_input);
//    }


}
