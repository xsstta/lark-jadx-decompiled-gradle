package com.bytedance.ee.bear.basesdk.p253d;

import com.bytedance.ee.log.C13479a;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.basesdk.d.f */
public final class C4475f {

    /* renamed from: a */
    private AbstractC4473d f13146a;

    /* renamed from: com.bytedance.ee.bear.basesdk.d.f$a */
    public interface AbstractC4476a {
        void onLanguageChange(Locale locale, Locale locale2);
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.d.f$b */
    private static final class C4477b {

        /* renamed from: a */
        public static final C4475f f13147a = new C4475f();
    }

    /* renamed from: a */
    public static C4475f m18484a() {
        return C4477b.f13147a;
    }

    /* renamed from: a */
    public void mo17244a(AbstractC4473d dVar) {
        this.f13146a = dVar;
    }

    /* renamed from: a */
    public void mo17245a(AbstractC4476a aVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("registerLanguageChangeListener, languageSettingAgent null?: ");
        if (this.f13146a == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("LanguageSettingImpl", sb.toString());
        AbstractC4473d dVar = this.f13146a;
        if (dVar != null && aVar != null) {
            dVar.mo17241a(aVar);
        }
    }
}
