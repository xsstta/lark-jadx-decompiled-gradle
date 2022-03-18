package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30056v;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.calendar.wrapper.dependency.entity.CalChatter;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.u */
public class C39224u implements AbstractC30056v {

    /* renamed from: a */
    private final ICoreApi f100524a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: a */
    private CalendarForwardData m154691a(CalendarEvent calendarEvent, boolean z) {
        CalendarForwardData calendarForwardData = new CalendarForwardData();
        calendarForwardData.setSourceData(calendarEvent);
        calendarForwardData.setCalendarId(calendarEvent.getCalendarId());
        calendarForwardData.setCrossTenant(calendarEvent.isCrossTenant());
        calendarForwardData.setKey(calendarEvent.getKey());
        calendarForwardData.setOriginalTime(calendarEvent.getOriginalTime());
        calendarForwardData.setIsShareCalendarEvent(z);
        if (calendarEvent.getOrganizer() != null) {
            calendarForwardData.setLocalizedDisplayName(calendarEvent.getOrganizer().getLocalizedDisplayName());
        }
        calendarForwardData.setMeeting(calendarEvent.isMeeting());
        calendarForwardData.setMeetingMinute(calendarEvent.hasMeetingMinute());
        return calendarForwardData;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30056v
    /* renamed from: a */
    public void mo108284a(Context context, CalendarEvent calendarEvent, boolean z, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goCalendarShareSelectPage(context, m154691a(calendarEvent, z), i);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30056v
    /* renamed from: b */
    public void mo108286b(Context context, CalendarEvent calendarEvent, boolean z, int i) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goCalendarTransferSelectPage(context, m154691a(calendarEvent, z), i);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30056v
    /* renamed from: a */
    public void mo108283a(Context context, AbstractC30026d dVar, String str, String str2) {
        String str3;
        if (dVar == null) {
            str3 = null;
        } else {
            str3 = ((CalChatter) dVar).getChatter().getId();
        }
        mo108285a(context, str3, str, str2);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30056v
    /* renamed from: a */
    public void mo108285a(Context context, String str, String str2, String str3) {
        ContactSource contactSource = new ContactSource();
        contactSource.setSourceType(3);
        contactSource.setSourceName(str2);
        contactSource.setSourceId(str3);
        this.f100524a.startUserProfile(context, str, null, contactSource);
    }
}
