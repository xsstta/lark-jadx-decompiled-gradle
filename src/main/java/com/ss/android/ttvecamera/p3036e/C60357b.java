package com.ss.android.ttvecamera.p3036e;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.ss.android.ttvecamera.C60362g;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.p3033b.C60322b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ttvecamera.e.b */
public class C60357b extends C60322b {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.p3033b.C60322b
    /* renamed from: a */
    public void mo206595a(List<Surface> list, final Handler handler) throws CameraAccessException {
        if (Build.VERSION.SDK_INT < 28 || list.size() != 1 || !this.f150845t.f150663Q) {
            C60427s.m234839a("GNOBMediaVideo2Mode", "gnob media create normal session, surface size = " + list.size() + " video stable = " + this.f150845t.f150663Q);
            super.mo206595a(list, handler);
            return;
        }
        C60427s.m234839a("GNOBMediaVideo2Mode", "gnob media create session");
        ExecutorC603581 r0 = new Executor() {
            /* class com.ss.android.ttvecamera.p3036e.C60357b.ExecutorC603581 */

            public void execute(Runnable runnable) {
                if (!handler.post(runnable)) {
                    C60427s.m234842b("GNOBMediaVideo2Mode", handler + " is shutting down");
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        for (Surface surface : list) {
            arrayList.add(new OutputConfiguration(surface));
        }
        this.f150847v.createCaptureSession(new SessionConfiguration(57355, arrayList, r0, this.f150831Q));
    }

    public C60357b(C60362g gVar, Context context, CameraManager cameraManager, Handler handler) {
        super(gVar, context, cameraManager, handler);
    }
}
