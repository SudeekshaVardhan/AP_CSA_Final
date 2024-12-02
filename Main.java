package main;

import java.awt.*;
import javax.swing.*;


public class Main
{
    public static void main(String[] args)
    {
        //Import a "board" template from a pre-existing Java library - javax.swing
        JFrame frame = new JFrame();
        
        //Creates a new board with a minimum size of (1000, 1000) (x, y)
        frame.setMinimumSize(new Dimension(1000,1000));

        frame.setLayout(new GridBagLayout());

        //Centers the board in the middle of the screen
        frame.setLocationRelativeTo(null);

        Board board = new Board();
        //frame.add(board);
        
        frame.setVisible(true);



    }
}
