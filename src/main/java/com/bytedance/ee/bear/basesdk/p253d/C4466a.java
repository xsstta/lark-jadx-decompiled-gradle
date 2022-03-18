package com.bytedance.ee.bear.basesdk.p253d;

import com.bytedance.ee.log.C13479a;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.d.a */
public final class C4466a {

    /* renamed from: com.bytedance.ee.bear.basesdk.d.a$b */
    public interface AbstractC4468b {
        void onAppUserConfigChange(C4467a aVar);
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.d.a$c */
    private static final class C4469c {

        /* renamed from: a */
        public static final C4466a f13145a = new C4466a();
    }

    /* renamed from: b */
    public static C4466a m18475b() {
        return C4469c.f13145a;
    }

    /* renamed from: a */
    public C4467a mo17234a() {
        return ((AbstractC4470b) KoinJavaComponent.m268610a(AbstractC4470b.class)).mo17237a();
    }

    /* renamed from: a */
    public void mo17235a(AbstractC4468b bVar) {
        boolean z;
        AbstractC4470b bVar2 = (AbstractC4470b) KoinJavaComponent.m268610a(AbstractC4470b.class);
        StringBuilder sb = new StringBuilder();
        sb.append("registerAppUserConfigChangeListener, appUserConfigAgent null?: ");
        if (bVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("AppUserConfigImpl", sb.toString());
        if (bVar2 != null && bVar != null) {
            bVar2.mo17238a(bVar);
        }
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.d.a$a */
    public static final class C4467a {

        /* renamed from: a */
        public final Map<Integer, String> f13143a;

        /* renamed from: b */
        public final String f13144b;

        public C4467a(Map<Integer, String> map, String str) {
            this.f13143a = map;
            this.f13144b = str;
        }
    }
}
