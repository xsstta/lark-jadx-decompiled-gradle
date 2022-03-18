package com.bytedance.ee.util.p718t;

import android.content.res.Resources;
import android.widget.ImageView;
import androidx.p042i.p043a.p044a.C1106i;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.t.m */
public class C13751m {
    /* renamed from: a */
    public static void m55764a(ImageView imageView, Resources resources, int i, Resources.Theme theme, int i2) {
        C1106i a = C1106i.m5238a(resources, i, theme);
        if (a != null) {
            a.setTint(i2);
            imageView.setImageDrawable(a);
            return;
        }
        C13479a.m54758a("VectorDrawableUtils", "initSearchIcon VectorDrawableCompat is null !!");
    }
}
