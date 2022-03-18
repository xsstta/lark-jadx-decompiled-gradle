package com.huawei.hms.maps;

import android.text.TextUtils;
import com.ss.ttm.player.MediaPlayer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class mcq {

    /* renamed from: a */
    private static StringBuffer f58683a = new StringBuffer();

    /* renamed from: b */
    private static final Pattern f58684b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    private static String m86882a(long j) {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS").format(new Date(j));
    }

    /* renamed from: a */
    private static String m86883a(String str) {
        if (str == null) {
            return "HmsMapKit";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 0;
        if (stackTrace.length > 5) {
            i = stackTrace[5].getLineNumber();
        }
        return "HmsMapKit_" + str + "_" + i;
    }

    /* renamed from: a */
    public static void m86884a(String str, String str2) {
        mcr.m86892a(m86883a(str), str2);
    }

    /* renamed from: b */
    private static String m86885b(String str) {
        StringBuilder sb = new StringBuilder((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m86886b(String str, String str2) {
        mcr.m86893b(m86883a(str), str2);
    }

    /* renamed from: c */
    public static void m86887c(String str, String str2) {
        mcr.m86894c(m86883a(str), str2);
    }

    /* renamed from: d */
    public static void m86888d(String str, String str2) {
        mcr.m86895d(m86883a(str), str2);
        m86890f(str, m86885b(str2));
    }

    /* renamed from: e */
    public static void m86889e(String str, String str2) {
        mcr.m86896e(m86883a(str), str2);
        m86890f(str, m86885b(str2));
    }

    /* renamed from: f */
    private static void m86890f(String str, String str2) {
        StringBuffer stringBuffer;
        if (TextUtils.isEmpty(str)) {
            str = "HmsMapKit";
        }
        if (f58683a.length() == 0) {
            stringBuffer = f58683a;
        } else {
            stringBuffer = f58683a;
            stringBuffer.append("\n");
        }
        stringBuffer.append(m86882a(System.currentTimeMillis()));
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        if (f58683a.length() > 3072) {
            f58683a.setLength(0);
        }
    }
}
