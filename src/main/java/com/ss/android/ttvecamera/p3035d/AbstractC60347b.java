package com.ss.android.ttvecamera.p3035d;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60362g;
import com.ss.android.ttvecamera.C60408m;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.C60420o;
import com.ss.android.ttvecamera.C60424p;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.hardware.C60389d;
import com.ss.android.ttvecamera.hardware.C60390e;
import com.ss.android.ttvecamera.hardware.C60393h;
import com.ss.android.ttvecamera.hardware.C60395j;
import com.ss.android.ttvecamera.hardware.TECameraOGXMProxy;
import com.ss.android.ttvecamera.p3034c.AbstractC60324a;
import com.ss.android.ttvecamera.p3034c.AbstractC60330d;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.d.b */
public abstract class AbstractC60347b implements AbstractC60324a.AbstractC60325a, AbstractC60346a {

    /* renamed from: A */
    protected float f150815A = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: B */
    protected float f150816B = 1.0f;

    /* renamed from: C */
    protected Rect f150817C = null;

    /* renamed from: D */
    protected AbstractC60396i.AbstractC60399c f150818D;

    /* renamed from: E */
    protected int[] f150819E;

    /* renamed from: F */
    protected boolean f150820F = false;

    /* renamed from: G */
    protected CaptureRequest.Key<?> f150821G = null;

    /* renamed from: H */
    protected C60420o f150822H;

    /* renamed from: I */
    protected C60424p f150823I = new C60424p(7, 30);

    /* renamed from: J */
    public volatile boolean f150824J = false;

    /* renamed from: K */
    protected long f150825K = 0;

    /* renamed from: L */
    public long f150826L = 0;

    /* renamed from: M */
    protected int f150827M = 0;

    /* renamed from: N */
    protected boolean f150828N = false;

    /* renamed from: O */
    protected volatile boolean f150829O = false;

    /* renamed from: P */
    protected HashMap<Integer, String> f150830P = new HashMap<>();

