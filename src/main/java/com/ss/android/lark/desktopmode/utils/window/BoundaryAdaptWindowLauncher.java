package com.ss.android.lark.desktopmode.utils.window;

import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.utils.p1797c.C36585b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0003J\b\u0010\u000f\u001a\u00020\rH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/BoundaryAdaptWindowLauncher;", "Lcom/ss/android/lark/desktopmode/utils/window/IDesktopWindowLauncher;", "()V", "createActivityOptions", "Landroid/app/ActivityOptions;", "activity", "Landroid/app/Activity;", "param", "Lcom/ss/android/lark/desktopmode/utils/window/LaunchParam;", "getActivityOptionsInParentCenter", "outRect", "Landroid/graphics/Rect;", "newActivityWidth", "", "newActivityHeight", "getLaunchMode", "Companion", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.desktopmode.utils.d.a */
public final class BoundaryAdaptWindowLauncher {

    /* renamed from: a */
    public static final Companion f94147a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/BoundaryAdaptWindowLauncher$Companion;", "", "()V", "BOUNDARY_MARGIN_IN_DP", "", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.desktopmode.utils.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public ActivityOptions mo134979a(Activity activity, LaunchParam cVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        int c = cVar.mo134984c();
        int d = cVar.mo134985d();
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        Rect a = C36585b.m144332a().mo134976a(activity);
        if (a == null) {
            return makeBasic;
        }
        Activity activity2 = activity;
        if (UIUtils.dp2px(activity2, 10.0f) + c <= a.left) {
            int dp2px = a.left - UIUtils.dp2px(activity2, 10.0f);
            int i = a.top;
            Intrinsics.checkExpressionValueIsNotNull(makeBasic, "activityOptions");
            makeBasic.setLaunchBounds(new Rect(dp2px - c, i, dp2px, d + i));
        } else if (a.right + UIUtils.dp2px(activity2, 10.0f) + c > C36585b.m144332a().mo134978b(activity)[0]) {
            return m144346a(activity, a, c, d);
        } else {
            int dp2px2 = a.right + UIUtils.dp2px(activity2, 10.0f);
            int i2 = a.top;
            Intrinsics.checkExpressionValueIsNotNull(makeBasic, "activityOptions");
            makeBasic.setLaunchBounds(new Rect(dp2px2, i2, c + dp2px2, d + i2));
        }
        return makeBasic;
    }

    /* renamed from: a */
    private final ActivityOptions m144346a(Activity activity, Rect rect, int i, int i2) {
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        Window window = activity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
        int width = decorView.getWidth();
        Window window2 = activity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window2, "activity.window");
        View decorView2 = window2.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView2, "activity.window.decorView");
        int height = decorView2.getHeight();
        if (width == 0 || height == 0) {
            int[] b = C36585b.m144332a().mo134978b(activity);
            width = b[0];
            height = b[1];
        }
        int i3 = rect.left + ((width - i) / 2);
        int i4 = rect.top + ((height - i2) / 2);
        Intrinsics.checkExpressionValueIsNotNull(makeBasic, "activityOptions");
        makeBasic.setLaunchBounds(new Rect(i3, i4, i + i3, i2 + i4));
        return makeBasic;
    }
}
