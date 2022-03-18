package com.ss.android.lark.calendar.impl.rustadapter.p1575c;

import android.util.SparseArray;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetAuthorizedEventByUniqueFieldResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetSettingsResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetSharedCalendarEventResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingDependency;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OptimisticReplyCalendarEventInvitationResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ShareFailedChat;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.f */
public interface AbstractC32594f {
    /* renamed from: a */
    ArrayList<DayInstancesLayout> mo118849a(List<DayInstancesSlotMetric> list);

    /* renamed from: a */
    Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo118850a(Map<String, SchemaExtraData.ResourceStrategy> map, Map<String, SchemaExtraData.ResourceRequisition> map2, Map<String, SchemaExtraData.ResourceApprovalInfo> map3, String str, String str2, String str3, long j);

    /* renamed from: a */
    void mo118851a(IGetDataCallback<GetSettingsResponse> iGetDataCallback);

    /* renamed from: a */
    void mo118852a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, IGetDataCallback<CalendarEvent> iGetDataCallback);

    /* renamed from: a */
    void mo118853a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, String str, Map<String, List<SimpleMember>> map, List<CalendarEventAttendee> list, IGetDataCallback<CalendarEvent> iGetDataCallback);

    /* renamed from: a */
    void mo118854a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, IGetDataCallback<JSONObject> iGetDataCallback, boolean z);

    /* renamed from: a */
    void mo118856a(CalendarEventUniqueField bVar, IGetDataCallback<List<CalendarEvent>> iGetDataCallback);

    /* renamed from: a */
    void mo118857a(String str, IGetDataCallback<MeetingDependency> iGetDataCallback);

    /* renamed from: a */
    void mo118858a(String str, ScrollType scrollType, IGetDataCallback<Object> iGetDataCallback);

    /* renamed from: a */
    void mo118859a(String str, String str2, long j, long j2, IGetDataCallback<GetAuthorizedEventByUniqueFieldResponse> iGetDataCallback);

    /* renamed from: a */
    void mo118861a(String str, String str2, long j, CalendarEventAttendee.Status status, IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> iGetDataCallback);

    /* renamed from: a */
    void mo118862a(String str, String str2, long j, CalendarEventAttendee.Status status, CalendarEvent.Span span, String str3, boolean z, String str4, String str5, IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> iGetDataCallback);

    /* renamed from: a */
    void mo118868a(String str, String str2, long j, String str3, String str4, IGetDataCallback<GetSharedCalendarEventResponse> iGetDataCallback);

    /* renamed from: a */
    void mo118870a(String str, String str2, long j, List<String> list, IGetDataCallback<List<ShareFailedChat>> iGetDataCallback);

    /* renamed from: a */
    void mo118871a(String str, String str2, IGetDataCallback<List<CalendarEvent>> iGetDataCallback);

    /* renamed from: a */
    void mo118873a(List<String> list, boolean z, IGetDataCallback<List<CalendarEvent>> iGetDataCallback);

    /* renamed from: b */
    SparseArray<MappingColor> mo118875b(List<Integer> list);

    /* renamed from: b */
    void mo118876b(IGetDataCallback<List<RedDotUiItem>> iGetDataCallback);

    /* renamed from: b */
    void mo118878b(String str, String str2, long j, IGetDataCallback<CalendarEvent> iGetDataCallback);

    /* renamed from: b */
    void mo118879b(String str, String str2, long j, String str3, String str4, IGetDataCallback<CalendarEvent> iGetDataCallback);

    /* renamed from: b */
    void mo118880b(List<String> list, IGetDataCallback<Map<String, CalendarEventAttendee>> iGetDataCallback);

    /* renamed from: c */
    void mo118883c(List<RedDotUiItem> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: d */
    void mo118885d(List<String> list, IGetDataCallback<Map<String, UserAttendeeBaseInfo>> iGetDataCallback);

    /* renamed from: e */
    void mo118886e(String str, String str2, long j, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: f */
    void mo118887f(String str, String str2, long j, IGetDataCallback<Map<String, List<SimpleMember>>> iGetDataCallback);
}
