package game.player.level1;

import game.physics.BoxCollider;
import game.player.DirectionExplosion;
import game.renderer.Renderer;

public class Left1 extends DirectionExplosion {

    public Left1(){
        renderer = new Renderer("assets/images/explosions/left", true);
        hitBox = new BoxCollider(this, 30,10);

    }
}
