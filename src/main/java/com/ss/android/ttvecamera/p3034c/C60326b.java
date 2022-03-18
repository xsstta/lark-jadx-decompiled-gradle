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

/* renamed from: com.ss.android.ttvecamera.c.b */
public class C60326b extends AbstractC60330d {

    /* renamed from: a */
    public final AbstractC60324a.AbstractC60325a f150749a;

    /* renamed from: b */
    public AtomicBoolean f150750b;

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public int mo206598a() {
        return this.f150749a.mo206562c();
    }

    public C60326b(AbstractC60324a.AbstractC60325a aVar) {
        this.f150749a = aVar;
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
            /* class com.ss.android.ttvecamera.p3034c.C60326b.C603282 */

            /* renamed from: c */
            private boolean f150758c;

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && C60326b.this.f150767c != null) {
                    C60326b.this.f150767c.mo206893a().mo206916a(-411, C60326b.this.f150768d.f150676e, captureFailure.toString());
                }
                C60427s.m234844d("TEFocusAndMeterStrategy", "Manual Metering Failed: " + captureFailure);
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C60427s.m234843c("TEFocusAndMeterStrategy", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && C60326b.this.f150767c != null && !this.f150758c) {
                        C60326b.this.f150767c.mo206893a().mo206916a(C60326b.this.f150767c.mo206901c(), C60326b.this.f150768d.f150676e, "Done");
                        this.f150758c = true;
                    }
                    C60326b.this.f150749a.mo206563d();
                }
                if (C60326b.this.f150769e) {
                    C60326b.this.f150769e = C60410n.m234786a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: b */
    public void mo206603b(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public void mo206602a(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a
    /* renamed from: a */
    public CameraCaptureSession.CaptureCallback mo206599a(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z) {
        this.f150750b = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3034c.C60326b.C603271 */

            /* renamed from: d */
            private int f150754d = -1;

            /* renamed from: e */
            private boolean f150755e;

            /* renamed from: a */
            private void m234309a() {
                if (C60326b.this.f150750b != null) {
                    C60326b.this.f150750b.set(false);
                }
            }

            /* renamed from: b */
            private void m234310b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    C60326b.this.f150749a.mo206604a(builder);
                }
                m234309a();
            }

            public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                C60427s.m234844d("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
                C60326b.this.f150767c.mo206893a().mo206916a(-438, C60326b.this.f150768d.f150676e, "Manual Focus capture abort ");
                m234310b();
            }

            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                C60427s.m234842b("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
            }

            public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                C60427s.m234842b("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
                m234309a();
            }

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                C60427s.m234844d("TEFocusAndMeterStrategy", "Manual Focus Failed: " + captureFailure);
                C60326b.this.f150767c.mo206893a().mo206916a(-411, C60326b.this.f150768d.f150676e, captureFailure.toString());
                m234310b();
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C60427s.m234843c("TEFocusAndMeterStrategy", "Focus failed.");
                    m234309a();
                    return;
                }
                boolean z = false;
                if (this.f150754d != num.intValue()) {
                    C60427s.m234839a("TEFocusAndMeterStrategy", "Focus onCaptureCompleted! afState = " + num);
                    z = true;
                }
                this.f150754d = num.intValue();
                if (z && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        C60326b.this.f150749a.mo206604a(builder);
                    } else {
                        C60326b.this.f150749a.mo206562c();
                    }
                    if (!this.f150755e) {
                        this.f150755e = true;
                        C60326b.this.f150767c.mo206893a().mo206916a(C60326b.this.f150767c.mo206901c(), C60326b.this.f150768d.f150676e, "Done");
                    }
                    m234309a();
                    C60427s.m234839a("TEFocusAndMeterStrategy", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f150755e || num.intValue() == 4 || num.intValue() == 5)) {
                    C60427s.m234844d("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    C60326b.this.f150749a.mo206562c();
                }
                if (C60326b.this.f150769e) {
                    C60326b.this.f150769e = C60410n.m234786a(totalCaptureResult);
                }
            }

            public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                C60427s.m234842b("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
            }

            public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                C60427s.m234844d("TEFocusAndMeterStrategy", "Manual Focus capture buffer lost ");
                C60326b.this.f150767c.mo206893a().mo206916a(-411, C60326b.this.f150767c.mo206901c(), "Manual Focus capture buffer lost ");
                m234310b();
            }
        };
    }
}
