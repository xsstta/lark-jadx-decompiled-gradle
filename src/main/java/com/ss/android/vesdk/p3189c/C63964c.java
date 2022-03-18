package com.ss.android.vesdk.p3189c;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.p3189c.C63961b;

/* renamed from: com.ss.android.vesdk.c.c */
public class C63964c extends C63961b {

    /* renamed from: h */
    private Surface f161523h;

    /* renamed from: i */
    private int f161524i;

    /* renamed from: b */
    public Surface mo221330b() {
        return this.f161523h;
    }

    /* renamed from: i */
    public int mo221331i() {
        return this.f161524i;
    }

    @Override // com.ss.android.vesdk.p3189c.C63961b
    /* renamed from: c */
    public boolean mo221321c() {
        if (!super.mo221321c() || this.f161523h == null) {
            return false;
        }
        return true;
    }

    public C63964c(TEFrameSizei tEFrameSizei, C63961b.AbstractC63962a aVar, boolean z, int i, SurfaceTexture surfaceTexture, Surface surface) {
        super(TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder, tEFrameSizei, aVar, z, surfaceTexture);
        this.f161523h = surface;
        this.f161524i = i;
        Log.d("TERecorderCapturePipeline", "constructor");
    }
}
