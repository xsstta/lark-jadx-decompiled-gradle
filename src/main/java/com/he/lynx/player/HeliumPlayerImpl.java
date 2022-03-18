package com.he.lynx.player;

import android.media.MediaPlayer;
import android.view.Surface;
import com.he.lynx.player.IHeliumPlayer;
import java.io.IOException;

public class HeliumPlayerImpl implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, IHeliumPlayer {
    private IHeliumPlayer.IHeliumPlayerListener listener = null;
    private MediaPlayer player = new MediaPlayer();

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getDuration() {
        return this.player.getDuration();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getVideoHeight() {
        return this.player.getVideoHeight();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getVideoWidth() {
        return this.player.getVideoWidth();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public boolean isPlaying() throws IllegalStateException {
        return this.player.isPlaying();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void pause() throws IllegalStateException {
        this.player.pause();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void play() throws IllegalStateException {
        this.player.start();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void prepare() {
        this.player.prepareAsync();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void release() {
        this.player.release();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void stop() throws IllegalStateException {
        this.player.stop();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onCompletion(this);
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onPrepared(this);
        }
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void seekTo(int i) throws IllegalStateException {
        this.player.seekTo(i);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setDataSource(String str) throws IllegalStateException, IOException {
        this.player.setDataSource(str);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setLooping(boolean z) {
        this.player.setLooping(z);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setSurface(Surface surface) throws IllegalStateException {
        this.player.setSurface(surface);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setListener(IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener) {
        if (iHeliumPlayerListener == null) {
            this.player.setOnPreparedListener(null);
            this.player.setOnCompletionListener(null);
            this.player.setOnErrorListener(null);
            this.player.setOnInfoListener(null);
        } else {
            this.player.setOnPreparedListener(this);
            this.player.setOnCompletionListener(this);
            this.player.setOnErrorListener(this);
            this.player.setOnInfoListener(this);
        }
        this.listener = iHeliumPlayerListener;
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setVolume(float f, float f2) {
        this.player.setVolume(f, f2);
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener == null) {
            return true;
        }
        iHeliumPlayerListener.onRenderStart(this);
        return true;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener == null) {
            return false;
        }
        return iHeliumPlayerListener.onError(this, new Error("what: " + i + ", extra: " + i2));
    }
}
