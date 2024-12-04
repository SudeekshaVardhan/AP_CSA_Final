package Chess_Game.piece;

import Chess_Game.main.GamePanel;

public class Queen extends Piece{
    
    public Queen (int color, int col, int row)
    {
        super(color, col, row);

        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/queen");
        }
        else
        {
            image getImage("/piece/queen1");
        }
    }

}
