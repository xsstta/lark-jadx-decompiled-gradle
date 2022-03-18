package com.ss.android.lark.player.p2512b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.player.b.f */
public final class C52100f implements AbstractC52098d {

    /* renamed from: a */
    private AbstractC52101g f129269a;

    /* renamed from: b */
    private List<AbstractC52095a> f129270b = new CopyOnWriteArrayList();

    @Override // com.ss.android.lark.player.p2512b.AbstractC52098d
    /* renamed from: a */
    public void mo178472a() {
        for (AbstractC52095a aVar : this.f129270b) {
            aVar.mo178470a();
            aVar.mo178471b();
            aVar.mo178469a(null);
        }
        this.f129270b.clear();
    }

    public C52100f(AbstractC52101g gVar) {
        this.f129269a = gVar;
    }
}
