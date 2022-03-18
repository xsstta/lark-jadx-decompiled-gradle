package com.bytedance.ee.bear.basesdk.apiimpl;

import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.ee.bear.basesdk.api.IDarkMode;
import com.bytedance.ee.bear.basesdk.apisupport.C4438x;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.darkmode.AbstractC5128c;
import com.bytedance.ee.bear.document.p302c.C5683b;
import com.bytedance.ee.bear.integrator.p399a.C7870a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import com.ss.android.lark.util.share_preference.C57744a;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.f */
public final class C4400f implements IDarkMode, C7870a.AbstractC7873b {

    /* renamed from: a */
    private final C10929e f13009a;

    /* renamed from: b */
    private void m18145b() {
        C13479a.m54764b("DarkModeImpl", "reloadCacheViews: processName = " + C13629i.m55303b(C13615c.f35773a) + " isAlive = " + C4438x.m18352d());
        new C10917c(this.f13009a).mo41508c(AbstractC5094ag.class).mo238020d($$Lambda$f$JHwsiddGaLEvbSnzJUjsNgIQ_w.INSTANCE).mo238001b($$Lambda$f$abJDYOGk7v1cHfrqLmCNtsYmZg.INSTANCE, $$Lambda$f$WtPTrwrN9HUYIFF0vBFt9ZdncTE.INSTANCE);
    }

    /* renamed from: a */
    public int mo17107a() {
        return C57744a.m224104a().getInt("night_mode", 0);
    }

    public C4400f(C10929e eVar) {
        this.f13009a = eVar;
    }

    /* renamed from: a */
    private int m18139a(Configuration configuration) {
        int i = configuration.uiMode & 48;
        if (i == 16) {
            return 2;
        }
        if (i != 32) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    private void m18142a(int i) {
        C13479a.m54764b("DarkModeImpl", "notifyDarkModeChangedListeners: " + i);
        new C10917c(this.f13009a).mo41508c(AbstractC5128c.class).mo238020d(new Function(i) {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$f$NQGjnxcMUfklOzX8GOVXmsFkleo */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC5128c) obj).notifyDarkModeChangedListeners(this.f$0);
            }
        }).mo238001b($$Lambda$f$7kEq6XKrYpD3Dxn8jAZFmTseX0A.INSTANCE, $$Lambda$f$TFFqLrVQm1CuLRx1DYelG0fJtmQ.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.IDarkMode
    /* renamed from: a */
    public void mo17015a(Context context, int i) {
        C13479a.m54764b("DarkModeImpl", "onAppDarkModeChanged: processName = " + C13629i.m55303b(context) + " isAlive = " + C4438x.m18352d());
        m18142a(i);
        m18145b();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.IDarkMode, com.bytedance.ee.bear.integrator.p399a.C7870a.AbstractC7873b
    /* renamed from: a */
    public void mo17016a(Context context, Configuration configuration) {
        C13479a.m54764b("DarkModeImpl", "onConfigurationChanged: processName = " + C13629i.m55303b(context) + " isAlive = " + C4438x.m18352d());
        int a = mo17107a();
        if (a != m18139a(configuration)) {
            if (C13629i.m55308c() && C4438x.m18352d()) {
                m18142a(a);
                m18145b();
            } else if (C13629i.m55309d(context)) {
                C13479a.m54764b("DarkModeImpl", "reloadCacheViews in main process");
                C5683b.m23048b(context);
            }
        }
    }
}