    /* renamed from: Q */
    protected CameraCaptureSession.StateCallback f150831Q = new CameraCaptureSession.StateCallback() {
        /* class com.ss.android.ttvecamera.p3035d.AbstractC60347b.C603503 */

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C60427s.m234844d("TECameraModeBase", "onConfigureFailed...");
            AbstractC60347b.this.mo206687C();
            C60408m.m234769a("te_record_camera2_create_session_ret", 0L);
            C60427s.m234838a("te_record_camera2_create_session_ret", (Object) 0);
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            long currentTimeMillis = System.currentTimeMillis() - AbstractC60347b.this.f150825K;
            C60427s.m234839a("TECameraModeBase", "onConfigured...createSessionConsume = " + currentTimeMillis);
            AbstractC60347b.this.f150841p = cameraCaptureSession;
            try {
                final int p = AbstractC60347b.this.mo206716p();
                if (p != 0) {
                    AbstractC60347b.this.mo206687C();
                    RunnableC603511 r2 = new Runnable() {
                        /* class com.ss.android.ttvecamera.p3035d.AbstractC60347b.C603503.RunnableC603511 */

                        public void run() {
                            AbstractC60347b.this.f150843r.mo206499a(AbstractC60347b.this.f150845t.f150674c, p, "updateCapture : something wrong.", AbstractC60347b.this.f150847v);
                        }
                    };
                    if (AbstractC60347b.this.f150845t.f150682k) {
                        AbstractC60347b.this.f150848w.post(r2);
                    } else {
                        r2.run();
                    }
                }
            } catch (Exception e) {
                AbstractC60347b.this.mo206687C();
                e.printStackTrace();
            }
            C60408m.m234769a("te_record_camera2_create_session_ret", 1L);
            C60408m.m234769a("te_record_camera2_create_session_cost", currentTimeMillis);
            C60427s.m234838a("te_record_camera2_create_session_ret", (Object) 1);
            C60427s.m234838a("te_record_camera2_create_session_cost", Long.valueOf(currentTimeMillis));
        }
    };

    /* renamed from: R */
    protected CameraCaptureSession.CaptureCallback f150832R = new CameraCaptureSession.CaptureCallback() {
        /* class com.ss.android.ttvecamera.p3035d.AbstractC60347b.C603524 */

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (!AbstractC60347b.this.f150824J) {
                AbstractC60347b.this.mo206687C();
                AbstractC60347b.this.f150824J = true;
                long currentTimeMillis = System.currentTimeMillis() - AbstractC60347b.this.f150826L;
                C60427s.m234839a("TECameraModeBase", "first preview frame callback arrived! consume = " + currentTimeMillis);
                C60408m.m234769a("te_record_camera2_set_repeating_request_cost", currentTimeMillis);
                C60427s.m234838a("te_record_camera2_set_repeating_request_cost", Long.valueOf(currentTimeMillis));
            }
            if (AbstractC60347b.this.f150851z) {
                AbstractC60347b.this.f150851z = C60410n.m234786a(totalCaptureResult);
            }
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (AbstractC60347b.this.f150845t.ac && !AbstractC60347b.this.f150824J && captureFailure.getReason() == 0) {
                AbstractC60347b.this.f150827M++;
                int i = AbstractC60347b.this.f150827M;
                AbstractC60347b.this.f150845t.getClass();
                if (i >= 5) {
                    AbstractC60347b.this.f150843r.mo206504c(AbstractC60347b.this.f150845t.f150674c, -437, "Camera previewing failed", AbstractC60347b.this.f150847v);
                }
            }
            C60427s.m234844d("TECameraModeBase", "failure: " + captureFailure + ",reason:" + captureFailure.getReason());
        }
    };

    /* renamed from: a */
    private HandlerThread f150833a = null;

    /* renamed from: b */
    private Handler f150834b = null;

    /* renamed from: c */
    private Rect f150835c;

    /* renamed from: d */
    private Map<String, Integer> f150836d = new HashMap<String, Integer>() {
        /* class com.ss.android.ttvecamera.p3035d.AbstractC60347b.C603481 */

        {
            put("auto", 1);
            put("incandescent", 2);
            put("fluorescent", 3);
            put("warm-fluorescent", 4);
            put("daylight", 5);
            put("cloudy-daylight", 6);
            put("twilight", 7);
            put("shade", 8);
        }
    };

    /* renamed from: e */
    private Runnable f150837e = new Runnable() {
        /* class com.ss.android.ttvecamera.p3035d.AbstractC60347b.RunnableC603492 */

        public void run() {
            AbstractC60347b.this.f150846u.mo206598a();
        }
    };

    /* renamed from: m */
    public CameraCharacteristics f150838m;

    /* renamed from: n */
    protected C60390e f150839n;

    /* renamed from: o */
    public CaptureRequest.Builder f150840o;

    /* renamed from: p */
    protected volatile CameraCaptureSession f150841p;

    /* renamed from: q */
    protected CameraManager f150842q;

    /* renamed from: r */
    protected AbstractC60396i.AbstractC60397a f150843r;

    /* renamed from: s */
    public C60362g f150844s;

    /* renamed from: t */
    protected TECameraSettings f150845t;

    /* renamed from: u */
    protected AbstractC60330d f150846u;

    /* renamed from: v */
    protected CameraDevice f150847v;

    /* renamed from: w */
    protected Handler f150848w;

    /* renamed from: x */
    public CaptureRequest f150849x;

    /* renamed from: y */
    protected AtomicBoolean f150850y = new AtomicBoolean(false);

    /* renamed from: z */
    protected boolean f150851z = true;

    /* renamed from: a */
    public static HandlerThread m234390a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Range<Integer> mo206569a(Range<Integer> range) {
        return range;
    }

    /* renamed from: a */
    public void mo206570a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo206571a(int i, int i2, TECameraSettings.AbstractC60302i iVar) {
    }

    /* renamed from: a */
    public void mo206573a(TECameraSettings.AbstractC60302i iVar, int i) {
    }

    /* renamed from: b */
    public abstract int mo206561b() throws Exception;

    /* renamed from: b */
    public void mo206575b(int i) {
    }

    public int[] bt_() {
        return null;
    }

    public int bu_() {
        return 0;
    }

    public int bv_() {
        return 0;
    }

    /* renamed from: e */
    public int[] mo206578e() {
        return null;
    }

    /* renamed from: k */
    public int mo206584k() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ttvecamera.d.b$a */
    public static class C60353a {

        /* renamed from: a */
        boolean f150857a;

        /* renamed from: b */
        String f150858b = "";

        /* renamed from: a */
        public boolean mo206733a() {
            return this.f150857a;
        }

        /* renamed from: b */
        public String mo206734b() {
            return this.f150858b;
        }

        protected C60353a() {
        }

        /* renamed from: c */
        public Exception mo206735c() {
            return new Exception(this.f150858b);
        }

        public String toString() {
            return "Response{isSuccess=" + this.f150857a + ", errMsg='" + this.f150858b + '\'' + '}';
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Object mo206712l() {
        return this.f150847v;
    }

    /* renamed from: n */
    public void mo206714n() {
        mo206686B();
    }

    /* renamed from: a */
    public void mo206696a(Object obj) throws ClassCastException {
        this.f150847v = (CameraDevice) obj;
    }

    /* renamed from: a */
    public void mo206693a(float f) {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-436, -436, "Capture Session is null", this.f150847v);
        }
        if (f < BitmapDescriptorFactory.HUE_RED) {
            this.f150843r.mo206502b(-436, -436, "invalid distance", this.f150847v);
            return;
        }
        this.f150840o.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
        C60353a d = mo206707d(this.f150840o);
        if (!d.f150857a) {
            C60427s.m234844d("TECameraModeBase", "setManualFocusDistance exception: " + d.f150858b);
            this.f150843r.mo206502b(-430, -430, d.f150858b, this.f150847v);
        }
    }

    /* renamed from: a */
    public void mo206697a(boolean z, String str) {
        int i;
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-424, -424, "Capture Session is null", this.f150847v);
        }
        if (this.f150836d.get(str) == null) {
            i = 1;
        } else {
            i = this.f150836d.get(str).intValue();
        }
        if (!Arrays.asList((int[]) this.f150838m.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(i))) {
            this.f150843r.mo206502b(-424, -424, "invalid white balance", this.f150847v);
            return;
        }
        C60353a d = mo206707d(this.f150840o);
        if (!d.f150857a) {
            C60427s.m234844d("TECameraModeBase", "setWhiteBalance exception: " + d.f150858b);
            this.f150843r.mo206502b(-424, -424, d.f150858b, this.f150847v);
        }
    }

    /* renamed from: a */
    public void mo206694a(long j) {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-431, -431, "Capture Session is null", this.f150847v);
        }
        if (j > mo206723w()[1] || j < mo206723w()[0]) {
            this.f150843r.mo206502b(-431, -431, "invalid shutter time", this.f150847v);
            return;
        }
        if (!((Integer) this.f150840o.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) this.f150840o.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            this.f150840o.set(CaptureRequest.CONTROL_MODE, 0);
        }
        this.f150840o.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
        C60353a d = mo206707d(this.f150840o);
        if (!d.f150857a) {
            C60427s.m234844d("TECameraModeBase", "setShutterTime exception: " + d.f150858b);
            this.f150843r.mo206502b(-431, -431, d.f150858b, this.f150847v);
        }
    }

    /* renamed from: a */
    public void mo206695a(AbstractC60396i.AbstractC60399c cVar) {
        this.f150818D = cVar;
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a.AbstractC60325a
    /* renamed from: a */
    public void mo206604a(CaptureRequest.Builder builder) {
        mo206707d(builder);
    }

    /* renamed from: m */
    public void mo206713m() {
        this.f150817C = null;
        this.f150827M = 0;
    }

    /* renamed from: r */
    public int mo206718r() {
        if (this.f150840o != null) {
            return this.f150846u.mo206598a();
        }
        this.f150843r.mo206502b(-100, -100, "rollbackNormalSessionRequest : param is null.", this.f150847v);
        return -100;
    }

    /* renamed from: s */
    public int mo206719s() {
        CaptureRequest.Builder builder = this.f150840o;
        if (builder == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "rollbackNormalSessionRequest : param is null.", this.f150847v);
            return -100;
        }
        this.f150846u.mo206601a(builder);
        mo206604a(this.f150840o);
        return 0;
    }

    /* renamed from: h */
    private void mo206581h() {
        this.f150823I = this.f150839n.mo206820a(this.f150838m, this.f150845t.f150675d.f151002a, this.f150845t.f150675d.f151003b, this.f150845t.f150657K, this.f150845t.f150676e);
        C60427s.m234839a("TECameraModeBase", "Set Fps Range: " + this.f150823I.toString());
    }

    /* renamed from: A */
    public Handler mo206685A() {
        if (this.f150833a == null) {
            HandlerThread a = m234390a("camera thread");
            this.f150833a = a;
            a.start();
            C60427s.m234839a("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.f150834b == null) {
            this.f150834b = new Handler(this.f150833a.getLooper());
        }
        return this.f150834b;
    }

    /* renamed from: B */
    public void mo206686B() {
        if (this.f150833a != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.f150833a.quitSafely();
            } else {
                this.f150833a.quit();
            }
            this.f150833a = null;
            this.f150834b = null;
            C60427s.m234839a("TECameraModeBase", "releaseCameraThread");
        }
    }

    /* renamed from: C */
    public void mo206687C() {
        C60362g gVar = this.f150844s;
        if (gVar != null) {
            gVar.mo206753G();
            return;
        }
        C60427s.m234842b("TECameraModeBase", "openCameraLock failed, " + C60427s.m234841b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo206688D() {
        C60362g gVar = this.f150844s;
        if (gVar != null) {
            gVar.mo206752F();
            return;
        }
        C60427s.m234842b("TECameraModeBase", "waitCameraTaskDoneOrTimeout failed, " + C60427s.m234841b());
    }

    /* renamed from: q */
    public int[] mo206717q() {
        Range range;
        CaptureRequest.Builder builder = this.f150840o;
        if (builder == null || (range = (Range) builder.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    /* renamed from: t */
    public float mo206720t() {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-435, -435, "Capture Session is null", this.f150847v);
        }
        float floatValue = ((Float) this.f150838m.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)).floatValue();
        if (floatValue >= BitmapDescriptorFactory.HUE_RED) {
            return floatValue;
        }
        this.f150843r.mo206502b(-435, -435, "can not get manual focus ability", this.f150847v);
        return -1.0f;
    }

    /* renamed from: v */
    public int mo206722v() {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-430, -430, "Capture Session is null", this.f150847v);
        }
        return ((Integer) this.f150840o.get(CaptureRequest.SENSOR_SENSITIVITY)).intValue();
    }

    /* renamed from: x */
    public float[] mo206724x() {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-432, -432, "Capture Session is null", this.f150847v);
        }
        float[] fArr = (float[]) this.f150838m.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        if (fArr == null) {
            return new float[]{-1.0f, -1.0f};
        }
        return fArr;
    }

    /* renamed from: u */
    public int[] mo206721u() {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-430, -430, "Capture Session is null", this.f150847v);
        }
        Range range = (Range) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        if (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) {
            return new int[]{-1, -1};
        }
        return new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    /* renamed from: w */
    public long[] mo206723w() {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-431, -431, "Capture Session is null", this.f150847v);
        }
        Range range = (Range) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        if (range == null) {
            return new long[]{-1, -1};
        }
        return new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    /* renamed from: j */
    public void mo206583j() {
        TECameraSettings tECameraSettings;
        if (!(this.f150844s == null || (tECameraSettings = this.f150845t) == null || !tECameraSettings.f150682k)) {
            C60427s.m234839a("TECameraModeBase", "close session process...state = " + this.f150844s.mo206751E());
            if (this.f150844s.mo206751E() == 2) {
                this.f150844s.mo206752F();
            }
        }
        this.f150829O = false;
        if (mo206712l() == null) {
            C60427s.m234844d("TECameraModeBase", "close session process...device is null");
        } else if (this.f150841p == null) {
            C60427s.m234844d("TECameraModeBase", "close session process...session is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                this.f150841p.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f150841p = null;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C60408m.m234769a("te_record_camera2_close_session_cost", currentTimeMillis2);
            C60427s.m234838a("te_record_camera2_close_session_cost", Long.valueOf(currentTimeMillis2));
            C60427s.m234839a("TECameraModeBase", "close session...consume = " + currentTimeMillis2);
        }
    }

    /* renamed from: o */
    public int mo206715o() {
        C60375c J = this.f150844s.mo206836J();
        if (mo206712l() == null || J == null) {
            C60427s.m234842b("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f150838m.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (J.mo206800b().mo206789f()) {
            J.mo206796a(streamConfigurationMap, (TEFrameSizei) null);
            this.f150845t.f150686o = J.mo206805g();
            if (this.f150845t.f150686o != null) {
                this.f150843r.mo206502b(50, 0, this.f150845t.f150686o.toString(), this.f150847v);
            }
        } else {
            J.mo206796a(streamConfigurationMap, this.f150845t.f150686o);
            this.f150845t.f150687p = J.mo206806h();
        }
        if (J.mo206801c() == 1 || J.mo206801c() == 16) {
            if (J.mo206804f() == null) {
                C60427s.m234844d("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            J.mo206804f().setDefaultBufferSize(this.f150845t.f150686o.f150716a, this.f150845t.f150686o.f150717b);
        } else if (J.mo206801c() != 2) {
            if (J.mo206801c() == 8) {
                J.mo206804f().setDefaultBufferSize(this.f150845t.f150686o.f150716a, this.f150845t.f150686o.f150717b);
            } else {
                C60427s.m234844d("TECameraModeBase", "Unsupported camera provider type : " + J.mo206801c());
                return -200;
            }
        }
        return 0;
    }

    /* renamed from: p */
    public int mo206716p() throws CameraAccessException {
        if (this.f150844s.mo206836J() == null || this.f150840o == null) {
            return -100;
        }
        this.f150843r.mo206497a(2, 0, 0, "TECamera2 preview", this.f150847v);
        if (this.f150839n.mo206817c(this.f150838m)) {
            C60427s.m234839a("TECameraModeBase", "Stabilization Supported, toggle = " + this.f150845t.f150663Q);
            if (this.f150839n.mo206813a(this.f150838m, this.f150840o, this.f150845t.f150663Q) == 0 && this.f150845t.f150663Q) {
                this.f150843r.mo206502b(SmEvents.EVENT_RE, 1, "enable stablization", this.f150847v);
            }
        }
        this.f150840o.set(CaptureRequest.CONTROL_MODE, 1);
        this.f150840o.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo206569a(new Range<>(Integer.valueOf(this.f150823I.f151002a / this.f150845t.f150675d.f151004c), Integer.valueOf(this.f150823I.f151003b / this.f150845t.f150675d.f151004c))));
        if (this.f150820F) {
            mo206701b(this.f150840o);
        }
        this.f150826L = System.currentTimeMillis();
        mo206707d(this.f150840o);
        this.f150845t.f150677f = ((Integer) this.f150838m.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f150844s.mo206761g(3);
        mo206726z();
        C60427s.m234839a("TECameraModeBase", "send capture request...");
        return 0;
    }

    /* renamed from: z */
    public void mo206726z() {
        Bundle bundle;
        if (this.f150844s.mo206837K().containsKey(this.f150845t.f150651E)) {
            bundle = this.f150844s.mo206837K().get(this.f150845t.f150651E);
        } else {
            bundle = new Bundle();
            this.f150844s.mo206837K().put(this.f150845t.f150651E, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.f150845t.f150686o);
        C60390e eVar = this.f150839n;
        if (eVar != null) {
            bundle.putBoolean("camera_torch_supported", eVar.mo206825b(this.f150838m));
        } else {
            bundle.putBoolean("camera_torch_supported", false);
        }
        if (!(this.f150838m == null || this.f150849x == null)) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.f150712a = (Rect) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.f150713b = (Rect) this.f150849x.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.f150715d = ((Integer) this.f150838m.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.f150714c = ((Integer) this.f150838m.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.f150845t.f150677f);
    }

    /* renamed from: y */
    public float[] mo206725y() {
        if (this.f150839n == null || this.f150849x == null || this.f150841p == null || this.f150840o == null) {
            C60427s.m234843c("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        float[] fArr = new float[2];
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) this.f150840o.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int abs = StrictMath.abs(rect.right - rect.left);
        int abs2 = StrictMath.abs(rect.top - rect.bottom);
        int i = this.f150845t.f150686o.f150716a;
        int i2 = this.f150845t.f150686o.f150717b;
        if (abs * i2 >= i / abs2) {
            dArr[0] = StrictMath.atan((double) (((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) / (f.floatValue() * 2.0f))) * 2.0d;
            dArr[1] = StrictMath.atan((double) (((((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) * ((float) (i / i2))) / ((float) (abs / abs2))) / (f.floatValue() * 2.0f))) * 2.0d;
        } else {
            dArr[1] = StrictMath.atan((double) (((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) / (f.floatValue() * 2.0f))) * 2.0d;
            dArr[0] = StrictMath.atan((double) (((((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) * ((float) (i2 / i))) / ((float) (abs2 / abs))) / (f.floatValue() * 2.0f))) * 2.0d;
        }
        fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
        fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
        C60427s.m234842b("TECameraModeBase", "Camera2:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
        return fArr;
    }

    /* renamed from: d */
    public C60353a mo206707d(CaptureRequest.Builder builder) {
        return mo206691a(builder, this.f150832R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C60353a mo206704c(CaptureRequest.Builder builder) {
        return mo206692a(builder, this.f150832R, mo206685A());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo206701b(CaptureRequest.Builder builder) {
        int[] iArr = this.f150819E;
        if (iArr == null) {
            C60427s.m234842b("TECameraModeBase", "FaceDetect is not supported!");
        } else if (C60410n.m234787a(iArr, 1)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
        } else if (C60410n.m234787a(this.f150819E, 2)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
        } else if (C60410n.m234787a(this.f150819E, 0)) {
            C60427s.m234843c("TECameraModeBase", "FaceDetect is not supported!");
        }
    }

    /* renamed from: c */
    public void mo206706c(boolean z) {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "setAutoFocusLock : Capture Session is null", this.f150847v);
            return;
        }
        try {
            this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            mo206707d(this.f150840o);
        } catch (Exception e) {
            e.printStackTrace();
            this.f150843r.mo206502b(-434, -434, e.toString(), this.f150847v);
        }
    }

    /* renamed from: e */
    public CaptureRequest.Builder mo206710e(int i) {
        if (i > 6 || i < 1) {
            C60427s.m234844d("TECameraModeBase", "createCaptureRequestBuilder, template invalid, must be [1, 6]");
            return null;
        }
        CameraDevice cameraDevice = this.f150847v;
        if (cameraDevice == null) {
            return null;
        }
        try {
            return cameraDevice.createCaptureRequest(i);
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public Rect mo206698b(float f) {
        CameraCharacteristics cameraCharacteristics = this.f150838m;
        if (cameraCharacteristics == null || this.f150840o == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -420, "Camera info is null, may be you need reopen camera.", this.f150847v);
            return null;
        }
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() - ((int) (((float) rect.width()) / floatValue));
        int i = (int) ((((float) width) / floatValue) * f);
        int height = (int) ((((float) (rect.height() - ((int) (((float) rect.height()) / floatValue)))) / floatValue) * f);
        int i2 = i - (i & 3);
        int i3 = height - (height & 3);
        return new Rect(i2, i3, rect.width() - i2, rect.height() - i3);
    }

    /* renamed from: f */
    public void mo206711f(int i) {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "setExposureCompensation : Capture Session is null", this.f150847v);
            return;
        }
        try {
            Integer num = (Integer) this.f150840o.get(CaptureRequest.CONTROL_AE_MODE);
            if (num != null && num.intValue() == 0) {
                C60427s.m234843c("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
            } else if (this.f150845t.f150653G.f150705b == i) {
                C60427s.m234839a("TECameraModeBase", "setExposureCompensation return, no need to set");
            } else {
                this.f150840o.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
                this.f150845t.f150653G.f150705b = i;
                mo206707d(this.f150840o);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.f150843r.mo206502b(-413, -413, e.toString(), this.f150847v);
        }
    }

    /* renamed from: c */
    public Rect mo206703c(float f) {
        if (this.f150849x == null) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mCaptureRequest is null");
            C60427s.m234844d("TECameraModeBase", "mCaptureRequest == null");
            this.f150843r.mo206502b(-420, -420, "mCaptureRequest == null.", this.f150847v);
            return null;
        }
        Rect rect = this.f150835c;
        if (rect == null) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            C60427s.m234844d("TECameraModeBase", "ActiveArraySize == null");
            this.f150843r.mo206502b(-420, -420, "ActiveArraySize == null.", this.f150847v);
            return null;
        }
        float f2 = this.f150816B;
        if (f2 <= BitmapDescriptorFactory.HUE_RED || f2 > this.f150815A) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            C60427s.m234844d("TECameraModeBase", "factor invalid");
            this.f150843r.mo206502b(-420, -420, "factor invalid.", this.f150847v);
            return null;
        }
        float f3 = 1.0f / f2;
        int width = (rect.width() - Math.round(((float) this.f150835c.width()) * f3)) / 2;
        int height = (this.f150835c.height() - Math.round(((float) this.f150835c.height()) * f3)) / 2;
        Rect rect2 = new Rect(C60410n.m234775a(width, this.f150835c.left, this.f150835c.right), C60410n.m234775a(height, this.f150835c.top, this.f150835c.bottom), C60410n.m234775a(this.f150835c.width() - width, this.f150835c.left, this.f150835c.right), C60410n.m234775a(this.f150835c.height() - height, this.f150835c.top, this.f150835c.bottom));
        if (rect2.equals((Rect) this.f150849x.get(CaptureRequest.SCALER_CROP_REGION))) {
            C60427s.m234839a("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
        }
        return rect2;
    }

    /* renamed from: d */
    public void mo206708d(float f) {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-432, -432, "Capture Session is null", this.f150847v);
        }
        if (mo206724x().length == 1) {
            if (!Arrays.asList(mo206724x()).contains(Float.valueOf(f))) {
                this.f150843r.mo206502b(-432, -432, "invalid aperture", this.f150847v);
                return;
            }
        }
        if (!((Integer) this.f150840o.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) this.f150840o.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            this.f150840o.set(CaptureRequest.CONTROL_MODE, 0);
        }
        this.f150840o.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f));
        C60353a d = mo206707d(this.f150840o);
        if (!d.f150857a) {
            C60427s.m234844d("TECameraModeBase", "setAperture exception: " + d.f150858b);
            this.f150843r.mo206502b(-432, -432, d.f150858b, this.f150847v);
        }
    }

    /* renamed from: a */
    public int mo206566a(C60420o oVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f150845t.f150684m) {
            return m234391b(oVar);
        }
        this.f150822H = oVar;
        this.f150846u.mo206622a(oVar);
        this.f150846u.mo206621a(this.f150845t);
        if (this.f150839n == null || this.f150841p == null || this.f150840o == null) {
            C60427s.m234843c("TECameraModeBase", "Env is null");
            this.f150822H.mo206893a().mo206916a(-100, this.f150845t.f150676e, "Env is null");
            return -100;
        }
        boolean g = this.f150839n.mo206829g(this.f150838m);
        boolean f = this.f150839n.mo206828f(this.f150838m);
        if (f || g) {
            boolean k = oVar.mo206911k();
            boolean z4 = this.f150850y.get();
            if (!f || !this.f150822H.mo206909i()) {
                z = true;
            } else {
                z = false;
            }
            C60427s.m234842b("TECameraModeBase", "focusAtPoint++");
            if (z4 && !z) {
                this.f150837e.run();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C60427s.m234842b("TECameraModeBase", "cancel previous touch af..");
            }
            C60420o oVar2 = this.f150822H;
            int i = this.f150845t.f150677f;
            if (this.f150845t.f150676e == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Rect a = oVar2.mo206892a(i, z2);
            if (a == null) {
                a = mo206690a(this.f150822H.mo206903d(), this.f150822H.mo206905e(), (float) this.f150822H.mo206906f(), (float) this.f150822H.mo206907g(), this.f150845t.f150677f, 0);
            }
            C60420o oVar3 = this.f150822H;
            int i2 = this.f150845t.f150677f;
            if (this.f150845t.f150676e == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            Rect b = oVar3.mo206898b(i2, z3);
            if (b == null) {
                b = mo206690a(this.f150822H.mo206903d(), this.f150822H.mo206905e(), (float) this.f150822H.mo206906f(), (float) this.f150822H.mo206907g(), this.f150845t.f150677f, 1);
            }
            if (!C60410n.m234785a(a) || !C60410n.m234785a(b)) {
                C60427s.m234844d("TECameraModeBase", "focusRect or meteringRect is not valid!");
                this.f150822H.mo206893a().mo206916a(-100, this.f150845t.f150676e, "focusRect or meteringRect is not valid!");
                return -100;
            }
            if (this.f150822H.mo206910j() && g) {
                this.f150846u.mo206603b(this.f150840o, b);
            }
            if (z) {
                if (g && this.f150822H.mo206910j()) {
                    CaptureRequest.Builder builder = this.f150840o;
                    mo206699b(builder, this.f150846u.mo206600a(builder, !z), this.f150848w);
                    this.f150850y.set(false);
                }
                return -412;
            }
            this.f150850y.set(true);
            this.f150846u.mo206602a(this.f150840o, a);
            CaptureRequest.Builder builder2 = this.f150840o;
            C60353a b2 = mo206699b(builder2, this.f150846u.mo206599a(builder2, this.f150850y, k), this.f150848w);
            if (b2.f150857a) {
                return 0;
            }
            this.f150850y.set(false);
            this.f150822H.mo206893a().mo206916a(-108, this.f150845t.f150676e, b2.f150858b);
            this.f150843r.mo206502b(-411, -411, b2.f150858b, this.f150847v);
            return -108;
        }
        C60427s.m234843c("TECameraModeBase", "do not support MeteringAreaAF!");
        this.f150822H.mo206893a().mo206916a(-412, this.f150845t.f150676e, "do not support MeteringAreaAF!");
        return -412;
    }

    /* renamed from: c */
    public String mo206705c(int i) throws CameraAccessException {
        int i2;
        String[] cameraIdList = this.f150842q.getCameraIdList();
        String str = null;
        if (cameraIdList == null) {
            C60427s.m234843c("TECameraModeBase", "cameraList is null");
            return null;
        }
        C60408m.m234769a("te_record_camera_size", (long) cameraIdList.length);
        C60427s.m234839a("TECameraModeBase", "selectCamera cameraList.size: " + cameraIdList.length);
        if (this.f150845t.f150648B.getBoolean("ve_enable_camera_devices_cache")) {
            C60427s.m234839a("TECameraModeBase", "Enable CameraDeviceCache");
            str = this.f150830P.get(Integer.valueOf(i));
        }
        if (str == null || str == "") {
            if (i == 2) {
                if (this.f150845t.f150674c == 3) {
                    str = ((TECameraOGXMProxy) this.f150839n).mo206815a(0);
                } else if (this.f150845t.f150652F.length() > 0 && !this.f150845t.f150652F.equals("-1")) {
                    C60427s.m234839a("TECameraModeBase", "Wide-angle camera id: " + this.f150845t.f150652F);
                    if (C60410n.m234788a(cameraIdList, this.f150845t.f150652F)) {
                        str = this.f150845t.f150652F;
                    } else {
                        C60427s.m234843c("TECameraModeBase", "Maybe this is not validate camera id: " + this.f150845t.f150652F);
                    }
                } else if (this.f150845t.f150674c == 8) {
                    str = ((C60393h) this.f150839n).mo206830c();
                } else {
                    str = this.f150839n.mo206821a(cameraIdList, this.f150842q);
                }
                this.f150843r.mo206502b(SmEvents.EVENT_NE_RR, 0, "enable wide angle", this.f150847v);
            } else if (i != 3) {
                if (i >= cameraIdList.length || i < 0) {
                    i = 1;
                }
                this.f150845t.f150676e = i;
                if (this.f150845t.f150683l && C60389d.m234632d()) {
                    str = ((C60395j) this.f150839n).mo206831a(this.f150842q, i, cameraIdList);
                }
                if (str == null) {
                    int length = cameraIdList.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        String str2 = cameraIdList[i3];
                        if (((Integer) this.f150842q.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        this.f150830P.put(Integer.valueOf(i2), str2);
                        if (i2 == i) {
                            str = str2;
                            break;
                        }
                        i3++;
                    }
                }
            } else if (this.f150845t.f150674c == 2) {
                str = this.f150839n.mo206823b(cameraIdList, this.f150842q);
            }
            if (str != null) {
                this.f150830P.put(Integer.valueOf(i), str);
            }
        }
        if (str == null) {
            C60427s.m234843c("TECameraModeBase", "selectCamera: camera tag is null, set 0 for default");
            str = "0";
        }
        C60427s.m234839a("TECameraModeBase", "selectCamera mCameraSettings.mFacing: " + this.f150845t.f150676e);
        C60427s.m234839a("TECameraModeBase", "selectCamera cameraTag: " + str);
        CameraCharacteristics cameraCharacteristics = this.f150842q.getCameraCharacteristics(str);
        this.f150838m = cameraCharacteristics;
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) this.f150838m.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (!(range == null || rational == null)) {
            this.f150845t.f150653G.f150706c = ((Integer) range.getLower()).intValue();
            this.f150845t.f150653G.f150704a = ((Integer) range.getUpper()).intValue();
            this.f150845t.f150653G.f150707d = (((float) rational.getNumerator()) * 1.0f) / ((float) rational.getDenominator());
        }
        return str;
    }

    /* renamed from: d */
    public void mo206709d(int i) {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206502b(-430, -430, "Capture Session is null", this.f150847v);
        }
        if (i > mo206721u()[1] || i < mo206721u()[0]) {
            this.f150843r.mo206502b(-430, -430, "invalid iso", this.f150847v);
            return;
        }
        if (!((Integer) this.f150840o.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) this.f150840o.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            this.f150840o.set(CaptureRequest.CONTROL_MODE, 0);
        }
        this.f150840o.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i));
        C60353a d = mo206707d(this.f150840o);
        if (!d.f150857a) {
            C60427s.m234844d("TECameraModeBase", "setISO exception: " + d.f150858b);
            this.f150843r.mo206502b(-430, -430, d.f150858b, this.f150847v);
        }
    }

    /* renamed from: b */
    private int m234391b(C60420o oVar) {
        boolean z;
        boolean z2;
        Object obj;
        Rect rect;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C60427s.m234842b("TECameraModeBase", "settings = " + oVar);
        this.f150822H = oVar;
        this.f150846u.mo206622a(oVar);
        this.f150846u.mo206621a(this.f150845t);
        if (this.f150839n == null || this.f150841p == null || this.f150840o == null) {
            C60427s.m234843c("TECameraModeBase", "Env is null");
            this.f150822H.mo206893a().mo206916a(-100, this.f150845t.f150676e, "Env is null");
            return -100;
        }
        boolean g = this.f150839n.mo206829g(this.f150838m);
        boolean f = this.f150839n.mo206828f(this.f150838m);
        if (f || g) {
            boolean z7 = this.f150850y.get();
            if (!f || !this.f150822H.mo206909i()) {
                z = true;
            } else {
                z = false;
            }
            if (z7 && !z) {
                this.f150837e.run();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C60427s.m234839a("TECameraModeBase", "cancel previous touch af..");
            }
            if (!g || !this.f150822H.mo206910j()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                C60420o oVar2 = this.f150822H;
                int i = this.f150845t.f150677f;
                if (this.f150845t.f150676e == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Rect b = oVar2.mo206898b(i, z6);
                if (b == null) {
                    obj = null;
                    b = mo206690a(this.f150822H.mo206903d(), this.f150822H.mo206905e(), (float) this.f150822H.mo206906f(), (float) this.f150822H.mo206907g(), this.f150845t.f150677f, 1);
                } else {
                    obj = null;
                }
                if (!C60410n.m234785a(b)) {
                    C60427s.m234844d("TECameraModeBase", "meteringRect is not valid!");
                    this.f150822H.mo206893a().mo206916a(-100, this.f150845t.f150676e, "meteringRect is not valid!");
                    return -100;
                }
                this.f150846u.mo206603b(this.f150840o, b);
                if (z) {
                    CaptureRequest.Builder builder = this.f150840o;
                    mo206699b(builder, this.f150846u.mo206600a(builder, false), this.f150848w);
                    this.f150850y.set(false);
                    return 0;
                }
                rect = b;
            } else {
                obj = null;
                rect = null;
            }
            if (!f || !this.f150822H.mo206909i()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                return -412;
            }
            C60420o oVar3 = this.f150822H;
            int i2 = this.f150845t.f150677f;
            if (this.f150845t.f150676e == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            Rect a = oVar3.mo206892a(i2, z4);
            if (a == null) {
                a = mo206690a(this.f150822H.mo206903d(), this.f150822H.mo206905e(), (float) this.f150822H.mo206906f(), (float) this.f150822H.mo206907g(), this.f150845t.f150677f, 0);
            }
            if (!C60410n.m234785a(a)) {
                C60427s.m234844d("TECameraModeBase", "focusRect is not valid!");
                this.f150822H.mo206893a().mo206916a(-100, this.f150845t.f150676e, "focusRect is not valid!");
                return -100;
            }
            this.f150850y.set(true);
            if (oVar.mo206912l() || !this.f150828N) {
                z5 = false;
            } else {
                this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f150840o.set(CaptureRequest.FLASH_MODE, 0);
                z5 = true;
            }
            this.f150846u.mo206602a(this.f150840o, a);
            mo206704c(this.f150840o);
            this.f150840o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f150840o.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a, 999)});
            if (rect != null) {
                this.f150840o.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
            }
            this.f150840o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            if (z5) {
                this.f150840o.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f150840o.set(CaptureRequest.FLASH_MODE, 1);
            }
            CaptureRequest.Builder builder2 = this.f150840o;
            C60353a b2 = mo206699b(builder2, this.f150846u.mo206599a(builder2, this.f150850y, oVar.mo206911k()), this.f150848w);
            if (b2.f150857a) {
                return 0;
            }
            this.f150850y.set(false);
            this.f150822H.mo206893a().mo206916a(-108, this.f150845t.f150676e, b2.f150858b);
            this.f150843r.mo206502b(-411, -411, b2.f150858b, obj);
            return -108;
        }
        C60427s.m234843c("TECameraModeBase", "not support focus and meter!");
        this.f150822H.mo206893a().mo206916a(-412, this.f150845t.f150676e, "not support focus and meter!");
        return -412;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public int mo206568a(boolean z) {
        int i;
        CaptureRequest.Builder builder = this.f150840o;
        if (builder == null) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "toggleTorch : CaptureRequest.Builder is null", this.f150847v);
            this.f150843r.mo206505d(this.f150845t.f150674c, -100, z ? 1 : 0, "toggleTorch : CaptureRequest.Builder is null", this.f150847v);
            return -100;
        }
        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
        if (z != 0) {
            i = 2;
        } else {
            i = 0;
        }
        builder.set(key, Integer.valueOf(i));
        AbstractC60396i.AbstractC60397a aVar = this.f150843r;
        aVar.mo206502b(104, 0, "camera2 will change flash mode " + z, null);
        C60353a d = mo206707d(this.f150840o);
        AbstractC60396i.AbstractC60397a aVar2 = this.f150843r;
        aVar2.mo206502b(LocationRequest.PRIORITY_NO_POWER, 0, "camera2 did change flash mode " + z, null);
        if (!d.f150857a) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -417. Reason: " + d.mo206734b());
            this.f150843r.mo206502b(-417, -417, d.f150858b, this.f150847v);
            this.f150843r.mo206505d(this.f150845t.f150674c, -417, z, d.f150858b, this.f150847v);
            return -417;
        }
        this.f150843r.mo206503c(this.f150845t.f150674c, 0, z, "camera torch success", this.f150847v);
        return 0;
    }

    /* renamed from: b */
    public void mo206702b(boolean z) {
        if (this.f150840o == null || this.f150841p == null) {
            this.f150843r.mo206499a(this.f150845t.f150674c, -100, "setExposureCompensation : Capture Session is null", this.f150847v);
            return;
        }
        try {
            this.f150840o.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
            mo206707d(this.f150840o);
        } catch (Exception e) {
            e.printStackTrace();
            this.f150843r.mo206502b(-427, -427, e.toString(), this.f150847v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C60353a mo206691a(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback) {
        return mo206699b(builder, captureCallback, mo206685A());
    }

    /* renamed from: a */
    public int mo206689a(float f, TECameraSettings.AbstractC60306m mVar) {
        CaptureRequest.Builder builder;
        Rect b = mo206698b(f);
        if (this.f150839n == null || this.f150849x == null || this.f150841p == null || (builder = this.f150840o) == null) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f150843r.mo206502b(-420, -420, "startZoom : Env is null", this.f150847v);
            return -100;
        } else if (b == null) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
            this.f150843r.mo206502b(-420, -420, "zoom rect is null.", this.f150847v);
            return -420;
        } else {
            builder.set(CaptureRequest.SCALER_CROP_REGION, b);
            C60353a d = mo206707d(this.f150840o);
            if (!d.f150857a) {
                C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d.mo206734b());
                this.f150843r.mo206502b(-420, -420, d.f150858b, this.f150847v);
                return -420;
            }
            if (mVar != null) {
                mVar.mo206535a(this.f150845t.f150674c, f, true);
            }
            mo206726z();
            return 0;
        }
    }

    /* renamed from: a */
    public int mo206567a(String str, int i) throws CameraAccessException {
        CameraCharacteristics cameraCharacteristics = this.f150838m;
        if (cameraCharacteristics == null) {
            C60427s.m234842b("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -401;
        } else if (!this.f150839n.mo206822a(cameraCharacteristics, i)) {
            return -403;
        } else {
            this.f150845t.f150677f = ((Integer) this.f150838m.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (((StreamConfigurationMap) this.f150838m.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null) {
                return -401;
            }
            this.f150815A = this.f150839n.mo206819a(this.f150838m, this.f150845t.f150674c, this.f150845t.f150685n);
            this.f150816B = 1.0f;
            this.f150835c = (Rect) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            mo206581h();
            this.f150820F = this.f150845t.f150648B.getBoolean("useCameraFaceDetect");
            this.f150819E = (int[]) this.f150838m.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
            return 0;
        }
    }

    /* renamed from: b */
    public void mo206700b(float f, TECameraSettings.AbstractC60306m mVar) {
        if (this.f150841p == null || this.f150849x == null || this.f150840o == null) {
            C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f150843r.mo206499a(this.f150845t.f150674c, -420, "Camera info is null, may be you need reopen camera.", this.f150847v);
            return;
        }
        if (this.f150816B < this.f150815A || f <= 1.0f) {
            Rect rect = this.f150817C;
            if (rect == null || !rect.equals(this.f150835c) || f > 1.0f) {
                C60427s.m234842b("TECameraModeBase", "mNowZoom = " + this.f150816B);
                this.f150816B = this.f150816B * f;
            } else {
                C60427s.m234842b("TECameraModeBase", "mZoomSize = " + this.f150817C + ";mActiveArraySize = " + this.f150835c + ";factor = " + f);
                this.f150816B = 1.0f;
            }
        } else {
            C60427s.m234842b("TECameraModeBase", "mNowZoom = " + this.f150816B + ";mMaxZoom = " + this.f150815A + ";factor = " + f);
            this.f150816B = this.f150815A;
        }
        Rect c = mo206703c(this.f150816B);
        if (c != null) {
            this.f150840o.set(CaptureRequest.SCALER_CROP_REGION, c);
            C60353a d = mo206707d(this.f150840o);
            if (!d.f150857a) {
                C60427s.m234844d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d.mo206734b());
                this.f150843r.mo206502b(-420, -420, d.f150858b, this.f150847v);
                return;
            }
            this.f150817C = c;
            if (mVar != null) {
                mVar.mo206535a(this.f150845t.f150674c, this.f150816B, true);
            }
            mo206726z();
        }
    }

    public AbstractC60347b(C60362g gVar, Context context, Handler handler) {
        this.f150844s = gVar;
        TECameraSettings H = gVar.mo206834H();
        this.f150845t = H;
        this.f150839n = C60390e.m234633a(context, H.f150674c);
        this.f150843r = this.f150844s.mo206835I();
        this.f150848w = handler;
        this.f150851z = this.f150845t.f150681j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C60353a mo206699b(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C60353a aVar = new C60353a();
        if (builder == null) {
            aVar.f150858b = "CaptureRequest.Builder is null";
            C60427s.m234844d("TECameraModeBase", "updatePreview: " + aVar.f150858b);
            return aVar;
        } else if (this.f150841p == null) {
            aVar.f150858b = "Capture Session is null";
            C60427s.m234844d("TECameraModeBase", "updatePreview: " + aVar.f150858b);
            return aVar;
        } else {
            CaptureRequest build = builder.build();
            this.f150849x = build;
            try {
                this.f150841p.setRepeatingRequest(build, captureCallback, handler);
                aVar.f150857a = true;
                this.f150829O = true;
            } catch (CameraAccessException e) {
                e.printStackTrace();
                aVar.f150858b = e.getMessage();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
                aVar.f150858b = e2.getMessage();
                this.f150829O = false;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                aVar.f150858b = e3.getMessage();
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public C60353a mo206692a(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C60353a aVar = new C60353a();
        if (builder == null) {
            aVar.f150858b = "CaptureRequest.Builder is null";
            C60427s.m234844d("TECameraModeBase", "capture: " + aVar.f150858b);
            return aVar;
        } else if (this.f150841p == null) {
            aVar.f150858b = "Capture Session is null";
            C60427s.m234844d("TECameraModeBase", "capture: " + aVar.f150858b);
            return aVar;
        } else {
            try {
                this.f150841p.capture(builder.build(), captureCallback, handler);
                aVar.f150857a = true;
            } catch (CameraAccessException e) {
                e.printStackTrace();
                aVar.f150858b = e.getMessage();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
                aVar.f150858b = e2.getMessage();
            }
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Rect mo206690a(int i, int i2, float f, float f2, int i3, int i4) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Rect rect = (Rect) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        C60427s.m234842b("TECameraModeBase", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.f150838m.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder();
        sb.append("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append("]");
        C60427s.m234839a("onAreaTouchEvent", sb.toString());
        int i5 = this.f150845t.f150686o.f150716a;
        int i6 = this.f150845t.f150686o.f150717b;
        if (90 == this.f150845t.f150677f || 270 == this.f150845t.f150677f) {
            i5 = this.f150845t.f150686o.f150717b;
            i6 = this.f150845t.f150686o.f150716a;
        }
        int i7 = i6 * i;
        int i8 = i5 * i2;
        float f8 = BitmapDescriptorFactory.HUE_RED;
        if (i7 >= i8) {
            f5 = (((float) i) * 1.0f) / ((float) i5);
            f4 = ((((float) i6) * f5) - ((float) i2)) / 2.0f;
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            float f9 = (((float) i2) * 1.0f) / ((float) i6);
            f3 = ((((float) i5) * f9) - ((float) i)) / 2.0f;
            f5 = f9;
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        float f10 = (f + f3) / f5;
        float f11 = (f2 + f4) / f5;
        if (90 == i3) {
            float f12 = ((float) this.f150845t.f150686o.f150717b) - f10;
            f10 = f11;
            f11 = f12;
        } else if (270 == i3) {
            float f13 = ((float) this.f150845t.f150686o.f150716a) - f11;
            f11 = f10;
            f10 = f13;
        }
        Rect rect2 = (Rect) this.f150849x.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            C60427s.m234843c("TECameraModeBase", "can't get crop region");
        } else {
            rect = rect2;
        }
        int width = rect.width();
        int height = rect.height();
        if (this.f150845t.f150686o.f150717b * width > this.f150845t.f150686o.f150716a * height) {
            f6 = (((float) height) * 1.0f) / ((float) this.f150845t.f150686o.f150717b);
            f8 = (((float) width) - (((float) this.f150845t.f150686o.f150716a) * f6)) / 2.0f;
            f7 = BitmapDescriptorFactory.HUE_RED;
        } else {
            float f14 = (((float) width) * 1.0f) / ((float) this.f150845t.f150686o.f150716a);
            float f15 = (((float) height) - (((float) this.f150845t.f150686o.f150717b) * f14)) / 2.0f;
            f6 = f14;
            f7 = f15;
        }
        float f16 = (f10 * f6) + f8 + ((float) rect.left);
        float f17 = (f11 * f6) + f7 + ((float) rect.top);
        if (this.f150845t.f150676e == 1) {
            f17 = ((float) rect.height()) - f17;
        }
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = (double) f16;
            rect3.left = C60410n.m234775a((int) (d - (((double) rect.width()) * 0.05d)), 0, rect.width());
            rect3.right = C60410n.m234775a((int) (d + (((double) rect.width()) * 0.05d)), 0, rect.width());
            double d2 = (double) f17;
            rect3.top = C60410n.m234775a((int) (d2 - (((double) rect.height()) * 0.05d)), 0, rect.height());
            rect3.bottom = C60410n.m234775a((int) (d2 + (0.05d * ((double) rect.height()))), 0, rect.height());
        } else {
            double d3 = (double) f16;
            rect3.left = C60410n.m234775a((int) (d3 - (((double) rect.width()) * 0.1d)), 0, rect.width());
            rect3.right = C60410n.m234775a((int) (d3 + (((double) rect.width()) * 0.1d)), 0, rect.width());
            double d4 = (double) f17;
            rect3.top = C60410n.m234775a((int) (d4 - (((double) rect.height()) * 0.1d)), 0, rect.height());
            rect3.bottom = C60410n.m234775a((int) (d4 + (((double) rect.height()) * 0.1d)), 0, rect.height());
        }
        if (rect3.left < 0 || rect3.left > rect.right) {
            rect3.left = rect.left;
        }
        if (rect3.top < 0 || rect3.top > rect.bottom) {
            rect3.top = rect.top;
        }
        if (rect3.right < 0 || rect3.right > rect.right) {
            rect3.right = rect.right;
        }
        if (rect3.bottom < 0 || rect3.bottom > rect.bottom) {
            rect3.bottom = rect.bottom;
        }
        C60427s.m234839a("TECameraModeBase", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]");
        return rect3;
    }
}
