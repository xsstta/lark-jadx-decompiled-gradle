package com.ss.android.lark.calendar.impl.rustadapter.p1575c;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.CloseEventReminderCardRequest;
import com.bytedance.lark.pb.calendar.v1.GetAllCalendarsRequest;
import com.bytedance.lark.pb.calendar.v1.GetAllCalendarsResponse;
import com.bytedance.lark.pb.calendar.v1.GetBuildingsRequest;
import com.bytedance.lark.pb.calendar.v1.GetBuildingsResponse;
import com.bytedance.lark.pb.calendar.v1.GetCalendarSettingsRequest;
import com.bytedance.lark.pb.calendar.v1.GetCalendarSettingsResponse;
import com.bytedance.lark.pb.calendar.v1.GetCalendarsRequest;
import com.bytedance.lark.pb.calendar.v1.GetCalendarsResponse;
import com.bytedance.lark.pb.calendar.v1.GetChattersByCalendarIdsRequest;
import com.bytedance.lark.pb.calendar.v1.GetChattersByCalendarIdsResponse;
import com.bytedance.lark.pb.calendar.v1.GetInstancesRequest;
import com.bytedance.lark.pb.calendar.v1.GetInstancesResponse;
import com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingRequest;
import com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingResponse;
import com.bytedance.lark.pb.calendar.v1.GetRemoteUserPrimaryCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.GetRemoteUserPrimaryCalendarResponse;
import com.bytedance.lark.pb.calendar.v1.MGetServerInstancesRequest;
import com.bytedance.lark.pb.calendar.v1.MGetServerInstancesResponse;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsRequest;
import com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsResponse;
import com.bytedance.lark.pb.calendar.v1.PullGroupsAttendeesRequest;
import com.bytedance.lark.pb.calendar.v1.PullGroupsAttendeesResponse;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsRequest;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.SetCalendarSettingsRequest;
import com.bytedance.lark.pb.calendar.v1.SyncCalendarsAndEventsRequest;
import com.bytedance.lark.pb.calendar.v1.SyncCalendarsAndEventsResponse;
import com.bytedance.lark.pb.calendar.v1.UpdateCalendarVisibilityRequest;
import com.bytedance.lark.pb.calendar.v1.UpdateCalendarVisibilityResponse;
import com.bytedance.lark.pb.calendar.v1.WorkHourSetting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32609u;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstanceUnit;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SearchMeetingRoom;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.e */
public class C32583e implements AbstractC32595g {

    /* renamed from: a */
    private final String f83528a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.e$a */
    public static class C32593a {

        /* renamed from: a */
        public static final C32583e f83547a = new C32583e();
    }

