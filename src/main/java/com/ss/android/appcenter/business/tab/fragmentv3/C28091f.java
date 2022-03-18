package com.ss.android.appcenter.business.tab.fragmentv3;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.net.p1272c.C27727a;
import com.ss.android.appcenter.business.net.p1272c.C27732b;
import com.ss.android.appcenter.business.net.p1272c.C27733c;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.common.util.C28176a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.common.util.C28187j;
import com.ss.android.appcenter.engine.p1300b.AbstractC28241a;
import com.ss.android.appcenter.engine.p1300b.C28242b;
import com.ss.android.appcenter.engine.p1300b.C28243c;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapp.util.ACache;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.f */
public class C28091f implements AbstractC28241a {

    /* renamed from: a */
    public C1177w<List<C27733c>> f70348a;

    /* renamed from: b */
    public C27733c f70349b;

    /* renamed from: c */
    private Context f70350c;

    /* renamed from: d */
    private C1177w<C28243c> f70351d;

    /* renamed from: e */
    private C27727a f70352e;

    /* renamed from: f */
    private AtomicBoolean f70353f;

    /* renamed from: g */
    private boolean f70354g;

    /* renamed from: h */
    private AbstractC28094a f70355h;

    /* renamed from: i */
    private ACache f70356i;

    /* renamed from: j */
    private boolean f70357j;

    /* renamed from: k */
    private boolean f70358k;

    /* renamed from: l */
    private C27733c f70359l;

    /* renamed from: m */
    private C28243c f70360m;

    /* renamed from: n */
    private Object f70361n;

    /* renamed from: o */
    private C27733c f70362o;

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.f$a */
    public interface AbstractC28094a {
        /* renamed from: a */
        boolean mo100006a();
    }

    /* renamed from: g */
    private void m102722g() {
        m102723h();
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: d */
    public C27733c mo100005d() {
        return this.f70349b;
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: a */
    public void mo99996a() {
        C28184h.m103250d("WorkplaceTemplateService", "asyncLoadTemplate>>>");
        m102721f();
        m102722g();
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: c */
    public void mo100004c() {
        this.f70353f.set(true);
        this.f70354g = false;
    }

    /* renamed from: f */
    private void m102721f() {
        if (this.f70357j) {
            C28187j.m103257a().mo100400a(new Runnable() {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.$$Lambda$f$ho0ohJjMD6A3a7hyKGVzyzGwXs */

                public final void run() {
                    C28091f.this.m102725j();
                }
            });
        }
    }

    /* renamed from: h */
    private void m102723h() {
        C28184h.m103250d("WorkplaceTemplateService", "requestWorkplaceTemplateInfo>>>");
        this.f70352e.mo98899a(new C27727a.AbstractC27731b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28091f.C280921 */

            @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27731b
            /* renamed from: a */
            public void mo98903a() {
                C28184h.m103248b("WorkplaceTemplateService", "requestWorkplaceTemplate>>> onError");
                C28091f.this.mo100000a((C27733c) null, new C28243c(null, -1, 1));
            }

            @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27731b
            /* renamed from: b */
            public void mo98905b() {
                C28184h.m103248b("WorkplaceTemplateService", "requestWorkplaceTemplate>>> onAvailableTemplateIsEmpty");
                C28091f.this.mo100000a((C27733c) null, new C28243c(null, -1, 1));
            }

            @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27731b
            /* renamed from: a */
            public void mo98904a(List<C27733c> list) {
                C28091f.this.f70348a.mo5926a(list);
                if (C28091f.this.f70349b == null) {
                    C28184h.m103250d("WorkplaceTemplateService", "requestWorkplaceTemplate>>> without current. use first.");
                    C28091f.this.mo99999a(list.get(0));
                    return;
                }
                for (C27733c cVar : list) {
                    if (TextUtils.equals(cVar.f69303a, C28091f.this.f70349b.f69303a)) {
                        if (!TextUtils.equals(cVar.f69304b, C28091f.this.f70349b.f69304b)) {
                            C28184h.m103250d("WorkplaceTemplateService", "requestWorkplaceTemplate>>> templateInfoList. new md5. go download.");
                            C28091f.this.mo99999a(cVar);
                            return;
                        }
                        C28184h.m103250d("WorkplaceTemplateService", "requestWorkplaceTemplate>>> templateInfoList. no need update.");
                        return;
                    }
                }
                C28184h.m103250d("WorkplaceTemplateService", "requestWorkplaceTemplate>>> old template is invisible. use first.");
                C28091f.this.mo99999a(list.get(0));
            }
        });
    }

    /* renamed from: i */
    private String m102724i() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b());
    }

