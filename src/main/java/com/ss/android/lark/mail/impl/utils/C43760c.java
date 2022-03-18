package com.ss.android.lark.mail.impl.utils;

import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.widget.time.CalendarDate;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.mail.impl.utils.c */
public class C43760c {
    /* renamed from: a */
    public static String m173469a(TimeZone timeZone, Date date) {
        if (timeZone.inDaylightTime(date)) {
            return timeZone.getDisplayName(true, 1);
        }
        return timeZone.getDisplayName();
    }

    /* renamed from: a */
    public static String m173465a(long j, TimeZone timeZone) {
        Options aVar = new Options();
        aVar.mo191593a(LengthType.SHORT);
        aVar.mo191595a(timeZone.getID());
        return TimeFormatUtils.m219283b(C41816b.m166115a().mo150132b(), new Date(j), aVar);
    }

    /* renamed from: a */
    public static String m173464a(long j, Locale locale) {
        Options aVar = new Options();
        aVar.mo191595a(TimeZone.getDefault().getID());
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191597a(false);
        aVar.mo191601c(false);
        aVar.mo191596a(locale);
        aVar.mo191599b(!C41816b.m166115a().mo150116F().mo150192b());
        return TimeFormatUtils.m219293h(C41816b.m166115a().mo150132b(), new Date(j), aVar);
    }

    /* renamed from: a */
    public static String m173467a(long j, boolean z) {
        LengthType lengthType;
        CalendarDate calendarDate = new CalendarDate(new Date(j));
        CalendarDate calendarDate2 = new CalendarDate();
        if (!z && calendarDate.getYear() != calendarDate2.getYear()) {
            z = true;
        }
        Options aVar = new Options();
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191597a(false);
        aVar.mo191601c(false);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        if (z) {
            lengthType = LengthType.LONG;
        } else {
            lengthType = LengthType.SHORT;
        }
        aVar.mo191593a(lengthType);
        return TimeFormatUtils.m219289e(C41816b.m166115a().mo150132b(), new Date(j), aVar);
    }

    /* renamed from: a */
    public static String m173463a(long j, long j2, boolean z) {
        boolean z2;
        LengthType lengthType;
        CalendarDate calendarDate = new CalendarDate(new Date(j));
        CalendarDate calendarDate2 = new CalendarDate(new Date(j2));
        CalendarDate calendarDate3 = new CalendarDate();
        if (calendarDate.getYear() == calendarDate3.getYear() && calendarDate2.getYear() == calendarDate3.getYear()) {
            z2 = false;
        } else {
            z2 = true;
        }
        Options aVar = new Options();
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191597a(!z);
        aVar.mo191601c(false);
        aVar.mo191599b(!C41816b.m166115a().mo150116F().mo150192b());
        aVar.mo191592a(DisplayPattern.RELATIVE);
        if (z2) {
            lengthType = LengthType.LONG;
        } else {
            lengthType = LengthType.SHORT;
        }
        aVar.mo191593a(lengthType);
        if (z) {
            return TimeFormatUtils.m219286c(C41816b.m166115a().mo150132b(), new Date(j), new Date(j2), aVar);
        }
        return TimeFormatUtils.m219288d(C41816b.m166115a().mo150132b(), new Date(j), new Date(j2), aVar);
    }

    /* renamed from: a */
    public static String m173466a(long j, TimeZone timeZone, boolean z) {
        Options aVar = new Options();
        aVar.mo191599b(false);
        aVar.mo191595a(timeZone.getID());
        aVar.mo191601c(false);
        aVar.mo191594a(TimePreciseness.MINUTE);
        return TimeFormatUtils.m219287d(C41816b.m166115a().mo150132b(), new Date(j), aVar);
    }

    /* renamed from: a */
    public static String m173468a(CalendarDate calendarDate, TimeZone timeZone, boolean z) {
        LengthType lengthType;
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        if (z) {
            lengthType = LengthType.LONG;
        } else {
            lengthType = LengthType.SHORT;
        }
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191591a(DatePreciseness.DAY);
        return TimeFormatUtils.m219289e(C41816b.m166115a().mo150132b(), calendarDate.getDate(), aVar);
    }
}
