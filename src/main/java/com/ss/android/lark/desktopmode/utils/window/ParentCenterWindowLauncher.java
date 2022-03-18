package com.ss.android.lark.desktopmode.utils.window;

import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.ss.android.lark.desktopmode.utils.p1797c.C36585b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/ParentCenterWindowLauncher;", "Lcom/ss/android/lark/desktopmode/utils/window/IDesktopWindowLauncher;", "()V", "createActivityOptions", "Landroid/app/ActivityOptions;", "activity", "Landroid/app/Activity;", "param", "Lcom/ss/android/lark/desktopmode/utils/window/LaunchParam;", "getLaunchMode", "", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.desktopmode.utils.d.d */
public final class ParentCenterWindowLauncher {
    /* renamed from: a */
    public ActivityOptions mo134991a(Activity activity, LaunchParam cVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        int c = cVar.mo134984c();
        int d = cVar.mo134985d();
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        Rect a = C36585b.m144332a().mo134976a(activity);
        if (a != null) {
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
            int i = a.left + ((width - c) / 2);
            int i2 = a.top + ((height - d) / 2);
            Intrinsics.checkExpressionValueIsNotNull(makeBasic, "activityOptions");
            makeBasic.setLaunchBounds(new Rect(i, i2, c + i, d + i2));
        }
        return makeBasic;
    }
}
