package game.player;

import game.physics.BoxCollider;
import game.renderer.Renderer;

public class Left extends DirectionExplosion {

    public Left(){
        renderer = new Renderer("assets/images/explosions/left", true);
        hitBox = new BoxCollider(this, 10,10);

    }
}
