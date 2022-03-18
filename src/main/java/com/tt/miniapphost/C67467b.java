package com.tt.miniapphost;

import com.bytedance.ee.lark.infra.storage.AbstractC12889a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.p3368b.AbstractC67469b;

/* renamed from: com.tt.miniapphost.b */
public class C67467b {
    /* renamed from: a */
    public static AbstractC12889a m262424a() {
        return ContextSingletonInstance.getInstance().getStorageManager();
    }

    /* renamed from: b */
    public static AbstractC67469b m262425b() {
        return ContextSingletonInstance.getInstance().getBundleManager();
    }
}
