package com.ss.android.vesdk;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;
import com.ss.android.medialib.p2999b.C59376a;
import com.ss.android.vesdk.p3190d.C63968a;

/* renamed from: com.ss.android.vesdk.h */
public class C64022h {

    /* renamed from: a */
    protected int f161652a;

    /* renamed from: b */
    protected SurfaceTexture f161653b;

    /* renamed from: c */
    public SurfaceTexture.OnFrameAvailableListener f161654c;

    /* renamed from: d */
    protected float[] f161655d = new float[16];

    /* renamed from: e */
    private volatile boolean f161656e;

    /* renamed from: f */
    private volatile boolean f161657f;

    /* renamed from: e */
    public int mo221684e() {
        return this.f161652a;
    }

    /* renamed from: f */
    public SurfaceTexture mo221685f() {
        return this.f161653b;
    }

    /* renamed from: g */
    public boolean mo221686g() {
        return this.f161656e;
    }

    /* renamed from: a */
    public void mo221679a() {
        this.f161652a = C59376a.m230508a();
        C63968a aVar = new C63968a(this.f161652a);
        this.f161653b = aVar;
        aVar.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.ss.android.vesdk.C64022h.C640231 */

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C64022h.this.f161654c != null) {
                    C64022h.this.f161654c.onFrameAvailable(surfaceTexture);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo221681b() {
        SurfaceTexture surfaceTexture = this.f161653b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f161653b = null;
        }
        int i = this.f161652a;
        if (i != 0) {
            C59376a.m230509a(i);
            this.f161652a = 0;
        }
    }

    /* renamed from: c */
    public void mo221682c() {
        if (this.f161656e) {
            this.f161653b.attachToGLContext(this.f161652a);
            this.f161656e = false;
        }
        if (this.f161657f) {
            this.f161657f = false;
            this.f161653b.detachFromGLContext();
            GLES20.glGenTextures(1, new int[1], 0);
        }
        this.f161653b.updateTexImage();
    }

    /* renamed from: d */
    public double mo221683d() {
        long j;
        if (this.f161653b == null) {
            return -1.0d;
        }
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - this.f161653b.getTimestamp());
        if (Build.VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - this.f161653b.getTimestamp());
        } else {
            j = Long.MAX_VALUE;
        }
        return ((double) (nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.f161653b.getTimestamp())))) / 1000000.0d;
    }

    /* renamed from: a */
    public void mo221680a(SurfaceTexture surfaceTexture) {
        this.f161653b = surfaceTexture;
    }
}
