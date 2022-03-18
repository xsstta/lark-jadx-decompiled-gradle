package com.ss.android.lark.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.diskmanage.clean.DiskCleanUtils;
import com.ss.android.lark.utils.p2906c.C57815a;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.utils.k */
public class C57849k {
    /* renamed from: a */
    public static long m224518a(File file) throws Exception {
        return DiskCleanUtils.f94602a.mo135606b(file);
    }

    /* renamed from: d */
    public static void m224531d(Context context) {
        m224532e(context);
        m224533f(context);
    }

    /* renamed from: e */
    public static void m224532e(Context context) {
        DiskCleanUtils.f94602a.mo135604a(context);
    }

    /* renamed from: f */
    public static void m224533f(Context context) {
        DiskCleanUtils.f94602a.mo135609b(context);
    }

    /* renamed from: h */
    public static boolean m224535h(Context context) {
        return DiskCleanUtils.f94602a.mo135611c(context);
    }

    /* renamed from: i */
    public static boolean m224536i(Context context) {
        return DiskCleanUtils.f94602a.mo135612d(context);
    }

    /* renamed from: a */
    public static String m224519a(double d) {
        return DiskCleanUtils.f94602a.mo135598a(d);
    }

    /* renamed from: b */
    private static boolean m224528b(File file) {
        return m224524a(file, true);
    }

    /* renamed from: b */
    public static long m224525b(Context context) {
        long j = 0;
        for (File file : m224540m(context)) {
            try {
                j += m224518a(file);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    /* renamed from: c */
    public static void m224529c(Context context) {
        for (File file : C57815a.m224353a(context)) {
            if (file.exists()) {
                m224528b(file);
            }
        }
    }

    /* renamed from: g */
    public static void m224534g(Context context) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            m224524a(new File(C57881t.m224610I(context)), false);
        }
    }

    /* renamed from: l */
    public static void m224539l(Context context) {
        for (File file : new ArrayList()) {
            C26311p.m95291k(file.getPath());
        }
        m224529c(context);
    }

    /* renamed from: j */
    public static void m224537j(Context context) {
        ArrayList<File> arrayList = new ArrayList();
        arrayList.addAll(m224521a(C57881t.m224634f(context), "lark_", 5));
        arrayList.addAll(m224521a(C57881t.m224635g(context), "lark_", 5));
        arrayList.addAll(m224521a(C57881t.m224636h(context), "lark_", 7));
        arrayList.addAll(m224526b(C57881t.m224639k(context), 5));
        arrayList.addAll(m224520a(C57881t.m224628c(context), 2));
        arrayList.addAll(m224526b(C57881t.m224632e(context), 7));
        for (File file : arrayList) {
            C26311p.m95291k(file.getPath());
        }
    }

    /* renamed from: a */
    public static boolean m224523a(Context context) {
        boolean z = false;
        for (File file : m224540m(context)) {
            if (file.exists()) {
                z |= m224528b(file);
            }
        }
        return z;
    }

    /* renamed from: k */
    public static void m224538k(Context context) {
        ArrayList<File> arrayList = new ArrayList();
        arrayList.addAll(m224526b(C57881t.m224638j(context), 7));
        arrayList.addAll(m224520a(C57881t.m224640l(context), 5));
        arrayList.addAll(m224520a(C57881t.m224637i(context), 15));
        arrayList.addAll(m224520a(C57881t.m224641m(context), 15));
        arrayList.addAll(m224520a(C57881t.m224610I(context), 7));
        arrayList.addAll(m224520a(C57881t.m224606E(context), 7));
        arrayList.addAll(m224520a(C57881t.m224607F(context), 7));
        arrayList.addAll(m224520a(C57881t.m224609H(context), 7));
        arrayList.addAll(m224520a(C57881t.m224605D(context), 7));
        arrayList.addAll(m224520a(C57881t.m224648t(context), 15));
        arrayList.addAll(m224520a(C57881t.m224644p(context), 7));
        arrayList.addAll(m224520a(C57881t.m224649u(context), 7));
        arrayList.addAll(m224520a(C57881t.m224612K(context), 15));
        arrayList.addAll(m224520a(C57881t.m224647s(context), 1));
        arrayList.addAll(m224520a(C57881t.m224646r(context), 7));
        arrayList.addAll(m224520a(C57881t.m224630d(context), 5));
        for (File file : arrayList) {
            C26311p.m95291k(file.getPath());
        }
    }

    /* renamed from: m */
    private static List<File> m224540m(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new File(C57881t.m224606E(context)));
        arrayList.add(new File(C57881t.m224607F(context)));
        arrayList.add(new File(C57881t.m224609H(context)));
        arrayList.add(new File(C57881t.m224610I(context)));
        arrayList.add(new File(C57881t.m224605D(context)));
        arrayList.add(new File(C57881t.m224646r(context)));
        arrayList.add(new File(C57881t.m224647s(context)));
        arrayList.add(new File(C57881t.m224630d(context)));
        arrayList.add(new File(C57881t.m224623b(context)));
        arrayList.add(new File(C57881t.m224602A(context)));
        arrayList.add(new File(C57881t.m224628c(context)));
        arrayList.add(new File(C57881t.m224643o(context)));
        arrayList.add(new File(C57881t.m224641m(context)));
        arrayList.add(new File(C57881t.m224640l(context)));
        arrayList.add(new File(C57881t.m224649u(context)));
        arrayList.add(new File(C57881t.m224638j(context)));
        arrayList.add(new File(C57881t.m224612K(context)));
        arrayList.add(new File(C57881t.m224648t(context)));
        arrayList.add(new File(C57881t.m224644p(context)));
        return arrayList;
    }

