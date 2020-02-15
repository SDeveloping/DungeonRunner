package pack1;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Var.imgb1, 0, 0,1920,1080,null);
        g.drawImage(Var.player, Var.x, Var.y,50,50,null);
        repaint();
    }
}
