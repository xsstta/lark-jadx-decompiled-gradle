package com.ss.video.rtc.engine.mediaio;

import android.opengl.EGLContext;

public interface IVideoSink extends IVideoFrameConsumer {
    int getBufferType();

    EGLContext getEGLContextHandle();

    int getPixelFormat();

    int getRenderElapse();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
