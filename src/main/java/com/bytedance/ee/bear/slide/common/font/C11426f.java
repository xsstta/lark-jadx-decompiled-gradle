package com.bytedance.ee.bear.slide.common.font;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.slide.common.font.C11420b;
import com.bytedance.ee.bear.slide.common.font.C11426f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13602d;
import com.larksuite.framework.utils.C26317s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.slide.common.font.f */
public class C11426f implements C11420b.AbstractC11422a {

    /* renamed from: a */
    private static C11426f f30717a;

    /* renamed from: b */
    private final C11420b f30718b;

    /* renamed from: c */
    private final C11425e f30719c;

    /* renamed from: d */
    private final LiveData<ConnectionService.NetworkState> f30720d;

    /* renamed from: e */
    private ArrayList<C11423c> f30721e = new ArrayList<>();

    /* renamed from: f */
    private AbstractC1178x<ConnectionService.NetworkState> f30722f;

    /* renamed from: g */
    private String f30723g;

    /* renamed from: h */
    private String f30724h;

    /* renamed from: i */
    private final Handler f30725i;

    /* renamed from: j */
    private PersistenceSharedPreference f30726j;

    /* renamed from: k */
    private C11430h f30727k;

    /* renamed from: com.bytedance.ee.bear.slide.common.font.f$a */
    public interface AbstractC11427a {
        /* renamed from: a */
        void mo43786a();

        /* renamed from: a */
        void mo43787a(long j, C11419a aVar);

        /* renamed from: a */
        void mo43788a(C11419a aVar);

        /* renamed from: a */
        void mo43789a(String str);

        /* renamed from: a */
        void mo43790a(List<C11419a> list);
    }

    /* renamed from: a */
    public boolean mo43783a(List<C11419a> list) {
        return this.f30718b.mo43759b(list);
    }

