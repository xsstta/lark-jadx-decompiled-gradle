package com.ss.android.ad.splash.core.video;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video.g */
public class SurfaceHolder$CallbackC27408g implements SurfaceHolder.Callback {

    /* renamed from: a */
    private WeakReference<SurfaceHolder.Callback> f68509a;

    /* renamed from: a */
    public SurfaceHolder.Callback mo97888a() {
        return this.f68509a.get();
    }

    public SurfaceHolder$CallbackC27408g(SurfaceHolder.Callback callback) {
        this.f68509a = new WeakReference<>(callback);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f68509a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f68509a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.f68509a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
