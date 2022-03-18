package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.nativecrash.C3809i;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3937e;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3962t;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Date;

/* renamed from: com.bytedance.crash.runtime.p */
public class C3869p {

    /* renamed from: a */
    private static File f11858a;

    /* renamed from: a */
    public static void m16027a(String str, String str2, long j) {
        try {
            File b = m16029b();
            if (b != null) {
                C3949m.m16402a(b, str + ' ' + str2 + ' ' + C3937e.m16355c().format(new Date(j)) + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static File m16029b() {
        if (f11858a == null) {
            if (C3933b.m16337c(C3774m.m15609j()) == null) {
                return null;
            }
            f11858a = new File(C3809i.m15787b(), "procHistory.txt");
            C3866n.m16016b().mo15509a(new Runnable() {
                /* class com.bytedance.crash.runtime.C3869p.RunnableC38701 */

                public void run() {
                    C3869p.m16024a();
                }
            }, 15000);
        }
        return f11858a;
    }

    /* renamed from: a */
    public static void m16024a() {
        File file;
        String[] list;
        if (C3933b.m16336b(C3774m.m15609j()) && (list = (file = new File(C3962t.m16522p(C3774m.m15609j()), "npth/ProcessTrack/")).list()) != null && list.length > 25) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 25; i++) {
                C3949m.m16412a(new File(file, list[i]));
            }
        }
    }

    /* renamed from: b */
    public static C3949m.C3951b m16028b(long j) {
        File[] listFiles = m16022a(j).listFiles(new FilenameFilter() {
            /* class com.bytedance.crash.runtime.C3869p.C38712 */

            public boolean accept(File file, String str) {
                return str.endsWith(".txt");
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        return new C3949m.C3951b(listFiles, true);
    }

    /* renamed from: a */
    public static File m16022a(long j) {
        String p = C3962t.m16522p(C3774m.m15609j());
        return new File(p, "npth/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    /* renamed from: a */
    public static File m16021a(int i, long j) {
        File a = m16022a(j);
        final String str = C3937e.m16355c().format(new Date(j)) + "_" + i;
        String[] list = a.list(new FilenameFilter() {
            /* class com.bytedance.crash.runtime.C3869p.C38723 */

            public boolean accept(File file, String str) {
                return str.equals(str);
            }
        });
        if (list == null || list.length == 0) {
            return null;
        }
        return new File(a, list[0]);
    }

    /* renamed from: a */
    public static File m16023a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            str = C3774m.m15609j().getPackageName();
        }
        File a = m16022a(j);
        return new File(a, str.replace(':', '_') + ".txt");
    }

    /* renamed from: a */
    public static void m16025a(File file, long j) {
        String str;
        File a = m16022a(j);
        C3949m.m16420b(file, new File(a, C3937e.m16355c().format(new Date(j)) + "_" + file.getName()));
        try {
            str = C3949m.m16426e(new File(file, "cmd"));
        } catch (Throwable unused) {
            str = null;
        }
        C3949m.m16422c(new File(file, "procHistory.txt"), m16023a(str, j));
    }

    /* renamed from: a */
    public static void m16026a(String str, String str2) {
        try {
            File b = m16029b();
            if (b != null) {
                C3949m.m16402a(b, str + ' ' + str2 + ' ' + C3937e.m16355c().format(new Date(System.currentTimeMillis())) + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
