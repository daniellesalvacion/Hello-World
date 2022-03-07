package oob.minesweeper;

public class Tile {

    // Attributes
    boolean reveal;
    boolean bomb;
    int tile_value;
//    int adjacent_tile;

    // Constructor
    public Tile(boolean bomb, int tile_value) {
        this.reveal = false;
        this.tile_value = tile_value;
        this.bomb = bomb;
    }

    public boolean get_reveal() {
        return reveal;
    }
    public int get_tile_value() {
        return tile_value;
    }

}
