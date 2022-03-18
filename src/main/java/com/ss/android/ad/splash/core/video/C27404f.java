package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27368t;
import com.ss.android.ad.splash.core.p1252g.C27307c;
import com.ss.android.ad.splash.core.video.AbstractC27388b;
import com.ss.android.ad.splash.core.video.C27396d;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.ad.splash.utils.C27481j;
import com.ss.android.ad.splash.utils.HandlerC27486n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video.f */
public class C27404f implements AbstractC27388b, C27396d.AbstractC27400a, HandlerC27486n.AbstractC27487a {

    /* renamed from: a */
    public C27396d f68482a;

    /* renamed from: b */
    public HandlerC27486n f68483b = new HandlerC27486n(this);

    /* renamed from: c */
    public long f68484c = 0;

    /* renamed from: d */
    public C27390c f68485d;

    /* renamed from: e */
    public AbstractC27388b.AbstractC27389a f68486e;

    /* renamed from: f */
    public Runnable f68487f;

    /* renamed from: g */
    private long f68488g;

    /* renamed from: h */
    private int f68489h;

    /* renamed from: i */
    private ViewGroup f68490i;

    /* renamed from: j */
    private long f68491j = 0;

    /* renamed from: k */
    private String f68492k;

    /* renamed from: l */
    private long f68493l = 0;

    /* renamed from: m */
    private long f68494m;

    /* renamed from: n */
    private List<String> f68495n;

    /* renamed from: o */
    private int[] f68496o = new int[2];

    /* renamed from: p */
    private ArrayList<Runnable> f68497p;

    /* renamed from: q */
    private boolean f68498q;

    /* renamed from: r */
    private WeakReference<Context> f68499r;

    /* renamed from: s */
    private boolean f68500s;

    /* renamed from: t */
    private boolean f68501t;

    /* renamed from: u */
    private boolean f68502u;

    /* renamed from: v */
    private long f68503v;

    /* renamed from: w */
    private long f68504w;

    /* renamed from: x */
    private Runnable f68505x;

