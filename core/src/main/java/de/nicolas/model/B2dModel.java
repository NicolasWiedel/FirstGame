package de.nicolas.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

public class B2dModel {

    private World world;

    private Body bodyD;
    private Body bodyS;
    private Body bodyK;

    private BodyDef bDef;
    private FixtureDef fDef;

    public B2dModel() {
        world = new World(new Vector2(0, -9.81f), true);;

        bDef = new BodyDef();
        fDef = new FixtureDef();

        createFloor();
        createObject();
        createMovingObject();
    }

    public void logicStep(float delta){
        world.step(delta, 3, 3);
    }

    public World getWorld() {
        return world;
    }

    private void createObject(){
        bDef.type = BodyDef.BodyType.DynamicBody;
        bDef.position.set(0, 0);

        bodyD = world.createBody(bDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(1f, 1f);

        fDef.shape = shape;
        fDef.density = 1f;

        bodyD.createFixture(shape, 0.0f);

        shape.dispose();
    }

    private void createFloor(){
        bDef.type = BodyDef.BodyType.StaticBody;
        bDef.position.set(0, -10f);

        bodyS = world.createBody(bDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(50, 1);

        bodyS.createFixture(shape, 0.0f);

        shape.dispose();
    }

    private void createMovingObject(){
        bDef.type = BodyDef.BodyType.KinematicBody;
        bDef.position.set(0, -12);

        bodyK = world.createBody(bDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(2f, 1f);

        fDef.shape = shape;
        fDef.density = 1f;

        bodyK.createFixture(shape, 0.0f);

        shape.dispose();

        bodyK.setLinearVelocity(0, 0.75f);
    }
}
