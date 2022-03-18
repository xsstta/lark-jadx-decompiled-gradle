package com.tt.miniapp.util;

import android.text.format.DateUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.ttm.player.MediaPlayer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MiniAppDateUtils extends DateUtils {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DifferenceMode {
    }

    /* renamed from: a */
    public static String m261178a(int i) {
        String str;
        StringBuilder sb;
        if (i < 10) {
            sb = new StringBuilder();
            str = "0";
        } else {
            sb = new StringBuilder();
            str = "";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m261181b(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static int m261177a(String str) {
        try {
            if (str.startsWith("0")) {
                str = str.substring(1);
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            AppBrandLogger.m52829e("ShareInfoResp", "trimZero", e);
            return 0;
        }
    }

    /* renamed from: a */
    public static String m261179a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(new Date(j));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static int m261176a(int i, int i2) {
        List asList = Arrays.asList("1", "3", "5", "7", "8", "10", "12");
        List asList2 = Arrays.asList("4", "6", "9", "11");
        if (asList.contains(String.valueOf(i2))) {
            return 31;
        }
        if (asList2.contains(String.valueOf(i2))) {
            return 30;
        }
        if (i <= 0) {
            return 29;
        }
        if ((i % 4 != 0 || i % 100 == 0) && i % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL != 0) {
            return 28;
        }
        return 29;
    }

    /* renamed from: a */
    public static Date m261180a(String str, String str2) {
        try {
            return new Date(new SimpleDateFormat(str2).parse(str).getTime());
        } catch (ParseException e) {
            AppBrandLogger.m52829e("ShareInfoResp", "parseDate", e);
            return null;
        }
    }
}
