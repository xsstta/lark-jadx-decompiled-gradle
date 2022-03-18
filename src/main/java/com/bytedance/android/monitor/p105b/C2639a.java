package com.bytedance.android.monitor.p105b;

import android.app.Application;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p109f.C2648b;
import com.bytedance.android.monitor.p112i.C2655c;
import com.bytedance.android.monitor.p112i.C2656d;
import java.io.File;

/* renamed from: com.bytedance.android.monitor.b.a */
public class C2639a {

    /* renamed from: a */
    private static boolean f8373a;

    /* renamed from: b */
    private static boolean f8374b;

    /* renamed from: a */
    public static boolean m11085a() {
        return f8373a;
    }

    /* renamed from: b */
    public static boolean m11088b() {
        return f8374b;
    }

    /* renamed from: a */
    public static void m11083a(boolean z) {
        m11084a(z, false);
    }

    /* renamed from: b */
    public static void m11086b(boolean z) {
        m11087b(z, false);
    }

    /* renamed from: a */
    public static void m11082a(Application application) {
        if (application != null) {
            try {
                File a = C2656d.m11160a(application, "monitor_data_switch");
                File file = new File(a, "is_debug");
                if (file.isFile() && file.exists()) {
                    m11083a(true);
                }
                File file2 = new File(a, "is_output_file");
                if (file2.isFile() && file2.exists()) {
                    m11086b(true);
                }
            } catch (Throwable th) {
                C2655c.m11159a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m11087b(boolean z, boolean z2) {
        f8374b = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(C2656d.m11160a(application, "monitor_data_switch"), "is_output_file");
            if (z) {
                C2656d.m11166c(file);
            } else {
                C2656d.m11164b(file);
            }
        }
    }

    /* renamed from: a */
    public static void m11084a(boolean z, boolean z2) {
        f8373a = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(C2656d.m11160a(application, "monitor_data_switch"), "is_debug");
            if (z) {
                C2656d.m11166c(file);
            } else {
                C2656d.m11164b(file);
            }
        }
        if (z) {
            C2648b.m11131a(true);
        }
    }
}
