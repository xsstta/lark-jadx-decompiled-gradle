package com.ss.android.lark.desktopmode.utils.p1797c;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.desktopmode.utils.c.a */
public class C36584a implements AbstractC36588c {
    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: a */
    public int[] mo134974a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: a */
    public Rect mo134973a(Activity activity) {
        int[] iArr = new int[2];
        View decorView = activity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + decorView.getWidth(), iArr[1] + decorView.getHeight());
    }

    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: b */
    public int[] mo134975b(Activity activity) {
        Display defaultDisplay;
        Display.Mode mode;
        int[] iArr = new int[2];
        if (!(Build.VERSION.SDK_INT < 24 || (defaultDisplay = activity.getWindowManager().getDefaultDisplay()) == null || (mode = defaultDisplay.getMode()) == null)) {
            Log.m165379d("DefaultMeasurer", "w=" + mode.getPhysicalWidth() + ", h=" + mode.getPhysicalHeight());
            iArr[0] = mode.getPhysicalWidth();
            iArr[1] = mode.getPhysicalHeight();
        }
        return iArr;
    }
}
