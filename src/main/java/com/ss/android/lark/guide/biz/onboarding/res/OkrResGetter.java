package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/OkrResGetter;", "Lcom/ss/android/lark/guide/biz/onboarding/res/BasResGetter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.l */
public final class OkrResGetter extends BasResGetter {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OkrResGetter(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo141353a().add(new OkrSpecialRes());
    }
}
