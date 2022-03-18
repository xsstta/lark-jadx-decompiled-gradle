package com.ss.android.vc.meeting.module.livestream.widget;

import android.graphics.drawable.GradientDrawable;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

/* renamed from: com.ss.android.vc.meeting.module.livestream.widget.c */
public class C62112c {
    /* renamed from: a */
    public static GradientDrawable m242606a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(C60773o.m236115a(1.0d), C60773o.m236126d(R.color.ud_N300));
        gradientDrawable.setCornerRadius((float) C60773o.m236115a(4.0d));
        return gradientDrawable;
    }

    /* renamed from: a */
    public static void m242607a(GradientDrawable gradientDrawable, int i) {
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(C60773o.m236115a(1.0d), i);
        }
    }
}
