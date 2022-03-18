package com.ss.android.vesdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ttve.model.C60210a;
import com.ss.android.ttve.model.C60211b;
import com.ss.android.ttve.model.C60212c;
import com.ss.android.ttve.model.C60213d;
import com.ss.android.ttvecamera.systemresmanager.TESystemResManager;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.p3187a.AbstractC63923a;
import com.ss.android.vesdk.p3187a.AbstractC63924b;
import com.ss.android.vesdk.p3192f.C63988b;
import com.ss.android.vesdk.runtime.AbstractC64063e;

/* renamed from: com.ss.android.vesdk.g */
public abstract class AbstractC64021g {

    /* renamed from: N */
    Context f161639N;

    /* renamed from: O */
    C63988b f161640O;

    /* renamed from: P */
    C64025j f161641P;

    /* renamed from: Q */
    AbstractC64063e f161642Q;

    /* renamed from: R */
    VEListener.AbstractC63856ac f161643R;

    /* renamed from: S */
    VEListener.AbstractC63867j f161644S;

    /* renamed from: T */
    VEListener.AbstractC63864g f161645T;

    /* renamed from: U */
    VERecorder.AbstractC63896d f161646U;

    /* renamed from: V */
    VEListener.AbstractC63854aa f161647V;

    /* renamed from: W */
    VERecorder.AbstractC63899g f161648W;

    /* renamed from: X */
    VERecorder.AbstractC63898f f161649X;

    /* renamed from: Y */
    VERecorder.AbstractC63900h f161650Y;

    /* renamed from: Z */
    MessageCenter.AbstractC2081a f161651Z;
    VEEffectFilterParam aA = new VEEffectFilterParam();
    C60212c aB = new C60212c();
    C60213d aC = new C60213d();
    C60211b aD = new C60211b();
    VEVolumeParam aE = new VEVolumeParam();
    boolean aF;
    boolean aG = false;
    VESize aH = new VESize(0, 0);
    VESize aI = new VESize(1280, 720);
    float aJ = 0.125f;
    float aK = 0.125f;
    boolean aL = false;
    boolean aM;
    VEWatermarkParam aN;
    boolean aO = false;
    boolean aP = false;
    String aQ = null;
    boolean aR = false;
    protected AssetManager aS = null;
    protected boolean aT = false;
    protected int aU = 0;
    protected int aV = 0;
    protected int aW = 0;
    protected float aX = BitmapDescriptorFactory.HUE_RED;
    protected float aY = BitmapDescriptorFactory.HUE_RED;
    protected int aZ = 0;
    VERecorder.AbstractC63892a aa;
    VERecorder.AbstractC63897e ab;
    VERecorder.AbstractC63894c ac;
    VERecorder.AbstractC63904l ad;
    C63922a<VERecorder.AbstractC63905m> ae = new C63922a<>();
    VERecorder.AbstractC63901i af;
    VEListener.AbstractC63862e ag;
    VEListener.AbstractC63863f ah;

    /* renamed from: ai  reason: collision with root package name */
    VEListener.AbstractC63858ae f175464ai;
    long aj = -1;
    IStickerRequestCallback ak;
    VECameraSettings al;
    VEVideoEncodeSettings am;
    VEAudioEncodeSettings an;
    String ao;
    boolean ap;
    VEDuetSettings aq;
    C63935af ar;
    VERecordMode as = VERecordMode.DEFAULT;
    String at;
    long au;
    int av;
    int aw = VEPreviewRadio.RADIO_FULL.ordinal();
    VESize ax = null;
    boolean ay = false;
    C60210a az = new C60210a();
    protected float ba = BitmapDescriptorFactory.HUE_RED;
    protected int bb = 0;
    protected int bc = 0;
    protected int bd = 0;
    protected float be = BitmapDescriptorFactory.HUE_RED;
    protected float bf = BitmapDescriptorFactory.HUE_RED;
    protected double bg = 0.0d;
    protected double bh = 0.0d;
    protected double bi = 0.0d;
    protected double bj = 0.0d;
    protected boolean bk = false;
    protected boolean bl = false;
    protected TESystemResManager bm;

    /* renamed from: a */
    public abstract int mo221374a(int i, int i2, boolean z, boolean z2, VERecorder.AbstractC63893b bVar);

    /* renamed from: a */
    public int mo221376a(VEDisplaySettings vEDisplaySettings) {
        return 0;
    }

    /* renamed from: a */
    public abstract void mo221396a(boolean z, long j);

    /* renamed from: b */
    public int mo221399b() {
        return 0;
    }

    /* renamed from: e */
    public void mo221410e() {
    }

    /* renamed from: l */
    public abstract EnigmaResult mo221416l();

    /* renamed from: a */
    public void mo221390a(AbstractC63923a aVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: a */
    public void mo221387a(VERecorder.AbstractC63894c cVar) {
        this.ac = cVar;
    }

    /* renamed from: a */
    public void mo221391a(AbstractC63924b bVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo221389a(VERecorder.AbstractC63901i iVar) {
        this.af = iVar;
    }

    /* renamed from: a */
    public void mo221388a(VERecorder.AbstractC63899g gVar) {
        this.f161648W = null;
    }

    /* renamed from: c */
    public String[] mo221407c() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public MediaRecordPresenter mo221676n() {
        return new MediaRecordPresenter();
    }

    /* renamed from: o */
    public boolean mo221677o() {
        return ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_vboost", (Object) false)).booleanValue();
    }

    /* renamed from: g */
    public void mo221412g() {
        this.f161644S = null;
        this.f161646U = null;
        this.f161647V = null;
        this.f161643R = null;
        this.f161645T = null;
        this.ac = null;
        this.f161648W = null;
        this.f161649X = null;
        this.f161650Y = null;
        this.aa = null;
        this.f161651Z = null;
        this.ab = null;
        this.ad = null;
        this.af = null;
        this.ag = null;
        this.ah = null;
        this.f161639N = null;
        this.f161640O = null;
    }

    /* renamed from: p */
    public int mo221678p() {
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("ve_vboost_timeout");
        if (a == null || !(a.mo220637a() instanceof Integer)) {
            return 50;
        }
        return ((Integer) a.mo220637a()).intValue();
    }

    /* renamed from: a */
    public int mo221371a(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: b */
    public void mo221403b(VEListener.AbstractC63866i iVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: b */
    public void mo221404b(boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo221378a(VEEffectFilterParam vEEffectFilterParam) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ JSONException -> 0x0069 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo221675b(com.ss.android.vesdk.filterparam.VEEffectFilterParam r7) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.AbstractC64021g.mo221675b(com.ss.android.vesdk.filterparam.VEEffectFilterParam):int");
    }

    /* renamed from: a */
    public void mo221674a(VEListener.AbstractC63856ac acVar) {
        this.f161643R = acVar;
    }

    /* renamed from: a */
    public void mo221385a(VEListener.AbstractC63866i iVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo221381a(float f, VEListener.AbstractC63866i iVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo221384a(Surface surface, VEListener.AbstractC63866i iVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo221386a(VEListener.AbstractC63866i iVar, boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public AbstractC64021g(Context context, AbstractC64063e eVar, C63988b bVar) {
        this.f161639N = context;
        this.f161642Q = eVar;
        this.f161640O = bVar;
    }

    /* renamed from: a */
    public int mo221377a(AbstractC63923a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, String str2, boolean z) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }
}
