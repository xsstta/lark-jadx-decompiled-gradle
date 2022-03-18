package com.ss.ttvideoengine;

import com.ss.ttvideoengine.utils.Error;

public interface VideoEngineListener {
    void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i);

    void onCompletion(TTVideoEngine tTVideoEngine);

    void onError(Error error);

    void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPrepare(TTVideoEngine tTVideoEngine);

    void onPrepared(TTVideoEngine tTVideoEngine);

    void onRenderStart(TTVideoEngine tTVideoEngine);

    void onStreamChanged(TTVideoEngine tTVideoEngine, int i);

    void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2);

    void onVideoStatusException(int i);
}
