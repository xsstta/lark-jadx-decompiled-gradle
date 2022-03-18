package com.ss.android.ttvecamera.p3038g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.g */
public class C60383g extends AbstractC60370b {

    /* renamed from: a */
    SurfaceTexture f150938a;

    /* renamed from: h */
    Surface f150939h;

    /* renamed from: i */
    float[] f150940i = new float[16];

    /* renamed from: j */
    int f150941j;

    /* renamed from: k */
    SurfaceTexture.OnFrameAvailableListener f150942k = new SurfaceTexture.OnFrameAvailableListener() {
        /* class com.ss.android.ttvecamera.p3038g.C60383g.C603841 */

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (C60383g.this.f150908e != null) {
                surfaceTexture.getTransformMatrix(C60383g.this.f150940i);
                TECameraFrame tECameraFrame = new TECameraFrame(C60383g.this.f150907d.f150716a, C60383g.this.f150907d.f150717b, surfaceTexture.getTimestamp());
                tECameraFrame.mo206367a(C60383g.this.f150941j, C60383g.this.f150908e.mo206839M(), C60383g.this.f150940i, C60383g.this.f150906c, C60383g.this.f150908e.mo206840N());
                C60383g.this.mo206788a(tECameraFrame);
            }
        }
    };

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: c */
    public int mo206783c() {
        return 1;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public Surface mo206779a() {
        return this.f150939h;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: b */
    public SurfaceTexture mo206782b() {
        return this.f150938a;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: h */
    public void mo206791h() {
        super.mo206791h();
        Surface surface = this.f150939h;
        if (surface != null) {
            surface.release();
            this.f150939h = null;
        }
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: e */
    public void mo206785e() {
        Surface surface = this.f150939h;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f150938a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f150938a = new SurfaceTexture(this.f150941j);
        this.f150939h = new Surface(this.f150938a);
        this.f150905b.mo206794a(this.f150938a);
    }

    /* renamed from: a */
    private void m234607a(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f150938a.setOnFrameAvailableListener(onFrameAvailableListener, this.f150908e.mo206841O());
        } else {
            this.f150938a.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    public C60383g(C60375c.C60376a aVar, AbstractC60396i iVar) {
        super(aVar, iVar);
        this.f150938a = aVar.f150919d;
        this.f150941j = aVar.f150920e;
        this.f150939h = new Surface(this.f150938a);
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public int mo206787a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (!this.f150908e.mo206834H().f150669W) {
            return mo206778a(m234551a(outputSizes), tEFrameSizei);
        }
        return mo206778a(C60410n.m234782a(m234551a(outputSizes), m234551a(streamConfigurationMap.getOutputSizes(MediaRecorder.class))), tEFrameSizei);
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public int mo206778a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f150907d = C60410n.m234778a(list, this.f150907d);
        }
        this.f150938a.setDefaultBufferSize(this.f150907d.f150716a, this.f150907d.f150717b);
        m234607a(this.f150942k);
        return 0;
    }
}
