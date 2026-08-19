package de.nicolas.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import de.nicolas.GdxGame;

public class PreferencesScreen implements Screen {

    /** Verweis auf die Hauptspiel-Klasse, die das wechseln von Screens ermöglicht */
    private GdxGame game;

    /** Stage ist die Grundlage für unser Menu und reagiert auf Input */
    private Stage stage;

    public PreferencesScreen(GdxGame game) {
        this.game = game;

        stage = new Stage(new ScreenViewport());

        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float v) {

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
