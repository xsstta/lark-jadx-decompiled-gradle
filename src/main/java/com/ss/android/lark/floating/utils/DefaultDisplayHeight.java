package com.ss.android.lark.floating.utils;

import android.content.Context;
import com.ss.android.lark.floating.interfaces.OnDisplayHeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/floating/utils/DefaultDisplayHeight;", "Lcom/ss/android/lark/floating/interfaces/OnDisplayHeight;", "()V", "getDisplayRealHeight", "", "context", "Landroid/content/Context;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.d.b */
public final class DefaultDisplayHeight implements OnDisplayHeight {
    @Override // com.ss.android.lark.floating.interfaces.OnDisplayHeight
    /* renamed from: a */
    public int mo140240a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return DisplayUtils.f98497a.mo140270f(context);
    }
}
