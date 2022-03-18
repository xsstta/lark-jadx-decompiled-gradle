package com.bytedance.apm.trace.p155a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.block.C2869g;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3118f;
import com.bytedance.apm.util.C3121h;
import com.bytedance.apm.util.C3122i;
import com.bytedance.apm6.p184h.p185a.C3330b;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.a.b */
public class C3069b {

    /* renamed from: k */
    public static final Long f9858k = 200L;

    /* renamed from: l */
    public static final Long f9859l = 1000L;

    /* renamed from: q */
    private static boolean f9860q;

    /* renamed from: a */
    public String f9861a;

    /* renamed from: b */
    public volatile boolean f9862b;

    /* renamed from: c */
    public AbstractC3076d f9863c;

    /* renamed from: d */
    public AbstractC3075c f9864d;

    /* renamed from: e */
    public AbstractC3077e f9865e;

    /* renamed from: f */
    public float f9866f;

    /* renamed from: g */
    public float f9867g;

    /* renamed from: h */
    public float f9868h;

    /* renamed from: i */
    public float f9869i;

    /* renamed from: j */
    public C3073a f9870j;

    /* renamed from: m */
    public final JSONObject f9871m;

    /* renamed from: n */
    public long f9872n;

    /* renamed from: o */
    public long f9873o;

    /* renamed from: p */
    public int f9874p;

    /* renamed from: r */
    private C3078c f9875r;

    /* renamed from: s */
    private Choreographer.FrameCallback f9876s;

    /* renamed from: t */
    private LinkedList<Integer> f9877t;

    /* renamed from: u */
    private WindowManager f9878u;

    /* renamed from: v */
    private boolean f9879v;

    /* renamed from: com.bytedance.apm.trace.a.b$b */
    public interface AbstractC3074b {
        /* renamed from: a */
        void mo12933a(long j, int i);
    }

    /* renamed from: com.bytedance.apm.trace.a.b$c */
    public interface AbstractC3075c {
        /* renamed from: a */
        void mo12934a(JSONObject jSONObject);
    }

    /* renamed from: com.bytedance.apm.trace.a.b$d */
    public interface AbstractC3076d {
        void fpsCallBack(double d);
    }

    /* renamed from: com.bytedance.apm.trace.a.b$e */
    public interface AbstractC3077e {
        /* renamed from: a */
        void mo12936a(long j);
    }

    /* renamed from: e */
    public static String m12810e() {
        return C2869g.m12075a();
    }

