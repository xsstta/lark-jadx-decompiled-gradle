package com.ss.android.lark.main.app.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class NavBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public NavBottomSheetBehavior() {
    }

    /* renamed from: c */
    public static <V extends View> NavBottomSheetBehavior<V> m175464c(V v) {
        BottomSheetBehavior b = BottomSheetBehavior.m79955b(v);
        if (b instanceof NavBottomSheetBehavior) {
            return (NavBottomSheetBehavior) b;
        }
        throw new IllegalArgumentException("The view is not associated with NavBottomSheetBehavior");
    }

    public NavBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
