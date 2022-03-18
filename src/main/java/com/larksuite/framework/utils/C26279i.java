package com.larksuite.framework.utils;

import com.ss.ttm.player.MediaPlayer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.larksuite.framework.utils.i */
public class C26279i {

    /* renamed from: a */
    private static final SimpleDateFormat f64902a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: b */
    private static long m95161b(long j, long j2) {
        return j + j2;
    }

    /* renamed from: a */
    public static Date m95154a(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            simpleDateFormat.setLenient(false);
            return simpleDateFormat.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Date m95155a(Date date, int i) {
        Calendar instance = Calendar.getInstance();
        if (date != null) {
            instance.setTime(date);
        }
        instance.add(6, i);
        return instance.getTime();
    }

    /* renamed from: a */
    public static boolean m95156a(long j, long j2) {
        return m95157a(j, j2, TimeZone.getDefault());
    }

    /* renamed from: a */
    public static boolean m95157a(long j, long j2, TimeZone timeZone) {
        Calendar instance = Calendar.getInstance(timeZone);
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance(timeZone);
        instance2.setTimeInMillis(j2);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static long m95159b() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: a */
    public static String m95148a() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    /* renamed from: a */
    public static int m95147a(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(5);
    }

    /* renamed from: b */
    public static long m95160b(long j) {
        return m95163c(j * 1000) / 1000;
    }

    /* renamed from: c */
    public static long m95163c(long j) {
        return m95161b(j, (long) TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: b */
    public static int m95158b(Date date) {
        long time = date.getTime();
        if (C26280j.m95173a(time)) {
            return 0;
        }
        if (C26280j.m95175b(time)) {
            return 1;
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m95164c(Date date) {
        if (date != null && C26280j.m95176c(date.getTime())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m95149a(int i) {
        if (i < 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 % 60;
        int i6 = i4 / 60;
        StringBuilder sb = new StringBuilder();
        if (i6 > 0) {
            sb.append(m95162b(i6));
            sb.append(":");
        }
        sb.append(m95162b(i5));
        sb.append(":");
        sb.append(m95162b(i3));
        return sb.toString();
    }

    /* renamed from: b */
    private static String m95162b(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* renamed from: a */
    public static String m95150a(long j) {
        long j2 = (j + 500) / 1000;
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        if (j3 != 0) {
            return ("" + j3 + "′") + String.format("%02d", Long.valueOf(j4)) + "″";
        }
        return "" + j4 + "″";
    }

    /* renamed from: a */
    public static String m95152a(String str) {
        return m95153a(new Date(), str);
    }

    /* renamed from: a */
    public static int m95146a(int i, int i2) {
        if (i2 > 12) {
            i++;
            i2 = 1;
        } else if (i2 < 1) {
            i--;
            i2 = 12;
        }
        int[] iArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((i % 4 == 0 && i % 100 != 0) || i % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL == 0) {
            iArr[1] = 29;
        }
        try {
            return iArr[i2 - 1];
        } catch (Exception e) {
            e.getStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static String m95151a(long j, String str) {
        return m95153a(new Date(j * 1000), str);
    }

    /* renamed from: a */
    public static String m95153a(Date date, String str) {
        try {
            return new SimpleDateFormat(str).format(date);
        } catch (Exception unused) {
            return "";
        }
    }
}
