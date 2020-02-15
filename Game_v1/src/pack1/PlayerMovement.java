package pack1;

import java.util.*;

public class PlayerMovement {
    public PlayerMovement() {
        Var.movement = new Timer();
        Var.movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                /*if(Var.moveup == true){
                    if(Var.y>0){
                        Var.y -= Var.speedup;
                        System.out.println(Var.y);
                    }
                }else if(Var.movedown == true){
                    if(Var.y<=1080){
                        Var.y += Var.speeddown;
                    }
                }*/
                if(Var.jumping == true){
                    Var.y -= Var.currentjumpspeed;
                    Var.currentjumpspeed -= .1;
                    if(Var.currentjumpspeed <= 0){
                        Var.currentjumpspeed = Var.jumpspeed;
                        Var.jumping = false;
                        Var.falling = true;
                    }
                }
                if(Var.falling == true){
                    Var.y += Var.currentfallspeed;
                    if(Var.currentjumpspeed <= Var.maxfallspeed){
                        Var.currentfallspeed += .1;
                    }
                }
                if(Var.moveleft == true){
                    if(Var.x>0){
                        Var.x -= Var.speedleft;
                    }
                }else if(Var.moveright == true){
                    if(Var.x<=1850){
                        Var.x += Var.speedright;
                        System.out.println(Var.x);
                    }
                }
            }
        }, 0, 10);
    }
}
