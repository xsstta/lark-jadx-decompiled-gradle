package com.ss.android.vesdk.p3192f;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: com.ss.android.vesdk.f.a */
public class SurfaceHolder$CallbackC63987a extends C63988b implements SurfaceHolder.Callback {

    /* renamed from: a */
    SurfaceView f161601a;

    public SurfaceHolder$CallbackC63987a(SurfaceView surfaceView) {
        this(0, 0, surfaceView);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        mo221402b(surfaceHolder.getSurface());
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceView surfaceView = this.f161601a;
        if (surfaceView != null) {
            this.f161603b = surfaceView.getWidth();
            this.f161604c = this.f161601a.getHeight();
        }
        mo221382a(surfaceHolder.getSurface());
    }

    public SurfaceHolder$CallbackC63987a(int i, int i2, SurfaceView surfaceView) {
        super(i, i2);
        this.f161601a = surfaceView;
        surfaceView.getHolder().addCallback(this);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mo221383a(surfaceHolder.getSurface(), i, i2, i3);
    }
}
