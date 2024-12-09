package Chess_Game.piece;

import Chess_Game.main.GamePanel;

public class Rook extends Piece{

    public Rook(int color, int col, int row)
    {
        super(color, col, row);

        if(color == GamePanel.WHITE)
        {
            image = getImage("C:\\Users\\sudeeksha.vardhan\\Documents\\AP_CSA_Final-main\\AP_CSA_Final-main\\Chess_Game\\piece\\pieces\\rook");
        }

        else
        {
            image = getImage("C:\\Users\\sudeeksha.vardhan\\Documents\\AP_CSA_Final-main\\AP_CSA_Final-main\\Chess_Game\\piece\\pieces\\rook1");
        }
    }

}
/* Rook
 * Moves any number of pieces directly in front or behind it
 * Can castle with king (additional info)
 */