package com.ss.android.lark.widget.richtext2.widget;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.a */
public class C59089a {
    /* renamed from: a */
    public static ViewGroup.LayoutParams m229508a() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public static void m229510b(Activity activity) {
        activity.getWindow().clearFlags(1024);
    }

    /* renamed from: a */
    public static int m229505a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.trim())) {
            return 0;
        }
        String trim = str.trim();
        if (trim.charAt(0) != '#') {
            trim = "#" + trim;
        }
        if (trim.length() == 7 || trim.length() == 9) {
            return Color.parseColor(trim);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m229509a(Activity activity) {
        activity.getWindow().addFlags(1024);
    }

    /* renamed from: a */
    public static int m229504a(int i, boolean z, boolean z2) {
        if (i <= 0 || z) {
            return 0;
        }
        if (z2) {
            return UIHelper.getDimens(R.dimen.spacing_text_view_height);
        }
        return UIHelper.getDimens(R.dimen.spacing_small_height);
    }

    /* renamed from: a */
    private static GradientDrawable m229506a(int i, float[] fArr, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static StateListDrawable m229507a(int i, int i2, float[] fArr, int i3, int i4) {
        GradientDrawable a = m229506a(i, fArr, i3, i4);
        GradientDrawable a2 = m229506a(i2, fArr, i3, i4);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, a2);
        stateListDrawable.addState(new int[0], a);
        return stateListDrawable;
    }
}
