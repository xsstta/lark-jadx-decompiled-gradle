package com.zackratos.ultimatebarx.ultimatebarx.p3442c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0001\u001a\u001c\u0010\b\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¨\u0006\t"}, d2 = {"systemUiFlag", "", "statusBarLight", "", "navigationBarLight", "barTransparent", "", "Landroidx/fragment/app/FragmentActivity;", "setSystemUiFlagWithLight", "ultimatebarx_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c.a */
public final class C68098a {
    /* renamed from: a */
    public static final void m264684a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$barTransparent");
        if (Build.VERSION.SDK_INT >= 29) {
            Window window = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "window");
            window.setStatusBarContrastEnforced(false);
            Window window2 = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window2, "window");
            window2.setNavigationBarContrastEnforced(false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Window window3 = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window3, "window");
            window3.setStatusBarColor(0);
            Window window4 = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window4, "window");
            window4.setNavigationBarColor(0);
        } else if (Build.VERSION.SDK_INT >= 19) {
            Window window5 = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window5, "window");
            if ((window5.getAttributes().flags & 67108864) == 0) {
                fragmentActivity.getWindow().addFlags(67108864);
            }
            Window window6 = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window6, "window");
            if ((window6.getAttributes().flags & 134217728) == 0) {
                fragmentActivity.getWindow().addFlags(134217728);
            }
        }
    }

    /* renamed from: a */
    private static final int m264683a(boolean z, boolean z2) {
        int i = 9984;
        if (Build.VERSION.SDK_INT >= 26) {
            if (!z) {
                i = 1792;
            }
            if (z2) {
                return i | 16;
            }
            return i;
        } else if (Build.VERSION.SDK_INT < 23 || !z) {
            return 1792;
        } else {
            return 9984;
        }
    }

    /* renamed from: a */
    public static final void m264685a(FragmentActivity fragmentActivity, boolean z, boolean z2) {
        Window window;
        View decorView;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$setSystemUiFlagWithLight");
        if (Build.VERSION.SDK_INT >= 21 && (window = fragmentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(m264683a(z, z2));
        }
    }
}
