package com.bytedance.ee.util.p712o.p713a;

import android.widget.TextView;
import java.util.Objects;

/* renamed from: com.bytedance.ee.util.o.a.b */
public final class C13716b {
    /* renamed from: a */
    public static AbstractC13715a<CharSequence> m55614a(TextView textView) {
        m55615a(textView, "view == null");
        return new C13717c(textView);
    }

    /* renamed from: a */
    private static void m55615a(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }
}
