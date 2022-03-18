package com.lynx.react.p1214a.p1215a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: com.lynx.react.a.a.a */
public class C26512a {

    /* renamed from: a */
    private static final boolean f65556a;

    /* renamed from: b */
    private static final C26512a f65557b = new C26512a();

    /* renamed from: c */
    private Handler f65558c;

    /* renamed from: d */
    private Choreographer f65559d;

    /* renamed from: com.lynx.react.a.a.a$a */
    public static abstract class AbstractC26513a {
    }

    /* renamed from: a */
    private Choreographer m96088a() {
        return Choreographer.getInstance();
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        f65556a = z;
    }

    private C26512a() {
        if (f65556a) {
            this.f65559d = m96088a();
        } else {
            this.f65558c = new Handler(Looper.getMainLooper());
        }
    }
}
