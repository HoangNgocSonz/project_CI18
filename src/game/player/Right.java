package game.player;

import game.physics.BoxCollider;
import game.renderer.Renderer;

public class Right extends DirectionExplosion {
    public Right(){
        renderer = new Renderer("assets/images/explosions/right", true);
        hitBox = new BoxCollider(this, 10,10);

    }

}