    /* renamed from: a */
    public static C32583e m124816a() {
        return C32593a.f83547a;
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: a */
    public void mo119039a(List<String> list, IGetDataCallback<List<Calendar>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CALENDARS, new GetCalendarsRequest.C15672a().mo56751a(list), iGetDataCallback, new SdkSender.IParser<List<Calendar>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass14 */

            /* renamed from: a */
            public List<Calendar> parse(byte[] bArr) throws IOException {
                return C32514b.m124545a(GetCalendarsResponse.ADAPTER.decode(bArr).calendars);
            }
        });
    }

    private C32583e() {
        this.f83528a = "CalendarService";
    }

    /* renamed from: b */
    public void mo119040b() {
        SdkSender.asynSendRequestNonWrap(Command.SYNC_CALENDARS_AND_EVENTS, new SyncCalendarsAndEventsRequest.C16076a(), new IGetDataCallback<JSONObject>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325841 */

            /* renamed from: a */
            public void onSuccess(JSONObject jSONObject) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult != null) {
                    Log.m165383e("CalendarService", errorResult.toString());
                }
            }
        }, new SdkSender.IParser<JSONObject>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325929 */

            /* renamed from: a */
            public JSONObject parse(byte[] bArr) throws IOException {
                SyncCalendarsAndEventsResponse.ADAPTER.decode(bArr);
                return new JSONObject();
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: c */
    public CalendarSetting mo119043c() {
        return (CalendarSetting) SdkSender.syncSend(Command.GET_CALENDAR_SETTINGS, new GetCalendarSettingsRequest.C15668a(), new SdkSender.IParser<CalendarSetting>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass10 */

            /* renamed from: a */
            public CalendarSetting parse(byte[] bArr) throws IOException {
                return C32514b.m124525a(GetCalendarSettingsResponse.ADAPTER.decode(bArr).settings);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: a */
    public void mo119034a(IGetDataCallback<Map<String, Calendar>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_ALL_CALENDARS, new GetAllCalendarsRequest.C15632a(), iGetDataCallback, new SdkSender.IParser<Map<String, Calendar>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass18 */

            /* renamed from: a */
            public Map<String, Calendar> parse(byte[] bArr) throws IOException {
                Map<String, Calendar> a = C32514b.m124547a(GetAllCalendarsResponse.ADAPTER.decode(bArr).calendars);
                new JSONObject();
                return a;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: b */
    public void mo119041b(IGetDataCallback<Map<String, CalendarBuilding>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_BUILDINGS, new GetBuildingsRequest.C15648a(), iGetDataCallback, new SdkSender.IParser<Map<String, CalendarBuilding>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325874 */

            /* renamed from: a */
            public Map<String, CalendarBuilding> parse(byte[] bArr) throws IOException {
                return C32514b.m124552c(GetBuildingsResponse.ADAPTER.decode(bArr).buildings);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: c */
    public void mo119044c(IGetDataCallback<CalendarSetting> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CALENDAR_SETTINGS, new GetCalendarSettingsRequest.C15668a(), iGetDataCallback, new SdkSender.IParser<CalendarSetting>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325918 */

            /* renamed from: a */
            public CalendarSetting parse(byte[] bArr) throws IOException {
                return C32514b.m124525a(GetCalendarSettingsResponse.ADAPTER.decode(bArr).settings);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: d */
    public void mo119046d(IGetDataCallback<Calendar> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_REMOTE_USER_PRIMARY_CALENDAR, new GetRemoteUserPrimaryCalendarRequest.C15762a(), iGetDataCallback, new SdkSender.IParser<Calendar>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass13 */

            /* renamed from: a */
            public Calendar parse(byte[] bArr) throws IOException {
                return C32514b.m124510a(GetRemoteUserPrimaryCalendarResponse.ADAPTER.decode(bArr).calendar);
            }
        });
    }

    /* renamed from: a */
    public HashMap<String, CalendarWorkHourSetting> mo119030a(Map<String, WorkHourSetting> map) {
        if (map == null) {
            return null;
        }
        HashMap<String, CalendarWorkHourSetting> hashMap = new HashMap<>();
        for (Map.Entry<String, WorkHourSetting> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), C32514b.m124527a(entry.getValue()));
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: a */
    public void mo119035a(IGetDataCallback<CalendarSetting> iGetDataCallback, CalendarSetting calendarSetting) {
        SetCalendarSettingsRequest.C16040a aVar = new SetCalendarSettingsRequest.C16040a();
        aVar.mo57690a(C32514b.m124500a(calendarSetting));
        SdkSender.asynSendRequestNonWrap(Command.SET_CALENDAR_SETTINGS, aVar, iGetDataCallback, new SdkSender.IParser<CalendarSetting>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass11 */

            /* renamed from: a */
            public CalendarSetting parse(byte[] bArr) {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: d */
    public void mo119047d(List<String> list, IGetDataCallback<Map<String, CalendarEventAttendee>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PULL_ATTENDEES_IN_DEPARTMENTS, new PullAttendeesInDepartmentsRequest.C15916a().mo57373a(list), iGetDataCallback, new SdkSender.IParser<Map<String, CalendarEventAttendee>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass17 */

            /* renamed from: a */
            public Map<String, CalendarEventAttendee> parse(byte[] bArr) throws IOException {
                PullAttendeesInDepartmentsResponse decode = PullAttendeesInDepartmentsResponse.ADAPTER.decode(bArr);
                return C32514b.m124546a(decode.limit_exceeded_department_ids, decode.department_attendees);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: b */
    public void mo119042b(List<String> list, IGetDataCallback<Map<String, AbstractC30026d>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CHATTERS_BY_CALENDAR_IDS, new GetChattersByCalendarIdsRequest.C15684a().mo56780a(list), iGetDataCallback, new SdkSender.IParser<Map<String, AbstractC30026d>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass15 */

            /* renamed from: a */
            public Map<String, AbstractC30026d> parse(byte[] bArr) throws IOException {
                return C30022a.f74882a.chatModuleDependency().mo108221a(GetChattersByCalendarIdsResponse.ADAPTER.decode(bArr).chatters);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: c */
    public void mo119045c(List<String> list, IGetDataCallback<Map<String, CalendarEventAttendee>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PULL_GROUPS_ATTENDEES, new PullGroupsAttendeesRequest.C15938a().mo57441a(list), iGetDataCallback, new SdkSender.IParser<Map<String, CalendarEventAttendee>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass16 */

            /* renamed from: a */
            public Map<String, CalendarEventAttendee> parse(byte[] bArr) throws IOException {
                return C32514b.m124550b(PullGroupsAttendeesResponse.ADAPTER.decode(bArr).groups);
            }
        });
    }

    /* renamed from: a */
    public void mo119036a(C32609u uVar, IGetDataCallback iGetDataCallback) {
        CloseEventReminderCardRequest.C15574a aVar = new CloseEventReminderCardRequest.C15574a();
        aVar.mo56503a(uVar.mo120220a());
        aVar.mo56506b(uVar.mo120225b());
        aVar.mo56502a(Long.valueOf(uVar.mo120228c()));
        aVar.mo56505b(Long.valueOf(uVar.mo120229d()));
        aVar.mo56501a(Integer.valueOf(uVar.mo120230e()));
        SdkSender.asynSendRequestNonWrap(Command.CLOSE_EVENT_REMINDER_CARD, aVar, iGetDataCallback, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.AnonymousClass12 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) {
                return new Object();
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: a */
    public void mo119037a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CALENDAR_VISIBILITY, new UpdateCalendarVisibilityRequest.C16092a().mo57825a(str).mo57824a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325896 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return UpdateCalendarVisibilityResponse.ADAPTER.decode(bArr).success;
            }
        });
    }

    /* renamed from: a */
    public void mo119032a(long j, long j2, String str, IGetDataCallback<List<CalendarEventInstance>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_INSTANCES, new GetInstancesRequest.C15720a().mo56864a(Long.valueOf(j)).mo56867b(Long.valueOf(j2)).mo56863a((Boolean) true).mo56865a(str), iGetDataCallback, new SdkSender.IParser<List<CalendarEventInstance>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325852 */

            /* renamed from: a */
            public List<CalendarEventInstance> parse(byte[] bArr) throws IOException {
                List<CalendarEventInstance> b = C32514b.m124549b(GetInstancesResponse.ADAPTER.decode(bArr).instances);
                new JSONObject();
                return b;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: a */
    public void mo119038a(List<String> list, long j, long j2, String str, List<String> list2, IGetDataCallback<CalendarEventInstanceUnit> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_SERVER_INSTANCES, new MGetServerInstancesRequest.C15852a().mo57208a(list).mo57206a(Long.valueOf(j)).mo57210b(Long.valueOf(j2)).mo57207a(str).mo57211b(list2), iGetDataCallback, new SdkSender.IParser<CalendarEventInstanceUnit>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325863 */

            /* renamed from: a */
            public CalendarEventInstanceUnit parse(byte[] bArr) throws IOException {
                MGetServerInstancesResponse decode = MGetServerInstancesResponse.ADAPTER.decode(bArr);
                List<CalendarEventInstance> b = C32514b.m124549b(decode.instances);
                CalendarEventInstanceUnit calendarEventInstanceUnit = new CalendarEventInstanceUnit();
                calendarEventInstanceUnit.setMCalendarEventInstance(b);
                calendarEventInstanceUnit.setMPrivateCalendarIds(decode.private_calendar_ids);
                calendarEventInstanceUnit.setMCalendarTimezone(decode.calendar_id_timezone_map);
                calendarEventInstanceUnit.setMWorkHourSettings(C32583e.this.mo119030a(decode.work_hour_settings));
                return calendarEventInstanceUnit;
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: a */
    public void mo119033a(long j, long j2, List<String> list, String str, boolean z, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<Map<String, CalendarResource>> iGetDataCallback) {
        GetMeetingRoomsInBuildingRequest.C15736a a = new GetMeetingRoomsInBuildingRequest.C15736a().mo56905a(Long.valueOf(j)).mo56909b(Long.valueOf(j2)).mo56906a(str).mo56907a(list).mo56904a(Boolean.valueOf(z));
        if (meetingRoomFilter != null) {
            a = a.mo56903a(meetingRoomFilter);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_MEETING_ROOMS_IN_BUILDING, a, iGetDataCallback, new SdkSender.IParser<Map<String, CalendarResource>>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325885 */

            /* renamed from: a */
            public Map<String, CalendarResource> parse(byte[] bArr) throws IOException {
                return C32514b.m124554d(GetMeetingRoomsInBuildingResponse.ADAPTER.decode(bArr).resources);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g
    /* renamed from: a */
    public void mo119031a(long j, long j2, String str, int i, String str2, boolean z, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<SearchMeetingRoom> iGetDataCallback) {
        SearchMeetingRoomsRequest.C16028a a = new SearchMeetingRoomsRequest.C16028a().mo57659a(Long.valueOf(j)).mo57662b(Long.valueOf(j2)).mo57660a(str).mo57658a(Integer.valueOf(i)).mo57663b(str2).mo57657a(Boolean.valueOf(z));
        if (meetingRoomFilter != null) {
            a = a.mo57656a(meetingRoomFilter);
        }
        SdkSender.asynSendRequestNonWrap(Command.SEARCH_MEETING_ROOMS, a, iGetDataCallback, new SdkSender.IParser<SearchMeetingRoom>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e.C325907 */

            /* renamed from: a */
            public SearchMeetingRoom parse(byte[] bArr) throws IOException {
                SearchMeetingRoomsResponse decode = SearchMeetingRoomsResponse.ADAPTER.decode(bArr);
                SearchMeetingRoom searchMeetingRoom = new SearchMeetingRoom();
                searchMeetingRoom.setBuildings(C32514b.m124543a(decode));
                searchMeetingRoom.setHasMore(decode.has_more.booleanValue());
                return searchMeetingRoom;
            }
        });
    }
}
