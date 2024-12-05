package Chess_Game.main;

import javax.swing.JPanel;

import Chess_Game.piece.Bishop;
import Chess_Game.piece.King;
import Chess_Game.piece.Knight;
import Chess_Game.piece.Pawn;
import Chess_Game.piece.Piece;
import Chess_Game.piece.Queen;
import Chess_Game.piece.Rook;

import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel implements Runnable{
    
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800;
    final int FPS = 60; 

    //Thread class runs the game loop
    Thread gameThread;
    Board board = new Board();

    //COLOR
    //Sets color of each piece
    public static final int WHITE = 0;
    public static final int BLACK = 1;
    int currentColor = WHITE;

    //PIECES
    //Stores the pieces that are currently on the board
    public static ArrayList<Piece> pieces = new ArrayList<>();
    public static ArrayList<Piece> simPieces = new ArrayList<>();

    public GamePanel()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);

        setPieces();
    }

    //Launches game and initializes the Thread method
    public void launchGame()
    {
        gameThread = new Thread(this);
        gameThread.start();
    }

    //Add the pieces to ArrayLists
    public void setPieces()
    {
        //White pieces
        pieces.add(new Pawn(WHITE,0,6 ));
        pieces.add(new Pawn(WHITE,1,6 ));
        pieces.add(new Pawn(WHITE,2,6 ));
        pieces.add(new Pawn(WHITE,3,6 ));
        pieces.add(new Pawn(WHITE,4,6 ));
        pieces.add(new Pawn(WHITE,5,6 ));
        pieces.add(new Pawn(WHITE,6,6 ));
        pieces.add(new Pawn(WHITE,7,6 ));
        pieces.add(new Knight(WHITE, 1, 7));
        pieces.add(new Knight(WHITE, 6, 7));
        pieces.add(new Rook(WHITE, 0, 7));
        pieces.add(new Rook(WHITE, 7, 7));
        pieces.add(new Bishop(WHITE, 2, 7));
        pieces.add(new Bishop(WHITE, 5, 7));
        pieces.add(new King(WHITE, 4, 7));
        pieces.add(new Queen(WHITE, 3, 7));

        //Black pieces
        pieces.add(new Pawn(BLACK,0,1 ));
        pieces.add(new Pawn(BLACK,1,1 ));
        pieces.add(new Pawn(BLACK,2,1 ));
        pieces.add(new Pawn(BLACK,3,1 ));
        pieces.add(new Pawn(BLACK,4,1 ));
        pieces.add(new Pawn(BLACK,5,1 ));
        pieces.add(new Pawn(BLACK,6,1 ));
        pieces.add(new Pawn(BLACK,7,1 ));
        pieces.add(new Knight(BLACK, 1, 0));
        pieces.add(new Knight(BLACK, 6, 0));
        pieces.add(new Rook(BLACK, 0, 0));
        pieces.add(new Rook(BLACK, 7, 0));
        pieces.add(new Bishop(BLACK, 2, 0));
        pieces.add(new Bishop(BLACK, 5, 0));
        pieces.add(new King(BLACK, 4, 0));
        pieces.add(new Queen(BLACK, 3, 0));

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
