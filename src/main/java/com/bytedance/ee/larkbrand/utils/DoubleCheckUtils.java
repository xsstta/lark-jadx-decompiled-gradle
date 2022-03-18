package com.bytedance.ee.larkbrand.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/DoubleCheckUtils;", "", "()V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.j */
public final class DoubleCheckUtils {

    /* renamed from: a */
    public static long f35261a;

    /* renamed from: b */
    public static final Companion f35262b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final boolean m54351a() {
        return f35262b.mo49661a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/DoubleCheckUtils$Companion;", "", "()V", "MAX_DURATION", "", "lastClickTime", "isDoubleClick", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.j$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo49661a() {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - DoubleCheckUtils.f35261a;
            if (1 <= j && 500 >= j) {
                return true;
            }
            DoubleCheckUtils.f35261a = currentTimeMillis;
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
