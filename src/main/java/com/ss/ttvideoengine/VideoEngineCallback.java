package com.ss.ttvideoengine;

import com.ss.ttvideoengine.utils.Error;
import java.util.Map;

public interface VideoEngineCallback {

    /* renamed from: com.ss.ttvideoengine.VideoEngineCallback$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onABRPredictBitrate(VideoEngineCallback videoEngineCallback, int i, int i2) {
        }

        public static void $default$onAVBadInterlaced(VideoEngineCallback videoEngineCallback, Map map) {
        }

        public static void $default$onBufferEnd(VideoEngineCallback videoEngineCallback, int i) {
        }

        public static void $default$onBufferStart(VideoEngineCallback videoEngineCallback, int i, int i2, int i3) {
        }

        public static void $default$onBufferingUpdate(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine, int i) {
        }

        public static void $default$onCompletion(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine) {
        }

        public static void $default$onError(VideoEngineCallback videoEngineCallback, Error error) {
        }

        public static void $default$onFrameDraw(VideoEngineCallback videoEngineCallback, int i, Map map) {
        }

        public static void $default$onInfoIdChanged(VideoEngineCallback videoEngineCallback, int i) {
        }

        public static void $default$onLoadStateChanged(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine, int i) {
        }

        public static void $default$onPlaybackStateChanged(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine, int i) {
        }

        public static void $default$onPrepare(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine) {
        }

        public static void $default$onPrepared(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine) {
        }

        public static void $default$onReadyForDisplay(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine) {
        }

        public static void $default$onRenderStart(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine) {
        }

        public static void $default$onSARChanged(VideoEngineCallback videoEngineCallback, int i, int i2) {
        }

        public static void $default$onStreamChanged(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine, int i) {
        }

        public static void $default$onVideoSizeChanged(VideoEngineCallback videoEngineCallback, TTVideoEngine tTVideoEngine, int i, int i2) {
        }

        public static void $default$onVideoStatusException(VideoEngineCallback videoEngineCallback, int i) {
        }

        public static void $default$onVideoStreamBitrateChanged(VideoEngineCallback videoEngineCallback, Resolution resolution, int i) {
        }

        public static void $default$onVideoURLRouteFailed(VideoEngineCallback videoEngineCallback, Error error, String str) {
        }
    }

    void onABRPredictBitrate(int i, int i2);

    void onAVBadInterlaced(Map map);

    void onBufferEnd(int i);

    void onBufferStart(int i, int i2, int i3);

    void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i);

    void onCompletion(TTVideoEngine tTVideoEngine);

    void onError(Error error);

    void onFrameDraw(int i, Map map);

    void onInfoIdChanged(int i);

    void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPrepare(TTVideoEngine tTVideoEngine);

    void onPrepared(TTVideoEngine tTVideoEngine);

    void onReadyForDisplay(TTVideoEngine tTVideoEngine);

    void onRenderStart(TTVideoEngine tTVideoEngine);

    void onSARChanged(int i, int i2);

    void onStreamChanged(TTVideoEngine tTVideoEngine, int i);

    void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2);

    void onVideoStatusException(int i);

    void onVideoStreamBitrateChanged(Resolution resolution, int i);

    void onVideoURLRouteFailed(Error error, String str);
}
