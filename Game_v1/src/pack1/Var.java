package pack1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;


public class Var {
    static JFrame jf1;
    static int screenwidth = 1920, screenheight = 1080;
    static String gametitle = "Game_v1";
    static int x = 400, y = 400;
    // Movement
    static boolean moveup =false,movedown =false,moveleft =false,moveright =false,jumping =false,falling =false;
    static double jumpspeed =5,currentjumpspeed = jumpspeed,maxfallspeed =5,currentfallspeed = 0.1;
    static int speedup = 2,speeddown = 2,speedright = 2,speedleft = 2;
    static Label lbl1;
    static BufferedImage imgb1;
    static BufferedImage player;
    static Timer movement;
    static JTextField ts;
    public Var () throws IOException {
        try {
            imgb1 = ImageIO.read(new File("rsc/background.jpg"));
            player = ImageIO.read(new File("rsc/player.png"));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Hintergrund konnte nicht geladen werden");
        }
    }
}
