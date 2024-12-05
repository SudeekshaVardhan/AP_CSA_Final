package Chess_Game.piece;

import Chess_Game.main.GamePanel;

public class Rook extends Piece{

    public Rook(int color, int col, int row)
    {
        super(color, col, row);

        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/rook");
        }

        else
        {
            image = getImage("/piece/rook1");
        }
    }

}
