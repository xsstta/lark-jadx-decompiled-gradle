package com.bytedance.ee.bear.lynx.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\nR\u001f\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/CCMLynxLocalDrawableConfig;", "", "()V", "drawableMap", "", "", "", "Landroidx/annotation/DrawableRes;", "getDrawableId", "drawableKey", "(Ljava/lang/String;)Ljava/lang/Integer;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.b */
public final class CCMLynxLocalDrawableConfig {

    /* renamed from: a */
    public static final CCMLynxLocalDrawableConfig f23747a = new CCMLynxLocalDrawableConfig();

    /* renamed from: b */
    private static final Map<String, Integer> f23748b = new LinkedHashMap();

    private CCMLynxLocalDrawableConfig() {
    }

    /* renamed from: a */
    public final Integer mo33893a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "drawableKey");
        return f23748b.get(str);
    }
}
