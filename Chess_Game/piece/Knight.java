package Chess_Game.piece;

import Chess_Game.main.GamePanel;

public class Knight extends Piece{

    public Knight(int color, int col, int row)
    {
        super(color, col, row);

        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/knight");
        }

        else
        {
            image = getImage("/piece/knight1");
        }
    }
    
}