    /* renamed from: e */
    private void m102720e() {
        try {
            this.f70357j = C27548m.m100547m().mo98225i().mo98187a("lark.workplace.template.cache");
            this.f70356i = ACache.m261150a(this.f70350c, "CacheKeyTemplate");
            C28184h.m103250d("WorkplaceTemplateService", "initACache>>> fg:" + this.f70357j);
        } catch (Exception e) {
            C27700a.m101236a("WorkplaceTemplateService#initACache", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m102725j() {
        try {
            C28184h.m103250d("WorkplaceTemplateService", "asyncLoadCacheTemplate>>>");
            C27732b bVar = (C27732b) C27579g.f68797a.fromJson(this.f70356i.mo233093a(m102724i()), C27732b.class);
            if (bVar != null) {
                C27733c cVar = bVar.f69301a;
                C28243c cVar2 = bVar.f69302b;
                cVar2.mo100624a(2);
                mo100000a(cVar, cVar2);
            }
        } catch (Exception e) {
            C27700a.m101236a("WorkplaceTemplateService#asyncLoadCacheTemplate", e);
        }
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: b */
    public void mo100002b() {
        C28184h.m103250d("WorkplaceTemplateService", "tryUpdate>>>");
        C27733c cVar = this.f70362o;
        if (cVar != null) {
            mo99999a(cVar);
        } else if (!this.f70353f.get() || this.f70359l == null || this.f70360m == null) {
            m102722g();
        } else {
            C28184h.m103250d("WorkplaceTemplateService", "tryUpdate>>> dispatch last record new template.");
            mo100000a(this.f70359l, this.f70360m);
        }
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: a */
    public void mo100001a(AbstractC28094a aVar) {
        this.f70355h = aVar;
    }

    /* renamed from: a */
    private boolean m102718a(String str) {
        if (C28176a.m103220a(C27548m.m100547m().mo98218b().mo98171b(), str) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: a */
    public void mo99997a(Fragment fragment) {
        this.f70351d.mo5922a(fragment);
        this.f70348a.mo5922a(fragment);
    }

    /* renamed from: a */
    public void mo99999a(final C27733c cVar) {
        C28184h.m103250d("WorkplaceTemplateService", "downloadTemplateFile>>>");
        if (m102718a(cVar.f69306d)) {
            C28184h.m103250d("WorkplaceTemplateService", "requestWorkplaceTemplate>>> minClientVersion > currentVersion");
            mo100000a(cVar, new C28243c(null, -2, 1));
            return;
        }
        this.f70352e.mo98900a(cVar.f69307e, new C27727a.AbstractC27730a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28091f.C280932 */

            @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27730a
            /* renamed from: a */
            public void mo98901a() {
                C28184h.m103248b("WorkplaceTemplateService", "downloadTemplateFile>>> onError");
                C28091f.this.mo100000a(cVar, new C28243c(null, -1, 1));
            }

            @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27730a
            /* renamed from: a */
            public void mo98902a(C28242b bVar) {
                C28184h.m103250d("WorkplaceTemplateService", "downloadTemplateFile>>> onSuccess");
                C28243c a = C28091f.this.mo99995a(cVar.f69303a, cVar.f69304b, bVar);
                a.mo100624a(1);
                C28091f.this.mo100000a(cVar, a);
            }
        });
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: b */
    public void mo100003b(LifecycleOwner lifecycleOwner, AbstractC1178x<List<C27733c>> xVar) {
        this.f70348a.mo5923a(lifecycleOwner, xVar);
    }

    /* renamed from: b */
    private boolean m102719b(C27733c cVar, C28243c cVar2) {
        if (!cVar2.mo100629e() || !cVar2.mo100626c() || cVar == null || this.f70349b != null || this.f70358k) {
            return false;
        }
        return true;
    }

    public C28091f(Context context, OPTrace oPTrace) {
        this.f70361n = new Object();
        this.f70350c = context;
        this.f70351d = new C1177w<>();
        this.f70348a = new C1177w<>();
        this.f70352e = new C27727a(oPTrace);
        this.f70353f = new AtomicBoolean(false);
        this.f70354g = false;
        m102720e();
    }

    @Override // com.ss.android.appcenter.engine.p1300b.AbstractC28241a
    /* renamed from: a */
    public void mo99998a(LifecycleOwner lifecycleOwner, AbstractC1178x<C28243c> xVar) {
        C28184h.m103250d("WorkplaceTemplateService", "registerTemplateLiveDataObserver>>>");
        this.f70351d.mo5923a(lifecycleOwner, xVar);
    }

    /* renamed from: a */
    public void mo100000a(C27733c cVar, C28243c cVar2) {
        synchronized (this.f70361n) {
            C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> new:" + cVar + " current Template:" + this.f70349b + " status:" + cVar2.mo100625b());
            if (cVar2.mo100629e()) {
                if (m102719b(cVar, cVar2)) {
                    C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> use cache template.");
                    m102717a(cVar, cVar2, true, false);
                } else {
                    C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> doesn't use cache. current template is:" + this.f70349b);
                }
                return;
            }
            if (cVar2.mo100630f()) {
                this.f70358k = true;
                if (cVar2.mo100626c()) {
                    if (this.f70349b == null) {
                        C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> use net template.");
                        m102717a(cVar, cVar2, true, true);
                        return;
                    }
                    if (TextUtils.equals(cVar.f69303a, this.f70349b.f69303a)) {
                        if (TextUtils.equals(cVar.f69304b, this.f70349b.f69304b)) {
                            C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> same template return.");
                        }
                    }
                    if (this.f70353f.get()) {
                        this.f70353f.set(false);
                        C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> update template.");
                        m102717a(cVar, cVar2, true, true);
                    } else if (!this.f70354g && this.f70355h != null) {
                        C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> need confirm update template.");
                        this.f70359l = cVar.clone();
                        this.f70360m = cVar2.clone();
                        this.f70354g = this.f70355h.mo100006a();
                    }
                } else if (cVar2.mo100628d()) {
                    if (this.f70349b == null) {
                        C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> data error and current is null. update to error.");
                        m102717a(null, cVar2, false, false);
                    } else {
                        C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> data error but current is not null. return.");
                    }
                } else if (cVar2.mo100631g()) {
                    C28184h.m103250d("WorkplaceTemplateService", "dispatchData>>> client update.");
                    m102717a(cVar, cVar2, true, true);
                }
            }
        }
    }

    public C28091f(Context context, OPTrace oPTrace, C27733c cVar) {
        this(context, oPTrace);
        this.f70362o = cVar;
    }

    /* renamed from: a */
    public C28243c mo99995a(String str, String str2, C28242b bVar) {
        if (!bVar.mo100622a()) {
            C28184h.m103250d("WorkplaceTemplateService", "parseTemplate>>> template schema invalid:" + bVar.f70877a);
            return new C28243c(null, -1);
        }
        bVar.f70878b.templateId = str;
        bVar.f70878b.md5 = str2;
        return new C28243c(bVar.f70878b, 0);
    }

    /* renamed from: a */
    private void m102717a(C27733c cVar, C28243c cVar2, boolean z, boolean z2) {
        if (!(cVar2 == null || cVar == null)) {
            cVar2.f70880b = cVar.f69305c;
        }
        this.f70351d.mo5926a(cVar2);
        if (z) {
            this.f70349b = cVar;
            this.f70362o = null;
            C28184h.m103250d("WorkplaceTemplateService", "updateTemplate>>> update Template. currentTemplateInfo:" + cVar);
        } else {
            C28184h.m103250d("WorkplaceTemplateService", "updateTemplate>>> doesn't update Template. currentTemplateInfo:" + cVar);
        }
        if (z2) {
            this.f70356i.mo233095a(m102724i(), C27579g.f68797a.toJson(new C27732b(cVar, cVar2)));
            C28184h.m103250d("WorkplaceTemplateService", "updateTemplate>>> update cache.");
        }
    }
}
