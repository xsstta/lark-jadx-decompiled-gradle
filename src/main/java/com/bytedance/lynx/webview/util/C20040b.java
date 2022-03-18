package com.bytedance.lynx.webview.util;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.util.b */
public final class C20040b {

    /* renamed from: a */
    private static boolean f48969a = false;

    /* renamed from: b */
    private static boolean f48970b = false;

    /* renamed from: c */
    private static boolean f48971c = true;

    /* renamed from: d */
    private static JSONObject f48972d;

    /* renamed from: c */
    public static boolean m73124c() {
        return f48970b;
    }

    /* renamed from: d */
    public static boolean m73125d() {
        return f48969a;
    }

    /* renamed from: f */
    public static boolean m73127f() {
        return f48971c;
    }

    /* renamed from: a */
    public static boolean m73121a() {
        return f48969a;
    }

    /* renamed from: e */
    public static JSONObject m73126e() {
        if (f48969a) {
            if (f48972d == null) {
                f48972d = m73123b();
            }
            return f48972d;
        }
        C20048g.m73164d("should never get here! erro get debug json object");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[SYNTHETIC, Splitter:B:21:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a A[SYNTHETIC, Splitter:B:29:0x006a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m73123b() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20040b.m73123b():org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m73120a(boolean z) {
        f48970b = z;
    }

    /* renamed from: a */
    public static boolean m73122a(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
