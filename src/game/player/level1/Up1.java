package game.player.level1;

import game.physics.BoxCollider;
import game.player.DirectionExplosion;
import game.renderer.Renderer;

public class Up1 extends DirectionExplosion {
    public Up1(){
        renderer = new Renderer("assets/images/explosions/up", true);
        hitBox = new BoxCollider(this, 10,30);

    }
}
