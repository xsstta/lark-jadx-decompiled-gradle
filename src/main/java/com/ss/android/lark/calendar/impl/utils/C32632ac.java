package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import android.text.format.Time;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.LanguageType;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.log.Log;
import java.util.Date;

/* renamed from: com.ss.android.lark.calendar.impl.utils.ac */
public class C32632ac {
    /* renamed from: e */
    public static RepeatMode m125174e(String str) {
        return new RepeatMode(EventRecurrence.m125131a(str));
    }

    /* renamed from: b */
    public static String m125171b(String str) {
        String str2 = m125175f(str)[0];
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "";
    }

    /* renamed from: c */
    public static String m125172c(String str) {
        String str2 = m125175f(str)[1];
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "";
    }

    /* renamed from: d */
    public static String m125173d(String str) {
        String str2 = m125175f(str)[2];
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "";
    }

    /* renamed from: a */
    public static CalendarDate m125170a(String str) {
        EventRecurrence a = EventRecurrence.m125131a(str);
        if (a.f83697f == null) {
            return null;
        }
        Time time = new Time();
        time.parse(a.f83697f);
        CalendarDate calendarDate = new CalendarDate(time.year, time.month + 1, time.monthDay, time.hour, time.minute, time.second);
        CalendarDate calendarDate2 = new CalendarDate();
        calendarDate2.setTimeInSeconds(C26279i.m95160b(calendarDate.getTimeInSeconds()));
        return calendarDate2;
    }

    /* renamed from: f */
    private static String[] m125175f(String str) {
        LanguageType languageType;
        AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
        if (languageDependency.mo108249b()) {
            languageType = LanguageType.ZH_CN;
        } else if (languageDependency.mo108250c()) {
            languageType = LanguageType.EN_US;
        } else if (languageDependency.mo108251d()) {
            languageType = LanguageType.JA_JP;
        } else if (languageDependency.mo108252e()) {
            languageType = LanguageType.ES_ES;
        } else if (languageDependency.mo108253f()) {
            languageType = LanguageType.IT_IT;
        } else if (languageDependency.mo108254g()) {
            languageType = LanguageType.DE_DE;
        } else if (languageDependency.mo108255h()) {
            languageType = LanguageType.FR_FR;
        } else if (languageDependency.mo108256i()) {
            languageType = LanguageType.PT_BR;
        } else if (languageDependency.mo108257j()) {
            languageType = LanguageType.ID_ID;
        } else if (languageDependency.mo108258k()) {
            languageType = LanguageType.ID_ID;
        } else if (languageDependency.mo108259l()) {
            languageType = LanguageType.VI_VN;
        } else if (languageDependency.mo108260m()) {
            languageType = LanguageType.TH_TH;
        } else if (languageDependency.mo108261n()) {
            languageType = LanguageType.KO_KR;
        } else if (languageDependency.mo108262o()) {
            languageType = LanguageType.RU_RU;
        } else if (languageDependency.mo108263p()) {
            languageType = LanguageType.HI_IN;
        } else if (languageDependency.mo108264q()) {
            languageType = LanguageType.ZH_HK;
        } else if (languageDependency.mo108265r()) {
            languageType = LanguageType.ZH_TW;
        } else {
            languageType = LanguageType.UNKNOWN_LANGUAGE;
        }
        String l = Long.toString(new Date().getTime());
        Log.m165389i("RepeatModeUtils", C32673y.m125376b(l, "GetParsedRruleTextRequest", new String[0]));
        String[] a = C32533b.m124620a().mo118874a(str, languageType);
        Log.m165389i("RepeatModeUtils", C32673y.m125373a(l, "GetParsedRruleTextRequest", new String[0]));
        return a;
    }
}
