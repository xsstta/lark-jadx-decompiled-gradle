package com.larksuite.component.universe_design.toast;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToastUtils;", "", "()V", "checkIfNeedToCompatToast", "", "getDeclaredField", "Ljava/lang/reflect/Field;", "obj", "fieldName", "", "getFieldValue", "field", "setFieldValue", "object", "newFieldValue", "tryCompat", "", "toast", "Landroid/widget/Toast;", "tryToCompat", "InternalHandlerCallback", "InternalRunnable", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.toast.e */
public final class UDToastUtils {

    /* renamed from: a */
    public static final UDToastUtils f63812a = new UDToastUtils();

    private UDToastUtils() {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToastUtils$InternalRunnable;", "Ljava/lang/Runnable;", "mRunnable", "(Ljava/lang/Runnable;)V", "run", "", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.e$b */
    public static final class InternalRunnable implements Runnable {

        /* renamed from: a */
        private final Runnable f63814a;

        public void run() {
            try {
                this.f63814a.run();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public InternalRunnable(Runnable runnable) {
            Intrinsics.checkParameterIsNotNull(runnable, "mRunnable");
            this.f63814a = runnable;
        }
    }

    /* renamed from: a */
    private final boolean m93253a() {
        if (Build.VERSION.SDK_INT == 25) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToastUtils$InternalHandlerCallback;", "Landroid/os/Handler$Callback;", "mHandler", "Landroid/os/Handler;", "(Landroid/os/Handler;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.e$a */
    public static final class InternalHandlerCallback implements Handler.Callback {

        /* renamed from: a */
        private final Handler f63813a;

        public InternalHandlerCallback(Handler handler) {
            Intrinsics.checkParameterIsNotNull(handler, "mHandler");
            this.f63813a = handler;
        }

        public boolean handleMessage(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "msg");
            try {
                this.f63813a.handleMessage(message);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        }
    }

    /* renamed from: b */
    private final void m93256b(Toast toast) {
        Object a;
        try {
            Object a2 = m93251a(toast, "mTN");
            if (a2 != null) {
                boolean z = false;
                Object a3 = m93251a(a2, "mShow");
                if (a3 != null && (a3 instanceof Runnable)) {
                    z = m93254a(a2, "mShow", new InternalRunnable((Runnable) a3));
                }
                if (!z && (a = m93251a(a2, "mHandler")) != null && (a instanceof Handler)) {
                    m93254a(a, "mCallback", new InternalHandlerCallback((Handler) a));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo91697a(Toast toast) {
        Intrinsics.checkParameterIsNotNull(toast, "toast");
        if (m93253a()) {
            m93256b(toast);
        }
    }

    /* renamed from: a */
    private final Object m93251a(Object obj, String str) {
        return m93252a(obj, m93255b(obj, str));
    }

    /* renamed from: a */
    private final Object m93252a(Object obj, Field field) {
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
    private final Field m93255b(Object obj, String str) {
        Class<?> cls = obj.getClass();
        while (cls != null && (!Intrinsics.areEqual(cls, Object.class))) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m93254a(Object obj, String str, Object obj2) {
        Field b = m93255b(obj, str);
        if (b == null) {
            return false;
        }
        try {
            if (Modifier.isFinal(b.getModifiers())) {
                Field declaredField = Field.class.getDeclaredField("accessFlags");
                Intrinsics.checkExpressionValueIsNotNull(declaredField, "Field::class.java.getDeclaredField(\"accessFlags\")");
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
