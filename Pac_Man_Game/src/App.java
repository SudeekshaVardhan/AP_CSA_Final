//Not named "main" but is the new main file for this system

//Library needed to create a new window to run the game
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        /***********   GAME BOARD  ***********/
        /* Number of rows: 19 columns
         * Number of columns: 21 rows
         * Width of tile: 32 px
         * Length of tile: 32 px
         * 
         * BOARD HEIGHT: 19 x 32
         * BOARD WIDTH: 21 x 32
         */

        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        //CREATE NEW WINDOW TO RUN GAME
        JFrame frame = new JFrame("PAC MAN");
        // frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CREATE GAME BOARD AND FRAME
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);





    }
}
