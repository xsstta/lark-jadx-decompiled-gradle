package com.ss.video.rtc.engine.video;

public interface ITextureBuffer {
    int getTextureId();

    int getTypeGlTarget();

    float[] nativeGetTransFormMatrix();

    void release();

    void retain();
}
