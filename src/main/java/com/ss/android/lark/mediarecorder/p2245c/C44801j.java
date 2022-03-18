package com.ss.android.lark.mediarecorder.p2245c;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"dp2px", "", "context", "Landroid/content/Context;", "dp", "getColor", "resId", "mediarecorder_release"}, mo238835k = 2, mv = {1, 1, 13})
/* renamed from: com.ss.android.lark.mediarecorder.c.j */
public final class C44801j {
    /* renamed from: a */
    public static final int m177653a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    public static final int m177654b(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (int) ((((float) i) * resources.getDisplayMetrics().density) + 0.5f);
    }
}
