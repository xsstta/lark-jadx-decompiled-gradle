package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.bpea.basics.PrivacyCert;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.listener.AbstractC59397a;
import com.ss.android.medialib.listener.AbstractC59398b;
import com.ss.android.medialib.listener.AbstractC59399c;
import com.ss.android.medialib.model.C59402a;
import com.ss.android.medialib.model.C59404c;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.p2999b.C59376a;
import com.ss.android.medialib.p2999b.C59380b;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ttve.editorInfo.C60192a;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.ttve.nativePort.TEAudioDataInterface;
import com.ss.android.ttve.nativePort.TESystemUtils;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3037f.C60360a;
import com.ss.android.ttvecamera.systemresmanager.C60432b;
import com.ss.android.ttvecamera.systemresmanager.TESystemResManager;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vesdk.C64027k;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDebugSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.audio.AbstractC63946e;
import com.ss.android.vesdk.audio.C63948g;
import com.ss.android.vesdk.audio.VEAudioCaptureHolder;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.p3187a.AbstractC63923a;
import com.ss.android.vesdk.p3187a.AbstractC63924b;
import com.ss.android.vesdk.p3188b.AbstractC63953a;
import com.ss.android.vesdk.p3188b.C63954b;
import com.ss.android.vesdk.p3189c.C63960a;
import com.ss.android.vesdk.p3189c.C63961b;
import com.ss.android.vesdk.p3189c.C63964c;
import com.ss.android.vesdk.p3189c.C63965d;
import com.ss.android.vesdk.p3192f.AbstractC63989c;
import com.ss.android.vesdk.p3192f.C63988b;
import com.ss.android.vesdk.runtime.AbstractC64063e;
import com.ss.android.vesdk.utils.C64079b;
import com.ss.android.vesdk.utils.C64080c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import org.p3508c.p3509a.AbstractC70001b;

/* renamed from: com.ss.android.vesdk.e */
public class C63969e extends AbstractC64021g implements RecordInvoker.OnRunningErrorCallback, AbstractC59398b, AbstractC59399c, MediaRecordPresenter.AbstractC59414c, AbstractC63989c, AbstractC70001b {

    /* renamed from: a */
    public static final String f161528a = "e";

    /* renamed from: k */
    public static final Object f161529k = new Object();

    /* renamed from: A */
    boolean f161530A;

    /* renamed from: B */
    public C60360a f161531B;

    /* renamed from: C */
    C60360a.AbstractC60361a f161532C;

    /* renamed from: D */
    public PrivacyCert f161533D;

    /* renamed from: E */
    public int f161534E;

    /* renamed from: F */
    public int f161535F;

    /* renamed from: G */
    public volatile int f161536G;

    /* renamed from: H */
    public VERecordMode f161537H;

    /* renamed from: I */
    public TEAudioDataInterface f161538I;

    /* renamed from: J */
    AbstractC63953a f161539J;

    /* renamed from: K */
    public LandMarkFrame f161540K;

    /* renamed from: L */
    public aj f161541L;

    /* renamed from: M */
    C63961b.AbstractC63963b f161542M;

    /* renamed from: b */
    final List<C59404c> f161543b = new ArrayList();
    private boolean bA;
    private boolean bB;
    private long bC;
    private boolean bD;
    private boolean bE;
    private boolean bF;
    private boolean bG;
    private boolean bH;
    private AbstractC63946e bI;
    private boolean bJ;
    private boolean bK;
    private int bL;
    private C64027k bM;
    private AbstractC63924b bN;
    private C59376a.AbstractC59378b bO;
    private boolean bn;
    private final VESize bo;
    private final int bp = 1;
    private final int bq = 2;
    private AbstractC64045p br;
    private float bs = 1.0f;
    private long bt = -1;
    private Surface bu;
    private boolean bv;
    private final ExecutorService bw;
    private Object bx;
    private VERecorder.AbstractC63899g by;
    private boolean bz;

    /* renamed from: c */
    public MediaRecordPresenter f161544c;

    /* renamed from: d */
    public String f161545d;

    /* renamed from: e */
    public long f161546e = 0;

    /* renamed from: f */
    public AbstractC63923a f161547f;

    /* renamed from: g */
    public VESize f161548g = new VESize(0, 0);

    /* renamed from: h */
    public VESize f161549h;

    /* renamed from: i */
    public int f161550i;

    /* renamed from: j */
    public boolean f161551j;

    /* renamed from: l */
    public boolean f161552l;

    /* renamed from: m */
    public int f161553m;

    /* renamed from: n */
    public VEPreviewSettings f161554n;

    /* renamed from: o */
    public VEDebugSettings f161555o;

    /* renamed from: p */
    public int f161556p;

    /* renamed from: q */
    public C64022h f161557q;

    /* renamed from: r */
    public C63922a<C63961b> f161558r;

    /* renamed from: s */
    public C63961b f161559s;

    /* renamed from: t */
    public List<VERecorder.AbstractC63899g> f161560t;

    /* renamed from: u */
    public int f161561u;

    /* renamed from: v */
    public boolean f161562v;

    /* renamed from: w */
    public ConditionVariable f161563w;

    /* renamed from: x */
    public volatile boolean f161564x;

    /* renamed from: y */
    public C63952b f161565y;

    /* renamed from: z */
    public boolean f161566z;

    @Override // org.p3508c.p3509a.AbstractC70001b
    /* renamed from: a */
    public int mo202523a(int i, int i2, int i3, int i4, int i5) {
        return 0;
    }

