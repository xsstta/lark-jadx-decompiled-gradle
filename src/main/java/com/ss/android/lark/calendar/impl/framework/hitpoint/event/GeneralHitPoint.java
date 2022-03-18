package com.ss.android.lark.calendar.impl.framework.hitpoint.event;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.SubViewType;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.b.c */
public final class GeneralHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final GeneralHitPoint f83331a = new GeneralHitPoint();

    /* renamed from: b */
    public static final String m124228b(boolean z) {
        return z ? "yes" : "no";
    }

    /* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.b.c$a */
    public static final class EventCountInfo {

        /* renamed from: a */
        private int f83332a = -1;

        /* renamed from: b */
        private int f83333b = -1;

        /* renamed from: c */
        private int f83334c = -1;

        /* renamed from: d */
        private int f83335d = -1;

        /* renamed from: a */
        public final int mo118730a() {
            return this.f83332a;
        }

        /* renamed from: b */
        public final int mo118732b() {
            return this.f83333b;
        }

        /* renamed from: c */
        public final int mo118734c() {
            return this.f83334c;
        }

        /* renamed from: d */
        public final int mo118736d() {
            return this.f83335d;
        }

        /* renamed from: e */
        public final void mo118738e() {
            this.f83332a = 0;
            this.f83333b = 0;
            this.f83334c = 0;
            this.f83335d = 0;
        }

        /* renamed from: a */
        public final void mo118731a(int i) {
            this.f83332a = i;
        }

        /* renamed from: b */
        public final void mo118733b(int i) {
            this.f83333b = i;
        }

        /* renamed from: c */
        public final void mo118735c(int i) {
            this.f83334c = i;
        }

        /* renamed from: d */
        public final void mo118737d(int i) {
            this.f83335d = i;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.b.c$b */
    public static final class C32497b implements IGetDataCallback<List<? extends Calendar>> {
        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        C32497b() {
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            ArrayList arrayList;
            String str;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    if (t.isVisible()) {
                        arrayList2.add(t);
                    }
                }
                ArrayList<Calendar> arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                for (Calendar calendar : arrayList3) {
                    arrayList4.add(calendar.getServerId());
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            if (C30022a.f74884c.mo108456c().getSkinType() == CalendarSkinColorTool.SkinType.LIGHT) {
                str = "light";
            } else {
                str = "dark";
            }
            JSONObject put = new JSONObject().put("view_type", HitPointUtil.m124314b(ParamStoreData.f83351a.mo118741a())).put("theme_type", str).put("multi_tz_number", 0);
            if (CollectionUtils.isNotEmpty(arrayList)) {
                put.put("calendar_id", arrayList);
            } else {
                put.put("calendar_id", "no_value");
            }
            GeneralHitPoint cVar = GeneralHitPoint.f83331a;
            Intrinsics.checkExpressionValueIsNotNull(put, "params");
            cVar.mo118725a("cal_tab", put);
        }
    }

    private GeneralHitPoint() {
    }

    /* renamed from: a */
    public static final void m124209a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(str2, "navigationType");
        Intrinsics.checkParameterIsNotNull(str3, "viewType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str).put("navigation_type", str2).put("view_type", str3);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…aram.VIEW_TYPE, viewType)");
        cVar.mo118725a("cal_navigation", put);
    }

    /* renamed from: a */
    public static final void m124204a(String str, String str2, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(str2, "cardMessageType");
        if (calendarEvent != null) {
            String b = HitPointUtil.m124314b(calendarEvent.getServerId());
            String a = HitPointUtil.m124312a(Boolean.valueOf(calendarEvent.isCrossTenant()));
            GeneralHitPoint cVar = f83331a;
            JSONObject put = new JSONObject().put("action_source", str).put("card_message_type", str2).put("event_type", m124226b(calendarEvent)).put("view_type", ParamStoreData.f83351a.mo118741a()).put("event_id", b).put("is_cross_tenant", a);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…SS_TENANT, isCrossTenant)");
            cVar.mo118725a("cal_open_event_detail", put);
        }
    }

    /* renamed from: a */
    public static final void m124190a(CalendarEventAttendee.Status status, String str) {
        String str2;
        if (status != null) {
            int i = C32498d.f83336a[status.ordinal()];
            if (i == 1) {
                str2 = "decl";
            } else if (i == 2) {
                str2 = "mayb";
            } else if (i == 3) {
                str2 = "acpt";
            }
            GeneralHitPoint cVar = f83331a;
            JSONObject put = new JSONObject().put("cal_event_resp", str2).put("event_id", str);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …lParam.EVENT_ID, eventId)");
            cVar.mo118725a("cal_bot", put);
        }
        str2 = "";
        GeneralHitPoint cVar2 = f83331a;
        JSONObject put2 = new JSONObject().put("cal_event_resp", str2).put("event_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject()\n           …lParam.EVENT_ID, eventId)");
        cVar2.mo118725a("cal_bot", put2);
    }

    /* renamed from: a */
    public static final void m124185a(CalendarEvent calendarEvent) {
        String str;
        if (calendarEvent == null || (str = calendarEvent.getServerId()) == null) {
            str = "";
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("event_type", m124226b(calendarEvent)).put("view_type", ParamStoreData.f83351a.mo118741a()).put("is_cross_tenant", m124233c(calendarEvent)).put("event_id", str).put("event_type", m124226b(calendarEvent));
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …YPE, getEventType(event))");
        cVar.mo118725a("cal_fulladd", put);
    }

    /* renamed from: a */
    public static final void m124205a(String str, String str2, CalendarEvent calendarEvent, int i) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(str2, "cardMessageType");
        String str3 = i != 2 ? i != 3 ? "initial" : "out_of_date" : "update";
        String b = HitPointUtil.m124314b(calendarEvent != null ? calendarEvent.getServerId() : null);
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str).put("card_message_type", str2).put("event_type", m124226b(calendarEvent)).put("view_type", ParamStoreData.f83351a.mo118741a()).put("bot_card_type", str3).put("is_cross_tenant", m124233c(calendarEvent)).put("event_id", b);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …lParam.EVENT_ID, eventId)");
        cVar.mo118725a("cal_open_event_detail", put);
    }

    /* renamed from: a */
    public static final void m124198a(String str, CalendarEventAttendee.Status status, String str2, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(status, "replyStatus");
        Intrinsics.checkParameterIsNotNull(str2, "cardMessageType");
        if (calendarEvent != null) {
            String b = HitPointUtil.m124314b(calendarEvent.getServerId());
            int i = C32498d.f83337b[status.ordinal()];
            f83331a.m124211a(str, b, i != 1 ? i != 2 ? i != 3 ? "no_value" : "mayb" : "decl" : "acpt", str2, m124226b(calendarEvent), Boolean.valueOf(calendarEvent.isCrossTenant()), m124238d(calendarEvent));
        }
    }

    /* renamed from: a */
    public static final void m124199a(String str, CalendarEventAttendee.Status status, String str2, String str3, boolean z, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(status, "replyStatus");
        Intrinsics.checkParameterIsNotNull(str2, "cardMessageType");
        int i5 = C32498d.f83338c[status.ordinal()];
        String str4 = i5 != 1 ? i5 != 2 ? i5 != 3 ? "no_value" : "mayb" : "decl" : "acpt";
        String b = HitPointUtil.m124314b(str3);
        EventCountInfo aVar = new EventCountInfo();
        aVar.mo118731a(i);
        aVar.mo118733b(i2);
        aVar.mo118735c(i4);
        aVar.mo118737d(i3);
        f83331a.m124211a(str, b, str4, str2, "event", Boolean.valueOf(z), aVar);
    }

    /* renamed from: a */
    private final void m124211a(String str, String str2, String str3, String str4, String str5, Boolean bool, EventCountInfo aVar) {
        JSONObject put = new JSONObject().put("action_source", str).put("cal_event_resp", str3).put("card_message_type", str4).put("mtgroom_count", aVar.mo118730a()).put("third_party_attendee_count", aVar.mo118732b()).put("group_count", aVar.mo118734c()).put("user_count", aVar.mo118736d()).put("event_type", str5).put("view_type", ParamStoreData.f83351a.mo118741a()).put("event_id", str2).put("is_cross_tenant", HitPointUtil.m124312a(bool));
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …ooleanStr(isCrossTenant))");
        mo118725a("cal_reply_event", put);
    }

    /* renamed from: a */
    public static /* synthetic */ void m124207a(String str, String str2, CalendarEvent calendarEvent, Calendar.Type type, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            type = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        m124206a(str, str2, calendarEvent, type, str3);
    }

    /* renamed from: a */
    public static final void m124206a(String str, String str2, CalendarEvent calendarEvent, Calendar.Type type, String str3) {
        EventCountInfo aVar;
        String str4;
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(str2, "editType");
        if (!Intrinsics.areEqual(str2, "edit") || calendarEvent == null) {
            aVar = new EventCountInfo();
        } else {
            aVar = m124238d(calendarEvent);
        }
        String z = m124283z(str);
        if (type != null) {
            int i = C32498d.f83339d[type.ordinal()];
            if (i == 1) {
                str4 = "contacts";
            } else if (i == 2) {
                str4 = "public_cal";
            } else if (i == 3) {
                str4 = "google";
            } else if (i == 4) {
                str4 = "exchange";
            }
            GeneralHitPoint cVar = f83331a;
            JSONObject put = new JSONObject().put("action_source", str).put("edit_type", str2).put("mtgroom_count", aVar.mo118730a()).put("third_party_attendee_count", aVar.mo118732b()).put("group_count", aVar.mo118734c()).put("user_count", aVar.mo118736d()).put("time_conflict", z).put("calendar_type", str4).put("resource_id", str3);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           ….RESOURCE_ID, resourceId)");
            cVar.mo118725a("cal_full_edit_event", put);
        }
        str4 = "";
        GeneralHitPoint cVar2 = f83331a;
        JSONObject put2 = new JSONObject().put("action_source", str).put("edit_type", str2).put("mtgroom_count", aVar.mo118730a()).put("third_party_attendee_count", aVar.mo118732b()).put("group_count", aVar.mo118734c()).put("user_count", aVar.mo118736d()).put("time_conflict", z).put("calendar_type", str4).put("resource_id", str3);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject()\n           ….RESOURCE_ID, resourceId)");
        cVar2.mo118725a("cal_full_edit_event", put2);
    }

    /* renamed from: a */
    public static final void m124208a(String str, String str2, CalendarEvent calendarEvent, String str3) {
        String str4;
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(str2, "eventType");
        EventCountInfo d = m124238d(calendarEvent);
        String str5 = (calendarEvent == null || !calendarEvent.isCrossTenant()) ? "no" : "yes";
        if (calendarEvent == null || (str4 = calendarEvent.getServerId()) == null) {
            str4 = "";
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str).put("event_type", str2).put("mtgroom_count", d.mo118730a()).put("third_party_attendee_count", d.mo118732b()).put("group_count", d.mo118734c()).put("user_count", d.mo118736d()).put("view_type", ParamStoreData.f83351a.mo118741a()).put("is_cross_tenant", str5).put("event_id", str4);
        if (str3 == null) {
            str3 = "";
        }
        JSONObject put2 = put.put("chat_id", str3).put("is_cross_tenant", m124233c(calendarEvent));
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject().put(General…                  event))");
        cVar.mo118725a("cal_enter_meeting", put2);
    }

    /* renamed from: a */
    public static final void m124216a(String str, boolean z, CalendarEvent.Type type, CalendarEvent.Source source, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(type, "eventType");
        Intrinsics.checkParameterIsNotNull(source, "eventSource");
        String str2 = z2 ? "join" : "open";
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str).put("is_cross_tenant", m124228b(z)).put("event_type", m124177a(type, source)).put("action_target_status", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…TARGET_STATUS, actionStr)");
        cVar.mo118725a("cal_open_video_mtg", put);
    }

    /* renamed from: a */
    public static final void m124215a(String str, boolean z, CalendarEvent.Type type, CalendarEvent.Source source) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(type, "eventType");
        Intrinsics.checkParameterIsNotNull(source, "eventSource");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str).put("is_cross_tenant", m124228b(z)).put("event_type", m124177a(type, source));
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General… eventType, eventSource))");
        cVar.mo118725a("cal_video_link_mtg", put);
    }

    /* renamed from: a */
    public static final void m124188a(CalendarEvent calendarEvent, String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Boolean bool = null;
        String b = HitPointUtil.m124314b(calendarEvent != null ? calendarEvent.getServerId() : null);
        String str3 = z ? "open" : "new";
        if (calendarEvent != null) {
            bool = Boolean.valueOf(calendarEvent.isCrossTenant());
        }
        String a = HitPointUtil.m124312a(bool);
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("event_type", m124226b(calendarEvent)).put("action_source", str).put("event_id", b).put("file_id", HitPointUtil.m124313a(str2)).put("edit_type", str3).put("is_cross_tenant", a);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …SS_TENANT, isCrossTenant)");
        cVar.mo118725a("cal_edit_event_doc", put);
    }

    /* renamed from: a */
    public static final void m124221a(boolean z, Calendar.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "calType");
        String str = z ? "on" : "off";
        int i = C32498d.f83340e[type.ordinal()];
        String str2 = i != 1 ? i != 2 ? "contacts" : "mtgrooms" : "public_cal";
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_target_status", str).put("calendar_type", str2).put("action_source", "calendars_list_side_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…CALENDARS_LIST_SIDE_VIEW)");
        cVar.mo118725a("cal_toggle_calendar_visibility", put);
    }

    /* renamed from: a */
    public static final void m124218a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        String str;
        if (CollectionUtils.isNotEmpty(arrayList)) {
            str = "work_time_and_event_conflict";
        } else if (CollectionUtils.isNotEmpty(arrayList2)) {
            str = "work_time";
        } else {
            str = CollectionUtils.isNotEmpty(arrayList3) ? "event_conflict" : "no_conflict";
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", "free_busy_viewer").put("time_conflict", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…E_CONFLICT, timeConflict)");
        cVar.mo118725a("cal_time_change", put);
    }

    /* renamed from: a */
    public static final void m124191a(CalendarMember.CalendarMemberType calendarMemberType, String str) {
        Intrinsics.checkParameterIsNotNull(calendarMemberType, "calendarMemberType");
        Intrinsics.checkParameterIsNotNull(str, "memberPermission");
        String str2 = C32498d.f83341f[calendarMemberType.ordinal()] != 1 ? "individual" : "group";
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("member_type", str2).put("cal_member_permission", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ISSION, memberPermission)");
        cVar.mo118725a("cal_cal_edit_member_permission", put);
    }

    /* renamed from: a */
    public static final void m124217a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (CollectionUtils.isNotEmpty(arrayList)) {
            GeneralHitPoint cVar = f83331a;
            JSONObject put = new JSONObject().put("member_type", "individual").put("cal_member_permission", "reader");
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…     GeneralValue.READER)");
            cVar.mo118725a("cal_cal_add_member", put);
        }
        if (CollectionUtils.isNotEmpty(arrayList2)) {
            GeneralHitPoint cVar2 = f83331a;
            JSONObject put2 = new JSONObject().put("member_type", "group").put("cal_member_permission", "reader");
            Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject().put(General…     GeneralValue.READER)");
            cVar2.mo118725a("cal_cal_add_member", put2);
        }
    }

    /* renamed from: a */
    public static final void m124196a(String str, Calendar.Type type) {
        Intrinsics.checkParameterIsNotNull(str, "editType");
        Intrinsics.checkParameterIsNotNull(type, "calendarDataType");
        int i = C32498d.f83342g[type.ordinal()];
        String str2 = i != 1 ? i != 2 ? "public_cal" : "mtgrooms" : "contacts";
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("edit_type", str).put("action_source", "calendars_list_side_view").put("calendar_type", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ENDAR_TYPE, calendarType)");
        cVar.mo118725a("cal_go_edit_calendar", put);
    }

    /* renamed from: a */
    public static final void m124192a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionTargetStatus");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_target_status", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ATUS, actionTargetStatus)");
        cVar.mo118725a("cal_change_freebusy_location", put);
    }

    /* renamed from: a */
    public static final void m124189a(CalendarEvent calendarEvent, boolean z) {
        String str;
        if (calendarEvent != null) {
            CalendarEvent.Type type = calendarEvent.getType();
            str = (type != null && C32498d.f83343h[type.ordinal()] == 1) ? "meeting" : "event";
        } else {
            str = "no_value";
        }
        String b = HitPointUtil.m124314b(calendarEvent != null ? calendarEvent.getServerId() : null);
        String str2 = z ? "subscribe_calendar" : "user_calendar";
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("event_type", str).put("calendar_type", str2).put("view_type", ParamStoreData.f83351a.mo118741a()).put("event_id", b).put("is_cross_tenant", m124233c(calendarEvent));
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ventIsCrossTenant(event))");
        cVar.mo118725a("cal_transfer_event", put);
    }

    /* renamed from: a */
    public static final void m124187a(CalendarEvent calendarEvent, String str, String str2, CalendarEvent.Span span) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(str, "notifyType");
        Intrinsics.checkParameterIsNotNull(str2, "actionSource");
        Intrinsics.checkParameterIsNotNull(span, "eventSpan");
        if (calendarEvent.getType() == CalendarEvent.Type.MEETING) {
            m124210a("meeting", str, str2, calendarEvent, span);
        } else {
            m124210a("event", str, str2, calendarEvent, span);
        }
    }

    /* renamed from: a */
    public static final void m124210a(String str, String str2, String str3, CalendarEvent calendarEvent, CalendarEvent.Span span) {
        Intrinsics.checkParameterIsNotNull(str, "eventType");
        Intrinsics.checkParameterIsNotNull(str2, "notifyType");
        Intrinsics.checkParameterIsNotNull(str3, "actionSource");
        Intrinsics.checkParameterIsNotNull(span, "eventSpan");
        if (calendarEvent != null) {
            String a = HitPointUtil.m124312a(Boolean.valueOf(calendarEvent.isCrossTenant()));
            EventCountInfo d = m124238d(calendarEvent);
            GeneralHitPoint cVar = f83331a;
            JSONObject put = new JSONObject().put("action_source", str3).put("edit_type", "edit").put("event_type", str).put("notify_event_changes", str2).put("view_type", ParamStoreData.f83351a.mo118741a()).put("event_id", HitPointUtil.m124314b(calendarEvent.getServerId())).put("delete_type", cVar.m124176a(span)).put("is_cross_tenant", a).put("mtgroom_count", d.mo118730a()).put("group_count", d.mo118734c()).put("user_count", d.mo118736d()).put("third_party_attendee_count", d.mo118732b());
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General….thirdPartyAttendeeCount)");
            cVar.mo118725a("cal_delete_event", put);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m124203a(String str, String str2, CalendarEvent.NotificationType notificationType, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, String str3, String str4, List list, int i, Object obj) {
        m124202a(str, str2, notificationType, calendarEvent, calendarEvent2, str3, str4, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? null : list);
    }

    /* renamed from: a */
    public static final void m124202a(String str, String str2, CalendarEvent.NotificationType notificationType, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, String str3, String str4, List<String> list) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(str2, "editType");
        Intrinsics.checkParameterIsNotNull(notificationType, "notificationType");
        Intrinsics.checkParameterIsNotNull(str3, "chatType");
        if (calendarEvent != null) {
            String b = HitPointUtil.m124314b(calendarEvent.getServerId());
            EventCountInfo d = m124238d(calendarEvent);
            String b2 = m124226b(calendarEvent);
            String a = m124175a(notificationType);
            String z = m124283z(str);
            GeneralHitPoint cVar = f83331a;
            String K = cVar.m124173K(str3);
            JSONObject put = new JSONObject().put("event_type", b2).put("action_source", str).put("mtgroom_count", d.mo118730a()).put("third_party_attendee_count", d.mo118732b()).put("group_count", d.mo118734c()).put("user_count", d.mo118736d()).put("notify_event_changes", a).put("edit_type", str2).put("time_conflict", z).put("view_type", HitPointUtil.m124314b(ParamStoreData.f83351a.mo118741a())).put("modified_emailguest", cVar.m124227b(calendarEvent, calendarEvent2)).put("event_id", b).put("chat_type", K).put("chat_id", HitPointUtil.m124314b(str4)).put("is_cross_tenant", HitPointUtil.m124312a(Boolean.valueOf(calendarEvent.isCrossTenant()))).put("role", cVar.m124178a(calendarEvent2, calendarEvent));
            HitPointUtil eVar = HitPointUtil.f83349a;
            DoVideoMeeting videoMeeting = calendarEvent.getVideoMeeting();
            JSONObject put2 = put.put("vc_type", eVar.mo118740a(videoMeeting != null ? videoMeeting.getMeetingType() : null));
            if (list != null) {
                put2.put("resource_id", list);
            }
            Intrinsics.checkExpressionValueIsNotNull(put2, "saveParam");
            cVar.mo118725a("cal_save_event", put2);
        }
    }

    /* renamed from: a */
    public static final void m124197a(String str, CalendarEvent calendarEvent, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        if (calendarEvent != null) {
            String b = m124226b(calendarEvent);
            String b2 = HitPointUtil.m124314b(calendarEvent.getServerId());
            String b3 = HitPointUtil.m124314b(str2);
            String a = HitPointUtil.m124312a(Boolean.valueOf(calendarEvent.isCrossTenant()));
            GeneralHitPoint cVar = f83331a;
            JSONObject put = new JSONObject().put("action_source", str).put("event_type", b).put("event_id", b2).put("chat_id", b3).put("is_cross_tenant", a);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…SS_TENANT, isCrossTenant)");
            cVar.mo118725a("cal_join_event", put);
        }
    }

    /* renamed from: a */
    public static final void m124186a(CalendarEvent calendarEvent, ShareType shareType, String str) {
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        if (calendarEvent != null) {
            EventCountInfo d = m124238d(calendarEvent);
            String b = HitPointUtil.m124314b(m124226b(calendarEvent));
            String a = HitPointUtil.m124312a(Boolean.valueOf(calendarEvent.isCrossTenant()));
            String b2 = HitPointUtil.m124314b(ParamStoreData.f83351a.mo118741a());
            String b3 = HitPointUtil.m124314b(calendarEvent.getServerId());
            GeneralHitPoint cVar = f83331a;
            JSONObject put = new JSONObject().put("action_source", "event_detail").put("action_type", cVar.m124225b(shareType)).put("event_type", b).put("mtgroom_count", d.mo118730a()).put("third_party_attendee_count", d.mo118732b()).put("group_count", d.mo118734c()).put("user_count", d.mo118736d()).put("view_type", b2).put("event_id", b3).put("chat_id", HitPointUtil.m124314b(str)).put("is_cross_tenant", a);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…SS_TENANT, isCrossTenant)");
            cVar.mo118725a("cal_share_event", put);
        }
    }

    /* renamed from: a */
    public static final void m124184a(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", cVar.m124225b(shareType));
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…              shareType))");
        cVar.mo118725a("cal_share_image", put);
    }

    /* renamed from: a */
    public static final void m124220a(boolean z) {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("calendar_type", z ? "lunar" : "none");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…R else GeneralValue.NONE)");
        cVar.mo118725a("cal_settings_secondary_calendar", put);
    }

    /* renamed from: a */
    public static final void m124219a(List<CalendarMember> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "members");
        Intrinsics.checkParameterIsNotNull(str, "managerType");
        int i = 0;
        int i2 = 0;
        for (CalendarMember calendarMember : list) {
            if (calendarMember.getMemberType() == CalendarMember.CalendarMemberType.INDIVIDUAL) {
                i2++;
            } else {
                i++;
            }
        }
        String str2 = Intrinsics.areEqual(str, "new_calendar_type") ? "new" : "edit";
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", "full_calendar_editor").put("group_count", i).put("user_count", i2).put("edit_type", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…                editType)");
        cVar.mo118725a("cal_save_calendar", put);
    }

    /* renamed from: a */
    public static final void m124200a(String str, String str2) {
        String b = HitPointUtil.m124314b(str);
        String b2 = HitPointUtil.m124314b(str2);
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("calendar_id", b).put("to_user_id", b2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …ram.TO_USER_ID, toUserId)");
        cVar.mo118725a("cal_profile", put);
    }

    /* renamed from: a */
    public static final void m124195a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        String a = HitPointUtil.m124312a(Boolean.valueOf(j > 0));
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", str).put("entry_action", "no_value").put("search_result", a);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject()\n           …_RESULT, hasSearchResult)");
        cVar.mo118725a("cal_search_advanced", put);
    }

    /* renamed from: a */
    public final void mo118725a(String str, JSONObject jSONObject) {
        try {
            C30022a.f74882a.statisticsDependency().mo108186a(str, jSONObject);
            Log.m165379d("GeneralHitPoint", "eventKey:" + str + " param:" + jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static final void m124213a(String str, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "eventKey");
        Intrinsics.checkParameterIsNotNull(map, "param");
        try {
            f83331a.mo118725a(str, new JSONObject(map));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m124183a(EventDetailSource eventDetailSource) {
        Intrinsics.checkParameterIsNotNull(eventDetailSource, "eventSource");
        String str = "notification_card";
        switch (C32498d.f83348m[eventDetailSource.ordinal()]) {
            case 1:
                str = "chat_side_bar";
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "card_message";
                break;
            default:
                str = "instance_block";
                break;
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ION_SOURCE, actionSource)");
        cVar.mo118725a("cal_vc_settings", put);
    }

    /* renamed from: a */
    public static final void m124214a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        String str2 = z ? "edit" : "new";
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str).put("edit_type", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…aram.EDIT_TYPE, editType)");
        cVar.mo118725a("cal_filter", put);
    }

    /* renamed from: a */
    public static final void m124212a(String str, List<EquipmentData> list, int i) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(list, "selectEquipments");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_source", str).put("small_target_value", i);
        for (T t : list) {
            jSONObject.put(t.mo116062c(), t.mo116063d() ? "yes" : "no");
        }
        f83331a.mo118725a("cal_filter_save", jSONObject);
    }

    /* renamed from: a */
    public final void mo118723a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "mtRoomName");
        Intrinsics.checkParameterIsNotNull(str2, "mtRoomId");
        Intrinsics.checkParameterIsNotNull(str3, "userType");
        Intrinsics.checkParameterIsNotNull(str4, "curEventType");
        Intrinsics.checkParameterIsNotNull(str5, "nextEventType");
        JSONObject put = new JSONObject().put("mtgroom_name", str).put("user_type", str3).put("current_event_type", str4).put("next_event_type", str5).put("resource_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        mo118725a("cal_code_scan", put);
    }

    /* renamed from: a */
    public final void mo118724a(String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "mtRoomName");
        Intrinsics.checkParameterIsNotNull(str2, "mtRoomId");
        Intrinsics.checkParameterIsNotNull(str3, "actionSource");
        Intrinsics.checkParameterIsNotNull(str4, "userType");
        JSONObject put = new JSONObject().put("mtgroom_name", str).put("user_type", str4).put("action_source", str3).put("is_event_ongonging", z ? "yes" : "no").put("resource_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        mo118725a("cal_code_checkin", put);
    }

    /* renamed from: a */
    public final void mo118722a(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "mtRoomName");
        Intrinsics.checkParameterIsNotNull(str2, "mtRoomId");
        Intrinsics.checkParameterIsNotNull(str3, "userType");
        Intrinsics.checkParameterIsNotNull(str4, "curEventType");
        JSONObject put = new JSONObject().put("mtgroom_name", str).put("user_type", str3).put("current_event_type", str4).put("resource_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        mo118725a("cal_code_create_event", put);
    }

    /* renamed from: a */
    public static final void m124193a(String str, int i) {
        JSONObject put = new JSONObject().put("time", i).put("event_id", HitPointUtil.m124314b(str));
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        cVar.mo118725a("cal_inapp_notification_view", put);
    }

    /* renamed from: a */
    public static final void m124194a(String str, int i, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str2, "notiType");
        Intrinsics.checkParameterIsNotNull(str3, "clickPos");
        JSONObject put = new JSONObject().put("time", i).put("event_id", HitPointUtil.m124314b(str)).put("noti_type", str2).put("click_position", str3);
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        cVar.mo118725a("cal_inapp_notification_click", put);
    }

    /* renamed from: a */
    public static final void m124223a(boolean z, String str, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "clickTarget");
        String str2 = "none";
        JSONObject put = new JSONObject().put("click", str).put("target", str2);
        if (Intrinsics.areEqual(str, "send")) {
            if (z) {
                str2 = HitPointUtil.m124312a(Boolean.valueOf(z2));
            }
            put.put("is_share", str2);
        }
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        cVar.mo118725a("cal_event_create_confirm_click", put);
    }

    /* renamed from: a */
    public static final void m124224a(boolean z, boolean z2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        JSONObject put = new JSONObject().put("subscribed", String.valueOf(z)).put("is_private", String.valueOf(z2)).put("is_external_open", "false").put("calendar_id", str);
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        cVar.mo118725a("cal_calendar_detail_view", put);
    }

    /* renamed from: a */
    public static final void m124222a(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        JSONObject put = new JSONObject().put("click", z ? "sub_cal" : "enter_cal_view").put("calendar_id", str).put("target", "none");
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        cVar.mo118725a("cal_calendar_detail_click", put);
    }

    /* renamed from: c */
    public static final void m124234c() {
        f83331a.m124174L("cal_settings_copy_work_time");
    }

    /* renamed from: d */
    public static final void m124239d() {
        f83331a.m124174L("cal_settings_change_device_timezone");
    }

    /* renamed from: f */
    public static final void m124245f() {
        f83331a.m124174L("cal_detail_copy");
    }

    /* renamed from: g */
    public static final void m124247g() {
        f83331a.m124174L("cal_reclaim");
    }

    /* renamed from: h */
    public static final void m124249h() {
        f83331a.m124174L("cal_reclaim_now");
    }

    /* renamed from: p */
    public static final void m124265p() {
        f83331a.m124174L("cal_timezone_search");
    }

    /* renamed from: q */
    public static final void m124267q() {
        f83331a.m124174L("cal_timezone_tips");
    }

    /* renamed from: r */
    public static final void m124269r() {
        f83331a.m124174L("cal_localtime_guests");
    }

    /* renamed from: s */
    public static final void m124271s() {
        f83331a.m124174L("cal_full_event_editor_new");
    }

    /* renamed from: t */
    public static final void m124273t() {
        f83331a.m124174L("cal_profile_block");
    }

    /* renamed from: A */
    public static final void m124168A() {
        f83331a.mo118725a("cal_event_create_confirm_view", new JSONObject());
    }

    /* renamed from: B */
    public static final void m124169B() {
        f83331a.mo118725a("cal_resource_main_view", new JSONObject());
    }

    /* renamed from: C */
    public static final void m124170C() {
        f83331a.mo118725a("cal_top_sidebar_view", new JSONObject());
    }

    /* renamed from: b */
    public static final void m124229b() {
        C30076a.m111290a().mo108423a(new C32497b());
    }

    /* renamed from: z */
    public static final void m124284z() {
        f83331a.mo118725a("cal_calendar_feel_good_view", new JSONObject());
    }

    /* renamed from: w */
    public final void mo118728w() {
        mo118725a("cal_tripartite_manage_view", new JSONObject());
    }

    /* renamed from: e */
    public static final void m124242e() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", "full_calendar_editor");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…lue.FULL_CALENDAR_EDITOR)");
        cVar.mo118725a("cal_delete_calendar", put);
    }

    /* renamed from: i */
    public static final void m124251i() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", "full_event_editor");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…lValue.FULL_EVENT_EDITOR)");
        cVar.mo118725a("cal_delete_calendar", put);
    }

    /* renamed from: j */
    public static final void m124253j() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", "icon");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…_TYPE, GeneralValue.ICON)");
        cVar.mo118725a("cal_findtime_open_member", put);
    }

    /* renamed from: k */
    public static final void m124255k() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", "plus");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…_TYPE, GeneralValue.PLUS)");
        cVar.mo118725a("cal_findtime_open_member", put);
    }

    /* renamed from: l */
    public static final void m124257l() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("source_type", "chat_banner");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…GeneralValue.CHAT_BANNER)");
        cVar.mo118725a("cal_transform", put);
    }

    /* renamed from: m */
    public static final void m124259m() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("source_type", "delete_event");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…eneralValue.DELETE_EVENT)");
        cVar.mo118725a("cal_transform", put);
    }

    /* renamed from: n */
    public static final void m124261n() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", "yes");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…N_TYPE, GeneralValue.YES)");
        cVar.mo118725a("cal_transform_popup", put);
    }

    /* renamed from: o */
    public static final void m124263o() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", "no");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ON_TYPE, GeneralValue.NO)");
        cVar.mo118725a("cal_transform_popup", put);
    }

    /* renamed from: u */
    public static final void m124275u() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", "invite");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…YPE, GeneralValue.INVATE)");
        cVar.mo118725a("cal_email_guest", put);
    }

    /* renamed from: v */
    public static final void m124277v() {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", "enter");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…TYPE, GeneralValue.ENTER)");
        cVar.mo118725a("cal_email_guest", put);
    }

    /* renamed from: y */
    public static final void m124281y() {
        JSONObject put = new JSONObject().put("action_source", "full_event_editor");
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        cVar.mo118725a("cal_vc_type_set", put);
    }

    /* renamed from: x */
    public final void mo118729x() {
        JSONObject put = new JSONObject().put("tripartite_add", "cal_tripartite_add_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        mo118725a("cal_tripartite_manage_click", put);
    }

    /* renamed from: c */
    public static final String m124233c(CalendarEvent calendarEvent) {
        if (calendarEvent == null) {
            return "";
        }
        return m124228b(calendarEvent.isCrossTenant());
    }

    /* renamed from: F */
    public static final void m124171F(String str) {
        JSONObject put = new JSONObject().put("resource_id", HitPointUtil.m124314b(str));
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "params");
        cVar.mo118725a("cal_resource_book_view", put);
    }

    /* renamed from: a */
    private final String m124176a(CalendarEvent.Span span) {
        int i = C32498d.f83344i[span.ordinal()];
        if (i == 1) {
            return "delete_future";
        }
        if (i != 2) {
            return "delete_today";
        }
        return "delete_all";
    }

    /* renamed from: b */
    public static final void m124230b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "elementType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("element_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…LEMENT_TYPE, elementType)");
        cVar.mo118725a("cal_more", put);
    }

    /* renamed from: c */
    public static final void m124235c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ION_SOURCE, actionSource)");
        cVar.mo118725a("cal_show_attendee_list", put);
    }

    /* renamed from: d */
    public static final void m124241d(boolean z) {
        String str;
        if (z) {
            str = "single";
        } else {
            str = "group";
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("chat_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(GeneralParam.CHAT_TYPE, chatType)");
        cVar.mo118725a("cal_findtime_block", put);
    }

    /* renamed from: f */
    public static final void m124246f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionTargetStatus");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_target_status", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ATUS, actionTargetStatus)");
        cVar.mo118725a("cal_settings_local_calendar", put);
    }

    /* renamed from: h */
    public static final void m124250h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "targetValue");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("target_value", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ARGET_VALUE, targetValue)");
        cVar.mo118725a("cal_settings_nallday_notification", put);
    }

    /* renamed from: p */
    public static final void m124266p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarPermission");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("calendar_permission", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…SION, calendarPermission)");
        cVar.mo118725a("cal_cal_permission_change", put);
    }

    /* renamed from: q */
    public static final void m124268q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pageType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("page_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(GeneralParam.PAGE_TYPE, pageType)");
        cVar.mo118725a("cal_reclaim_enter", put);
    }

    /* renamed from: r */
    public static final void m124270r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ION_SOURCE, actionSource)");
        cVar.mo118725a("cal_rsvp_rply", put);
    }

    /* renamed from: s */
    public static final void m124272s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ION_SOURCE, actionSource)");
        cVar.mo118725a("cal_search_result", put);
    }

    /* renamed from: w */
    public static final void m124279w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…CTION_SOURCE, sourceType)");
        cVar.mo118725a("cal_add_account", put);
    }

    /* renamed from: x */
    public static final void m124280x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionValue");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…TION_SOURCE, actionValue)");
        cVar.mo118725a("cal_timezone_view", put);
    }

    /* renamed from: A */
    public final void mo118714A(String str) {
        JSONObject put = new JSONObject().put("event_id", HitPointUtil.m124314b(str));
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        mo118725a("cal_mobile_offline_push_click", put);
    }

    /* renamed from: C */
    public final void mo118716C(String str) {
        Intrinsics.checkParameterIsNotNull(str, "enterSource");
        JSONObject put = new JSONObject().put("enter_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…NTER_SOURCE, enterSource)");
        mo118725a("cal_fill_format", put);
    }

    /* renamed from: K */
    private final String m124173K(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -902265784) {
            if (hashCode == 98629247 && str.equals("group")) {
                return "group";
            }
        } else if (str.equals("single")) {
            return "single";
        }
        return "no_value";
    }

    /* renamed from: L */
    private final void m124174L(String str) {
        try {
            C30022a.f74882a.statisticsDependency().mo108185a(str);
            Log.m165379d("GeneralHitPoint", "eventKey:" + str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static final String m124175a(CalendarEvent.NotificationType notificationType) {
        Intrinsics.checkParameterIsNotNull(notificationType, "notificationType");
        int i = C32498d.f83347l[notificationType.ordinal()];
        if (i == 1) {
            return "true";
        }
        if (i == 2) {
            return "false";
        }
        if (i == 3) {
            return "no_value";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    private final String m124225b(ShareType shareType) {
        switch (C32498d.f83345j[shareType.ordinal()]) {
            case 1:
                return "chat";
            case 2:
                return "link";
            case 3:
                return "image";
            case 4:
                return "wechat";
            case 5:
                return "moment";
            case 6:
                return "weibo";
            case 7:
                return "qq";
            case 8:
                return "album";
            case 9:
                return "more";
            default:
                return "";
        }
    }

    /* renamed from: d */
    public static final void m124240d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionTargetStatus");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", "click").put("action_source", "default_view").put("action_target_status", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ATUS, actionTargetStatus)");
        cVar.mo118725a("cal_calwidget_operation", put);
    }

    /* renamed from: e */
    public static final void m124243e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bannerType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("banner_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General….BANNER_TYPE, bannerType)");
        cVar.mo118725a("cal_banner_close", put);
    }

    /* renamed from: g */
    public static final void m124248g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionTargetStatus");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_target_status", str).put("action_source", "settings");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…E, GeneralValue.SETTINGS)");
        cVar.mo118725a("cal_settings_import_google", put);
    }

    /* renamed from: i */
    public static final void m124252i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "targetValue");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("target_value", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ARGET_VALUE, targetValue)");
        cVar.mo118725a("cal_settings_allday_notification", put);
    }

    /* renamed from: j */
    public static final void m124254j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "targetValue");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("target_value", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ARGET_VALUE, targetValue)");
        cVar.mo118725a("cal_settings_event_dur", put);
    }

    /* renamed from: k */
    public static final void m124256k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionTargetStatus");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_target_status", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ATUS, actionTargetStatus)");
        cVar.mo118725a("cal_settings_notify_accepted_only", put);
    }

    /* renamed from: l */
    public static final void m124258l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "themeType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("theme_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…am.THEME_TYPE, themeType)");
        cVar.mo118725a("cal_settings_theme", put);
    }

    /* renamed from: m */
    public static final void m124260m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionTargetStatus");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_target_status", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ATUS, actionTargetStatus)");
        cVar.mo118725a("cal_settings_work_hours", put);
    }

    /* renamed from: n */
    public static final void m124262n(String str) {
        Intrinsics.checkParameterIsNotNull(str, "targetValue");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("target_value", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ARGET_VALUE, targetValue)");
        cVar.mo118725a("cal_settings_first_week_day", put);
    }

    /* renamed from: o */
    public static final void m124264o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ION_SOURCE, actionSource)");
        cVar.mo118725a("cal_show_user_card", put);
    }

    /* renamed from: t */
    public static final void m124274t(String str) {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("event_sidebar", "findtime").put("group_type", "single").put("chat_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ralParam.CHAT_ID, chatId)");
        cVar.mo118725a("cal_sidebar_function", put);
    }

    /* renamed from: u */
    public static final void m124276u(String str) {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("event_sidebar", "findtime").put("group_type", "group").put("chat_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ralParam.CHAT_ID, chatId)");
        cVar.mo118725a("cal_sidebar_function", put);
    }

    /* renamed from: v */
    public static final void m124278v(String str) {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("event_sidebar", "findtime").put("group_type", "meeting").put("chat_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ralParam.CHAT_ID, chatId)");
        cVar.mo118725a("cal_sidebar_function", put);
    }

    /* renamed from: y */
    public static final void m124282y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionValue");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…ACTION_TYPE, actionValue)");
        cVar.mo118725a("cal_timezone_select", put);
    }

    /* renamed from: z */
    public static final String m124283z(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        if (str.hashCode() == 725746232 && str.equals("cal_profile")) {
            return ParamStoreData.f83351a.mo118744b();
        }
        return "";
    }

    /* renamed from: B */
    public final void mo118715B(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "clickVal");
        if (Intrinsics.areEqual(str, "remove")) {
            str2 = "remove_bullet_view";
        } else {
            str2 = "none";
        }
        JSONObject put = new JSONObject().put("click", str).put("target", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        mo118725a("cal_tripartite_manage_click", put);
    }

    /* renamed from: E */
    public final void mo118718E(String str) {
        JSONObject put = new JSONObject().put("click", "resource_details");
        put.put("target", "cal_resource_book_view").put("resource_id", HitPointUtil.m124314b(str));
        Intrinsics.checkExpressionValueIsNotNull(put, "params");
        mo118725a("cal_resource_main_click", put);
    }

    /* renamed from: G */
    public final void mo118719G(String str) {
        JSONObject put = new JSONObject().put("click", "full_create_event");
        put.put("target", "cal_event_full_create_view");
        put.put("resource_id", HitPointUtil.m124314b(str));
        Intrinsics.checkExpressionValueIsNotNull(put, "params");
        mo118725a("cal_resource_book_click", put);
    }

    /* renamed from: H */
    public final void mo118720H(String str) {
        JSONObject put = new JSONObject().put("click", "event_details");
        put.put("target", "cal_event_detail_view");
        put.put("resource_id", HitPointUtil.m124314b(str));
        Intrinsics.checkExpressionValueIsNotNull(put, "params");
        mo118725a("cal_resource_book_click", put);
    }

    /* renamed from: I */
    public final void mo118721I(String str) {
        JSONObject put = new JSONObject().put("click", "change_date");
        put.put("target", "none");
        put.put("resource_id", HitPointUtil.m124314b(str));
        Intrinsics.checkExpressionValueIsNotNull(put, "params");
        mo118725a("cal_resource_book_click", put);
    }

    /* renamed from: f */
    public final void mo118727f(boolean z) {
        String str;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        JSONObject put = new JSONObject().put("is_done", str).put("target", "choose_meeting_room");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…alue.CHOOSE_MEETING_ROOM)");
        mo118725a("cal_fill_format_complete_click", put);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: J */
    public static final void m124172J(String str) {
        Intrinsics.checkParameterIsNotNull(str, "clickTarget");
        JSONObject put = new JSONObject().put("click", str);
        switch (str.hashCode()) {
            case 942033467:
                if (str.equals("meeting")) {
                    put.put("target", "cal_add_vc_view");
                    break;
                }
                put.put("target", "none");
                break;
            case 979666998:
                if (str.equals("resource_view")) {
                    put.put("target", "cal_resource_main_view");
                    break;
                }
                put.put("target", "none");
                break;
            case 1598878023:
                if (str.equals("full_create_event")) {
                    put.put("target", "cal_event_full_create_view");
                    break;
                }
                put.put("target", "none");
                break;
            case 1963216646:
                if (str.equals("calendar_view")) {
                    put.put("target", "cal_calendar_main_view");
                    break;
                }
                put.put("target", "none");
                break;
            default:
                put.put("target", "none");
                break;
        }
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "params");
        cVar.mo118725a("cal_top_sidebar_click", put);
    }

    /* renamed from: b */
    public static final String m124226b(CalendarEvent calendarEvent) {
        if (calendarEvent == null) {
            return "";
        }
        if (calendarEvent.getType() == CalendarEvent.Type.MEETING) {
            return "meeting";
        }
        if (calendarEvent.getSource() == CalendarEvent.Source.GOOGLE) {
            return "google_event";
        }
        if (calendarEvent.getSource() == CalendarEvent.Source.EXCHANGE) {
            return "exchange_event";
        }
        if (calendarEvent.getSource() == CalendarEvent.Source.ANDROID) {
            return "local_event";
        }
        if (calendarEvent.getSource() == CalendarEvent.Source.EMAIL) {
            return "email";
        }
        return "event";
    }

    /* renamed from: c */
    public static final void m124237c(boolean z) {
        String str;
        if (z) {
            str = "meeting";
        } else {
            str = "normal";
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("group_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…am.GROUP_TYPE, groupType)");
        cVar.mo118725a("cal_event_group", put);
    }

    /* renamed from: d */
    public static final EventCountInfo m124238d(CalendarEvent calendarEvent) {
        EventCountInfo aVar = new EventCountInfo();
        if (calendarEvent == null) {
            return aVar;
        }
        aVar.mo118738e();
        for (CalendarEventAttendee calendarEventAttendee : calendarEvent.getAttendees()) {
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "attendee");
            if (calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                if (calendarEventAttendee.getCategory() == CalendarEventAttendee.Category.RESOURCE) {
                    aVar.mo118731a(aVar.mo118730a() + 1);
                } else if (calendarEventAttendee.getCategory() == CalendarEventAttendee.Category.THIRD_PARTY_USER) {
                    aVar.mo118733b(aVar.mo118732b() + 1);
                } else if (calendarEventAttendee.getCategory() == CalendarEventAttendee.Category.GROUP) {
                    aVar.mo118735c(aVar.mo118734c() + 1);
                } else if (calendarEventAttendee.getCategory() == CalendarEventAttendee.Category.USER) {
                    aVar.mo118737d(aVar.mo118736d() + 1);
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static final void m124244e(boolean z) {
        String str;
        if (z) {
            str = "edit";
        } else {
            str = "new";
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("edit_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(GeneralParam.EDIT_TYPE, editType)");
        cVar.mo118725a("cal_full_event_editor_close", put);
    }

    /* renamed from: D */
    public final void mo118717D(String str) {
        Intrinsics.checkParameterIsNotNull(str, "clickTarget");
        JSONObject put = new JSONObject().put("click", str);
        int hashCode = str.hashCode();
        if (hashCode != 942033467) {
            if (hashCode == 1598878023 && str.equals("full_create_event")) {
                put.put("target", "cal_event_full_create_view");
                Intrinsics.checkExpressionValueIsNotNull(put, "params");
                mo118725a("cal_resource_main_click", put);
            }
        } else if (str.equals("meeting")) {
            put.put("target", "cal_add_vc_view");
            Intrinsics.checkExpressionValueIsNotNull(put, "params");
            mo118725a("cal_resource_main_click", put);
        }
        put.put("target", "none");
        Intrinsics.checkExpressionValueIsNotNull(put, "params");
        mo118725a("cal_resource_main_click", put);
    }

    /* renamed from: a */
    public static final void m124179a(int i) {
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("member_count", i);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(GeneralParam.MEMBER_COUNT, num)");
        cVar.mo118725a("cal_findtime_member_num", put);
    }

    /* renamed from: a */
    public static final void m124182a(SubViewType subViewType) {
        String str;
        Intrinsics.checkParameterIsNotNull(subViewType, "calendarTypeData");
        int i = C32498d.f83346k[subViewType.ordinal()];
        if (i == 1) {
            str = "contacts";
        } else if (i != 2) {
            str = "mtgrooms";
        } else {
            str = "public_cal";
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", "calendar_subscription_modal").put("view_type", "").put("calendar_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…            calendarType)");
        cVar.mo118725a("cal_unsubscribe_calendar", put);
    }

    /* renamed from: c */
    public static final void m124236c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        JSONObject put = new JSONObject().put("action_source", str);
        if (str2 != null) {
            put.put("edit_type", str2);
        }
        GeneralHitPoint cVar = f83331a;
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        cVar.mo118725a("cal_mtroom_profile", put);
    }

    /* renamed from: a */
    public static final String m124177a(CalendarEvent.Type type, CalendarEvent.Source source) {
        Intrinsics.checkParameterIsNotNull(type, "eventType");
        Intrinsics.checkParameterIsNotNull(source, "eventSource");
        if (type == CalendarEvent.Type.MEETING) {
            return "meeting";
        }
        if (source == CalendarEvent.Source.GOOGLE) {
            return "google_event";
        }
        if (source == CalendarEvent.Source.ANDROID) {
            return "local_event";
        }
        return "event";
    }

    /* renamed from: a */
    private final String m124178a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        if (calendarEvent == null) {
            return "organizer";
        }
        if (calendarEvent2 != null) {
            C30810k a = C30810k.m114955a();
            Intrinsics.checkExpressionValueIsNotNull(a, "LoginInfoManager.getInstance()");
            String c = a.mo111644c();
            for (String str : CollectionsKt.listOf((Object[]) new String[]{calendarEvent2.getOrganizerCalendarId(), calendarEvent2.getCreatorCalendarId()})) {
                if (!TextUtils.isEmpty(str) && Intrinsics.areEqual(str, c)) {
                    return "organizer";
                }
            }
        }
        return "attendee";
    }

    /* renamed from: b */
    private final String m124227b(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        int i;
        boolean z;
        List<CalendarEventAttendee> attendees;
        boolean z2;
        if (calendarEvent == null || calendarEvent.getSource() == CalendarEvent.Source.GOOGLE) {
            return "false";
        }
        int i2 = 0;
        if (calendarEvent2 == null || (attendees = calendarEvent2.getAttendees()) == null) {
            i = 0;
        } else {
            ArrayList<CalendarEventAttendee> arrayList = new ArrayList();
            for (T t : attendees) {
                T t2 = t;
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                if (!t2.isThirdParty() || t2.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    arrayList.add(t);
                }
            }
            i = 0;
            for (CalendarEventAttendee calendarEventAttendee : arrayList) {
                i++;
            }
        }
        List<CalendarEventAttendee> attendees2 = calendarEvent.getAttendees();
        Intrinsics.checkExpressionValueIsNotNull(attendees2, "event.attendees");
        ArrayList<CalendarEventAttendee> arrayList2 = new ArrayList();
        for (T t3 : attendees2) {
            T t4 = t3;
            Intrinsics.checkExpressionValueIsNotNull(t4, "it");
            if (!t4.isThirdParty() || t4.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(t3);
            }
        }
        for (CalendarEventAttendee calendarEventAttendee2 : arrayList2) {
            i2++;
        }
        if (i == i2) {
            return "false";
        }
        return "true";
    }

    /* renamed from: b */
    public static final void m124231b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        Intrinsics.checkParameterIsNotNull(str2, "sourceType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_type", str).put("source_type", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…              sourceType)");
        cVar.mo118725a("cal_attachment_operation", put);
    }

    /* renamed from: a */
    public static final void m124181a(int i, boolean z) {
        if (i == 2) {
            if (z) {
                m124207a("find_time_single", "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
            } else {
                m124207a("find_time_group", "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public static final void m124232b(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(str2, "fromRecommend");
        Intrinsics.checkParameterIsNotNull(str3, "calendarType");
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("action_source", str).put("view_type", ParamStoreData.f83351a.mo118741a()).put("from_recommendation", str2).put("calendar_type", str3);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…            calendarType)");
        cVar.mo118725a("cal_subscribe_calendar", put);
    }

    /* renamed from: a */
    public static /* synthetic */ void m124201a(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        m124236c(str, str2);
    }

    /* renamed from: a */
    public static final void m124180a(int i, int i2, String str, List<? extends CalendarEventAttendee> list) {
        int i3;
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        int i4 = -1;
        if (list != null) {
            int i5 = 0;
            int i6 = 0;
            for (CalendarEventAttendee calendarEventAttendee : list) {
                if (calendarEventAttendee.isGroup()) {
                    i6++;
                } else {
                    i5++;
                }
            }
            i3 = i5;
            i4 = i6;
        } else {
            i3 = -1;
        }
        GeneralHitPoint cVar = f83331a;
        JSONObject put = new JSONObject().put("mtgroom_count", i).put("third_party_attendee_count", i2).put("action_source", str).put("group_count", i4).put("user_count", i3);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(General…am.USER_COUNT, userCount)");
        cVar.mo118725a("cal_find_time", put);
    }

    /* renamed from: b */
    public final void mo118726b(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "mtRoomName");
        Intrinsics.checkParameterIsNotNull(str2, "mtRoomId");
        Intrinsics.checkParameterIsNotNull(str3, "userType");
        Intrinsics.checkParameterIsNotNull(str4, "curEventType");
        Intrinsics.checkParameterIsNotNull(str5, "nextEventType");
        JSONObject put = new JSONObject().put("mtgroom_name", str).put("user_type", str3).put("current_event_type", str4).put("next_event_type", str5).put("resource_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "param");
        mo118725a("cal_code_view_calendar", put);
    }
}
