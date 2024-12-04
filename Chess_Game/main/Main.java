package Chess_Game.main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Creates new window for the chess game titled "Chess Game"
        //The window is of a fixed size, and it also remains centered
        // on the screen
        JFrame window = new JFrame("Chess Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        
        //Add GamePanel to the window (1100 by 800 window)
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo((null));
        window.setVisible(true);

        gp.launchGame();

        
    }
    
}
