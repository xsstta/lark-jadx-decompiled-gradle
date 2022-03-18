package com.ss.android.lark.mediarecorder.p2245c;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\"\u001a\u0010\u0000\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0004\b\b\u0010\u0005¨\u0006\r"}, d2 = {"sScreenHeight", "", "getSScreenHeight", "()I", "setSScreenHeight", "(I)V", "sScreenWidth", "getSScreenWidth", "setSScreenWidth", "getScreenHeight", "context", "Landroid/content/Context;", "getScreenWidth", "mediarecorder_release"}, mo238835k = 2, mv = {1, 1, 13})
/* renamed from: com.ss.android.lark.mediarecorder.c.d */
public final class C44791d {

    /* renamed from: a */
    private static int f113415a;

    /* renamed from: b */
    private static int f113416b;

    /* renamed from: a */
    public static final int m177626a(Context context) {
        Display defaultDisplay;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (f113415a <= 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            f113415a = displayMetrics.widthPixels;
        }
        return f113415a;
    }

    /* renamed from: b */
    public static final int m177627b(Context context) {
        Display defaultDisplay;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (f113416b <= 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            f113416b = displayMetrics.heightPixels;
        }
        return f113416b;
    }
}
