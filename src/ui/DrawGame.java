package ui;

import javax.swing.*;
import java.awt.*;

public class DrawGame extends JLabel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.lightGray);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 18; j++) {
                g.drawRect(i * 32, j * 32, 32, 32 );

            }
        }
        g.setColor(Color.BLACK);
        g.drawRect(0,0, Gui.width, Gui.height);


        repaint();
    }

}
