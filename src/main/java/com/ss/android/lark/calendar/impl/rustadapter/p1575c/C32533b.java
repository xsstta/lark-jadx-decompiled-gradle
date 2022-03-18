package com.ss.android.lark.calendar.impl.rustadapter.p1575c;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByChatIdRequest;
import com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByChatIdResponse;
import com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByEventRequest;
import com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByEventResponse;
import com.bytedance.lark.pb.calendar.v1.DeleteEventRequest;
import com.bytedance.lark.pb.calendar.v1.DeleteEventResponse;
import com.bytedance.lark.pb.calendar.v1.GetAttendeesByChatterIdsRequest;
import com.bytedance.lark.pb.calendar.v1.GetAttendeesByChatterIdsResponse;
import com.bytedance.lark.pb.calendar.v1.GetAuthorizedEventByUniqueFieldRequest;
import com.bytedance.lark.pb.calendar.v1.GetCalendarEventInfoRequest;
import com.bytedance.lark.pb.calendar.v1.GetCalendarEventInfoResponse;
import com.bytedance.lark.pb.calendar.v1.GetCalendarEventMappingColorsRequest;
import com.bytedance.lark.pb.calendar.v1.GetCalendarEventMappingColorsResponse;
import com.bytedance.lark.pb.calendar.v1.GetConfigSettingsRequest;
import com.bytedance.lark.pb.calendar.v1.GetConfigSettingsResponse;
import com.bytedance.lark.pb.calendar.v1.GetEventRequest;
import com.bytedance.lark.pb.calendar.v1.GetEventResponse;
import com.bytedance.lark.pb.calendar.v1.GetExceptionalEventsRequest;
import com.bytedance.lark.pb.calendar.v1.GetExceptionalEventsResponse;
import com.bytedance.lark.pb.calendar.v1.GetInstancesLayoutRequest;
import com.bytedance.lark.pb.calendar.v1.GetInstancesLayoutResponse;
import com.bytedance.lark.pb.calendar.v1.GetMeetingEventRequest;
import com.bytedance.lark.pb.calendar.v1.GetMeetingEventResponse;
import com.bytedance.lark.pb.calendar.v1.GetMeetingMinuteHasUpdateByChatIdRequest;
import com.bytedance.lark.pb.calendar.v1.GetMeetingMinuteHasUpdateByChatIdResponse;
import com.bytedance.lark.pb.calendar.v1.GetMeetingsByChatIdsRequest;
import com.bytedance.lark.pb.calendar.v1.GetMeetingsByChatIdsResponse;
import com.bytedance.lark.pb.calendar.v1.GetParsedRruleTextRequest;
import com.bytedance.lark.pb.calendar.v1.GetParsedRruleTextResponse;
import com.bytedance.lark.pb.calendar.v1.GetSharedCalendarEventRequest;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsRequest;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.GetUserAttendeeBaseInfosRequest;
import com.bytedance.lark.pb.calendar.v1.GetUserAttendeeBaseInfosResponse;
import com.bytedance.lark.pb.calendar.v1.JoinCalendarEventRequest;
import com.bytedance.lark.pb.calendar.v1.JoinCalendarEventResponse;
import com.bytedance.lark.pb.calendar.v1.JudgeNotificationBoxTypeRequest;
import com.bytedance.lark.pb.calendar.v1.JudgeNotificationBoxTypeResponse;
import com.bytedance.lark.pb.calendar.v1.MGetServerEventsByUniqueFieldsRequest;
import com.bytedance.lark.pb.calendar.v1.MGetServerEventsByUniqueFieldsResponse;
import com.bytedance.lark.pb.calendar.v1.MGetServerEventsRequest;
import com.bytedance.lark.pb.calendar.v1.MGetServerEventsResponse;
import com.bytedance.lark.pb.calendar.v1.MarkMeetingScrollClickedRequest;
import com.bytedance.lark.pb.calendar.v1.MarkRedDotsDisappearRequest;
import com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationRequest;
import com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationWithSpanRequest;
import com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationWithSpanResponse;
import com.bytedance.lark.pb.calendar.v1.PreloadServerEventsRequest;
import com.bytedance.lark.pb.calendar.v1.PreloadServerEventsResponse;
import com.bytedance.lark.pb.calendar.v1.PullEventGroupAttendeeMembersRequest;
import com.bytedance.lark.pb.calendar.v1.PullEventGroupsSimpleMembersRequest;
import com.bytedance.lark.pb.calendar.v1.PullEventGroupsSimpleMembersResponse;
import com.bytedance.lark.pb.calendar.v1.SaveEventRequest;
import com.bytedance.lark.pb.calendar.v1.SaveEventResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageRequest;
import com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageResponse;
import com.bytedance.lark.pb.calendar.v1.SimpleMembers;
import com.bytedance.lark.pb.calendar.v1.SwitchEventCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.SwitchEventCalendarResponse;
import com.bytedance.lark.pb.calendar.v1.TransferCalendarEventRequest;
import com.bytedance.lark.pb.calendar.v1.TransferCalendarEventResponse;
import com.bytedance.lark.pb.calendar.v1.UpgradeToMeetingRequest;
import com.bytedance.lark.pb.calendar.v1.UpgradeToMeetingResponse;
import com.bytedance.lark.pb.settings.v1.GetSettingsRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMeetingEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EventOperationType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetAuthorizedEventByUniqueFieldResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetSettingsResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetSharedCalendarEventResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.LanguageType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Meeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingDependency;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.NotificationBoxType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OptimisticReplyCalendarEventInvitationResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventGroupAttendeeMembersResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ShareFailedChat;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.b */
public class C32533b implements AbstractC32594f {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.b$a */
    public static class C32543a {

