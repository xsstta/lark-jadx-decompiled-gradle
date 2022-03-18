package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.bpea.basics.PrivacyCert;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.i */
public abstract class AbstractC60396i {

    /* renamed from: A */
    protected Map<String, Bundle> f150953A = new HashMap();

    /* renamed from: B */
    protected Map<Integer, Bundle> f150954B = new HashMap();

    /* renamed from: C */
    protected PrivacyCert f150955C = null;

    /* renamed from: a */
    private AtomicBoolean f150956a = new AtomicBoolean(false);

    /* renamed from: n */
    public boolean f150957n;

    /* renamed from: o */
    protected TECameraSettings f150958o;

    /* renamed from: p */
    protected boolean f150959p;

    /* renamed from: q */
    protected AbstractC60397a f150960q;

    /* renamed from: r */
    protected Handler f150961r;

    /* renamed from: s */
    protected Context f150962s;

    /* renamed from: t */
    protected C60375c f150963t;

    /* renamed from: u */
    protected int f150964u;

    /* renamed from: v */
    protected int f150965v;

    /* renamed from: w */
    protected int f150966w = -1;

    /* renamed from: x */
    protected float f150967x;

    /* renamed from: y */
    protected int f150968y;

    /* renamed from: z */
    protected AbstractC60399c f150969z;

    /* renamed from: com.ss.android.ttvecamera.i$a */
    public interface AbstractC60397a {
        /* renamed from: a */
        void mo206497a(int i, int i2, int i3, String str, Object obj);

        /* renamed from: a */
        void mo206498a(int i, int i2, AbstractC60396i iVar, Object obj);

        /* renamed from: a */
        void mo206499a(int i, int i2, String str, Object obj);

        /* renamed from: a */
        void mo206500a(int i, AbstractC60396i iVar, Object obj);

        /* renamed from: b */
        void mo206501b(int i, int i2, int i3, String str, Object obj);

        /* renamed from: b */
        void mo206502b(int i, int i2, String str, Object obj);

        /* renamed from: c */
        void mo206503c(int i, int i2, int i3, String str, Object obj);

        /* renamed from: c */
        void mo206504c(int i, int i2, String str, Object obj);

        /* renamed from: d */
        void mo206505d(int i, int i2, int i3, String str, Object obj);
    }

    /* renamed from: com.ss.android.ttvecamera.i$b */
    public interface AbstractC60398b {
    }

    /* renamed from: com.ss.android.ttvecamera.i$c */
    public interface AbstractC60399c {
        /* renamed from: a */
        TEFrameSizei mo206508a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* renamed from: com.ss.android.ttvecamera.i$d */
    public interface AbstractC60400d {
    }

    /* renamed from: B */
    public int mo206748B() {
        return -1;
    }

    /* renamed from: L */
    public void mo206838L() {
    }

    /* renamed from: T */
    public void mo206846T() {
        this.f150968y = 0;
    }

