package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import android.widget.TextView;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.utils.c */
public class C32646c {
    /* renamed from: a */
    public static void m125267a(TextView textView, Object obj) {
        textView.setText(obj instanceof OverallReminderData ? m125262a((OverallReminderData) obj) : "");
        textView.setVisibility(0);
    }

    /* renamed from: a */
    public static void m125268a(TimeShowTextView timeShowTextView, Object obj) {
        boolean z;
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        if (obj instanceof CalendarEvent) {
            CalendarEvent calendarEvent = (CalendarEvent) obj;
            if (calendarEvent.isAllDay()) {
                timeZone = TimeZone.getTimeZone("UTC");
            }
            str = m125260a(calendarEvent);
            z = C26279i.m95157a(calendarEvent.getStartTime() * 1000, calendarEvent.getEndTime() * 1000, timeZone);
        } else if (obj instanceof CalendarEventInstance) {
            CalendarEventInstance calendarEventInstance = (CalendarEventInstance) obj;
            if (calendarEventInstance.isAllDay()) {
                timeZone = TimeZone.getTimeZone("UTC");
            }
            str = m125261a(calendarEventInstance);
            z = C26279i.m95157a(calendarEventInstance.getStartTime() * 1000, calendarEventInstance.getEndTime() * 1000, timeZone);
        } else {
            str = "";
            z = true;
        }
        timeShowTextView.mo114201a(str, z);
        timeShowTextView.setVisibility(0);
    }

    /* renamed from: a */
    public static String m125262a(OverallReminderData overallReminderData) {
        return m125256a(overallReminderData.getStartTime() * 1000, overallReminderData.getIsAllDay());
    }

    /* renamed from: a */
    public static String m125260a(CalendarEvent calendarEvent) {
        return m125249a(calendarEvent.getStartTime() * 1000, calendarEvent.getEndTime() * 1000, calendarEvent.isAllDay());
    }

    /* renamed from: a */
    public static String m125261a(CalendarEventInstance calendarEventInstance) {
        return m125249a(calendarEventInstance.getStartTime() * 1000, calendarEventInstance.getEndTime() * 1000, calendarEventInstance.isAllDay());
    }

