package com.ss.android.lark.integrator.im.p2029i.p2030a;

import com.ss.android.lark.feed.interfaces.AbstractC38091b;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.i.a.c */
public class C39659c implements AbstractC38037a.AbstractC38043c {

    /* renamed from: a */
    private Map<AbstractC38091b, AbstractC29417b.AbstractC29418a> f101171a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38043c
    /* renamed from: a */
    public void mo139225a(final AbstractC38091b bVar) {
        if (bVar != null) {
            C396601 r0 = new AbstractC29417b.AbstractC29419b() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39659c.C396601 */

                @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b.AbstractC29419b
                /* renamed from: a */
                public void mo104292a() {
                    bVar.mo138515a();
                }

                @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b.AbstractC29418a
                public void OnAppStateChanged(boolean z) {
                    bVar.mo138516a(z);
                }
            };
            this.f101171a.put(bVar, r0);
            C29410a.m108289c().mo104284a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38043c
    /* renamed from: b */
    public void mo139226b(AbstractC38091b bVar) {
        if (bVar != null) {
            C29410a.m108289c().mo104286b(this.f101171a.remove(bVar));
        }
    }
}
