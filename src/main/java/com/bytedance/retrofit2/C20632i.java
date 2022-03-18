package com.bytedance.retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.retrofit2.CallAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import retrofit2.C70213c;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.i */
public class C20632i {

    /* renamed from: a */
    private static final C20632i f50243a = m75008d();

    /* renamed from: b */
    private static final boolean f50244b = m75009e();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.i$b */
    public static class C20635b extends C20632i {

        /* renamed from: com.bytedance.retrofit2.i$b$a */
        static class ExecutorC20636a implements Executor {

            /* renamed from: a */
            private static Object f50246a;

            /* renamed from: b */
            private static Method f50247b;

            ExecutorC20636a() {
            }

            static {
                try {
                    Class<?> cls = Class.forName("org.robovm.apple.foundation.NSOperationQueue");
                    f50246a = cls.getDeclaredMethod("getMainQueue", new Class[0]).invoke(null, new Object[0]);
                    f50247b = cls.getDeclaredMethod("addOperation", Runnable.class);
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            }

            public void execute(Runnable runnable) {
                try {
                    f50247b.invoke(f50246a, runnable);
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
            }
        }

        C20635b() {
        }

        @Override // com.bytedance.retrofit2.C20632i
        /* renamed from: c */
        public Executor mo69442c() {
            return new ExecutorC20636a();
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.C20632i
        /* renamed from: a */
        public CallAdapter.Factory mo69439a(Executor executor) {
            return new C20598f(executor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo69441a(Method method) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Executor mo69442c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.i$a */
    public static class C20633a extends C20632i {
        C20633a() {
        }

        @Override // com.bytedance.retrofit2.C20632i
        /* renamed from: c */
        public Executor mo69442c() {
            return new ExecutorC20634a();
        }

        /* renamed from: com.bytedance.retrofit2.i$a$a */
        static class ExecutorC20634a implements Executor {

            /* renamed from: a */
            private final Handler f50245a = new Handler(Looper.getMainLooper());

            ExecutorC20634a() {
            }

            public void execute(Runnable runnable) {
                this.f50245a.post(runnable);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.C20632i
        /* renamed from: a */
        public CallAdapter.Factory mo69439a(Executor executor) {
            return new C20598f(executor);
        }
    }

    C20632i() {
    }

    /* renamed from: a */
    static C20632i m75006a() {
        return f50243a;
    }

    /* renamed from: b */
    static boolean m75007b() {
        return f50244b;
    }

    /* renamed from: e */
    private static boolean m75009e() {
        try {
            new C70213c.C70214a();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static C20632i m75008d() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C20633a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("org.robovm.apple.foundation.NSObject");
            return new C20635b();
        } catch (ClassNotFoundException unused2) {
            return new C20632i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CallAdapter.Factory mo69439a(Executor executor) {
        if (executor != null) {
            return new C20598f(executor);
        }
        return C20589c.f50174a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo69440a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }
}
