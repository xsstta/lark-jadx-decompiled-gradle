package com.ss.android.ttvecamera.p3033b;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60362g;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.p3034c.C60335g;
import com.ss.android.ttvecamera.p3034c.C60338h;
import com.ss.android.ttvecamera.p3035d.AbstractC60347b;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.b.b */
public class C60322b extends AbstractC60347b {

    /* renamed from: a */
    private static final String f150748a = "b";

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    public int bu_() {
        return super.bu_();
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    public int bv_() {
        return super.bv_();
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
            C60427s.m234842b(f150748a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int o = super.mo206715o();
        if (o != 0) {
            return o;
        }
        this.f150840o = this.f150847v.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        if (J.mo206800b().mo206783c() == 8) {
            arrayList.addAll(Arrays.asList(J.mo206803e()));
        } else if (J.mo206800b().mo206783c() == 16) {
            arrayList.add(J.mo206802d());
            arrayList.add(J.mo206800b().mo206792i());
        } else {
            arrayList.add(J.mo206802d());
        }
        boolean z = false;
        for (Surface surface : arrayList) {
            this.f150840o.addTarget(surface);
            if (!surface.isValid()) {
                z = true;
            }
        }
        if (z) {
            C60427s.m234844d(f150748a, "start preview may be failed, surface invalid...");
        }
        this.f150824J = false;
        this.f150825K = System.currentTimeMillis();
        if (this.f150845t.f150682k) {
            handler = mo206685A();
        } else {
            handler = this.f150848w;
        }
        this.f150841p = null;
        mo206595a(arrayList, handler);
        if (this.f150841p == null) {
            mo206688D();
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60346a
    /* renamed from: a */
    public void mo206558a(int i) {
        int i2;
        int i3;
        int i4 = 0;
        if (this.f150840o == null) {
            String str = f150748a;
            C60427s.m234844d(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C60427s.m234844d(str, "switchFlashMode: " + "CaptureRequest.Builder is null");
            AbstractC60396i.AbstractC60397a aVar = this.f150843r;
            int i5 = this.f150845t.f150674c;
            aVar.mo206499a(i5, -100, "switchFlashMode:" + "CaptureRequest.Builder is null", this.f150847v);
            AbstractC60396i.AbstractC60397a aVar2 = this.f150843r;
            int i6 = this.f150845t.f150674c;
            if (i == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            aVar2.mo206505d(i6, -100, i3, "switchFlashMode:" + "CaptureRequest.Builder is null", this.f150847v);
            return;
        }
        if (i == 0) {
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f150840o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i != 2) {
            String str2 = f150748a;
            C60427s.m234844d(str2, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode " + i);
            C60427s.m234843c(str2, "Video Mode not support this mode : " + i);
            AbstractC60396i.AbstractC60397a aVar3 = this.f150843r;
            int i7 = this.f150845t.f150674c;
            aVar3.mo206505d(i7, -100, -1, "Video Mode not support this mode : " + i, this.f150847v);
            return;
        } else {
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f150840o.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f150845t.f150672Z = i;
        AbstractC60396i.AbstractC60397a aVar4 = this.f150843r;
        aVar4.mo206502b(104, 0, "camera2 will change flash mode " + i, null);
        AbstractC60347b.C60353a d = mo206707d(this.f150840o);
        AbstractC60396i.AbstractC60397a aVar5 = this.f150843r;
        aVar5.mo206502b(LocationRequest.PRIORITY_NO_POWER, 0, "camera2 did change flash mode " + i, null);
        if (!d.mo206733a()) {
            String str3 = f150748a;
            C60427s.m234844d(str3, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + d.mo206734b());
            AbstractC60396i.AbstractC60397a aVar6 = this.f150843r;
            aVar6.mo206502b(-418, -418, "switch flash failed." + d.mo206734b(), this.f150847v);
            AbstractC60396i.AbstractC60397a aVar7 = this.f150843r;
            int i8 = this.f150845t.f150674c;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            aVar7.mo206505d(i8, -418, i2, "switch flash failed." + d.mo206734b(), this.f150847v);
            return;
        }
        AbstractC60396i.AbstractC60397a aVar8 = this.f150843r;
        int i9 = this.f150845t.f150674c;
        if (i != 0) {
            i4 = 1;
        }
        aVar8.mo206503c(i9, 0, i4, "torch success", this.f150847v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo206595a(List<Surface> list, Handler handler) throws CameraAccessException {
        this.f150847v.createCaptureSession(list, this.f150831Q, handler);
    }

    public C60322b(C60362g gVar, Context context, CameraManager cameraManager, Handler handler) {
        super(gVar, context, handler);
        this.f150842q = cameraManager;
        if (this.f150845t.f150684m) {
            this.f150846u = new C60338h(this);
        } else {
            this.f150846u = new C60335g(this);
        }
    }
}
