package de.nicolas;

import com.badlogic.gdx.Game;
import de.nicolas.views.*;

public class GdxGame extends Game {

    /** Verweise auf die möglichen Screens im Spiel */
    private LoadingScreen loadingScreen;
    private PreferencesScreen preferencesScreen;
    private MenuScreen menuScreen;
    private MainScreen mainScreen;
    private EndScreen endScreen;

    /** Die möglichen Zustände in die das Spiel wechseln kann */
    public final static int MENU = 0;
    public final static int PREFERENCES = 1;
    public final static int APPLICATION = 2;
    public final static int ENDGAME = 3;

    @Override
    public void create() {
        loadingScreen = new LoadingScreen(this);
        setScreen(loadingScreen);
    }

    /** Metjode, die das Wechseln der Screens ermöglicht */
    public void changeScreen(int screen){
        switch (screen){
            case MENU:
                if (menuScreen == null){
                    menuScreen = new MenuScreen(this);
                }
                setScreen(menuScreen);
                break;
            case PREFERENCES:
                if (preferencesScreen == null){
                    preferencesScreen = new PreferencesScreen(this);
                }
                setScreen(preferencesScreen);
                break;
            case APPLICATION:
                if (mainScreen == null){
                    mainScreen = new MainScreen(this);
                }
                setScreen(mainScreen);
                break;
            case ENDGAME:
                if (endScreen == null){
                    endScreen = new EndScreen(this);
                }
                setScreen(endScreen);
                break;
        }
    }
}
