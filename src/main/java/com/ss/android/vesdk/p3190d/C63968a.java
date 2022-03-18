package com.ss.android.vesdk.p3190d;

import android.graphics.SurfaceTexture;
import android.os.Build;

/* renamed from: com.ss.android.vesdk.d.a */
public class C63968a extends SurfaceTexture {

    /* renamed from: a */
    private boolean f161527a;

    public boolean isReleased() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.isReleased();
        }
        return this.f161527a;
    }

    public synchronized void detachFromGLContext() {
        if (!isReleased()) {
            super.detachFromGLContext();
        }
    }

    public synchronized long getTimestamp() {
        if (isReleased()) {
            return -1;
        }
        return super.getTimestamp();
    }

    public synchronized void release() {
        if (!isReleased()) {
            super.release();
            this.f161527a = true;
        }
    }

    public synchronized void releaseTexImage() {
        if (!isReleased()) {
            super.releaseTexImage();
        }
    }

    public synchronized void updateTexImage() {
        if (!isReleased()) {
            super.updateTexImage();
        }
    }

    public C63968a(int i) {
        super(i);
    }

    public synchronized void attachToGLContext(int i) {
        if (!isReleased()) {
            super.attachToGLContext(i);
        }
    }

    public synchronized void getTransformMatrix(float[] fArr) {
        if (!isReleased()) {
            super.getTransformMatrix(fArr);
        }
    }

    public synchronized void setDefaultBufferSize(int i, int i2) {
        if (!isReleased()) {
            super.setDefaultBufferSize(i, i2);
        }
    }
}
