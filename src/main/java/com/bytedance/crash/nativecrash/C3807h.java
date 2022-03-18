package com.bytedance.crash.nativecrash;

import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.p222f.C3752b;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3968x;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.bytedance.crash.nativecrash.h */
public class C3807h {

    /* renamed from: a */
    public static HashMap<String, String> f11691a;

    /* renamed from: a */
    public static String m15768a() {
        return C3774m.m15609j().getFilesDir() + "/npth/selflib/";
    }

    /* renamed from: b */
    public static void m15772b() {
        if (f11691a == null) {
            f11691a = new HashMap<>();
            File file = new File(C3774m.m15609j().getFilesDir(), "/npth/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        String substring = str.substring(0, str.length() - 4);
                        try {
                            f11691a.put(substring, C3949m.m16421c(file.getAbsolutePath() + "/" + str));
                        } catch (Throwable th) {
                            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                        }
                    } else if (!str.endsWith(".so")) {
                        C3949m.m16412a(new File(file, str));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m15769a(String str) {
        return C3774m.m15609j().getFilesDir() + "/npth/selflib/" + "lib" + str + ".so";
    }

    /* renamed from: b */
    public static String m15771b(String str) {
        return C3774m.m15609j().getFilesDir() + "/npth/selflib/" + str + ".ver";
    }

    /* renamed from: b */
    public static void m15773b(final String str, final String str2) {
        C3866n.m16016b().mo15508a(new Runnable() {
            /* class com.bytedance.crash.nativecrash.C3807h.RunnableC38081 */

            public void run() {
                C3807h.m15772b();
                if (!C3807h.m15770a(str, str2)) {
                    File file = new File(C3807h.m15769a(str));
                    file.getParentFile().mkdirs();
                    if (file.exists()) {
                        file.delete();
                    }
                    C3968x.m16531a("doUnpackLibrary: " + str);
                    if (C3752b.m15517a(C3774m.m15609j(), str, file) == null) {
                        C3807h.f11691a.put(file.getName(), str2);
                        try {
                            C3949m.m16402a(new File(C3807h.m15771b(str)), str2, false);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m15770a(String str, String str2) {
        if (!str2.equals(f11691a.get(str))) {
            return false;
        }
        return new File(m15769a(str)).exists();
    }
}
