package game.player.level1;

import game.physics.BoxCollider;
import game.player.DirectionExplosion;
import game.renderer.Renderer;

public class Right1 extends DirectionExplosion {
    public Right1(){
        renderer = new Renderer("assets/images/explosions/right", true);
        hitBox = new BoxCollider(this, 30,10);

    }

}
