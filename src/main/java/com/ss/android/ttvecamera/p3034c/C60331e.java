package com.ss.android.ttvecamera.p3034c;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.view.Surface;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.p3034c.AbstractC60324a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.c.e */
public class C60331e extends AbstractC60330d {

    /* renamed from: a */
    public AtomicBoolean f150770a;

    /* renamed from: b */
    protected AbstractC60324a.AbstractC60325a f150771b;

    /* renamed from: f */
    public boolean f150772f = true;

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public int mo206598a() {
        return this.f150771b.mo206562c();
    }

    public C60331e(AbstractC60324a.AbstractC60325a aVar) {
        this.f150771b = aVar;
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public void mo206601a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public CameraCaptureSession.CaptureCallback mo206600a(CaptureRequest.Builder builder, final boolean z) {
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3034c.C60331e.C603332 */

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && C60331e.this.f150767c != null) {
                    C60331e.this.f150767c.mo206893a().mo206916a(-411, C60331e.this.f150768d.f150676e, captureFailure.toString());
                }
                C60427s.m234844d("TEImageFocus", "Manual Metering Failed: " + captureFailure);
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C60427s.m234843c("TEImageFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && C60331e.this.f150767c != null) {
                        C60331e.this.f150767c.mo206893a().mo206916a(C60331e.this.f150767c.mo206901c(), C60331e.this.f150768d.f150676e, "Done");
                    }
                    C60331e.this.f150771b.mo206563d();
                }
                if (C60331e.this.f150772f) {
                    C60331e.this.f150772f = C60410n.m234786a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: b */
    public void mo206603b(CaptureRequest.Builder builder, Rect rect) {
        if (Build.VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public void mo206602a(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public CameraCaptureSession.CaptureCallback mo206599a(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z) {
        this.f150770a = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3034c.C60331e.C603321 */

            /* renamed from: d */
            private int f150776d = -1;

            /* renamed from: e */
            private boolean f150777e;

            /* renamed from: a */
            private void m234326a() {
                if (C60331e.this.f150770a != null) {
                    C60331e.this.f150770a.set(false);
                }
            }

            /* renamed from: b */
            private void m234327b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    C60331e.this.f150771b.mo206604a(builder);
                }
                m234326a();
            }

            public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                C60427s.m234844d("TEImageFocus", "Manual Focus capture abort ");
                C60331e.this.f150767c.mo206893a().mo206916a(-438, C60331e.this.f150768d.f150676e, "Manual Focus capture abort ");
                m234327b();
            }

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                C60427s.m234844d("TEImageFocus", "Manual Focus Failed: " + captureFailure);
                C60331e.this.f150767c.mo206893a().mo206916a(-411, C60331e.this.f150768d.f150676e, captureFailure.toString());
                m234327b();
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                    C60427s.m234843c("TEImageFocus", "Not focus request!");
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C60427s.m234843c("TEImageFocus", "Focus failed.");
                    m234326a();
                    return;
                }
                if (this.f150776d != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        C60331e.this.f150771b.mo206604a(builder);
                    } else {
                        C60331e.this.f150771b.mo206562c();
                    }
                    if (!this.f150777e) {
                        this.f150777e = true;
                        C60331e.this.f150767c.mo206893a().mo206916a(C60331e.this.f150767c.mo206901c(), C60331e.this.f150768d.f150676e, "Done");
                    }
                    m234326a();
                    C60427s.m234839a("TEImageFocus", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f150777e || num.intValue() == 4 || num.intValue() == 5)) {
                    C60427s.m234844d("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    C60331e.this.f150771b.mo206562c();
                }
                this.f150776d = num.intValue();
                if (C60331e.this.f150772f) {
                    C60331e.this.f150772f = C60410n.m234786a(totalCaptureResult);
                }
            }

            public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                C60427s.m234844d("TEImageFocus", "Manual Focus capture buffer lost ");
                C60331e.this.f150767c.mo206893a().mo206916a(-411, C60331e.this.f150768d.f150676e, "Manual Focus capture buffer lost ");
                m234327b();
            }
        };
    }
}
