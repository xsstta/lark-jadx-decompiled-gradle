package com.ss.android.lark.utils;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26280j;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.lark.utils.l */
public class C57851l {

    /* renamed from: a */
    static final String[] f142480a = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    /* renamed from: a */
    public static String m224541a(Context context) {
        return UIUtils.getString(context, R.string.Lark_Legacy_CommonShortDateFormat);
    }

    /* renamed from: b */
    public static String m224549b(Context context) {
        return UIUtils.getString(context, R.string.Lark_Legacy_CommonEnShortDateFormat);
    }

    /* renamed from: c */
    public static final String m224550c(Context context) {
        return UIUtils.getString(context, R.string.Lark_Legacy_DateFormatYmdV2);
    }

    /* renamed from: d */
    public static String m224551d(Context context) {
        return UIUtils.getString(context, R.string.Lark_Legacy_DateMdTFormat);
    }

    /* renamed from: e */
    public static String m224552e(Context context) {
        return UIUtils.getString(context, R.string.Lark_Legacy_CommonLongDateTimeFormat);
    }

    /* renamed from: f */
    private static String[] m224553f(Context context) {
        return UIUtils.getStringArray(context, R.array.week);
    }

    /* renamed from: a */
    private static String m224548a(Date date) {
        long time = date.getTime();
        int a = C26280j.m95165a(time, 5);
        int a2 = C26280j.m95165a(time, 2);
        return f142480a[a2 - 1] + " " + a;
    }

    /* renamed from: a */
    public static String m224542a(Context context, long j) {
        return C26280j.m95169a(m224549b(context), j);
    }

    /* renamed from: a */
    private static String m224544a(Context context, String str) {
        return str.replace("AM", UIUtils.getString(context, R.string.Lark_Timeformat_AM)).replace("PM", UIUtils.getString(context, R.string.Lark_Timeformat_PM));
    }

    /* renamed from: a */
    public static String m224545a(Context context, Date date) {
        return m224553f(context)[C26280j.m95165a(date.getTime(), 7) - 1];
    }

    /* renamed from: a */
    public static String m224543a(Context context, long j, boolean z, boolean z2) {
        String str;
        if (C26280j.m95173a(j)) {
            if (z) {
                str = UIUtils.getString(context, R.string.Lark_Timeformat_24HrTimeFormat);
            } else {
                str = UIUtils.getString(context, R.string.Lark_Timeformat_12HrTimeFormat);
            }
            return m224544a(context, C26280j.m95169a(str, j));
        } else if (C26280j.m95175b(j)) {
            return UIUtils.getString(context, R.string.Lark_Legacy_Yesterday);
        } else {
            if (!C26280j.m95176c(j)) {
                String string = UIUtils.getString(context, R.string.Lark_Timeformat_DateFormatOtherYear);
                if (z2) {
                    return C26279i.m95153a(new Date(j), string);
                }
                return C26280j.m95169a(string, j);
            } else if (z2) {
                return m224548a(new Date(j));
            } else {
                return C26280j.m95169a(UIUtils.getString(context, R.string.Lark_Timeformat_DateFormatThisYear), j);
            }
        }
    }

    /* renamed from: a */
    public static String m224546a(Context context, Date date, Locale locale, boolean z) {
        String str;
        String str2;
        if (C26279i.m95158b(date) == 0) {
            if (z) {
                str2 = UIUtils.getString(context, R.string.Lark_Timeformat_24HrTimeFormat);
            } else {
                str2 = UIUtils.getString(context, R.string.Lark_Timeformat_12HrTimeFormat);
            }
            str = C26280j.m95169a(str2, date.getTime());
        } else if (C26279i.m95158b(date) == 1) {
            str = UIUtils.getString(context, R.string.Lark_Legacy_Yesterday);
        } else if (C26279i.m95164c(date)) {
            if (locale == null || !locale.getLanguage().toLowerCase().equals("en")) {
                str = C26279i.m95153a(date, m224541a(context));
            } else {
                str = m224548a(date);
            }
        } else if (locale == null || !locale.getLanguage().toLowerCase().equals("en")) {
            str = C26279i.m95153a(date, m224550c(context));
        } else {
            str = C26279i.m95153a(date, "yyyy-MM-dd".replace("-", "/"));
        }
        return m224544a(context, str);
    }

    /* renamed from: a */
    public static String m224547a(Context context, Date date, boolean z, boolean z2) {
        String str;
        String str2;
        if (C26279i.m95158b(date) == 0) {
            str = "";
        } else if (C26279i.m95164c(date)) {
            String string = UIUtils.getString(context, R.string.Lark_Timeformat_DateFormatThisYear);
            if (z2) {
                str = m224548a(date);
            } else {
                str = C26280j.m95169a(string, date.getTime());
            }
        } else {
            String str3 = UIUtils.getString(context, R.string.Lark_Timeformat_DateFormatOtherYear) + " ";
            if (z2) {
                str = C26279i.m95153a(date, str3);
            } else {
                str = C26280j.m95169a(str3, date.getTime());
            }
        }
        if (z) {
            str2 = UIUtils.getString(context, R.string.Lark_Timeformat_24HrTimeFormat);
        } else {
            str2 = UIUtils.getString(context, R.string.Lark_Timeformat_12HrTimeFormat);
        }
        String a = m224544a(context, C26280j.m95169a(str2, date.getTime()));
        if (TextUtils.isEmpty(str)) {
            return a;
        }
        return str + " " + a;
    }
}
