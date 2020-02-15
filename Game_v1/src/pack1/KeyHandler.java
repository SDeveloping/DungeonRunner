package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        /*if(e.getKeyCode()==KeyEvent.VK_W){
            Var.moveup=true;
        }*/
        /*if(e.getKeyCode()==KeyEvent.VK_S){
            Var.movedown=true;
        }*/
        if(e.getKeyCode()==KeyEvent.VK_A){
            Var.moveleft=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_D){
            Var.moveright=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_SHIFT){
            Var.speeddown=+5;
            Var.speedleft=+5;
            Var.speedright=+5;
            Var.speedup=+5;
        }
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            Var.jumping=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*if(e.getKeyCode()==KeyEvent.VK_W){
            Var.moveup=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_S){
            Var.movedown=false;
        }*/
        if(e.getKeyCode()==KeyEvent.VK_A){
            Var.moveleft=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_D){
            Var.moveright=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_SHIFT){
            Var.speeddown=2;
            Var.speedleft=2;
            Var.speedright=2;
            Var.speedup=2;
        }
    }
}