    /* renamed from: a */
    private static String m125256a(long j, boolean z) {
        TimeZone timeZone;
        if (j == -1) {
            return "";
        }
        if (z) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            timeZone = TimeZone.getDefault();
        }
        Date date = new Date(j);
        if (m125263a(date, timeZone).equals(C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayToday))) {
            return m125266a(z, date, timeZone);
        }
        return m125271b(z, date, timeZone);
    }

    /* renamed from: a */
    private static String m125266a(boolean z, Date date, TimeZone timeZone) {
        if (z) {
            return C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayToday);
        }
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191599b(!C30022a.f74882a.timeFormatDependency().mo108189a());
        aVar.mo191601c(false);
        String g = TimeFormatUtils.m219292g(C32634ae.m125179a(), date, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("timeString", g);
        hashMap.put("GMT", m125265a(timeZone, date.getTime()));
        return UIHelper.mustacheFormat((int) R.string.Calendar_StandardTime_TimeStringWithGMT, hashMap);
    }

    /* renamed from: a */
    private static String m125264a(Date date, TimeZone timeZone, boolean z) {
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191593a(z ? LengthType.LONG : LengthType.SHORT);
        HashMap hashMap = new HashMap();
        hashMap.put("date", TimeFormatUtils.m219289e(C32634ae.m125179a(), date, aVar));
        hashMap.put("relativeDay", m125263a(date, timeZone));
        return UIHelper.mustacheFormat((int) R.string.Calendar_StandardTime_DateRelativeDayCombineFormat, hashMap);
    }

    /* renamed from: a */
    public static String m125263a(Date date, TimeZone timeZone) {
        CalendarDate calendarDate = new CalendarDate(date, timeZone);
        CalendarDate calendarDate2 = new CalendarDate();
        if (calendarDate.dayDiff(calendarDate2) == 0) {
            return C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayToday);
        }
        if (calendarDate.dayDiff(calendarDate2) == 1) {
            return C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayTomorrow);
        }
        if (calendarDate.dayDiff(calendarDate2) == -1) {
            return C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayYesterday);
        }
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191593a(LengthType.SHORT);
        return TimeFormatUtils.m219283b(C32634ae.m125179a(), date, aVar);
    }

    /* renamed from: a */
    public static String m125257a(CalendarDate calendarDate) {
        Options aVar = new Options();
        aVar.mo191595a(calendarDate.getTimeZone().getID());
        aVar.mo191591a(DatePreciseness.MONTH);
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        return TimeFormatUtils.m219289e(C32634ae.m125179a(), new Date(calendarDate.getTimeInMilliSeconds()), aVar);
    }

    /* renamed from: a */
    public static String m125258a(CalendarDate calendarDate, TimeZone timeZone, boolean z) {
        LengthType lengthType = z ? LengthType.LONG : LengthType.SHORT;
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        return TimeFormatUtils.m219289e(C32634ae.m125179a(), new Date(calendarDate.getTimeInMilliSeconds()), aVar);
    }

    /* renamed from: a */
    public static String m125255a(long j, TimeZone timeZone, boolean z) {
        Date date = new Date(j);
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191599b(!C30022a.f74882a.timeFormatDependency().mo108189a());
        aVar.mo191601c(z);
        return TimeFormatUtils.m219287d(C32634ae.m125179a(), date, aVar);
    }

    /* renamed from: a */
    public static void m125269a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        if (C30022a.f74882a.timeFormatDependency().mo108189a()) {
            for (int i = 0; i < strArr.length; i++) {
                sb.delete(0, sb.length());
                sb.append(m125244a(i));
                sb.append(":00");
                strArr[i] = sb.toString();
            }
            return;
        }
        String b = C32634ae.m125182b(R.string.Calendar_StandardTime_AM);
        String b2 = C32634ae.m125182b(R.string.Calendar_StandardTime_PM);
        String b3 = C32634ae.m125182b(R.string.Calendar_Common_Clock);
        int i2 = 13;
        int i3 = 1;
        if (C30022a.f74882a.languageDependency().mo108250c()) {
            sb.delete(0, sb.length());
            sb.append("12 ");
            sb.append(b);
            strArr[0] = sb.toString();
            while (i3 < 12) {
                sb.delete(0, sb.length());
                sb.append(i3);
                sb.append(" ");
                sb.append(b);
                strArr[i3] = sb.toString();
                i3++;
            }
            sb.delete(0, sb.length());
            sb.append("12 ");
            sb.append(b2);
            strArr[12] = sb.toString();
            while (i2 < 24) {
                sb.delete(0, sb.length());
                sb.append(i2 - 12);
                sb.append(" ");
                sb.append(b2);
                strArr[i2] = sb.toString();
                i2++;
            }
            sb.delete(0, sb.length());
            sb.append("12 ");
            sb.append(b);
            strArr[24] = sb.toString();
            return;
        }
        sb.delete(0, sb.length());
        sb.append(b);
        sb.append("12");
        sb.append(b3);
        strArr[0] = sb.toString();
        while (i3 < 12) {
            sb.delete(0, sb.length());
            sb.append(b);
            sb.append(i3);
            sb.append(b3);
            strArr[i3] = sb.toString();
            i3++;
        }
        sb.delete(0, sb.length());
        sb.append(b2);
        sb.append("12");
        sb.append(b3);
        strArr[12] = sb.toString();
        while (i2 < 24) {
            sb.delete(0, sb.length());
            sb.append(b2);
            sb.append(i2 - 12);
            sb.append(b3);
            strArr[i2] = sb.toString();
            i2++;
        }
        sb.delete(0, sb.length());
        sb.append(b);
        sb.append("12");
        sb.append(b3);
        strArr[24] = sb.toString();
    }

    /* renamed from: a */
    public static String m125254a(long j, TimeZone timeZone, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    /* renamed from: a */
    public static String m125265a(TimeZone timeZone, long j) {
        int i;
        int i2;
        int i3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C32634ae.m125182b(R.string.Calendar_StandardTime_GMTFormatForAndroid), Locale.CHINA);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(new Date(j));
        if (format.contains("+")) {
            i = format.indexOf(43);
        } else {
            i = format.contains("-") ? format.indexOf(45) : -1;
        }
        int indexOf = format.indexOf(58);
        if (indexOf != -1 && (i3 = indexOf + 1) < format.length() && format.charAt(i3) == '0') {
            format = format.substring(0, indexOf);
        }
        StringBuilder sb = new StringBuilder(format);
        if (i != -1 && (i2 = i + 1) < format.length() && sb.charAt(i2) == '0') {
            sb.deleteCharAt(i2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m125259a(CalendarDate calendarDate, boolean z) {
        Options aVar = new Options();
        aVar.mo191595a(calendarDate.getTimeZone().getID());
        aVar.mo191593a(z ? LengthType.SHORT : LengthType.LONG);
        return TimeFormatUtils.m219285c(C32634ae.m125179a(), new Date(calendarDate.getTimeInMilliSeconds()), aVar);
    }

    /* renamed from: a */
    public static String m125253a(long j, TimeZone timeZone) {
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191593a(LengthType.SHORT);
        return TimeFormatUtils.m219283b(C32634ae.m125179a(), new Date(j), aVar);
    }

    /* renamed from: a */
    private static String m125244a(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* renamed from: a */
    public static String m125246a(long j) {
        LengthType lengthType;
        if (j <= 0) {
            return "";
        }
        Date date = new Date(j);
        CalendarDate calendarDate = new CalendarDate();
        CalendarDate calendarDate2 = new CalendarDate(date);
        Options aVar = new Options();
        aVar.mo191595a(TimeZone.getDefault().getID());
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        if (calendarDate.getYear() == calendarDate2.getYear()) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        return TimeFormatUtils.m219289e(C32634ae.m125179a(), date, aVar);
    }

    /* renamed from: a */
    private static String m125247a(long j, long j2) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        long j3 = j2 - 1000;
        boolean a = C26279i.m95157a(j, j3, timeZone);
        Date date = new Date(j);
        Date date2 = new Date(j3);
        CalendarDate calendarDate = new CalendarDate(date, timeZone);
        CalendarDate calendarDate2 = new CalendarDate(date2, timeZone);
        CalendarDate calendarDate3 = new CalendarDate();
        boolean z = true;
        if (a) {
            if (calendarDate.getYear() == calendarDate3.getYear()) {
                z = false;
            }
            return m125264a(date, timeZone, z);
        }
        if (calendarDate.getYear() == calendarDate3.getYear() && calendarDate2.getYear() == calendarDate3.getYear()) {
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("startTime", m125264a(date, timeZone, z));
        hashMap.put("endTime", m125264a(date2, timeZone, z));
        return UIHelper.mustacheFormat((int) R.string.Calendar_StandardTime_GeneralDateTimeRangeWithoutWrap, hashMap);
    }

    /* renamed from: a */
    public static String m125252a(long j, String str) {
        TimeZone timeZone;
        LengthType lengthType;
        if (j == -1) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = TimeZone.getTimeZone(str);
        }
        Date date = new Date(j);
        CalendarDate calendarDate = new CalendarDate(date, timeZone);
        CalendarDate calendarDate2 = new CalendarDate();
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191591a(DatePreciseness.DAY);
        if (calendarDate.getYear() == calendarDate2.getYear()) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        return TimeFormatUtils.m219291f(C32634ae.m125179a(), date, aVar);
    }

    /* renamed from: a */
    public static String m125249a(long j, long j2, boolean z) {
        return m125251a(j, j2, z, true);
    }

    /* renamed from: b */
    public static String m125270b(long j, TimeZone timeZone, boolean z) {
        String a = m125255a(j, timeZone, z);
        if ("00:00".equals(a)) {
            return "24:00";
        }
        return a;
    }

    /* renamed from: a */
    public static String m125245a(int i, TimeZone timeZone, boolean z) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setHour(i / 60);
        calendarDate.setMinute(i % 60);
        return m125255a(calendarDate.getTimeInMilliSeconds(), timeZone, z);
    }

    /* renamed from: b */
    private static String m125271b(boolean z, Date date, TimeZone timeZone) {
        boolean z2 = false;
        if (z) {
            if (new CalendarDate(date, timeZone).getYear() != new CalendarDate().getYear()) {
                z2 = true;
            }
            return m125264a(date, timeZone, z2);
        }
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191599b(!C30022a.f74882a.timeFormatDependency().mo108189a());
        aVar.mo191601c(false);
        aVar.mo191597a(true);
        return TimeFormatUtils.m219293h(C32634ae.m125179a(), date, aVar);
    }

    /* renamed from: a */
    public static String m125248a(long j, long j2, TimeZone timeZone, boolean z) {
        if (j == -1 || j2 == -1) {
            return "";
        }
        Date date = new Date(j);
        Date date2 = new Date(j2);
        Options aVar = new Options();
        aVar.mo191595a(timeZone.getID());
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191599b(!C30022a.f74882a.timeFormatDependency().mo108189a());
        aVar.mo191601c(false);
        aVar.mo191597a(z);
        return TimeFormatUtils.m219288d(C32634ae.m125179a(), date, date2, aVar);
    }

    /* renamed from: a */
    public static String m125251a(long j, long j2, boolean z, boolean z2) {
        if (j == -1 || j2 == -1) {
            return "";
        }
        if (!z) {
            return m125248a(j, j2, TimeZone.getDefault(), z2);
        }
        return m125247a(j, j2);
    }

    /* renamed from: a */
    public static String m125250a(long j, long j2, boolean z, int i, int i2, boolean z2) {
        if (z) {
            return C32634ae.m125182b(R.string.Calendar_Edit_Allday);
        }
        TimeZone timeZone = TimeZone.getDefault();
        String a = m125255a(j, timeZone, z2);
        String a2 = m125255a(j2, timeZone, z2);
        if (i == 1) {
            Options aVar = new Options();
            aVar.mo191595a(timeZone.getID());
            aVar.mo191594a(TimePreciseness.MINUTE);
            aVar.mo191599b(!C30022a.f74882a.timeFormatDependency().mo108189a());
            aVar.mo191601c(false);
            return TimeFormatUtils.m219281a(C32634ae.m125179a(), new Date(j), new Date(j2), aVar);
        } else if (i2 == 1) {
            return a;
        } else {
            if (i2 == i) {
                return UIHelper.mustacheFormat((int) R.string.Calendar_RRule_Until, "endDate", a2);
            }
            return C32634ae.m125182b(R.string.Calendar_Edit_Allday);
        }
    }
}
