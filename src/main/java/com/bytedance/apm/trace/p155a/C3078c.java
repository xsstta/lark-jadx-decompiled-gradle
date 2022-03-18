package com.bytedance.apm.trace.p155a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.block.p136a.C2835b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.apm.util.C3118f;
import com.bytedance.apm.util.C3121h;
import com.bytedance.apm.util.C3122i;
import com.bytedance.apm6.p184h.p185a.C3330b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.a.c */
public class C3078c {

    /* renamed from: l */
    public static final Long f9887l = 200L;

    /* renamed from: m */
    public static final Long f9888m = 1000L;

    /* renamed from: t */
    private static C2835b f9889t;

    /* renamed from: a */
    public final String f9890a;

    /* renamed from: b */
    public volatile boolean f9891b;

    /* renamed from: c */
    public C3069b.AbstractC3076d f9892c;

    /* renamed from: d */
    public C3069b.AbstractC3077e f9893d = null;

    /* renamed from: e */
    public volatile C3069b.AbstractC3075c f9894e;

    /* renamed from: f */
    public volatile C3069b.AbstractC3074b f9895f;

    /* renamed from: g */
    public float f9896g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h */
    public float f9897h = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: i */
    public float f9898i = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: j */
    public float f9899j = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: k */
    public C3081a f9900k = null;

    /* renamed from: n */
    public final JSONObject f9901n;

    /* renamed from: o */
    private C2835b.C2839a f9902o = new C2835b.C2839a();

    /* renamed from: p */
    private LinkedList<Integer> f9903p;

    /* renamed from: q */
    private long f9904q = 0;

    /* renamed from: r */
    private long f9905r = 0;

    /* renamed from: s */
    private WindowManager f9906s = null;

    /* renamed from: u */
    private final boolean f9907u;

    /* renamed from: e */
    private void m12832e() {
        this.f9896g = BitmapDescriptorFactory.HUE_RED;
        this.f9897h = BitmapDescriptorFactory.HUE_RED;
        this.f9898i = BitmapDescriptorFactory.HUE_RED;
        this.f9899j = BitmapDescriptorFactory.HUE_RED;
        this.f9904q = 0;
    }

    /* renamed from: f */
    private boolean m12833f() {
        return C3023c.m12693a("fps", this.f9890a);
    }

    /* renamed from: g */
    private boolean m12834g() {
        return C3023c.m12693a("fps_drop", this.f9890a);
    }

    /* renamed from: h */
    private void m12835h() {
        if (f9889t != null) {
            this.f9891b = true;
            f9889t.mo12223a(this);
        }
    }

