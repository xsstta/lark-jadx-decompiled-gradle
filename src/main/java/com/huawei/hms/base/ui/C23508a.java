package com.huawei.hms.base.ui;

import android.text.TextUtils;
import android.util.Log;
import com.ss.ttm.player.MediaPlayer;
import java.util.regex.Pattern;

/* renamed from: com.huawei.hms.base.ui.a */
public class C23508a {

    /* renamed from: a */
    public static final Pattern f57955a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    public static String m85250a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (f57955a.matcher(String.valueOf(charAt)).matches()) {
                if (i % 2 == 0) {
                    charAt = '*';
                }
                i++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m85252a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.e(str, m85251a(str2, false));
        }
    }

    /* renamed from: a */
    public static String m85251a(String str, boolean z) {
        StringBuilder sb = new StringBuilder((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                sb.append(m85250a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m85253a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            Log.e(str, m85251a(str2, z));
        }
    }
}
