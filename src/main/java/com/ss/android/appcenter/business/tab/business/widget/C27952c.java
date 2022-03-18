package com.ss.android.appcenter.business.tab.business.widget;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.business.widget.c */
public class C27952c {

    /* renamed from: a */
    private Map<String, BlockLogTracer> f69936a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.c$a */
    public static class C27954a {

        /* renamed from: a */
        public static C27952c f69937a = new C27952c();
    }

    /* renamed from: a */
    public static C27952c m102076a() {
        return C27954a.f69937a;
    }

    private C27952c() {
        this.f69936a = new HashMap();
    }

    /* renamed from: a */
    public BlockLogTracer mo99660a(String str) {
        BlockLogTracer dVar = new BlockLogTracer();
        this.f69936a.put(str, dVar);
        return dVar;
    }

    /* renamed from: b */
    public BlockLogTracer mo99661b(String str) {
        if (this.f69936a.containsKey(str)) {
            return this.f69936a.get(str);
        }
        return mo99660a(str);
    }
}
