package com.larksuite.component.universe_design.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/util/UDUiModeUtils;", "", "()V", "isNightMode", "", "context", "Landroid/content/Context;", "config", "Landroid/content/res/Configuration;", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.h */
public final class UDUiModeUtils {

    /* renamed from: a */
    public static final UDUiModeUtils f63893a = new UDUiModeUtils();

    private UDUiModeUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m93319a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkExpressionValueIsNotNull(configuration, "context.resources.configuration");
        return m93320a(configuration);
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m93320a(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "config");
        if ((configuration.uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
