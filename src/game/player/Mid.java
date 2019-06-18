package game.player;

import game.physics.BoxCollider;
import game.renderer.Renderer;

public class Mid extends DirectionExplosion {
    public  Mid(){
        renderer = new Renderer("assets/images/explosions/mid", true);
        hitBox = new BoxCollider(this, 10,10);
    }


}
