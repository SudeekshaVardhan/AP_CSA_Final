package Chess_Game.piece;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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
        File file = new File(imagePath + ".png");

        try
        {
            image = ImageIO.read(file);
        } catch(IOException e)
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

    public void draw(Graphics2D g2)
    {
        g2.drawImage(image, x, y, Board.SQUARE_SIZE, Board.SQUARE_SIZE, null);
    }

}
