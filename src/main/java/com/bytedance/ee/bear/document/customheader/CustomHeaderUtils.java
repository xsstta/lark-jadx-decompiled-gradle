package com.bytedance.ee.bear.document.customheader;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderUtils;", "", "()V", "isStatusBarImmersive", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "isStatusBarShowing", "isStatusBarTransparent", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.customheader.b */
public final class CustomHeaderUtils {

    /* renamed from: a */
    public static final CustomHeaderUtils f16140a = new CustomHeaderUtils();

    private CustomHeaderUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m23140a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Window window = fragmentActivity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        if ((window.getAttributes().flags & 1024) == 0) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m23142c(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        if (!m23140a(fragmentActivity) || !m23141b(fragmentActivity)) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m23141b(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Window window = fragmentActivity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
        if ((decorView.getSystemUiVisibility() & 1024) == 1024) {
            return true;
        }
        return false;
    }
}
