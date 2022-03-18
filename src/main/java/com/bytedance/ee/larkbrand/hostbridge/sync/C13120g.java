package com.bytedance.ee.larkbrand.hostbridge.sync;

import android.text.TextUtils;
import com.bytedance.ee.larkbrand.p650e.C13046y;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.g */
public class C13120g {

    /* renamed from: a */
    private Map<String, AbstractC67571b> f34809a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.g$a */
    public static class C13122a {

        /* renamed from: a */
        static C13120g f34810a = new C13120g();
    }

    /* renamed from: a */
    public static C13120g m53718a() {
        return C13122a.f34810a;
    }

    private C13120g() {
        this.f34809a = new HashMap();
    }

    /* renamed from: a */
    public AbstractC67571b mo49171a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f34809a.get(str);
    }

    /* renamed from: a */
    public void mo49172a(AbstractC41371j jVar) {
        for (AbstractC67571b bVar : C13046y.m53528a(jVar)) {
            if (bVar != null) {
                this.f34809a.put(bVar.mo49139a(), bVar);
            }
        }
    }
}
