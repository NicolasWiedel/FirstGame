package de.nicolas.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

/** Einstellungen für das Spiel */
public class AppPreferences {

    private static final String PREF_MUSIC_VOLUME = "volume";
    private static final String PREF_MUSIC_ENABLED = "music.enabled";
    private static final String PREF_SOUND_ENABLED = "sound.enabled";
    private static final String PREF_SOUND_VOLUME = "sound";
    private static final String PREF_NAME = "firstgame";

    protected Preferences getPrefs(){
        return Gdx.app.getPreferences(PREF_NAME);
    }

    /** Getter für Sound Status */
    public boolean isSoundEffectEnabled(){
        return getPrefs().getBoolean(PREF_SOUND_ENABLED, true);
    }

    /** Setter für Sound Status */
    public void setSoundEffectsEnabled(boolean soundEffectsEnabled){
        getPrefs().putBoolean(PREF_SOUND_ENABLED, soundEffectsEnabled);
        getPrefs().flush();
    }

    /** Getter für Musik Status */
    public boolean isMusicEnabled(){
        return getPrefs().getBoolean(PREF_MUSIC_ENABLED, true);
    }

    /** Setter für Musik Status */
    public void setMusicEnabled(boolean musicEnabled){
        getPrefs().putBoolean(PREF_MUSIC_ENABLED, musicEnabled);
        getPrefs().flush();
    }

    /** Getter für Musik Lautstärke */
    public float getMusicVolume(){
        return getPrefs().getFloat(PREF_MUSIC_VOLUME, 0.5f);
    }

    /** Setter für Musik Lautstärke */
    public void setMusicVolume(float volume){
        getPrefs().putFloat(PREF_MUSIC_VOLUME, volume);
        getPrefs().flush();
    }

    /** Getter für Sound Lautstärke */
    public float getSoundVolume(){
        return getPrefs().getFloat(PREF_SOUND_VOLUME, 0.5f);
    }

    /** Setter für Sound Lautstärke */
    public void setSoundVolume(float volume){
        getPrefs().putFloat(PREF_SOUND_VOLUME, volume);
        getPrefs().flush();
    }
}
