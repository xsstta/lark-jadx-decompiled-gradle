package com.ss.lark.android.passport.biz.widget.layout;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/layout/CommonLayoutUtils;", "", "()V", "inflateFullLayout", "Lcom/ss/lark/android/passport/biz/widget/layout/BaseContainerLayout;", "activity", "Landroid/app/Activity;", "res", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "attachToRoot", "", "newBaseContainer", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.widget.layout.a */
public final class CommonLayoutUtils {

    /* renamed from: a */
    public static final CommonLayoutUtils f164454a = new CommonLayoutUtils();

    private CommonLayoutUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final BaseContainerLayout m256247a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        BaseContainerLayout baseContainerLayout = new BaseContainerLayout(activity, null, 0, 6, null);
        activity.setContentView(baseContainerLayout, new ViewGroup.LayoutParams(-1, -1));
        return baseContainerLayout;
    }

    @JvmStatic
    /* renamed from: a */
    public static final BaseContainerLayout m256248a(Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        BaseContainerLayout baseContainerLayout = new BaseContainerLayout(activity, null, 0, 6, null);
        activity.setContentView(baseContainerLayout, new ViewGroup.LayoutParams(-1, -1));
        baseContainerLayout.mo224655a(i);
        return baseContainerLayout;
    }

    @JvmStatic
    /* renamed from: a */
    public static final BaseContainerLayout m256249a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "inflater.context");
        BaseContainerLayout baseContainerLayout = new BaseContainerLayout(context, null, 0, 6, null);
        if (z && viewGroup != null) {
            viewGroup.addView(baseContainerLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        return baseContainerLayout;
    }
}
