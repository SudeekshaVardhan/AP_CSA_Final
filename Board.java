package main;

import java.awt.*;

public class Board extends JPanel{
    
    //Creates a standard 8 by 8 chess board
    int cols = 8;
    int rows = 8;

    //Set the tile size of each "space" on the chess board
    public int tileSize = 85;

    //Creates a default chess board

    public Board()
    {
        this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize));
        this.setBackground(Color.green);

    }
}
