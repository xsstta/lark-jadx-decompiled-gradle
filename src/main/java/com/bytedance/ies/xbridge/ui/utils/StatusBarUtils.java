package com.bytedance.ies.xbridge.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u001e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u001a\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\u001b\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ies/xbridge/ui/utils/StatusBarUtils;", "", "()V", "FLAG_NOTCH_PORTRAIT", "", "FLAG_NOTCH_SUPPORT", "createStatusBarView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "color", "getStatusBarHeight", "context", "Landroid/content/Context;", "hideStatusBar", "", "setColor", "setColorForDrawerLayout", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "setStatusBarColor", "targetColor", "setTranslucent", "setTranslucentForDrawerLayout", "setTransparent", "setTransparentSystemUI", "showStatusBar", "trySetStatusBar", "window", "Landroid/view/Window;", "useDarkMode", "", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.ui.b.a */
public final class StatusBarUtils {

    /* renamed from: a */
    public static final StatusBarUtils f38104a = new StatusBarUtils();

    private StatusBarUtils() {
    }

    /* renamed from: b */
    public final void mo53195b(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(1024);
        }
    }

    /* renamed from: a */
    public final int mo53191a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53192a(android.app.Activity r8) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.ui.utils.StatusBarUtils.mo53192a(android.app.Activity):void");
    }

    /* renamed from: b */
    private final View m58474b(Activity activity, int i) {
        Activity activity2 = activity;
        View view = new View(activity2);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, mo53191a((Context) activity2)));
        view.setBackgroundColor(i);
        return view;
    }

    /* renamed from: a */
    public final void mo53193a(Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            View b = m58474b(activity, i);
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                ((ViewGroup) decorView).addView(b);
                View findViewById = activity.findViewById(R.id.content);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                    if (childAt != null) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        viewGroup2.setFitsSystemWindows(true);
                        viewGroup2.setClipToPadding(true);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: a */
    public final void mo53194a(Activity activity, Window window, boolean z) {
        if (activity != null && window != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    Intrinsics.checkExpressionValueIsNotNull(decorView, "decorView");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (!z) {
                        decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                    }
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
