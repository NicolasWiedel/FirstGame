package de.nicolas.views;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import de.nicolas.GdxGame;
import de.nicolas.model.B2dModel;

public class MainScreen implements Screen {

    /** Verweis auf die Hauptspiel-Klasse, die das wechseln von Screens ermöglicht */
    private GdxGame game;

    private B2dModel model;
    private OrthographicCamera camera;
    private Box2DDebugRenderer debugRenderer;

    public MainScreen(GdxGame game) {
        this.game = game;

        model = new B2dModel();
        camera = new OrthographicCamera(32, 24);
        debugRenderer = new Box2DDebugRenderer(true, true, true, true, true, true);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.BLACK);

        model.logicStep(delta);

        debugRenderer.render(model.getWorld(), camera.combined);
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
