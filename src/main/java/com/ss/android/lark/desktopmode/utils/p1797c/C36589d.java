package com.ss.android.lark.desktopmode.utils.p1797c;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.larksuite.framework.utils.DeviceUtils;

/* renamed from: com.ss.android.lark.desktopmode.utils.c.d */
public class C36589d implements AbstractC36588c {
    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: a */
    public int[] mo134974a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: b */
    public int[] mo134975b(Activity activity) {
        return new int[]{DeviceUtils.getScreenWidth(activity), DeviceUtils.getScreenHeight(activity)};
    }

    @Override // com.ss.android.lark.desktopmode.utils.p1797c.AbstractC36588c
    /* renamed from: a */
    public Rect mo134973a(Activity activity) {
        int[] iArr = new int[2];
        View decorView = activity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + decorView.getWidth(), iArr[1] + decorView.getHeight());
    }
}
