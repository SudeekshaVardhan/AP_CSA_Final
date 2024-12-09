package Chess_Game.piece;

import Chess_Game.main.GamePanel;

public class Queen extends Piece{
    
    public Queen (int color, int col, int row)
    {
        super(color, col, row);

        if(color == GamePanel.WHITE)
        {
            image = getImage("C:\\Users\\sudeeksha.vardhan\\Documents\\AP_CSA_Final-main\\AP_CSA_Final-main\\Chess_Game\\piece\\pieces\\queen");
        }
        else
        {
            image = getImage("C:\\Users\\sudeeksha.vardhan\\Documents\\AP_CSA_Final-main\\AP_CSA_Final-main\\Chess_Game\\piece\\pieces\\queen1");
        }
    }

}

/* Queen
 * 
 */
