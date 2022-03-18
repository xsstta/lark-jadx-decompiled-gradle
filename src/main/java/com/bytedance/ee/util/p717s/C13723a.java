package com.bytedance.ee.util.p717s;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.util.common.C13606d;
import com.larksuite.suite.R;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.util.s.a */
public class C13723a {

    /* renamed from: a */
    private static final long f35920a = TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS);

    /* renamed from: b */
    private static Map<String, SimpleDateFormat> f35921b = new ConcurrentHashMap();

    /* renamed from: a */
    private static boolean m55658a(Context context) {
        return context == null;
    }

    /* renamed from: a */
    private static boolean m55657a(long j) {
        if (new Date().getTime() - j < 60000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m55661b(long j) {
        if (new Date().getTime() - j < 3600000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m55652a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Double.valueOf(Math.ceil((double) (((calendar.getTimeInMillis() / f35920a) + 4) / 7))).intValue();
    }

    /* renamed from: c */
    private static boolean m55663c(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(System.currentTimeMillis()));
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(j));
        if (instance2.get(1) == instance.get(1) && instance.get(6) - instance2.get(6) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static SimpleDateFormat m55656a(String str) {
        SimpleDateFormat simpleDateFormat = f35921b.get(str);
        if (simpleDateFormat == null) {
            try {
                simpleDateFormat = new SimpleDateFormat(str);
            } catch (Exception e) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();
                C13606d.m55245a("DateUtils", e);
                simpleDateFormat = simpleDateFormat2;
            }
            f35921b.put(str, simpleDateFormat);
        }
        return simpleDateFormat;
    }

    /* renamed from: d */
    public static String m55664d(Context context, long j) {
        if (m55658a(context)) {
            return "";
        }
        Options aVar = new Options();
        aVar.mo191593a(LengthType.LONG);
        return TimeFormatUtils.m219292g(context, new Date(j), aVar);
    }

    /* renamed from: e */
    public static String m55665e(Context context, long j) {
        if (m55658a(context)) {
            return "";
        }
        Options aVar = new Options();
        aVar.mo191591a(DatePreciseness.MONTH);
        return TimeFormatUtils.m219289e(context, new Date(j), aVar);
    }

    /* renamed from: g */
    public static String m55667g(Context context, long j) {
        if (m55658a(context)) {
            return "";
        }
        Options aVar = new Options();
        aVar.mo191593a(LengthType.MIN);
        return TimeFormatUtils.m219287d(context, new Date(j), aVar);
    }

    /* renamed from: f */
    public static String m55666f(Context context, long j) {
        if (m55658a(context)) {
            return "";
        }
        Options aVar = new Options();
        if (m55669i(context, j)) {
            aVar.mo191593a(LengthType.SHORT);
        }
        aVar.mo191591a(DatePreciseness.DAY);
        return TimeFormatUtils.m219289e(context, new Date(j), aVar);
    }

    /* renamed from: h */
    private static boolean m55668h(Context context, long j) {
        if (m55658a(context)) {
            return false;
        }
        SimpleDateFormat a = m55656a("MMM d, yyyy");
        return TextUtils.equals(a.format(Long.valueOf(new Date().getTime())), a.format(Long.valueOf(j)));
    }

    /* renamed from: i */
    private static boolean m55669i(Context context, long j) {
        if (m55658a(context)) {
            return false;
        }
        SimpleDateFormat a = m55656a("yyyy");
        return TextUtils.equals(a.format(Long.valueOf(new Date().getTime())), a.format(Long.valueOf(j)));
    }

    /* renamed from: a */
    private static String m55653a(Context context, int i) {
        switch (i) {
            case 1:
                return context.getResources().getString(R.string.Doc_Util_Reminder_SUNDAY);
            case 2:
                return context.getResources().getString(R.string.Doc_Util_Reminder_MONDAY);
            case 3:
                return context.getResources().getString(R.string.Doc_Util_Reminder_TUESDAY);
            case 4:
                return context.getResources().getString(R.string.Doc_Util_Reminder_WEDNESDAY);
            case 5:
                return context.getResources().getString(R.string.Doc_Util_Reminder_THURSDAY);
            case 6:
                return context.getResources().getString(R.string.Doc_Util_Reminder_FRIDAY);
            case 7:
                return context.getResources().getString(R.string.Doc_Util_Reminder_SATURDAY);
            default:
                return "";
        }
    }

    /* renamed from: b */
    public static String m55660b(Context context, long j) {
        if (m55658a(context)) {
            return "";
        }
        if (m55668h(context, j)) {
            return context.getResources().getString(R.string.Doc_Util_Reminder_Format_Today);
        }
        if (!m55669i(context, j)) {
            return TimeFormatUtils.m219289e(context, new Date(j), null);
        }
        Options aVar = new Options();
        aVar.mo191593a(LengthType.SHORT);
        aVar.mo191591a(DatePreciseness.DAY);
        return TimeFormatUtils.m219289e(context, new Date(j), aVar);
    }

    /* renamed from: a */
    public static String m55654a(Context context, long j) {
        if (m55658a(context)) {
            return "";
        }
        long time = new Date().getTime() - j;
        if (m55657a(j)) {
            return context.getString(R.string.Doc_Util_JustNow);
        }
        if (m55661b(j)) {
            long j2 = time / 60000;
            return context.getResources().getQuantityString(R.plurals.Doc_Util_MinsAgo, (int) j2, Long.valueOf(j2));
        } else if (m55668h(context, j)) {
            long j3 = time / 3600000;
            return context.getResources().getQuantityString(R.plurals.Doc_Util_HoursAgo, (int) j3, Long.valueOf(j3));
        } else if (m55663c(j)) {
            Options aVar = new Options();
            aVar.mo191592a(DisplayPattern.RELATIVE);
            return TimeFormatUtils.m219292g(context, new Date(j), aVar);
        } else if (!m55669i(context, j)) {
            return TimeFormatUtils.m219289e(context, new Date(j), null);
        } else {
            Options aVar2 = new Options();
            aVar2.mo191593a(LengthType.SHORT);
            return context.getString(R.string.Doc_Util_AtWithTime) + " " + TimeFormatUtils.m219292g(context, new Date(j), aVar2);
        }
    }

    /* renamed from: b */
    private static String m55659b(Context context, int i) {
        switch (i) {
            case 0:
                return context.getResources().getString(R.string.Doc_Util_Reminder_January);
            case 1:
                return context.getResources().getString(R.string.Doc_Util_Reminder_February);
            case 2:
                return context.getResources().getString(R.string.Doc_Util_Reminder_March);
            case 3:
                return context.getResources().getString(R.string.Doc_Util_Reminder_April);
            case 4:
                return context.getResources().getString(R.string.Doc_Util_Reminder_May);
            case 5:
                return context.getResources().getString(R.string.Doc_Util_Reminder_June);
            case 6:
                return context.getResources().getString(R.string.Doc_Util_Reminder_July);
            case 7:
                return context.getResources().getString(R.string.Doc_Util_Reminder_August);
            case 8:
                return context.getResources().getString(R.string.Doc_Util_Reminder_September);
            case 9:
                return context.getResources().getString(R.string.Doc_Util_Reminder_October);
            case 10:
                return context.getResources().getString(R.string.Doc_Util_Reminder_November);
            case 11:
                return context.getResources().getString(R.string.Doc_Util_Reminder_December);
            default:
                return "";
        }
    }

    /* renamed from: c */
    public static String m55662c(Context context, long j) {
        if (m55658a(context)) {
            return "";
        }
        if (m55668h(context, j)) {
            Options aVar = new Options();
            aVar.mo191593a(LengthType.SHORT);
            aVar.mo191592a(DisplayPattern.RELATIVE);
            return TimeFormatUtils.m219292g(context, new Date(j), aVar);
        } else if (m55663c(j)) {
            Options aVar2 = new Options();
            aVar2.mo191592a(DisplayPattern.RELATIVE);
            return TimeFormatUtils.m219292g(context, new Date(j), aVar2);
        } else if (!m55669i(context, j)) {
            return TimeFormatUtils.m219289e(context, new Date(j), null);
        } else {
            Options aVar3 = new Options();
            aVar3.mo191593a(LengthType.SHORT);
            return context.getString(R.string.Doc_Util_AtWithTime) + " " + TimeFormatUtils.m219292g(context, new Date(j), aVar3);
        }
    }

    /* renamed from: a */
    public static String m55655a(Context context, long j, boolean z, Locale locale) {
        int i;
        int i2;
        int i3;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        String str2 = "";
        if (m55658a(context)) {
            return str2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(currentTimeMillis));
        int i4 = instance.get(1);
        int i5 = instance.get(2);
        instance.get(7);
        int i6 = instance.get(5);
        int a = m55652a(instance);
        instance.setTime(new Date(j));
        int i7 = instance.get(1);
        int i8 = instance.get(2);
        int i9 = instance.get(7);
        int i10 = instance.get(5);
        int i11 = instance.get(11);
        int i12 = instance.get(10);
        int i13 = instance.get(9);
        int i14 = instance.get(12);
        int a2 = m55652a(instance);
        if (z) {
            i3 = i5;
            if (locale != null) {
                i = i9;
                i2 = i6;
                if (Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" ");
                    sb.append(i12);
                    sb.append(":");
                    if (i14 < 10) {
                        obj3 = "0" + i14;
                    } else {
                        obj3 = Integer.valueOf(i14);
                    }
                    sb.append(obj3);
                    sb.append(" ");
                    if (i13 == 0) {
                        str = "AM";
                    } else {
                        str = "PM";
                    }
                    sb.append(str);
                    str2 = sb.toString();
                }
            } else {
                i = i9;
                i2 = i6;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            if (i11 < 10) {
                obj = "0" + i11;
            } else {
                obj = Integer.valueOf(i11);
            }
            sb2.append(obj);
            sb2.append(":");
            if (i14 < 10) {
                obj2 = "0" + i14;
            } else {
                obj2 = Integer.valueOf(i14);
            }
            sb2.append(obj2);
            str2 = sb2.toString();
        } else {
            i3 = i5;
            i = i9;
            i2 = i6;
        }
        HashMap hashMap = new HashMap();
        if (i4 != i7) {
            hashMap.put("year", String.valueOf(i7));
            hashMap.put("month", m55659b(context, i8));
            hashMap.put("day", String.valueOf(i10));
            return C10539a.m43640a(context, R.string.Doc_Util_Reminder_Format_Year_Month_Day, hashMap) + str2;
        }
        int i15 = a2 - a;
        if (i15 >= 2 || i15 <= -1) {
            if (i2 - i10 == 1 && i15 == -1 && i8 == i3) {
                return context.getResources().getString(R.string.Doc_Util_Reminder_Format_Yesterday) + str2;
            }
            hashMap.put("month", m55659b(context, i8));
            hashMap.put("day", String.valueOf(i10));
            return C10539a.m43640a(context, R.string.Doc_Util_Reminder_Format_Month_Day, hashMap) + str2;
        } else if (i2 == i10) {
            return context.getResources().getString(R.string.Doc_Util_Reminder_Format_Today) + str2;
        } else if (i2 - i10 == 1) {
            return context.getResources().getString(R.string.Doc_Util_Reminder_Format_Yesterday) + str2;
        } else if (i10 - i2 == 1) {
            return context.getResources().getString(R.string.Doc_Util_Reminder_Format_Tomorrow) + str2;
        } else if (i15 >= 1) {
            hashMap.put("week", m55653a(context, i));
            return C10539a.m43640a(context, R.string.Doc_Util_Reminder_Format_Next_Week, hashMap) + str2;
        } else {
            hashMap.put("week", m55653a(context, i));
            return C10539a.m43640a(context, R.string.Doc_Util_Reminder_Format_Current_Week, hashMap) + str2;
        }
    }
}
