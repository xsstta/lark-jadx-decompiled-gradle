package com.lynx.component.svg.parser;

import android.graphics.Canvas;
import java.lang.reflect.Method;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.component.svg.parser.b */
public class C26474b {

    /* renamed from: a */
    static final int f65427a;

    /* renamed from: b */
    private static final Method f65428b;

    static {
        try {
            f65427a = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            f65428b = Canvas.class.getMethod("save", Integer.TYPE);
        } catch (Throwable th) {
            throw m95827a(th);
        }
    }

    /* renamed from: b */
    private static <T extends Throwable> T m95829b(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a */
    private static RuntimeException m95827a(Throwable th) {
        Objects.requireNonNull(th, "t");
        return (RuntimeException) m95829b(th);
    }

    /* renamed from: a */
    static void m95828a(Canvas canvas, int i) {
        try {
            f65428b.invoke(canvas, Integer.valueOf(i));
        } catch (Throwable th) {
            throw m95827a(th);
        }
    }
}
