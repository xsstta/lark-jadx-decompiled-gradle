package com.ss.android.ttvecamera.p3034c;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.p3034c.AbstractC60324a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.c.g */
public class C60335g extends AbstractC60330d {

    /* renamed from: a */
    public final AbstractC60324a.AbstractC60325a f150780a;

    /* renamed from: b */
    public AtomicBoolean f150781b;

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public int mo206598a() {
        return this.f150780a.mo206562c();
    }

    public C60335g(AbstractC60324a.AbstractC60325a aVar) {
        this.f150780a = aVar;
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public void mo206601a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public CameraCaptureSession.CaptureCallback mo206600a(CaptureRequest.Builder builder, final boolean z) {
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3034c.C60335g.C603372 */

            /* renamed from: c */
            private boolean f150789c;

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && C60335g.this.f150767c != null) {
                    C60335g.this.f150767c.mo206893a().mo206916a(-411, C60335g.this.f150768d.f150676e, captureFailure.toString());
                }
                C60427s.m234844d("TEVideoFocus", "Manual Metering Failed: " + captureFailure);
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C60427s.m234843c("TEVideoFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && C60335g.this.f150767c != null && !this.f150789c) {
                        C60335g.this.f150767c.mo206893a().mo206916a(C60335g.this.f150767c.mo206901c(), C60335g.this.f150768d.f150676e, "Done");
                        this.f150789c = true;
                    }
                    C60335g.this.f150780a.mo206563d();
                }
                if (C60335g.this.f150769e) {
                    C60335g.this.f150769e = C60410n.m234786a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: b */
    public void mo206603b(CaptureRequest.Builder builder, Rect rect) {
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
        this.f150781b = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3034c.C60335g.C603361 */

            /* renamed from: d */
            private int f150785d = -1;

            /* renamed from: e */
            private boolean f150786e;

            /* renamed from: a */
            private void m234335a() {
                if (C60335g.this.f150781b != null) {
                    C60335g.this.f150781b.set(false);
                }
            }

            /* renamed from: b */
            private void m234336b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    C60335g.this.f150780a.mo206604a(builder);
                }
                m234335a();
            }

            public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                C60427s.m234844d("TEVideoFocus", "Manual Focus capture abort ");
                C60335g.this.f150767c.mo206893a().mo206916a(-438, C60335g.this.f150768d.f150676e, "Manual Focus capture abort ");
                m234336b();
            }

            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                C60427s.m234839a("TEVideoFocus", "Focus onCaptureProgressed!");
            }

            public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                C60427s.m234839a("TEVideoFocus", "Focus onCaptureSequenceCompleted!");
                m234335a();
            }

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                C60427s.m234844d("TEVideoFocus", "Manual Focus Failed: " + captureFailure);
                C60335g.this.f150767c.mo206893a().mo206916a(-411, C60335g.this.f150768d.f150676e, captureFailure.toString());
                m234336b();
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                    C60427s.m234843c("TEVideoFocus", "Not focus request!");
                    m234335a();
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C60427s.m234843c("TEVideoFocus", "Focus failed.");
                    m234335a();
                    return;
                }
                if (this.f150785d != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        C60335g.this.f150780a.mo206604a(builder);
                    } else {
                        C60335g.this.f150780a.mo206562c();
                    }
                    if (!this.f150786e) {
                        this.f150786e = true;
                        C60335g.this.f150767c.mo206893a().mo206916a(C60335g.this.f150767c.mo206901c(), C60335g.this.f150768d.f150676e, "Done");
                    }
                    m234335a();
                    C60427s.m234839a("TEVideoFocus", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f150786e || num.intValue() == 4 || num.intValue() == 5)) {
                    C60427s.m234844d("TEVideoFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    C60335g.this.f150780a.mo206562c();
                }
                this.f150785d = num.intValue();
                if (C60335g.this.f150769e) {
                    C60335g.this.f150769e = C60410n.m234786a(totalCaptureResult);
                }
            }

            public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                C60427s.m234839a("TEVideoFocus", "Focus onCaptureStarted!");
            }

            public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                C60427s.m234844d("TEVideoFocus", "Manual Focus capture buffer lost ");
                C60335g.this.f150767c.mo206893a().mo206916a(-411, C60335g.this.f150767c.mo206901c(), "Manual Focus capture buffer lost ");
                m234336b();
            }
        };
    }
}
