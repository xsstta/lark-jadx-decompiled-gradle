package com.bytedance.ee.bear.document.offline.sync;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.offline.OfflineCacheConfig;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c;
import com.bytedance.ee.bear.document.offline.sync.htmlcache.C5991a;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6009a;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6022c;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockModel;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a.C6013a;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a.C6017e;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.l */
public class C6002l {

    /* renamed from: a */
    public static final Long f16803a = 20L;

    /* renamed from: b */
    public static OfflineCacheConfig f16804b;

    /* renamed from: c */
    private ConnectionService f16805c;

    /* renamed from: d */
    private LiveData<ConnectionService.NetworkState> f16806d;

    /* renamed from: e */
    private C10917c f16807e;

    /* renamed from: f */
    private AbstractC5993c f16808f;

    /* renamed from: g */
    private C5999k f16809g;

    /* renamed from: h */
    private C6017e f16810h;

    /* renamed from: i */
    private C6022c f16811i;

    /* renamed from: j */
    private AbstractC1178x<ConnectionService.NetworkState> f16812j;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.l$a */
    public static class C6004a {

        /* renamed from: a */
        static C6002l f16814a = new C6002l(null);
    }

    /* renamed from: a */
    public static C6002l m24300a() {
        return C6004a.f16814a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m24301d() {
        this.f16806d.mo5925a(this.f16812j);
    }

    /* renamed from: c */
    public void mo24269c() {
        AbstractC5993c cVar = this.f16808f;
        if (cVar != null) {
            cVar.mo24247c();
        }
    }

    private C6002l() {
        this.f16812j = new AbstractC1178x<ConnectionService.NetworkState>() {
            /* class com.bytedance.ee.bear.document.offline.sync.C6002l.C60031 */

            /* renamed from: a */
            public void onChanged(ConnectionService.NetworkState networkState) {
                C6002l.this.mo24262a(networkState);
            }
        };
        mo24263a(new C10917c(new C10929e()));
    }

    /* renamed from: b */
    public void mo24267b() {
        C13479a.m54764b("PreloadManager", "clearData()...");
        AbstractC5993c cVar = this.f16808f;
        if (cVar != null) {
            cVar.mo24245b();
        }
        C5999k kVar = this.f16809g;
        if (kVar != null) {
            kVar.mo24256a();
        }
        C6017e eVar = this.f16810h;
        if (eVar != null) {
            eVar.mo24319b();
        }
        C6022c cVar2 = this.f16811i;
        if (cVar2 != null) {
            cVar2.mo24327b();
        }
    }

    /* synthetic */ C6002l(PreloadManager$1 preloadManager$1) {
        this();
    }

    /* renamed from: a */
    public void mo24265a(List<OfflineDoc> list) {
        C5999k kVar = this.f16809g;
        if (kVar != null) {
            kVar.mo24257a(list);
        }
    }

    /* renamed from: b */
    public void mo24268b(List<OfflineDoc> list) {
        AbstractC5993c cVar = this.f16808f;
        if (cVar != null) {
            cVar.mo24244a(list);
        }
    }

    /* renamed from: a */
    public void mo24261a(AccountService.Account account) {
        if (account != null && account.mo19677a()) {
            C6005m.m24312a().mo24272a(account);
            C6017e eVar = this.f16810h;
            if (eVar != null) {
                eVar.mo24315a(account);
            }
            C6022c cVar = this.f16811i;
            if (cVar != null) {
                cVar.mo24323a(account);
            }
        }
    }

    /* renamed from: a */
    public void mo24262a(ConnectionService.NetworkState networkState) {
        if (networkState != null && networkState.mo20041b()) {
            AbstractC5993c cVar = this.f16808f;
            if (cVar != null) {
                cVar.mo24242a(networkState);
            }
            C6017e eVar = this.f16810h;
            if (eVar != null) {
                eVar.mo24316a(networkState);
            }
            C6022c cVar2 = this.f16811i;
            if (cVar2 != null) {
                cVar2.mo24324a(networkState);
            }
        }
    }

    /* renamed from: a */
    public void mo24266a(SubBlockModel... subBlockModelArr) {
        C6022c cVar = this.f16811i;
        if (cVar != null) {
            cVar.mo24326a(subBlockModelArr);
        }
    }

    /* renamed from: a */
    public void mo24263a(C10917c cVar) {
        this.f16807e = cVar;
        f16804b = (OfflineCacheConfig) C4211a.m17514a().mo16532a("offline_cache_config", OfflineCacheConfig.class, new OfflineCacheConfig());
        this.f16808f = new C5991a(new C6009a(this.f16807e), this.f16807e);
        this.f16809g = new C5999k(this.f16807e);
        this.f16810h = new C6017e(cVar, f16804b.isPreload_image_only_wifi());
        this.f16811i = new C6022c(cVar);
        mo24261a(((an) KoinJavaComponent.m268610a(an.class)).mo16408f());
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(new PreloadManager$1(this));
        this.f16808f.mo24241a();
        this.f16810h.mo24249a();
        this.f16811i.mo24249a();
        ConnectionService d = C5084ad.m20847d();
        this.f16805c = d;
        this.f16806d = d.mo20037a();
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$l$dSw9wiaM7fU8Gjct75zA0TTUUU */

            public final void run() {
                C6002l.this.m24301d();
            }
        });
    }

    /* renamed from: a */
    public void mo24264a(String str, String str2, int i, List<SubBlockModel> list) {
        if (this.f16810h != null) {
            this.f16810h.mo24317a(new C6013a(str, str2, list, i));
        }
    }
}
