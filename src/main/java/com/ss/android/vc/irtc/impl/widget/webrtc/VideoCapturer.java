package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;

public interface VideoCapturer {
    void changeCaptureFormat(int i, int i2, int i3);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i, int i2, int i3);

    void stopCapture() throws InterruptedException;
}
