package com.ss.android.ad.splash.core;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ad.splash.AbstractC27451k;
import com.ss.android.ad.splash.AbstractC27488v;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.SplashAdQueryResult;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.core.p1249d.C27280a;
import com.ss.android.ad.splash.origin.AbstractC27457b;
import com.ss.android.ad.splash.origin.C27459d;
import com.ss.android.ad.splash.p1244b.C27240b;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.HashMap;

/* renamed from: com.ss.android.ad.splash.core.r */
class C27359r implements AbstractC27488v {

    /* renamed from: a */
    private AbstractC27451k f68288a;

    /* renamed from: b */
    private BDASplashView2 f68289b;

    /* renamed from: c */
    private BDASplashView f68290c;

    /* renamed from: d */
    private C27459d f68291d;

    /* renamed from: e */
    private boolean f68292e;

    C27359r() {
    }

    /* renamed from: a */
    public AbstractC27457b mo97622a() {
        if (this.f68291d == null) {
            this.f68291d = new C27459d();
        }
        return this.f68291d;
    }

    /* renamed from: b */
    private void m99678b() {
        if (C27287e.m99259e().mo97700e()) {
            C27326k.m99414a().mo97415b();
        }
    }

    /* renamed from: c */
    private void m99679c() {
        C27368t.m99732a().mo97668f().mo97681l();
        HashMap<String, Object> hashMap = new HashMap<>(1);
        hashMap.put("is_emptyround", 0);
        HashMap<String, Object> hashMap2 = new HashMap<>(1);
        hashMap2.put("log_extra", C27368t.m99732a().mo97645F());
        C27278b.m99171a().mo97296a(null, 84378473382L, "showlimit", hashMap2, hashMap);
    }

    @Override // com.ss.android.ad.splash.AbstractC27488v
    /* renamed from: a */
    public AbstractC27488v mo97623a(AbstractC27451k kVar) {
        this.f68288a = kVar;
        return this;
    }

    /* renamed from: a */
    private void m99675a(C27331b bVar) {
        C27280a.m99198a(bVar);
        this.f68292e = true;
    }

    @Override // com.ss.android.ad.splash.AbstractC27488v
    /* renamed from: a */
    public ViewGroup mo97621a(Context context) {
        if (context != null) {
            if ("ContextImpl".equals(context.getClass().getSimpleName())) {
                C27471a.m100287b(" illegal context ");
            }
            if (!C27357q.m99658f().mo97619g()) {
                return null;
            }
            ViewGroup b = m99677b(context);
            boolean e = C27287e.m99259e().mo97700e();
            if (b == null && !e) {
                C27326k.m99414a().mo97415b();
            }
            if (!this.f68292e) {
                C27280a.m99197a();
            }
            return b;
        }
        throw new IllegalArgumentException("context is null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: com.ss.android.ad.splash.core.BDASplashView2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private ViewGroup m99677b(Context context) {
        C27331b bVar;
        BDASplashView bDASplashView;
        if (this.f68288a != null) {
            C27328l a = C27328l.m99425a();
            SplashAdQueryResult c = a.mo97424c();
            if (c == null || c.mo97432b() != 200) {
                bVar = null;
            } else {
                bVar = c.mo97433c();
            }
            if (bVar == null) {
                m99678b();
                C27471a.m100287b(" there is no suitable ad this time ");
                return null;
            }
            C27319h.m99371a().mo97381a(bVar.mo97509v(), 1006);
            C27375v.m99833a().mo97753j();
            boolean z = true;
            if (bVar.mo97502p() && C27287e.m99219R() != null) {
                C27471a.m100285b(bVar.mo97509v(), " selecting a topview ad, we depend on you now ");
                mo97622a().mo98024a(this.f68288a);
                C27287e.m99219R().mo98026a(bVar, true);
                if (C27287e.al()) {
                    m99675a(bVar);
                }
                m99679c();
                C27357q.m99658f().mo97615b(true);
                return null;
            } else if (bVar.mo97503q()) {
                C27471a.m100285b(bVar.mo97509v(), " selecting a topview ad, we depend on you now ");
                mo97622a().mo98024a(this.f68288a);
                if (C27287e.m99219R() != null) {
                    C27287e.m99219R().mo98027b(bVar, true);
                }
                if (C27287e.al()) {
                    m99675a(bVar);
                }
                m99679c();
                C27357q.m99658f().mo97615b(true);
                return null;
            } else {
                if (C27287e.ak()) {
                    C27471a.m100285b(bVar.mo97509v(), "prepare to bind splash data, building view which is new style");
                    BDASplashView2 bDASplashView2 = new BDASplashView2(context);
                    bDASplashView2.setSplashAdInteraction(new C27354o(bDASplashView2, this.f68288a));
                    if (!bDASplashView2.mo97193a(bVar)) {
                        C27240b.m99006a().mo97132a(7);
                        m99678b();
                        return null;
                    }
                    this.f68289b = bDASplashView2;
                    C27269b.m99130a(bDASplashView2);
                    bDASplashView = bDASplashView2;
                } else {
                    C27471a.m100285b(bVar.mo97509v(), "prepare to bind splash data, building view which is old style");
                    BDASplashView bDASplashView3 = new BDASplashView(context);
                    bDASplashView3.setSplashAdInteraction(new C27354o(bDASplashView3, this.f68288a));
                    if (!bDASplashView3.mo97153a(bVar)) {
                        C27240b.m99006a().mo97132a(7);
                        m99678b();
                        return null;
                    }
                    this.f68290c = bDASplashView3;
                    C27269b.m99130a(bDASplashView3);
                    bDASplashView = bDASplashView3;
                }
                C27357q.m99658f().mo97615b(true);
                m99679c();
                m99675a(bVar);
                String aj = bVar.aj();
                if (!C27287e.ai() ? C27480i.m100385a(aj) || C27480i.m100385a(a.mo97426d()) || !a.mo97426d().equals(aj) : a.mo97427e() != bVar.mo97509v()) {
                    z = false;
                }
                m99676a(bVar, z);
                return bDASplashView;
            }
        } else {
            throw new IllegalStateException("SplashAdActionListener is null! please set it in SplashAdNative!");
        }
    }

    /* renamed from: a */
    private void m99676a(C27331b bVar, boolean z) {
        if (z) {
            C27278b.m99171a().mo97306c(bVar);
        }
        C27240b.m99006a().mo97137e();
        C27240b.m99006a().mo97132a(0);
    }
}