    /* renamed from: f */
    private void m12811f() {
        this.f9866f = BitmapDescriptorFactory.HUE_RED;
        this.f9867g = BitmapDescriptorFactory.HUE_RED;
        this.f9868h = BitmapDescriptorFactory.HUE_RED;
        this.f9869i = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: g */
    private boolean m12812g() {
        return C3023c.m12693a("fps", this.f9861a);
    }

    /* renamed from: h */
    private boolean m12813h() {
        return C3023c.m12693a("fps_drop", this.f9861a);
    }

    /* renamed from: i */
    private void m12814i() {
        synchronized (this) {
            this.f9877t.clear();
        }
        m12817l();
    }

    /* renamed from: j */
    private void m12815j() {
        if (this.f9862b) {
            m12818m();
            if (this.f9876s != null) {
                Choreographer.getInstance().removeFrameCallback(this.f9876s);
            }
            m12819n();
            this.f9862b = false;
        }
    }

    /* renamed from: b */
    public synchronized void mo12926b() {
        C3078c cVar = this.f9875r;
        if (cVar != null) {
            cVar.mo12942b();
        } else if (Build.VERSION.SDK_INT >= 16) {
            m12815j();
            m12809b(this.f9861a);
        }
    }

    /* renamed from: c */
    public boolean mo12927c() {
        if (!C2785b.m11752b() || (!m12813h() && !m12812g())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo12928d() {
        if (this.f9862b) {
            try {
                this.f9878u.removeView(this.f9870j);
                this.f9870j.f9884a = -1;
                this.f9870j.f9885b = 0;
            } catch (Exception unused) {
            }
            this.f9862b = false;
        }
    }

    /* renamed from: k */
    private void m12816k() {
        this.f9870j.f9884a = -1;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2005, 0, -3);
        layoutParams.gravity = 51;
        layoutParams.flags = 24;
        layoutParams.height = 1;
        layoutParams.width = 1;
        try {
            this.f9878u.removeView(this.f9870j);
        } catch (Exception unused) {
        }
        this.f9878u.addView(this.f9870j, layoutParams);
        this.f9870j.postDelayed(new Runnable() {
            /* class com.bytedance.apm.trace.p155a.C3069b.RunnableC30701 */

            public void run() {
                if (C3069b.this.f9862b) {
                    C3069b.this.f9870j.invalidate();
                    C3069b.this.f9870j.postDelayed(this, 10);
                }
            }
        }, 10);
    }

    /* renamed from: l */
    private void m12817l() {
        this.f9872n = -1;
        this.f9873o = -1;
        this.f9874p = 0;
        this.f9876s = new Choreographer.FrameCallback() {
            /* class com.bytedance.apm.trace.p155a.C3069b.Choreographer$FrameCallbackC30712 */

            public void doFrame(long j) {
                if (C3069b.this.f9872n == -1) {
                    C3069b.this.f9872n = j;
                }
                if (C3069b.this.f9865e != null) {
                    C3069b.this.f9865e.mo12936a(j / 1000000);
                }
                C3069b.this.f9874p++;
                if (C3069b.this.f9862b) {
                    Choreographer.getInstance().postFrameCallback(this);
                }
                C3069b bVar = C3069b.this;
                bVar.mo12924a(bVar.f9873o, j);
                C3069b.this.f9873o = j;
            }
        };
        try {
            Choreographer.getInstance().postFrameCallback(this.f9876s);
        } catch (Exception unused) {
            this.f9862b = false;
            this.f9872n = -1;
            this.f9873o = -1;
            this.f9874p = 0;
            this.f9876s = null;
        }
    }

    /* renamed from: m */
    private void m12818m() {
        int i;
        long j = this.f9873o - this.f9872n;
        if (j > 0 && (i = this.f9874p) > 1) {
            long j2 = (((((long) (i - 1)) * 1000) * 1000) * 1000) / j;
            AbstractC3076d dVar = this.f9863c;
            if (dVar != null) {
                dVar.fpsCallBack((double) j2);
            }
            C3065a.m12801a().mo12918a(this.f9861a, (float) j2);
        }
    }

    /* renamed from: n */
    private void m12819n() {
        synchronized (this) {
            if (!this.f9877t.isEmpty()) {
                final LinkedList<Integer> linkedList = this.f9877t;
                this.f9877t = new LinkedList<>();
                C3047b.m12756a().mo12886a(new Runnable() {
                    /* class com.bytedance.apm.trace.p155a.C3069b.RunnableC30723 */

                    public void run() {
                        try {
                            if (!C3122i.m13009a(linkedList)) {
                                float a = C3118f.m12988a();
                                int b = C3118f.m12991b();
                                int i = b - 1;
                                int[] iArr = new int[(i + 0 + 1)];
                                int i2 = 0;
                                for (Integer num : linkedList) {
                                    int max = Math.max(Math.min(C3069b.m12806a(num.intValue(), a), i), 0);
                                    iArr[max] = iArr[max] + 1;
                                    i2 += num.intValue() / 100;
                                }
                                JSONObject jSONObject = new JSONObject();
                                for (int i3 = 0; i3 <= i; i3++) {
                                    if (iArr[i3] > 0) {
                                        jSONObject.put(String.valueOf(i3), iArr[i3]);
                                    }
                                }
                                if (C3069b.this.f9864d != null) {
                                    C3069b.this.f9864d.mo12934a(C3121h.m12997a(jSONObject));
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", C3069b.this.f9861a);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("total_scroll_time", i2);
                                jSONObject3.put("velocity", C3069b.this.f9866f + "," + C3069b.this.f9867g);
                                jSONObject3.put("distance", C3069b.this.f9868h + "," + C3069b.this.f9869i);
                                if (C3069b.this.f9871m != null) {
                                    jSONObject3.put("extra", C3069b.this.f9871m);
                                }
                                jSONObject3.put("drop_time_rate", (double) (1.0f - ((((float) linkedList.size()) * 1.0f) / ((float) ((int) (((float) i2) / a))))));
                                C2753f fVar = new C2753f("fps_drop", C3069b.this.f9861a, jSONObject, jSONObject2, jSONObject3);
                                C3330b.m13886a(fVar, true);
                                fVar.f8851f.put("refresh_rate", b);
                                C2741a.m11630c().mo11785a(fVar);
                            }
                        } catch (Exception e) {
                            if (C2785b.m11769j()) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo12923a() {
        C3078c cVar = this.f9875r;
        if (cVar != null) {
            cVar.mo12937a();
        } else if (!this.f9862b) {
            if (this.f9879v || mo12927c()) {
                m12811f();
                if (Build.VERSION.SDK_INT < 16) {
                    m12816k();
                } else {
                    m12814i();
                    m12807a(this.f9861a);
                }
                this.f9862b = true;
            }
        }
    }

    /* renamed from: a */
    public static void m12807a(String str) {
        C2869g.m12076a(str);
    }

    /* renamed from: b */
    public static void m12809b(String str) {
        C2869g.m12077b(str);
    }

    public C3069b(String str) {
        this(str, true);
    }

    /* renamed from: a */
    public static void m12808a(boolean z) {
        f9860q = z;
    }

    /* renamed from: a */
    public void mo12925a(AbstractC3076d dVar) {
        C3078c cVar = this.f9875r;
        if (cVar != null) {
            cVar.mo12941a(dVar);
        }
        this.f9863c = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.trace.a.b$a */
    public class C3073a extends View {

        /* renamed from: a */
        public long f9884a = -1;

        /* renamed from: b */
        public int f9885b;

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            if (this.f9884a == -1) {
                this.f9884a = SystemClock.elapsedRealtime();
                this.f9885b = 0;
            } else {
                this.f9885b++;
            }
            if (C3069b.this.f9865e != null) {
                C3069b.this.f9865e.mo12936a(SystemClock.elapsedRealtime());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9884a;
            if (elapsedRealtime > C3069b.f9858k.longValue()) {
                double longValue = (((double) this.f9885b) / ((double) elapsedRealtime)) * ((double) C3069b.f9859l.longValue());
                if (C3069b.this.f9863c != null) {
                    C3069b.this.f9863c.fpsCallBack(longValue);
                }
                C3065a.m12801a().mo12918a(C3069b.this.f9861a, (float) longValue);
                C3069b.this.mo12928d();
            }
        }

        public C3073a(Context context) {
            super(context);
        }
    }

    public C3069b(String str, boolean z) {
        this(str, z, null);
    }

    /* renamed from: a */
    public static int m12806a(int i, float f) {
        int i2 = (int) (f * 100.0f);
        return ((i + (i2 - 1)) / i2) - 1;
    }

    /* renamed from: a */
    public void mo12924a(long j, long j2) {
        if (this.f9873o > 0) {
            long j3 = j2 - j;
            if (j3 / 1000000 > 0) {
                synchronized (this) {
                    if (this.f9877t.size() > 20000) {
                        this.f9877t.poll();
                    }
                    this.f9877t.add(Integer.valueOf(((int) j3) / HwBuildEx.VersionCodes.CUR_DEVELOPMENT));
                }
            }
        }
    }

    public C3069b(String str, boolean z, JSONObject jSONObject) {
        this.f9872n = -1;
        this.f9873o = -1;
        this.f9871m = jSONObject;
        if (f9860q) {
            this.f9875r = new C3078c(str, z, jSONObject);
            return;
        }
        this.f9861a = str;
        this.f9879v = z;
        this.f9877t = new LinkedList<>();
        if (Build.VERSION.SDK_INT < 16) {
            this.f9878u = (WindowManager) C2785b.m11735a().getSystemService("window");
            this.f9870j = new C3073a(C2785b.m11735a());
        }
    }
}
