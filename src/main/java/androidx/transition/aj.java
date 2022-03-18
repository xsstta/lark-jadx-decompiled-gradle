package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;

/* access modifiers changed from: package-private */
public class aj {

    /* renamed from: a */
    static final Property<View, Float> f5360a = new Property<View, Float>(Float.class, "translationAlpha") {
        /* class androidx.transition.aj.C15251 */

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(aj.m7002c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            aj.m6996a(view, f.floatValue());
        }
    };

    /* renamed from: b */
    static final Property<View, Rect> f5361b = new Property<View, Rect>(Rect.class, "clipBounds") {
        /* class androidx.transition.aj.C15262 */

        /* renamed from: a */
        public Rect get(View view) {
            return ViewCompat.m4014H(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            ViewCompat.m4038a(view, rect);
        }
    };

    /* renamed from: c */
    private static final ap f5362c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f5362c = new ao();
        } else if (Build.VERSION.SDK_INT >= 23) {
            f5362c = new an();
        } else if (Build.VERSION.SDK_INT >= 22) {
            f5362c = new am();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f5362c = new al();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f5362c = new ak();
        } else {
            f5362c = new ap();
        }
    }

    /* renamed from: c */
    static float m7002c(View view) {
        return f5362c.mo7980a(view);
    }

    /* renamed from: d */
    static void m7004d(View view) {
        f5362c.mo7982b(view);
    }

    /* renamed from: e */
    static void m7005e(View view) {
        f5362c.mo7983c(view);
    }

    /* renamed from: a */
    static AbstractC1524ai m6995a(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1523ah(view);
        }
        return C1521ag.m6981d(view);
    }

    /* renamed from: b */
    static AbstractC1527at m7000b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new as(view);
        }
        return new ar(view.getWindowToken());
    }

    /* renamed from: a */
    static void m6996a(View view, float f) {
        f5362c.mo7981a(view, f);
    }

    /* renamed from: b */
    static void m7001b(View view, Matrix matrix) {
        f5362c.mo7985b(view, matrix);
    }

    /* renamed from: a */
    static void m6997a(View view, int i) {
        f5362c.mo7988a(view, i);
    }

    /* renamed from: c */
    static void m7003c(View view, Matrix matrix) {
        f5362c.mo7986c(view, matrix);
    }

    /* renamed from: a */
    static void m6999a(View view, Matrix matrix) {
        f5362c.mo7984a(view, matrix);
    }

    /* renamed from: a */
    static void m6998a(View view, int i, int i2, int i3, int i4) {
        f5362c.mo7987a(view, i, i2, i3, i4);
    }
}
