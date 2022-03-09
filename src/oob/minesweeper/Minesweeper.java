package oob.minesweeper;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        int board_row = 0;
        int board_column = 0;
        int tile_count;
        double bomb_count = 0.0;

        // Set Game Size;
        String game_size;
        boolean game_size_input;



        do {
            System.out.printf("Please choose your board size [Beginner, Intermediate, Expert, Custom]: ");
            game_size = userInput.nextLine();

            int gsi = 0;
            if (game_size.equalsIgnoreCase("Beginner")) {
                gsi = 1;
            } else if (game_size.equalsIgnoreCase("Intermediate")) {
                gsi = 2;
            } else if (game_size.equalsIgnoreCase("Expert")) {
                gsi = 3;
            } else if (game_size.equalsIgnoreCase("Custom")) {
                gsi = 4;
            }

            switch (gsi) {
                case 1:
                    System.out.println();
                    board_row = 8;
                    board_column = 8;
                    game_size_input = true;
                    break;
                case 2:
                    System.out.println();
                    board_row = 13;
                    board_column = 15;
                    game_size_input = true;
                    break;
                case 3:
                    System.out.println();
                    board_row = 16;
                    board_column = 30;
                    game_size_input = true;
                    break;
                case 4:
                    // Get User Input for Rows and Columns
                    System.out.printf("Enter row count: ");
                    board_row = Integer.parseInt(userInput.nextLine());

                    System.out.printf("Enter column count: ");
                    board_column = Integer.parseInt(userInput.nextLine());
                    game_size_input = true;
                    break;
                default:
                    System.out.println("Please enter the correct size. Please try again.");
                    System.out.println();
                    game_size_input = false;
                    break;
            }
        } while (!game_size_input);

        // Set Game Difficulty
        String game_difficulty;
        boolean game_diff_input;
        double bomb_ratio;
        tile_count = board_row * board_column;;

        do {
            System.out.printf("Please choose your game difficulty [Beginner, Intermediate, Expert, Custom]: ");
            game_difficulty = userInput.nextLine();
            if (game_difficulty.equalsIgnoreCase("Beginner")) {
                bomb_ratio = 0.126;
                game_diff_input = true;
                bomb_count = tile_count * bomb_ratio;
                if (bomb_count < 0) {
                    bomb_count = 1;
                }
            } else if (game_difficulty.equalsIgnoreCase("Intermediate")) {
                bomb_ratio = 0.181;
                game_diff_input = true;
                bomb_count = tile_count * bomb_ratio;
                if (bomb_count < 0) {
                    bomb_count = 1;
                }
            } else if (game_difficulty.equalsIgnoreCase("Expert")) {
                bomb_ratio = 0.206;
                game_diff_input = true;
                bomb_count = tile_count * bomb_ratio;
                if (bomb_count < 0) {
                    bomb_count = 1;
                }
            } else if (game_difficulty.equalsIgnoreCase("Custom")) {
                do {
                    System.out.printf("Please choose your bomb count: ");
                    bomb_count = Integer.parseInt(userInput.nextLine());
                    if (tile_count > bomb_count) {
                        game_diff_input = true;
                    } else {
                        System.out.println("Your have too much bombs in the game. Please try again.");
                        System.out.println();
                        game_diff_input = false;
                    }
                } while (tile_count <= bomb_count);
                if (bomb_count < 0) {
                    bomb_count = 1;
                }
            } else {
                System.out.println("Please enter the correct difficulty. Please try again.");
                System.out.println();
                game_diff_input = false;
            }

            System.out.println();

        } while (!game_diff_input);

        //Initialise Board
        Board new_board = new Board(board_row, board_column, (int)bomb_count);

        new_board.print_board();



    }

}
