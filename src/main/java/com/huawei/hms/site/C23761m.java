package com.huawei.hms.site;

import android.text.TextUtils;
import android.util.Log;
import com.ss.ttm.player.MediaPlayer;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.huawei.hms.site.m */
public class C23761m {

    /* renamed from: a */
    public static StringBuffer f58834a = new StringBuffer();

    /* renamed from: a */
    public static String m86931a(String str) {
        if (str == null) {
            return "HmsSiteKit";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 0;
        if (stackTrace.length > 5) {
            i = stackTrace[5].getLineNumber();
        }
        return "HmsSiteKit_" + str + "_" + i;
    }

    /* renamed from: a */
    public static String m86932a(String str, boolean z) {
        StringBuilder sb = new StringBuilder((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                str = C23762n.m86937a(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m86934a(String str, String str2, Throwable th, boolean z) {
        String str3;
        String a = m86931a(str);
        if (th == null) {
            C23762n.m86943b(a, str2, z);
            str3 = m86932a(str2, z);
        } else {
            C23762n.m86940a(a, str2, th, z);
            str3 = m86932a(str2, z) + System.lineSeparator() + Log.getStackTraceString(C23762n.m86939a(th));
        }
        m86936c(str, str3);
    }

    /* renamed from: b */
    public static void m86935b(String str, String str2) {
        m86934a(str, str2, null, false);
    }

    /* renamed from: a */
    public static void m86933a(String str, String str2) {
        C23762n.m86941a(m86931a(str), str2, false);
    }

    /* renamed from: c */
    public static void m86936c(String str, String str2) {
        String str3;
        StringBuffer stringBuffer;
        if (TextUtils.isEmpty(str)) {
            str = "HmsSiteKit";
        }
        if (f58834a.length() == 0) {
            stringBuffer = f58834a;
            str3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS").format(new Date(System.currentTimeMillis()));
        } else {
            stringBuffer = f58834a;
            stringBuffer.append("\n");
            str3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS").format(new Date(System.currentTimeMillis()));
        }
        stringBuffer.append(str3);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        if (f58834a.length() > 3072) {
            f58834a.setLength(0);
        }
    }
}
