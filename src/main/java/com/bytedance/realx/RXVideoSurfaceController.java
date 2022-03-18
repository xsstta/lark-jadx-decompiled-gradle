package com.bytedance.realx;

import android.view.Surface;

public class RXVideoSurfaceController {
    private static RXVideoSurfaceController instance = new RXVideoSurfaceController();
    private RXSurfaceListener mSurfaceLisener;
    private boolean usePassSurfaceMode;

    public interface RXSurfaceListener {
        void onSurfaceAvailable(Surface surface);
    }

    private RXVideoSurfaceController() {
    }

    public static RXVideoSurfaceController getInstance() {
        return instance;
    }

    public boolean usePassSurfaceMode() {
        return this.usePassSurfaceMode;
    }

    public void setPassSurfaceMode(boolean z) {
        this.usePassSurfaceMode = z;
    }

    public void setSurfaceListener(RXSurfaceListener rXSurfaceListener) {
        this.mSurfaceLisener = rXSurfaceListener;
    }

    public void setSurface(Surface surface) {
        RXSurfaceListener rXSurfaceListener = this.mSurfaceLisener;
        if (rXSurfaceListener != null) {
            rXSurfaceListener.onSurfaceAvailable(surface);
        }
    }
}
