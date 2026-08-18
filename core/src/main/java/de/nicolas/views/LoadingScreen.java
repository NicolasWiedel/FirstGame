package de.nicolas.views;

import com.badlogic.gdx.Screen;
import de.nicolas.GdxGame;

public class LoadingScreen implements Screen {

    /** Verweis auf die Hauptspiel-Klasse, die das wechseln von Screens ermöglicht */
    private GdxGame game;

    public LoadingScreen(GdxGame game){
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.changeScreen(GdxGame.MENU);
    }

    @Override
    public void resize(int width, int height) {

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
