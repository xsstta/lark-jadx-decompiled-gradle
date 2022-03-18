package com.bytedance.ee.bear.document;

import android.app.Application;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.browser.AbstractC4936n;
import com.bytedance.ee.bear.browser.C4935m;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.document.p311h.C5813c;
import com.bytedance.ee.bear.document.rnsync.DocRnImpl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.h */
public class C5810h implements AbstractC5089af {

    /* renamed from: a */
    private Application f16319a = C13615c.f35773a;

    /* renamed from: b */
    private ak f16320b;

    /* renamed from: c */
    private C5813c f16321c;

    /* renamed from: d */
    private final List<AbstractC5089af.AbstractC5093d> f16322d = new ArrayList();

    /* renamed from: e */
    private final List<AbstractC5089af.AbstractC5090a> f16323e = new ArrayList();

    /* renamed from: f */
    private C4935m f16324f = new C4935m();

    public C5810h() {
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40249a(new DocRnImpl());
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public void mo20183a() {
        C13479a.m54772d("DocWebServiceImp", "export()... ");
        for (AbstractC5089af.AbstractC5090a aVar : this.f16323e) {
            aVar.onRequestExport();
        }
    }

    /* renamed from: c */
    private String m23399c() {
        String str = "https://" + C6313i.f17509a + C6313i.m25327a().mo25393d();
        if (DocOpenConfig.m22764e() && Build.VERSION.SDK_INT < 24) {
            str = "http://" + C6313i.f17509a + C6313i.m25327a().mo25393d();
        }
        C13479a.m54764b("DocWebServiceImp", "getPreloadUrl: url = " + str);
        return str;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: b */
    public void mo20191b() {
        C13479a.m54764b("DocWebServiceImp", "destroy webView");
        if (this.f16320b != null) {
            ak.m22926c();
        }
        this.f16320b = null;
        C4935m mVar = this.f16324f;
        if (mVar != null) {
            mVar.mo19453c();
        }
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40255b();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public void mo20185a(AbstractC5089af.AbstractC5090a aVar) {
        this.f16323e.remove(aVar);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: b */
    public void mo20194b(AbstractC5089af.AbstractC5093d dVar) {
        this.f16322d.remove(dVar);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public void mo20186a(AbstractC5089af.AbstractC5091b bVar) {
        m23398a(this.f16319a);
        ak.m22924b().mo22326a(bVar);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: b */
    public void mo20193b(AbstractC5089af.AbstractC5090a aVar) {
        if (!this.f16323e.contains(aVar)) {
            this.f16323e.add(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo20182a(boolean z) {
        C13479a.m54764b("DocWebServiceImp", "preloadTemplate=== start");
        if (this.f16320b != null) {
            ak.m22926c();
        }
        this.f16320b = null;
        C4935m mVar = this.f16324f;
        if (mVar != null) {
            mVar.mo19453c();
        }
        this.f16321c = null;
        return mo20190b(z);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo20190b(boolean z) {
        C13479a.m54764b("DocWebServiceImp", "preloadTemplate=== start preloadTemplateNotDestroyWebview");
        if (this.f16320b == null || this.f16321c == null) {
            C13479a.m54764b("DocWebServiceImp", "preloadTemplateNotDestroyWebview init");
            m23398a(this.f16319a);
            this.f16321c = new C5813c(ak.m22924b());
        }
        DocBridgeWebViewV2.f15843k = System.currentTimeMillis();
        return this.f16321c.mo23370a(z, m23399c());
    }

    /* renamed from: a */
    private void m23398a(Application application) {
        C13479a.m54772d("DocWebServiceImp", "initWebViewHolder()...");
        if (this.f16320b == null) {
            C13479a.m54772d("DocWebServiceImp", "initWebViewHolder()... viewholder is null, need init");
            try {
                this.f16320b = new ak(application, ar.m20936a());
                C13479a.m54772d("DocWebServiceImp", "initWebViewHolder()...checkWebViewHolder end");
                this.f16324f = new C4935m();
                this.f16324f.mo19450a(new C5631af(), ak.m22924b().mo22342c(), ((AbstractC4936n) KoinJavaComponent.m268610a(AbstractC4936n.class)).mo17013a());
            } catch (Exception e) {
                C13479a.m54759a("DocWebServiceImp", "checkWebviewHolder: error", e);
                C13606d.m55245a("DocWebServiceImp", e);
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public void mo20184a(Fragment fragment) {
        AbstractC5625aa i = ((aj) fragment).mo22584i();
        if (i != null && i.mo22549a()) {
            C13479a.m54764b("DocWebServiceImp", "attach: container is already attached");
        } else if (i == null) {
            C13479a.m54758a("DocWebServiceImp", "attach: container is null");
        } else {
            if (this.f16320b == null) {
                m23398a(this.f16319a);
            }
            i.mo22548a(this.f16320b.mo22587a(), fragment);
            this.f16324f.mo19449a();
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: b */
    public void mo20192b(Fragment fragment) {
        AbstractC5625aa i = ((aj) fragment).mo22584i();
        if (i == null || !i.mo22549a()) {
            C13479a.m54764b("DocWebServiceImp", "detach: already detached");
            return;
        }
        i.mo22547a(fragment);
        this.f16324f.mo19452b();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public void mo20187a(AbstractC5089af.AbstractC5093d dVar) {
        if (!this.f16322d.contains(dVar)) {
            this.f16322d.add(dVar);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public void mo20188a(String str) {
        C13479a.m54772d("DocWebServiceImp", "docShot() size = " + this.f16322d.size());
        for (AbstractC5089af.AbstractC5093d dVar : this.f16322d) {
            dVar.onRequestSnapshot(str);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af
    /* renamed from: a */
    public void mo20189a(String str, AbstractC5089af.AbstractC5092c cVar) {
        C13479a.m54772d("DocWebServiceImp", "docShot() size = " + this.f16322d.size());
        for (AbstractC5089af.AbstractC5093d dVar : this.f16322d) {
            dVar.onRequestSnapshot(str, cVar);
        }
    }
}
