package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class ImmLeaksCleaner implements AbstractC1168n {

    /* renamed from: a */
    private static int f432a;

    /* renamed from: b */
    private static Field f433b;

    /* renamed from: c */
    private static Field f434c;

    /* renamed from: d */
    private static Field f435d;

    /* renamed from: e */
    private Activity f436e;

    /* renamed from: a */
    private static void m622a() {
        try {
            f432a = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f434c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f435d = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f433b = declaredField3;
            declaredField3.setAccessible(true);
            f432a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    ImmLeaksCleaner(Activity activity) {
        this.f436e = activity;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (f432a == 0) {
                m622a();
            }
            if (f432a == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f436e.getSystemService("input_method");
                try {
                    Object obj = f433b.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) f434c.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            f435d.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused2) {
                            } catch (ClassCastException unused3) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
        }
    }
}
