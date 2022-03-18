package com.ss.android.vesdk.p3189c;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.AbstractC60370b;

/* renamed from: com.ss.android.vesdk.c.b */
public class C63961b {

    /* renamed from: a */
    TECameraFrame.ETEPixelFormat f161516a;

    /* renamed from: b */
    TEFrameSizei f161517b;

    /* renamed from: c */
    AbstractC63962a f161518c;

    /* renamed from: d */
    boolean f161519d;

    /* renamed from: e */
    boolean f161520e;

    /* renamed from: f */
    SurfaceTexture f161521f;

    /* renamed from: g */
    public boolean f161522g;

    /* renamed from: com.ss.android.vesdk.c.b$a */
    public interface AbstractC63962a extends AbstractC60370b.AbstractC60373a {
        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        void mo206794a(SurfaceTexture surfaceTexture);

        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        void mo206795a(TECameraFrame tECameraFrame);

        /* renamed from: a */
        void mo221329a(TEFrameSizei tEFrameSizei);
    }

    /* renamed from: com.ss.android.vesdk.c.b$b */
    public interface AbstractC63963b extends AbstractC63962a {
    }

    /* renamed from: a */
    public SurfaceTexture mo221319a() {
        return this.f161521f;
    }

    /* renamed from: d */
    public TECameraFrame.ETEPixelFormat mo221324d() {
        return this.f161516a;
    }

    /* renamed from: e */
    public TEFrameSizei mo221325e() {
        return this.f161517b;
    }

    /* renamed from: f */
    public AbstractC63962a mo221326f() {
        return this.f161518c;
    }

    /* renamed from: g */
    public boolean mo221327g() {
        return this.f161519d;
    }

    /* renamed from: h */
    public boolean mo221328h() {
        return this.f161520e;
    }

    /* renamed from: c */
    public boolean mo221321c() {
        TEFrameSizei tEFrameSizei = this.f161517b;
        if (tEFrameSizei == null || tEFrameSizei.f150716a <= 0 || this.f161517b.f150717b <= 0 || this.f161518c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo221322a(SurfaceTexture surfaceTexture) {
        this.f161521f = surfaceTexture;
    }

    /* renamed from: a */
    public void mo221323a(boolean z) {
        this.f161520e = z;
    }

    public C63961b(TECameraFrame.ETEPixelFormat eTEPixelFormat, TEFrameSizei tEFrameSizei, AbstractC63962a aVar, boolean z, SurfaceTexture surfaceTexture) {
        this.f161516a = eTEPixelFormat;
        this.f161517b = tEFrameSizei;
        this.f161518c = aVar;
        this.f161519d = z;
        this.f161521f = surfaceTexture;
    }
}
