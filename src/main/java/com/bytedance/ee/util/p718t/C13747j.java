package com.bytedance.ee.util.p718t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.graphics.drawable.C0774a;

/* renamed from: com.bytedance.ee.util.t.j */
public class C13747j {
    /* renamed from: a */
    public static void m55726a(View view, int i) {
        m55727a(view, view.getContext(), i);
    }

    /* renamed from: a */
    public static void m55728a(ImageView imageView, int i) {
        m55730a(imageView, imageView.getContext(), i);
    }

    /* renamed from: a */
    public static Drawable m55724a(Context context, int i, int i2) {
        return m55725a(context, C0215a.m655b(context, i), i2);
    }

    /* renamed from: a */
    private static Drawable m55725a(Context context, Drawable drawable, int i) {
        if (drawable == null) {
            return null;
        }
        drawable.mutate();
        Drawable h = C0774a.m3780h(drawable);
        C0774a.m3768a(h, (ColorStateList) null);
        Drawable g = C0774a.m3779g(h);
        g.setTintList(context.getResources().getColorStateList(i));
        return g;
    }

    /* renamed from: a */
    private static void m55727a(View view, Context context, int i) {
        view.setBackgroundTintList(context.getResources().getColorStateList(i));
    }

    /* renamed from: a */
    public static void m55729a(ImageView imageView, int i, int i2) {
        imageView.setImageDrawable(m55724a(imageView.getContext(), i, i2));
    }

    /* renamed from: a */
    private static void m55730a(ImageView imageView, Context context, int i) {
        imageView.setImageTintList(context.getResources().getColorStateList(i));
    }
}
