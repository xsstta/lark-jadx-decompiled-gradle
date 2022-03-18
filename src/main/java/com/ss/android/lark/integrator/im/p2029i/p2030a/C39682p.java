package com.ss.android.lark.integrator.im.p2029i.p2030a;

import com.ss.android.lark.biz.core.api.an;
import com.ss.android.lark.feed.interfaces.AbstractC38113w;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.C39603g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.i.a.p */
public class C39682p implements AbstractC38037a.AbstractC38061u {

    /* renamed from: a */
    private Map<AbstractC38113w, an> f101214a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38061u
    /* renamed from: a */
    public void mo139291a(final AbstractC38113w wVar) {
        if (wVar != null) {
            C396831 r0 = new an() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39682p.C396831 */

                @Override // com.ss.android.lark.biz.core.api.an
                /* renamed from: a */
                public void mo103104a() {
                    wVar.mo138517a();
                }

                @Override // com.ss.android.lark.biz.core.api.an
                /* renamed from: b */
                public void mo103105b() {
                    wVar.mo138518b();
                }
            };
            this.f101214a.put(wVar, r0);
            C39603g.m157159a().getCoreDependency().mo143469a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38061u
    /* renamed from: b */
    public void mo139292b(AbstractC38113w wVar) {
        if (wVar != null) {
            C39603g.m157159a().getCoreDependency().mo143539b(this.f101214a.remove(wVar));
        }
    }
}
