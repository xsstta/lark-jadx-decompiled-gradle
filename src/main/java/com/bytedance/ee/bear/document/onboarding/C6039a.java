package com.bytedance.ee.bear.document.onboarding;

import androidx.collection.ArrayMap;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.onboarding.a */
public class C6039a {

    /* renamed from: a */
    private ArrayMap<Class, AbstractC10397d> f16911a = new ArrayMap<>(2);

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.onboarding.a$a */
    public static class C6040a {

        /* renamed from: a */
        static C6039a f16912a = new C6039a();
    }

    /* renamed from: a */
    public static C6039a m24495a() {
        return C6040a.f16912a;
    }

    /* renamed from: b */
    public void mo24395b() {
        this.f16911a.clear();
    }

    /* renamed from: a */
    public AbstractC10397d mo24393a(Class cls) {
        AbstractC10397d remove = this.f16911a.remove(cls);
        if (remove != null) {
            C13479a.m54764b("DelayShowOnBoardingManager", "remove success " + cls.getSimpleName());
        } else {
            C13479a.m54772d("DelayShowOnBoardingManager", "has no element " + cls.getSimpleName());
        }
        return remove;
    }

    /* renamed from: a */
    public void mo24394a(AbstractC10397d dVar) {
        C13479a.m54764b("DelayShowOnBoardingManager", "put " + dVar.getClass().getSimpleName());
        this.f16911a.put(dVar.getClass(), dVar);
    }
}
