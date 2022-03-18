package com.ss.ttm.player;

import android.view.SurfaceHolder;

public class TTSurfaceCallback implements SurfaceHolder.Callback {
    private static final String TAG = "TTSurfaceCallback";
    private ISurfaceListener mListener;

    TTSurfaceCallback(ISurfaceListener iSurfaceListener) {
        this.mListener = iSurfaceListener;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ISurfaceListener iSurfaceListener = this.mListener;
        if (iSurfaceListener != null) {
            iSurfaceListener.onSurfaceCreated(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ISurfaceListener iSurfaceListener = this.mListener;
        if (iSurfaceListener != null) {
            iSurfaceListener.onSurfaceDestroyed(surfaceHolder);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ISurfaceListener iSurfaceListener = this.mListener;
        if (iSurfaceListener != null) {
            iSurfaceListener.onSurfaceChanged(surfaceHolder);
        }
    }
}
