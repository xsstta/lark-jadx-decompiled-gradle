package com.bytedance.ee.log;

import android.content.Context;
import com.bytedance.ee.bear.p411l.p412a.C7957a;
import com.ss.android.lark.log.C41702d;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.log.a */
public class C13479a {

    /* renamed from: a */
    private static String f35523a = "Bear_";

    /* renamed from: b */
    private static AbstractC13480a f35524b;

    /* renamed from: com.bytedance.ee.log.a$a */
    public interface AbstractC13480a {
        /* renamed from: a */
        boolean mo43825a(String str, String str2);

        /* renamed from: a */
        boolean mo43826a(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static void m54756a(AbstractC13480a aVar) {
        f35524b = aVar;
    }

    /* renamed from: a */
    public static void m54757a(String str) {
        m54758a("", str);
    }

    /* renamed from: b */
    public static void m54763b(String str) {
        m54764b("", str);
    }

    /* renamed from: c */
    public static void m54767c(String str) {
        m54772d("", str);
    }

    /* renamed from: d */
    private static String m54771d(String str) {
        return f35523a + str;
    }

    /* renamed from: d */
    public static void m54772d(String str, String str2) {
        Log.m165379d(m54771d(str), str2);
    }

    /* renamed from: a */
    public static void m54758a(String str, String str2) {
        m54759a(str, str2, (Throwable) null);
    }

    /* renamed from: b */
    public static void m54764b(String str, String str2) {
        if (!m54777f(str, str2)) {
            Log.m165389i(m54771d(str), str2);
        }
    }

    /* renamed from: c */
    public static void m54768c(String str, String str2) {
        Log.m165393v(m54771d(str), str2);
    }

    /* renamed from: e */
    public static void m54775e(String str, String str2) {
        if (!m54777f(str, str2)) {
            Log.m165397w(m54771d(str), str2);
        }
    }

    /* renamed from: f */
    private static boolean m54777f(String str, String str2) {
        AbstractC13480a aVar = f35524b;
        if (aVar != null) {
            return aVar.mo43825a(str, str2);
        }
        return false;
    }

    /* renamed from: b */
    public static void m54766b(String str, Throwable th) {
        m54765b("", str, th);
    }

    /* renamed from: c */
    public static void m54770c(String str, Throwable th) {
        m54769c("", str, th);
    }

    /* renamed from: d */
    public static void m54774d(String str, Throwable th) {
        m54773d("", str, th);
    }

    /* renamed from: a */
    public static void m54761a(String str, Throwable th) {
        m54762a(str, th, false);
    }

    /* renamed from: d */
    public static void m54773d(String str, String str2, Throwable th) {
        if (!m54777f(str, str2)) {
            Log.m165398w(m54771d(str), str2, th);
        }
    }

    /* renamed from: a */
    public static void m54759a(String str, String str2, Throwable th) {
        m54760a(str, str2, th, false);
    }

    /* renamed from: b */
    public static void m54765b(String str, String str2, Throwable th) {
        if (!m54777f(str, str2)) {
            Log.m165390i(m54771d(str), str2, th);
        }
    }

    /* renamed from: c */
    public static void m54769c(String str, String str2, Throwable th) {
        Log.m165380d(m54771d(str), str2, th);
    }

    /* renamed from: e */
    private static boolean m54776e(String str, String str2, Throwable th) {
        AbstractC13480a aVar = f35524b;
        if (aVar != null) {
            return aVar.mo43826a(str, str2, th);
        }
        return false;
    }

    /* renamed from: a */
    public static void m54762a(String str, Throwable th, boolean z) {
        m54760a("", str, th, z);
    }

    /* renamed from: a */
    public static void m54760a(String str, String str2, Throwable th, boolean z) {
        if (!m54776e(str, str2, th)) {
            Log.m165385e(m54771d(str), str2, th, z);
        }
    }

    /* renamed from: a */
    public static void m54755a(Context context, String str, boolean z, String str2, int i) {
        Log.init(C41702d.m165527a().mo149970a(context).mo149977b(z).mo149980e(str2).mo149972a(C7957a.m31808a(context)).mo149976b("").mo149979d(str).mo149973a(true).mo149969a(i).mo149974a());
    }
}
