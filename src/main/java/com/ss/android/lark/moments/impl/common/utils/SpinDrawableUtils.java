package com.ss.android.lark.moments.impl.common.utils;

import android.content.Context;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/SpinDrawableUtils;", "", "()V", "generateProgressDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "context", "Landroid/content/Context;", "color", "", "radiusPx", "strokePx", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.i */
public final class SpinDrawableUtils {

    /* renamed from: a */
    public static final SpinDrawableUtils f119255a = new SpinDrawableUtils();

    private SpinDrawableUtils() {
    }

    /* renamed from: a */
    public final CircularProgressDrawable mo166216a(Context context, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.mo7698a(1);
        circularProgressDrawable.mo7701a(i);
        circularProgressDrawable.mo7703b((float) i2);
        circularProgressDrawable.mo7694a((float) i3);
        int b = ((int) (circularProgressDrawable.mo7702b() + circularProgressDrawable.mo7693a())) * 2;
        circularProgressDrawable.setBounds(0, 0, b, b);
        return circularProgressDrawable;
    }
}
