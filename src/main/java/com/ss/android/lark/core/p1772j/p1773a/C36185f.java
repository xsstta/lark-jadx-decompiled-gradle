package com.ss.android.lark.core.p1772j.p1773a;

import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.platform.ac.C51661a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.j.a.f */
public class C36185f implements AbstractC44136a.AbstractC44173y {

    /* renamed from: a */
    private static Map<AbstractC44136a.AbstractC44173y.AbstractC44174a, az> f93417a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44173y
    /* renamed from: a */
    public boolean mo133429a() {
        return C51661a.m200388a().mo195609d();
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44173y
    /* renamed from: a */
    public void mo133428a(final AbstractC44136a.AbstractC44173y.AbstractC44174a aVar) {
        if (aVar != null) {
            C361861 r0 = new az() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36185f.C361861 */

                @Override // com.ss.android.lark.biz.core.api.az
                /* renamed from: a */
                public void mo105622a(boolean z) {
                    aVar.mo157137a(z);
                }

                @Override // com.ss.android.lark.biz.core.api.az
                /* renamed from: b */
                public void mo105623b(boolean z) {
                    aVar.mo157138b(z);
                }
            };
            C51661a.m200388a().mo195604a(r0);
            f93417a.put(aVar, r0);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44173y
    /* renamed from: b */
    public void mo133430b(AbstractC44136a.AbstractC44173y.AbstractC44174a aVar) {
        if (aVar != null) {
            C51661a.m200388a().mo195607b(f93417a.remove(aVar));
        }
    }
}
