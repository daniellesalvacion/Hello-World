package oob.minesweeper;

import java.util.Random;

public class Tile {

    // Attributes
    boolean reveal;
    boolean bomb;
    int tile_value;
//    int adjacent_tile;

    // Constructor
    public Tile(boolean bomb) {
        this.reveal = false;
    }

    // setters

    public boolean get_reveal() {
        return reveal;
    }
    public boolean get_bomb() {
        return bomb;
    }
    public int get_tile_value() {
        return tile_value;
    }

    public void set_tile_bomb (boolean bomb) {
        this.bomb = bomb;
    }
    public int set_tile_value() {
        return tile_value;
    }
}