    @Override // com.ss.android.medialib.p2998a.RunnableC59370a.AbstractC59371a
    /* renamed from: a */
    public int mo202202a(byte[] bArr, int i) {
        return 0;
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: b */
    public int mo221399b() {
        return this.f161556p;
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public int mo221377a(AbstractC63923a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, String str2, boolean z) {
        VECameraSettings vECameraSettings;
        an.m251028a("init");
        mo221390a(aVar);
        this.bF = z;
        String str3 = f161528a;
        C63929ab.m250976b(str3, "mIsARCoreSupported = " + this.bF);
        if (aVar == null) {
            vECameraSettings = null;
        } else {
            vECameraSettings = aVar.mo221146h();
        }
        this.al = vECameraSettings;
        if (!(this.al == null || this.al.mo220551p() != VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME || this.al.mo220537c() == VECameraSettings.CAMERA_TYPE.TYPE1)) {
            this.al.mo220535a(VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE);
        }
        this.f161545d = str + File.separator;
        this.am = vEVideoEncodeSettings;
        this.an = vEAudioEncodeSettings;
        this.f161554n = vEPreviewSettings;
        this.ao = str2;
        this.f161566z = m251104y();
        this.bH = m251105z();
        if (this.bG) {
            VEAudioCaptureHolder.INSTANCE.setAudioEncodeSettings(this.an);
            VEAudioCaptureHolder.INSTANCE.setAudioBufferConsumer(this.f161544c);
        }
        this.f161641P = new C64025j();
        int q = m251096q();
        if (this.f161555o == null) {
            this.f161555o = new VEDebugSettings.C63829a().mo220657a();
        }
        an.m251027a();
        this.aj = -1;
        return q;
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221390a(AbstractC63923a aVar) {
        this.f161547f = aVar;
        if (aVar != null) {
            this.f161549h = aVar.mo221147i();
        }
    }

    /* renamed from: a */
    public void mo221395a(final String str, final String str2, final String str3) {
        String str4 = f161528a;
        C63929ab.m250974a(str4, "setCustomVideoBg: videoPath = " + str2 + ", audioPath = " + str3 + ", mVERecordMode = " + this.as);
        if (this.as == VERecordMode.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(str2)) {
            mo221392a(new Runnable() {
                /* class com.ss.android.vesdk.C63969e.AnonymousClass13 */

                public void run() {
                    VERecordMode vERecordMode;
                    synchronized (C63969e.this) {
                        C63929ab.m250974a(C63969e.f161528a, "setCustomVideoBg: doing... ");
                        if (C63969e.this.f161556p == 3) {
                            String str = C63969e.f161528a;
                            C63929ab.m250980d(str, "setCustomVideoBg could not be executed in recording mode: " + C63969e.this.f161556p);
                            return;
                        }
                        C63969e eVar = C63969e.this;
                        if (!TextUtils.isEmpty(str2)) {
                            vERecordMode = VERecordMode.CUSTOM_VIDEO_BG;
                        } else {
                            vERecordMode = VERecordMode.DEFAULT;
                        }
                        eVar.as = vERecordMode;
                        C63969e.this.f161544c.mo202552a(C63969e.this.f161639N, str, str2, str3);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vesdk.p3192f.AbstractC63989c
    /* renamed from: a */
    public void mo221382a(Surface surface) {
        this.bu = surface;
        this.bn = false;
        if (!this.bv) {
            mo221384a(surface, (VEListener.AbstractC63866i) null);
        }
    }

    @Override // com.ss.android.vesdk.p3192f.AbstractC63989c
    /* renamed from: a */
    public void mo221383a(final Surface surface, int i, int i2, int i3) {
        if ((this.f161640O != null && this.f161640O.mo221435c()) || this.bv) {
            mo221392a(new Runnable() {
                /* class com.ss.android.vesdk.C63969e.AnonymousClass15 */

                public void run() {
                    C63969e.this.mo221405c(surface);
                }
            });
            this.bv = false;
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221384a(final Surface surface, final VEListener.AbstractC63866i iVar) {
        an.m251028a("startPreviewAsync");
        this.bB = true;
        mo221392a(new Runnable() {
            /* class com.ss.android.vesdk.C63969e.RunnableC639722 */

            public void run() {
                int d = C63969e.this.mo221409d(surface);
                VEListener.AbstractC63866i iVar = iVar;
                if (iVar != null) {
                    iVar.onDone(d);
                }
            }
        });
        m251102w();
        an.m251027a();
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221385a(VEListener.AbstractC63866i iVar) {
        mo221386a(iVar, false);
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221386a(final VEListener.AbstractC63866i iVar, boolean z) {
        String str = f161528a;
        C63929ab.m250974a(str, "stopPreviewAsync: listener" + iVar);
        double currentTimeMillis = (double) System.currentTimeMillis();
        mo221395a((String) null, (String) null, (String) null);
        m251095d(z);
        VEPreviewSettings vEPreviewSettings = this.f161554n;
        final boolean z2 = vEPreviewSettings != null && vEPreviewSettings.mo220892i();
        if (z2) {
            this.f161563w.close();
        }
        final boolean z3 = this.bE;
        C63929ab.m250974a(str, "stop preview async opt = " + z3);
        if (z3 && z2 && this.f161544c.mo202629o() != 0) {
            this.f161563w.open();
        }
        mo221392a(new Runnable() {
            /* class com.ss.android.vesdk.C63969e.RunnableC639733 */

            public void run() {
                C63969e.this.mo221414j();
                VEListener.AbstractC63866i iVar = iVar;
                if (iVar != null) {
                    iVar.onDone(0);
                }
                if (!z3 && z2) {
                    C63969e.this.f161563w.open();
                }
            }
        });
        if (z2) {
            this.f161563w.block(2000);
        }
        C63929ab.m250974a(str, "stopPreviewAsync cost " + (((double) System.currentTimeMillis()) - currentTimeMillis) + "ms");
        C63929ab.m250974a(str, "add log for TC");
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221381a(final float f, final VEListener.AbstractC63866i iVar) {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
        mo221392a(new Runnable() {
            /* class com.ss.android.vesdk.C63969e.RunnableC639755 */

            public void run() {
                int a = C63969e.this.mo221371a(f);
                VEListener.AbstractC63866i iVar = iVar;
                if (iVar != null) {
                    iVar.onDone(a);
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221387a(VERecorder.AbstractC63894c cVar) {
        super.mo221387a(cVar);
        if (cVar == null) {
            this.f161544c.mo202565a((MediaRecordPresenter.AbstractC59414c) null);
        } else if (cVar.mo180962a() == null) {
            this.f161544c.mo202565a((MediaRecordPresenter.AbstractC59414c) this);
        } else {
            this.f161544c.mo202566a(this, cVar.mo180962a().f161375b.ordinal());
        }
    }

    /* renamed from: a */
    public void mo221392a(Runnable runnable) {
        if (this.bD) {
            C63929ab.m250980d(f161528a, "Recorder is destroyed, ignore subsequent tasks");
        } else if (!this.bB) {
            runnable.run();
        } else if (this.bw.isShutdown()) {
            C63929ab.m250980d(f161528a, "executeSafeSubmit EXECUTOR isShutdown");
            runnable.run();
        } else {
            try {
                this.bw.submit(runnable);
            } catch (RejectedExecutionException e) {
                e.printStackTrace();
                String str = f161528a;
                C63929ab.m250980d(str, "RejectedExecutionException happened to executeSafeSubmit: " + e.getMessage());
                runnable.run();
            }
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221391a(AbstractC63924b bVar) {
        if (bVar != null) {
            this.bN = bVar;
            VESize i = bVar.mo221147i();
            C63961b bVar2 = null;
            Iterator<C63961b> it = this.f161558r.mo221139c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C63961b next = it.next();
                if (next.mo221327g()) {
                    bVar2 = next;
                    break;
                }
            }
            if (!(i == null || bVar2 == null || bVar2.mo221325e() == null)) {
                bVar2.mo221325e().f150716a = i.width;
                bVar2.mo221325e().f150717b = i.height;
            }
            bVar.mo221144a(this.f161558r);
        }
    }

    @Override // com.ss.android.medialib.listener.AbstractC59398b
    /* renamed from: a */
    public void mo202255a(int i) {
        C60229h.m234090a(0, "te_record_preview_init_time", System.currentTimeMillis() - this.bC);
        if (mo221411f()) {
            int i2 = this.am.getVideoRes().width;
            int i3 = this.am.getVideoRes().height;
            float[] c = this.ar.mo221155c();
            float f = (float) i3;
            float f2 = (float) i2;
            this.f161544c.mo202586b((int) (c[0] * f), (int) (c[1] * f), (int) (c[2] * f2), (int) (c[3] * f2));
            this.f161544c.mo202600d(2, 0);
            float[] d = this.ar.mo221156d();
            this.f161544c.mo202576a(0, 0, (int) (d[2] * f2), (int) (d[3] * f));
        }
        if (i == 0) {
            if (!this.f161554n.mo220890g()) {
                mo221375a(this.az.mo205671d(), this.az.mo205664a());
                mo221372a(this.az.mo205668b(), this.az.mo205670c());
                if (this.aB.mo205695g()) {
                    if (!TextUtils.isEmpty(this.aB.mo205682a()) && !TextUtils.isEmpty(this.aB.mo205686b())) {
                        mo221394a(this.aB.mo205682a(), this.aB.mo205686b(), this.aB.mo205690c(), this.aB.mo205692d(), this.aB.mo205693e());
                    } else if (!TextUtils.isEmpty(this.aB.mo205682a())) {
                        this.f161544c.mo202568a(this.aB.mo205682a(), this.aB.mo205692d());
                    }
                } else if (!TextUtils.isEmpty(this.aB.mo205682a()) && !TextUtils.isEmpty(this.aB.mo205686b())) {
                    mo221393a(this.aB.mo205682a(), this.aB.mo205686b(), this.aB.mo205690c());
                } else if (!TextUtils.isEmpty(this.aB.mo205682a())) {
                    this.f161544c.mo202596c(this.aB.mo205682a());
                    if (!this.aB.mo205694f()) {
                        this.f161544c.mo202598d(this.aB.mo205692d());
                    }
                }
                mo221379a(this.aC.mo205696a(), this.aC.mo205700b(), this.aC.mo205702c());
                mo221380a(this.aC.mo205696a(), this.aC.mo205703d());
                mo221400b(this.aD.mo205672a(), this.aD.mo205675b(), this.aD.mo205677c());
                if (!TextUtils.isEmpty(this.aD.mo205672a())) {
                    mo221373a(19, this.aD.mo205679d());
                    mo221373a(20, this.aD.mo205681e());
                }
                mo221675b(this.aA);
            }
            if (this.ac == null) {
                this.f161544c.mo202565a((MediaRecordPresenter.AbstractC59414c) null);
            } else {
                this.f161544c.mo202566a(this, this.ac.mo180962a().f161375b.ordinal());
            }
        } else {
            C63929ab.m250980d(f161528a, "Create native GL env failed");
        }
        if (this.f161643R != null) {
            this.f161643R.mo120730b(i, "onNativeInitCallBack");
            if (this.f161643R instanceof VEListener.AbstractC63855ab) {
                ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1002, i, "Init onNativeInitCallBack");
            }
        }
        C60229h.m234090a(0, "te_record_preview_init_ret", (long) i);
    }

    @Override // com.ss.android.medialib.listener.AbstractC59398b
    /* renamed from: a */
    public void mo202256a(int i, int i2) {
        if (this.f161643R != null) {
            boolean z = i == 0;
            this.f161643R.mo120729a(z);
            if (this.f161643R instanceof VEListener.AbstractC63855ab) {
                ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1003, z ? 1 : -1, "Init HardEncode");
            }
        }
        if (this.am.isSupportHwEnc()) {
            C60229h.m234090a(0, "te_record_hard_encode_init_ret", i == 1 ? -1 : 0);
        }
    }

    @Override // com.ss.android.medialib.presenter.MediaRecordPresenter.AbstractC59414c
    /* renamed from: a */
    public void mo202647a(C59402a aVar) {
        VERecorder.AbstractC63894c cVar = this.ac;
        if (cVar != null) {
            VEFrame vEFrame = null;
            if (aVar.f147468c == VEFrame.ETEPixelFormat.TEPixFmt_OpenGL_RGBA8.ordinal()) {
                vEFrame = VEFrame.createTextureFrame(aVar.f147466a, aVar.f147467b, aVar.f147469d, aVar.f147470e, 0, aVar.f147471f, VEFrame.ETEPixelFormat.TEPixFmt_OpenGL_RGBA8);
            } else if (aVar.f147468c == VEFrame.ETEPixelFormat.TEPixFmt_YUV420P.ordinal()) {
                vEFrame = VEFrame.createByteBufferFrame(aVar.f147473h, aVar.f147469d, aVar.f147470e, 0, aVar.f147471f, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
            }
            if (vEFrame != null) {
                vEFrame.setFromFrontCamera(aVar.f147474i);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                cVar.mo180963a(vEFrame);
            }
        }
    }

    @Override // com.ss.android.medialib.presenter.MediaRecordPresenter.AbstractC59414c
    /* renamed from: a */
    public boolean mo202648a() {
        VERecorder.AbstractC63894c cVar = this.ac;
        return (cVar == null || cVar.mo180962a() == null || !cVar.mo180962a().f161374a) ? false : true;
    }

    /* renamed from: a */
    public void mo221393a(String str, String str2, float f) {
        this.aB.mo205684a(str);
        this.aB.mo205688b(str2);
        this.aB.mo205683a(f);
        this.aB.mo205685a(true);
        this.f161544c.mo202569a(C64080c.m251465a(str), C64080c.m251465a(str2), f);
    }

    /* renamed from: a */
    public void mo221394a(String str, String str2, float f, float f2, float f3) {
        this.aB.mo205684a(str);
        this.aB.mo205688b(str2);
        this.aB.mo205683a(f);
        this.aB.mo205687b(f2);
        this.aB.mo205691c(f3);
        this.aB.mo205685a(true);
        this.aB.mo205689b(true);
        this.f161544c.mo202570a(C64080c.m251465a(str), C64080c.m251465a(str2), f, f2, f3);
    }

    /* renamed from: a */
    public int mo221379a(String str, float f, float f2) {
        this.aC.mo205698a(str);
        this.aC.mo205697a(f);
        this.aC.mo205701b(f2);
        this.f161544c.mo202535a(C64080c.m251465a(str), f, f2);
        return 0;
    }

    /* renamed from: a */
    public int mo221380a(String str, Map<Integer, Float> map) {
        this.aC.mo205698a(str);
        this.aC.mo205699a(map);
        this.f161544c.mo202572a(str, map);
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public int mo221378a(VEEffectFilterParam vEEffectFilterParam) {
        if (vEEffectFilterParam == null) {
            return -100;
        }
        this.aA = vEEffectFilterParam;
        this.f161544c.mo202527a(vEEffectFilterParam.effectFilterType.ordinal(), vEEffectFilterParam.effectPath, vEEffectFilterParam.stickerId, vEEffectFilterParam.reqId, vEEffectFilterParam.stickerTag, vEEffectFilterParam.composerTags, vEEffectFilterParam.composerValues, vEEffectFilterParam.needReload, vEEffectFilterParam.isSyncLoadResource);
        return 0;
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221388a(VERecorder.AbstractC63899g gVar) {
        super.mo221388a(gVar);
        List<VERecorder.AbstractC63899g> list = this.f161560t;
        if (list != null) {
            for (VERecorder.AbstractC63899g gVar2 : list) {
                if (gVar2.equals(gVar)) {
                    this.f161560t.remove(gVar2);
                }
            }
            if (this.f161560t.isEmpty()) {
                this.f161544c.mo202625m();
            }
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221389a(final VERecorder.AbstractC63901i iVar) {
        super.mo221389a(iVar);
        this.f161544c.mo202556a(new RecordInvoker.OnPreviewRadioListener() {
            /* class com.ss.android.vesdk.C63969e.AnonymousClass12 */

            @Override // com.ss.android.medialib.RecordInvoker.OnPreviewRadioListener
            public void onInfo(int i, int i2) {
                iVar.mo220940a(VEPreviewRadio.values()[i], i2);
            }
        });
    }

    /* renamed from: a */
    public boolean mo221398a(String str) {
        if (this.f161536G != 0) {
            return false;
        }
        String str2 = f161528a;
        C63929ab.m250976b(str2, "mVEAudioCapture init " + str);
        this.f161536G = 1;
        this.f161641P.mo221690b(this.bI);
        this.f161641P.mo221689a(this.bI);
        this.f161641P.init(this.bM);
        return true;
    }

    @Override // com.ss.android.medialib.listener.AbstractC59399c
    /* renamed from: a */
    public void mo202257a(boolean z) {
        for (VERecorder.AbstractC63905m mVar : this.ae.mo221139c()) {
            if (mVar != null) {
                mVar.mo220942a(z);
            }
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public void mo221396a(boolean z, long j) {
        this.f161544c.mo202573a(z, j);
    }

    /* renamed from: a */
    public void mo221397a(boolean z, Bitmap bitmap, String str) {
        if (this.f161555o != null && z) {
            String str2 = this.f161555o.mo220654a() + File.separator + str + "_" + bitmap.getWidth() + "x" + bitmap.getHeight() + "_" + System.currentTimeMillis() + ".jpg";
            C63929ab.m250974a(f161528a, "Start to dump bitmap to " + str2);
            C59380b.m230518a(bitmap, str2, Bitmap.CompressFormat.JPEG);
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: c */
    public String[] mo221407c() {
        return this.f161544c.mo202602d();
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: l */
    public EnigmaResult mo221416l() {
        return this.f161544c.mo202627n();
    }

    /* renamed from: u */
    private void m251100u() {
        this.f161550i = -1;
        this.f161553m = 0;
        this.f161548g.width = 0;
        this.f161548g.height = 0;
    }

    /* renamed from: v */
    private void m251101v() {
        if (this.aj != -1) {
            TEVideoUtils.resetModel(this.aj);
            this.aj = -1;
        }
    }

    /* renamed from: x */
    private boolean m251103x() {
        if (this.f161566z || mo221415k()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: e */
    public synchronized void mo221410e() {
        mo221392a(new Runnable() {
            /* class com.ss.android.vesdk.C63969e.RunnableC639777 */

            public void run() {
                synchronized (C63969e.this) {
                    if (C63969e.this.f161556p == 3) {
                        String str = C63969e.f161528a;
                        C63929ab.m250980d(str, "clearAllFrags could not be executed in mode: " + C63969e.this.f161556p);
                        return;
                    }
                    C63969e.this.f161546e = 0;
                    C63969e.this.f161543b.clear();
                    C63969e.this.f161544c.mo202583b();
                }
            }
        });
    }

    /* renamed from: h */
    public void mo221413h() {
        if (this.f161556p != 0) {
            this.f161556p = 0;
            this.f161544c.mo202543a();
        }
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: i */
    public void mo202617i() {
        if (this.f161645T != null) {
            this.f161645T.mo220841a(0, "lackPermission");
        }
    }

    /* renamed from: s */
    private void m251098s() {
        this.f161544c.mo202641y(((Boolean) VEConfigCenter.m250617a().mo220632a("video_duration_opt", (Object) false)).booleanValue());
    }

    /* renamed from: t */
    private void m251099t() {
        this.f161544c.mo202642z(((Boolean) VEConfigCenter.m250617a().mo220632a("enable_duet_gl_finish", (Object) false)).booleanValue());
    }

    /* renamed from: f */
    public boolean mo221411f() {
        if (this.as != VERecordMode.REACTION || this.ar == null || this.ar.mo221154b() == null || this.ar.mo221153a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo221415k() {
        if (this.f161537H == VERecordMode.KARAOKE || this.f161537H == VERecordMode.KARAOKE_PURE_AUDIO) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private void m251102w() {
        this.f161544c.mo202628n(false);
        if (this.f161547f != null) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
            this.f161547f.mo221141b();
        }
    }

    /* renamed from: y */
    private boolean m251104y() {
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_refactor_audio", (Object) false)).booleanValue();
        if (this.bG) {
            booleanValue = true;
        }
        String str = f161528a;
        C63929ab.m250974a(str, "audio refactor: " + booleanValue);
        return booleanValue;
    }

    /* renamed from: z */
    private boolean m251105z() {
        int i;
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("ve_enable_optimize_audio_delay");
        if (a == null || !(a.mo220637a() instanceof Integer)) {
            i = 0;
        } else {
            i = ((Integer) a.mo220637a()).intValue();
        }
        String str = f161528a;
        C63929ab.m250974a(str, "audio length opt: " + i);
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void mo221417m() {
        int i;
        C60360a aVar = this.f161531B;
        int i2 = this.am.getVideoRes().height;
        int i3 = this.am.getVideoRes().width;
        if (this.am.getFps() > 0) {
            i = this.am.getFps();
        } else {
            i = 30;
        }
        aVar.mo206740a(i2, i3, i, this.am.getBps());
        this.f161531B.mo206742a(this.f161642Q.mo221806c());
        this.f161531B.mo206739a();
    }

    /* renamed from: r */
    private void m251097r() {
        int i;
        this.am.getEncodeStandard();
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("enable_record_mpeg4", (Object) false)).booleanValue()) {
            i = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal();
            C63929ab.m250974a(f161528a, "setCodecType MPEG4");
        } else {
            i = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_record_codec_type", (Object) 0)).intValue();
        }
        String str = f161528a;
        C60427s.m234842b(str, "setCodecType: " + i);
        int h = this.f161544c.mo202614h(i);
        if (h != 0) {
            C63929ab.m250980d(str, "setCodecType failed " + h);
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: g */
    public void mo221412g() {
        if (!this.bD) {
            if (this.f161641P != null) {
                this.f161641P.mo221688a();
            }
            an.m251028a("onDestroy");
            if (!this.bn) {
                mo221385a((VEListener.AbstractC63866i) null);
            }
            if (this.f161640O != null) {
                this.f161640O.mo221434b(this);
            }
            AbstractC63923a aVar = this.f161547f;
            if (aVar != null) {
                aVar.mo221143f();
            }
            this.f161544c.mo202559a((AbstractC59397a) null);
            List<VERecorder.AbstractC63899g> list = this.f161560t;
            if (list != null) {
                list.clear();
            }
            mo221392a(new Runnable() {
                /* class com.ss.android.vesdk.C63969e.RunnableC639788 */

                public void run() {
                    C63969e.this.mo221413h();
                    if (C63969e.this.f161538I != null) {
                        C63969e.this.f161538I.release();
                    }
                }
            });
            if (!this.bw.isShutdown()) {
                this.bw.shutdown();
            }
            super.mo221412g();
            C60229h.m234107b(0);
            this.bD = true;
            this.bG = false;
            an.m251027a();
        }
    }

    /* renamed from: q */
    private int m251096q() {
        VESize vESize;
        if (this.f161556p != 0) {
            String str = f161528a;
            C63929ab.m250978c(str, "initInternalRecorder called in a invalid state: " + this.f161556p + "should be : " + 0);
            return -105;
        }
        if (this.an != null) {
            this.f161544c.mo202539a(this.an.mo220488a(), this.an.mo220490c(), this.an.mo220489b());
        }
        this.f161544c.mo202550a(this.f161639N);
        int i = this.am.getVideoRes().width;
        int i2 = this.am.getVideoRes().height;
        int i3 = !TextUtils.isEmpty(this.at) ? 1 : 0;
        if (this.aG) {
            vESize = this.aI;
        } else {
            vESize = new VESize(this.f161554n.mo220884a().height, this.f161554n.mo220884a().width);
        }
        int a = this.f161544c.mo202524a(vESize.width, vESize.height, this.f161545d, i2, i, this.ao, i3, this.ap, this.bF, this.aT);
        if (this.aT) {
            this.f161544c.mo202553a(this.aS);
        }
        int a2 = this.f161544c.mo202537a(this.aO, this.aQ);
        int a3 = this.f161544c.mo202536a(this.bK, this.bL);
        m251097r();
        m251098s();
        m251099t();
        this.aI = vESize;
        if (a2 != 0) {
            String str2 = f161528a;
            C63929ab.m250980d(str2, "setEnableAEC failed " + a2);
        }
        if (a3 != 0) {
            String str3 = f161528a;
            C63929ab.m250980d(str3, "setLoudness failed " + a3);
        }
        if (a == 0) {
            this.f161556p = 1;
        }
        return a;
    }

    /* renamed from: j */
    public synchronized void mo221414j() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f161556p;
        if ((i & 2) == 0) {
            String str = f161528a;
            C63929ab.m250978c(str, "stopRecordPreview status error: " + this.f161556p);
            return;
        }
        if (i == 3 && this.f161554n.mo220902s()) {
            this.f161544c.mo202624l();
            this.f161544c.mo202633q(false);
            int d = mo221408d();
            if (this.f161643R != null && (this.f161643R instanceof VEListener.AbstractC63855ab)) {
                ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1022, d, "stopRecord in stopPreview!!");
            }
        }
        if (this.f161643R != null && (this.f161643R instanceof VEListener.AbstractC63855ab)) {
            ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1060, 1, "calling mic release func");
        }
        this.f161544c.mo202632p(false);
        this.f161556p = 1;
        if (m251103x() && !this.bG) {
            C63929ab.m250976b(f161528a, "mVEAudioCapture release: stopRecordPreview");
            this.f161641P.release(this.f161533D);
            this.f161536G = 0;
        }
        this.f161544c.mo202619j();
        if (this.f161643R != null && (this.f161643R instanceof VEListener.AbstractC63855ab)) {
            ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1060, 2, "mic released func");
        }
        this.f161544c.mo202560a((AbstractC59398b) null);
        this.f161544c.mo202557a((RecordInvoker.OnRunningErrorCallback) null);
        this.f161544c.mo202588b(this);
        mo221388a(this.by);
        this.by = null;
        if (this.aG) {
            mo221413h();
        } else {
            this.f161556p = 1;
        }
        C60229h.m234090a(0, "te_record_preview_destroy_time", System.currentTimeMillis() - currentTimeMillis);
        C60229h.m234107b(0);
        this.bJ = true;
        m251101v();
    }

    /* renamed from: d */
    public synchronized int mo221408d() {
        float f;
        int i = this.f161556p;
        if (i == 3 || i == 4) {
            if (this.bG && this.bH) {
                VEAudioCaptureHolder.INSTANCE.stopFeedPCM();
            }
            an.m251028a("stopRecord");
            this.bz = false;
            this.bA = false;
            if (this.bN != null) {
                Bundle bundle = new Bundle();
                bundle.putString("record", "stop_record");
                this.bN.mo221145a(bundle);
            }
            if (this.bl) {
                this.bm.mo206924a(new TESystemResManager.C60430a(TESystemResManager.ActionType.BOOST_CPU, mo221678p()));
                this.f161544c.mo202608f();
                this.bm.mo206924a(new TESystemResManager.C60430a(TESystemResManager.ActionType.RESTORE_CPU));
            } else {
                this.f161544c.mo202608f();
            }
            this.bz = true;
            this.f161544c.mo202615h();
            if (this.bA && this.f161643R != null && (this.f161643R instanceof VEListener.AbstractC63855ab)) {
                ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1021, 0, "Update segmentation time.");
            }
            long c = (long) (((float) this.f161544c.mo202592c()) / 1000.0f);
            this.f161543b.add(new C59404c(c, (double) this.bs));
            synchronized (f161529k) {
                this.bt = -1;
                f = (float) c;
                this.f161546e = (long) (((float) this.f161546e) + ((1.0f * f) / this.bs));
            }
            if (this.f161556p == 3) {
                this.f161556p = 2;
            } else {
                this.f161556p = 1;
            }
            if (this.f161565y.mo221310e()) {
                C60229h.m234089a(0, "te_record_camera_sensor_interval_variance", this.f161565y.mo221307b());
                C60229h.m234089a(0, "te_record_camera_sensor_interval_mean", this.f161565y.mo221308c());
                C60229h.m234089a(0, "te_record_camera_sensor_interval_range", this.f161565y.mo221309d());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("variance", this.f161565y.mo221307b());
                    jSONObject.put("mean", this.f161565y.mo221308c());
                    jSONObject.put("range", this.f161565y.mo221309d());
                    C60217b.m234046a("vesdk_event_camera_sensor_frame_interval", jSONObject, "performance", false, true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            this.f161565y.mo221305a();
            an.m251027a();
            this.bJ = true;
            C60229h.m234090a(0, "te_record_mode", (long) this.as.ordinal());
            return (int) (f / this.bs);
        }
        String str = f161528a;
        C63929ab.m250980d(str, "nativeStopRecord called in a invalid state: " + this.f161556p);
        return -105;
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: b */
    public void mo221404b(boolean z) {
        this.f161544c.mo202620j(z);
    }

    /* renamed from: a */
    private void m251094a(final VEListener.AbstractC63862e eVar) {
        this.f161544c.mo202564a(new MediaRecordPresenter.AbstractC59413b() {
            /* class com.ss.android.vesdk.C63969e.C639744 */

            @Override // com.ss.android.medialib.presenter.MediaRecordPresenter.AbstractC59413b
            /* renamed from: a */
            public void mo202646a(int i) {
                VEListener.AbstractC63862e eVar = eVar;
                if (eVar != null) {
                    eVar.mo220837a(i);
                }
                C60229h.m234090a(0, "te_record_audio_start_record_ret", (long) i);
            }
        });
    }

    @Override // com.ss.android.vesdk.p3192f.AbstractC63989c
    /* renamed from: b */
    public void mo221402b(Surface surface) {
        mo221385a((VEListener.AbstractC63866i) null);
        this.bn = true;
        this.bv = false;
    }

    /* renamed from: c */
    public int mo221405c(Surface surface) {
        int a = this.f161544c.mo202530a(surface);
        this.f161544c.mo202603e(2);
        return a;
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: m */
    public void mo202626m(boolean z) {
        if (this.f161645T != null) {
            this.f161645T.mo220839a();
        }
    }

    /* renamed from: d */
    private void m251095d(boolean z) {
        this.f161544c.mo202628n(true);
        if (this.f161547f != null) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE);
            this.f161547f.mo221140a(z);
        }
    }

    /* renamed from: b */
    public void mo221401b(int i) {
        if (m251103x() && !this.bG) {
            boolean b = this.f161544c.mo202590b(i);
            if (this.f161544c.mo202575a(i)) {
                mo221398a("checkChangeAudioRecord");
            } else if (b) {
                C63929ab.m250976b(f161528a, "mVEAudioCapture release: checkChangeAudioRecord");
                this.f161641P.release(this.f161533D);
                this.f161536G = 0;
            }
        }
    }

    /* renamed from: c */
    public int mo221406c(boolean z) {
        if (!this.f161554n.mo220885b() && !z) {
            return 0;
        }
        if (this.as == VERecordMode.DUET || this.as == VERecordMode.REACTION || this.as == VERecordMode.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(this.at)) {
            return 5;
        }
        return 1;
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: l */
    public int mo202623l(boolean z) {
        C63929ab.m250976b(f161528a, "closeWavFile...");
        if (this.f161645T != null) {
            this.f161645T.mo220842a(z);
        }
        this.bA = true;
        if (this.bz && this.f161643R != null && (this.f161643R instanceof VEListener.AbstractC63855ab)) {
            ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1021, 0, "Update segmentation time.");
        }
        return 0;
    }

    @Override // com.ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onError(int i) {
        String str = f161528a;
        C63929ab.m250980d(str, "running error: " + i);
        int i2 = -601;
        if (i == -602) {
            i2 = -602;
        } else if (i != -601) {
            i2 = 0;
        }
        if (this.f161643R instanceof VEListener.AbstractC63855ab) {
            ((VEListener.AbstractC63855ab) this.f161643R).mo120728a(i2, "");
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: b */
    public void mo221403b(final VEListener.AbstractC63866i iVar) {
        mo221392a(new Runnable() {
            /* class com.ss.android.vesdk.C63969e.RunnableC639766 */

            public void run() {
                int d = C63969e.this.mo221408d();
                VEListener.AbstractC63866i iVar = iVar;
                if (iVar != null) {
                    iVar.onDone(d);
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public synchronized int mo221371a(float f) {
        int i;
        boolean z;
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
        if (this.am == null) {
            return -108;
        }
        if (this.f161556p == 2) {
            this.f161556p = 3;
        } else if (this.f161537H == VERecordMode.KARAOKE_PURE_AUDIO && this.f161556p == 1) {
            this.f161556p = 4;
        } else {
            String str = f161528a;
            C63929ab.m250980d(str, "nativeStartRecord called in a invalid state: " + this.f161556p + "should be : " + 2);
            int i2 = this.f161556p;
            if (i2 == 3 || i2 == 4) {
                return -115;
            }
            return -105;
        }
        an.m251028a("startRecord");
        if (this.bG && this.bH) {
            VEAudioCaptureHolder.INSTANCE.startFeedPCM();
        }
        mo221401b(mo221406c(true));
        this.f161544c.mo202578b(this.f161639N, mo221406c(true), this);
        this.bs = f;
        this.f161544c.mo202540a(this.au, this.f161546e);
        if (this.am.getBitrateMode() == VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF) {
            int swCRF = this.am.getSwCRF();
            MediaRecordPresenter mediaRecordPresenter = this.f161544c;
            int ordinal = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
            if (swCRF < 12) {
                swCRF = 12;
            }
            mediaRecordPresenter.mo202593c(ordinal, swCRF);
        } else {
            this.f161544c.mo202593c(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal(), this.am.getSwQP());
        }
        float bps = (((float) this.am.getBps()) * 1.0f) / 4194304.0f;
        if (this.am.getEncodeProfile() == VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()) {
            i = 2;
        } else if (this.am.getEncodeProfile() == VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()) {
            i = 8;
        } else {
            i = 1;
        }
        this.f161544c.mo202636t(this.aM);
        if (this.aN != null) {
            if (this.aN.waterMarkBitmap == null) {
                this.f161544c.mo202574a(this.aN.images, this.aN.width, this.aN.height, this.aN.xOffset, this.aN.yOffset, this.aN.position.ordinal(), this.aN.interval, this.aN.rotation);
            } else {
                this.f161544c.mo202554a(this.aN.waterMarkBitmap, this.aN.width, this.aN.height, this.aN.xOffset, this.aN.yOffset, this.aN.position.ordinal(), this.aN.interval, this.aN.rotation);
            }
        }
        m251094a(this.ag);
        if (m251103x() && !this.bG && this.f161544c.mo202606e()) {
            mo221398a("startRecord");
            C63929ab.m250976b(f161528a, "mVEAudioCapture start: startRecord");
            this.f161641P.start(this.f161533D);
        }
        if (this.bN != null) {
            Bundle bundle = new Bundle();
            bundle.putString("record", "start_record");
            this.bN.mo221145a(bundle);
        }
        MediaRecordPresenter mediaRecordPresenter2 = this.f161544c;
        double d = (double) f;
        if (!this.am.isSupportHwEnc()) {
            z = true;
        } else {
            z = false;
        }
        int a = mediaRecordPresenter2.mo202520a(d, z, bps, 1, i, false, this.am.getDescription(), this.am.getComment());
        if (a != 0) {
            String str2 = f161528a;
            C63929ab.m250980d(str2, "nativeStartRecord error: " + a);
        }
        C60229h.m234090a(0, "te_record_start_record_ret", (long) a);
        int outputAudioDeviceType = TESystemUtils.getOutputAudioDeviceType();
        long j = (long) outputAudioDeviceType;
        C60229h.m234090a(0, "te_record_audio_device", j);
        String str3 = f161528a;
        C63929ab.m250974a(str3, "output audio device: " + outputAudioDeviceType);
        C60192a.m233969a("te_record_audio_device", j);
        synchronized (f161529k) {
            this.bt = 0;
        }
        an.m251027a();
        return a;
    }

    /* renamed from: d */
    public synchronized int mo221409d(Surface surface) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        this.bC = System.currentTimeMillis();
        if (this.f161643R != null && (this.f161643R instanceof VEListener.AbstractC63855ab)) {
            ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(1020, 0, "You can replace the Res Manager here.");
        }
        if (this.f161556p == 0) {
            mo221413h();
            int q = m251096q();
            if (q != 0) {
                String str = f161528a;
                C63929ab.m250980d(str, "nativeInitBeautyPlay error: " + q);
                return -108;
            } else if (this.af != null) {
                mo221389a(this.af);
            }
        }
        if (this.f161556p != 1) {
            String str2 = f161528a;
            C63929ab.m250980d(str2, "startRecordPreview statue error: " + this.f161556p);
            if (this.bu != surface) {
                mo221405c(surface);
                this.bu = surface;
            }
            return -105;
        }
        this.bu = surface;
        m251100u();
        this.f161544c.mo202562a(this.ak);
        this.f161544c.mo202609f(this.aw);
        this.f161544c.mo202544a(this.aJ);
        this.f161544c.mo202584b(this.aK);
        this.f161544c.mo202635s(this.aF);
        VESize videoRes = this.am.getVideoRes();
        if (this.aH.isValid() && !videoRes.equals(this.aH)) {
            this.f161544c.mo202547a(this.aH.width, this.aH.height);
            videoRes.width = this.aH.width;
            videoRes.height = this.aH.height;
        }
        if (this.as == VERecordMode.DUET) {
            this.f161544c.mo202571a(this.aq.mo220678a(), this.aq.mo220679b(), this.aq.mo220680c(), this.aq.mo220681d(), this.aq.mo220682e(), this.aq.mo220683f(), this.aq.mo220684g(), this.aq.mo220685h().ordinal());
        } else if (this.as == VERecordMode.REACTION) {
            this.f161544c.mo202551a(this.f161639N, this.ar.mo221153a(), this.ar.mo221154b());
        } else {
            MediaRecordPresenter a = this.f161544c.mo202541a(this.at);
            if (this.av == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            a.mo202542a(z2).mo202540a(this.au, 0);
        }
        this.f161544c.mo202595c(1);
        this.f161544c.mo202630o(this.f161554n.mo220887d());
        this.f161544c.mo202560a((AbstractC59398b) this);
        this.f161544c.mo202557a((RecordInvoker.OnRunningErrorCallback) this);
        this.f161544c.mo202637u(this.f161554n.mo220889f());
        this.f161544c.mo202634r(this.f161554n.mo220891h());
        this.f161544c.mo202589b(this.aL);
        this.f161544c.mo202561a((AbstractC59399c) this);
        this.f161544c.mo202597c(this.f161554n.mo220893j());
        this.f161544c.mo202601d(this.f161554n.mo220894k());
        this.f161544c.mo202549a(this.f161554n.mo220895l());
        this.f161544c.mo202605e(this.f161554n.mo220896m());
        this.f161544c.mo202610f(this.f161554n.mo220897n());
        this.f161544c.mo202612g(this.aG);
        this.f161544c.mo202585b(this.f161554n.mo220899p(), this.f161554n.mo220900q());
        MediaRecordPresenter mediaRecordPresenter = this.f161544c;
        if (this.f161554n.mo220898o() == VEPreviewSettings.VERecordContentType.RecordOriginContent.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        mediaRecordPresenter.mo202638v(z);
        this.f161544c.mo202618i(this.f161554n.mo220888e());
        if (this.f161554n.mo220903t()) {
            this.f161544c.mo202639w(true);
        }
        mo221376a(this.f161554n.mo220901r());
        if (surface != null) {
            i = this.f161544c.mo202531a(surface, Build.DEVICE);
        } else {
            int i3 = -1;
            if (this.f161640O != null) {
                i2 = this.f161640O.mo221431a();
            } else {
                i2 = -1;
            }
            if (this.f161640O != null) {
                i3 = this.f161640O.mo221433b();
            }
            i = this.f161544c.mo202607f(i2, i3);
        }
        if (i != 0) {
            String str3 = f161528a;
            C63929ab.m250980d(str3, "nativeStartPlay error: " + i);
        }
        C60229h.m234090a(0, "te_record_start_preview_ret", (long) i);
        if (this.f161647V != null) {
            VEListener.AbstractC63854aa aaVar = this.f161647V;
            aaVar.mo220831a(i, "nativeStartPlay error: " + i);
        }
        this.f161556p = 2;
        if (mo221415k()) {
            this.f161544c.mo202616h(true);
        } else {
            this.f161544c.mo202616h(this.f161566z);
            this.f161544c.mo202529a(this.f161639N, mo221406c(false), this);
        }
        synchronized (this.bx) {
            if (!this.f161543b.isEmpty()) {
                int a2 = this.f161544c.mo202526a(this.f161543b.size(), this.f161545d);
                if (a2 != 0) {
                    String str4 = f161528a;
                    C63929ab.m250980d(str4, "tryRestore ret: " + a2);
                } else {
                    this.f161546e = (long) C59404c.m230564a(this.f161543b);
                }
            }
        }
        if (this.f161554n.mo220886c()) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
            this.f161544c.mo202594c(this.bs);
        }
        return i;
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public int mo221376a(VEDisplaySettings vEDisplaySettings) {
        boolean z;
        VEDisplaySettings vEDisplaySettings2;
        int i;
        int i2 = 0;
        if (vEDisplaySettings != null) {
            z = true;
        } else {
            z = false;
        }
        if (vEDisplaySettings == null) {
            vEDisplaySettings2 = new VEDisplaySettings.C63832a().mo220676a(this.f161554n.mo220884a()).mo220677a();
        } else {
            vEDisplaySettings2 = vEDisplaySettings;
        }
        VESize g = vEDisplaySettings2.mo220665g();
        VESize h = vEDisplaySettings2.mo220666h();
        VESize i3 = vEDisplaySettings2.mo220667i();
        MediaRecordPresenter mediaRecordPresenter = this.f161544c;
        int ordinal = vEDisplaySettings2.mo220660c().ordinal();
        long e = vEDisplaySettings2.mo220663e();
        float f = vEDisplaySettings2.mo220664f();
        int d = vEDisplaySettings2.mo220661d();
        if (g == null) {
            i = 0;
        } else {
            i = g.width;
        }
        if (g != null) {
            i2 = g.height;
        }
        return mediaRecordPresenter.mo202525a(ordinal, e, f, d, i, i2, vEDisplaySettings2.mo220668j().ordinal(), vEDisplaySettings2.mo220669k(), vEDisplaySettings2.mo220658a(), vEDisplaySettings2.mo220659b(), h.width, h.height, i3.width, i3.height, z);
    }

    /* renamed from: a */
    public int mo221372a(float f, float f2) {
        this.az.mo205665a(f);
        this.az.mo205669b(f2);
        this.f161544c.mo202545a(f, f2);
        return 0;
    }

    @Override // com.ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onAccurateInfo(int i, double d) {
        switch (i) {
            case 1072:
                this.bg = d;
                break;
            case 1073:
                this.bh = d;
                break;
            case 1074:
                this.bj = d;
                break;
            case 1075:
                this.bi = d;
                break;
        }
        if (i == C64083x.f161849x || i == C64083x.f161850y || i == C64083x.f161810E) {
            m251093a(i, 0, (float) d, "");
        }
    }

    /* renamed from: a */
    public int mo221373a(int i, float f) {
        if (i == 1) {
            this.az.mo205669b(f);
        } else if (i == 2) {
            this.az.mo205665a(f);
        } else if (i == 4) {
            this.aC.mo205697a(f);
        } else if (i != 5) {
            switch (i) {
                case 17:
                    this.aD.mo205673a(f);
                    break;
                case 18:
                    this.aD.mo205676b(f);
                    break;
                case 19:
                    this.aD.mo205678c(f);
                    break;
                case 20:
                    this.aD.mo205680d(f);
                    break;
            }
        } else {
            this.aC.mo205701b(f);
        }
        this.f161544c.mo202521a(i, f);
        return 0;
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: c */
    public int mo202591c(byte[] bArr, int i) {
        String str = f161528a;
        C63929ab.m250976b(str, "addPCMData...");
        if (this.f161534E != -1) {
            if (!(this.an == null || !this.aR || this.ah == null)) {
                this.ah.mo220838a(TEVideoUtils.getAudioVolume(bArr, this.f161534E, this.f161535F, i));
            }
            if (!(this.an == null || this.f175464ai == null)) {
                String a = this.f175464ai.mo220833a();
                if (TextUtils.isEmpty(a)) {
                    C63929ab.m250980d(str, "modePath is empty");
                    this.f175464ai.mo220834a(-3.0d);
                } else {
                    if (this.aj == -1) {
                        C63929ab.m250974a(str, "load model");
                        this.aj = TEVideoUtils.loadModel(this.f161534E, a);
                    }
                    if (this.aj != -1) {
                        this.f175464ai.mo220834a(TEVideoUtils.voiceActivityDetection(bArr, this.aj, this.f161535F, i));
                    }
                    if (this.bJ) {
                        this.bJ = false;
                        m251101v();
                    }
                }
            }
        }
        if (this.f161645T != null) {
            this.f161645T.mo220843a(Arrays.copyOf(bArr, i), i);
        }
        return 0;
    }

    /* renamed from: a */
    public int mo221375a(int i, String str) {
        this.az.mo205666a(i);
        this.az.mo205667a(str);
        this.f161544c.mo202587b(i, str);
        return 0;
    }

    @Override // com.ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onInfo(int i, int i2) {
        String str;
        if (i == 1051) {
            this.bf = (float) i2;
            String str2 = f161528a;
            C63929ab.m250976b(str2, "onInfo: " + i + "; INFO_PREVIEW_DROP_FPS:" + this.bf);
        } else if (i == 1052) {
            this.aY = (float) i2;
            String str3 = f161528a;
            C63929ab.m250976b(str3, "onInfo: " + i + "; INFO_RECORD_RENDER_DROP_FPS:" + this.aY);
        } else if (i != 1070) {
            switch (i) {
                case 1040:
                    this.aU = i2;
                    break;
                case 1041:
                    this.aV = i2;
                    break;
                case 1042:
                    if (i2 != 0) {
                        this.aX = 1000.0f / ((float) i2);
                    }
                    String str4 = f161528a;
                    C63929ab.m250976b(str4, "onInfo: " + i + "; TET_RECORD_RENDER_FPS:" + this.aX);
                    break;
                case 1043:
                    this.aW = i2;
                    break;
                case 1044:
                    this.bb = i2;
                    break;
                case 1045:
                    this.bc = i2;
                    break;
                case 1046:
                    this.bd = i2;
                    break;
                case 1047:
                    if (i2 != 0) {
                        this.be = 1000.0f / ((float) i2);
                        break;
                    }
                    break;
                case 1048:
                    this.aZ = i2;
                    break;
                case 1049:
                    this.ba = ((float) i2) / 1000.0f;
                    break;
            }
        } else {
            this.f161563w.open();
            C63929ab.m250974a(f161528a, "turn to off-screen render");
        }
        String str5 = f161528a;
        C63929ab.m250976b(str5, "onInfo: " + i + "ext:" + i2);
        if (i == 1030) {
            str = "shotScreen...";
        } else if (i == 1050) {
            str = String.valueOf(System.currentTimeMillis());
        } else {
            str = "";
        }
        if (this.f161643R instanceof VEListener.AbstractC63855ab) {
            ((VEListener.AbstractC63855ab) this.f161643R).mo120727a(i, i2, str);
        }
    }

    /* renamed from: b */
    public int mo221400b(String str, float f, float f2) {
        this.aD.mo205674a(str);
        this.aD.mo205673a(f);
        this.aD.mo205676b(f2);
        this.f161544c.mo202580b(C64080c.m251465a(str), f, f2);
        return 0;
    }

    @Override // org.p3508c.p3509a.AbstractC70000a
    /* renamed from: a */
    public int mo202522a(int i, int i2, double d) {
        C63929ab.m250976b(f161528a, "initWavFile...");
        this.f161534E = i;
        this.f161535F = i2;
        if (this.f161645T == null) {
            return 0;
        }
        this.f161645T.mo220840a(2, i, i2);
        return 0;
    }

    public C63969e(Context context, AbstractC64063e eVar, C63988b bVar) {
        super(context, eVar, bVar);
        VESize vESize = new VESize(1280, 720);
        this.bo = vESize;
        this.f161549h = vESize;
        this.f161550i = -1;
        this.f161553m = 0;
        this.f161555o = null;
        this.f161556p = 0;
        this.bv = false;
        this.f161557q = new C64022h();
        this.bw = Executors.newSingleThreadExecutor();
        this.f161558r = new C63922a<>();
        this.bx = new Object();
        this.by = null;
        this.f161561u = 3;
        this.f161562v = false;
        this.f161563w = new ConditionVariable();
        this.bz = false;
        this.bA = false;
        this.bB = false;
        this.f161564x = true;
        this.f161565y = new C63952b();
        this.bC = 0;
        this.bD = false;
        this.bE = false;
        this.f161566z = false;
        this.f161530A = false;
        this.bF = false;
        this.bG = false;
        this.bH = false;
        this.bI = new AbstractC63946e() {
            /* class com.ss.android.vesdk.C63969e.C639701 */

            @Override // com.ss.android.vesdk.audio.AbstractC63946e
            public void onError(int i, int i2, String str) {
            }

            @Override // com.ss.android.vesdk.audio.AbstractC63946e
            public void onReceive(C63948g gVar) {
                if (gVar.mo221301a() instanceof C63948g.C63949a) {
                    C63969e.this.f161544c.mo202581b(((C63948g.C63949a) gVar.mo221301a()).mo221303a(), gVar.mo221302b());
                } else if (C63969e.this.f161538I != null) {
                    C63969e.this.f161538I.onReceive(gVar);
                }
            }

            @Override // com.ss.android.vesdk.audio.AbstractC63946e
            public void onInfo(int i, int i2, double d, Object obj) {
                if (i != C64083x.f161812G) {
                    return;
                }
                if (i2 == 0) {
                    C64027k kVar = (C64027k) obj;
                    C63969e.this.f161544c.mo202523a(kVar.mo221692b(), kVar.mo221691a(), C63969e.this.an.mo220488a(), C63969e.this.an.mo220490c(), C63969e.this.an.mo220489b());
                    String str = C63969e.f161528a;
                    C63929ab.m250974a(str, "mVEAudioCapture inited: channelCount:" + kVar.mo221691a() + " sampleHz:" + kVar.mo221692b() + " encode sample rate:" + C63969e.this.an.mo220488a() + " encode channel count:" + C63969e.this.an.mo220490c());
                    if (kVar.mo221695e() == 1 && C63969e.this.f161538I != null) {
                        C63969e.this.f161538I.onInfo(i, i2, d, obj);
                    }
                    C63969e.this.f161536G = 2;
                    return;
                }
                String str2 = C63969e.f161528a;
                C63929ab.m250974a(str2, "initAudio error:" + i2);
                C63969e.this.f161536G = 0;
            }
        };
        this.bJ = false;
        this.bK = false;
        this.bL = -16;
        this.f161533D = null;
        this.f161534E = -1;
        this.f161535F = -1;
        this.bM = new C64027k.C64029a().mo221701a();
        this.f161536G = 0;
        this.f161537H = VERecordMode.DEFAULT;
        this.bN = null;
        this.f161540K = new LandMarkFrame();
        this.f161541L = aj.m251022a();
        this.f161542M = new C63961b.AbstractC63963b() {
            /* class com.ss.android.vesdk.C63969e.AnonymousClass10 */

            /* renamed from: b */
            private float f161569b = -1.0f;

            @Override // com.ss.android.vesdk.p3189c.C63961b.AbstractC63962a, com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
            /* renamed from: a */
            public void mo206794a(SurfaceTexture surfaceTexture) {
                C63969e.this.f161544c.mo202555a(surfaceTexture);
                C63969e.this.f161557q.mo221680a(surfaceTexture);
            }

            @Override // com.ss.android.vesdk.p3189c.C63961b.AbstractC63962a
            /* renamed from: a */
            public void mo221329a(TEFrameSizei tEFrameSizei) {
                C63969e.this.f161544c.mo202604e(tEFrameSizei.f150716a, tEFrameSizei.f150717b);
            }

            @Override // com.ss.android.vesdk.p3189c.C63961b.AbstractC63962a, com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
            /* renamed from: a */
            public void mo206795a(TECameraFrame tECameraFrame) {
                long currentTimeMillis = System.currentTimeMillis();
                if (C63969e.this.f161556p == 0) {
                    C63929ab.m250978c(C63969e.f161528a, "Frame captured in idle status!");
                    return;
                }
                int i = 1;
                if (!C63969e.this.f161530A) {
                    this.f161569b = ((Float) VEConfigCenter.m250617a().mo220632a("ve_recorder_fps_downgrade", Float.valueOf(-1.0f))).floatValue();
                    String str = C63969e.f161528a;
                    C63929ab.m250974a(str, "camera texture size : [ " + C63969e.this.f161548g.width + "," + C63969e.this.f161548g.height + "]");
                    C63969e.this.f161530A = true;
                }
                if (!(C63969e.this.f161548g.width == tECameraFrame.mo206375f().f150716a && C63969e.this.f161548g.height == tECameraFrame.mo206375f().f150717b)) {
                    C63969e.this.f161548g.width = tECameraFrame.mo206375f().f150716a;
                    C63969e.this.f161548g.height = tECameraFrame.mo206375f().f150717b;
                }
                if (!(C63969e.this.f161553m == tECameraFrame.mo206379j() && C63969e.this.f161550i == tECameraFrame.mo206373d())) {
                    synchronized (C63969e.f161529k) {
                        C63969e.this.f161553m = tECameraFrame.mo206379j();
                        C63969e.this.f161550i = tECameraFrame.mo206373d();
                        C63969e.this.f161551j = true;
                    }
                }
                TECameraFrame.ETEPixelFormat g = tECameraFrame.mo206376g();
                if (g == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES || g == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
                    if (C63969e.this.f161541L.mo221172d()) {
                        C63969e.this.f161540K.setInfo(C63969e.this.f161541L.mo221170b(), C63969e.this.f161541L.mo221171c(), C63969e.this.f161541L.mo221173e());
                        C63969e.this.f161544c.mo202640x(true);
                        C63969e.this.f161544c.mo202567a(C63969e.this.f161540K);
                    } else {
                        C63969e.this.f161544c.mo202640x(false);
                    }
                    if (C63969e.this.f161556p == 3) {
                        C63969e.this.f161565y.mo221306a(C63969e.this.f161557q.mo221683d());
                    }
                    C63969e.this.f161544c.mo202528a(tECameraFrame.mo206371b(), tECameraFrame.mo206374e(), C63969e.this.f161559s.f161522g);
                } else if (tECameraFrame.mo206377h() == 3) {
                    ImageFrame imageFrame = new ImageFrame(C64079b.m251464a(tECameraFrame.mo206372c()), -2, tECameraFrame.mo206375f().f150716a, tECameraFrame.mo206375f().f150717b);
                    if (C63969e.this.al == null || C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                        C63969e.this.f161544c.mo202519a((double) (tECameraFrame.mo206378i() / 1000));
                        C63969e.this.f161544c.mo202534a(imageFrame, C63969e.this.f161559s.f161522g);
                    } else if (C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        C63969e.this.f161544c.mo202533a(imageFrame, C63969e.this.f161557q.mo221684e(), C63969e.this.f161559s.f161522g);
                    }
                } else if (g == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21 || g == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG) {
                    if (g == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21) {
                        i = -3;
                    }
                    ImageFrame imageFrame2 = new ImageFrame(tECameraFrame.mo206370a(), i, tECameraFrame.mo206375f().f150716a, tECameraFrame.mo206375f().f150717b);
                    if (C63969e.this.al == null || C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                        C63969e.this.f161544c.mo202519a((double) (tECameraFrame.mo206378i() / 1000));
                        C63969e.this.f161544c.mo202534a(imageFrame2, C63969e.this.f161559s.f161522g);
                    } else if (C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        C63969e.this.f161544c.mo202533a(imageFrame2, C63969e.this.f161557q.mo221684e(), C63969e.this.f161559s.f161522g);
                    }
                } else {
                    C63929ab.m250980d(C63969e.f161528a, "Not support now!!");
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                float f = this.f161569b;
                if (f > 0.001f) {
                    long j = (long) (1000.0d / ((double) f));
                    if (j > currentTimeMillis2) {
                        long j2 = j - currentTimeMillis2;
                        try {
                            Thread.sleep(j2);
                            String str2 = C63969e.f161528a;
                            C63929ab.m250976b(str2, "FrameSleep: " + j2 + "ms");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        this.bO = new C59376a.AbstractC59378b() {
            /* class com.ss.android.vesdk.C63969e.AnonymousClass11 */

            @Override // com.ss.android.medialib.p2999b.C59376a.AbstractC59378b
            /* renamed from: b */
            public void mo202212b() {
                C63929ab.m250981e(C63969e.f161528a, "onOpenGLDestroy");
                C63969e.this.f161557q.mo221681b();
                C63969e.this.f161558r.mo221138b(C63969e.this.f161559s);
                if (C63969e.this.f161531B != null) {
                    C63969e.this.f161531B.mo206744c();
                    C63969e.this.f161531B = null;
                }
                VEListener.AbstractC63856ac acVar = C63969e.this.f161643R;
                if (acVar instanceof VEListener.AbstractC63855ab) {
                    ((VEListener.AbstractC63855ab) acVar).mo120727a(CommonCode.StatusCode.API_CLIENT_EXPIRED, 0, "Render Env Destroyed.");
                }
            }

            @Override // com.ss.android.medialib.p2999b.C59376a.AbstractC59378b
            /* renamed from: c */
            public int mo202213c() {
                boolean z;
                float f;
                int i;
                if (C63969e.this.f161551j) {
                    synchronized (C63969e.f161529k) {
                        if (C63969e.this.f161548g.width > 0 && C63969e.this.f161548g.height > 0) {
                            if (!C63969e.this.f161559s.mo221328h()) {
                                f = (float) C63969e.this.f161548g.width;
                                i = C63969e.this.f161548g.height;
                            } else {
                                f = (float) C63969e.this.f161548g.height;
                                i = C63969e.this.f161548g.width;
                            }
                            C63969e.this.f161544c.mo202546a(f / ((float) i), C63969e.this.f161548g.width, C63969e.this.f161548g.height);
                        }
                        boolean z2 = true;
                        if (C63969e.this.f161553m == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (C63969e.this.f161553m != 2) {
                            z2 = false;
                        }
                        C63969e.this.f161544c.mo202548a(C63969e.this.f161550i, z, z2);
                        C63969e.this.f161551j = false;
                    }
                }
                if (C63969e.this.al == null || C63969e.this.al.mo220551p() != VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                    try {
                        C63969e.this.f161557q.mo221682c();
                        if (C63969e.this.f161552l) {
                            return IByteRtcError.BRERR_INVALID_TOKEN;
                        }
                        if (C63969e.this.f161557q.mo221685f() != null) {
                            C63969e.this.f161544c.mo202519a(C63969e.this.f161557q.mo221683d());
                        }
                        return 0;
                    } catch (Exception e) {
                        String str = C63969e.f161528a;
                        C63929ab.m250980d(str, "onOpenGLRunning error msg: " + e.getMessage() + ", is can retry = " + C63969e.this.f161557q.mo221686g());
                        if (C63969e.this.f161557q.mo221686g()) {
                            try {
                                C63969e.this.f161557q.mo221685f().detachFromGLContext();
                                C63969e.this.f161557q.mo221682c();
                            } catch (Exception unused) {
                                String str2 = C63969e.f161528a;
                                C63929ab.m250980d(str2, "onOpenGLRunning error msg: " + e.getMessage() + ", retry failed!!!");
                            }
                        }
                    }
                } else {
                    if (C63969e.this.al.mo220537c() == VECameraSettings.CAMERA_TYPE.TYPE1) {
                        try {
                            if (C63969e.this.al.mo220513A().getBoolean("forceRunUpdateTexImg", false)) {
                                C63969e.this.f161557q.mo221682c();
                            }
                        } catch (Exception e2) {
                            String str3 = C63969e.f161528a;
                            C63929ab.m250980d(str3, "onOpenGLRunning error: " + e2.getMessage());
                        }
                    }
                    if (C63969e.this.f161552l) {
                        return IByteRtcError.BRERR_INVALID_TOKEN;
                    }
                    return 0;
                }
            }

            @Override // com.ss.android.medialib.p2999b.C59376a.AbstractC59378b
            /* renamed from: a */
            public void mo202211a() {
                int i;
                C63929ab.m250981e(C63969e.f161528a, "onOpenGLCreate");
                C63969e.this.f161558r = new C63922a<>();
                C63969e.this.f161557q.mo221679a();
                C63969e.this.f161544c.mo202555a(C63969e.this.f161557q.mo221685f());
                if (C63969e.this.al != null && C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.TWO_SURFACES && C63969e.this.al.mo220537c() != VECameraSettings.CAMERA_TYPE.TYPE1) {
                    if (C63969e.this.f161531B == null) {
                        C63969e.this.f161531B = new C60360a();
                        C63969e.this.f161531B.mo206745d();
                        C63969e.this.mo221417m();
                        if (C63969e.this.f161643R != null && (C63969e.this.f161643R instanceof VEListener.AbstractC63855ab)) {
                            if (C63969e.this.f161532C == null) {
                                C63969e.this.f161532C = new C60360a.AbstractC60361a() {
                                    /* class com.ss.android.vesdk.C63969e.AnonymousClass11.C639711 */

                                    @Override // com.ss.android.ttvecamera.p3037f.C60360a.AbstractC60361a
                                    /* renamed from: a */
                                    public void mo206746a(int i) {
                                        ((VEListener.AbstractC63855ab) C63969e.this.f161643R).mo120728a(i, " ");
                                    }
                                };
                            }
                            C63969e.this.f161531B.mo206741a(C63969e.this.f161532C);
                        }
                    }
                    C63969e eVar = C63969e.this;
                    eVar.f161559s = new C63964c(new TEFrameSizei(eVar.f161549h.width, C63969e.this.f161549h.height), C63969e.this.f161542M, true, C63969e.this.f161557q.mo221684e(), C63969e.this.f161557q.mo221685f(), C63969e.this.f161531B.mo206745d());
                } else if (C63969e.this.al == null || C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE) {
                    C63969e eVar2 = C63969e.this;
                    eVar2.f161559s = new C63965d(new TEFrameSizei(eVar2.f161549h.width, C63969e.this.f161549h.height), C63969e.this.f161542M, true, C63969e.this.f161557q.mo221684e(), C63969e.this.f161557q.mo221685f());
                } else if (C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME && C63969e.this.al.mo220537c() != VECameraSettings.CAMERA_TYPE.TYPE1) {
                    C63969e.this.al.mo220535a(VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE);
                    C63969e eVar3 = C63969e.this;
                    eVar3.f161559s = new C63965d(new TEFrameSizei(eVar3.f161549h.width, C63969e.this.f161549h.height), C63969e.this.f161542M, true, C63969e.this.f161557q.mo221684e(), C63969e.this.f161557q.mo221685f());
                } else if (C63969e.this.al.mo220551p() != VECameraSettings.CAMERA_OUTPUT_MODE.FRAME || C63969e.this.al.mo220537c() == VECameraSettings.CAMERA_TYPE.TYPE1) {
                    C63969e eVar4 = C63969e.this;
                    TEFrameSizei tEFrameSizei = new TEFrameSizei(eVar4.f161549h.width, C63969e.this.f161549h.height);
                    C63961b.AbstractC63963b bVar = C63969e.this.f161542M;
                    SurfaceTexture f = C63969e.this.f161557q.mo221685f();
                    if (C63969e.this.al.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    eVar4.f161559s = new C63960a(tEFrameSizei, bVar, true, f, i);
                    if (C63969e.this.al.mo220537c() == VECameraSettings.CAMERA_TYPE.TYPE1) {
                        C63969e.this.f161544c.mo202611g(0);
                    } else {
                        C63969e.this.f161544c.mo202611g(1);
                    }
                } else {
                    C63969e.this.al.mo220535a(VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE);
                    C63969e eVar5 = C63969e.this;
                    eVar5.f161559s = new C63965d(new TEFrameSizei(eVar5.f161549h.width, C63969e.this.f161549h.height), C63969e.this.f161542M, true, C63969e.this.f161557q.mo221684e(), C63969e.this.f161557q.mo221685f());
                }
                C63969e.this.f161558r.mo221136a(C63969e.this.f161559s);
                if (C63969e.this.f161547f != null) {
                    C63969e.this.f161547f.mo221144a(C63969e.this.f161558r);
                }
                if (C63969e.this.f161643R != null && (C63969e.this.f161643R instanceof VEListener.AbstractC63855ab)) {
                    ((VEListener.AbstractC63855ab) C63969e.this.f161643R).mo120727a(1000, 0, "Render Env Created.");
                }
            }
        };
        if (this.f161640O != null) {
            this.f161640O.mo221432a(this);
        }
        MediaRecordPresenter n = mo221676n();
        this.f161544c = n;
        n.mo202563a(new MediaRecordPresenter.AbstractC59412a() {
            /* class com.ss.android.vesdk.C63969e.C639799 */

            @Override // com.ss.android.medialib.presenter.MediaRecordPresenter.AbstractC59412a
            /* renamed from: a */
            public void mo202645a(int i, int i2) {
                C63969e.this.f161534E = i;
                C63969e.this.f161535F = i2;
            }
        });
        this.f161544c.mo202558a(this.bO);
        C60229h.m234095a("iesve_use_new_record", 1L);
        this.bE = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_stop_preview_optimize", (Object) false)).booleanValue();
        this.f161539J = new C63954b(this.f161544c, this);
        this.bm = new TESystemResManager();
        this.bl = mo221677o();
        if (this.bl) {
            this.bm.mo206925a(new C60432b());
            this.bm.mo206923a(context);
        }
    }

    /* renamed from: a */
    private void m251093a(int i, int i2, float f, String str) {
        AbstractC64045p pVar = this.br;
        if (pVar != null) {
            pVar.mo196111a(i, i2, f, str);
        }
    }

    @Override // com.ss.android.vesdk.AbstractC64021g
    /* renamed from: a */
    public int mo221374a(int i, int i2, final boolean z, boolean z2, final VERecorder.AbstractC63893b bVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass14 r6 = new MediaRecordPresenter.AbstractC59415d() {
            /* class com.ss.android.vesdk.C63969e.AnonymousClass14 */

            @Override // com.ss.android.medialib.presenter.MediaRecordPresenter.AbstractC59415d
            /* renamed from: a */
            public void mo202649a(Bitmap bitmap, int i) {
                C60229h.m234090a(0, "te_record_shot_screen_time", System.currentTimeMillis() - currentTimeMillis);
                if ((i != 0 || z) && C63969e.this.f161547f != null) {
                    C63969e.this.f161547f.mo221142c();
                }
                C63969e eVar = C63969e.this;
                eVar.mo221397a(eVar.f161555o.mo220655b(), bitmap, "TECam_shotScreen_0");
                VERecorder.AbstractC63893b bVar = bVar;
                if (bVar != null) {
                    bVar.mo120731a(bitmap, i);
                }
            }
        };
        return this.f161544c.mo202538a(new int[]{i, i2}, z2, (MediaRecordPresenter.AbstractC59415d) r6, false);
    }
}
