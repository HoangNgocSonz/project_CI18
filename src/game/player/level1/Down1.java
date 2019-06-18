package game.player.level1;

import game.physics.BoxCollider;
import game.player.DirectionExplosion;
import game.renderer.Renderer;

public class Down1 extends DirectionExplosion {
    public Down1(){
        renderer = new Renderer("assets/images/explosions/down", true);
        hitBox = new BoxCollider(this, 10,30);

    }

}
