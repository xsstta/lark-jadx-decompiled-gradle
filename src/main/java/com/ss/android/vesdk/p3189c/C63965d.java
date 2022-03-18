package com.ss.android.vesdk.p3189c;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.p3189c.C63961b;

/* renamed from: com.ss.android.vesdk.c.d */
public class C63965d extends C63961b {

    /* renamed from: h */
    private int f161525h;

    /* renamed from: i */
    private SurfaceTexture f161526i;

    @Override // com.ss.android.vesdk.p3189c.C63961b
    /* renamed from: a */
    public SurfaceTexture mo221319a() {
        return this.f161526i;
    }

    /* renamed from: b */
    public int mo221332b() {
        return this.f161525h;
    }

    @Override // com.ss.android.vesdk.p3189c.C63961b
    /* renamed from: c */
    public boolean mo221321c() {
        if (!super.mo221321c() || this.f161526i == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vesdk.p3189c.C63961b
    /* renamed from: a */
    public void mo221322a(SurfaceTexture surfaceTexture) {
        this.f161526i = surfaceTexture;
    }

    public C63965d(TEFrameSizei tEFrameSizei, C63961b.AbstractC63962a aVar, boolean z, int i, SurfaceTexture surfaceTexture) {
        super(TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES, tEFrameSizei, aVar, z, surfaceTexture);
        this.f161525h = i;
        this.f161526i = surfaceTexture;
    }
}
