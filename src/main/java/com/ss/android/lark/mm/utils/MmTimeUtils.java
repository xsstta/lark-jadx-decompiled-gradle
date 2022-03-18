package com.ss.android.lark.mm.utils;

import java.util.Locale;

public class MmTimeUtils {

    public enum MmTimeFormat {
        MINUTE,
        HOUR
    }

    /* renamed from: b */
    public static MmTimeFormat m186496b(long j) {
        if (j / 3600000 > 0) {
            return MmTimeFormat.HOUR;
        }
        return MmTimeFormat.MINUTE;
    }

    /* renamed from: a */
    public static String m186495a(Long l) {
        Long valueOf = Long.valueOf(l.longValue() / 1000);
        return String.format(Locale.CHINA, "%02d:%02d:%02d", Long.valueOf(valueOf.longValue() / 3600), Long.valueOf((valueOf.longValue() % 3600) / 60), Long.valueOf(valueOf.longValue() % 60));
    }

    /* renamed from: a */
    public static String m186493a(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 > 0) {
            return String.format(Locale.CHINA, "%02d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
        }
        return String.format(Locale.CHINA, "%02d:%02d", Long.valueOf(j4), Long.valueOf(j5));
    }

    /* renamed from: a */
    public static String m186494a(long j, MmTimeFormat mmTimeFormat) {
        MmTimeFormat b = m186496b(j);
        if (b.ordinal() > mmTimeFormat.ordinal()) {
            mmTimeFormat = b;
        }
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (mmTimeFormat == MmTimeFormat.HOUR) {
            return String.format(Locale.CHINA, "%02d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
        }
        return String.format(Locale.CHINA, "%02d:%02d", Long.valueOf(j4), Long.valueOf(j5));
    }
}
