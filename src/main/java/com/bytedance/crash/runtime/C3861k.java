package com.bytedance.crash.runtime;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.crash.util.C3968x;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.runtime.k */
public class C3861k {

    /* renamed from: a */
    public static Printer f11839a;

    /* renamed from: b */
    public static final Printer f11840b = new Printer() {
        /* class com.bytedance.crash.runtime.C3861k.C38621 */

        public void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    C3861k.m15993a().mo15475a(str);
                } else if (str.charAt(0) == '<') {
                    C3861k.m15993a().mo15478b(str);
                }
                if (C3861k.f11839a != null && C3861k.f11839a != C3861k.f11840b) {
                    C3861k.f11839a.println(str);
                }
            }
        }
    };

    /* renamed from: c */
    private static C3861k f11841c;

    /* renamed from: d */
    private long f11842d = -1;

    /* renamed from: e */
    private final List<Printer> f11843e = new ArrayList();

    /* renamed from: f */
    private final List<Printer> f11844f = new ArrayList();

    /* renamed from: g */
    private boolean f11845g;

    private C3861k() {
    }

    /* renamed from: a */
    public static C3861k m15993a() {
        if (f11841c == null) {
            synchronized (C3861k.class) {
                if (f11841c == null) {
                    f11841c = new C3861k();
                }
            }
        }
        return f11841c;
    }

    /* renamed from: b */
    public void mo15476b() {
        if (!this.f11845g) {
            this.f11845g = true;
            Printer d = m15995d();
            f11839a = d;
            Printer printer = f11840b;
            if (d == printer) {
                f11839a = null;
            }
            Looper.getMainLooper().setMessageLogging(printer);
        }
    }

    /* renamed from: c */
    public boolean mo15479c() {
        if (this.f11842d == -1 || SystemClock.uptimeMillis() - this.f11842d <= 5000) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private Printer m15995d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception e) {
            C3968x.m16537b((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo15474a(Printer printer) {
        this.f11844f.add(printer);
    }

    /* renamed from: a */
    public void mo15475a(String str) {
        this.f11842d = -1;
        try {
            m15994a(this.f11843e, str);
        } catch (Exception e) {
            C3968x.m16534a((Throwable) e);
        }
    }

    /* renamed from: b */
    public synchronized void mo15477b(Printer printer) {
        this.f11843e.add(printer);
    }

    /* renamed from: b */
    public void mo15478b(String str) {
        this.f11842d = SystemClock.uptimeMillis();
        try {
            m15994a(this.f11844f, str);
        } catch (Exception e) {
            C3968x.m16537b((Throwable) e);
        }
    }

    /* renamed from: a */
    private static void m15994a(List<? extends Printer> list, String str) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Printer printer = (Printer) list.get(i);
                    if (printer != null) {
                        printer.println(str);
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                C3968x.m16534a(th);
            }
        }
    }
}
