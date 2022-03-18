package com.ss.android.medialib.presenter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import androidx.lifecycle.AbstractC1178x;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.medialib.C59396f;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.medialib.camera.C59390b;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.listener.AbstractC59397a;
import com.ss.android.medialib.listener.AbstractC59398b;
import com.ss.android.medialib.listener.AbstractC59399c;
import com.ss.android.medialib.listener.AbstractC59400d;
import com.ss.android.medialib.model.C59402a;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.p2998a.C59373b;
import com.ss.android.medialib.p2998a.RunnableC59370a;
import com.ss.android.medialib.p2999b.C59376a;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.LandMarkFrame;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDebugSettings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3508c.p3509a.AbstractC70000a;
import org.p3508c.p3509a.AbstractC70001b;
import org.p3508c.p3509a.C70002c;

public class MediaRecordPresenter implements RunnableC59370a.AbstractC59371a, AbstractC59419d, AbstractC70001b {

    /* renamed from: a */
    public static final String f147477a = "MediaRecordPresenter";

    /* renamed from: A */
    private C59424g f147478A;

    /* renamed from: B */
    private boolean f147479B = true;

    /* renamed from: C */
    private boolean f147480C = false;

    /* renamed from: D */
    private float f147481D = 1.0f;

    /* renamed from: E */
    private boolean f147482E = false;

    /* renamed from: F */
    private volatile boolean f147483F = false;

    /* renamed from: G */
    private int f147484G = 0;

    /* renamed from: H */
    private int f147485H = 44100;

    /* renamed from: I */
    private int f147486I = 2;

    /* renamed from: J */
    private int f147487J = 131072;

    /* renamed from: K */
    private boolean f147488K = false;

    /* renamed from: L */
    private boolean f147489L = true;

    /* renamed from: M */
    private C59423f f147490M;

    /* renamed from: N */
    private AtomicInteger f147491N = new AtomicInteger(-1);

    /* renamed from: O */
    private boolean f147492O = false;

    /* renamed from: P */
    private boolean f147493P = false;

    /* renamed from: Q */
    private FifoImpl<C59417b> f147494Q;

    /* renamed from: R */
    private boolean f147495R = false;

    /* renamed from: S */
    private VEDebugSettings f147496S = null;

    /* renamed from: T */
    private double f147497T = -1.0d;

    /* renamed from: U */
    private boolean f147498U = false;

    /* renamed from: V */
    private AbstractC59400d f147499V = new AbstractC59400d() {
        /* class com.ss.android.medialib.presenter.MediaRecordPresenter.C594117 */

        @Override // com.ss.android.medialib.listener.AbstractC59400d
        /* renamed from: a */
        public long mo202258a(boolean z) {
            MediaRecordPresenter mediaRecordPresenter = MediaRecordPresenter.this;
            return mediaRecordPresenter.mo202582b(mediaRecordPresenter.f147507i) / 1000;
        }
    };

    /* renamed from: b */
    public C70002c f147500b;

    /* renamed from: c */
    public boolean f147501c = false;

    /* renamed from: d */
    public AbstractC59414c f147502d;

    /* renamed from: e */
    protected RecordInvoker f147503e;

    /* renamed from: f */
    public boolean f147504f = true;

    /* renamed from: g */
    public boolean f147505g = false;

    /* renamed from: h */
    C59373b f147506h;

    /* renamed from: i */
    SurfaceTexture f147507i;

    /* renamed from: j */
    public int f147508j = -1;

    /* renamed from: k */
    public float f147509k = -1.0f;

    /* renamed from: l */
    public long f147510l = 0;

    /* renamed from: m */
    public long f147511m = 0;

