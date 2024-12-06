package Chess_Game.piece;

import Chess_Game.main.GamePanel;

/*Pawn is a subclass of piece. It inherits behaviors from Piece,
 * such as the color and position, but this sets up a class that
 * behaves in additional ways (differentiates the movements of pawns
 * from other pieces)
 */
public class Pawn extends Piece{
    public Pawn(int color, int col, int row)
    {
        super(color, col, row);
        
        if(color == GamePanel.WHITE)
        {
            image = getImage("/res/piece/pawn");
        }

        else
        {
            image = getImage("/res/piece/pawn1");
        }
    }
}

/*Pawn Movements:
 * Can move one or two spaces on first move
 * Moves only one forward each subsequent turn
 * Can capture diagonally
 * If reaches the opposite end of the board, it can be promoted
 */
