package com.google.android.material.p980a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.a.e */
public class C22120e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f53786a = new C22120e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f53787b = new WeakHashMap<>();

    private C22120e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f53787b.containsKey(drawable)) {
            return this.f53787b.get(drawable);
        }
        return 255;
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f53787b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
