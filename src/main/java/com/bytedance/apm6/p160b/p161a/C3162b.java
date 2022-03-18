package com.bytedance.apm6.p160b.p161a;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.util.p195b.C3350b;
import java.io.File;
import java.util.UUID;

/* renamed from: com.bytedance.apm6.b.a.b */
public class C3162b {

    /* renamed from: a */
    private static File f10121a;

    /* renamed from: b */
    private static File f10122b;

    /* renamed from: c */
    private static File f10123c;

    /* renamed from: d */
    private static File f10124d;

    /* renamed from: e */
    public static File m13181e() {
        return new File(m13177a(), "child_process_persistent");
    }

    /* renamed from: a */
    public static synchronized File m13177a() {
        File file;
        synchronized (C3162b.class) {
            if (f10124d == null) {
                File file2 = new File(C3318a.m13917w().getFilesDir(), "apm6");
                f10124d = file2;
                if (!file2.exists()) {
                    f10124d.mkdirs();
                }
            }
            file = f10124d;
        }
        return file;
    }

    /* renamed from: f */
    public static String m13182f() {
        return System.currentTimeMillis() + "_" + UUID.randomUUID().toString() + ".log";
    }

    /* renamed from: b */
    public static synchronized File m13178b() {
        File file;
        File file2;
        synchronized (C3162b.class) {
            if (f10123c == null) {
                if (C3318a.m13827e()) {
                    file2 = new File(m13177a(), "persistent");
                } else {
                    file2 = new File(m13177a(), "child_process_persistent");
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                f10123c = file2;
                if (C3318a.m13915u()) {
                    String str = C3159a.f10110a;
                    C3350b.m13932a(str, "prepare PersistentDirectory success. name=" + f10123c);
                }
            }
            file = f10123c;
        }
        return file;
    }

    /* renamed from: d */
    public static synchronized File m13180d() {
        File file;
        synchronized (C3162b.class) {
            if (f10122b == null) {
                File file2 = new File(m13177a(), "flush");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                f10122b = file2;
                if (C3318a.m13915u()) {
                    String str = C3159a.f10110a;
                    C3350b.m13932a(str, "prepare FlushDirectory success. name=" + f10122b);
                }
            }
            file = f10122b;
        }
        return file;
    }

    /* renamed from: c */
    public static synchronized File m13179c() {
        File file;
        synchronized (C3162b.class) {
            if (f10121a == null) {
                try {
                    String f = C3318a.m13828f();
                    String str = f.replace(".", "_").replace(":", "-") + ".bin";
                    if (!C3318a.m13827e()) {
                        str = C3318a.m13826d() + "_" + str;
                    }
                    File file2 = new File(m13178b(), str);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    f10121a = file2;
                    if (C3318a.m13915u()) {
                        C3350b.m13932a(C3159a.f10110a, "prepare PersistentFile success. fileName=" + f10121a);
                    }
                } catch (Exception e) {
                    C3350b.m13935b(C3159a.f10110a, "prepare PersistentFile fail.", e);
                }
            }
            file = f10121a;
        }
        return file;
    }
}
