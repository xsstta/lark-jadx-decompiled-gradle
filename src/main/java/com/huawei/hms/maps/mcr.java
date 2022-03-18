package com.huawei.hms.maps;

import android.text.TextUtils;
import android.util.Log;
import com.ss.ttm.player.MediaPlayer;
import java.util.regex.Pattern;

public final class mcr {

    /* renamed from: a */
    private static final Pattern f58685a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    private static String m86891a(String str) {
        StringBuilder sb = new StringBuilder((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m86892a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: b */
    public static void m86893b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.d(str, m86891a(str2));
        }
    }

    /* renamed from: c */
    public static void m86894c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.i(str, m86891a(str2));
        }
    }

    /* renamed from: d */
    public static void m86895d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.w(str, m86891a(str2));
        }
    }

    /* renamed from: e */
    public static void m86896e(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.e(str, m86891a(str2));
        }
    }
}