    /* renamed from: a */
    public boolean mo97882a(C27401e eVar) {
        if (C27480i.m100385a(eVar.mo97847b()) || C27480i.m100385a(eVar.mo97846a())) {
            C27477g.m100330d("SplashAdSdk", "No video info");
            return false;
        }
        this.f68492k = eVar.mo97852g();
        this.f68488g = eVar.mo97848c();
        this.f68489h = eVar.mo97856k();
        this.f68503v = eVar.mo97860o();
        this.f68482a.mo97827a(eVar.mo97859n());
        if (eVar.mo97854i()) {
            this.f68482a.mo97834c(eVar.mo97857l(), eVar.mo97858m());
        }
        this.f68482a.mo97828a(eVar.mo97854i(), eVar.mo97855j());
        this.f68482a.mo97822a(eVar.mo97849d(), eVar.mo97850e());
        this.f68482a.mo97821a(eVar.mo97861p());
        this.f68482a.mo97824a(this.f68490i);
        m100020a(eVar.mo97853h(), 0);
        HandlerC27486n nVar = new HandlerC27486n(this);
        this.f68483b = nVar;
        this.f68485d = new C27390c(nVar);
        this.f68482a.mo97831b(eVar.mo97849d(), eVar.mo97850e());
        this.f68491j = 0;
        this.f68482a.mo97829b();
        try {
            m100023a(eVar.mo97846a());
            this.f68492k = eVar.mo97852g();
            this.f68495n = eVar.mo97851f();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.C27396d.AbstractC27400a
    /* renamed from: a */
    public void mo97844a(C27396d dVar, View view, MotionEvent motionEvent) {
        AbstractC27388b.AbstractC27389a aVar = this.f68486e;
        if (aVar != null) {
            aVar.mo97169a(this.f68491j, C27481j.m100386a(this.f68493l, this.f68494m), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    @Override // com.ss.android.ad.splash.core.video.C27396d.AbstractC27400a
    /* renamed from: a */
    public void mo97843a(C27396d dVar, SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C27477g.m100326a("SplashAdSdk", "surfaceChanged, format = " + i + ", width = " + i2 + ", height = " + i3);
    }

    /* renamed from: b */
    public void mo97883b() {
        C27390c cVar = this.f68485d;
        if (cVar != null) {
            cVar.mo97811b();
        }
    }

    /* renamed from: d */
    private boolean m100025d() {
        WeakReference<Context> weakReference = this.f68499r;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo97884c() {
        C27390c cVar = this.f68485d;
        if (cVar != null) {
            cVar.mo97812c();
        }
        C27396d dVar = this.f68482a;
        if (dVar != null) {
            dVar.mo97837f();
        }
        this.f68483b.removeCallbacks(this.f68505x);
    }

    /* renamed from: e */
    private void m100026e() {
        ArrayList<Runnable> arrayList = this.f68497p;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = new ArrayList(this.f68497p).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f68497p.clear();
        }
    }

    /* renamed from: f */
    private void m100027f() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", this.f68489h);
            String str = "not_real_time";
            if (this.f68502u) {
                str = "real_time";
            }
            jSONObject.put("show_type", str);
            jSONObject.put("ad_sequence", C27368t.m99732a().mo97695z());
            int i = 1;
            jSONObject.putOpt("play_order", 1);
            if (C27287e.ah() != -1) {
                if (C27287e.ah() != 1) {
                    i = 2;
                }
                jSONObject.put("awemelaunch", i);
            }
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            if (!C27480i.m100385a(this.f68492k)) {
                jSONObject2.put("log_extra", this.f68492k);
            }
            jSONObject2.put("ad_fetch_time", this.f68503v);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject2 = null;
        }
        C27287e.m99229a(this.f68488g, "splash_ad", "play", jSONObject2);
        C27307c a = new C27307c.C27308a().mo97351a(this.f68504w).mo97352a();
        if (C27287e.m99259e().mo97696a()) {
            C27287e.m99217P().mo97347a(null, "play", this.f68488g, this.f68495n, this.f68492k, true, -1, null, a);
        } else {
            C27287e.m99217P().mo97349c(null, this.f68488g, this.f68495n, this.f68492k, true, -1, null, a);
        }
    }

    @Override // com.ss.android.ad.splash.core.video.C27396d.AbstractC27400a
    /* renamed from: a */
    public void mo97841a() {
        if (this.f68486e != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f68484c;
            this.f68491j = currentTimeMillis;
            this.f68486e.mo97171c(currentTimeMillis, C27481j.m100386a(this.f68493l, this.f68494m));
        }
    }

    /* renamed from: a */
    public void mo97880a(AbstractC27388b.AbstractC27389a aVar) {
        this.f68486e = aVar;
    }

    /* renamed from: a */
    public void mo97881a(boolean z) {
        this.f68502u = z;
    }

    /* renamed from: a */
    private void m100019a(int i) {
        C27396d dVar;
        if (m100025d() && (dVar = this.f68482a) != null) {
            dVar.mo97832c();
            AbstractC27388b.AbstractC27389a aVar = this.f68486e;
            if (aVar != null) {
                aVar.mo97168a(this.f68491j, 100);
            }
        }
    }

    /* renamed from: b */
    private void m100024b(Runnable runnable) {
        if (this.f68497p == null) {
            this.f68497p = new ArrayList<>();
        }
        this.f68497p.add(runnable);
    }

    /* renamed from: a */
    private void m100021a(Context context) {
        C27396d dVar = new C27396d(context, LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.splash_ad_layout_video, (ViewGroup) null, false));
        this.f68482a = dVar;
        dVar.mo97826a(this);
    }

    /* renamed from: a */
    private void m100022a(Runnable runnable) {
        if (runnable != null) {
            if (!this.f68482a.mo97836e() || !this.f68498q) {
                m100024b(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    private void m100023a(String str) {
        C27390c cVar = this.f68485d;
        if (cVar != null) {
            cVar.mo97809a(str);
        }
        this.f68484c = System.currentTimeMillis();
        if (!C27480i.m100385a(str)) {
            this.f68482a.mo97830b(8);
            this.f68482a.mo97830b(0);
            m100022a(new Runnable() {
                /* class com.ss.android.ad.splash.core.video.C27404f.RunnableC274051 */

                public void run() {
                    C27404f.this.f68484c = System.currentTimeMillis();
                    C27404f.this.f68482a.mo97833c(0);
                    if (C27404f.this.f68485d != null) {
                        C27404f.this.f68485d.mo97810a(true, 0L, false);
                    }
                    if (C27404f.this.f68483b != null) {
                        C27404f.this.f68483b.postDelayed(C27404f.this.f68487f, 100);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a
    /* renamed from: a */
    public void mo97152a(Message message) {
        WeakReference<Context> weakReference;
        if (this.f68482a != null && message != null && (weakReference = this.f68499r) != null && weakReference.get() != null) {
            int i = message.what;
            if (i != 108) {
                if (i != 109) {
                    switch (i) {
                        case 302:
                            m100019a(message.what);
                            return;
                        case 303:
                            C27396d dVar = this.f68482a;
                            if (dVar != null) {
                                dVar.mo97832c();
                            }
                            AbstractC27388b.AbstractC27389a aVar = this.f68486e;
                            if (aVar != null) {
                                aVar.mo97170b(this.f68491j, C27481j.m100386a(this.f68493l, this.f68494m));
                                return;
                            }
                            return;
                        case 304:
                            int i2 = message.arg1;
                            C27396d dVar2 = this.f68482a;
                            if (dVar2 != null) {
                                dVar2.mo97832c();
                            }
                            if (this.f68500s && i2 == 3 && !this.f68501t) {
                                m100027f();
                                this.f68501t = true;
                                return;
                            }
                            return;
                        case 305:
                            HandlerC27486n nVar = this.f68483b;
                            if (nVar != null) {
                                nVar.removeCallbacks(this.f68505x);
                            }
                            if (!this.f68500s && !this.f68501t) {
                                m100027f();
                                this.f68501t = true;
                            }
                            C27396d dVar3 = this.f68482a;
                            if (dVar3 != null) {
                                dVar3.mo97832c();
                                return;
                            }
                            return;
                        case 306:
                            C27396d dVar4 = this.f68482a;
                            if (dVar4 != null) {
                                dVar4.mo97832c();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else if (message.obj instanceof Long) {
                    this.f68493l = ((Long) message.obj).longValue();
                }
            } else if (message.obj instanceof Long) {
                this.f68494m = ((Long) message.obj).longValue();
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video.C27396d.AbstractC27400a
    /* renamed from: a */
    public void mo97842a(C27396d dVar, SurfaceHolder surfaceHolder) {
        this.f68498q = true;
        C27390c cVar = this.f68485d;
        if (cVar != null) {
            cVar.mo97808a(surfaceHolder);
            m100026e();
        }
    }

    @Override // com.ss.android.ad.splash.core.video.C27396d.AbstractC27400a
    /* renamed from: b */
    public void mo97845b(C27396d dVar, SurfaceHolder surfaceHolder) {
        this.f68498q = false;
        C27477g.m100326a("SplashAdSdk", "surfaceDestroyed");
    }

    /* renamed from: a */
    private void m100020a(int i, int i2) {
        if (!(this.f68482a.mo97820a() instanceof FrameLayout.LayoutParams)) {
            C27477g.m100326a("SplashAdSdk", "syncPositionForSplash layout params!");
            return;
        }
        this.f68490i.getLocationInWindow(this.f68496o);
        FrameLayout.LayoutParams a = this.f68482a.mo97820a();
        if (a != null) {
            a.topMargin = i;
            a.leftMargin = i2;
            a.gravity = 51;
            this.f68482a.mo97825a(a);
        }
    }

    public C27404f(Context context, ViewGroup viewGroup) {
        boolean z = false;
        this.f68501t = false;
        this.f68502u = false;
        this.f68503v = 0;
        this.f68504w = 0;
        this.f68487f = new Runnable() {
            /* class com.ss.android.ad.splash.core.video.C27404f.RunnableC274062 */

            public void run() {
                if (C27404f.this.f68485d != null) {
                    C27404f.this.f68485d.mo97814e();
                }
            }
        };
        this.f68505x = new Runnable() {
            /* class com.ss.android.ad.splash.core.video.C27404f.RunnableC274073 */

            public void run() {
                if (C27404f.this.f68486e != null) {
                    C27404f.this.f68486e.mo97167a();
                }
            }
        };
        this.f68490i = viewGroup;
        this.f68499r = new WeakReference<>(context);
        m100021a(context);
        this.f68500s = Build.VERSION.SDK_INT >= 17 ? true : z;
    }
}
