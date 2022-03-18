package com.bytedance.kit.nglynx.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/bytedance/kit/nglynx/util/UIUtils;", "", "()V", "dip2Px", "", "context", "Landroid/content/Context;", "dipValue", "getScreenHeight", "", "px2dip", "pxValue", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.g.c */
public final class UIUtils {

    /* renamed from: a */
    public static final UIUtils f38617a = new UIUtils();

    private UIUtils() {
    }

    /* renamed from: a */
    public final int mo53828a(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    /* renamed from: a */
    public final float mo53827a(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
