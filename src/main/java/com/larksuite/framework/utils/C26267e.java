package com.larksuite.framework.utils;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: com.larksuite.framework.utils.e */
class C26267e extends Toast {
    public void show() {
        m95085a(this);
        super.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.e$b */
    public static class RunnableC26270b implements Runnable {

        /* renamed from: a */
        private final Runnable f64867a;

        public void run() {
            try {
                this.f64867a.run();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private RunnableC26270b(Runnable runnable) {
            this.f64867a = runnable;
        }
    }

    /* renamed from: a */
    private static boolean m95086a() {
        if (Build.VERSION.SDK_INT == 25) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.e$a */
    public static class C26269a implements Handler.Callback {

        /* renamed from: a */
        private final Handler f64866a;

        public C26269a(Handler handler) {
            this.f64866a = handler;
        }

        public boolean handleMessage(Message message) {
            try {
                this.f64866a.handleMessage(message);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        }
    }

    /* renamed from: a */
    public static void m95085a(Toast toast) {
        if (m95086a()) {
            m95089b(toast);
        }
    }

    /* renamed from: b */
    private static void m95089b(Toast toast) {
        try {
            Object a = m95083a(toast, "mTN");
            if (a != null) {
                boolean z = false;
                Object a2 = m95083a(a, "mShow");
                if (a2 instanceof Runnable) {
                    z = m95087a(a, "mShow", new RunnableC26270b((Runnable) a2));
                }
                if (!z) {
                    Object a3 = m95083a(a, "mHandler");
                    if (a3 instanceof Handler) {
                        z = m95087a(a3, "mCallback", new C26269a((Handler) a3));
                    }
                }
                if (!z) {
                    Log.m165383e("CompatToast", "tryToHack error.");
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Object m95083a(Object obj, String str) {
        return m95084a(obj, m95088b(obj, str));
    }

    /* renamed from: a */
    private static Object m95084a(Object obj, Field field) {
        if (field == null) {
            return null;
        }
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static Field m95088b(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m95087a(Object obj, String str, Object obj2) {
        Field b = m95088b(obj, str);
        if (b == null) {
            return false;
        }
        try {
            if (Modifier.isFinal(b.getModifiers())) {
                Field declaredField = Field.class.getDeclaredField("accessFlags");
                declaredField.setAccessible(true);
                declaredField.setInt(b, b.getModifiers() & -17);
            }
            if (!b.isAccessible()) {
                b.setAccessible(true);
            }
            b.set(obj, obj2);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
