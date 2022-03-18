package com.ss.android.lark.cameraview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageView;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.ss.android.lark.cameraview.C32743b;
import com.ss.android.lark.cameraview.p1588b.AbstractC32754c;
import com.ss.android.lark.cameraview.p1590d.C32772a;
import com.ss.android.lark.cameraview.p1590d.C32774c;
import com.ss.android.lark.cameraview.p1590d.C32778d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ak;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.cameraview.b */
public class C32743b implements Camera.PreviewCallback, AbstractC32797g {

    /* renamed from: c */
    private static final Object f84007c = new Object();

    /* renamed from: d */
    private static volatile C32743b f84008d;

    /* renamed from: A */
    private int f84009A = 0;

    /* renamed from: B */
    private int f84010B = 0;

    /* renamed from: C */
    private boolean f84011C = true;

    /* renamed from: D */
    private int f84012D = 1600000;

    /* renamed from: E */
    private SensorManager f84013E = null;

    /* renamed from: F */
    private SensorEventListener f84014F = new SensorEventListener() {
        /* class com.ss.android.lark.cameraview.C32743b.C327441 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (1 == sensorEvent.sensor.getType()) {
                float[] fArr = sensorEvent.values;
                C32743b.this.f84018b = C32772a.m125801a(fArr[0], fArr[1]);
                C32743b.this.mo120698b();
            }
        }
    };

    /* renamed from: G */
    private int f84015G;

    /* renamed from: H */
    private boolean f84016H;

    /* renamed from: a */
    int f84017a;

    /* renamed from: b */
    public int f84018b = 0;

    /* renamed from: e */
    private Camera f84019e;

    /* renamed from: f */
    private Camera.Parameters f84020f;

    /* renamed from: g */
    private AtomicBoolean f84021g = new AtomicBoolean(false);

    /* renamed from: h */
    private int f84022h = -1;

    /* renamed from: i */
    private int f84023i = -1;

    /* renamed from: j */
    private int f84024j = -1;

    /* renamed from: k */
    private SurfaceHolder f84025k = null;

    /* renamed from: l */
    private float f84026l = -1.0f;

    /* renamed from: m */
    private boolean f84027m = false;

    /* renamed from: n */
    private MediaRecorder f84028n;

    /* renamed from: o */
    private String f84029o;

    /* renamed from: p */
    private String f84030p;

    /* renamed from: q */
    private String f84031q;

    /* renamed from: r */
    private Bitmap f84032r = null;

    /* renamed from: s */
    private AbstractC32754c f84033s;

    /* renamed from: t */
    private ImageView f84034t;

    /* renamed from: u */
    private ImageView f84035u;

    /* renamed from: v */
    private int f84036v;

    /* renamed from: w */
    private int f84037w;

    /* renamed from: x */
    private int f84038x = 90;

    /* renamed from: y */
    private int f84039y = 0;

    /* renamed from: z */
    private byte[] f84040z;

    /* renamed from: com.ss.android.lark.cameraview.b$a */
    public interface AbstractC32747a {
        /* renamed from: a */
        void mo120639a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.cameraview.b$b */
    public interface AbstractC32748b {
    }

    /* renamed from: com.ss.android.lark.cameraview.b$c */
    public interface AbstractC32749c {
        /* renamed from: a */
        void mo120673a();
    }

    /* renamed from: com.ss.android.lark.cameraview.b$d */
    public interface AbstractC32750d {
        /* renamed from: a */
        void mo120713a(String str, Bitmap bitmap);
    }

    /* renamed from: com.ss.android.lark.cameraview.b$e */
    public interface AbstractC32751e {
        /* renamed from: a */
        void mo120714a(Bitmap bitmap, boolean z);
    }

    /* renamed from: a */
    private static int m125647a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120684a(float f, int i) {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120689a(Context context, SurfaceView surfaceView) {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: c */
    public void mo120702c() {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: f */
    public void mo120705f() {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: g */
    public void mo120706g() {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120693a(ImageView imageView, ImageView imageView2) {
        this.f84034t = imageView;
        this.f84035u = imageView2;
        if (imageView != null) {
            this.f84038x = C32774c.m125806a().mo120748a(imageView.getContext(), this.f84022h);
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120696a(String str) {
        this.f84030p = str;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120690a(Context context, SurfaceView surfaceView, AbstractC32747a aVar) {
        AbstractC32754c cVar;
        if (Build.VERSION.SDK_INT >= 23 || C32778d.m125814a(this.f84022h) || (cVar = this.f84033s) == null) {
            synchronized (f84007c) {
                if (this.f84019e == null) {
                    m125655b(this.f84022h);
                }
                aVar.mo120639a();
            }
            return;
        }
        cVar.mo120715a();
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public synchronized void mo120692a(SurfaceHolder surfaceHolder, float f) {
        Camera camera;
        if (this.f84027m) {
            Log.m165383e("CameraInterface", "cannot switch camera when recording");
            return;
        }
        int i = this.f84022h;
        int i2 = this.f84023i;
        if (i == i2) {
            this.f84022h = this.f84024j;
        } else {
            this.f84022h = i2;
        }
        mo120707h();
        Log.m165389i("CameraInterface", "open start");
        m125655b(this.f84022h);
        if (Build.VERSION.SDK_INT > 17 && (camera = this.f84019e) != null) {
            try {
                camera.enableShutterSound(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Log.m165389i("CameraInterface", "open end");
        mo120700b(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120697a(boolean z) {
        this.f84016H = z;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120694a(AbstractC32751e eVar) {
        if (this.f84011C) {
            this.f84011C = false;
            if (this.f84019e != null) {
                int i = this.f84038x;
                if (i == 90) {
                    this.f84015G = Math.abs(this.f84018b + i) % 360;
                } else if (i == 270) {
                    this.f84015G = Math.abs(i - this.f84018b);
                }
                Log.m165389i("CameraInterface", this.f84018b + " = " + this.f84038x + " = " + this.f84015G);
                try {
                    this.f84019e.takePicture(null, null, new Camera.PictureCallback(eVar) {
                        /* class com.ss.android.lark.cameraview.$$Lambda$b$EV3toiXleVX_dEnge8lC4WEvQM */
                        public final /* synthetic */ C32743b.AbstractC32751e f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onPictureTaken(byte[] bArr, Camera camera) {
                            C32743b.this.m125653a((C32743b) this.f$1, (C32743b.AbstractC32751e) bArr, (byte[]) camera);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f84011C = true;
                }
            }
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120688a(Context context, Surface surface, float f, AbstractC32748b bVar) {
        Camera.Size size;
        Camera camera = this.f84019e;
        if (camera != null) {
            try {
                camera.setPreviewCallback(null);
            } catch (Exception e) {
                Log.m165383e("CameraInterface", e.getMessage());
            }
            m125660j();
            int i = (this.f84018b + 90) % 360;
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(i) {
                /* class com.ss.android.lark.cameraview.$$Lambda$b$1YQZzhjiEHAu2P1f2p1ZmiwxayE */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C32743b.this.m125658d(this.f$1);
                }
            });
            if (!this.f84027m) {
                if (this.f84019e == null) {
                    m125655b(this.f84022h);
                }
                if (this.f84028n == null) {
                    this.f84028n = new MediaRecorder();
                }
                if (this.f84020f == null) {
                    this.f84020f = this.f84019e.getParameters();
                }
                List<String> supportedFocusModes = this.f84020f.getSupportedFocusModes();
                if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                    this.f84020f.setFocusMode("continuous-video");
                }
                try {
                    this.f84019e.setParameters(this.f84020f);
                    try {
                        this.f84019e.unlock();
                    } catch (RuntimeException e2) {
                        Log.m165383e("CameraInterface", e2.getLocalizedMessage());
                    }
                    this.f84028n.reset();
                    this.f84028n.setCamera(this.f84019e);
                    this.f84028n.setVideoSource(1);
                    this.f84028n.setAudioSource(1);
                    this.f84028n.setOutputFormat(2);
                    this.f84028n.setVideoEncoder(2);
                    this.f84028n.setAudioEncoder(3);
                    if (this.f84020f.getSupportedVideoSizes() == null) {
                        size = C32774c.m125806a().mo120749a(this.f84020f.getSupportedPreviewSizes(), 600, f);
                    } else {
                        size = C32774c.m125806a().mo120749a(this.f84020f.getSupportedVideoSizes(), 600, f);
                    }
                    Log.m165389i("CameraInterface", "setVideoSize    width = " + size.width + "height = " + size.height);
                    if (size.width == size.height) {
                        this.f84028n.setVideoSize(this.f84036v, this.f84037w);
                    } else {
                        this.f84028n.setVideoSize(size.width, size.height);
                    }
                    if (this.f84022h != this.f84024j) {
                        this.f84028n.setOrientationHint(i);
                    } else if (this.f84038x == 270) {
                        if (i == 0) {
                            this.f84028n.setOrientationHint(180);
                        } else if (i == 270) {
                            this.f84028n.setOrientationHint(270);
                        } else {
                            this.f84028n.setOrientationHint(90);
                        }
                    } else if (i == 90) {
                        this.f84028n.setOrientationHint(270);
                    } else if (i == 270) {
                        this.f84028n.setOrientationHint(90);
                    } else {
                        this.f84028n.setOrientationHint(i);
                    }
                    this.f84028n.setVideoEncodingBitRate(this.f84012D);
                    this.f84028n.setPreviewDisplay(surface);
                    String str = "video_" + System.currentTimeMillis() + ".mp4";
                    this.f84029o = str;
                    this.f84028n.setOutputFile(m125650a(str, context).getAbsolutePath());
                    try {
                        this.f84028n.prepare();
                        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                            /* class com.ss.android.lark.cameraview.$$Lambda$b$eIULRIb00hzNBc8FdpnN6_n2Huc */

                            public final void run() {
                                C32743b.this.m125662l();
                            }
                        });
                        this.f84027m = true;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        Log.m165389i("CameraInterface", "startRecord IllegalStateException");
                        AbstractC32754c cVar = this.f84033s;
                        if (cVar != null) {
                            cVar.mo120715a();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    Log.m165383e("CameraInterface", "mParams is not ok: " + this.f84020f.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r3.f84028n = null;
        r3.f84027m = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r2 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r5 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (com.larksuite.framework.utils.C26311p.m95291k(r3.f84031q) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r6.mo120713a(null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        mo120703d();
        r5 = m125650a(r3.f84029o, r4).getAbsolutePath();
        r6.mo120713a(r5, r3.f84032r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (android.os.Build.VERSION.SDK_INT <= 29) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        com.larksuite.framework.thread.CoreThreadPool.getDefault().getCachedThreadPool().execute(new com.ss.android.lark.cameraview.$$Lambda$b$u02B4ZmQ_krgUm77LkOZr3eUKD4(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2 != null) goto L_0x0021;
     */
    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo120691a(android.content.Context r4, boolean r5, com.ss.android.lark.cameraview.C32743b.AbstractC32750d r6) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.cameraview.C32743b.mo120691a(android.content.Context, boolean, com.ss.android.lark.cameraview.b$d):void");
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120687a(final Context context, final float f, final float f2, final int i, final int i2, final AbstractC32749c cVar) {
        Camera camera = this.f84019e;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                Rect a = m125648a(f, f2, 1.0f, context);
                try {
                    this.f84019e.cancelAutoFocus();
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
                if (parameters.getMaxNumFocusAreas() > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(a, 800));
                    parameters.setFocusAreas(arrayList);
                    final String focusMode = parameters.getFocusMode();
                    try {
                        parameters.setFocusMode("auto");
                        this.f84019e.setParameters(parameters);
                        this.f84019e.autoFocus(new Camera.AutoFocusCallback() {
                            /* class com.ss.android.lark.cameraview.C32743b.C327463 */

                            public void onAutoFocus(boolean z, Camera camera) {
                                if (z || C32743b.this.f84017a > 10) {
                                    try {
                                        Camera.Parameters parameters = camera.getParameters();
                                        parameters.setFocusMode(focusMode);
                                        camera.setParameters(parameters);
                                    } catch (Exception unused) {
                                        Log.m165383e("CameraInterface", "autoFocus failed");
                                    }
                                    C32743b.this.f84017a = 0;
                                    cVar.mo120673a();
                                    return;
                                }
                                C32743b.this.f84017a++;
                                C32743b.this.mo120687a(context, f, f2, i, i2, cVar);
                            }
                        });
                    } catch (Exception unused) {
                        Log.m165383e("CameraInterface", "autoFocus failed");
                    }
                } else {
                    Log.m165389i("CameraInterface", "focus areas not supported");
                    cVar.mo120673a();
                }
            } catch (Exception e2) {
                Log.m165383e("CameraInterface", "handleFocus mCamera.getParameters() failed : e = " + e2.toString());
            }
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120695a(AbstractC32754c cVar) {
        this.f84033s = cVar;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: e */
    public void mo120704e() {
        if (this.f84016H) {
            m125659i();
        } else {
            mo120707h();
        }
    }

    /* renamed from: a */
    public static synchronized C32743b m125649a() {
        C32743b bVar;
        synchronized (C32743b.class) {
            if (f84008d == null) {
                synchronized (C32743b.class) {
                    if (f84008d == null) {
                        f84008d = new C32743b();
                    }
                }
            }
            bVar = f84008d;
        }
        return bVar;
    }

    /* renamed from: i */
    private void m125659i() {
        if (this.f84019e != null) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.cameraview.$$Lambda$mXaLGF5XEy9OYOoxWSEoeJWvcGo */

                public final void run() {
                    C32743b.this.mo120707h();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private /* synthetic */ void m125662l() {
        try {
            this.f84028n.start();
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165389i("CameraInterface", "startRecord IllegalStateException");
            AbstractC32754c cVar = this.f84033s;
            if (cVar != null) {
                cVar.mo120715a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private /* synthetic */ void m125663m() {
        try {
            this.f84019e.stopPreview();
            this.f84019e.setPreviewDisplay(null);
            this.f84021g.set(false);
        } catch (Exception e) {
            Log.m165383e("CameraInterface", e.getMessage());
        }
    }

    /* renamed from: j */
    private void m125660j() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.canDisableShutterSound) {
                    this.f84019e.enableShutterSound(false);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m125661k() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            int i2 = cameraInfo.facing;
            if (i2 == 0) {
                this.f84023i = cameraInfo.facing;
            } else if (i2 == 1) {
                this.f84024j = cameraInfo.facing;
            }
        }
    }

    /* renamed from: d */
    public void mo120703d() {
        Camera camera = this.f84019e;
        if (camera != null) {
            try {
                camera.setPreviewCallback(null);
            } catch (Exception e) {
                Log.m165383e("CameraInterface", e.getMessage());
            }
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.cameraview.$$Lambda$b$jNeHdrSafl3FTAWjQ7n4FOsCfU */

                public final void run() {
                    C32743b.this.m125663m();
                }
            });
            Log.m165389i("CameraInterface", "=== Stop Preview ===");
        }
    }

    private C32743b() {
        m125661k();
        this.f84022h = this.f84023i;
        this.f84030p = "";
    }

    /* renamed from: h */
    public void mo120707h() {
        synchronized (f84007c) {
            this.f84033s = null;
            Camera camera = this.f84019e;
            if (camera != null) {
                try {
                    camera.setPreviewCallback(null);
                    this.f84034t = null;
                    this.f84035u = null;
                    this.f84019e.stopPreview();
                    this.f84019e.setPreviewDisplay(null);
                    this.f84025k = null;
                    this.f84021g.set(false);
                    this.f84019e.release();
                    this.f84019e = null;
                    SensorManager sensorManager = this.f84013E;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this.f84014F);
                        this.f84013E = null;
                    }
                    Log.m165389i("CameraInterface", "=== Destroy Camera ===");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Log.m165389i("CameraInterface", "=== Camera  Null===");
            }
        }
    }

    /* renamed from: b */
    public void mo120698b() {
        int i;
        int i2;
        ImageView imageView = this.f84034t;
        if (imageView != null && (i = this.f84039y) != (i2 = this.f84018b)) {
            int i3 = -90;
            int i4 = 90;
            if (i == 0) {
                if (i2 == 90) {
                    i3 = 0;
                    i4 = -90;
                } else if (i2 == 270) {
                    i3 = 0;
                }
                float f = (float) i3;
                float f2 = (float) i4;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", f, f2);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f84035u, "rotation", f, f2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(500L);
                animatorSet.start();
                this.f84039y = this.f84018b;
            } else if (i == 90) {
                if (i2 != 0 && i2 == 180) {
                    i4 = -180;
                    float f3 = (float) i3;
                    float f22 = (float) i4;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "rotation", f3, f22);
                    ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(this.f84035u, "rotation", f3, f22);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat3, ofFloat22);
                    animatorSet2.setDuration(500L);
                    animatorSet2.start();
                    this.f84039y = this.f84018b;
                }
                i4 = 0;
                float f32 = (float) i3;
                float f222 = (float) i4;
                ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(imageView, "rotation", f32, f222);
                ObjectAnimator ofFloat222 = ObjectAnimator.ofFloat(this.f84035u, "rotation", f32, f222);
                AnimatorSet animatorSet22 = new AnimatorSet();
                animatorSet22.playTogether(ofFloat32, ofFloat222);
                animatorSet22.setDuration(500L);
                animatorSet22.start();
                this.f84039y = this.f84018b;
            } else if (i == 180) {
                if (i2 == 90) {
                    i3 = 180;
                    i4 = 270;
                } else if (i2 != 270) {
                    i3 = 180;
                    i4 = 0;
                } else {
                    i3 = 180;
                }
                float f322 = (float) i3;
                float f2222 = (float) i4;
                ObjectAnimator ofFloat322 = ObjectAnimator.ofFloat(imageView, "rotation", f322, f2222);
                ObjectAnimator ofFloat2222 = ObjectAnimator.ofFloat(this.f84035u, "rotation", f322, f2222);
                AnimatorSet animatorSet222 = new AnimatorSet();
                animatorSet222.playTogether(ofFloat322, ofFloat2222);
                animatorSet222.setDuration(500L);
                animatorSet222.start();
                this.f84039y = this.f84018b;
            } else if (i == 270) {
                if (i2 == 0 || i2 != 180) {
                    i3 = 90;
                    i4 = 0;
                    float f3222 = (float) i3;
                    float f22222 = (float) i4;
                    ObjectAnimator ofFloat3222 = ObjectAnimator.ofFloat(imageView, "rotation", f3222, f22222);
                    ObjectAnimator ofFloat22222 = ObjectAnimator.ofFloat(this.f84035u, "rotation", f3222, f22222);
                    AnimatorSet animatorSet2222 = new AnimatorSet();
                    animatorSet2222.playTogether(ofFloat3222, ofFloat22222);
                    animatorSet2222.setDuration(500L);
                    animatorSet2222.start();
                    this.f84039y = this.f84018b;
                }
                i3 = 90;
                i4 = 180;
                float f32222 = (float) i3;
                float f222222 = (float) i4;
                ObjectAnimator ofFloat32222 = ObjectAnimator.ofFloat(imageView, "rotation", f32222, f222222);
                ObjectAnimator ofFloat222222 = ObjectAnimator.ofFloat(this.f84035u, "rotation", f32222, f222222);
                AnimatorSet animatorSet22222 = new AnimatorSet();
                animatorSet22222.playTogether(ofFloat32222, ofFloat222222);
                animatorSet22222.setDuration(500L);
                animatorSet22222.start();
                this.f84039y = this.f84018b;
            }
            i3 = 0;
            i4 = 0;
            float f322222 = (float) i3;
            float f2222222 = (float) i4;
            ObjectAnimator ofFloat322222 = ObjectAnimator.ofFloat(imageView, "rotation", f322222, f2222222);
            ObjectAnimator ofFloat2222222 = ObjectAnimator.ofFloat(this.f84035u, "rotation", f322222, f2222222);
            AnimatorSet animatorSet222222 = new AnimatorSet();
            animatorSet222222.playTogether(ofFloat322222, ofFloat2222222);
            animatorSet222222.setDuration(500L);
            animatorSet222222.start();
            this.f84039y = this.f84018b;
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: b */
    public void mo120701b(boolean z) {
        this.f84021g.set(z);
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: b */
    public void mo120699b(Context context) {
        if (this.f84013E == null) {
            this.f84013E = (SensorManager) context.getSystemService("sensor");
        }
        this.f84013E.unregisterListener(this.f84014F);
    }

    /* renamed from: b */
    private synchronized void m125655b(int i) {
        Camera camera;
        try {
            ak.m224264a();
            this.f84019e = Camera.open(i);
            ak.m224267b();
        } catch (Exception e) {
            e.printStackTrace();
            AbstractC32754c cVar = this.f84033s;
            if (cVar != null) {
                cVar.mo120715a();
            }
        }
        if (Build.VERSION.SDK_INT > 17 && (camera = this.f84019e) != null) {
            try {
                camera.enableShutterSound(false);
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.m165383e("CameraInterface", "enable shutter sound faild");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m125658d(int i) {
        try {
            Camera.Parameters parameters = this.f84019e.getParameters();
            int i2 = parameters.getPreviewSize().width;
            int i3 = parameters.getPreviewSize().height;
            YuvImage yuvImage = new YuvImage(this.f84040z, parameters.getPreviewFormat(), i2, i3, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i2, i3), 50, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f84032r = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            Matrix matrix = new Matrix();
            int i4 = this.f84022h;
            if (i4 == this.f84023i) {
                matrix.setRotate((float) i);
            } else if (i4 == this.f84024j) {
                matrix.setRotate(270.0f);
            }
            Bitmap bitmap = this.f84032r;
            this.f84032r = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f84032r.getHeight(), matrix, true);
        } catch (Exception e) {
            Log.m165383e("CameraInterface", e.getMessage());
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120685a(int i) {
        this.f84012D = i;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120686a(Context context) {
        if (this.f84013E == null) {
            this.f84013E = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.f84013E;
        sensorManager.registerListener(this.f84014F, sensorManager.getDefaultSensor(1), 3);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f84040z = bArr;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m125651a(Context context, String str) {
        Uri a = MediaStoreUtil.m94879a(context, this.f84029o);
        if (a != null) {
            MediaStoreUtil.m94891a(str, a, context);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m125652a(AbstractC32751e eVar, Bitmap bitmap) {
        if (eVar != null) {
            int i = this.f84015G;
            if (i == 90 || i == 270) {
                eVar.mo120714a(bitmap, true);
            } else {
                eVar.mo120714a(bitmap, false);
            }
        }
    }

    /* renamed from: a */
    private File m125650a(String str, Context context) {
        File file;
        if (Build.VERSION.SDK_INT <= 29) {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Lark");
        } else {
            file = DirectFileAccess.m95103a(DirectFileAccess.StorageParams.m95112i().mo93404a(context).mo93406a(DirectFileAccess.StorageLocation.EXTERNAL).mo93405a(DirectFileAccess.PathType.CACHE).mo93407a());
        }
        File file2 = new File(new File(file, "video"), str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: b */
    public void mo120700b(SurfaceHolder surfaceHolder, float f) {
        if (this.f84021g.get()) {
            Log.m165389i("CameraInterface", "doStartPreview isPreviewing");
        }
        if (this.f84026l < BitmapDescriptorFactory.HUE_RED) {
            this.f84026l = f;
        }
        if (surfaceHolder != null) {
            this.f84025k = surfaceHolder;
            Camera camera = this.f84019e;
            if (camera != null) {
                try {
                    this.f84020f = camera.getParameters();
                    Camera.Size a = C32774c.m125806a().mo120749a(this.f84020f.getSupportedPreviewSizes(), 1000, f);
                    Camera.Size b = C32774c.m125806a().mo120752b(this.f84020f.getSupportedPictureSizes(), 1200, f);
                    this.f84020f.setPreviewSize(a.width, a.height);
                    this.f84036v = a.width;
                    this.f84037w = a.height;
                    this.f84020f.setPictureSize(b.width, b.height);
                    if (C32774c.m125806a().mo120750a(this.f84020f.getSupportedPictureFormats(), DynamicModule.f58006b)) {
                        this.f84020f.setPictureFormat(DynamicModule.f58006b);
                        this.f84020f.setJpegQuality(100);
                    }
                    this.f84019e.setParameters(this.f84020f);
                    this.f84020f = this.f84019e.getParameters();
                    this.f84019e.cancelAutoFocus();
                    this.f84019e.setPreviewDisplay(surfaceHolder);
                    this.f84019e.setDisplayOrientation(this.f84038x);
                    this.f84019e.setPreviewCallback(this);
                    this.f84019e.startPreview();
                    if (C32774c.m125806a().mo120751a(this.f84020f.getSupportedFocusModes(), "auto")) {
                        Log.m165389i("CameraInterface", "setFocusMode focus_mode_auto");
                        this.f84020f.setFocusMode("auto");
                        this.f84019e.autoFocus(new Camera.AutoFocusCallback() {
                            /* class com.ss.android.lark.cameraview.C32743b.C327452 */

                            public void onAutoFocus(boolean z, Camera camera) {
                                Log.m165389i("CameraInterface", "onAutoFocus success: " + z);
                            }
                        });
                    }
                    this.f84021g.set(true);
                    this.f84011C = true;
                    Log.m165389i("CameraInterface", "=== Start Preview ===");
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.m165383e("CameraInterface", "=== Start Preview === error: " + e);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m125656b(byte[] bArr, AbstractC32751e eVar) {
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            Matrix matrix = new Matrix();
            int i = this.f84022h;
            if (i == this.f84023i) {
                Log.m165379d("CameraInterface", "PostPosition, rotate:" + this.f84015G);
                matrix.setRotate((float) this.f84015G);
            } else if (i == this.f84024j) {
                Log.m165379d("CameraInterface", "FrontPosition, rotate:" + (360 - this.f84015G));
                matrix.setRotate((float) (360 - this.f84015G));
                matrix.postScale(-1.0f, 1.0f);
            }
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(eVar, Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true)) {
                /* class com.ss.android.lark.cameraview.$$Lambda$b$_tISgI8ZTNG8_3Kb7BeAYGOGC0 */
                public final /* synthetic */ C32743b.AbstractC32751e f$1;
                public final /* synthetic */ Bitmap f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C32743b.this.m125652a((C32743b) this.f$1, (C32743b.AbstractC32751e) this.f$2);
                }
            });
            this.f84011C = true;
        } catch (Exception e) {
            e.printStackTrace();
            this.f84011C = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m125653a(AbstractC32751e eVar, byte[] bArr, Camera camera) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(bArr, eVar) {
            /* class com.ss.android.lark.cameraview.$$Lambda$b$QtViMTN4nOkKJ02W5wCB3RK2HiU */
            public final /* synthetic */ byte[] f$1;
            public final /* synthetic */ C32743b.AbstractC32751e f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C32743b.this.m125656b((C32743b) this.f$1, (byte[]) this.f$2);
            }
        });
    }

    /* renamed from: a */
    private static Rect m125648a(float f, float f2, float f3, Context context) {
        int intValue = Float.valueOf(f3 * 300.0f).intValue();
        int i = intValue / 2;
        int a = m125647a(((int) (((f / ((float) DeviceUtils.getScreenWidth(context))) * 2000.0f) - 1000.0f)) - i, (int) IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        int a2 = m125647a(((int) (((f2 / ((float) DeviceUtils.getScreenHeight(context))) * 2000.0f) - 1000.0f)) - i, (int) IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) (a + intValue), (float) (a2 + intValue));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
}
