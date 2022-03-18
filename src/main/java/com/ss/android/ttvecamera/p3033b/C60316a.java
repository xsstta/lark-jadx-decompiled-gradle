package com.ss.android.ttvecamera.p3033b;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.ttvecamera.C60362g;
import com.ss.android.ttvecamera.C60408m;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.C60420o;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.C60435v;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3034c.C60331e;
import com.ss.android.ttvecamera.p3034c.C60334f;
import com.ss.android.ttvecamera.p3035d.AbstractC60347b;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.b.a */
public class C60316a extends AbstractC60347b {

    /* renamed from: S */
    private final Handler f150721S = new Handler(Looper.getMainLooper());

    /* renamed from: T */
    private boolean f150722T = false;

    /* renamed from: U */
    private boolean f150723U = false;

    /* renamed from: V */
    private boolean f150724V = false;

    /* renamed from: W */
    private boolean f150725W = true;

    /* renamed from: X */
    private int f150726X = 0;

    /* renamed from: a */
    public long f150727a;

    /* renamed from: b */
    public final HandlerC60321a f150728b;

    /* renamed from: c */
    protected ImageReader f150729c;

    /* renamed from: d */
    public int f150730d = 0;

    /* renamed from: e */
    public int f150731e;

    /* renamed from: f */
    public boolean f150732f = false;

    /* renamed from: g */
    public boolean f150733g = false;

    /* renamed from: h */
    public boolean f150734h = false;

    /* renamed from: i */
    public int f150735i = 0;

    /* renamed from: j */
    public int f150736j = 0;

    /* renamed from: k */
    public long f150737k = 0;

    /* renamed from: l */
    public TECameraSettings.AbstractC60302i f150738l;

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: k */
    public int mo206584k() {
        return this.f150726X;
    }

