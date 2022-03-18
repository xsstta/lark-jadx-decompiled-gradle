package com.he.lynx;

import android.graphics.SurfaceTexture;
import android.util.Size;
import com.he.lynx.HeliumApp;

public interface IPlatformCamera extends HeliumApp.StateCallback {

    public interface CameraEventCallback {
        void onPause();

        void onResume(boolean z, String str);
    }

    void autoFocus();

    void dispose();

    Size getCameraResolution();

    void onSurfaceTextureReady(SurfaceTexture surfaceTexture);

    void request(boolean z, boolean z2, boolean z3, int i, int i2) throws IllegalStateException;

    void setCameraEventCallback(CameraEventCallback cameraEventCallback);

    void setZoom(float f);
}
