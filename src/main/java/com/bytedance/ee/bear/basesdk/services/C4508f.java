package com.bytedance.ee.bear.basesdk.services;

import android.content.Context;
import com.bytedance.ee.bear.contract.aj;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;

/* renamed from: com.bytedance.ee.bear.basesdk.services.f */
public class C4508f implements aj {

    /* renamed from: a */
    private static volatile AbstractC4509a f13195a;

    /* renamed from: b */
    private static volatile boolean f13196b;

    /* renamed from: com.bytedance.ee.bear.basesdk.services.f$a */
    public interface AbstractC4509a {
        /* renamed from: a */
        boolean mo17339a(Context context, String str) throws Exception;
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.services.f$b */
    private static final class C4510b {

        /* renamed from: a */
        static C4508f f13197a = new C4508f();
    }

    /* renamed from: a */
    public static aj m18583a() {
        return C4510b.f13197a;
    }

    /* renamed from: a */
    public static void m18584a(AbstractC4509a aVar) {
        f13195a = aVar;
        f13196b = true;
    }

    @Override // com.bytedance.ee.bear.contract.aj
    /* renamed from: a */
    public boolean mo17338a(String str) {
        boolean z = true;
        if (!f13196b) {
            C13479a.m54775e("AbsDynamicSoServiceImpl", "isLibrarySoReady() sHasInjectAgent IS false");
            return true;
        } else if (f13195a == null) {
            C13479a.m54775e("AbsDynamicSoServiceImpl", "isLibrarySoReady() sDynamicSoAgent IS NULL");
            return false;
        } else {
            try {
                if (f13195a.mo17339a(C13615c.f35773a, str)) {
                    z = false;
                }
                C13479a.m54764b("AbsDynamicSoServiceImpl", "isLibrarySoReady() isReady = " + z);
                return z;
            } catch (Throwable th) {
                C13479a.m54761a("AbsDynamicSoServiceImpl", th);
                return false;
            }
        }
    }
}
