package com.haibin.calendarview;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.haibin.calendarview.i */
public final class C23354i {

    /* renamed from: a */
    private static String[] f57657a;

    /* renamed from: b */
    private static String[] f57658b;

    /* renamed from: c */
    private static String[] f57659c;

    /* renamed from: d */
    private static String[] f57660d;

    /* renamed from: e */
    private static final Map<Integer, String[]> f57661e = new HashMap();

    /* renamed from: f */
    private static String[] f57662f = null;

    /* renamed from: g */
    private static final Map<Integer, String[]> f57663g = new HashMap();

    /* renamed from: h */
    private static final int[] f57664h = {8697535, 306771, 677704, 5580477, 861776, 890180, 4631225, 354893, 634178, 2404022, 306762, 6966718, 675154, 861510, 6116026, 742478, 879171, 2714935, 613195, 7642049, 300884, 674632, 5973436, 435536, 447557, 4905656, 177741, 612162, 2398135, 300874, 6703934, 870993, 959814, 5690554, 372046, 177732, 3749688, 601675, 8165055, 824659, 870984, 7185723, 742735, 354885, 4894137, 154957, 601410, 2921910, 693578, 8080061, 445009, 742726, 5593787, 318030, 678723, 3484600, 338764, 9082175, 955730, 436808, 7001404, 701775, 308805, 4871993, 677709, 337474, 4100917, 890185, 7711422, 354897, 617798, 5549755, 306511, 675139, 5056183, 861515, 9261759, 742482, 748103, 6909244, 613200, 301893, 4869049, 674637, 11216322, 435540, 447561, 7002685, 702033, 612166, 5543867, 300879, 412484, 3581239, 959818, 8827583, 371795, 702023, 5846716, 601680, 824901, 5065400, 870988, 894273, 2468534, 354889, 8039869, 154962, 601415, 6067642, 693582, 739907, 4937015, 709962, 9788095, 309843, 678728, 6630332, 338768, 693061, 4672185, 436812, 709953, 2415286, 308810, 6969149, 675409, 861766, 6198074, 873293, 371267, 3585335, 617803, 11841215, 306515, 675144, 7153084, 861519, 873028, 6138424, 744012, 355649, 2403766, 301898, 8014782, 674641, 697670, 5984954, 447054, 711234, 3496759, 603979, 8689601, 300883, 412488, 6726972, 959823, 436804, 4896312, 699980, 601666, 3970869, 824905, 8211133, 870993, 894277, 5614266, 354894, 683331, 4533943, 339275, 9082303, 693587, 739911, 7034171, 709967, 350789, 4873528, 678732, 338754, 3838902, 430921, 7809469, 436817, 709958, 5561018, 308814, 677699, 4532024, 861770, 9343806, 873042, 895559, 6731067, 355663, 306757, 4869817, 675148, 857409, 2986677};

    /* renamed from: a */
    static void m84877a(Context context) {
        if (f57657a == null) {
            C23362n.m84909a(context);
            C23358m.m84896a(context);
            f57657a = context.getResources().getStringArray(R.array.lunar_first_of_month);
            f57658b = context.getResources().getStringArray(R.array.tradition_festival);
            f57659c = context.getResources().getStringArray(R.array.lunar_str);
            f57660d = context.getResources().getStringArray(R.array.special_festivals);
            f57662f = context.getResources().getStringArray(R.array.solar_festival);
        }
    }

    /* renamed from: a */
    public static void m84878a(Calendar calendar) {
        int year = calendar.getYear();
        int month = calendar.getMonth();
        int day = calendar.getDay();
        calendar.setWeekend(C23349d.m84786a(calendar));
        calendar.setWeek(C23349d.m84791b(calendar));
        Calendar calendar2 = new Calendar();
        calendar.setLunarCalendar(calendar2);
        int[] a = C23355j.m84887a(year, month, day);
        calendar2.setYear(a[0]);
        calendar2.setMonth(a[1]);
        calendar2.setDay(a[2]);
        calendar.setLeapYear(C23349d.m84784a(year));
        if (a[3] == 1) {
            calendar.setLeapMonth(a[1]);
            calendar2.setLeapMonth(a[1]);
        }
        String c = m84883c(year, month, day);
        String c2 = m84882c(month, day);
        String a2 = m84876a(a[0], a[1], a[2]);
        String b = m84881b(a[1], a[2], a[3]);
        if (TextUtils.isEmpty(c2)) {
            c2 = m84885d(year, month, day);
        }
        calendar.setSolarTerm(c);
        calendar.setGregorianFestival(c2);
        calendar.setTraditionFestival(a2);
        calendar2.setTraditionFestival(a2);
        calendar2.setSolarTerm(c);
        if (!TextUtils.isEmpty(c)) {
            calendar.setLunar(c);
        } else if (!TextUtils.isEmpty(c2)) {
            calendar.setLunar(c2);
        } else if (!TextUtils.isEmpty(a2)) {
            calendar.setLunar(a2);
        } else {
            calendar.setLunar(b);
        }
        calendar2.setLunar(b);
    }

