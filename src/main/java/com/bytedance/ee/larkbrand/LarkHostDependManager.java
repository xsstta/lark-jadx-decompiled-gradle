package com.bytedance.ee.larkbrand;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/larkbrand/LarkHostDependManager;", "", "()V", "larkHostDepend", "Lcom/bytedance/ee/larkbrand/LarkHostDepend;", "getLarkHostDepend", "()Lcom/bytedance/ee/larkbrand/LarkHostDepend;", "setLarkHostDepend", "(Lcom/bytedance/ee/larkbrand/LarkHostDepend;)V", "init", "", "larkHostDependImpl", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.f */
public final class LarkHostDependManager {

    /* renamed from: a */
    public static LarkHostDepend f34681a;

    /* renamed from: b */
    public static final LarkHostDependManager f34682b = new LarkHostDependManager();

    private LarkHostDependManager() {
    }

    /* renamed from: a */
    public final LarkHostDepend mo49086a() {
        LarkHostDepend eVar = f34681a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("larkHostDepend");
        }
        return eVar;
    }

    /* renamed from: a */
    public final void mo49087a(LarkHostDepend eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "larkHostDependImpl");
        f34681a = eVar;
    }
}
