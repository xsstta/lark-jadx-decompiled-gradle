package com.bytedance.crash.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import java.io.File;

/* renamed from: com.bytedance.crash.util.t */
public class C3962t {

    /* renamed from: a */
    private static String f12062a;

    /* renamed from: b */
    private static File f12063b;

    /* renamed from: c */
    private static File f12064c;

    /* renamed from: d */
    private static File f12065d;

    /* renamed from: e */
    private static File f12066e;

    /* renamed from: f */
    private static File f12067f;

    /* renamed from: a */
    public static File m16480a() {
        File file = f12064c;
        if (file == null) {
            return m16511i(C3774m.m15609j());
        }
        return file;
    }

    /* renamed from: b */
    public static File m16486b() {
        if (f12067f == null) {
            File file = new File(new File(m16516k(C3774m.m15609j()), m16498d()), "trace");
            f12067f = file;
            file.getParentFile().mkdirs();
        }
        return f12067f;
    }

    /* renamed from: c */
    public static String m16493c() {
        return String.format("ensure_%s", C3774m.m15605f());
    }

    /* renamed from: d */
    private static String m16498d() {
        return "anr_" + C3774m.m15605f();
    }

    /* renamed from: a */
    public static File m16483a(File file) {
        return new File(file, "dump.zip");
    }

    /* renamed from: b */
    public static File m16489b(File file) {
        return new File(file, "flog.txt");
    }

    /* renamed from: c */
    public static File m16492c(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: d */
    public static File m16496d(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: g */
    public static File m16506g(File file) {
        return new File(file, "upload.json");
    }

    /* renamed from: h */
    public static File m16509h(File file) {
        return new File(file, "javastack.txt");
    }

    /* renamed from: i */
    public static File m16512i(File file) {
        return new File(file, "malloc.txt");
    }

    /* renamed from: j */
    public static File m16515j(File file) {
        return new File(file, "pthreads.txt");
    }

    /* renamed from: k */
    public static File m16517k(File file) {
        return new File(file, "abortmsg.txt");
    }

    /* renamed from: b */
    public static File m16487b(Context context) {
        return new File(m16522p(context), "npth/NativeHeapTracker");
    }

    /* renamed from: d */
    public static File m16495d(Context context) {
        return new File(m16522p(context), "npth/CrashLogSimple");
    }

    /* renamed from: e */
    public static File m16501e(String str) {
        return new File(m16488b(C3774m.m15609j(), str), "threads.txt");
    }

    /* renamed from: f */
    public static File m16502f(Context context) {
        return new File(m16522p(context), "npth/availableCheck");
    }

    /* renamed from: g */
    public static File m16505g(Context context) {
        return new File(m16522p(context), "npth/configCrash/");
    }

    /* renamed from: h */
    public static File m16510h(String str) {
        return new File(m16488b(C3774m.m15609j(), str), "rountines.txt");
    }

    /* renamed from: i */
    public static File m16513i(String str) {
        return new File(m16488b(C3774m.m15609j(), str), "leakd_threads.txt");
    }

    /* renamed from: k */
    public static File m16516k(Context context) {
        return new File(m16522p(context), "npth/CrashCommonLog");
    }

    /* renamed from: m */
    public static File m16519m(Context context) {
        return new File(m16522p(context), "issueCrashTimes");
    }

    /* renamed from: o */
    public static File m16521o(Context context) {
        return new File(m16522p(context), "npth/alogCrash");
    }

    /* renamed from: a */
    public static File m16481a(Context context) {
        return new File(m16522p(context), "npth/CrashLogJava");
    }

    /* renamed from: b */
    public static String m16490b(String str) {
        return "dart_" + str;
    }

    /* renamed from: c */
    public static File m16491c(Context context) {
        if (context == null) {
            context = C3774m.m15609j();
        }
        return new File(m16522p(context), "npth/GwpReport");
    }

    /* renamed from: d */
    public static File m16497d(String str) {
        return new File(m16488b(C3774m.m15609j(), str), "fds.txt");
    }

    /* renamed from: e */
    public static File m16500e(File file) {
        return new File(m16488b(C3774m.m15609j(), file.getName()), "maps.txt");
    }

    /* renamed from: f */
    public static File m16503f(File file) {
        return new File(file, file.getName());
    }

    /* renamed from: g */
    public static File m16507g(String str) {
        return new File(m16488b(C3774m.m15609j(), str), "pthreads.txt");
    }

    /* renamed from: h */
    public static File m16508h(Context context) {
        if (f12063b == null) {
            if (context == null) {
                context = C3774m.m15609j();
            }
            f12063b = new File(m16522p(context), "npth/asan");
        }
        return f12063b;
    }

    /* renamed from: i */
    public static File m16511i(Context context) {
        if (f12064c == null) {
            if (context == null) {
                context = C3774m.m15609j();
            }
            f12064c = new File(m16522p(context), "npth/CrashLogNative");
        }
        return f12064c;
    }

    /* renamed from: l */
    public static File m16518l(Context context) {
        if (f12066e == null) {
            f12066e = new File(m16516k(context), "asdawd");
        }
        return f12066e;
    }

    /* renamed from: e */
    public static File m16499e(Context context) {
        String str;
        String p = m16522p(context);
        StringBuilder sb = new StringBuilder();
        sb.append("npth/RuntimeContext/");
        if (C3933b.m16336b(context)) {
            str = "main";
        } else {
            str = C3933b.m16337c(context);
        }
        sb.append(str.replaceAll(":", "@"));
        return new File(p, sb.toString());
    }

    /* renamed from: f */
    public static File m16504f(String str) {
        return new File(m16488b(C3774m.m15609j(), str), "meminfo.txt");
    }

    /* renamed from: j */
    public static File m16514j(Context context) {
        if (f12065d == null) {
            f12065d = new File(m16522p(context) + '/' + "npth/CrashCommonLog" + '/' + C3774m.m15606g());
        }
        return f12065d;
    }

    /* renamed from: n */
    public static File m16520n(Context context) {
        return new File(m16522p(context) + '/' + "issueCrashTimes" + '/' + "current.times");
    }

    /* renamed from: p */
    public static String m16522p(Context context) {
        if (context == null) {
            C3968x.m16532a("LogPath", "getDirBeforeInit!");
            return "";
        }
        if (TextUtils.isEmpty(f12062a)) {
            try {
                f12062a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f12062a = "";
                e.printStackTrace();
            }
        }
        return f12062a;
    }

    /* renamed from: c */
    public static String m16494c(String str) {
        return "game_" + str;
    }

    /* renamed from: a */
    public static File m16485a(String str) {
        return new File(m16518l(C3774m.m15609j()), str);
    }

    /* renamed from: a */
    public static File m16482a(Context context, String str) {
        String p = m16522p(context);
        return new File(p, "npth/RuntimeContext/" + str.replaceAll(":", "@"));
    }

    /* renamed from: a */
    public static File m16484a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* renamed from: b */
    public static File m16488b(Context context, String str) {
        return new File(m16522p(context) + '/' + "npth/CrashCommonLog" + '/' + str);
    }
}
