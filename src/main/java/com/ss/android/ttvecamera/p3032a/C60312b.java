package com.ss.android.ttvecamera.p3032a;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60362g;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.p3034c.C60335g;
import com.ss.android.ttvecamera.p3035d.AbstractC60347b;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.a.b */
public class C60312b extends AbstractC60347b {

    /* renamed from: a */
    private static final String f150719a = "b";

    /* renamed from: b */
    private C60310a f150720b;

    /* renamed from: a */
    public void mo206560a(CameraDevice cameraDevice, int i, int i2) {
    }

    /* renamed from: a */
    public void mo206557a() {
        C60427s.m234842b(f150719a, "closeARSession not supported");
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a.AbstractC60325a
    /* renamed from: c */
    public int mo206562c() {
        if (this.f150840o == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "rollbackNormalSessionRequest : param is null.", this.f150847v);
            return -100;
        }
        this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f150840o.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
        mo206707d(this.f150840o);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a.AbstractC60325a
    /* renamed from: d */
    public int mo206563d() {
        if (this.f150840o == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "rollbackNormalSessionRequest : param is null.", this.f150847v);
            return -100;
        }
        if (this.f150820F) {
            mo206701b(this.f150840o);
        }
        this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
        mo206707d(this.f150840o);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: b */
    public int mo206561b() throws Exception {
        Handler handler;
        C60375c J = this.f150844s.mo206836J();
        if (this.f150847v == null || J == null) {
            C60427s.m234842b(f150719a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int o = super.mo206715o();
        if (o != 0) {
            return o;
        }
        this.f150840o = this.f150847v.createCaptureRequest(3);
        ArrayList<Surface> arrayList = new ArrayList();
        if (J.mo206800b().mo206783c() == 8) {
            arrayList.addAll(Arrays.asList(J.mo206803e()));
        } else {
            arrayList.add(J.mo206802d());
        }
        for (Surface surface : arrayList) {
            this.f150840o.addTarget(surface);
        }
        this.f150824J = false;
        this.f150825K = System.currentTimeMillis();
        if (this.f150845t.f150682k) {
            handler = mo206685A();
        } else {
            handler = this.f150848w;
        }
        this.f150841p = null;
        this.f150847v.createCaptureSession(arrayList, this.f150831Q, handler);
        if (this.f150841p == null) {
            mo206688D();
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60346a
    /* renamed from: a */
    public void mo206558a(int i) {
        if (this.f150840o == null) {
            String str = f150719a;
            C60427s.m234844d(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C60427s.m234844d(str, "switchFlashMode: " + "CaptureRequest.Builder is null");
            AbstractC60396i.AbstractC60397a aVar = this.f150843r;
            int i2 = this.f150845t.f150674c;
            aVar.mo206499a(i2, -100, "switchFlashMode:" + "CaptureRequest.Builder is null", this.f150847v);
            return;
        }
        if (i == 0) {
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f150840o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i != 2) {
            String str2 = f150719a;
            C60427s.m234843c(str2, "Video Mode not support this mode : " + i);
            return;
        } else {
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f150840o.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f150845t.f150672Z = i;
        AbstractC60347b.C60353a d = mo206707d(this.f150840o);
        if (!d.mo206733a()) {
            String str3 = f150719a;
            C60427s.m234844d(str3, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + d.mo206734b());
            AbstractC60396i.AbstractC60397a aVar2 = this.f150843r;
            aVar2.mo206502b(-418, -418, "switch flash failed." + d.mo206734b(), this.f150847v);
        }
    }

    /* renamed from: a */
    public void mo206559a(Context context, Handler handler) {
        if (this.f150839n.mo206824b()) {
            C60310a a = C60310a.m234246a();
            this.f150720b = a;
            a.mo206556a(context, null);
            this.f150720b.mo206555a(handler);
        }
    }

    public C60312b(C60362g gVar, Context context, CameraManager cameraManager, Handler handler) {
        super(gVar, context, handler);
        this.f150842q = cameraManager;
        this.f150846u = new C60335g(this);
    }
}
