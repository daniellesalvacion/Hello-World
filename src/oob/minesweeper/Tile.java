package oob.minesweeper;

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
    public void set_reveal(boolean tile_reveal) {
        this.reveal = tile_reveal;
    }
    public void set_tile_value(int tile_value) {
        this.tile_value = tile_value;
    }
    public void set_tile_bomb (boolean bomb) {
        this.bomb = bomb;
    }

    // getters
    public boolean get_reveal() {
        return reveal;
    }
    public boolean get_bomb() {
        return bomb;
    }
    public int get_tile_value() {
        return tile_value;
    }



}
