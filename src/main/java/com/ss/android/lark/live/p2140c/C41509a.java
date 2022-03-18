package com.ss.android.lark.live.p2140c;

import android.app.Activity;
import android.view.Display;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"isLandscape", "", "Landroid/app/Activity;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.c.a */
public final class C41509a {
    /* renamed from: a */
    public static final boolean m164737a(Activity activity) {
        if (activity == null) {
            return false;
        }
        WindowManager windowManager = activity.getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        if (rotation == 1 || rotation == 3) {
            return true;
        }
        return false;
    }
}
