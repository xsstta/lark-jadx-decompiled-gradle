package com.ss.android.ttvecamera.p3038g;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.a */
public class C60368a extends AbstractC60370b {

    /* renamed from: h */
    private static final String f150899h = "a";

    /* renamed from: a */
    Camera.PreviewCallback f150900a;

    /* renamed from: i */
    private int f150901i;

    /* renamed from: j */
    private SurfaceTexture f150902j;

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public Surface mo206779a() {
        return null;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: c */
    public int mo206783c() {
        return 4;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: e */
    public void mo206785e() {
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: b */
    public SurfaceTexture mo206782b() {
        return this.f150902j;
    }

    /* renamed from: d */
    public Camera.PreviewCallback mo206784d() {
        return this.f150900a;
    }

    /* renamed from: a */
    public byte[][] mo206781a(int i) {
        int[] iArr = new int[2];
        iArr[1] = ((this.f150907d.f150716a * this.f150907d.f150717b) * 3) / 2;
        iArr[0] = i;
        return (byte[][]) Array.newInstance(byte.class, iArr);
    }

    /* renamed from: a */
    public boolean mo206780a(byte[] bArr) {
        int i;
        int i2;
        boolean z;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (i > 0 && this.f150907d != null && (i2 = this.f150901i) < 3) {
            this.f150901i = i2 + 1;
            int i3 = this.f150907d.f150716a * this.f150907d.f150717b;
            int i4 = i3 / LocationRequest.PRIORITY_INDOOR;
            int i5 = i4 / 2;
            byte b = bArr[0];
            byte b2 = bArr[i3];
            int i6 = 0;
            while (true) {
                if (i6 >= 300) {
                    z = false;
                    break;
                } else if (b == bArr[i6 * i4] && b2 == bArr[(i6 * i5) + i3]) {
                    i6++;
                } else {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public C60368a(C60375c.C60376a aVar, AbstractC60396i iVar) {
        super(aVar, iVar);
        this.f150902j = aVar.f150919d;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public int mo206778a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f150907d = C60410n.m234778a(list, tEFrameSizei);
        }
        this.f150902j.setDefaultBufferSize(this.f150907d.f150716a, this.f150907d.f150717b);
        this.f150900a = new Camera.PreviewCallback() {
            /* class com.ss.android.ttvecamera.p3038g.C60368a.C603691 */

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                if (C60368a.this.mo206780a(bArr)) {
                    TECameraFrame tECameraFrame = new TECameraFrame(C60368a.this.f150907d.f150716a, C60368a.this.f150907d.f150717b, System.currentTimeMillis() * 1000);
                    tECameraFrame.mo206369a(bArr, C60368a.this.f150908e.mo206839M(), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, C60368a.this.f150908e.mo206834H().f150676e);
                    C60368a.this.mo206788a(tECameraFrame);
                }
                if (camera != null) {
                    camera.addCallbackBuffer(bArr);
                }
            }
        };
        return 0;
    }
}
