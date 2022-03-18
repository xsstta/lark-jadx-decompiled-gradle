package com.bytedance.ee.lark.infra.network.p622a.p623a.p625b;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a.b.a */
public class C12799a {

    /* renamed from: b */
    private static AbstractC12790g<C12799a> f34177b = new AbstractC12790g<C12799a>() {
        /* class com.bytedance.ee.lark.infra.network.p622a.p623a.p625b.C12799a.C128001 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12799a mo48227b(Context... contextArr) {
            return new C12799a();
        }
    };

    /* renamed from: a */
    private ConcurrentHashMap<String, C12801a> f34178a;

    private C12799a() {
        this.f34178a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static C12799a m52885a() {
        return f34177b.mo48348c(new Context[0]);
    }

    /* renamed from: a */
    public List<InetAddress> mo48358a(String str) {
        C12801a aVar = this.f34178a.get(str);
        if (aVar != null) {
            return aVar.f34179a;
        }
        return null;
    }

    /* renamed from: com.bytedance.ee.lark.infra.network.a.a.b.a$a */
    static final class C12801a {

        /* renamed from: a */
        List<InetAddress> f34179a;

        /* renamed from: b */
        long f34180b;

        C12801a(List<InetAddress> list, long j) {
            this.f34179a = list;
            this.f34180b = j;
        }
    }

    /* renamed from: a */
    public void mo48359a(String str, List<InetAddress> list) {
        this.f34178a.put(str, new C12801a(list, -1));
    }
}