    /* renamed from: a */
    public abstract TEFrameSizei mo206639a(float f, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract void mo206640a();

    /* renamed from: a */
    public void mo206754a(float f) {
    }

    /* renamed from: a */
    public abstract void mo206641a(float f, TECameraSettings.AbstractC60306m mVar);

    /* renamed from: a */
    public void mo206643a(int i, int i2) {
    }

    /* renamed from: a */
    public abstract void mo206644a(int i, int i2, TECameraSettings.AbstractC60302i iVar);

    /* renamed from: a */
    public void mo206849a(int i, AbstractC60398b bVar) {
    }

    /* renamed from: a */
    public void mo206755a(long j) {
    }

    /* renamed from: a */
    public void mo206645a(Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo206647a(TECameraSettings.AbstractC60302i iVar);

    /* renamed from: a */
    public abstract void mo206648a(TECameraSettings.AbstractC60304k kVar);

    /* renamed from: a */
    public abstract void mo206649a(TECameraSettings.AbstractC60306m mVar);

    /* renamed from: a */
    public abstract void mo206650a(TECameraSettings.AbstractC60306m mVar, boolean z);

    /* renamed from: a */
    public void mo206852a(AbstractC60400d dVar) {
    }

    /* renamed from: a */
    public abstract void mo206651a(C60420o oVar);

    /* renamed from: a */
    public abstract void mo206652a(boolean z);

    /* renamed from: a */
    public abstract void mo206653a(boolean z, String str);

    /* renamed from: b */
    public abstract void mo206654b();

    /* renamed from: b */
    public void mo206756b(float f) {
    }

    /* renamed from: b */
    public abstract void mo206655b(float f, TECameraSettings.AbstractC60306m mVar);

    /* renamed from: b */
    public abstract void mo206656b(int i);

    /* renamed from: b */
    public void mo206658b(boolean z) {
    }

    /* renamed from: c */
    public void mo206659c() {
    }

    /* renamed from: c */
    public abstract void mo206660c(int i);

    /* renamed from: c */
    public abstract void mo206661c(boolean z);

    /* renamed from: d */
    public void mo206662d() {
    }

    /* renamed from: d */
    public abstract void mo206663d(int i);

    /* renamed from: e */
    public abstract int mo206664e();

    /* renamed from: f */
    public void mo206760f(int i) {
    }

    /* renamed from: f */
    public int[] mo206665f() {
        return null;
    }

    /* renamed from: g */
    public int[] mo206666g() {
        return null;
    }

    /* renamed from: h */
    public abstract int mo206667h();

    /* renamed from: i */
    public int mo206668i() {
        return -1;
    }

    /* renamed from: k */
    public abstract float[] mo206670k();

    /* renamed from: l */
    public abstract void mo206671l();

    /* renamed from: m */
    public abstract void mo206672m();

    /* renamed from: o */
    public abstract boolean mo206674o();

    /* renamed from: p */
    public boolean mo206675p() {
        return false;
    }

    /* renamed from: q */
    public abstract boolean mo206676q();

    /* renamed from: r */
    public abstract boolean mo206677r();

    /* renamed from: t */
    public int mo206762t() {
        return -1;
    }

    /* renamed from: u */
    public int mo206763u() {
        return -1;
    }

    /* renamed from: z */
    public float mo206767z() {
        return -1.0f;
    }

    /* renamed from: H */
    public TECameraSettings mo206834H() {
        return this.f150958o;
    }

    /* renamed from: I */
    public AbstractC60397a mo206835I() {
        return this.f150960q;
    }

    /* renamed from: J */
    public C60375c mo206836J() {
        return this.f150963t;
    }

    /* renamed from: K */
    public Map<String, Bundle> mo206837K() {
        return this.f150953A;
    }

    /* renamed from: N */
    public int mo206840N() {
        return this.f150964u;
    }

    /* renamed from: O */
    public Handler mo206841O() {
        return this.f150961r;
    }

    /* renamed from: R */
    public int mo206844R() {
        return this.f150968y;
    }

    /* renamed from: a */
    public void mo206851a(C60375c cVar) {
        this.f150963t = cVar;
    }

    /* renamed from: a */
    public void mo206646a(PrivacyCert privacyCert) {
        C60427s.m234839a("TECameraBase", "force close camera");
    }

    /* renamed from: a */
    public void mo206850a(TECameraSettings.C60300g gVar) {
        if (gVar != null && gVar.mo206530a() == 2) {
            this.f150956a.set(true);
        }
    }

    /* renamed from: P */
    public TECameraSettings.C60295b mo206842P() {
        return this.f150958o.f150653G;
    }

    /* renamed from: A */
    public int[] mo206747A() {
        return new int[]{-1, -1};
    }

    /* renamed from: D */
    public float[] mo206750D() {
        return new float[]{-1.0f, -1.0f};
    }

    /* renamed from: M */
    public int mo206839M() {
        if (this.f150956a.getAndSet(false)) {
            mo206667h();
        }
        return this.f150966w;
    }

    /* renamed from: Q */
    public int mo206843Q() {
        if (this.f150958o.f150653G != null) {
            return this.f150958o.f150653G.f150705b;
        }
        return 0;
    }

    /* renamed from: S */
    public void mo206845S() {
        int i = this.f150968y;
        if (i > 0) {
            this.f150968y = i - 1;
        }
    }

    /* renamed from: C */
    public long[] mo206749C() {
        return new long[]{-1, -1};
    }

    /* renamed from: j */
    public int[] mo206669j() {
        TEFrameSizei tEFrameSizei = this.f150958o.f150687p;
        return new int[]{tEFrameSizei.f150716a, tEFrameSizei.f150717b};
    }

    /* renamed from: n */
    public boolean mo206673n() {
        if (this.f150958o.f150653G == null || !this.f150958o.f150653G.mo206524a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo206678s() {
        Bundle bundle;
        if (this.f150953A.containsKey(this.f150958o.f150651E)) {
            bundle = this.f150953A.get(this.f150958o.f150651E);
        } else {
            bundle = new Bundle();
            this.f150953A.put(this.f150958o.f150651E, bundle);
        }
        bundle.putInt("facing", this.f150958o.f150676e);
        return bundle;
    }

    /* renamed from: a */
    public Bundle mo206847a(String str) {
        return this.f150953A.get(str);
    }

    /* renamed from: b */
    public void mo206657b(PrivacyCert privacyCert) {
        C60427s.m234842b("TECameraBase", "close...");
    }

    /* renamed from: a */
    public void mo206642a(int i) {
        C60427s.m234839a("TECameraBase", "scene mode: " + i);
    }

    /* renamed from: a */
    public int mo206638a(TECameraSettings tECameraSettings, PrivacyCert privacyCert) {
        this.f150968y = tECameraSettings.f150692u;
        C60427s.m234839a("TECameraBase", "set start preview retry count: " + this.f150968y);
        return 0;
    }

    /* renamed from: a */
    public Exception mo206848a(Exception exc, int i) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(message + ", errorCode=" + i);
    }

    public AbstractC60396i(Context context, AbstractC60397a aVar, Handler handler, AbstractC60399c cVar) {
        this.f150962s = context;
        this.f150960q = aVar;
        this.f150961r = handler;
        this.f150969z = cVar;
    }
}
