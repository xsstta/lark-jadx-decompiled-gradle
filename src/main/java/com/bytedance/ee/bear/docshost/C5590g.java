package com.bytedance.ee.bear.docshost;

import com.bytedance.ee.bear.contract.p279c.AbstractC5118a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.docshost.g */
public class C5590g implements AbstractC5589f {

    /* renamed from: a */
    private static AbstractC5118a f15836a;

    /* renamed from: com.bytedance.ee.bear.docshost.g$a */
    private static class C5591a {

        /* renamed from: a */
        static C5590g f15837a = new C5590g();
    }

    /* renamed from: a */
    public static AbstractC5589f m22626a() {
        return C5591a.f15837a;
    }

    /* renamed from: a */
    public static void m22627a(AbstractC5118a aVar) {
        f15836a = aVar;
    }

    @Override // com.bytedance.ee.bear.docshost.AbstractC5589f
    /* renamed from: a */
    public void mo22270a(String str, float f) {
        AbstractC5118a aVar = f15836a;
        if (aVar != null) {
            aVar.mo20223a(str, f);
        } else {
            C13479a.m54775e("AbsMonitorServiceImp", "monitorSLA: monitor agent is null");
        }
    }
}
