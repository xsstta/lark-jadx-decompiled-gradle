package com.ss.android.lark.player.p2511a;

import com.ss.android.lark.player.p2511a.AbstractC52087i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.player.a.l */
public final class C52093l implements AbstractC52087i {

    /* renamed from: a */
    private Map<String, AbstractC52086h> f129263a;

    /* renamed from: b */
    private List<AbstractC52086h> f129264b;

    /* renamed from: c */
    private List<AbstractC52087i.AbstractC52090c> f129265c;

    /* renamed from: d */
    private C52083e f129266d;

    public C52093l() {
        this(null);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52087i
    /* renamed from: a */
    public void mo178459a(AbstractC52087i.AbstractC52088a aVar) {
        mo178460a((AbstractC52087i.AbstractC52089b) null, aVar);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52087i
    /* renamed from: b */
    public void mo178462b(AbstractC52087i.AbstractC52090c cVar) {
        this.f129265c.remove(cVar);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52087i
    /* renamed from: a */
    public void mo178461a(AbstractC52087i.AbstractC52090c cVar) {
        if (!this.f129265c.contains(cVar)) {
            this.f129265c.add(cVar);
        }
    }

    public C52093l(C52083e eVar) {
        this.f129263a = new ConcurrentHashMap(8);
        this.f129264b = Collections.synchronizedList(new ArrayList());
        this.f129265c = new CopyOnWriteArrayList();
        if (eVar == null) {
            this.f129266d = new C52083e();
        } else {
            this.f129266d = eVar;
        }
    }

    /* renamed from: b */
    private void m202071b(String str, AbstractC52086h hVar) {
        for (AbstractC52087i.AbstractC52090c cVar : this.f129265c) {
            cVar.mo178463a(str, hVar);
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52087i
    /* renamed from: a */
    public void mo178460a(AbstractC52087i.AbstractC52089b bVar, AbstractC52087i.AbstractC52088a aVar) {
        for (AbstractC52086h hVar : this.f129264b) {
            if (bVar == null || bVar.mo178458a(hVar)) {
                aVar.mo178457a(hVar);
            }
        }
    }

    /* renamed from: a */
    public void mo178468a(String str, AbstractC52086h hVar) {
        ((AbstractC52071b) hVar).mo178439a(str);
        hVar.mo178436a(this);
        hVar.mo127010a();
        this.f129263a.put(str, hVar);
        this.f129264b.add(hVar);
        m202071b(str, hVar);
    }
}
