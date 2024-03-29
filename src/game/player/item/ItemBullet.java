package game.player.item;


import game.physics.BoxCollider;
import game.player.Down;
import game.player.Player;
import game.player.PlayerBullet;
import game.renderer.Renderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class ItemBullet extends Item {

    public ItemBullet(){
        BufferedImage image = SpriteUtils.loadImage("assets/images/Item/item1.png");
        renderer = new Renderer(image);
        this.position.set(175,50);
        hitBox = new BoxCollider(this,30,30);
    }

    @Override
    public void powerUp(Player player) {
        player.power = 2;
    }
}