    /* renamed from: a */
    private static String[] m84879a(int i) {
        String[] strArr = new String[3];
        Calendar instance = Calendar.getInstance();
        instance.set(i, 4, 1);
        int i2 = (7 - instance.get(7)) + 1;
        if (i2 == 7) {
            strArr[0] = m84886e(i, 5, i2 + 1) + f57660d[0];
        } else {
            strArr[0] = m84886e(i, 5, i2 + 7 + 1) + f57660d[0];
        }
        instance.set(i, 5, 1);
        int i3 = (7 - instance.get(7)) + 1;
        if (i3 == 7) {
            strArr[1] = m84886e(i, 6, i3 + 7 + 1) + f57660d[1];
        } else {
            strArr[1] = m84886e(i, 6, i3 + 7 + 7 + 1) + f57660d[1];
        }
        instance.set(i, 10, 1);
        int i4 = (7 - instance.get(7)) + 1;
        if (i4 <= 2) {
            strArr[2] = m84886e(i, 11, i4 + 21 + 5) + f57660d[2];
        } else {
            strArr[2] = m84886e(i, 11, i4 + 14 + 5) + f57660d[2];
        }
        return strArr;
    }

    /* renamed from: a */
    private static String m84875a(int i, int i2) {
        if (i2 != 1) {
            return f57657a[i - 1];
        }
        return "闰" + f57657a[i - 1];
    }

    /* renamed from: b */
    private static int m84880b(int i, int i2) {
        if ((f57664h[i - 1900] & (1048576 >> i2)) == 0) {
            return 29;
        }
        return 30;
    }

    /* renamed from: c */
    private static String m84882c(int i, int i2) {
        String d = m84884d(i, i2);
        String[] strArr = f57662f;
        for (String str : strArr) {
            if (str.contains(d)) {
                return str.replace(d, "");
            }
        }
        return "";
    }

    /* renamed from: d */
    private static String m84884d(int i, int i2) {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        if (i >= 10) {
            str = String.valueOf(i);
        } else {
            str = "0" + i;
        }
        sb.append(str);
        if (i2 >= 10) {
            obj = Integer.valueOf(i2);
        } else {
            obj = "0" + i2;
        }
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m84881b(int i, int i2, int i3) {
        if (i2 == 1) {
            return m84875a(i, i3);
        }
        return f57659c[i2 - 1];
    }

    /* renamed from: e */
    private static String m84886e(int i, int i2, int i3) {
        return i + m84884d(i2, i3);
    }

    /* renamed from: a */
    private static String m84876a(int i, int i2, int i3) {
        if (i2 == 12 && i3 == m84880b(i, i2)) {
            return f57658b[0];
        }
        String d = m84884d(i2, i3);
        String[] strArr = f57658b;
        for (String str : strArr) {
            if (str.contains(d)) {
                return str.replace(d, "");
            }
        }
        return "";
    }

    /* renamed from: c */
    private static String m84883c(int i, int i2, int i3) {
        Map<Integer, String[]> map = f57663g;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), C23358m.m84897a(i));
        }
        String[] strArr = map.get(Integer.valueOf(i));
        String str = i + m84884d(i2, i3);
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return str2.replace(str, "");
            }
        }
        return "";
    }

    /* renamed from: d */
    private static String m84885d(int i, int i2, int i3) {
        Map<Integer, String[]> map = f57661e;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), m84879a(i));
        }
        String[] strArr = map.get(Integer.valueOf(i));
        String str = i + m84884d(i2, i3);
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return str2.replace(str, "");
            }
        }
        return "";
    }
}
