package com.ss.android.lark.widget.photo_picker.p2951f;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.k */
public class C58662k {
    /* renamed from: a */
    public static boolean m227537a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }
}
