package com.ss.android.lark.calendar.impl.features.meetingroom.signin.helper;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.common.TimezoneUtil;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.time.format.helper.FormatTimeHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/helper/SignInTimeHelper;", "", "()V", "getClockTimeRange", "", "startTime", "", "endTime", "getIdleEndTimeStr", "time", "isSameDayAndToday", "", "isToday", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.b.c */
public final class SignInTimeHelper {

    /* renamed from: a */
    public static final SignInTimeHelper f82202a = new SignInTimeHelper();

    private SignInTimeHelper() {
    }

    /* renamed from: b */
    public final boolean mo117420b(long j) {
        if (new CalendarDate(new Date(j)).getJulianDay() == new CalendarDate().getJulianDay()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo117418a(long j) {
        if (mo117420b(j)) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
            TimePreciseness timePreciseness = TimePreciseness.MINUTE;
            AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
            Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
            Options aVar = new Options(id, null, null, null, timePreciseness, false, !timeFormatDependency.mo108189a(), false, false, 302, null);
            Context a = C32634ae.m125179a();
            FormatTimeHelper cVar = FormatTimeHelper.f139156a;
            Intrinsics.checkExpressionValueIsNotNull(a, "context");
            return cVar.mo191634a(a, new Date(j), !TimezoneUtil.f139151a.mo191626a(a), aVar);
        }
        Options aVar2 = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar2.mo191591a(DatePreciseness.DAY);
        aVar2.mo191593a(LengthType.LONG);
        aVar2.mo191592a(DisplayPattern.ABSOLUTE);
        TimeZone timeZone2 = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getDefault()");
        String id2 = timeZone2.getID();
        Intrinsics.checkExpressionValueIsNotNull(id2, "TimeZone.getDefault().id");
        aVar2.mo191595a(id2);
        aVar2.mo191594a(TimePreciseness.MINUTE);
        AbstractC30037ag timeFormatDependency2 = C30022a.f74882a.timeFormatDependency();
        Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency2, "CalendarDependencyHolder…cy.timeFormatDependency()");
        aVar2.mo191599b(!timeFormatDependency2.mo108189a());
        Context a2 = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ResUtil.getAppContext()");
        return TimeFormatUtils.m219292g(a2, new Date(j), aVar2);
    }

    /* renamed from: b */
    public final boolean mo117421b(long j, long j2) {
        int julianDay = new CalendarDate(new Date(j)).getJulianDay();
        int julianDay2 = new CalendarDate(new Date(j2)).getJulianDay();
        if (julianDay == new CalendarDate().getJulianDay() && julianDay == julianDay2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo117419a(long j, long j2) {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        TimePreciseness timePreciseness = TimePreciseness.MINUTE;
        AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
        Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
        Options aVar = new Options(id, null, null, null, timePreciseness, false, !timeFormatDependency.mo108189a(), false, false, 302, null);
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        return TimeFormatUtils.m219281a(a, new Date(j), new Date(j2), aVar);
    }
}
