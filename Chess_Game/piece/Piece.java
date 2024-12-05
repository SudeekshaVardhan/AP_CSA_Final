package Chess_Game.piece;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.*;

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

    /*This class generates the images of the chess pieces
     * It also sets up a getter method to access the images 
     * in a much easer way.
     */
    public BufferedImage getImage(String imagePath)
    {
        BufferedImage image = null;
        try
        {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
        }
        
        catch(IOException e)
        {
            e.printStackTrace();
        }

        return image;
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
