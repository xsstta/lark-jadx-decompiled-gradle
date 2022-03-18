package com.ss.android.lark.cameraview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.ss.android.lark.cameraview.C32743b;
import com.ss.android.lark.cameraview.C32758c;
import com.ss.android.lark.cameraview.blacklist.CameraTypeBlackListManager;
import com.ss.android.lark.cameraview.p1588b.AbstractC32754c;
import com.ss.android.lark.cameraview.p1590d.C32772a;
import com.ss.android.lark.cameraview.p1590d.C32774c;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.utils.ao;
import com.ss.android.vesdk.C63937ah;
import com.ss.android.vesdk.C64034n;
import com.ss.android.vesdk.C64074t;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.lark.cameraview.c */
public class C32758c implements AbstractC32797g {

    /* renamed from: d */
    private static volatile C32758c f84051d;

    /* renamed from: e */
    private static boolean f84052e;

    /* renamed from: a */
    public int f84053a;

    /* renamed from: b */
    public C64034n f84054b;

    /* renamed from: c */
    public VERecorder f84055c;

    /* renamed from: f */
    private ImageView f84056f;

    /* renamed from: g */
    private ImageView f84057g;

    /* renamed from: h */
    private WindowRotationConfig f84058h;

    /* renamed from: i */
    private AbstractC32754c f84059i;

    /* renamed from: j */
    private String f84060j;

    /* renamed from: k */
    private int f84061k = -1;

    /* renamed from: l */
    private int f84062l = -1;

    /* renamed from: m */
    private int f84063m = -1;

    /* renamed from: n */
    private int f84064n = 90;

    /* renamed from: o */
    private int f84065o;

    /* renamed from: p */
    private int f84066p;

    /* renamed from: q */
    private SensorManager f84067q;

    /* renamed from: r */
    private int f84068r;

    /* renamed from: s */
    private int f84069s;

    /* renamed from: t */
    private boolean f84070t;

    /* renamed from: u */
    private TakingPhotoAdaptation f84071u;