    /* renamed from: I */
    private void m234262I() {
        this.f150832R = new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3033b.C60316a.C603171 */

            /* renamed from: b */
            private Integer f150740b = -1;

            /* renamed from: c */
            private Integer f150741c = -1;

            /* renamed from: d */
            private Integer f150742d = -1;

            /* renamed from: e */
            private Integer f150743e = -1;

            /* renamed from: a */
            private void m234286a(CaptureResult captureResult) {
                int i;
                int i2;
                int i3;
                int i4;
                boolean z;
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_MODE);
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                Integer valueOf = Integer.valueOf(i);
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = -1;
                }
                Integer valueOf2 = Integer.valueOf(i2);
                if (num3 != null) {
                    i3 = num3.intValue();
                } else {
                    i3 = -1;
                }
                Integer valueOf3 = Integer.valueOf(i3);
                if (num4 != null) {
                    i4 = num4.intValue();
                } else {
                    i4 = -1;
                }
                Integer valueOf4 = Integer.valueOf(i4);
                if (!this.f150740b.equals(valueOf) || !this.f150741c.equals(valueOf2) || !this.f150742d.equals(valueOf3) || !this.f150743e.equals(valueOf4)) {
                    C60427s.m234842b("TEImage2Mode", "[afMode=" + valueOf + ", afState=" + valueOf2 + ",aeMode=" + valueOf3 + ", aeState=" + valueOf4 + "]");
                }
                this.f150740b = valueOf;
                this.f150741c = valueOf2;
                this.f150742d = valueOf3;
                this.f150743e = valueOf4;
                boolean z2 = true;
                if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureResult.getRequest().getTag())) {
                    C60316a.this.f150733g = true;
                    C60427s.m234839a("TEImage2Mode", "is shot can do");
                }
                if (!C60316a.this.f150733g) {
                    C60427s.m234842b("TEImage2Mode", "discard previous callback");
                    return;
                }
                if (valueOf2.intValue() == -1 || valueOf2.intValue() == 4 || valueOf2.intValue() == 5 || valueOf2.intValue() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!(valueOf4.intValue() == -1 || valueOf4.intValue() == 4 || valueOf4.intValue() == 2)) {
                        z2 = false;
                    }
                    if (z2) {
                        long currentTimeMillis = System.currentTimeMillis() - C60316a.this.f150727a;
                        C60316a.this.f150728b.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED);
                        C60316a.this.f150728b.sendEmptyMessage(1000);
                        C60316a.this.f150733g = false;
                        C60427s.m234839a("TEImage2Mode", "send-capture-command consume = " + currentTimeMillis);
                        C60408m.m234769a("te_record_send_capture_command_cost", currentTimeMillis);
                    }
                }
            }

            /* renamed from: b */
            private void m234287b(CaptureResult captureResult) {
                int i;
                boolean z;
                Integer num;
                int i2 = C60316a.this.f150730d;
                boolean z2 = false;
                boolean z3 = true;
                if (i2 == 0) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = -1;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    C60316a aVar = C60316a.this;
                    if (valueOf.intValue() == -1 || valueOf.intValue() == 2 || valueOf.intValue() == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f150734h = z;
                    if (C60316a.this.f150840o != null && (num = (Integer) C60316a.this.f150840o.get(CaptureRequest.CONTROL_AF_TRIGGER)) != null && num.intValue() == 1) {
                        if (4 == valueOf.intValue() || 5 == valueOf.intValue() || -1 == valueOf.intValue()) {
                            z2 = true;
                        }
                        if (z2) {
                            C60316a.this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            if (C60316a.this.f150728b != null) {
                                C60316a.this.f150728b.sendEmptyMessage(1004);
                            }
                        }
                    }
                } else if (i2 == 1) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 != null && num3.intValue() == 1) {
                        C60316a.this.f150732f = true;
                        C60427s.m234839a("TEImage2Mode", "ae trigger start...");
                    }
                    if (C60316a.this.f150732f) {
                        if (num4 == null || num4.intValue() == 2 || num4.intValue() == 4) {
                            C60316a.this.f150732f = false;
                            C60427s.m234839a("TEImage2Mode", "ae converge, is shot can do");
                        } else {
                            z3 = false;
                        }
                        if (!this.f150743e.equals(num4)) {
                            C60427s.m234839a("TEImage2Mode", "ae state:" + num4);
                        }
                        this.f150743e = num4;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        long currentTimeMillis = System.currentTimeMillis() - C60316a.this.f150727a;
                        C60316a.this.f150730d = 0;
                        C60316a.this.f150732f = false;
                        if (C60316a.this.f150728b != null) {
                            C60316a.this.f150728b.removeMessages(1007);
                            C60316a.this.f150728b.sendEmptyMessage(1006);
                            C60316a.this.f150728b.sendEmptyMessage(1005);
                        }
                        C60427s.m234839a("TEImage2Mode", "send-capture-command consume = " + currentTimeMillis);
                    }
                }
            }

            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                m234287b(captureResult);
            }

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                if (C60316a.this.f150730d == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    C60316a.this.f150733g = true;
                    C60427s.m234844d("TEImage2Mode", "onCaptureFailed: ");
                }
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                m234287b(totalCaptureResult);
                if (!C60316a.this.f150824J) {
                    C60316a.this.mo206687C();
                    C60316a.this.f150824J = true;
                    long currentTimeMillis = System.currentTimeMillis() - C60316a.this.f150826L;
                    C60427s.m234839a("TEImage2Mode", "first preview frame callback arrived! consume = " + currentTimeMillis);
                    C60408m.m234769a("te_record_camera2_set_repeating_request_cost", currentTimeMillis);
                    C60427s.m234838a("te_record_camera2_set_repeating_request_cost", Long.valueOf(currentTimeMillis));
                }
                if (C60316a.this.f150730d == 2) {
                    m234286a(totalCaptureResult);
                }
                C60316a.this.f150735i++;
                if (C60316a.this.f150736j != 0 && C60316a.this.f150735i > C60316a.this.f150736j) {
                    C60316a.this.f150735i = 0;
                    Runtime.getRuntime().gc();
                }
            }

            public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                if (C60316a.this.f150730d == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    C60316a.this.f150733g = true;
                    C60427s.m234844d("TEImage2Mode", "onCaptureBufferLost: ");
                }
            }
        };
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    public int[] bt_() {
        ImageReader imageReader = this.f150729c;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.f150729c.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: e */
    public int[] mo206578e() {
        ImageReader imageReader = this.f150729c;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.f150729c.getHeight()};
    }

    /* renamed from: E */
    private void m234258E() {
        if (this.f150845t.f150668V) {
            Range<Integer> G = m234260G();
            if (this.f150840o != null && G != null) {
                this.f150840o.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, G);
                mo206707d(this.f150840o);
                C60427s.m234839a("TEImage2Mode", "apply capture scene: " + G);
            }
        }
    }

    /* renamed from: F */
    private void m234259F() {
        if (this.f150845t.f150668V) {
            Range<Integer> H = m234261H();
            if (this.f150840o != null && H != null) {
                this.f150840o.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, H);
                mo206707d(this.f150840o);
                C60427s.m234839a("TEImage2Mode", "apply record scene: " + H);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a.AbstractC60325a
    /* renamed from: c */
    public int mo206562c() {
        if (this.f150840o == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "rollbackNormalSessionRequest : param is null.", this.f150847v);
            return -100;
        }
        this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f150840o.set(CaptureRequest.CONTROL_AF_MODE, 4);
        mo206707d(this.f150840o);
        return 0;
    }

    /* renamed from: f */
    public void mo206579f() {
        Integer num = (Integer) this.f150840o.get(CaptureRequest.CONTROL_AF_TRIGGER);
        if (num != null && num.intValue() == 1) {
            C60427s.m234839a("TEImage2Mode", "need cancel af trigger");
            this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            mo206692a(this.f150840o, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
            this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            mo206707d(this.f150840o);
        }
    }

    /* renamed from: h */
    public void mo206581h() {
        this.f150737k = System.currentTimeMillis();
        this.f150730d = 0;
        CaptureRequest.Builder e = mo206710e(2);
        if (e == null) {
            mo206574a(new Exception("capture build is null"), IByteRtcError.BRERR_JOIN_ROOM_ERROR);
            return;
        }
        ImageReader imageReader = this.f150729c;
        if (imageReader == null) {
            mo206574a(new Exception("image reader is null"), IByteRtcError.BRERR_JOIN_ROOM_ERROR);
            return;
        }
        e.addTarget(imageReader.getSurface());
        m234263e(e);
        mo206692a(e, new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3033b.C60316a.C603193 */

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                C60427s.m234842b("TEImage2Mode", "onCaptureCompleted, do capture done");
                C60316a.this.f150728b.sendEmptyMessage(1002);
            }

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                C60427s.m234842b("TEImage2Mode", "onCaptureCompleted, do capture failed");
                HandlerC60321a aVar = C60316a.this.f150728b;
                HandlerC60321a aVar2 = C60316a.this.f150728b;
                aVar.sendMessage(aVar2.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
                C60316a.this.f150728b.sendEmptyMessage(1002);
            }
        }, (Handler) null);
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: j */
    public void mo206583j() {
        this.f150730d = 0;
        this.f150728b.removeCallbacksAndMessages(null);
        this.f150727a = 0;
        this.f150733g = false;
        this.f150735i = 0;
        this.f150726X = 0;
        ImageReader imageReader = this.f150729c;
        if (imageReader != null) {
            imageReader.close();
            this.f150729c = null;
        }
        if (this.f150738l != null) {
            this.f150738l = null;
        }
        super.mo206583j();
    }

    /* renamed from: G */
    private Range<Integer> m234260G() {
        int i;
        int intValue;
        Range<Integer> range = null;
        if (this.f150838m == null) {
            return null;
        }
        Range<Integer>[] rangeArr = (Range[]) this.f150838m.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            if (this.f150845t == null || (i = this.f150845t.f150667U) < 30) {
                i = 30;
            }
            int i2 = 0;
            int i3 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C60427s.m234842b("TEImage2Mode", "fps: " + range2.toString());
                int intValue2 = range2.getUpper().intValue();
                if (intValue2 > i2) {
                    i2 = intValue2;
                }
                if (intValue2 <= i && (intValue = range2.getUpper().intValue() - range2.getLower().intValue()) > i3) {
                    range = range2;
                    i3 = intValue;
                }
            }
            if (i2 > 30) {
                C60408m.m234769a("te_record_camera_max_fps", (long) i2);
            }
        }
        return range;
    }

    /* renamed from: H */
    private Range<Integer> m234261H() {
        int i;
        Range<Integer> range = null;
        if (this.f150838m == null) {
            return null;
        }
        Range<Integer>[] rangeArr = (Range[]) this.f150838m.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i2 = 30;
            if (this.f150845t != null && (i = this.f150845t.f150667U) >= 30) {
                i2 = i;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C60427s.m234842b("TEImage2Mode", "fps: " + range2.toString());
                int intValue = range2.getUpper().intValue();
                if (intValue > i3) {
                    i3 = intValue;
                }
                if (intValue <= i2 && intValue == range2.getLower().intValue() && intValue > i4) {
                    range = range2;
                    i4 = intValue;
                }
            }
        }
        return range;
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a.AbstractC60325a
    /* renamed from: d */
    public int mo206563d() {
        if (this.f150840o == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "rollbackMeteringSessionRequest : param is null.", this.f150847v);
            return -100;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        if (this.f150820F) {
            mo206701b(this.f150840o);
        }
        this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
        mo206707d(this.f150840o);
        return 0;
    }

    /* renamed from: g */
    public void mo206580g() {
        this.f150737k = System.currentTimeMillis();
        this.f150730d = 0;
        CaptureRequest.Builder e = mo206710e(2);
        if (e == null) {
            mo206574a(new Exception("capture build is null"), IByteRtcError.BRERR_JOIN_ROOM_ERROR);
            return;
        }
        ImageReader imageReader = this.f150729c;
        if (imageReader == null) {
            mo206574a(new Exception("image reader is null"), IByteRtcError.BRERR_JOIN_ROOM_ERROR);
            return;
        }
        e.addTarget(imageReader.getSurface());
        m234263e(e);
        AbstractC60347b.C60353a a = mo206692a(e, new CameraCaptureSession.CaptureCallback() {
            /* class com.ss.android.ttvecamera.p3033b.C60316a.C603182 */

            public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                C60427s.m234844d("TEImage2Mode", "captureStillPicture, capture failed");
            }

            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) C60316a.this.f150840o.get(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER);
                Integer num2 = (Integer) C60316a.this.f150840o.get(CaptureRequest.CONTROL_AF_TRIGGER);
                if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                    C60427s.m234839a("TEImage2Mode", "need cancel ae af trigger");
                    if (Build.VERSION.SDK_INT >= 23) {
                        C60316a.this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    C60316a.this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    C60316a aVar = C60316a.this;
                    AbstractC60347b.C60353a a = aVar.mo206692a(aVar.f150840o, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                    if (!a.mo206733a()) {
                        C60427s.m234843c("TEImage2Mode", "onCaptureSequenceCompleted: error = " + a.mo206734b());
                        return;
                    }
                    C60316a.this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    C60316a.this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                }
                C60316a aVar2 = C60316a.this;
                aVar2.mo206707d(aVar2.f150840o);
            }
        }, this.f150848w);
        if (!a.mo206733a()) {
            mo206574a(a.mo206735c(), IByteRtcError.BRERR_JOIN_ROOM_ERROR);
        }
    }

    /* renamed from: i */
    public void mo206582i() {
        if (this.f150845t.f150676e == 0) {
            if (this.f150845t.ab == 3) {
                if (this.f150723U) {
                    this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 3);
                    this.f150840o.set(CaptureRequest.FLASH_MODE, 1);
                }
            } else if (this.f150845t.ab == 2 && this.f150724V) {
                this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                mo206692a(this.f150840o, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
            }
            if (this.f150724V) {
                this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            }
            this.f150840o.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            mo206707d(this.f150840o);
        }
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: b */
    public int mo206561b() throws Exception {
        int i;
        boolean z;
        Handler handler;
        this.f150723U = false;
        Float f = (Float) this.f150838m.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            i = 0;
        } else {
            i = f.intValue();
        }
        C60427s.m234842b("TEImage2Mode", "lensInfoMinFocusDistance = " + i);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f150724V = z;
        C60375c J = this.f150844s.mo206836J();
        if (this.f150847v == null || J == null) {
            C60427s.m234842b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f150845t.f175458ai) {
            C60427s.m234839a("TEImage2Mode", "bind surface lifecycle to camera...");
            if (!this.f150725W) {
                J.mo206800b().mo206785e();
            }
            this.f150725W = false;
        }
        int o = super.mo206715o();
        if (o != 0) {
            return o;
        }
        mo206576b(this.f150845t.f150687p.f150716a, this.f150845t.f150687p.f150717b);
        this.f150840o = this.f150847v.createCaptureRequest(1);
        if (this.f150817C != null) {
            this.f150840o.set(CaptureRequest.SCALER_CROP_REGION, this.f150817C);
        }
        ArrayList<Surface> arrayList = new ArrayList();
        if (J.mo206800b().mo206783c() == 8) {
            arrayList.addAll(Arrays.asList(J.mo206803e()));
        } else {
            arrayList.add(J.mo206802d());
        }
        for (Surface surface : arrayList) {
            this.f150840o.addTarget(surface);
        }
        arrayList.add(this.f150729c.getSurface());
        this.f150840o.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.f150735i = 0;
        int i2 = this.f150845t.f150666T;
        this.f150736j = i2;
        if (i2 > 0) {
            C60427s.m234839a("TEImage2Mode", "release camera metadata threshold: " + this.f150736j);
        }
        this.f150734h = false;
        this.f150824J = false;
        this.f150730d = 0;
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

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: a */
    public int mo206568a(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        mo206558a(i);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: b */
    public void mo206575b(int i) {
        super.mo206575b(i);
        if (i == 0) {
            m234258E();
        } else if (i == 1) {
            m234259F();
        } else {
            throw new IllegalArgumentException("un support scene");
        }
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: a */
    public int mo206566a(C60420o oVar) {
        if (this.f150730d == 0) {
            return super.mo206566a(oVar);
        }
        C60427s.m234844d("TEImage2Mode", "focus action discard, state = " + this.f150730d);
        return -108;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttvecamera.b.a$a */
    public class HandlerC60321a extends Handler {
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            C60427s.m234839a("TEImage2Mode", "dispatch msg = " + message.what);
            switch (message.what) {
                case 1000:
                case CommonCode.StatusCode.API_CLIENT_EXPIRED:
                    C60316a.this.mo206581h();
                    return;
                case 1002:
                    C60316a.this.mo206582i();
                    return;
                case 1003:
                    C60316a.this.mo206574a((Exception) message.obj, IByteRtcError.BRERR_INVALID_TOKEN);
                    return;
                case 1004:
                    C60316a aVar = C60316a.this;
                    aVar.mo206707d(aVar.f150840o);
                    return;
                case 1005:
                    C60316a.this.mo206579f();
                    return;
                case 1006:
                case 1007:
                    C60316a.this.mo206580g();
                    return;
                default:
                    return;
            }
        }

        public HandlerC60321a(Looper looper) {
            super(looper);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: a */
    public Range<Integer> mo206569a(Range<Integer> range) {
        if (!(this.f150838m == null || range == null)) {
            Range<Integer> G = m234260G();
            if (G != null) {
                range = G;
            }
            C60427s.m234839a("TEImage2Mode", "clamp fps after = " + range);
        }
        return range;
    }

    /* renamed from: e */
    private void m234263e(CaptureRequest.Builder builder) {
        if (builder != null) {
            Integer num = (Integer) this.f150840o.get(CaptureRequest.CONTROL_AF_MODE);
            if (num != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, num);
                C60427s.m234842b("TEImage2Mode", "sync afMode: " + num);
            }
            MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) this.f150840o.get(CaptureRequest.CONTROL_AE_REGIONS);
            if (meteringRectangleArr != null) {
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                C60427s.m234842b("TEImage2Mode", "sync aeRect: " + Arrays.toString(meteringRectangleArr));
            }
            MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) this.f150840o.get(CaptureRequest.CONTROL_AF_REGIONS);
            if (meteringRectangleArr != null) {
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr2);
                C60427s.m234842b("TEImage2Mode", "sync afRect: " + Arrays.toString(meteringRectangleArr2));
            }
            mo206572a(this.f150840o, builder);
            Range range = (Range) this.f150840o.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (range != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                C60427s.m234842b("TEImage2Mode", "sync fpsRange: " + range);
            }
            if (this.f150817C != null) {
                builder.set(CaptureRequest.SCALER_CROP_REGION, this.f150817C);
                C60427s.m234842b("TEImage2Mode", "sync crop region: " + this.f150817C);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60346a
    /* renamed from: a */
    public void mo206558a(int i) {
        int i2;
        if (this.f150840o == null) {
            C60427s.m234844d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "switchFlashMode : CaptureRequest.Builder is null", this.f150847v);
            return;
        }
        Integer num = (Integer) this.f150840o.get(CaptureRequest.FLASH_MODE);
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        if (i == 1) {
            if (this.f150845t.f150676e == 1) {
                C60427s.m234844d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                C60427s.m234843c("TEImage2Mode", "flash on is not supported in front camera!");
                return;
            }
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f150840o.set(CaptureRequest.FLASH_MODE, 1);
            this.f150723U = true;
            this.f150726X = 1;
        } else if (i == 0) {
            this.f150723U = false;
            if (i2 == 0) {
                C60427s.m234839a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            }
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f150840o.set(CaptureRequest.FLASH_MODE, 0);
            this.f150726X = 0;
        } else if (i == 2) {
            this.f150723U = false;
            if (i2 == 2) {
                C60427s.m234839a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            }
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f150840o.set(CaptureRequest.FLASH_MODE, 2);
            this.f150726X = 2;
        } else {
            C60427s.m234844d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode " + i);
            C60427s.m234844d("TEImage2Mode", "not support flash mode: " + i);
            this.f150726X = 0;
            return;
        }
        AbstractC60347b.C60353a d = mo206707d(this.f150840o);
        if (!d.mo206733a()) {
            C60427s.m234844d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: " + d.mo206734b());
            this.f150843r.mo206502b(-100, -100, d.mo206734b(), this.f150847v);
        }
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: a */
    public int mo206567a(String str, int i) throws CameraAccessException {
        this.f150725W = true;
        return super.mo206567a(str, i);
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: a */
    public void mo206570a(int i, int i2) {
        this.f150845t.f150695x = true;
        this.f150845t.f150687p.f150716a = i;
        this.f150845t.f150687p.f150717b = i2;
        mo206583j();
        try {
            mo206561b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo206576b(int i, int i2) {
        int i3;
        if (this.f150722T) {
            i3 = 35;
        } else {
            i3 = DynamicModule.f58006b;
        }
        if (!this.f150845t.f150695x) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f150838m.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(i3);
            ArrayList arrayList = new ArrayList();
            for (Size size : outputSizes) {
                arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
            }
            if (this.f150845t.f150694w) {
                this.f150845t.f150687p = C60410n.m234779a(arrayList, this.f150845t.mo206521a(), this.f150845t.f150690s);
            } else {
                TEFrameSizei tEFrameSizei = null;
                if (this.f150818D != null) {
                    Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                    ArrayList arrayList2 = new ArrayList();
                    for (Size size2 : outputSizes2) {
                        arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
                    }
                    tEFrameSizei = this.f150818D.mo206508a(arrayList, arrayList2);
                }
                if (tEFrameSizei == null) {
                    tEFrameSizei = C60410n.m234780a(arrayList, this.f150845t.mo206521a(), new TEFrameSizei(i, i2));
                }
                this.f150845t.f150687p = tEFrameSizei;
            }
        } else {
            this.f150845t.f150695x = false;
        }
        this.f150729c = ImageReader.newInstance(this.f150845t.f150687p.f150716a, this.f150845t.f150687p.f150717b, i3, 1);
        C60427s.m234839a("TEImage2Mode", "image reader width: " + this.f150729c.getWidth() + ", height = " + this.f150729c.getHeight());
        this.f150729c.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            /* class com.ss.android.ttvecamera.p3033b.C60316a.C603204 */

            public void onImageAvailable(ImageReader imageReader) {
                TECameraFrame.ETEPixelFormat eTEPixelFormat;
                int i;
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage == null) {
                    C60316a.this.mo206574a(new Exception("no image data"), IByteRtcError.BRERR_INVALID_TOKEN);
                    return;
                }
                int width = acquireNextImage.getWidth();
                int height = acquireNextImage.getHeight();
                C60427s.m234839a("TEImage2Mode", "on image available, consume: " + (System.currentTimeMillis() - C60316a.this.f150737k) + ", size: " + width + "x" + height + ", format: " + acquireNextImage.getFormat());
                C60435v vVar = new C60435v(acquireNextImage.getPlanes());
                if (acquireNextImage.getFormat() == 256) {
                    eTEPixelFormat = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG;
                } else {
                    eTEPixelFormat = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
                }
                if (C60316a.this.f150731e == 1) {
                    i = 270;
                } else {
                    i = 90;
                }
                TECameraFrame tECameraFrame = new TECameraFrame(vVar, eTEPixelFormat, width, height, i);
                if (C60316a.this.f150738l != null) {
                    C60316a.this.f150738l.mo206531a(tECameraFrame, C60316a.this.f150844s);
                }
                acquireNextImage.close();
            }
        }, this.f150721S);
    }

    /* renamed from: a */
    public void mo206572a(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        Integer num;
        Integer num2 = (Integer) builder.get(CaptureRequest.CONTROL_AE_MODE);
        if (num2 != null && num2.intValue() == 3) {
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 3);
            builder2.set(CaptureRequest.FLASH_MODE, 1);
        } else if (num2 != null && num2.intValue() == 1 && (num = (Integer) builder.get(CaptureRequest.FLASH_MODE)) != null && num.intValue() == 2) {
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder2.set(CaptureRequest.FLASH_MODE, 2);
        }
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: a */
    public void mo206573a(TECameraSettings.AbstractC60302i iVar, int i) {
        long j;
        this.f150738l = iVar;
        this.f150731e = i;
        C60427s.m234839a("TEImage2Mode", "takePicture...flash strategy: " + this.f150845t.ab);
        this.f150737k = System.currentTimeMillis();
        this.f150733g = false;
        if (this.f150723U) {
            j = 1600;
        } else {
            j = 800;
        }
        if (this.f150845t.f150676e != 0) {
            this.f150730d = 1;
            mo206581h();
        } else if (this.f150845t.ab == 3) {
            if (this.f150723U) {
                this.f150727a = System.currentTimeMillis();
                this.f150730d = 2;
                this.f150728b.sendEmptyMessageDelayed(CommonCode.StatusCode.API_CLIENT_EXPIRED, j);
                this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f150840o.set(CaptureRequest.FLASH_MODE, 2);
                if (this.f150724V) {
                    this.f150840o.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.f150840o.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                    mo206704c(this.f150840o);
                    this.f150840o.setTag(null);
                    this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    mo206707d(this.f150840o);
                    AbstractC60347b.C60353a d = mo206707d(this.f150840o);
                    if (!d.mo206733a()) {
                        HandlerC60321a aVar = this.f150728b;
                        aVar.sendMessage(aVar.obtainMessage(1003, d.mo206735c()));
                        return;
                    }
                    return;
                }
                this.f150728b.sendEmptyMessageDelayed(1000, 300);
                return;
            }
            mo206581h();
        } else if (this.f150845t.ab == 2) {
            if (this.f150723U || !this.f150734h) {
                this.f150727a = System.currentTimeMillis();
                this.f150730d = 2;
                this.f150728b.sendEmptyMessageDelayed(CommonCode.StatusCode.API_CLIENT_EXPIRED, j);
                if (this.f150724V) {
                    this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                this.f150840o.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                mo206704c(this.f150840o);
                this.f150840o.setTag(null);
                this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                AbstractC60347b.C60353a d2 = mo206707d(this.f150840o);
                if (!d2.mo206733a()) {
                    HandlerC60321a aVar2 = this.f150728b;
                    aVar2.sendMessage(aVar2.obtainMessage(1003, d2.mo206735c()));
                    return;
                }
                return;
            }
            C60427s.m234839a("TEImage2Mode", "af converge, do capture...");
            mo206581h();
        } else if (this.f150845t.ab == 0) {
            if (this.f150723U || !this.f150734h) {
                this.f150727a = System.currentTimeMillis();
                this.f150730d = 1;
                this.f150728b.sendEmptyMessageDelayed(1007, j);
                if (this.f150724V) {
                    this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                AbstractC60347b.C60353a a = mo206692a(this.f150840o, this.f150832R, this.f150848w);
                if (!a.mo206733a()) {
                    HandlerC60321a aVar3 = this.f150728b;
                    aVar3.sendMessage(aVar3.obtainMessage(1003, a.mo206735c()));
                    return;
                }
                return;
            }
            C60427s.m234839a("TEImage2Mode", "af converge, do capture...");
            mo206580g();
        } else if (this.f150845t.ab == 1) {
            this.f150730d = 1;
            if (this.f150723U) {
                this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f150840o.set(CaptureRequest.FLASH_MODE, 2);
            }
            mo206580g();
        } else {
            this.f150730d = 1;
            mo206581h();
        }
    }

    /* renamed from: a */
    public void mo206574a(Exception exc, int i) {
        if (this.f150738l != null) {
            if (this.f150844s != null) {
                exc = this.f150844s.mo206848a(exc, i);
            }
            this.f150738l.mo206532a(exc);
        }
        this.f150730d = 0;
        C60427s.m234843c("TEImage2Mode", "onCaptureFailed, err = " + exc + ", errCode = " + i);
    }

    @Override // com.ss.android.ttvecamera.p3035d.AbstractC60347b
    /* renamed from: a */
    public void mo206571a(int i, int i2, TECameraSettings.AbstractC60302i iVar) {
        mo206573a(iVar, this.f150845t.f150676e);
    }

    public C60316a(C60362g gVar, Context context, CameraManager cameraManager, Handler handler) {
        super(gVar, context, handler);
        this.f150842q = cameraManager;
        if (this.f150845t.f150684m) {
            this.f150846u = new C60334f(this);
        } else {
            this.f150846u = new C60331e(this);
        }
        this.f150728b = new HandlerC60321a(handler.getLooper());
        m234262I();
    }
}
