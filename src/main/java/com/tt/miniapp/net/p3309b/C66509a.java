package com.tt.miniapp.net.p3309b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p625b.C12799a;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p625b.C12803c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.net.b.a */
public class C66509a {

    /* renamed from: a */
    public final Object f167899a = new Object();

    /* renamed from: a */
    public static C66509a m259907a() {
        return ContextSingletonInstance.getInstance().getNetDnsResolver();
    }

    /* renamed from: a */
    public List<InetAddress> mo232078a(String str) {
        return C12799a.m52885a().mo48358a(str);
    }

    /* renamed from: b */
    private List<InetAddress> m259908b(String str, IAppContext iAppContext) {
        ArrayList arrayList = new ArrayList();
        C12803c a = C12803c.m52891a(C66434g.m259707a().mo231985a("https://dig.bdurl.net/q?host=" + str, iAppContext).mo48466d());
        if (a != null) {
            return a.f34183c;
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<InetAddress> mo232079a(String str, IAppContext iAppContext) {
        List<InetAddress> a = mo232078a(str);
        if (a == null || a.size() == 0) {
            List<InetAddress> b = m259908b(str, iAppContext);
            if (b != null && b.size() > 0) {
                C12799a.m52885a().mo48359a(str, b);
            }
            return b;
        }
        AppBrandLogger.m52830i("tma_NetDnsResolver", "hit cache, domain=" + str);
        return a;
    }
}
