package com.ss.ttm.player;

import android.view.SurfaceHolder;

public interface ISurfaceListener {
    void onSurfaceChanged(SurfaceHolder surfaceHolder);

    void onSurfaceCreated(SurfaceHolder surfaceHolder);

    void onSurfaceDestroyed(SurfaceHolder surfaceHolder);
}
