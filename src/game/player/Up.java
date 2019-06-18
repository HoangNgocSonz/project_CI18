package game.player;

import game.physics.BoxCollider;
import game.renderer.Renderer;

public class Up extends DirectionExplosion {
    public Up(){
        renderer = new Renderer("assets/images/explosions/up", true);
        hitBox = new BoxCollider(this, 10,10);

    }
}
