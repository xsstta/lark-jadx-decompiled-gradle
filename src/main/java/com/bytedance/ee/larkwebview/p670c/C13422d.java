package com.bytedance.ee.larkwebview.p670c;

import com.bytedance.ee.larkwebview.p677e.C13438b;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.larkwebview.c.d */
public class C13422d {

    /* renamed from: a */
    private Map<String, AbstractC13420b> f35385a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkwebview.c.d$a */
    public static class C13424a {

        /* renamed from: a */
        static final C13422d f35386a = new C13422d();
    }

    /* renamed from: a */
    public static C13422d m54558a() {
        return C13424a.f35386a;
    }

    private C13422d() {
        this.f35385a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public void mo49812a(String str) {
        this.f35385a.remove(str);
    }

    /* renamed from: b */
    public AbstractC13420b mo49813b(String str) {
        return this.f35385a.get(str);
    }

    /* renamed from: a */
    public void mo49811a(AbstractC13420b bVar) {
        if (!C13438b.m54611a(bVar.mo48171a())) {
            Log.m165389i("PlatformViewRegistry", "register view id is not numeric");
        } else {
            this.f35385a.put(bVar.mo48171a(), bVar);
        }
    }
}