        /* renamed from: a */
        public static final C32533b f83472a = new C32533b();
    }

    private C32533b() {
    }

    /* renamed from: a */
    public static C32533b m124620a() {
        return C32543a.f83472a;
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118853a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, String str, Map<String, List<SimpleMember>> map, List<CalendarEventAttendee> list, IGetDataCallback<CalendarEvent> iGetDataCallback) {
        SaveEventRequest.C15990a aVar = new SaveEventRequest.C15990a();
        boolean z = calendarEvent.getStartTime() % 60 == 0 && calendarEvent.getEndTime() % 60 == 0;
        C3474b.m14696a(z, calendarEvent.getStartTime() + "-" + calendarEvent.getEndTime());
        com.bytedance.lark.pb.calendar.v1.CalendarEvent a = C32514b.m124491a(calendarEvent);
        if (a != null) {
            aVar.mo57554a(a);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEvent a2 = C32514b.m124491a(calendarEvent2);
        if (a2 != null) {
            aVar.mo57561b(a2);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEventInstance a3 = C32514b.m124494a(calendarEventInstance);
        if (a3 != null) {
            aVar.mo57555a(a3);
        }
        aVar.mo57553a(CalendarEvent.Span.fromValue(span.getNumber()));
        if (!TextUtils.isEmpty(str)) {
            aVar.mo57557a(str);
        }
        Map<String, SimpleMembers> f = C32514b.m124558f(map);
        if (CollectionUtils.isNotEmpty(f)) {
            aVar.mo57559a(f);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(list)) {
            for (CalendarEventAttendee calendarEventAttendee : list) {
                arrayList.add(C32514b.m124492a(calendarEventAttendee));
            }
            aVar.mo57556a((Boolean) true).mo57558a(arrayList);
        }
        SdkSender.asynSendRequestNonWrap(Command.SAVE_EVENT, aVar, iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325341 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent parse(byte[] bArr) throws IOException {
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent a = C32514b.m124512a(SaveEventResponse.ADAPTER.decode(bArr).event);
                long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                Log.m165389i("Lark", "save SDK time:" + currentTimeMillis + "ms");
                return a;
            }
        });
    }

    /* renamed from: a */
    public void mo118860a(String str, String str2, long j, IGetDataCallback<Meeting> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPGRADE_TO_MEETING, new UpgradeToMeetingRequest.C16104a().mo57856a(str).mo57858b(str2).mo57855a(Long.valueOf(j)).mo57854a((Boolean) true), iGetDataCallback, new SdkSender.IParser<Meeting>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass11 */

            /* renamed from: a */
            public Meeting parse(byte[] bArr) throws IOException {
                UpgradeToMeetingResponse decode = UpgradeToMeetingResponse.ADAPTER.decode(bArr);
                if (!decode.success.booleanValue() || decode.meeting == null) {
                    return null;
                }
                return C32514b.m124530a(decode.meeting);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118854a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, IGetDataCallback<JSONObject> iGetDataCallback, boolean z) {
        DeleteEventRequest.C15594a aVar = new DeleteEventRequest.C15594a();
        com.bytedance.lark.pb.calendar.v1.CalendarEvent a = C32514b.m124491a(calendarEvent);
        if (a != null) {
            aVar.mo56555a(a);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEventInstance a2 = C32514b.m124494a(calendarEventInstance);
        if (a2 != null) {
            aVar.mo56556a(a2);
        }
        aVar.mo56554a(CalendarEvent.Span.fromValue(span.getNumber()));
        aVar.f41328d = Boolean.valueOf(z);
        final long currentTimeMillis = System.currentTimeMillis();
        SdkSender.asynSendRequestNonWrap(Command.DELETE_EVENT, aVar, iGetDataCallback, new SdkSender.IParser<JSONObject>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass24 */

            /* renamed from: a */
            public JSONObject parse(byte[] bArr) throws IOException {
                DeleteEventResponse.ADAPTER.decode(bArr);
                Log.m165389i("Lark", "delete SDK time:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                return new JSONObject();
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118871a(String str, String str2, IGetDataCallback<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_EXCEPTIONAL_EVENTS, new GetExceptionalEventsRequest.C15704a().mo56826a(str).mo56828b(str2), iGetDataCallback, new SdkSender.IParser<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass26 */

            /* renamed from: a */
            public List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> parse(byte[] bArr) throws IOException {
                return C32514b.m124551c(GetExceptionalEventsResponse.ADAPTER.decode(bArr).exceptional_events);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118868a(String str, String str2, long j, String str3, String str4, IGetDataCallback<GetSharedCalendarEventResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_SHARED_CALENDAR_EVENT, new GetSharedCalendarEventRequest.C15784a().mo57022a(str).mo57024b(str2).mo57021a(Long.valueOf(j)).mo57025c(str3).mo57026d(str4), iGetDataCallback, $$Lambda$b$nqdkkbw2AsmowaWmraLrRMCf0mI.INSTANCE);
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118856a(CalendarEventUniqueField bVar, IGetDataCallback<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>> iGetDataCallback) {
        com.bytedance.lark.pb.calendar.v1.CalendarEventUniqueField a = C32514b.m124495a(bVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        SdkSender.asynSendRequestNonWrap(Command.MGET_SERVER_EVENTS_BY_UNIQUE_FIELD, new MGetServerEventsByUniqueFieldsRequest.C15844a().mo57187a(arrayList), iGetDataCallback, new SdkSender.IParser<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass28 */

            /* renamed from: a */
            public List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> parse(byte[] bArr) throws IOException {
                return C32514b.m124551c(MGetServerEventsByUniqueFieldsResponse.ADAPTER.decode(bArr).calendar_events);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118857a(final String str, IGetDataCallback<MeetingDependency> iGetDataCallback) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        SdkSender.asynSendRequestNonWrap(Command.GET_MEETINGS_BY_CHAT_IDS, new GetMeetingsByChatIdsRequest.C15746a().mo56933a(arrayList), iGetDataCallback, new SdkSender.IParser<MeetingDependency>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325352 */

            /* renamed from: a */
            public MeetingDependency parse(byte[] bArr) throws IOException {
                Map<String, com.bytedance.lark.pb.calendar.v1.MeetingDependency> map = GetMeetingsByChatIdsResponse.ADAPTER.decode(bArr).chat_meetings;
                if (map == null) {
                    return null;
                }
                return C32514b.m124531a(map.get(str));
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118858a(String str, ScrollType scrollType, IGetDataCallback<Object> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MARK_MEETING_SCROLL_CLICKED, new MarkMeetingScrollClickedRequest.C15860a().mo57232a(str).mo57231a(com.bytedance.lark.pb.calendar.v1.ScrollType.fromValue(scrollType.getNumber())), iGetDataCallback, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325396 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118873a(List<String> list, boolean z, IGetDataCallback<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_SERVER_EVENTS, new MGetServerEventsRequest.C15848a().mo57197a(list).mo57196a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325418 */

            /* renamed from: a */
            public List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> parse(byte[] bArr) throws IOException {
                return C32514b.m124551c(MGetServerEventsResponse.ADAPTER.decode(bArr).calendar_events);
            }
        });
    }

    /* renamed from: a */
    public void mo118872a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PRELOAD_SERVER_EVENTS, new PreloadServerEventsRequest.C15908a().mo57354a(list), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325429 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return PreloadServerEventsResponse.ADAPTER.decode(bArr).is_success;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118861a(String str, String str2, long j, CalendarEventAttendee.Status status, IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> iGetDataCallback) {
        mo118864a(str, str2, j, status, "", true, "", "", iGetDataCallback);
    }

    /* renamed from: a */
    public void mo118866a(String str, String str2, long j, String str3, CalendarEventAttendee.Status status, IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> iGetDataCallback) {
        mo118864a(str, str2, j, status, str3, true, "", "", iGetDataCallback);
    }

    /* renamed from: a */
    public void mo118863a(String str, String str2, long j, CalendarEventAttendee.Status status, String str3, String str4, String str5, IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> iGetDataCallback) {
        mo118864a(str, str2, j, status, str3, true, str4, str5, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo118864a(String str, String str2, long j, CalendarEventAttendee.Status status, String str3, boolean z, String str4, String str5, IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.OPTIMISTIC_REPLY_CALENDAR_EVENT_INVITATION, new OptimisticReplyCalendarEventInvitationRequest.C15890a().mo57299a(str).mo57301b(str2).mo57298a(Long.valueOf(j)).mo57296a(CalendarEventAttendee.Status.fromValue(status.getNumber())).mo57302c(str3).mo57297a(Boolean.valueOf(z)).mo57303d(str4).mo57304e(str5), iGetDataCallback, new SdkSender.IParser<OptimisticReplyCalendarEventInvitationResponse>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass10 */

            /* renamed from: a */
            public OptimisticReplyCalendarEventInvitationResponse parse(byte[] bArr) throws IOException {
                com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationResponse decode = com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationResponse.ADAPTER.decode(bArr);
                return new OptimisticReplyCalendarEventInvitationResponse(C32514b.m124512a(decode.event), decode.chat_id);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118862a(String str, String str2, long j, CalendarEventAttendee.Status status, CalendarEvent.Span span, String str3, boolean z, String str4, String str5, IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.OPTIMISTIC_REPLY_CALENDAR_EVENT_INVITATION_WITH_SPAN, new OptimisticReplyCalendarEventInvitationWithSpanRequest.C15894a().mo57316a(str).mo57318b(str2).mo57315a(Long.valueOf(j)).mo57313a(CalendarEventAttendee.Status.fromValue(status.getNumber())).mo57312a(CalendarEvent.Span.fromValue(span.getNumber())).mo57319c(str3).mo57314a(Boolean.valueOf(z)).mo57320d(str4).mo57321e(str5), iGetDataCallback, new SdkSender.IParser<OptimisticReplyCalendarEventInvitationResponse>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass12 */

            /* renamed from: a */
            public OptimisticReplyCalendarEventInvitationResponse parse(byte[] bArr) throws IOException {
                OptimisticReplyCalendarEventInvitationWithSpanResponse decode = OptimisticReplyCalendarEventInvitationWithSpanResponse.ADAPTER.decode(bArr);
                return new OptimisticReplyCalendarEventInvitationResponse(C32514b.m124512a(decode.event), decode.chat_id);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118870a(String str, String str2, long j, List<String> list, IGetDataCallback<List<ShareFailedChat>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SHARE_CALENDAR_EVENT_MESSAGES, new ShareCalendarEventMessageRequest.C16048a().mo57714a(str).mo57717b(str2).mo57713a(Long.valueOf(j)).mo57715a(list), iGetDataCallback, new SdkSender.IParser<List<ShareFailedChat>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass13 */

            /* renamed from: a */
            public List<ShareFailedChat> parse(byte[] bArr) throws IOException {
                return C32514b.m124560h(ShareCalendarEventMessageResponse.ADAPTER.decode(bArr).share_failed_chats);
            }
        });
    }

    /* renamed from: a */
    public void mo118855a(EventOperationType eventOperationType, CalendarEvent.Span span, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent2, long j, List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> list, IGetDataCallback<NotificationBoxType> iGetDataCallback) {
        JudgeNotificationBoxTypeRequest.C15828a aVar = new JudgeNotificationBoxTypeRequest.C15828a();
        com.bytedance.lark.pb.calendar.v1.CalendarEvent a = C32514b.m124491a(calendarEvent);
        if (a != null) {
            aVar.mo57144a(a);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEvent a2 = C32514b.m124491a(calendarEvent2);
        if (a2 != null) {
            aVar.mo57150b(a2);
        }
        aVar.mo57145a(com.bytedance.lark.pb.calendar.v1.EventOperationType.fromValue(eventOperationType.getNumber()));
        aVar.mo57143a(CalendarEvent.Span.fromValue(span.getNumber()));
        aVar.mo57147a(Long.valueOf(j));
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(list)) {
            for (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee calendarEventAttendee : list) {
                arrayList.add(C32514b.m124492a(calendarEventAttendee));
            }
            aVar.mo57146a((Boolean) true).mo57148a(arrayList);
        }
        SdkSender.asynSendRequestNonWrap(Command.JUDGE_NOTIFICATION_BOX_TYPE, aVar, iGetDataCallback, new SdkSender.IParser<NotificationBoxType>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass20 */

            /* renamed from: a */
            public NotificationBoxType parse(byte[] bArr) throws IOException {
                return C32514b.m124532a(JudgeNotificationBoxTypeResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public String[] mo118874a(String str, LanguageType languageType) {
        return (String[]) SdkSender.syncSend(Command.GET_PARSED_RRULE_TEXT, new GetParsedRruleTextRequest.C15750a().mo56943a(str).mo56942a(com.bytedance.lark.pb.basic.v1.LanguageType.fromValue(languageType.getNumber())), new SdkSender.IParser<String[]>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass21 */

            /* renamed from: a */
            public String[] parse(byte[] bArr) throws IOException {
                GetParsedRruleTextResponse decode = GetParsedRruleTextResponse.ADAPTER.decode(bArr);
                return new String[]{decode.parsed_rrule, decode.freq_part, decode.until_part};
            }
        });
    }

    /* renamed from: a */
    public void mo118867a(String str, String str2, long j, String str3, Boolean bool, IGetDataCallback<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.TRANSFER_CALENDAR_EVENT, new TransferCalendarEventRequest.C16084a().mo57804a(str).mo57806b(str2).mo57803a(Long.valueOf(j)).mo57807c(str3).mo57802a(bool), iGetDataCallback, new SdkSender.IParser<List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass23 */

            /* renamed from: a */
            public List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> parse(byte[] bArr) throws IOException {
                return C32514b.m124551c(TransferCalendarEventResponse.ADAPTER.decode(bArr).events);
            }
        });
    }

    /* renamed from: a */
    public void mo118869a(String str, String str2, long j, String str3, boolean z, IGetDataCallback<PullEventGroupAttendeeMembersResponse> iGetDataCallback, String str4, int i) {
        PullEventGroupAttendeeMembersRequest.C15926a a = new PullEventGroupAttendeeMembersRequest.C15926a().mo57403a(str).mo57405b(str2).mo57402a(Long.valueOf(j)).mo57406c(str3).mo57400a(Boolean.valueOf(z)).mo57401a(Integer.valueOf(i));
        SdkSender.asynSendRequestNonWrap(Command.PULL_EVENT_GROUP_ATTENDEE_MEMBERS, a.mo57407d(str4 + ""), iGetDataCallback, $$Lambda$b$Mw9qe1sTRyFibN7Uh8Kzny3kipM.INSTANCE);
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118859a(String str, String str2, long j, long j2, IGetDataCallback<GetAuthorizedEventByUniqueFieldResponse> iGetDataCallback) {
        GetAuthorizedEventByUniqueFieldRequest.C15644a a = new GetAuthorizedEventByUniqueFieldRequest.C15644a().mo56681a(str).mo56684b(str2).mo56680a(Long.valueOf(j));
        if (j2 != -1) {
            a.mo56683b(Long.valueOf(j2));
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_AUTHORIZED_EVENT_BY_UNIQUE_FIELD, a, iGetDataCallback, $$Lambda$b$Xn2ohjJnoau3AkjSHqSPMDln8Z8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Map m124623b(byte[] bArr) throws IOException {
        return GetUnusableMeetingRoomsResponse.ADAPTER.decode(bArr).unusable_reasons;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Map m124625d(byte[] bArr) throws IOException {
        return C32514b.m124556e(PullEventGroupsSimpleMembersResponse.ADAPTER.decode(bArr).group_members);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ PullEventGroupAttendeeMembersResponse m124626e(byte[] bArr) throws IOException {
        return C32514b.m124538a(com.bytedance.lark.pb.calendar.v1.PullEventGroupAttendeeMembersResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent m124627f(byte[] bArr) throws IOException {
        return C32514b.m124512a(JoinCalendarEventResponse.ADAPTER.decode(bArr).calendar_event);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Map m124624c(byte[] bArr) throws IOException {
        return C26249aa.m94985a(GetUserAttendeeBaseInfosResponse.ADAPTER.decode(bArr).user_attendee_base_infos, $$Lambda$8hlWqFFa44Eg_9bZFJao21PPPac.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ GetSharedCalendarEventResponse m124628g(byte[] bArr) throws IOException {
        com.bytedance.lark.pb.calendar.v1.GetSharedCalendarEventResponse decode = com.bytedance.lark.pb.calendar.v1.GetSharedCalendarEventResponse.ADAPTER.decode(bArr);
        return new GetSharedCalendarEventResponse(C32514b.m124512a(decode.event), decode.is_joinable);
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public ArrayList<DayInstancesLayout> mo118849a(List<DayInstancesSlotMetric> list) {
        return (ArrayList) SdkSender.syncSend(Command.GET_INSTANCES_LAYOUT, new GetInstancesLayoutRequest.C15716a().mo56854a(C32514b.m124566n(list)), new SdkSender.IParser<ArrayList<DayInstancesLayout>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass15 */

            /* renamed from: a */
            public ArrayList<DayInstancesLayout> parse(byte[] bArr) throws IOException {
                return C32514b.m124567o(GetInstancesLayoutResponse.ADAPTER.decode(bArr).days_instance_layout);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: b */
    public SparseArray<MappingColor> mo118875b(List<Integer> list) {
        GetCalendarEventMappingColorsRequest.C15656a aVar = new GetCalendarEventMappingColorsRequest.C15656a();
        aVar.mo56711a(list);
        return (SparseArray) SdkSender.syncSend(Command.GET_CALENDAR_EVENT_MAPPING_COLORS, aVar, new SdkSender.IParser<SparseArray<MappingColor>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass19 */

            /* renamed from: a */
            public SparseArray<MappingColor> parse(byte[] bArr) throws IOException {
                return C32514b.m124488a(GetCalendarEventMappingColorsResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: b */
    public void mo118876b(IGetDataCallback<List<RedDotUiItem>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CONFIG_SETTINGS, new GetConfigSettingsRequest.C15688a(), iGetDataCallback, new SdkSender.IParser<List<RedDotUiItem>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass17 */

            /* renamed from: a */
            public List<RedDotUiItem> parse(byte[] bArr) throws IOException {
                return C32514b.m124568p(GetConfigSettingsResponse.ADAPTER.decode(bArr).calendar_configs.red_dot_items);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ GetAuthorizedEventByUniqueFieldResponse m124622a(byte[] bArr) throws IOException {
        com.bytedance.lark.pb.calendar.v1.GetAuthorizedEventByUniqueFieldResponse decode = com.bytedance.lark.pb.calendar.v1.GetAuthorizedEventByUniqueFieldResponse.ADAPTER.decode(bArr);
        return new GetAuthorizedEventByUniqueFieldResponse(C32514b.m124512a(decode.event), GetAuthorizedEventByUniqueFieldResponse.EventSource.Companion.mo119863a(decode.source.getValue()), decode.fixed_start_time.longValue());
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118851a(IGetDataCallback<GetSettingsResponse> iGetDataCallback) {
        GetSettingsRequest.C19155a aVar = new GetSettingsRequest.C19155a();
        ArrayList arrayList = new ArrayList();
        arrayList.add("calendar_config");
        aVar.f47294a = arrayList;
        SdkSender.asynSendRequestNonWrap(Command.GET_SETTINGS, aVar, iGetDataCallback, new SdkSender.IParser<GetSettingsResponse>("calendar_config") {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass16 */

            /* renamed from: a */
            public GetSettingsResponse parse(byte[] bArr) throws IOException {
                String str = com.bytedance.lark.pb.settings.v1.GetSettingsResponse.ADAPTER.decode(bArr).field_groups.get("calendar_config");
                GetSettingsResponse kVar = new GetSettingsResponse();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("event_attendee_limit")) {
                        kVar.mo120113a((Integer) jSONObject.get("event_attendee_limit"));
                    }
                    if (jSONObject.has("attendee_timezone_enable_limit")) {
                        kVar.mo120115b((Integer) jSONObject.get("attendee_timezone_enable_limit"));
                    }
                    if (jSONObject.has("max_individual_attendee_num_from_department")) {
                        kVar.mo120117c((Integer) jSONObject.get("max_individual_attendee_num_from_department"));
                    }
                    return kVar;
                } catch (JSONException unused) {
                    throw new IOException("not valid json!");
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent m124621a(long j, byte[] bArr) throws IOException {
        com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent a = C32514b.m124512a(SwitchEventCalendarResponse.ADAPTER.decode(bArr).switched_event);
        long currentTimeMillis = System.currentTimeMillis() - j;
        Log.m165389i("Lark", "switch calendar SDK time:" + currentTimeMillis + "ms");
        return a;
    }

    /* renamed from: c */
    public void mo118881c(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_MEETING_MINUTE_HAS_UPDATE_BY_CHAT_ID, new GetMeetingMinuteHasUpdateByChatIdRequest.C15732a().mo56894a(str), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325385 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return GetMeetingMinuteHasUpdateByChatIdResponse.ADAPTER.decode(bArr).has_update;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: d */
    public void mo118885d(List<String> list, IGetDataCallback<Map<String, UserAttendeeBaseInfo>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_ATTENDEE_BASE_INFOS, new GetUserAttendeeBaseInfosRequest.C15804a().mo57074a(list), iGetDataCallback, $$Lambda$b$QqUdvcG2KdEOkdKnRd1wrMItuC4.INSTANCE);
    }

    /* renamed from: b */
    public void mo118877b(String str, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_MEETING_MINUTE_BY_CHAT_ID, new CreateMeetingMinuteByChatIdRequest.C15580a().mo56519a(str), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325363 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return CreateMeetingMinuteByChatIdResponse.ADAPTER.decode(bArr).meeting_minute_url;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: c */
    public void mo118883c(List<RedDotUiItem> list, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MARK_RED_DOTS_DISAPPEAR, new MarkRedDotsDisappearRequest.C15862a().mo57237a(C32514b.m124569q(list)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass18 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: b */
    public void mo118880b(List<String> list, IGetDataCallback<Map<String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_ATTENDEES_BY_CHATTER_IDS, new GetAttendeesByChatterIdsRequest.C15640a().mo56671a(list), iGetDataCallback, new SdkSender.IParser<Map<String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass14 */

            /* renamed from: a */
            public Map<String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> parse(byte[] bArr) throws IOException {
                return C32514b.m124550b(GetAttendeesByChatterIdsResponse.ADAPTER.decode(bArr).chatter_id_attendees);
            }
        });
    }

    /* renamed from: a */
    public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent mo118848a(String str, String str2, long j) {
        return (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent) SdkSender.syncSend(Command.GET_EVENT, new GetEventRequest.C15700a().mo56816a(str).mo56818b(str2).mo56815a(Long.valueOf(j)), new SdkSender.IParser<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325407 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent parse(byte[] bArr) throws IOException {
                return C32514b.m124512a(GetEventResponse.ADAPTER.decode(bArr).event);
            }
        });
    }

    /* renamed from: d */
    public void mo118884d(String str, String str2, long j, IGetDataCallback<CalendarMeetingEvent> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_MEETING_EVENT, new GetMeetingEventRequest.C15728a().mo56884a(str).mo56886b(str2).mo56883a(Long.valueOf(j)), iGetDataCallback, new SdkSender.IParser<CalendarMeetingEvent>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass29 */

            /* renamed from: a */
            public CalendarMeetingEvent parse(byte[] bArr) throws IOException {
                return C32514b.m124519a(GetMeetingEventResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: e */
    public void mo118886e(String str, String str2, long j, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_MEETING_MINUTE_BY_EVENT, new CreateMeetingMinuteByEventRequest.C15584a().mo56529a(str).mo56531b(str2).mo56528a(Long.valueOf(j)), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.C325374 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return CreateMeetingMinuteByEventResponse.ADAPTER.decode(bArr).meeting_minute_url;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: f */
    public void mo118887f(String str, String str2, long j, IGetDataCallback<Map<String, List<SimpleMember>>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PULL_EVENT_GROUPS_SIMPLE_MEMBERS, new PullEventGroupsSimpleMembersRequest.C15930a().mo57416a(str).mo57418b(str2).mo57415a(Long.valueOf(j)), iGetDataCallback, $$Lambda$b$mJxrmeUZiUb61H0_thB5zbIGNc.INSTANCE);
    }

    /* renamed from: c */
    public void mo118882c(String str, String str2, long j, IGetDataCallback<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CALENDAR_EVENT_INFO, new GetCalendarEventInfoRequest.C15652a().mo56701a(str).mo56703b(str2).mo56700a(Long.valueOf(j)), iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass27 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent parse(byte[] bArr) throws IOException {
                return C32514b.m124512a(GetCalendarEventInfoResponse.ADAPTER.decode(bArr).calendar_event);
            }
        });
    }

    /* renamed from: a */
    public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent mo118847a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span) {
        boolean z;
        SaveEventRequest.C15990a aVar = new SaveEventRequest.C15990a();
        if (calendarEvent.getStartTime() % 60 == 0 && calendarEvent.getEndTime() % 60 == 0) {
            z = true;
        } else {
            z = false;
        }
        C3474b.m14696a(z, calendarEvent.getStartTime() + "-" + calendarEvent.getEndTime());
        com.bytedance.lark.pb.calendar.v1.CalendarEvent a = C32514b.m124491a(calendarEvent);
        if (a != null) {
            aVar.mo57554a(a);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEvent a2 = C32514b.m124491a(calendarEvent2);
        if (a2 != null) {
            aVar.mo57561b(a2);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEventInstance a3 = C32514b.m124494a(calendarEventInstance);
        if (a3 != null) {
            aVar.mo57555a(a3);
        }
        aVar.mo57553a(CalendarEvent.Span.fromValue(span.getNumber()));
        return (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent) SdkSender.syncSend(Command.SAVE_EVENT, aVar, new SdkSender.IParser<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass22 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent parse(byte[] bArr) throws IOException {
                return C32514b.m124512a(SaveEventResponse.ADAPTER.decode(bArr).event);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: b */
    public void mo118878b(String str, String str2, long j, IGetDataCallback<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_EVENT, new GetEventRequest.C15700a().mo56816a(str).mo56818b(str2).mo56815a(Long.valueOf(j)), iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b.AnonymousClass25 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent parse(byte[] bArr) throws IOException {
                return C32514b.m124512a(GetEventResponse.ADAPTER.decode(bArr).event);
            }
        });
    }

    /* renamed from: a */
    public void mo118865a(String str, String str2, long j, String str3, IGetDataCallback<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> iGetDataCallback) {
        mo118879b(str, str2, j, str3, null, iGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public void mo118852a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, IGetDataCallback<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> iGetDataCallback) {
        SwitchEventCalendarRequest.C16072a aVar = new SwitchEventCalendarRequest.C16072a();
        aVar.mo57775a(calendarEvent2.getCalendarId());
        aVar.mo57777b(calendarEvent2.getKey());
        aVar.mo57774a(Long.valueOf(calendarEvent2.getOriginalTime()));
        aVar.mo57778c(calendarEvent.getCalendarId());
        SdkSender.asynSendRequestNonWrap(Command.SWITCH_EVENT_CALENDAR, aVar, iGetDataCallback, new SdkSender.IParser(System.currentTimeMillis()) {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.$$Lambda$b$3ekQlFcmgQrNUCydwp7MIOKdM */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32533b.m124621a(this.f$0, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: b */
    public void mo118879b(String str, String str2, long j, String str3, String str4, IGetDataCallback<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.JOIN_CALENDAR_EVENT, new JoinCalendarEventRequest.C15820a().mo57119a(str).mo57121b(str2).mo57118a(Long.valueOf(j)).mo57122c(str3).mo57123d(str4), iGetDataCallback, $$Lambda$b$UEjJNYBgm_BZrLT9aOLbiJ8YK4.INSTANCE);
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f
    /* renamed from: a */
    public Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo118850a(Map<String, SchemaExtraData.ResourceStrategy> map, Map<String, SchemaExtraData.ResourceRequisition> map2, Map<String, SchemaExtraData.ResourceApprovalInfo> map3, String str, String str2, String str3, long j) {
        return (Map) SdkSender.syncSend(Command.GET_UNUSABLE_MEETING_ROOMS, new GetUnusableMeetingRoomsRequest.C15798a().mo57056a(str).mo57059b(str2).mo57061c(str3).mo57057a(map).mo57060b(map2).mo57055a(Long.valueOf(j)).mo57062c(map3), $$Lambda$b$SUz2UuNDmGLk_vFssmMY9oD8kIs.INSTANCE);
    }
}
