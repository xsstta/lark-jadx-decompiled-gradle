package com.ss.android.vc.meeting.module.calendar;

import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.CalendarInfo;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.ss.android.vc.meeting.module.calendar.a */
public class C61552a {
    /* renamed from: a */
    public static void m240251a(TimeShowTextView timeShowTextView, CalendarInfo calendarInfo) {
        TimeZone timeZone = TimeZone.getDefault();
        if (calendarInfo.isAllDay()) {
            timeZone = TimeZone.getTimeZone("UTC");
        }
        long theEventStartTime = calendarInfo.getTheEventStartTime();
        long theEventEndTime = calendarInfo.getTheEventEndTime();
        timeShowTextView.mo213332a(m240250a(theEventStartTime, theEventEndTime), C26279i.m95157a(theEventStartTime, theEventEndTime, timeZone));
    }

    /* renamed from: a */
    public static String m240250a(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return "";
        }
        Date date = new Date(j);
        Date date2 = new Date(j2);
        Options aVar = new Options();
        aVar.mo191595a(TimeZone.getDefault().getID());
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191601c(false);
        aVar.mo191597a(true);
        return TimeFormatUtils.m219288d(ar.m236694a(), date, date2, aVar);
    }
}
