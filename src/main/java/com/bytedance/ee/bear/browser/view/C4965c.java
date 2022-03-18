package com.bytedance.ee.bear.browser.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.browser.view.c */
public class C4965c {

    /* renamed from: a */
    private static final int[] f14571a = {16843461};

    /* renamed from: b */
    private static final int[] f14572b = {16843463};

    /* renamed from: c */
    private static final int[] f14573c = {16843462};

    /* renamed from: a */
    public static Drawable m20576a(Context context) {
        return m20577a(context, f14571a, R.drawable.text_select_handle_left_material);
    }

    /* renamed from: b */
    public static Drawable m20578b(Context context) {
        return m20577a(context, f14573c, R.drawable.text_select_handle_right_material);
    }

    /* renamed from: a */
    private static Drawable m20577a(Context context, int[] iArr, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(iArr);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C0215a.m655b(context, obtainStyledAttributes.getResourceId(0, i));
        }
        obtainStyledAttributes.recycle();
        if (drawable == null) {
            return null;
        }
        return drawable.mutate();
    }
}
