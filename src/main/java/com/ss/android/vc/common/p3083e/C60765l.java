package com.ss.android.vc.common.p3083e;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.ss.android.vc.common.p3077b.C60700b;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: com.ss.android.vc.common.e.l */
public class C60765l extends Toast {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.e.l$b */
    public class RunnableC60767b implements Runnable {

        /* renamed from: b */
        private final Runnable f151954b;

        public void run() {
            try {
                this.f151954b.run();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public RunnableC60767b(Runnable runnable) {
            this.f151954b = runnable;
        }
    }

    public void show() {
        if (mo208371a()) {
            m236107b();
        }
        super.show();
    }

    /* renamed from: b */
    private void m236107b() {
        Object a;
        try {
            Object a2 = m236103a(this, "mTN");
            if (a2 != null) {
                boolean z = false;
                Object a3 = m236103a(a2, "mShow");
                if (a3 != null && (a3 instanceof Runnable)) {
                    z = m236105a(a2, "mShow", new RunnableC60767b((Runnable) a3));
                }
                if (!z && (a = m236103a(a2, "mHandler")) != null && (a instanceof Handler)) {
                    z = m236105a(a, "mCallback", new C60766a((Handler) a));
                }
                if (!z) {
                    C60700b.m235864f("ToastCompat", "[tryToHack]", "error.");
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo208371a() {
        if (Build.VERSION.SDK_INT == 25) {
            return true;
        }
        return false;
    }

    public C60765l(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.e.l$a */
    public class C60766a implements Handler.Callback {

        /* renamed from: b */
        private final Handler f151952b;

        public boolean handleMessage(Message message) {
            try {
                this.f151952b.handleMessage(message);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        }

        public C60766a(Handler handler) {
            this.f151952b = handler;
        }
    }

    /* renamed from: a */
    private static Object m236103a(Object obj, String str) {
        return m236104a(obj, m236106b(obj, str));
    }

    /* renamed from: a */
    private static Object m236104a(Object obj, Field field) {
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
    private static Field m236106b(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m236105a(Object obj, String str, Object obj2) {
        Field b = m236106b(obj, str);
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