    /* renamed from: a */
    public void mo43782a(List<C11419a> list, AbstractC11427a aVar, boolean z) {
        if (!C26317s.m95316a(list)) {
            if (this.f30725i.getLooper() != Looper.myLooper()) {
                this.f30725i.post(new Runnable(list, aVar, z) {
                    /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$Sgz49SkRTt3oP8roFKrMGGIJ1R4 */
                    public final /* synthetic */ List f$1;
                    public final /* synthetic */ C11426f.AbstractC11427a f$2;
                    public final /* synthetic */ boolean f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C11426f.this.m47504c(this.f$1, this.f$2, this.f$3);
                    }
                });
            } else {
                m47501b(new ArrayList(list), aVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo43781a(List<C11419a> list, AbstractC11427a aVar) {
        if (this.f30725i.getLooper() != Looper.myLooper()) {
            this.f30725i.post(new Runnable(list, aVar) {
                /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$DODTPvBZKTOKc2GjEeaWpPOI8s */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ C11426f.AbstractC11427a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C11426f.this.m47500b((C11426f) this.f$1, (List) this.f$2);
                }
            });
        } else {
            mo43782a(list, aVar, false);
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11420b.AbstractC11422a
    /* renamed from: a */
    public void mo43764a(String str, List<C11419a> list) {
        this.f30725i.post(new Runnable() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$7bpoCq9w2CLM6w_ExwDkCJYErPE */

            public final void run() {
                C11426f.this.m47505e();
            }
        });
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11420b.AbstractC11422a
    /* renamed from: a */
    public void mo43763a(C11419a aVar) {
        this.f30726j.mo34037a(aVar.mo43748e(), aVar.mo43751f());
        this.f30725i.post(new Runnable(aVar) {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$5czfT_TQIDfA854ZDD4xNtQYo */
            public final /* synthetic */ C11419a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C11426f.this.m47503c(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo43780a(String str) {
        this.f30725i.post(new Runnable(str) {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$BEjYXUehM5smXnHia0klXAr59fs */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C11426f.this.m47499b((C11426f) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo43778a(AbstractC11427a aVar) {
        Iterator<C11423c> it = this.f30721e.iterator();
        while (it.hasNext()) {
            if (it.next().mo43770b() == aVar) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo43779a(AbstractC11427a aVar, List<C11419a> list) {
        ArrayList arrayList = new ArrayList(list);
        Iterator<C11423c> it = this.f30721e.iterator();
        while (it.hasNext()) {
            C11423c next = it.next();
            if (next.mo43770b() != aVar) {
                arrayList.removeAll(next.mo43771c());
            }
        }
        this.f30718b.mo43760c(arrayList);
    }

    /* renamed from: d */
    public void mo43785d() {
        this.f30727k.mo43796a();
    }

    /* renamed from: c */
    public static synchronized C11426f m47502c() {
        C11426f fVar;
        synchronized (C11426f.class) {
            fVar = f30717a;
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m47507g() {
        this.f30721e.clear();
        this.f30720d.mo5928b(this.f30722f);
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11420b.AbstractC11422a
    /* renamed from: b */
    public void mo43765b() {
        this.f30725i.post(new Runnable() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$irne1skV_T2e_6ozF7ZOV4xaUgc */

            public final void run() {
                C11426f.this.m47506f();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m47505e() {
        Iterator<C11423c> it = this.f30721e.iterator();
        while (it.hasNext()) {
            it.next().mo43773e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m47506f() {
        this.f30720d.mo5928b(this.f30722f);
        this.f30720d.mo5925a(this.f30722f);
        Iterator<C11423c> it = this.f30721e.iterator();
        while (it.hasNext()) {
            it.next().mo43772d();
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11420b.AbstractC11422a
    /* renamed from: a */
    public void mo43761a() {
        this.f30725i.post(new Runnable() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$XjyZxNIXIiEAh17ElkevcZDTUPw */

            public final void run() {
                C11426f.this.m47507g();
            }
        });
    }

    /* renamed from: a */
    private void m47496a(C11423c cVar) {
        mo43779a(cVar.mo43770b(), cVar.mo43771c());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m47503c(C11419a aVar) {
        Iterator<C11423c> it = this.f30721e.iterator();
        while (it.hasNext()) {
            it.next().mo43767a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m47499b(String str) {
        Iterator<C11423c> it = this.f30721e.iterator();
        while (it.hasNext()) {
            it.next().mo43768a(str);
        }
    }

    /* renamed from: a */
    private void m47494a(Context context) {
        this.f30723g = new File(CCMStorage.m21714b(context, Biz.DOCS), "font").getAbsolutePath();
        this.f30724h = new File(CCMStorage.m21712a(context, Biz.DOCS), "font").getAbsolutePath();
        this.f30726j = new PersistenceSharedPreference("docs_slide_font");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47495a(ConnectionService.NetworkState networkState) {
        if (networkState != null && networkState.mo20043d() && this.f30718b.mo43758b()) {
            Iterator<C11423c> it = this.f30721e.iterator();
            while (it.hasNext()) {
                C11423c next = it.next();
                if (next.mo43769a()) {
                    m47496a(next);
                }
            }
        }
    }

    /* renamed from: b */
    public int mo43784b(C11419a aVar) {
        if (!TextUtils.equals((CharSequence) this.f30726j.mo34038b(aVar.mo43748e(), ""), aVar.mo43751f())) {
            return 0;
        }
        if (!new File(this.f30723g, m47493a(aVar.mo43748e(), aVar.mo43741b(), aVar.mo43746d(), aVar.mo43751f())).exists()) {
            return 0;
        }
        C13479a.m54772d("FontManage", " has downloaded  " + aVar.mo43748e());
        return 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m47500b(List list, AbstractC11427a aVar) {
        mo43782a(list, aVar, false);
    }

    /* renamed from: a */
    public WebResourceResponse mo43776a(String str, Map<String, String> map) {
        return this.f30719c.mo43775a(str, map);
    }

    /* renamed from: a */
    public static synchronized C11426f m47492a(Context context, ConnectionService connectionService) {
        synchronized (C11426f.class) {
            C11426f fVar = f30717a;
            if (fVar != null) {
                return fVar;
            }
            C11426f fVar2 = new C11426f(context, connectionService);
            f30717a = fVar2;
            return fVar2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m47498b(long j, C11419a aVar) {
        Iterator<C11423c> it = this.f30721e.iterator();
        while (it.hasNext()) {
            it.next().mo43766a(j, aVar);
        }
    }

    private C11426f(Context context, ConnectionService connectionService) {
        this.f30725i = new Handler(context.getMainLooper());
        this.f30720d = connectionService.mo20037a();
        m47494a(context);
        C11430h hVar = new C11430h();
        this.f30727k = hVar;
        this.f30718b = new C11420b(this.f30723g, this.f30724h, hVar, this);
        this.f30722f = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$myWwNYlvFevN5ZAzBjp_3B_huXA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11426f.this.m47495a((C11426f) ((ConnectionService.NetworkState) obj));
            }
        };
        this.f30719c = new C11425e(this.f30723g, this);
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11420b.AbstractC11422a
    /* renamed from: a */
    public void mo43762a(long j, C11419a aVar) {
        this.f30725i.post(new Runnable(j, aVar) {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$l4H_lIfcz0ho_wYzF8TawiEPnKU */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ C11419a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C11426f.this.m47498b((C11426f) this.f$1, (long) this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo43777a(DocViewModel docViewModel, AbstractC5233x xVar) {
        this.f30727k.mo43797a(docViewModel, xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m47504c(List list, AbstractC11427a aVar, boolean z) {
        m47501b(new ArrayList(list), aVar, z);
    }

    /* renamed from: b */
    private void m47501b(List<C11419a> list, AbstractC11427a aVar, boolean z) {
        C11423c cVar = new C11423c(aVar, list, z);
        this.f30721e.add(cVar);
        Iterator<C11419a> it = list.iterator();
        while (it.hasNext()) {
            C11419a next = it.next();
            if (mo43784b(next) == 2) {
                this.f30725i.post(new Runnable(next) {
                    /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$f$zNcgdz8fu0HO0zdT2kpVfNZhC6E */
                    public final /* synthetic */ C11419a f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C11423c.this.mo43767a((C11423c) this.f$1);
                    }
                });
                it.remove();
            }
        }
        this.f30718b.mo43756a(list);
    }

    /* renamed from: a */
    private String m47493a(String str, String str2, String str3, String str4) {
        if (!"1".equals(str3)) {
            return str;
        }
        if (TextUtils.isEmpty(str4)) {
            return C13602d.m55222a(str2);
        }
        return str4;
    }
}
