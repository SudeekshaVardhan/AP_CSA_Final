package Chess_Game.piece;

import java.awt.image.BufferedImage;
import Chess_Game.main.Board;

/*Super class for all piece behaviors */
public class Piece {
    
    public BufferedImage image;
    public int x, y;
    public int col, row, preCol, preRow; //previous col/previous row
    public int color;

    //Piece constructor
    public Piece(int color, int col, int row)
    {
        this.color = color;
        this.col = col;
        this.row = row;
        x = getX(col);
        y = getY(row);
        preCol = col;
        preCol = row;
    }

    public BufferedImage getImage(String imagePath)
    {
        BufferedImage image = null;
        try
        {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
        }
    }
    
    public int getX(int col)
    {
        return col * Board.SQUARE_SIZE;
    }

    public int getY(int row)
    {
        return row * Board.SQUARE_SIZE;
    }

}
