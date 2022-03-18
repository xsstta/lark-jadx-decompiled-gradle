package com.ss.ttvideoengine;

import com.ss.ttvideoengine.VideoEngineCallback;
import com.ss.ttvideoengine.utils.Error;
import java.util.Map;

public class VideoEngineSimpleCallback implements VideoEngineCallback {
    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onABRPredictBitrate(int i, int i2) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onAVBadInterlaced(Map map) {
        VideoEngineCallback.CC.$default$onAVBadInterlaced(this, map);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onBufferEnd(int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onBufferStart(int i, int i2, int i3) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onCompletion(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onError(Error error) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onFrameDraw(int i, Map map) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onInfoIdChanged(int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onSARChanged(int i, int i2) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoStatusException(int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoStreamBitrateChanged(Resolution resolution, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoURLRouteFailed(Error error, String str) {
    }
}