    /* renamed from: v */
    private SensorEventListener f84072v = new SensorEventListener() {
        /* class com.ss.android.lark.cameraview.C32758c.C327591 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (1 == sensorEvent.sensor.getType()) {
                float[] fArr = sensorEvent.values;
                C32758c.this.f84053a = C32772a.m125801a(fArr[0], fArr[1]);
                C32758c.this.mo120718a();
            }
        }
    };

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120685a(int i) {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120690a(Context context, SurfaceView surfaceView, C32743b.AbstractC32747a aVar) {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: b */
    public void mo120701b(boolean z) {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: e */
    public void mo120704e() {
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120693a(ImageView imageView, ImageView imageView2) {
        this.f84056f = imageView;
        this.f84057g = imageView2;
        if (imageView != null) {
            this.f84064n = C32774c.m125806a().mo120748a(imageView.getContext(), this.f84061k);
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120696a(String str) {
        this.f84060j = str;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120692a(SurfaceHolder surfaceHolder, float f) {
        Log.m165389i("CameraInterface2", "switchCamera");
        if (this.f84055c != null && this.f84054b != null) {
            if (m125710i()) {
                Log.m165383e("CameraInterface2", "cannot switch camera when recording");
                return;
            }
            int i = this.f84061k;
            int i2 = this.f84062l;
            if (i == i2) {
                this.f84061k = this.f84063m;
            } else {
                this.f84061k = i2;
            }
            this.f84054b.mo221759g();
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120697a(boolean z) {
        Log.m165389i("CameraInterface2", "setDestroyOnThread:" + z);
        this.f84070t = z;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120694a(final C32743b.AbstractC32751e eVar) {
        if (this.f84055c == null) {
            Log.m165383e("CameraInterface2", "takePicture failed, recorder is null");
            return;
        }
        Log.m165379d("CameraInterface2", "takePicture");
        int i = this.f84064n;
        if (i == 90) {
            this.f84066p = Math.abs(this.f84053a + i) % 360;
        } else if (i == 270) {
            this.f84066p = Math.abs(i - this.f84053a);
        }
        Log.m165389i("CameraInterface2", this.f84053a + " = " + this.f84064n + " = " + this.f84066p);
        this.f84055c.mo220929a(this.f84068r, this.f84069s, true, false, new VERecorder.AbstractC63893b() {
            /* class com.ss.android.lark.cameraview.C32758c.C327624 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m125743a(Bitmap bitmap, C32743b.AbstractC32751e eVar) {
                C32758c.this.mo120719a(bitmap, eVar);
            }

            @Override // com.ss.android.vesdk.VERecorder.AbstractC63893b
            /* renamed from: a */
            public void mo120731a(Bitmap bitmap, int i) {
                if (bitmap != null) {
                    Log.m165389i("CameraInterface2", "onShotScreen, bitmap width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight());
                    CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(bitmap, eVar) {
                        /* class com.ss.android.lark.cameraview.$$Lambda$c$4$wHcHbM0nqHFNRFOwDagoFszRIVw */
                        public final /* synthetic */ Bitmap f$1;
                        public final /* synthetic */ C32743b.AbstractC32751e f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C32758c.C327624.this.m125743a((C32758c.C327624) this.f$1, (Bitmap) this.f$2);
                        }
                    });
                    return;
                }
                Log.m165383e("CameraInterface2", "onShotScreen, bitmap is null, ret is:" + i);
            }
        }, true);
    }

    /* renamed from: a */
    public void mo120719a(Bitmap bitmap, C32743b.AbstractC32751e eVar) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(eVar, Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.f84071u.mo120678a(this.f84066p - 90), true)) {
            /* class com.ss.android.lark.cameraview.$$Lambda$c$homjdLr_HSLIvRUwbMVi6I9bD9Y */
            public final /* synthetic */ C32743b.AbstractC32751e f$1;
            public final /* synthetic */ Bitmap f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C32758c.this.m125702a((C32758c) this.f$1, (C32743b.AbstractC32751e) this.f$2);
            }
        });
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120695a(AbstractC32754c cVar) {
        this.f84059i = cVar;
    }

    /* renamed from: i */
    private boolean m125710i() {
        VERecorder vERecorder = this.f84055c;
        if (vERecorder == null || vERecorder.mo220924a() != 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: f */
    public void mo120705f() {
        Log.m165389i("CameraInterface2", "onStart");
        C64034n nVar = this.f84054b;
        if (nVar != null) {
            nVar.mo221141b();
        }
    }

    /* renamed from: b */
    public static synchronized C32758c m125704b() {
        C32758c cVar;
        synchronized (C32758c.class) {
            if (f84051d == null) {
                synchronized (C32758c.class) {
                    if (f84051d == null) {
                        f84051d = new C32758c();
                    }
                }
            }
            cVar = f84051d;
        }
        return cVar;
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: g */
    public void mo120706g() {
        Log.m165389i("CameraInterface2", "onStop");
        C64034n nVar = this.f84054b;
        if (nVar != null) {
            nVar.mo221140a(this.f84070t);
        }
    }

    private C32758c() {
        m125709h();
        this.f84061k = this.f84062l;
        this.f84060j = "";
    }

    /* renamed from: h */
    private void m125709h() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            int i2 = cameraInfo.facing;
            if (i2 == 0) {
                this.f84062l = cameraInfo.facing;
            } else if (i2 == 1) {
                this.f84063m = cameraInfo.facing;
            }
        }
    }

    /* renamed from: d */
    public void mo120721d() {
        if (this.f84055c != null) {
            Log.m165389i("CameraInterface2", "do StopPreview");
            this.f84054b.mo221757d();
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: c */
    public void mo120702c() {
        mo120721d();
        C64034n nVar = this.f84054b;
        if (nVar != null) {
            nVar.mo221140a(this.f84070t);
            this.f84054b.mo221143f();
        }
        if (this.f84055c != null) {
            Log.m165389i("CameraInterface2", "destroyVECamera");
            this.f84055c.mo220938d();
        }
        this.f84058h = null;
        this.f84054b = null;
        this.f84055c = null;
        this.f84059i = null;
        this.f84056f = null;
        this.f84057g = null;
    }

    /* renamed from: a */
    public void mo120718a() {
        int i;
        int i2;
        ImageView imageView = this.f84056f;
        if (imageView != null && (i = this.f84065o) != (i2 = this.f84053a)) {
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
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f84057g, "rotation", f, f2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(500L);
                animatorSet.start();
                this.f84065o = this.f84053a;
            } else if (i == 90) {
                if (i2 != 0 && i2 == 180) {
                    i4 = -180;
                    float f3 = (float) i3;
                    float f22 = (float) i4;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "rotation", f3, f22);
                    ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(this.f84057g, "rotation", f3, f22);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat3, ofFloat22);
                    animatorSet2.setDuration(500L);
                    animatorSet2.start();
                    this.f84065o = this.f84053a;
                }
                i4 = 0;
                float f32 = (float) i3;
                float f222 = (float) i4;
                ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(imageView, "rotation", f32, f222);
                ObjectAnimator ofFloat222 = ObjectAnimator.ofFloat(this.f84057g, "rotation", f32, f222);
                AnimatorSet animatorSet22 = new AnimatorSet();
                animatorSet22.playTogether(ofFloat32, ofFloat222);
                animatorSet22.setDuration(500L);
                animatorSet22.start();
                this.f84065o = this.f84053a;
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
                ObjectAnimator ofFloat2222 = ObjectAnimator.ofFloat(this.f84057g, "rotation", f322, f2222);
                AnimatorSet animatorSet222 = new AnimatorSet();
                animatorSet222.playTogether(ofFloat322, ofFloat2222);
                animatorSet222.setDuration(500L);
                animatorSet222.start();
                this.f84065o = this.f84053a;
            } else if (i == 270) {
                if (i2 == 0 || i2 != 180) {
                    i3 = 90;
                    i4 = 0;
                    float f3222 = (float) i3;
                    float f22222 = (float) i4;
                    ObjectAnimator ofFloat3222 = ObjectAnimator.ofFloat(imageView, "rotation", f3222, f22222);
                    ObjectAnimator ofFloat22222 = ObjectAnimator.ofFloat(this.f84057g, "rotation", f3222, f22222);
                    AnimatorSet animatorSet2222 = new AnimatorSet();
                    animatorSet2222.playTogether(ofFloat3222, ofFloat22222);
                    animatorSet2222.setDuration(500L);
                    animatorSet2222.start();
                    this.f84065o = this.f84053a;
                }
                i3 = 90;
                i4 = 180;
                float f32222 = (float) i3;
                float f222222 = (float) i4;
                ObjectAnimator ofFloat32222 = ObjectAnimator.ofFloat(imageView, "rotation", f32222, f222222);
                ObjectAnimator ofFloat222222 = ObjectAnimator.ofFloat(this.f84057g, "rotation", f32222, f222222);
                AnimatorSet animatorSet22222 = new AnimatorSet();
                animatorSet22222.playTogether(ofFloat32222, ofFloat222222);
                animatorSet22222.setDuration(500L);
                animatorSet22222.start();
                this.f84065o = this.f84053a;
            }
            i3 = 0;
            i4 = 0;
            float f322222 = (float) i3;
            float f2222222 = (float) i4;
            ObjectAnimator ofFloat322222 = ObjectAnimator.ofFloat(imageView, "rotation", f322222, f2222222);
            ObjectAnimator ofFloat2222222 = ObjectAnimator.ofFloat(this.f84057g, "rotation", f322222, f2222222);
            AnimatorSet animatorSet222222 = new AnimatorSet();
            animatorSet222222.playTogether(ofFloat322222, ofFloat2222222);
            animatorSet222222.setDuration(500L);
            animatorSet222222.start();
            this.f84065o = this.f84053a;
        }
    }

    /* renamed from: b */
    public void mo120720b(int i) {
        AbstractC32754c cVar = this.f84059i;
        if (cVar != null) {
            cVar.mo120715a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m125705c(int i) {
        Log.m165389i("CameraInterface2", "startRecord, ret:" + i);
    }

    /* renamed from: d */
    private VECameraSettings.CAMERA_TYPE m125707d(Context context) {
        if (CameraTypeBlackListManager.f84002a.mo120681a(context)) {
            Log.m165389i("CameraInterface2", "use camera2");
            return VECameraSettings.CAMERA_TYPE.TYPE2;
        }
        Log.m165389i("CameraInterface2", "use camera1");
        return VECameraSettings.CAMERA_TYPE.TYPE1;
    }

    /* renamed from: e */
    private String m125708e(Context context) {
        if (!TextUtils.isEmpty(this.f84060j)) {
            return this.f84060j;
        }
        return StoragePathUtils.f94669a.mo135709G(context);
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120686a(Context context) {
        if (this.f84067q == null) {
            this.f84067q = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.f84067q;
        sensorManager.registerListener(this.f84072v, sensorManager.getDefaultSensor(1), 3);
    }

    /* renamed from: c */
    private void m125706c(Context context) {
        if (!f84052e) {
            C63937ah.m251005c(true);
            synchronized (ao.class) {
                Log.m165389i("CameraInterface2", "initVESDK");
                C63937ah.m250993a(context.getApplicationContext(), m125708e(context));
            }
            C63937ah.m250992a((byte) 15);
            C63937ah.m251008f(true);
            VEEditor.m250667e(8718368);
            VEEditor.m250660a(true);
            VEEditor.m250664b(true);
            f84052e = true;
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: b */
    public void mo120699b(Context context) {
        if (this.f84067q == null) {
            this.f84067q = (SensorManager) context.getSystemService("sensor");
        }
        this.f84067q.unregisterListener(this.f84072v);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m125702a(C32743b.AbstractC32751e eVar, Bitmap bitmap) {
        if (eVar != null) {
            this.f84071u.mo120679a(bitmap, this.f84066p, eVar);
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120684a(final float f, int i) {
        C64034n nVar;
        Log.m165379d("CameraInterface2", "setZoom:" + f + ", type:" + i);
        if (!m125710i() && (nVar = this.f84054b) != null) {
            nVar.mo221752a(new VERecorder.AbstractC63896d() {
                /* class com.ss.android.lark.cameraview.C32758c.C327602 */

                @Override // com.ss.android.vesdk.VERecorder.AbstractC63896d
                /* renamed from: a */
                public boolean mo120726a() {
                    return true;
                }

                @Override // com.ss.android.vesdk.VERecorder.AbstractC63896d
                /* renamed from: a */
                public void mo120724a(int i, float f, boolean z) {
                    Log.m165379d("CameraInterface2", "onChange, cameraType:" + i + ", zoomValue:" + f + ", stopped:" + z);
                }

                @Override // com.ss.android.vesdk.VERecorder.AbstractC63896d
                /* renamed from: a */
                public void mo120725a(int i, boolean z, boolean z2, float f, List<Integer> list) {
                    Log.m165389i("CameraInterface2", "onZoomSupport, cameraType:" + i + ", supportZoom:" + z + ", supportSmooth:" + z2 + ", maxZoom:" + f);
                    float min = Math.min(f, f);
                    if (min < BitmapDescriptorFactory.HUE_RED) {
                        min = -1.0f * (1.0f / min);
                    }
                    Log.m165389i("CameraInterface2", "real zoom:" + min);
                    C32758c.this.f84054b.mo221753b(min);
                }
            });
            this.f84054b.mo221755b(true);
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: b */
    public void mo120700b(SurfaceHolder surfaceHolder, float f) {
        if (this.f84055c != null) {
            Log.m165389i("CameraInterface2", "do StartPreview");
            this.f84055c.mo220933a(this.f84054b);
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120689a(Context context, SurfaceView surfaceView) {
        TakingPhotoAdaptation kVar;
        if (this.f84055c == null) {
            if (MagicWindowUtil.m224687e(context)) {
                kVar = MiPadAdaptation.f84153a;
            } else {
                kVar = BaseAdaptation.f84001a;
            }
            this.f84071u = kVar;
            Log.m165389i("CameraInterface2", "initVECamera");
            m125706c(context);
            this.f84058h = new WindowRotationConfig((FragmentActivity) context);
            C63937ah.m251006d(true);
            int[] iArr = {720, 1280};
            VESize a = this.f84058h.mo120789a(iArr);
            this.f84068r = a.width;
            this.f84069s = a.height;
            Log.m165389i("CameraInterface2", "picWidth:" + this.f84068r + ", picHeight:" + this.f84069s);
            VECameraSettings a2 = new VECameraSettings.C63824a().mo220612a(m125707d(context)).mo220611a(VECameraSettings.CAMERA_FACING_ID.FACING_BACK).mo220610a(iArr[0], iArr[1]).mo220616b(true).mo220614a(true).mo220609a(this.f84068r).mo220617c(true).mo220613a(this.f84058h.mo120790a()).mo220615a();
            VEVideoEncodeSettings a3 = new VEVideoEncodeSettings.C63917a(1).mo221099a(a.width, a.height).mo221105b(true).mo221106c(true).mo221103a();
            VEAudioEncodeSettings a4 = new VEAudioEncodeSettings.C63814a().mo220504a();
            VEPreviewSettings a5 = new VEPreviewSettings.C63887a().mo220904a(a).mo220905a(true).mo220907b(true).mo220908c(true).mo220909d(true).mo220906a();
            C64034n nVar = new C64034n();
            this.f84054b = nVar;
            nVar.mo221746a(context.getApplicationContext(), a2);
            this.f84054b.mo221141b();
            String e = m125708e(context);
            C26311p.m95289i(e);
            ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            layoutParams.width = this.f84058h.mo120791b();
            layoutParams.height = this.f84058h.mo120792c();
            surfaceView.setLayoutParams(layoutParams);
            VERecorder vERecorder = new VERecorder(e, context.getApplicationContext(), surfaceView);
            this.f84055c = vERecorder;
            vERecorder.mo220930a(new VEListener.AbstractC63855ab() {
                /* class com.ss.android.lark.cameraview.C32758c.C327613 */

                @Override // com.ss.android.vesdk.VEListener.AbstractC63856ac
                /* renamed from: a */
                public void mo120729a(boolean z) {
                    Log.m165379d("CameraInterface2", "onHardEncoderInit, success:" + z);
                }

                @Override // com.ss.android.vesdk.VEListener.AbstractC63856ac
                /* renamed from: b */
                public void mo120730b(int i, String str) {
                    Log.m165379d("CameraInterface2", "onNativeInit, ret:" + i + ", msg:" + str);
                }

                @Override // com.ss.android.vesdk.VEListener.AbstractC63855ab
                /* renamed from: a */
                public void mo120728a(int i, String str) {
                    Log.m165383e("CameraInterface2", "onError, ret:" + i + ", msg:" + str);
                    C32758c.this.mo120720b(i);
                }

                @Override // com.ss.android.vesdk.VEListener.AbstractC63855ab
                /* renamed from: a */
                public void mo120727a(int i, int i2, String str) {
                    if (i == 1000) {
                        Log.m165389i("CameraInterface2", "onInfo, render created start preview");
                        if (C32758c.this.f84055c != null) {
                            C32758c.this.f84055c.mo220933a(C32758c.this.f84054b);
                        }
                    } else if (i == 1001) {
                        Log.m165389i("CameraInterface2", "onInfo, render destroyed stop preview");
                        if (C32758c.this.f84054b != null) {
                            C32758c.this.f84054b.mo221757d();
                        }
                    }
                }
            });
            try {
                int a6 = this.f84055c.mo220925a(null, a3, a4, a5);
                this.f84055c.mo220934a(true);
                if (a6 != 0) {
                    Log.m165383e("CameraInterface2", "init record error, ret:" + a6);
                    mo120720b(a6);
                }
            } catch (Exception e2) {
                mo120720b(-1);
                Log.m165383e("CameraInterface2", e2.getLocalizedMessage());
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120691a(Context context, boolean z, C32743b.AbstractC32750d dVar) {
        VERecorder vERecorder = this.f84055c;
        if (vERecorder == null) {
            Log.m165383e("CameraInterface2", "stopRecord failed, recorder is null");
        } else {
            vERecorder.mo220931a(new VEListener.AbstractC63866i(z, dVar, context) {
                /* class com.ss.android.lark.cameraview.$$Lambda$c$9tT9mqOkpg1yZ6ReMLhAn4l9j48 */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ C32743b.AbstractC32750d f$2;
                public final /* synthetic */ Context f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.vesdk.VEListener.AbstractC63866i
                public final void onDone(int i) {
                    C32758c.this.m125703a((C32758c) this.f$1, (boolean) this.f$2, (C32743b.AbstractC32750d) this.f$3, (Context) i);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m125703a(boolean z, final C32743b.AbstractC32750d dVar, final Context context, int i) {
        Log.m165389i("CameraInterface2", "stopRecord, ret:" + i);
        if (z) {
            this.f84055c.mo220937c();
            dVar.mo120713a(null, null);
            return;
        }
        final String str = m125708e(context) + File.separator + System.currentTimeMillis() + ".mp4";
        int a = VEUtils.m250914a(this.f84055c.mo220936b(), str);
        Log.m165389i("CameraInterface2", "videoConcatRet:" + a + ", path:" + str);
        if (a != 0) {
            Log.m165383e("CameraInterface2", "concatVideo failed, ret:" + a);
            dVar.mo120713a(null, null);
            return;
        }
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.cameraview.C32758c.RunnableC327635 */

            public void run() {
                C32758c.this.mo120721d();
                Log.m165389i("CameraInterface2", "recordResult, path is:" + str);
                dVar.mo120713a(str, null);
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context, str) {
                    /* class com.ss.android.lark.cameraview.$$Lambda$c$5$eT02s4p6tFktIJyvxEPpii6dRAY */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ String f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C32758c.RunnableC327635.m125745a(this.f$0, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m125745a(Context context, String str) {
                Uri a = MediaStoreUtil.m94879a(context, "video_" + System.currentTimeMillis() + ".mp4");
                if (a != null) {
                    MediaStoreUtil.m94891a(str, a, context);
                } else {
                    Log.m165383e("CameraInterface2", "fail to create Movie Uri");
                }
            }
        });
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120688a(Context context, Surface surface, float f, C32743b.AbstractC32748b bVar) {
        VERecorder vERecorder = this.f84055c;
        if (vERecorder == null) {
            Log.m165383e("CameraInterface2", "startRecord failed, recorder is null");
            return;
        }
        vERecorder.mo220937c();
        int i = (this.f84053a + 90) % 360;
        this.f84055c.mo220928a(1.0f, $$Lambda$c$2c9jVGtBAODgUGV_b607Ek5A8M.INSTANCE);
    }

    @Override // com.ss.android.lark.cameraview.AbstractC32797g
    /* renamed from: a */
    public void mo120687a(Context context, float f, float f2, int i, int i2, C32743b.AbstractC32749c cVar) {
        Log.m165389i("CameraInterface2", "handleFocus, x:" + f + ", y:" + f2);
        C64074t a = new C64074t.C64075a((int) f, (int) f2, i, i2, context.getResources().getDisplayMetrics().density).mo221853a();
        C64034n nVar = this.f84054b;
        if (nVar != null) {
            nVar.mo221749a(a);
            cVar.mo120673a();
        }
    }
}