    /* renamed from: i */
    private void m12836i() {
        C2835b bVar = f9889t;
        if (bVar != null) {
            bVar.mo12224b(this);
            if (this.f9891b) {
                m12831b(this.f9904q, SystemClock.uptimeMillis());
                this.f9891b = false;
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo12942b() {
        if (Build.VERSION.SDK_INT >= 16) {
            m12836i();
            C3069b.m12809b(this.f9890a);
        }
    }

    /* renamed from: c */
    public boolean mo12943c() {
        if (C2785b.m11752b() || m12834g() || m12833f()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo12944d() {
        if (this.f9891b) {
            try {
                this.f9906s.removeView(this.f9900k);
                this.f9900k.f9912a = -1;
                this.f9900k.f9913b = 0;
            } catch (Exception unused) {
            }
            this.f9891b = false;
        }
    }

    /* renamed from: j */
    private void m12837j() {
        this.f9900k.f9912a = -1;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2005, 0, -3);
        layoutParams.gravity = 51;
        layoutParams.flags = 24;
        layoutParams.height = 1;
        layoutParams.width = 1;
        try {
            this.f9906s.removeView(this.f9900k);
        } catch (Exception unused) {
        }
        this.f9906s.addView(this.f9900k, layoutParams);
        this.f9900k.postDelayed(new Runnable() {
            /* class com.bytedance.apm.trace.p155a.C3078c.RunnableC30791 */

            public void run() {
                if (C3078c.this.f9891b) {
                    C3078c.this.f9900k.invalidate();
                    C3078c.this.f9900k.postDelayed(this, 10);
                }
            }
        }, 10);
    }

    /* renamed from: a */
    public void mo12937a() {
        if (!this.f9891b) {
            if (this.f9907u || mo12943c()) {
                m12832e();
                if (Build.VERSION.SDK_INT < 16) {
                    m12837j();
                } else {
                    m12835h();
                    C3069b.m12807a(this.f9890a);
                }
                this.f9904q = SystemClock.uptimeMillis();
                this.f9891b = true;
            }
        }
    }

    /* renamed from: a */
    public static void m12830a(C2835b bVar) {
        f9889t = bVar;
    }

    /* renamed from: a */
    public void mo12938a(float f) {
        C3069b.AbstractC3076d dVar = this.f9892c;
        if (dVar != null) {
            dVar.fpsCallBack((double) f);
        }
        C3065a.m12801a().mo12918a(this.f9890a, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.trace.a.c$a */
    public class C3081a extends View {

        /* renamed from: a */
        public long f9912a = -1;

        /* renamed from: b */
        public int f9913b;

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            if (this.f9912a == -1) {
                this.f9912a = SystemClock.elapsedRealtime();
                this.f9913b = 0;
            } else {
                this.f9913b++;
            }
            if (C3078c.this.f9893d != null) {
                C3078c.this.f9893d.mo12936a(SystemClock.elapsedRealtime());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9912a;
            if (elapsedRealtime > C3078c.f9887l.longValue()) {
                double longValue = (((double) this.f9913b) / ((double) elapsedRealtime)) * ((double) C3078c.f9888m.longValue());
                if (C3078c.this.f9892c != null) {
                    C3078c.this.f9892c.fpsCallBack(longValue);
                }
                C3065a.m12801a().mo12918a(C3078c.this.f9890a, (float) longValue);
                C3078c.this.mo12944d();
            }
        }

        public C3081a(Context context) {
            super(context);
        }
    }

    /* renamed from: a */
    public void mo12941a(C3069b.AbstractC3076d dVar) {
        this.f9892c = dVar;
    }

    /* renamed from: a */
    public static int m12829a(int i, float f) {
        return i / ((int) (f * 100.0f));
    }

    /* renamed from: a */
    public void mo12940a(long j, boolean z) {
        this.f9902o.mo12228a(j, z);
    }

    /* renamed from: b */
    private void m12831b(long j, long j2) {
        synchronized (this) {
            if (!this.f9903p.isEmpty()) {
                int i = (this.f9905r > 0 ? 1 : (this.f9905r == 0 ? 0 : -1));
                this.f9905r = 0;
                final LinkedList<Integer> linkedList = this.f9903p;
                this.f9903p = new LinkedList<>();
                final C2835b.C2839a aVar = this.f9902o;
                this.f9902o = new C2835b.C2839a();
                C3047b.m12756a().mo12886a(new Runnable() {
                    /* class com.bytedance.apm.trace.p155a.C3078c.RunnableC30802 */

                    public void run() {
                        try {
                            if (!C3122i.m13009a(linkedList)) {
                                float a = C3118f.m12988a();
                                int b = C3118f.m12991b();
                                int i = b - 1;
                                int[] iArr = new int[(i + 0 + 1)];
                                int i2 = 0;
                                int i3 = 0;
                                for (Integer num : linkedList) {
                                    int a2 = C3078c.m12829a(num.intValue(), a);
                                    if (a2 > 0) {
                                        i2 += a2;
                                    }
                                    num.intValue();
                                    int max = Math.max(Math.min(a2, i), 0);
                                    iArr[max] = iArr[max] + 1;
                                    i3 += num.intValue() / 100;
                                }
                                C3078c.this.mo12938a((float) (((double) (((linkedList.size() * 100) * b) / (linkedList.size() + i2))) / 100.0d));
                                JSONObject jSONObject = new JSONObject();
                                for (int i4 = 0; i4 <= i; i4++) {
                                    if (iArr[i4] > 0) {
                                        jSONObject.put(String.valueOf(i4), iArr[i4]);
                                        int i5 = iArr[i4];
                                    }
                                }
                                if (C3078c.this.f9894e != null) {
                                    C3078c.this.f9894e.mo12934a(C3121h.m12997a(jSONObject));
                                }
                                if (C3078c.this.f9895f != null) {
                                    C3078c.this.f9895f.mo12933a(aVar.f9063c, aVar.f9062b);
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", C3078c.this.f9890a);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("total_scroll_time", i3);
                                jSONObject3.put("velocity", C3078c.this.f9896g + "," + C3078c.this.f9897h);
                                jSONObject3.put("distance", C3078c.this.f9898i + "," + C3078c.this.f9899j);
                                jSONObject3.put("frame_count", linkedList.size());
                                jSONObject3.put("drop_count", i2);
                                if (C3078c.this.f9901n != null) {
                                    jSONObject3.put("extra", C3078c.this.f9901n);
                                }
                                jSONObject3.put("drop_time_rate", (double) (1.0f - ((((float) linkedList.size()) * 1.0f) / ((float) ((int) (((float) i3) / a))))));
                                C2753f fVar = new C2753f("fps_drop", C3078c.this.f9890a, jSONObject, jSONObject2, jSONObject3);
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
    public void mo12939a(long j, long j2) {
        long j3 = j2 - j;
        if (this.f9905r == 0) {
            this.f9905r = j;
        }
        if (j3 >= 0) {
            synchronized (this) {
                if (this.f9903p.size() > 20000) {
                    this.f9903p.poll();
                }
                this.f9903p.add(Integer.valueOf(((int) j3) * 100));
            }
        }
    }

    public C3078c(String str, boolean z, JSONObject jSONObject) {
        this.f9890a = str;
        this.f9907u = z;
        this.f9901n = jSONObject;
        this.f9903p = new LinkedList<>();
        if (Build.VERSION.SDK_INT < 16) {
            this.f9906s = (WindowManager) C2785b.m11735a().getSystemService("window");
            this.f9900k = new C3081a(C2785b.m11735a());
        }
    }
}
