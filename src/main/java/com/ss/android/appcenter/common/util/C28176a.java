package com.ss.android.appcenter.common.util;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.appcenter.common.util.a */
public class C28176a {

    /* renamed from: a */
    private static final Pattern f70675a = Pattern.compile("(?i)^(\\d+)\\.(\\d+)\\.(\\d+)$");

    /* renamed from: b */
    private static final Pattern f70676b = Pattern.compile("(?i)^(\\d+)\\.(\\d+)\\.(\\d+)-(beta\\d*|alpha\\d*)$");

    /* renamed from: a */
    private static long m103221a(long j, long j2, long j3, long j4) {
        return (j * 100000000000L) + (j2 * 100000000) + (j3 * 100000) + j4;
    }

    /* renamed from: a */
    public static int m103219a() {
        Calendar instance = Calendar.getInstance();
        int i = (-(instance.get(15) + instance.get(16))) / CalendarSearchResultRv.f82652c;
        C28184h.m103250d("AppCenter_Common", "timezoneOffset " + i);
        return i;
    }

    /* renamed from: a */
    public static boolean m103222a(String str) {
        if (TextUtils.isEmpty(str) || C27548m.m100547m().mo98218b().mo98172c() || !C27548m.m100547m().mo98216a().mo98160a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static long m103223b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Matcher matcher = f70675a.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 3) {
            Matcher matcher2 = f70676b.matcher(str);
            if (!matcher2.find() || matcher2.groupCount() != 4) {
                return 0;
            }
            int parseInt = Integer.parseInt(matcher2.group(1));
            int parseInt2 = Integer.parseInt(matcher2.group(2));
            int parseInt3 = Integer.parseInt(matcher2.group(3));
            String group = matcher2.group(4);
            if (group.substring(0, 4).toLowerCase().equals("beta")) {
                i = Integer.parseInt(group.substring(4)) + HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            } else if (group.substring(0, 5).toLowerCase().equals("alpha")) {
                i = Integer.parseInt(group.substring(5));
            } else {
                i = 0;
            }
            C28184h.m103250d("CommonUtils", String.format("convertStrVersionToLong has alpha or beta:%d,%d,%d,%d", Integer.valueOf(parseInt), Integer.valueOf(parseInt2), Integer.valueOf(parseInt3), Integer.valueOf(i)));
            return m103221a((long) parseInt, (long) parseInt2, (long) parseInt3, (long) i);
        }
        int parseInt4 = Integer.parseInt(matcher.group(1));
        int parseInt5 = Integer.parseInt(matcher.group(2));
        int parseInt6 = Integer.parseInt(matcher.group(3));
        C28184h.m103250d("CommonUtils", String.format("convertStrVersionToLong :%d,%d,%d,%d", Integer.valueOf(parseInt4), Integer.valueOf(parseInt5), Integer.valueOf(parseInt6), 20000));
        return m103221a((long) parseInt4, (long) parseInt5, (long) parseInt6, (long) 20000);
    }

    /* renamed from: a */
    public static int m103220a(String str, String str2) {
        int i = (m103223b(str) > m103223b(str2) ? 1 : (m103223b(str) == m103223b(str2) ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        if (i < 0) {
            return 1;
        }
        return 0;
    }
}