    /* renamed from: b */
    public static void m224527b(Context context, String str) {
        m224530c(context, str);
    }

    /* renamed from: b */
    private static List<File> m224526b(String str, int i) {
        return DiskCleanUtils.f94602a.mo135601a(str, i, false);
    }

    /* renamed from: a */
    private static List<File> m224520a(String str, int i) {
        return DiskCleanUtils.f94602a.mo135608b(str, i, false);
    }

    /* renamed from: a */
    public static void m224522a(final Context context, final String str) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.utils.C57849k.RunnableC578501 */

            public void run() {
                C57849k.m224527b(context, str);
            }
        });
    }

    /* renamed from: c */
    private static void m224530c(Context context, String str) {
        ArrayList<File> arrayList = new ArrayList();
        arrayList.addAll(m224526b(C57881t.m224632e(context), 7));
        if (!TextUtils.isEmpty(str)) {
            arrayList.addAll(m224521a(C57881t.m224624b(context, str), "lark_", 3));
        }
        arrayList.addAll(m224521a(C57881t.m224634f(context), "lark_", 3));
        arrayList.addAll(m224521a(C57881t.m224635g(context), "lark_", 3));
        arrayList.addAll(m224521a(C57881t.m224636h(context), "lark_", 3));
        arrayList.addAll(m224526b(C57881t.m224639k(context), 3));
        arrayList.addAll(m224526b(C57881t.m224637i(context), 15));
        for (File file : arrayList) {
            C26311p.m95291k(file.getPath());
        }
    }

    /* renamed from: a */
    private static boolean m224524a(File file, boolean z) {
        if (file == null) {
            return true;
        }
        if (file == null || !file.isDirectory()) {
            return file.delete();
        }
        String[] list = file.list();
        if (list == null) {
            return true;
        }
        for (String str : list) {
            if (!m224524a(new File(file, str), z)) {
                return false;
            }
        }
        if (z) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: a */
    private static List<File> m224521a(String str, String str2, int i) {
        return DiskCleanUtils.f94602a.mo135602a(str, str2, i);
    }
}
