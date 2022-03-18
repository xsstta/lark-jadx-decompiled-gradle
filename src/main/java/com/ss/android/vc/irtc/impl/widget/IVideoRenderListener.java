package com.ss.android.vc.irtc.impl.widget;

public interface IVideoRenderListener {
    void onBeginRender();

    void onEndRender();

    void onRenderFrame();

    void onVideoFrameSizeChanged();
}