    /* renamed from: n */
    public SurfaceTexture.OnFrameAvailableListener f147512n = new SurfaceTexture.OnFrameAvailableListener() {
        /* class com.ss.android.medialib.presenter.MediaRecordPresenter.C594106 */

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (MediaRecordPresenter.this.f147508j == -1) {
                MediaRecordPresenter.this.f147510l = System.currentTimeMillis();
            }
            MediaRecordPresenter.this.f147508j++;
            MediaRecordPresenter.this.f147511m = System.currentTimeMillis();
            float f = ((float) (MediaRecordPresenter.this.f147511m - MediaRecordPresenter.this.f147510l)) / 1000.0f;
            if (f >= 1.0f) {
                MediaRecordPresenter mediaRecordPresenter = MediaRecordPresenter.this;
                mediaRecordPresenter.f147509k = ((float) mediaRecordPresenter.f147508j) / f;
                MediaRecordPresenter mediaRecordPresenter2 = MediaRecordPresenter.this;
                mediaRecordPresenter2.f147510l = mediaRecordPresenter2.f147511m;
                MediaRecordPresenter.this.f147508j = 0;
            }
        }
    };

    /* renamed from: o */
    private String f147513o;

    /* renamed from: p */
    private int f147514p = 1;

    /* renamed from: q */
    private long f147515q;

    /* renamed from: r */
    private long f147516r;

    /* renamed from: s */
    private boolean f147517s;

    /* renamed from: t */
    private boolean f147518t;

    /* renamed from: u */
    private AtomicBoolean f147519u = new AtomicBoolean(false);

    /* renamed from: v */
    private int f147520v = 18;

    /* renamed from: w */
    private int f147521w = -1;

    /* renamed from: x */
    private AbstractC70000a f147522x;

    /* renamed from: y */
    private AbstractC59412a f147523y;

    /* renamed from: z */
    private boolean f147524z = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioType {
    }

    /* renamed from: com.ss.android.medialib.presenter.MediaRecordPresenter$a */
    public interface AbstractC59412a {
        /* renamed from: a */
        void mo202645a(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.presenter.MediaRecordPresenter$b */
    public interface AbstractC59413b {
        /* renamed from: a */
        void mo202646a(int i);
    }

    /* renamed from: com.ss.android.medialib.presenter.MediaRecordPresenter$c */
    public interface AbstractC59414c {
        /* renamed from: a */
        void mo202647a(C59402a aVar);

        /* renamed from: a */
        boolean mo202648a();
    }

    /* renamed from: com.ss.android.medialib.presenter.MediaRecordPresenter$d */
    public interface AbstractC59415d {
        /* renamed from: a */
        void mo202649a(Bitmap bitmap, int i);
    }

    /* renamed from: a */
    public MediaRecordPresenter mo202539a(int i, int i2, int i3) {
        this.f147485H = i;
        this.f147486I = i2;
        this.f147487J = i3;
        return this;
    }

    /* renamed from: a */
    public MediaRecordPresenter mo202541a(String str) {
        this.f147513o = str;
        this.f147503e.changeMusicPath(str);
        return this;
    }

    /* renamed from: a */
    public void mo202571a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2, int i) {
        this.f147503e.initDuet(str, f, f2, f3, z, z2, i);
        mo202540a(0L, 0L);
        mo202541a(str2);
        this.f147480C = true;
    }

    /* renamed from: a */
    public void mo202547a(int i, int i2) {
        String str = f147477a;
        C63929ab.m250974a(str, "changeOutputVideoSize: width=" + i + ", height=" + i2);
        this.f147503e.changeOutputVideoSize(i, i2);
    }

    /* renamed from: a */
    public void mo202544a(float f) {
        this.f147503e.chooseAreaFromRatio34(f);
    }

    /* renamed from: b */
    public void mo202589b(boolean z) {
        this.f147503e.forceFirstFrameHasEffect(z);
    }

    /* renamed from: a */
    public void mo202549a(long j) {
        this.f147503e.setEffectAlgorithmRequirement(j);
    }

    /* renamed from: a */
    public void mo202556a(RecordInvoker.OnPreviewRadioListener onPreviewRadioListener) {
        this.f147503e.setPreviewRadioListener(onPreviewRadioListener);
    }

    /* renamed from: a */
    public void mo202563a(AbstractC59412a aVar) {
        this.f147523y = aVar;
    }

    /* renamed from: a */
    public void mo202551a(Context context, String str, String str2) {
        this.f147503e.initReaction(context, str, str2);
        mo202540a(0L, 0L);
        mo202541a(str2);
    }

    /* renamed from: a */
    public MediaRecordPresenter mo202540a(long j, long j2) {
        this.f147515q = j;
        this.f147516r = j2;
        this.f147503e.setMusicTime(j, j2);
        return this;
    }

    /* renamed from: a */
    public synchronized int mo202529a(Context context, int i, AbstractC70000a aVar) {
        C70002c cVar;
        this.f147522x = aVar;
        if (context == null) {
            String str = f147477a;
            C63929ab.m250980d(str, "file " + C63929ab.m250975b() + ",fun " + C63929ab.m250979d() + ",line " + C63929ab.m250977c() + ": context is null");
            return IByteRtcError.BRERR_INVALID_TOKEN;
        }
        this.f147514p = i;
        if (!this.f147501c && (cVar = this.f147500b) != null) {
            cVar.mo246351a();
            C63929ab.m250974a(f147477a, "initRecord: mAudioRecorder.unInit()");
        }
        if ((this.f147514p & 1) != 0 && !this.f147501c) {
            C70002c cVar2 = new C70002c(this, this.f147485H, this.f147486I, this.f147487J, this.f147490M);
            this.f147500b = cVar2;
            cVar2.mo246357b(1);
            mo202631p();
        }
        int i2 = 0;
        if ((this.f147514p & 4) != 0 && !TextUtils.isEmpty(this.f147513o)) {
            this.f147503e.setBGMVolume(this.f147481D, -1);
            i2 = this.f147503e.initAudioPlayer(context, this.f147513o, this.f147516r + this.f147515q, this.f147518t, this.f147482E);
        }
        String str2 = f147477a;
        C63929ab.m250974a(str2, "initRecord return: " + i2);
        return i2;
    }

    /* renamed from: a */
    public boolean mo202575a(int i) {
        if (this.f147500b == null && this.f147489L && (i & 1) != 0) {
            C63929ab.m250974a(f147477a, "checkAudioNeedInit changeAudioRecord make sure audioRecorder will be created here !!");
        } else if (this.f147514p == i) {
            C63929ab.m250978c(f147477a, "checkAudioNeedInit changeAudioRecord: no need");
            return false;
        }
        if (!this.f147489L || (i & 1) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo202590b(int i) {
        if (this.f147500b == null && this.f147489L && (i & 1) != 0) {
            C63929ab.m250974a(f147477a, "checkAudioNeedRelease changeAudioRecord make sure audioRecorder will be created here !!");
        } else if (this.f147514p == i) {
            C63929ab.m250978c(f147477a, "checkAudioNeedRelease changeAudioRecord: no need");
            return false;
        }
        if ((i & this.f147514p & 1) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo202553a(AssetManager assetManager) {
        this.f147503e.configStyleResourceFinder(assetManager);
    }

    /* renamed from: a */
    public int[] mo202576a(int i, int i2, int i3, int i4) {
        return this.f147503e.updateReactionCameraPos(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo202552a(Context context, String str, String str2, String str3) {
        this.f147503e.setCustomVideoBg(context, str, str2, str3, 0, true, this.f147482E);
        if (!TextUtils.isEmpty(str2)) {
            this.f147503e.previewVideoBg();
        }
        if (TextUtils.isEmpty(this.f147513o)) {
            this.f147503e.uninitAudioPlayer();
            mo202541a((String) null);
            mo202599d(0);
        }
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f147513o) && !TextUtils.isEmpty(str3)) {
            int initAudioPlayer = this.f147503e.initAudioPlayer(context, str3, this.f147516r, false, this.f147482E);
            String str4 = f147477a;
            C63929ab.m250974a(str4, "setCustomVideoBg, initAudioPlayer ret = " + initAudioPlayer);
        }
    }

    /* renamed from: a */
    public void mo202543a() {
        this.f147503e.uninitBeautyPlay();
    }

    /* renamed from: a */
    public void mo202555a(SurfaceTexture surfaceTexture) {
        this.f147507i = surfaceTexture;
    }

    /* renamed from: a */
    public void mo202548a(int i, boolean z, boolean z2) {
        this.f147503e.updateRotation((i + this.f147484G) % 360, z, z2);
    }

    /* renamed from: a */
    public void mo202567a(LandMarkFrame landMarkFrame) {
        this.f147503e.setLandMarkInfo(landMarkFrame);
    }

    /* renamed from: a */
    public void mo202564a(AbstractC59413b bVar) {
        C70002c cVar;
        if (!this.f147501c && (cVar = this.f147500b) != null) {
            cVar.mo246354a(bVar);
        }
    }

    @Override // com.ss.android.medialib.p2998a.RunnableC59370a.AbstractC59371a
    /* renamed from: a */
    public int mo202202a(byte[] bArr, int i) {
        C63929ab.m250976b(f147477a, "onProcessData is running");
        if (this.f147493P) {
            if (!this.f147495R && this.f147494Q != null) {
                for (int i2 = 0; i2 < this.f147494Q.getMaxSize(); i2++) {
                    C59417b pollSafe = this.f147494Q.pollSafe();
                    if (pollSafe != null) {
                        this.f147503e.addPCMData(pollSafe.mo202659b(), pollSafe.mo202658a());
                        C63929ab.m250976b(f147477a, "cached buffer in");
                    }
                }
            }
            this.f147495R = true;
        }
        return this.f147503e.addPCMData(bArr, i);
    }

    /* renamed from: a */
    public int mo202531a(Surface surface, String str) {
        int b = C59390b.m230546a().mo202245b();
        int i = 1;
        if (C59390b.m230546a().mo202246c() != 1) {
            i = 0;
        }
        return mo202532a(surface, str, b, i);
    }

    /* renamed from: a */
    public int mo202530a(Surface surface) {
        return this.f147503e.changeSurface(surface);
    }

    /* renamed from: a */
    public int mo202532a(Surface surface, String str, int i, int i2) {
        C63929ab.m250976b("MediaPresenter", "Start Play >>> ");
        int startPlay = this.f147503e.startPlay(surface, str, this.f147517s, i, i2);
        C63929ab.m250976b("MediaPresenter", "Start Play ret = " + startPlay);
        return startPlay;
    }

    /* renamed from: a */
    public void mo202546a(float f, int i, int i2) {
        this.f147503e.setPreviewSizeRatio(f, i, i2);
    }

    /* renamed from: b */
    public void mo202587b(int i, String str) {
        String str2 = f147477a;
        C63929ab.m250976b(str2, "nativeSetBeautyFace: " + i);
        this.f147503e.setBeautyFace(i, str);
    }

    /* renamed from: a */
    public void mo202545a(float f, float f2) {
        this.f147503e.setBeautyFaceIntensity(f, f2);
    }

    /* renamed from: a */
    public int mo202535a(String str, float f, float f2) {
        return this.f147503e.setReshape(str, f, f2);
    }

    /* renamed from: a */
    public void mo202574a(String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f147503e.setWaterMark(strArr, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public void mo202554a(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f147503e.setWaterMark(bitmap, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public void mo202550a(Context context) {
        this.f147503e.setNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: a */
    public void mo202572a(String str, Map<Integer, Float> map) {
        mo202579b(str);
        if (map != null) {
            for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                mo202577b(entry.getKey().intValue(), entry.getValue().floatValue());
            }
        }
    }

    /* renamed from: a */
    public void mo202568a(String str, float f) {
        int filterNew = this.f147503e.setFilterNew(str, f);
        String str2 = f147477a;
        C63929ab.m250976b(str2, "ret = " + filterNew);
    }

    /* renamed from: a */
    public void mo202569a(String str, String str2, float f) {
        this.f147503e.setFilter(str, str2, f);
    }

    /* renamed from: a */
    public void mo202570a(String str, String str2, float f, float f2, float f3) {
        this.f147503e.setFilterNew(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public void mo202558a(C59376a.AbstractC59378b bVar) {
        this.f147503e.setOnOpenGLCallback(bVar);
    }

    /* renamed from: a */
    public int mo202538a(int[] iArr, boolean z, final AbstractC59415d dVar, boolean z2) {
        return this.f147503e.shotScreen("", iArr, z, -1, new RecordInvoker.OnPictureCallback() {
            /* class com.ss.android.medialib.presenter.MediaRecordPresenter.C594084 */

            @Override // com.ss.android.medialib.RecordInvoker.OnPictureCallback
            public void onResult(int[] iArr, int i, int i2) {
                if (iArr == null || iArr.length <= 0 || i <= 0 || i2 <= 0) {
                    AbstractC59415d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo202649a(null, -3000);
                        return;
                    }
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
                AbstractC59415d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.mo202649a(createBitmap, 0);
                }
            }
        }, new C59376a.AbstractC59379c() {
            /* class com.ss.android.medialib.presenter.MediaRecordPresenter.C594095 */

            @Override // com.ss.android.medialib.p2999b.C59376a.AbstractC59379c
            /* renamed from: a */
            public void mo202214a(int i) {
                AbstractC59415d dVar = dVar;
                if (dVar != null && i < 0) {
                    dVar.mo202649a(null, i);
                }
            }
        }, z2);
    }

    /* renamed from: a */
    public int mo202534a(ImageFrame imageFrame, boolean z) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.f147512n;
        if (!(onFrameAvailableListener == null || (surfaceTexture = this.f147507i) == null)) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
        return this.f147503e.onDrawFrame(imageFrame, z);
    }

    /* renamed from: a */
    public int mo202533a(ImageFrame imageFrame, int i, boolean z) {
        return this.f147503e.onDrawFrame(imageFrame, i, z);
    }

    /* renamed from: a */
    public void mo202573a(boolean z, long j) {
        this.f147503e.enableScan(z, j);
    }

    /* renamed from: a */
    public void mo202565a(AbstractC59414c cVar) {
        mo202566a(cVar, -1);
    }

    /* renamed from: a */
    public void mo202566a(AbstractC59414c cVar, int i) {
        this.f147502d = cVar;
        this.f147503e.setFrameCallback(cVar == null ? null : new RecordInvoker.OnFrameCallback() {
            /* class com.ss.android.medialib.presenter.MediaRecordPresenter.C594062 */

            /* renamed from: a */
            volatile C59402a f147526a = new C59402a();

            /* renamed from: c */
            private double f147528c = 0.0d;

            /* renamed from: d */
            private double f147529d = 0.0d;

            /* renamed from: e */
            private float f147530e = BitmapDescriptorFactory.HUE_RED;

            @Override // com.ss.android.medialib.RecordInvoker.OnFrameCallback
            public void onFrame(int i, double d) {
                this.f147526a.f147467b = i;
                this.f147526a.f147471f = (long) d;
                this.f147526a.f147474i = MediaRecordPresenter.this.f147504f;
                if (MediaRecordPresenter.this.f147502d != null) {
                    MediaRecordPresenter.this.f147502d.mo202647a(this.f147526a);
                }
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnFrameCallback
            public void onInit(EGLContext eGLContext, int i, int i2, int i3, long j) {
                this.f147526a.f147466a = eGLContext;
                this.f147526a.f147468c = i;
                this.f147526a.f147469d = i2;
                this.f147526a.f147470e = i3;
                this.f147526a.f147472g = j;
                this.f147530e = ((Float) VEConfigCenter.m250617a().mo220632a("ve_recorder_fps_downgrade", Float.valueOf(-1.0f))).floatValue();
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnFrameCallback
            public void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d) {
                this.f147526a.f147473h = byteBuffer;
                this.f147526a.f147468c = i;
                this.f147526a.f147469d = i2;
                this.f147526a.f147470e = i3;
                this.f147526a.f147471f = (long) d;
                this.f147526a.f147474i = MediaRecordPresenter.this.f147504f;
                if (MediaRecordPresenter.this.f147502d != null) {
                    MediaRecordPresenter.this.f147502d.mo202647a(this.f147526a);
                }
            }
        }, cVar != null && cVar.mo202648a(), i);
    }

    /* renamed from: a */
    public void mo202557a(RecordInvoker.OnRunningErrorCallback onRunningErrorCallback) {
        this.f147503e.setRunningErrorCallback(onRunningErrorCallback);
    }

    /* renamed from: a */
    public void mo202559a(AbstractC59397a aVar) {
        this.f147503e.setFaceDetectListener2(aVar);
    }

    /* renamed from: a */
    public void mo202560a(AbstractC59398b bVar) {
        this.f147503e.setNativeInitListener2(bVar);
    }

    /* renamed from: a */
    public void mo202562a(IStickerRequestCallback iStickerRequestCallback) {
        this.f147503e.setStickerRequestCallback(iStickerRequestCallback);
    }

    /* renamed from: a */
    public void mo202561a(AbstractC59399c cVar) {
        this.f147503e.addSlamDetectListener2(cVar);
    }

    /* renamed from: b */
    public void mo202588b(AbstractC59399c cVar) {
        this.f147503e.removeSlamDetectListener2(cVar);
    }

    /* renamed from: a */
    public int mo202537a(boolean z, String str) {
        if (!this.f147480C || this.f147479B) {
            return this.f147503e.setEnableAEC(z, str);
        }
        return -1;
    }

    /* renamed from: a */
    public int mo202536a(boolean z, int i) {
        return this.f147503e.setLoudness(z, i);
    }

    /* renamed from: c */
    public long mo202592c() {
        return this.f147503e.getEndFrameTime();
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: i */
    public void mo202617i() {
        AbstractC70000a aVar = this.f147522x;
        if (aVar != null) {
            aVar.mo202617i();
        }
    }

    /* renamed from: k */
    public void mo202622k() {
        this.f147503e.releaseEncoder();
    }

    /* renamed from: m */
    public void mo202625m() {
        this.f147503e.unRegisterFaceResultCallback();
    }

    /* renamed from: n */
    public EnigmaResult mo202627n() {
        return this.f147503e.getEnigmaResult();
    }

    /* renamed from: o */
    public int mo202629o() {
        return this.f147503e.turnToOffScreenRender();
    }

    /* renamed from: j */
    public void mo202619j() {
        C70002c cVar;
        if (!this.f147501c && (cVar = this.f147500b) != null) {
            cVar.mo246351a();
            this.f147500b = null;
        }
    }

    /* renamed from: r */
    private boolean m230567r() {
        C70002c cVar;
        if (!this.f147501c && (cVar = this.f147500b) != null && cVar.mo246364h()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized void mo202608f() {
        mo202621k(false);
    }

    /* renamed from: g */
    public boolean mo202613g() {
        if (this.f147501c) {
            C59373b bVar = this.f147506h;
            if (bVar == null || !bVar.mo202207b()) {
                return false;
            }
            return true;
        }
        C70002c cVar = this.f147500b;
        if (cVar == null || !cVar.mo246363g()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo202615h() {
        if (!this.f147501c && this.f147500b != null && mo202613g()) {
            this.f147500b.mo246365i();
        }
    }

    /* renamed from: l */
    public void mo202624l() {
        if (!this.f147501c) {
            C70002c cVar = this.f147500b;
            if (cVar != null) {
                cVar.mo246358c();
                return;
            }
            return;
        }
        this.f147506h.mo202204a();
    }

    /* renamed from: p */
    public void mo202631p() {
        C70002c cVar;
        if (!this.f147501c && (cVar = this.f147500b) != null) {
            cVar.mo246353a(new AbstractC1178x<Boolean>() {
                /* class com.ss.android.medialib.presenter.MediaRecordPresenter.C594073 */

                /* renamed from: a */
                public void onChanged(Boolean bool) {
                    MediaRecordPresenter.this.f147505g = bool.booleanValue();
                    String str = MediaRecordPresenter.f147477a;
                    C63929ab.m250976b(str, "change audio recording state: " + MediaRecordPresenter.this.f147505g);
                }
            });
        }
    }

    /* renamed from: q */
    private void m230566q() {
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_oes_texture_shot_screen", (Object) false)).booleanValue();
        String str = f147477a;
        C63929ab.m250974a(str, "ssUseOesTexture: " + booleanValue);
        this.f147503e.enableShotScreenUseOesTexture(booleanValue);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo202606e() {
        /*
            r3 = this;
            boolean r0 = r3.f147480C
            if (r0 == 0) goto L_0x000b
            boolean r0 = r3.f147489L
            boolean r1 = r3.f147479B
            r0 = r0 & r1
            r3.f147489L = r0
        L_0x000b:
            boolean r0 = r3.f147501c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r3.f147489L
            if (r0 == 0) goto L_0x001a
            com.ss.android.medialib.a.b r0 = r3.f147506h
            if (r0 == 0) goto L_0x001a
            goto L_0x0024
        L_0x001a:
            r1 = 0
            goto L_0x0024
        L_0x001c:
            boolean r0 = r3.f147489L
            if (r0 == 0) goto L_0x001a
            org.c.a.c r0 = r3.f147500b
            if (r0 == 0) goto L_0x001a
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.presenter.MediaRecordPresenter.mo202606e():boolean");
    }

    public MediaRecordPresenter() {
        RecordInvoker recordInvoker = new RecordInvoker();
        this.f147503e = recordInvoker;
        recordInvoker.resetPerfStats();
        this.f147478A = new C59424g(this.f147503e);
    }

    /* renamed from: d */
    public String[] mo202602d() {
        return this.f147503e.getRecordedVideoPaths();
    }

    /* renamed from: b */
    public synchronized void mo202583b() {
        this.f147503e.clearFragFile();
    }

    /* renamed from: a */
    public MediaRecordPresenter mo202542a(boolean z) {
        this.f147518t = z;
        return this;
    }

    /* renamed from: a */
    public int mo202519a(double d) {
        return this.f147503e.onDrawFrameTime(d);
    }

    /* renamed from: d */
    public int mo202598d(float f) {
        return mo202577b(12, f);
    }

    /* renamed from: e */
    public void mo202603e(int i) {
        this.f147503e.setModeChangeState(i);
    }

    /* renamed from: f */
    public void mo202609f(int i) {
        this.f147503e.changePreviewRadioMode(i);
    }

    /* renamed from: g */
    public int mo202611g(int i) {
        return this.f147503e.initImageDrawer(i);
    }

    /* renamed from: h */
    public int mo202614h(int i) {
        return this.f147503e.setCodecType(i);
    }

    /* renamed from: j */
    public void mo202620j(boolean z) {
        this.f147503e.enableRecordingMp4(z);
    }

    /* renamed from: r */
    public boolean mo202634r(boolean z) {
        return this.f147503e.setSharedTextureStatus(z);
    }

    /* renamed from: s */
    public void mo202635s(boolean z) {
        this.f147503e.enablePBO(z);
    }

    /* renamed from: t */
    public void mo202636t(boolean z) {
        this.f147503e.enableWaterMark(z);
    }

    /* renamed from: u */
    public void mo202637u(boolean z) {
        this.f147503e.setCameraFirstFrameOptimize(z);
    }

    /* renamed from: v */
    public void mo202638v(boolean z) {
        this.f147503e.setRecordContentType(z);
    }

    /* renamed from: w */
    public void mo202639w(boolean z) {
        this.f147503e.setSwitchEffectInGLTask(z);
    }

    /* renamed from: x */
    public void mo202640x(boolean z) {
        this.f147503e.enableLandMark(z);
    }

    /* renamed from: y */
    public int mo202641y(boolean z) {
        return this.f147503e.enableRecordMaxDuration(z);
    }

    /* renamed from: z */
    public int mo202642z(boolean z) {
        return this.f147503e.enableDuetGlFinish(z);
    }

    /* renamed from: b */
    public int mo202579b(String str) {
        return this.f147503e.setReshapeResource(str);
    }

    /* renamed from: d */
    public void mo202599d(int i) {
        this.f147503e.setUseMusic(i);
    }

    /* renamed from: g */
    public void mo202612g(boolean z) {
        this.f147503e.enableClearColorAfterRender(z);
    }

    /* renamed from: h */
    public void mo202616h(boolean z) {
        this.f147501c = z;
        if (z) {
            this.f147506h = new C59373b(this);
        } else {
            this.f147506h = null;
        }
    }

    /* renamed from: i */
    public void mo202618i(boolean z) {
        this.f147503e.enableAutoTestLog(z);
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: m */
    public void mo202626m(boolean z) {
        AbstractC70000a aVar = this.f147522x;
        if (aVar != null) {
            aVar.mo202626m(z);
        }
    }

    /* renamed from: n */
    public void mo202628n(boolean z) {
        this.f147503e.setCameraClose(z);
    }

    /* renamed from: o */
    public void mo202630o(boolean z) {
        RecordInvoker recordInvoker = this.f147503e;
        if (recordInvoker != null) {
            recordInvoker.setDetectionMode(z);
        }
    }

    /* renamed from: c */
    public void mo202594c(float f) {
        boolean z;
        if (!this.f147489L || this.f147500b == null) {
            z = false;
        } else {
            z = true;
        }
        if (z && !this.f147501c) {
            this.f147500b.mo246352a((double) f, false);
        }
    }

    /* renamed from: e */
    public void mo202605e(boolean z) {
        this.f147503e.enableEffectRT(z);
    }

    /* renamed from: q */
    public void mo202633q(boolean z) {
        C70002c cVar;
        C70002c cVar2;
        if (!z) {
            if (!this.f147501c && (cVar2 = this.f147500b) != null) {
                cVar2.mo246351a();
            }
        } else if (!this.f147501c && (cVar = this.f147500b) != null) {
            cVar.mo246357b(1);
        }
        this.f147489L = z;
    }

    /* renamed from: d */
    public void mo202601d(boolean z) {
        this.f147503e.enablePreloadEffectRes(z);
    }

    /* renamed from: f */
    public void mo202610f(boolean z) {
        this.f147503e.enableMakeUpBackground(z);
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: l */
    public int mo202623l(boolean z) {
        int closeWavFile;
        synchronized (this) {
            closeWavFile = this.f147503e.closeWavFile(z);
            AbstractC70000a aVar = this.f147522x;
            if (aVar != null) {
                aVar.mo202623l(z);
            }
            if (this.f147524z) {
                this.f147503e.deleteLastFrag();
            }
            this.f147524z = false;
            C63929ab.m250974a(f147477a, "closeWavFile");
        }
        return closeWavFile;
    }

    /* renamed from: p */
    public void mo202632p(boolean z) {
        C70002c cVar;
        if (!this.f147501c && (cVar = this.f147500b) != null) {
            cVar.mo246358c();
        }
        this.f147503e.stopPlay();
        mo202615h();
        if (z) {
            mo202622k();
        }
    }

    /* renamed from: b */
    public long mo202582b(SurfaceTexture surfaceTexture) {
        long j;
        long abs = Math.abs(System.nanoTime() - surfaceTexture.getTimestamp());
        if (Build.VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - surfaceTexture.getTimestamp());
        } else {
            j = Long.MAX_VALUE;
        }
        long abs2 = Math.abs((SystemClock.uptimeMillis() * 1000000) - surfaceTexture.getTimestamp());
        String str = f147477a;
        C63929ab.m250976b(str, "nano_time: " + abs + ",elapsed: " + j + " ,delta_uptime_nano: " + abs2);
        return Math.min(Math.min(abs, j), abs2);
    }

    /* renamed from: c */
    public void mo202595c(int i) {
        this.f147503e.setEffectBuildChainType(i);
    }

    /* renamed from: k */
    public synchronized int mo202621k(boolean z) {
        if (this.f147493P) {
            this.f147495R = false;
        }
        if (this.f147519u.get()) {
            return -1;
        }
        this.f147519u.getAndSet(true);
        int stopRecord = this.f147503e.stopRecord(z);
        if (this.f147501c) {
            C59373b bVar = this.f147506h;
            if (bVar != null && !this.f147488K) {
                bVar.mo202204a();
                this.f147491N.getAndSet(-1);
            }
        } else {
            C70002c cVar = this.f147500b;
            if (cVar != null && !this.f147488K) {
                cVar.mo246361f();
            }
        }
        this.f147519u.getAndSet(false);
        C60229h.m234107b(0);
        return stopRecord;
    }

    /* renamed from: c */
    public void mo202596c(String str) {
        int filter = this.f147503e.setFilter(str);
        String str2 = f147477a;
        C63929ab.m250976b(str2, "ret = " + filter);
    }

    /* renamed from: c */
    public void mo202597c(boolean z) {
        this.f147503e.enable3buffer(z);
    }

    /* renamed from: b */
    public void mo202584b(float f) {
        this.f147503e.setPaddingBottomInRatio34(f);
    }

    /* renamed from: b */
    public int mo202577b(int i, float f) {
        return this.f147503e.setIntensityByType(i, f);
    }

    /* renamed from: a */
    public int mo202521a(int i, float f) {
        return mo202577b(i, f);
    }

    /* renamed from: c */
    public MediaRecordPresenter mo202593c(int i, int i2) {
        this.f147521w = i;
        this.f147520v = i2;
        return this;
    }

    /* renamed from: e */
    public void mo202604e(int i, int i2) {
        this.f147503e.setCamPreviewSize(i, i2);
    }

    /* renamed from: f */
    public int mo202607f(int i, int i2) {
        return this.f147503e.startPlay(i, i2, Build.DEVICE, -1, -1);
    }

    /* renamed from: d */
    public void mo202600d(int i, int i2) {
        this.f147503e.setReactionBorderParam(i, i2);
    }

    /* renamed from: b */
    public int mo202581b(byte[] bArr, int i) {
        if (!this.f147501c) {
            return 0;
        }
        this.f147503e.onAudioCallback(bArr, i);
        AbstractC70000a aVar = this.f147522x;
        if (aVar != null) {
            aVar.mo202591c(bArr, i);
            C63929ab.m250976b(f147477a, "addPCMData is running");
        }
        if (this.f147491N.get() != 0) {
            return 0;
        }
        this.f147506h.mo202206a(Arrays.copyOf(bArr, i), i);
        return 0;
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: c */
    public int mo202591c(byte[] bArr, int i) {
        if (this.f147501c) {
            C63929ab.m250976b(f147477a, "onProcessData is running");
            this.f147503e.addPCMData(bArr, i);
            return 0;
        }
        if (this.f147493P && !this.f147495R && this.f147494Q != null) {
            this.f147494Q.addLastSafe(new C59417b(Arrays.copyOf(bArr, i), i));
        }
        this.f147503e.onAudioCallback(bArr, i);
        AbstractC70000a aVar = this.f147522x;
        if (aVar == null) {
            return 0;
        }
        aVar.mo202591c(bArr, i);
        C63929ab.m250976b(f147477a, "addPCMData is running");
        return 0;
    }

    /* renamed from: a */
    public synchronized int mo202526a(int i, String str) {
        mo202583b();
        return this.f147503e.tryRestore(i, str);
    }

    /* renamed from: b */
    public void mo202585b(int i, int i2) {
        this.f147503e.setCaptureRenderWidth(i, i2);
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: a */
    public int mo202522a(int i, int i2, double d) {
        int initWavFile = this.f147503e.initWavFile(i, i2, d);
        AbstractC70000a aVar = this.f147522x;
        if (aVar != null) {
            aVar.mo202522a(i, i2, d);
            C63929ab.m250974a(f147477a, "initWavFile");
        }
        return initWavFile;
    }

    /* renamed from: b */
    public int mo202580b(String str, float f, float f2) {
        return this.f147503e.setFaceMakeUp(str, f, f2);
    }

    /* renamed from: b */
    public synchronized int mo202578b(Context context, int i, AbstractC70000a aVar) {
        C70002c cVar;
        if (this.f147500b == null && this.f147489L && (i & 1) != 0) {
            C63929ab.m250974a(f147477a, "changeAudioRecord make sure audioRecorder will be created here !!");
        } else if (this.f147514p == i) {
            C63929ab.m250978c(f147477a, "changeAudioRecord: no need");
            return 1;
        }
        if (context == null) {
            String str = f147477a;
            C63929ab.m250980d(str, "file " + C63929ab.m250975b() + ",fun " + C63929ab.m250979d() + ",line " + C63929ab.m250977c() + ": context is null");
            return IByteRtcError.BRERR_INVALID_TOKEN;
        }
        this.f147522x = aVar;
        int i2 = -2000;
        if ((this.f147514p & 1 & i) == 0 && !this.f147501c && (cVar = this.f147500b) != null) {
            cVar.mo246351a();
            this.f147500b = null;
            C63929ab.m250974a(f147477a, "changeAudioRecord: mAudioRecorder.unInit()");
        }
        if (this.f147489L && (i & 1) != 0 && !this.f147501c && this.f147500b == null) {
            C70002c cVar2 = new C70002c(this, this.f147485H, this.f147486I, this.f147487J, this.f147490M);
            this.f147500b = cVar2;
            cVar2.mo246357b(1);
            mo202631p();
            C63929ab.m250974a(f147477a, "changeAudioRecord: mAudioRecorder.init()");
        }
        if ((i & 4) != 0) {
            this.f147503e.setBGMVolume(this.f147481D, -1);
            i2 = this.f147503e.initAudioPlayer(context, this.f147513o, this.f147516r + this.f147515q, this.f147518t, this.f147482E);
            String str2 = f147477a;
            C63929ab.m250974a(str2, "changeAudioRecord: initAudioPlayer return: " + i2);
        } else {
            this.f147503e.uninitAudioPlayer();
            mo202599d(0);
        }
        this.f147514p = i;
        return i2;
    }

    /* renamed from: a */
    public int mo202528a(int i, float[] fArr, boolean z) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.f147512n;
        if (!(onFrameAvailableListener == null || (surfaceTexture = this.f147507i) == null)) {
            if (fArr != null) {
                boolean z2 = false;
                if ((fArr[0] * fArr[5]) - (fArr[1] * fArr[4]) >= BitmapDescriptorFactory.HUE_RED) {
                    z2 = true;
                }
                this.f147504f = z2;
            }
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
        return this.f147503e.onDrawFrame(i, fArr, z);
    }

    /* renamed from: b */
    public void mo202586b(int i, int i2, int i3, int i4) {
        this.f147503e.setReactionPosMargin(i, i2, i3, i4);
    }

    @Override // org.p3508c.p3509a.AbstractC70001b
    /* renamed from: a */
    public int mo202523a(int i, int i2, int i3, int i4, int i5) {
        C63929ab.m250974a(f147477a, "initAudioConfig");
        this.f147523y.mo202645a(i, i2);
        return this.f147503e.initAudioConfig(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public synchronized int mo202520a(double d, boolean z, float f, int i, int i2, boolean z2, String str, String str2) {
        int i3;
        if (mo202613g()) {
            if (m230567r()) {
                i3 = IByteRtcError.BRERR_NO_PUBLISH_PERMISSION;
            } else {
                i3 = IByteRtcError.BRERR_JOIN_ROOM_ERROR;
            }
            return i3;
        }
        this.f147503e.setVideoQuality(this.f147521w, this.f147520v);
        boolean e = mo202606e();
        m230566q();
        int startRecord = this.f147503e.startRecord(d, z, f, i, i2, str, str2, e);
        boolean z3 = true;
        if (startRecord == 0 && e && !this.f147492O) {
            if (this.f147501c) {
                this.f147491N.getAndSet(this.f147506h.mo202205a(this.f147485H, this.f147486I, d));
            } else {
                this.f147500b.mo246352a(d, true);
            }
        }
        if (startRecord <= 0) {
            z3 = false;
        }
        this.f147488K = z3;
        if (startRecord >= 0) {
            startRecord = 0;
        }
        return startRecord;
    }

    /* renamed from: a */
    public int mo202527a(int i, String str, int i2, int i3, String str2, String[] strArr, float[] fArr, boolean z, boolean z2) {
        return this.f147503e.setStickerPathWithTag(i, str, i2, i3, str2, strArr, fArr, z, z2);
    }

    /* renamed from: a */
    public int mo202524a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2, boolean z3) {
        String str3 = f147477a;
        C63929ab.m250976b(str3, "init enter ");
        C59396f.m230557a().mo202251a(this.f147503e);
        C60229h.m234110d(0);
        C60229h.m234109c(0);
        int initBeautyPlay = this.f147503e.initBeautyPlay(i, i2, str, i3, i4, str2, i5, z, z2, z3);
        this.f147503e.setTextureTimeListener(this.f147499V);
        RecordInvoker.setRecordStopCallback(new RecordInvoker.AbstractC59367a() {
            /* class com.ss.android.medialib.presenter.MediaRecordPresenter.C594051 */

            @Override // com.ss.android.medialib.RecordInvoker.AbstractC59367a
            /* renamed from: a */
            public void mo202189a() {
                if (!MediaRecordPresenter.this.f147501c && MediaRecordPresenter.this.f147500b != null) {
                    MediaRecordPresenter.this.f147500b.mo246356b();
                }
            }
        });
        C63929ab.m250976b(str3, "init ret = " + initBeautyPlay);
        return initBeautyPlay;
    }

    /* renamed from: a */
    public int mo202525a(int i, long j, float f, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z) {
        return this.f147503e.setDisplaySettings(i, j, f, i2, i3, i4, i5, f2, i6, i7, i8, i9, i10, i11, z);
    }
}
