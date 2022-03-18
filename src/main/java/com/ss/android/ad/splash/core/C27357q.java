package com.ss.android.ad.splash.core;

import com.ss.android.ad.splash.AbstractC27231aa;
import com.ss.android.ad.splash.AbstractC27233b;
import com.ss.android.ad.splash.AbstractC27452l;
import com.ss.android.ad.splash.AbstractC27454n;
import com.ss.android.ad.splash.AbstractC27468s;
import com.ss.android.ad.splash.AbstractC27470u;
import com.ss.android.ad.splash.AbstractC27488v;
import com.ss.android.ad.splash.AbstractC27490x;
import com.ss.android.ad.splash.AbstractC27493z;
import com.ss.android.ad.splash.core.model.SplashAdQueryResult;
import com.ss.android.ad.splash.core.p1249d.C27280a;
import com.ss.android.ad.splash.core.p1252g.AbstractC27306b;
import com.ss.android.ad.splash.core.p1252g.AbstractC27309d;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.utils.C27471a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.q */
public class C27357q implements AbstractC27454n, AbstractC27468s, AbstractC27470u, AbstractC27493z {

    /* renamed from: a */
    private static volatile C27357q f68285a;

    /* renamed from: b */
    private boolean f68286b;

    private C27357q() {
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: e */
    public void mo97618e() {
        C27360s.m99683a().mo97632c();
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: b */
    public AbstractC27488v mo97613b() {
        m99659h();
        return new C27359r();
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: d */
    public AbstractC27456a mo97617d() {
        return C27279d.m99193a().mo97311b();
    }

    /* renamed from: f */
    public static C27357q m99658f() {
        if (f68285a == null) {
            synchronized (C27357q.class) {
                if (f68285a == null) {
                    f68285a = new C27357q();
                }
            }
        }
        return f68285a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo97619g() {
        boolean z = false;
        if (!C27287e.ap()) {
            C27471a.m100290c(" SDK is unavailable ");
            return false;
        }
        if (!C27287e.m99273m()) {
            C27471a.m100293d("splash ad data is not ready, ad is unavailable");
            C27234a.m98988a().mo97121a("service_load_local_status_monitor", 1, (JSONObject) null);
        } else {
            z = true;
        }
        m99659h();
        return z;
    }

    /* renamed from: h */
    private void m99659h() {
        int i = 0;
        try {
            if (C27287e.m99205D() == null) {
                i = 1;
                C27471a.m100293d("SplashNetWork is null! please setup it in SplashAdManager!");
            }
            if (C27287e.m99208G() == null) {
                i = 2;
                C27471a.m100293d("EventListener is null! please setup it in SplashAdManager!");
            }
            if (C27287e.m99207F() == null) {
                i = 3;
                C27471a.m100293d("SplashAdResourceLoader is null! please setup it in SplashAdManager!");
            }
            if (C27287e.m99206E() == null) {
                C27471a.m100293d("SplashAdPlatformSupportCallback is null! please setup it in SplashAdManager!");
            }
            if (i > 0) {
                C27234a.m98988a().mo97121a("service_sdk_engine_invalidate", i, (JSONObject) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: c */
    public boolean mo97616c() {
        if (!mo97619g()) {
            return false;
        }
        boolean z = true;
        SplashAdQueryResult a = C27328l.m99425a().mo97420a(true);
        if (a == null || a.mo97433c() == null) {
            z = false;
        }
        C27375v.m99833a().mo97753j();
        if (z) {
            C27471a.m100285b(a.mo97433c().mo97509v(), " there is a suitable ad this time ");
            C27279d.m99193a().mo97310a(a.mo97433c());
        } else {
            C27471a.m100287b(" there is no suitable ad this time ");
            C27280a.m99197a();
            C27326k.m99414a().mo97415b();
        }
        C27287e.m99257d(false);
        return z;
    }

    @Override // com.ss.android.ad.splash.AbstractC27454n
    /* renamed from: a */
    public void mo97612a() {
        C27287e.m99211J().execute(new Runnable() {
            /* class com.ss.android.ad.splash.core.C27357q.RunnableC273581 */

            public void run() {
                try {
                    C27471a.m100290c("clear splash ad data");
                    JSONArray jSONArray = new JSONArray();
                    C27368t.m99732a().mo97656b(jSONArray.toString()).mo97670f(jSONArray.toString()).mo97681l();
                } catch (Throwable th) {
                    th.printStackTrace();
                    C27471a.m100292d(0, "  crashed while clearing ad data ", th, null);
                }
            }
        });
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: a */
    public AbstractC27470u mo97606a(AbstractC27233b bVar) {
        C27287e.m99232a(bVar);
        return this;
    }

    @Override // com.ss.android.ad.splash.AbstractC27493z
    /* renamed from: b */
    public AbstractC27493z mo97614b(int i) {
        C27287e.m99247b(i);
        return this;
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: a */
    public AbstractC27470u mo97607a(AbstractC27452l lVar) {
        C27287e.m99236a(lVar);
        return this;
    }

    /* renamed from: b */
    public void mo97615b(boolean z) {
        this.f68286b = z;
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: a */
    public AbstractC27470u mo97608a(AbstractC27490x xVar) {
        C27287e.m99238a(xVar);
        return this;
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: a */
    public AbstractC27470u mo97605a(AbstractC27231aa aaVar) {
        C27287e.m99231a(aaVar);
        if (aaVar != null) {
            AbstractC27306b P = C27287e.m99217P();
            if (P instanceof AbstractC27309d) {
                ((AbstractC27309d) P).mo97353a();
            }
        }
        return this;
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: a */
    public AbstractC27470u mo97610a(boolean z) {
        C27287e.m99262f(z);
        return this;
    }

    @Override // com.ss.android.ad.splash.AbstractC27493z
    /* renamed from: a */
    public AbstractC27493z mo97611a(int i) {
        C27287e.m99228a(i);
        return this;
    }

    @Override // com.ss.android.ad.splash.AbstractC27470u
    /* renamed from: a */
    public AbstractC27470u mo97609a(String str, boolean z) {
        C27287e.m99239a(str);
        return this;
    }
}
