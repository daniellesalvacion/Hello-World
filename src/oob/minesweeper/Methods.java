//package oob.minesweeper;
//import java.util.Scanner;
//
//public class Methods {
//
//    // Ask for Game Size
//    static void set_game_size() {
//        Scanner userInput = new Scanner(System.in);
//        String game_size;
//        int row_count = 0;
//        int column_count = 0;
//        boolean game_size_input;
//
//        do {
//            System.out.printf("Please choose your board size [Beginner, Intermediate, Expert, Custom]: ");
//            game_size = userInput.nextLine();
//
//            int gsi = 0;
//            if (game_size.equalsIgnoreCase("Beginner")) {
//                gsi = 1;
//            } else if (game_size.equalsIgnoreCase("Intermediate")) {
//                gsi = 2;
//            } else if (game_size.equalsIgnoreCase("Expert")) {
//                gsi = 3;
//            } else if (game_size.equalsIgnoreCase("Custom")) {
//                gsi = 4;
//            }
//
//            switch (gsi) {
//                case 1:
//                    System.out.println();
//                    row_count = 8;
//                    column_count = 8;
//                    game_size_input = true;
//                    break;
//                case 2:
//                    System.out.println();
//                    row_count = 13;
//                    column_count = 15;
//                    game_size_input = true;
//                    break;
//                case 3:
//                    System.out.println();
//                    row_count = 16;
//                    column_count = 30;
//                    game_size_input = true;
//                    break;
//                case 4:
//                    // Get User Input for Rows and Columns
//                    System.out.printf("Enter row count: ");
//                    row_count = Integer.parseInt(userInput.nextLine());
//
//                    System.out.printf("Enter column count: ");
//                    column_count = Integer.parseInt(userInput.nextLine());
//                    game_size_input = true;
//                    break;
//                default:
//                    System.out.println("Please enter the correct difficulty. Please try again.");
//                    System.out.println();
//                    game_size_input = false;
//                    break;
//            }
//        } while (!game_size_input);
//
//    }
//
//    // Choose game difficulty
//    static void set_mine_count() {
//        Scanner userInput = new Scanner(System.in);
//        String game_difficulty;
//        boolean game_diff_input;
//        int tile_count = row_count * column_count;
//        double bomb_count;
//        double bomb_ratio;
//        do {
//            System.out.printf("Please choose your game difficulty [Beginner, Intermediate, Expert, Custom]: ");
//            game_difficulty = userInput.nextLine();
//
//            if (game_difficulty.equalsIgnoreCase("Beginner")) {
//                bomb_ratio = 0.126;
//                game_diff_input = true;
//                bomb_count = tile_count * bomb_ratio;
//            } else if (game_difficulty.equalsIgnoreCase("Intermediate")) {
//                bomb_ratio = 0.181;
//                game_diff_input = true;
//                bomb_count = tile_count * bomb_ratio;
//            } else if (game_difficulty.equalsIgnoreCase("Experts")) {
//                bomb_ratio = 0.206;
//                game_diff_input = true;
//                bomb_count = tile_count * bomb_ratio;
//            } else if (game_difficulty.equalsIgnoreCase("Custom")) {
//                do {
//                    System.out.printf("Please choose your bomb count: ");
//                    bomb_count = Integer.parseInt(userInput.nextLine());
//                    if (tile_count >= bomb_count) {
//                        game_diff_input = true;
//                    } else {
//                        System.out.println("Your bomb count exceeds the tile count of the board. Please try again.");
//                        System.out.println();
//                        game_diff_input = false;
//                    }
//                } while (tile_count <= bomb_count);
//            } else {
//                game_diff_input = false;
//            }
//
//        } while (!game_diff_input);
//    }
//}
