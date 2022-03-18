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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J*\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003J*\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003J\b\u0010\u0011\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/TargetCoordinateWindowLauncher;", "Lcom/ss/android/lark/desktopmode/utils/window/IDesktopWindowLauncher;", "()V", "createActivityOptions", "Landroid/app/ActivityOptions;", "activity", "Landroid/app/Activity;", "param", "Lcom/ss/android/lark/desktopmode/utils/window/LaunchParam;", "getAcOptionsAtLocationSuiteInParent", "hostActivity", "coordination", "", "newActivityWidth", "", "newActivityHeight", "getActivityOptionsAtLocation", "getLaunchMode", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.desktopmode.utils.d.e */
public final class TargetCoordinateWindowLauncher {
    /* renamed from: a */
    public ActivityOptions mo134992a(Activity activity, LaunchParam cVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        boolean e = cVar.mo134986e();
        int[] a = cVar.mo134982a();
        int c = cVar.mo134984c();
        int d = cVar.mo134985d();
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        if (!e) {
            return m144358a(activity, a, c, d);
        }
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
            return m144358a(activity, a, c, d);
        }
        if (height < c || height < d) {
            return m144358a(activity, a, c, d);
        }
        return m144359b(activity, a, c, d);
    }

    /* renamed from: a */
    private final ActivityOptions m144358a(Activity activity, int[] iArr, int i, int i2) {
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        Rect a = C36585b.m144332a().mo134976a(activity);
        if (a != null) {
            int i3 = iArr[0] + a.left;
            int i4 = iArr[1] + a.top;
            Intrinsics.checkExpressionValueIsNotNull(makeBasic, "activityOptions");
            makeBasic.setLaunchBounds(new Rect(i3, i4, i + i3, i2 + i4));
        }
        return makeBasic;
    }

    /* renamed from: b */
    private final ActivityOptions m144359b(Activity activity, int[] iArr, int i, int i2) {
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        Rect a = C36585b.m144332a().mo134976a(activity);
        if (a == null) {
            return makeBasic;
        }
        int i3 = iArr[0] + a.left;
        int i4 = iArr[1] + a.top;
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i5 > a.right) {
            i5 = a.right;
            i3 = i5 - i;
        }
        if (i6 > a.bottom) {
            i6 = a.bottom;
            i4 = i6 - i2;
        }
        if (i3 < a.left) {
            i3 = a.left;
            i5 = i3 + i;
        }
        if (i4 < a.top) {
            i4 = a.top;
            i6 = i4 + i2;
        }
        return makeBasic.setLaunchBounds(new Rect(i3, i4, i5, i6));
    }
}
