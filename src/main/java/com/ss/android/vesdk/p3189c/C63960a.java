package com.ss.android.vesdk.p3189c;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.p3189c.C63961b;

/* renamed from: com.ss.android.vesdk.c.a */
public class C63960a extends C63961b {

    /* renamed from: h */
    private SurfaceTexture f161514h;

    /* renamed from: i */
    private int f161515i;

    @Override // com.ss.android.vesdk.p3189c.C63961b
    /* renamed from: a */
    public SurfaceTexture mo221319a() {
        return this.f161514h;
    }

    /* renamed from: b */
    public int mo221320b() {
        return this.f161515i;
    }

    @Override // com.ss.android.vesdk.p3189c.C63961b
    /* renamed from: c */
    public boolean mo221321c() {
        return super.mo221321c();
    }

    public C63960a(TEFrameSizei tEFrameSizei, C63961b.AbstractC63962a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
        super(TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_BUFFER, tEFrameSizei, aVar, z, surfaceTexture);
        this.f161514h = surfaceTexture;
        this.f161515i = i;
    }
}
