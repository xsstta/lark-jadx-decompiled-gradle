package com.he.lynx;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

public final class TextureViewHolder implements SurfaceHolder, TextureView.SurfaceTextureListener {
    private SurfaceHolder.Callback callback;
    private SurfaceTexture saved;
    private Surface surface;
    private final TextureView tv;

    public Rect getSurfaceFrame() {
        return null;
    }

    public boolean isCreating() {
        return false;
    }

    public Canvas lockCanvas() {
        return null;
    }

    public Canvas lockCanvas(Rect rect) {
        return null;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setFixedSize(int i, int i2) {
    }

    public void setFormat(int i) {
    }

    public void setKeepScreenOn(boolean z) {
    }

    public void setSizeFromLayout() {
    }

    public void setType(int i) {
    }

    public void unlockCanvasAndPost(Canvas canvas) {
    }

    public Surface getSurface() {
        return this.surface;
    }

    public void addCallback(SurfaceHolder.Callback callback2) {
        this.callback = callback2;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.saved = surfaceTexture;
        return false;
    }

    public void removeCallback(SurfaceHolder.Callback callback2) {
        this.callback = null;
    }

    public TextureViewHolder(TextureView textureView) {
        this.tv = textureView;
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null) {
            this.surface = new Surface(surfaceTexture);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceHolder.Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.surfaceChanged(this, 0, i, i2);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTexture surfaceTexture2 = this.saved;
        if (surfaceTexture2 != null) {
            this.tv.setSurfaceTexture(surfaceTexture2);
            this.saved = null;
            return;
        }
        this.surface = new Surface(surfaceTexture);
        SurfaceHolder.Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.surfaceCreated(this);
        }
    }
}
