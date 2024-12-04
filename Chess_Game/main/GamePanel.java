package Chess_Game.main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800;
    final int FPS = 60; 

    //Thread class runs the game loop
    Thread gameThread;
    Board board = new Board();

    public GamePanel()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
    }

    //Launches game and initializes the Thread method
    public void launchGame()
    {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    
    //Creates a game loop
    public void run()
    {
        // GAME LOOP
        /* 
         * Uses System.nanoTime() to measure the elapsed time and then updates the
         * every 1/60 of a second
         * Runs continuously as long as the game is running
         */

        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) 
        {
            currentTime = System.nanoTime();
            
            delta += (currentTime - lastTime)/drawInterval;
            lastTime = currentTime;

            if(delta >= 1)
            {
                update();
                repaint();
                delta--;
            }
        }
    }

    //Method handles updates (about piece position)
    //Both methods below should update window every 60 seconds
    private void update()
    {

    }

    //Develops board customization
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        board.draw(g2);
    }



}
