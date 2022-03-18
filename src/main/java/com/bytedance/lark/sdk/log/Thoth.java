package com.bytedance.lark.sdk.log;

import com.C1711a;

public class Thoth {
    private static native void _clientLogClose();

    private static native void _clientLogFlush();

    private static native void _clientLogV2(String str, String str2, String str3, String str4, int i, long j, String str5, String str6, int i2, String str7, String str8, int i3);

    private static native void _endSpan(long j, String str);

    private static native int _initClientLog(String str, String str2, int i);

    private static native int _initMetricPath(String str, String str2);

    private static native long _startChildSpan(long j, String str);

    private static native long _startRootSpan(String str);

    private static native int _writeMetric(long j, String str, int[] iArr, int i, int i2, String str2);

    private static native int _writeMetricV2(long j, String str, int[] iArr, int i, int i2, String str2, int i3, long j2);

    static {
        C1711a.m7628a("lark");
    }

    /* renamed from: a */
    public static long m72359a(String str) {
        return _startRootSpan(str);
    }

    /* renamed from: b */
    public static void m72360b(long j, String str) {
        _endSpan(j, str);
    }

    /* renamed from: a */
    public static int m72356a(String str, String str2) {
        return _initMetricPath(str, str2);
    }

    /* renamed from: a */
    public static long m72358a(long j, String str) {
        return _startChildSpan(j, str);
    }

    /* renamed from: a */
    public static int m72357a(String str, String str2, int i) {
        return _initClientLog(str, str2, i);
    }

    /* renamed from: a */
    public static int m72354a(long j, String str, int[] iArr, int i, int i2, String str2) {
        return _writeMetric(j, str, iArr, i, i2, str2);
    }

    /* renamed from: a */
    public static int m72355a(long j, String str, int[] iArr, int i, int i2, String str2, int i3, long j2) {
        return _writeMetricV2(j, str, iArr, i, i2, str2, i3, j2);
    }
}
