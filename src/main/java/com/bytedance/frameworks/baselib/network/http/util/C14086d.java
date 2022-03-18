package com.bytedance.frameworks.baselib.network.http.util;

import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.d */
public class C14086d {

    /* renamed from: a */
    private static final Pattern f37017a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f37018b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f37019c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static boolean m57027a(String str) {
        return f37017a.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m57028b(String str) {
        return f37018b.matcher(str).matches();
    }

    /* renamed from: c */
    public static boolean m57029c(String str) {
        return f37019c.matcher(str).matches();
    }
}
