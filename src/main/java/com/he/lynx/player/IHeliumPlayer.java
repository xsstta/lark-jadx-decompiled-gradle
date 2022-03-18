package com.he.lynx.player;

import android.view.Surface;
import java.io.IOException;

public interface IHeliumPlayer {

    public interface HeliumPlayerFactory {
        IHeliumPlayer create();
    }

    public interface IHeliumPlayerListener {
        void onCompletion(IHeliumPlayer iHeliumPlayer);

        boolean onError(IHeliumPlayer iHeliumPlayer, Object obj);

        void onPrepared(IHeliumPlayer iHeliumPlayer);

        void onRenderStart(IHeliumPlayer iHeliumPlayer);
    }

    int getCurrentPosition();

    int getDuration();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying() throws IllegalStateException;

    void pause() throws IllegalStateException;

    void play() throws IllegalStateException;

    void prepare();

    void release();

    void seekTo(int i) throws IllegalStateException;

    void setDataSource(String str) throws IllegalStateException, IOException;

    void setListener(IHeliumPlayerListener iHeliumPlayerListener);

    void setLooping(boolean z);

    void setSurface(Surface surface) throws IllegalStateException;

    void setVolume(float f, float f2);

    void stop() throws IllegalStateException;
}
