package com.bytedance.ee.bear.browser;

import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.browser.m */
public class C4935m {

    /* renamed from: a */
    private AbstractC4931i f14494a;

    /* renamed from: b */
    private List<AbstractC4934l> f14495b = new ArrayList();

    /* renamed from: c */
    private AbstractC4928g f14496c;

    /* renamed from: a */
    public void mo19449a() {
        C13479a.m54764b("WebServiceManager", "onWebBringToFront");
        for (AbstractC4934l lVar : this.f14495b) {
            lVar.mo19342a(this.f14494a, true);
        }
    }

    /* renamed from: b */
    public void mo19452b() {
        C13479a.m54764b("WebServiceManager", "onWebBringToBackground");
        for (AbstractC4934l lVar : this.f14495b) {
            lVar.mo19342a(this.f14494a, false);
        }
    }

    /* renamed from: c */
    public void mo19453c() {
        C13479a.m54764b("WebServiceManager", "onDestroy");
        Iterator<AbstractC4934l> it = this.f14495b.iterator();
        while (it.hasNext()) {
            it.remove();
            m20359c(it.next());
        }
        this.f14494a = null;
    }

    /* renamed from: a */
    public void mo19451a(AbstractC4934l lVar) {
        if (!this.f14495b.contains(lVar)) {
            this.f14495b.add(lVar);
            m20358b(lVar);
        }
    }

    /* renamed from: b */
    private void m20358b(AbstractC4934l lVar) {
        if (this.f14494a == null) {
            C13479a.m54758a("WebServiceManager", "onAttachWebService WEB NULL");
            return;
        }
        C13479a.m54764b("WebServiceManager", "onAttachWebService:" + lVar);
        lVar.mo19340a(this.f14496c, this.f14494a);
    }

    /* renamed from: c */
    private void m20359c(AbstractC4934l lVar) {
        if (this.f14494a == null) {
            C13479a.m54758a("WebServiceManager", "onDetachWebService WEB NULL");
            return;
        }
        C13479a.m54764b("WebServiceManager", "onDetachWebService:" + lVar);
        lVar.mo19341a(this.f14494a);
    }

    /* renamed from: a */
    public void mo19450a(AbstractC4928g gVar, AbstractC4931i iVar, List<AbstractC4934l> list) {
        C13479a.m54764b("WebServiceManager", "onCreate");
        this.f14494a = iVar;
        this.f14496c = gVar;
        if (list != null) {
            for (AbstractC4934l lVar : list) {
                mo19451a(lVar);
            }
        }
    }
}
