package Chess_Game.piece;

import Chess_Game.main.GamePanel;

public class Bishop extends Piece {
    
    public Bishop(int color, int col, int row)
    {
        super(color, col, row);

        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/bishop");
        }
        else
        {
            image = getImage("/piece/bishop1");
        }
    }
}
