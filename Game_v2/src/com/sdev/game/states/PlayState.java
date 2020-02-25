package com.sdev.game.states;

import com.sdev.game.graphics.Font;
import com.sdev.game.graphics.Sprite;
import com.sdev.game.util.KeyHandler;
import com.sdev.game.util.MouseHandler;
import com.sdev.game.util.Vector2f;

import java.awt.Graphics2D;
import java.awt.Color;

public class PlayState extends GameState {

    private Font font;

    public PlayState(GameStateManager gsm){
        super(gsm);
        font = new Font("res/font/ZeldaFont.png", 16,16);
    }

    public void update(){

    }

    public void input(MouseHandler mouse, KeyHandler key){

    }

    public void render(Graphics2D g){
        Sprite.drawArray(g, font, "Dungeon Runner", new Vector2f(100,100),32,32,15,0);
        //Sprite.drawArray(g, font, "[INPUT TEXT]", new Vector2f(100,200),32,32,15,0); <- Preset
    }
}
