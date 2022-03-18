package com.ss.android.lark.dfcore.p1801c;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.dfcore.c.e */
public class C36607e {

    /* renamed from: a */
    private static ConcurrentHashMap<String, SplitInstallSessionState> f94182a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Integer> f94183b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static SplitInstallSessionState m144435a(String str) {
        return f94182a.get(str);
    }

    /* renamed from: b */
    public static int m144438b(String str) {
        Integer num = f94183b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public static void m144437a(String str, SplitInstallSessionState splitInstallSessionState) {
        f94182a.put(str, splitInstallSessionState);
    }

    /* renamed from: a */
    public static void m144436a(String str, int i) {
        f94183b.put(str, Integer.valueOf(i));
    }
}
