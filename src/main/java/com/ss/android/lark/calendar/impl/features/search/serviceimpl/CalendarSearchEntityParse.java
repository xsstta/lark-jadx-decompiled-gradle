package com.ss.android.lark.calendar.impl.features.search.serviceimpl;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.api.entity.CalendarSearchEventsResponse;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.search.EventHighLight;
import com.ss.android.lark.calendar.impl.features.search.HighLightTag;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventContent;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventInstance;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventResult;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/serviceimpl/CalendarSearchEntityParse;", "", "()V", "getCalendarSearchEventsResponses", "", "Lcom/ss/android/lark/calendar/api/entity/CalendarSearchEventsResponse;", "entity", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "getSearchEventDateString", "", "startTime", "", "isAllDay", "", "parseSearchContent2Response", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventContent;", "instance", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventInstance;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.b.b */
public final class CalendarSearchEntityParse {

    /* renamed from: a */
    public static final CalendarSearchEntityParse f82709a = new CalendarSearchEntityParse();

    private CalendarSearchEntityParse() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<CalendarSearchEventsResponse> m123242a(SearchCalendarEventResult fVar) {
        ArrayList arrayList = new ArrayList();
        if (fVar == null) {
            return arrayList;
        }
        if (CollectionUtils.isEmpty(fVar.mo118186a())) {
            return arrayList;
        }
        Iterator<SearchCalendarEventInstance> it = fVar.mo118186a().iterator();
        while (it.hasNext()) {
            SearchCalendarEventInstance next = it.next();
            SearchCalendarEventContent dVar = fVar.mo118187b().get(next.mo118179a());
            if (dVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(dVar, "entity.contents[item.serverId] ?: continue");
                CalendarSearchEntityParse bVar = f82709a;
                Intrinsics.checkExpressionValueIsNotNull(next, "item");
                arrayList.add(bVar.m123240a(dVar, next));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final String m123241a(long j, boolean z) {
        TimeZone timeZone = TimeZone.getDefault();
        Date date = new Date(j);
        int dayDiff = new CalendarDate(date, timeZone).dayDiff(new CalendarDate());
        if (dayDiff == -1) {
            String b = C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayYesterday);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ime_RelativeDayYesterday)");
            return b;
        } else if (dayDiff == 0) {
            if (z) {
                C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayToday);
            }
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "timeZone.id");
            AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
            Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
            Options aVar = new Options(id, null, null, null, TimePreciseness.MINUTE, false, !timeFormatDependency.mo108189a(), false, false, 302, null);
            Context a = C32634ae.m125179a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
            return TimeFormatUtils.m219287d(a, date, aVar);
        } else if (dayDiff != 1) {
            Context a2 = C32634ae.m125179a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ResUtil.getAppContext()");
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
            String id2 = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id2, "timeZone.id");
            return TimeFormatUtils.m219291f(a2, date, new Options(id2, DisplayPattern.RELATIVE, LengthType.SHORT, null, null, false, false, false, false, 504, null));
        } else {
            String b2 = C32634ae.m125182b(R.string.Calendar_StandardTime_RelativeDayTomorrow);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…Time_RelativeDayTomorrow)");
            return b2;
        }
    }

    /* renamed from: a */
    private final CalendarSearchEventsResponse m123240a(SearchCalendarEventContent dVar, SearchCalendarEventInstance eVar) {
        boolean z;
        CalendarSearchEventsResponse bVar = new CalendarSearchEventsResponse(null, 0, null, null, null, null, null, false, 0, 0, null, 2047, null);
        bVar.mo108383a(dVar.mo118163a());
        bVar.mo108388b(dVar.mo118164b());
        bVar.mo108382a(dVar.mo118165c());
        if (!TextUtils.isEmpty(dVar.mo118168f())) {
            bVar.mo108394d(C32634ae.m125182b(R.string.Calendar_Detail_Organizer) + ": " + dVar.mo118168f());
        } else if (!TextUtils.isEmpty(dVar.mo118169g())) {
            bVar.mo108394d(C32634ae.m125182b(R.string.Calendar_Detail_Creator) + ": " + dVar.mo118169g());
        }
        if (!TextUtils.isEmpty(dVar.mo118166d())) {
            bVar.mo108392c(dVar.mo118166d());
        } else {
            String b = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri….Calendar_Common_NoTitle)");
            bVar.mo108392c(b);
        }
        if (dVar.mo118178p() == Calendar.Type.GOOGLE) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo108385a(z);
        if (CollectionUtils.isNotEmpty(dVar.mo118173k())) {
            Iterator<EventHighLight> it = dVar.mo118173k().iterator();
            while (it.hasNext()) {
                EventHighLight next = it.next();
                if (next.getTag() == HighLightTag.SUMMARY) {
                    bVar.mo108384a(next.getHighlights());
                } else if (next.getTag() == HighLightTag.ATTENDEE) {
                    bVar.mo108389b(next.getHighlights());
                }
            }
        }
        bVar.mo108387b(eVar.mo118180b());
        bVar.mo108391c(eVar.mo118181c());
        bVar.mo108396e(m123241a(eVar.mo118180b() * ((long) 1000), dVar.mo118177o()));
        return bVar;
    }
}
