package com.ss.android.lark.mediarecorder.view;

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
import android.os.Build;
import android.os.Environment;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.widget.ImageView;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44774c;
import com.ss.android.lark.mediarecorder.p2245c.C44785a;
import com.ss.android.lark.mediarecorder.p2245c.C44786b;
import com.ss.android.lark.mediarecorder.p2245c.C44790c;
import com.ss.android.lark.mediarecorder.p2245c.C44791d;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mediarecorder.view.a */
public class C44830a implements Camera.PreviewCallback {

    /* renamed from: d */
    private static final Object f113521d = new Object();

    /* renamed from: e */
    private static volatile C44830a f113522e;

    /* renamed from: A */
    private byte[] f113523A;

    /* renamed from: B */
    private int f113524B;

    /* renamed from: C */
    private int f113525C;

    /* renamed from: D */
    private int f113526D = 1600000;

    /* renamed from: E */
    private SensorManager f113527E;

    /* renamed from: F */
    private SensorEventListener f113528F = new SensorEventListener() {
        /* class com.ss.android.lark.mediarecorder.view.C44830a.C448311 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (1 == sensorEvent.sensor.getType()) {
                float[] fArr = sensorEvent.values;
                C44830a.this.f113529a = C44785a.m177614a(fArr[0], fArr[1]);
                C44830a.this.mo158661b();
            }
        }
    };

    /* renamed from: a */
    public int f113529a;

    /* renamed from: b */
    public int f113530b;

    /* renamed from: c */
    int f113531c = 0;

    /* renamed from: f */
    private Camera f113532f;

    /* renamed from: g */
    private Camera.Parameters f113533g;

    /* renamed from: h */
    private boolean f113534h;

    /* renamed from: i */
    private int f113535i = -1;

    /* renamed from: j */
    private int f113536j = -1;

    /* renamed from: k */
    private int f113537k = -1;

    /* renamed from: l */
    private SurfaceHolder f113538l;

    /* renamed from: m */
    private float f113539m = -1.0f;

    /* renamed from: n */
    private boolean f113540n;

    /* renamed from: o */
    private MediaRecorder f113541o;

    /* renamed from: p */
    private String f113542p;

    /* renamed from: q */
    private String f113543q;

    /* renamed from: r */
    private String f113544r;

    /* renamed from: s */
    private Bitmap f113545s;

    /* renamed from: t */
    private AbstractC44774c f113546t;

    /* renamed from: u */
    private ImageView f113547u;

    /* renamed from: v */
    private ImageView f113548v;

    /* renamed from: w */
    private int f113549w;

    /* renamed from: x */
    private int f113550x;

    /* renamed from: y */
    private int f113551y = 90;

    /* renamed from: z */
    private int f113552z;

    /* renamed from: com.ss.android.lark.mediarecorder.view.a$a */
    public interface AbstractC44838a {
        /* renamed from: a */
        void mo158610a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mediarecorder.view.a$b */
    public interface AbstractC44839b {
    }

    /* renamed from: com.ss.android.lark.mediarecorder.view.a$c */
    public interface AbstractC44840c {
        /* renamed from: a */
        void mo158639a();
    }

    /* renamed from: com.ss.android.lark.mediarecorder.view.a$d */
    public interface AbstractC44841d {
        /* renamed from: a */
        void mo158540a(String str, Bitmap bitmap);
    }

    /* renamed from: com.ss.android.lark.mediarecorder.view.a$e */
    public interface AbstractC44842e {
        /* renamed from: a */
        void mo158539a(Bitmap bitmap, boolean z);
    }

    /* renamed from: a */
    private static int m177738a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo158657a(String str) {
        this.f113543q = str;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo158655a(AbstractC44838a aVar) {
        AbstractC44774c cVar;
        if (Build.VERSION.SDK_INT >= 23 || C44790c.m177625a(this.f113535i) || (cVar = this.f113546t) == null) {
            synchronized (f113521d) {
                if (this.f113532f == null) {
                    m177741c(this.f113535i);
                }
                aVar.mo158610a();
            }
            return;
        }
        cVar.mo158517a();
    }

    /* renamed from: a */
    public void mo158656a(final AbstractC44842e eVar) {
        if (this.f113532f != null) {
            int i = this.f113551y;
            if (i == 90) {
                this.f113530b = Math.abs(this.f113529a + i) % 360;
            } else if (i == 270) {
                this.f113530b = Math.abs(i - this.f113529a);
            }
            C44796g.m177637c(this.f113529a + " = " + this.f113551y + " = " + this.f113530b);
            try {
                this.f113532f.takePicture(null, null, new Camera.PictureCallback() {
                    /* class com.ss.android.lark.mediarecorder.view.C44830a.C448333 */

                    public void onPictureTaken(final byte[] bArr, Camera camera) {
                        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                            /* class com.ss.android.lark.mediarecorder.view.C44830a.C448333.RunnableC448341 */

                            public void run() {
                                C44830a.this.mo158660a(bArr, eVar);
                            }
                        });
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo158660a(byte[] bArr, final AbstractC44842e eVar) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Matrix matrix = new Matrix();
        int i = this.f113535i;
        if (i == this.f113536j) {
            matrix.setRotate((float) this.f113530b);
        } else if (i == this.f113537k) {
            matrix.setRotate((float) (360 - this.f113530b));
            matrix.postScale(-1.0f, 1.0f);
        }
        final Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.mediarecorder.view.C44830a.RunnableC448354 */

            public void run() {
                if (eVar == null) {
                    return;
                }
                if (C44830a.this.f113530b == 90 || C44830a.this.f113530b == 270) {
                    eVar.mo158539a(createBitmap, true);
                } else {
                    eVar.mo158539a(createBitmap, false);
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r3.f113541o = null;
        r3.f113540n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r2 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r4 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (com.ss.android.lark.mediarecorder.p2245c.C44792e.m177630a(r3.f113544r) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r5.mo158540a(null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        mo158666c();
        r5.mo158540a(r3.f113543q + r3.f113542p, r3.f113545s);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2 != null) goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158659a(boolean r4, com.ss.android.lark.mediarecorder.view.C44830a.AbstractC44841d r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediarecorder.view.C44830a.mo158659a(boolean, com.ss.android.lark.mediarecorder.view.a$d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo158658a(boolean z) {
        this.f113534h = z;
    }

    /* renamed from: a */
    public static synchronized C44830a m177740a() {
        C44830a aVar;
        synchronized (C44830a.class) {
            if (f113522e == null) {
                synchronized (C44830a.class) {
                    if (f113522e == null) {
                        f113522e = new C44830a();
                    }
                }
            }
            aVar = f113522e;
        }
        return aVar;
    }

    /* renamed from: e */
    private void m177742e() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.canDisableShutterSound) {
                this.f113532f.enableShutterSound(false);
            }
        }
    }

    private C44830a() {
        m177743f();
        this.f113535i = this.f113536j;
        this.f113543q = "";
    }

    /* renamed from: f */
    private void m177743f() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            int i2 = cameraInfo.facing;
            if (i2 == 0) {
                this.f113536j = cameraInfo.facing;
            } else if (i2 == 1) {
                this.f113537k = cameraInfo.facing;
            }
        }
    }

    /* renamed from: c */
    public void mo158666c() {
        Camera camera = this.f113532f;
        if (camera != null) {
            try {
                camera.setPreviewCallback(null);
                this.f113532f.stopPreview();
                this.f113532f.setPreviewDisplay(null);
                this.f113534h = false;
                C44796g.m177637c("=== Stop Preview ===");
            } catch (IOException e) {
                C44796g.m177635a("=== Stop Preview === error: " + e);
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo158667d() {
        synchronized (f113521d) {
            this.f113546t = null;
            Camera camera = this.f113532f;
            if (camera != null) {
                try {
                    camera.setPreviewCallback(null);
                    this.f113547u = null;
                    this.f113548v = null;
                    this.f113532f.stopPreview();
                    this.f113532f.setPreviewDisplay(null);
                    this.f113538l = null;
                    this.f113534h = false;
                    this.f113532f.release();
                    this.f113532f = null;
                    SensorManager sensorManager = this.f113527E;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this.f113528F);
                        this.f113527E = null;
                    }
                    C44796g.m177637c("=== Destroy Camera ===");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                C44796g.m177637c("=== Camera  Null===");
            }
        }
    }

    /* renamed from: b */
    public void mo158661b() {
        int i;
        int i2;
        ImageView imageView = this.f113547u;
        if (imageView != null && (i = this.f113552z) != (i2 = this.f113529a)) {
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
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f113548v, "rotation", f, f2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(500L);
                animatorSet.start();
                this.f113552z = this.f113529a;
            } else if (i == 90) {
                if (i2 != 0 && i2 == 180) {
                    i4 = -180;
                    float f3 = (float) i3;
                    float f22 = (float) i4;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "rotation", f3, f22);
                    ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(this.f113548v, "rotation", f3, f22);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat3, ofFloat22);
                    animatorSet2.setDuration(500L);
                    animatorSet2.start();
                    this.f113552z = this.f113529a;
                }
                i4 = 0;
                float f32 = (float) i3;
                float f222 = (float) i4;
                ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(imageView, "rotation", f32, f222);
                ObjectAnimator ofFloat222 = ObjectAnimator.ofFloat(this.f113548v, "rotation", f32, f222);
                AnimatorSet animatorSet22 = new AnimatorSet();
                animatorSet22.playTogether(ofFloat32, ofFloat222);
                animatorSet22.setDuration(500L);
                animatorSet22.start();
                this.f113552z = this.f113529a;
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
                ObjectAnimator ofFloat2222 = ObjectAnimator.ofFloat(this.f113548v, "rotation", f322, f2222);
                AnimatorSet animatorSet222 = new AnimatorSet();
                animatorSet222.playTogether(ofFloat322, ofFloat2222);
                animatorSet222.setDuration(500L);
                animatorSet222.start();
                this.f113552z = this.f113529a;
            } else if (i == 270) {
                if (i2 == 0 || i2 != 180) {
                    i3 = 90;
                    i4 = 0;
                    float f3222 = (float) i3;
                    float f22222 = (float) i4;
                    ObjectAnimator ofFloat3222 = ObjectAnimator.ofFloat(imageView, "rotation", f3222, f22222);
                    ObjectAnimator ofFloat22222 = ObjectAnimator.ofFloat(this.f113548v, "rotation", f3222, f22222);
                    AnimatorSet animatorSet2222 = new AnimatorSet();
                    animatorSet2222.playTogether(ofFloat3222, ofFloat22222);
                    animatorSet2222.setDuration(500L);
                    animatorSet2222.start();
                    this.f113552z = this.f113529a;
                }
                i3 = 90;
                i4 = 180;
                float f32222 = (float) i3;
                float f222222 = (float) i4;
                ObjectAnimator ofFloat32222 = ObjectAnimator.ofFloat(imageView, "rotation", f32222, f222222);
                ObjectAnimator ofFloat222222 = ObjectAnimator.ofFloat(this.f113548v, "rotation", f32222, f222222);
                AnimatorSet animatorSet22222 = new AnimatorSet();
                animatorSet22222.playTogether(ofFloat32222, ofFloat222222);
                animatorSet22222.setDuration(500L);
                animatorSet22222.start();
                this.f113552z = this.f113529a;
            }
            i3 = 0;
            i4 = 0;
            float f322222 = (float) i3;
            float f2222222 = (float) i4;
            ObjectAnimator ofFloat322222 = ObjectAnimator.ofFloat(imageView, "rotation", f322222, f2222222);
            ObjectAnimator ofFloat2222222 = ObjectAnimator.ofFloat(this.f113548v, "rotation", f322222, f2222222);
            AnimatorSet animatorSet222222 = new AnimatorSet();
            animatorSet222222.playTogether(ofFloat322222, ofFloat2222222);
            animatorSet222222.setDuration(500L);
            animatorSet222222.start();
            this.f113552z = this.f113529a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo158648a(int i) {
        this.f113526D = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo158654a(AbstractC44774c cVar) {
        this.f113546t = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo158663b(Context context) {
        if (this.f113527E == null) {
            this.f113527E = (SensorManager) context.getSystemService("sensor");
        }
        this.f113527E.unregisterListener(this.f113528F);
    }

    /* renamed from: c */
    private synchronized void m177741c(int i) {
        Camera camera;
        try {
            this.f113532f = Camera.open(i);
        } catch (Exception e) {
            e.printStackTrace();
            AbstractC44774c cVar = this.f113546t;
            if (cVar != null) {
                cVar.mo158517a();
            }
        }
        if (Build.VERSION.SDK_INT > 17 && (camera = this.f113532f) != null) {
            try {
                camera.enableShutterSound(false);
            } catch (Exception e2) {
                C44796g.m177635a("enable shutter sound faild: " + e2);
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo158649a(Context context) {
        if (this.f113527E == null) {
            this.f113527E = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.f113527E;
        sensorManager.registerListener(this.f113528F, sensorManager.getDefaultSensor(1), 3);
    }

    /* renamed from: b */
    public void mo158665b(String str) {
        Camera camera = this.f113532f;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode(str);
                this.f113532f.setParameters(parameters);
            } catch (Exception e) {
                C44796g.m177635a("setFlashMode error = " + e);
            }
        }
    }

    /* renamed from: b */
    public void mo158662b(int i) {
        try {
            Camera.Parameters parameters = this.f113532f.getParameters();
            int i2 = parameters.getPreviewSize().width;
            int i3 = parameters.getPreviewSize().height;
            YuvImage yuvImage = new YuvImage(this.f113523A, parameters.getPreviewFormat(), i2, i3, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i2, i3), 50, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f113545s = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            Matrix matrix = new Matrix();
            int i4 = this.f113535i;
            if (i4 == this.f113536j) {
                matrix.setRotate((float) i);
            } else if (i4 == this.f113537k) {
                matrix.setRotate(270.0f);
            }
            Bitmap bitmap = this.f113545s;
            this.f113545s = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f113545s.getHeight(), matrix, true);
        } catch (Exception e) {
            C44796g.m177635a("error:" + e);
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f113523A = bArr;
    }

    /* renamed from: a */
    public void mo158647a(float f, int i) {
        int max;
        Camera camera = this.f113532f;
        if (camera != null) {
            if (this.f113533g == null) {
                this.f113533g = camera.getParameters();
            }
            if (this.f113533g.isZoomSupported() && this.f113533g.isSmoothZoomSupported()) {
                if (i != 144) {
                    if (i == 145 && !this.f113540n) {
                        int i2 = (int) (f / 20.0f);
                        if (i2 < this.f113533g.getMaxZoom()) {
                            int i3 = this.f113524B + i2;
                            this.f113524B = i3;
                            if (i3 < 0) {
                                this.f113524B = 0;
                            } else if (i3 > this.f113533g.getMaxZoom()) {
                                this.f113524B = this.f113533g.getMaxZoom();
                            }
                            this.f113533g.setZoom(this.f113524B);
                            this.f113532f.setParameters(this.f113533g);
                        }
                        C44796g.m177637c("setZoom = " + this.f113524B);
                    }
                } else if (this.f113540n && (max = (int) (Math.max((float) BitmapDescriptorFactory.HUE_RED, f) / 40.0f)) <= this.f113533g.getMaxZoom() && this.f113525C != max) {
                    this.f113533g.setZoom(max);
                    this.f113532f.setParameters(this.f113533g);
                    this.f113525C = max;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo158664b(SurfaceHolder surfaceHolder, float f) {
        if (this.f113534h) {
            C44796g.m177637c("doStartPreview isPreviewing");
        }
        if (this.f113539m < BitmapDescriptorFactory.HUE_RED) {
            this.f113539m = f;
        }
        if (surfaceHolder != null) {
            this.f113538l = surfaceHolder;
            Camera camera = this.f113532f;
            if (camera != null) {
                try {
                    this.f113533g = camera.getParameters();
                    Camera.Size a = C44786b.m177616a().mo158542a(this.f113533g.getSupportedPreviewSizes(), 1000, f);
                    Camera.Size b = C44786b.m177616a().mo158545b(this.f113533g.getSupportedPictureSizes(), 1200, f);
                    this.f113533g.setPreviewSize(a.width, a.height);
                    this.f113549w = a.width;
                    this.f113550x = a.height;
                    this.f113533g.setPictureSize(b.width, b.height);
                    if (C44786b.m177616a().mo158543a(this.f113533g.getSupportedPictureFormats(), DynamicModule.f58006b)) {
                        this.f113533g.setPictureFormat(DynamicModule.f58006b);
                        this.f113533g.setJpegQuality(100);
                    }
                    this.f113532f.setParameters(this.f113533g);
                    this.f113533g = this.f113532f.getParameters();
                    this.f113532f.cancelAutoFocus();
                    this.f113532f.setPreviewDisplay(surfaceHolder);
                    this.f113532f.setDisplayOrientation(this.f113551y);
                    this.f113532f.setPreviewCallback(this);
                    this.f113532f.startPreview();
                    if (C44786b.m177616a().mo158544a(this.f113533g.getSupportedFocusModes(), "auto")) {
                        C44796g.m177637c("CameraInterface->setFocusMode focus_mode_auto");
                        this.f113533g.setFocusMode("auto");
                        this.f113532f.autoFocus(new Camera.AutoFocusCallback() {
                            /* class com.ss.android.lark.mediarecorder.view.C44830a.C448322 */

                            public void onAutoFocus(boolean z, Camera camera) {
                                C44796g.m177637c("CameraInterface->onAutoFocus success: " + z);
                            }
                        });
                    }
                    this.f113534h = true;
                    C44796g.m177637c("=== Start Preview ===");
                } catch (Exception e) {
                    C44796g.m177635a("=== Start Preview === error: " + e);
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo158652a(SurfaceHolder surfaceHolder, float f) {
        Camera camera;
        int i = this.f113535i;
        int i2 = this.f113536j;
        if (i == i2) {
            this.f113535i = this.f113537k;
        } else {
            this.f113535i = i2;
        }
        mo158667d();
        C44796g.m177637c("open start");
        m177741c(this.f113535i);
        if (Build.VERSION.SDK_INT > 17 && (camera = this.f113532f) != null) {
            try {
                camera.enableShutterSound(false);
            } catch (Exception e) {
                C44796g.m177635a("CameraInterface->open end e: " + e);
                e.printStackTrace();
            }
        }
        C44796g.m177637c("open end");
        mo158664b(surfaceHolder, f);
    }

    /* renamed from: a */
    public void mo158653a(ImageView imageView, ImageView imageView2) {
        this.f113547u = imageView;
        this.f113548v = imageView2;
        if (imageView != null) {
            this.f113551y = C44786b.m177616a().mo158541a(imageView.getContext(), this.f113535i);
        }
    }

    /* renamed from: a */
    public void mo158651a(Surface surface, float f, AbstractC44839b bVar) {
        Camera.Size size;
        this.f113532f.setPreviewCallback(null);
        final int i = (this.f113529a + 90) % 360;
        m177742e();
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.mediarecorder.view.C44830a.RunnableC448365 */

            public void run() {
                C44830a.this.mo158662b(i);
            }
        });
        if (!this.f113540n) {
            if (this.f113532f == null) {
                m177741c(this.f113535i);
            }
            if (this.f113541o == null) {
                this.f113541o = new MediaRecorder();
            }
            if (this.f113533g == null) {
                this.f113533g = this.f113532f.getParameters();
            }
            if (this.f113533g.getSupportedFocusModes().contains("continuous-video")) {
                this.f113533g.setFocusMode("continuous-video");
            }
            this.f113532f.setParameters(this.f113533g);
            this.f113532f.unlock();
            this.f113541o.reset();
            this.f113541o.setCamera(this.f113532f);
            this.f113541o.setVideoSource(1);
            this.f113541o.setAudioSource(1);
            this.f113541o.setOutputFormat(2);
            this.f113541o.setVideoEncoder(2);
            this.f113541o.setAudioEncoder(3);
            if (this.f113533g.getSupportedVideoSizes() == null) {
                size = C44786b.m177616a().mo158542a(this.f113533g.getSupportedPreviewSizes(), 600, f);
            } else {
                size = C44786b.m177616a().mo158542a(this.f113533g.getSupportedVideoSizes(), 600, f);
            }
            C44796g.m177637c("setVideoSize    width = " + size.width + "height = " + size.height);
            if (size.width == size.height) {
                this.f113541o.setVideoSize(this.f113549w, this.f113550x);
            } else {
                this.f113541o.setVideoSize(size.width, size.height);
            }
            if (this.f113535i != this.f113537k) {
                this.f113541o.setOrientationHint(i);
            } else if (this.f113551y == 270) {
                if (i == 0) {
                    this.f113541o.setOrientationHint(180);
                } else if (i == 270) {
                    this.f113541o.setOrientationHint(270);
                } else {
                    this.f113541o.setOrientationHint(90);
                }
            } else if (i == 90) {
                this.f113541o.setOrientationHint(270);
            } else if (i == 270) {
                this.f113541o.setOrientationHint(90);
            } else {
                this.f113541o.setOrientationHint(i);
            }
            this.f113541o.setVideoEncodingBitRate(this.f113526D);
            this.f113541o.setPreviewDisplay(surface);
            this.f113542p = "video_" + System.currentTimeMillis() + ".mp4";
            if (this.f113543q.equals("")) {
                this.f113543q = Environment.getExternalStorageDirectory().getPath();
            }
            String str = this.f113543q + File.separator + this.f113542p;
            this.f113544r = str;
            this.f113541o.setOutputFile(str);
            try {
                this.f113541o.prepare();
                this.f113541o.start();
                this.f113540n = true;
            } catch (IllegalStateException e) {
                e.printStackTrace();
                C44796g.m177637c("startRecord IllegalStateException");
                AbstractC44774c cVar = this.f113546t;
                if (cVar != null) {
                    cVar.mo158517a();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                C44796g.m177637c("startRecord IOException");
                AbstractC44774c cVar2 = this.f113546t;
                if (cVar2 != null) {
                    cVar2.mo158517a();
                }
            } catch (RuntimeException unused) {
                C44796g.m177637c("startRecord RuntimeException");
            }
        }
    }

    /* renamed from: a */
    private static Rect m177739a(float f, float f2, float f3, Context context) {
        int intValue = Float.valueOf(f3 * 300.0f).intValue();
        int i = intValue / 2;
        int a = m177738a(((int) (((f / ((float) C44791d.m177626a(context))) * 2000.0f) - 1000.0f)) - i, (int) IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        int a2 = m177738a(((int) (((f2 / ((float) C44791d.m177627b(context))) * 2000.0f) - 1000.0f)) - i, (int) IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) (a + intValue), (float) (a2 + intValue));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: a */
    public void mo158650a(final Context context, final float f, final float f2, final AbstractC44840c cVar) {
        Camera camera = this.f113532f;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                Rect a = m177739a(f, f2, 1.0f, context);
                this.f113532f.cancelAutoFocus();
                if (parameters.getMaxNumFocusAreas() > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(a, 800));
                    parameters.setFocusAreas(arrayList);
                    final String focusMode = parameters.getFocusMode();
                    parameters.setFocusMode("auto");
                    this.f113532f.setParameters(parameters);
                    this.f113532f.autoFocus(new Camera.AutoFocusCallback() {
                        /* class com.ss.android.lark.mediarecorder.view.C44830a.C448376 */

                        public void onAutoFocus(boolean z, Camera camera) {
                            C44796g.m177637c("CameraInterface->success: " + z);
                            if (z || C44830a.this.f113531c > 10) {
                                Camera.Parameters parameters = camera.getParameters();
                                parameters.setFocusMode(focusMode);
                                camera.setParameters(parameters);
                                C44830a.this.f113531c = 0;
                                cVar.mo158639a();
                                return;
                            }
                            C44830a.this.f113531c++;
                            C44830a.this.mo158650a(context, f, f2, cVar);
                        }
                    });
                    return;
                }
                C44796g.m177637c("focus areas not supported");
                cVar.mo158639a();
            } catch (Exception unused) {
                C44796g.m177635a("autoFocus failer");
            }
        }
    }
}
