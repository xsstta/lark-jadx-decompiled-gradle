package com.ss.android.ttvecamera.p3038g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.f */
public class C60381f extends AbstractC60370b {

    /* renamed from: a */
    public float[] f150932a = new float[16];

    /* renamed from: h */
    int f150933h;

    /* renamed from: i */
    private Surface f150934i;

    /* renamed from: j */
    private Surface f150935j;

    /* renamed from: k */
    private SurfaceTexture f150936k;

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: c */
    public int mo206783c() {
        return 16;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: b */
    public SurfaceTexture mo206782b() {
        return this.f150936k;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: i */
    public Surface mo206792i() {
        return this.f150934i;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: h */
    public void mo206791h() {
        super.mo206791h();
        Surface surface = this.f150935j;
        if (surface != null) {
            surface.release();
            this.f150935j = null;
        }
        Surface surface2 = this.f150934i;
        if (surface2 != null) {
            surface2.release();
            this.f150934i = null;
        }
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: e */
    public void mo206785e() {
        Surface surface = this.f150935j;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f150936k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f150936k = new SurfaceTexture(this.f150933h);
        this.f150935j = new Surface(this.f150936k);
        this.f150905b.mo206794a(this.f150936k);
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public Surface mo206779a() {
        Log.d("TERecorderProvider", "get preview surface");
        return this.f150935j;
    }

    /* renamed from: a */
    private void m234598a(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f150936k.setOnFrameAvailableListener(onFrameAvailableListener, this.f150908e.mo206841O());
        } else {
            this.f150936k.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public int mo206787a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return mo206778a(m234551a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    public C60381f(C60375c.C60376a aVar, AbstractC60396i iVar) {
        super(aVar, iVar);
        this.f150936k = aVar.f150919d;
        this.f150933h = aVar.f150920e;
        this.f150935j = new Surface(aVar.f150919d);
        this.f150934i = aVar.f150922g;
        Log.d("TERecorderProvider", "constructor");
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public int mo206778a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f150907d = C60410n.m234778a(list, this.f150907d);
        }
        this.f150936k.setDefaultBufferSize(this.f150907d.f150716a, this.f150907d.f150717b);
        m234598a(new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.ss.android.ttvecamera.p3038g.C60381f.C603821 */

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C60381f.this.f150908e != null) {
                    surfaceTexture.getTransformMatrix(C60381f.this.f150932a);
                    TECameraFrame tECameraFrame = new TECameraFrame(C60381f.this.f150907d.f150716a, C60381f.this.f150907d.f150717b, surfaceTexture.getTimestamp());
                    tECameraFrame.mo206367a(C60381f.this.f150933h, C60381f.this.f150908e.mo206839M(), C60381f.this.f150932a, C60381f.this.f150906c, C60381f.this.f150908e.mo206840N());
                    C60381f.this.mo206788a(tECameraFrame);
                }
            }
        });
        return 0;
    }
}
