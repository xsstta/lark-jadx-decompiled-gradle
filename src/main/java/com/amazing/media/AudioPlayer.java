package com.amazing.media;

import android.media.MediaPlayer;
import java.io.IOException;

public class AudioPlayer {

    /* renamed from: a */
    private MediaPlayer f6548a = new MediaPlayer();

    /* renamed from: b */
    private String f6549b;

    public boolean isPlaying() {
        return this.f6548a.isPlaying();
    }

    public void pause() {
        this.f6548a.pause();
    }

    public void resume() {
        this.f6548a.start();
    }

    public void stop() {
        this.f6548a.stop();
    }

    public void destroy() {
        MediaPlayer mediaPlayer = this.f6548a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f6548a.release();
            this.f6548a = null;
        }
    }

    public void play() {
        this.f6548a.reset();
        if (prepare()) {
            this.f6548a.start();
        }
    }

    public boolean prepare() {
        try {
            this.f6548a.setDataSource(this.f6549b);
            this.f6548a.setAudioStreamType(3);
            this.f6548a.prepare();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setLoop(boolean z) {
        this.f6548a.setLooping(z);
    }

    public AudioPlayer(String str) {
        this.f6549b = str;
    }
}
