package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import android.text.TextUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003KLMB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0007JO\u0010#\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0018\u0010$\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010)J$\u0010*\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0007J\u001c\u0010+\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007J3\u0010,\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010.J\u001c\u0010/\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007J<\u00100\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0004H\u0007J$\u00103\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020'H\u0007J\u001a\u00105\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004JE\u00106\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00042\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00108\u001a\u0004\u0018\u00010'2\n\b\u0002\u00109\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\u001eH\u0007J$\u0010=\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0007J4\u0010>\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0007J5\u0010B\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010C2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010D\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010EJ!\u0010F\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010CH\u0007¢\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u00020\u001eJ\u0013\u0010I\u001a\u00020\u0004*\u0004\u0018\u00010'H\u0002¢\u0006\u0002\u0010JR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/CalendarEventHitPoint;", "", "()V", "CAL_EVENT_ADD_RESOURCE_VIEW", "", "CAL_EVENT_ATTENDEE_LIST_VIEW", "CAL_EVENT_CHAT_CREATE_CONFIRM_VIEW", "CAL_EVENT_DELETE_CONFIRM_VIEW", "CAL_EVENT_DETAIL_VIEW", "CAL_EVENT_FULL_CREATE_VIEW", "CAL_EVENT_MORE_VIEW", "CCM_DOC_FILE_PAGE_VIEW", "FILE_ID", "FILE_TYPE", "HAS_DESCRIPTION", "IM_CHAT_MAIN_VIEW", "IS_CONTAIN_DAY_CALENDAR", "IS_CONTAIN_VC", "IS_DELETE", "IS_GROUP_REMAIN", "IS_INVITED", "IS_IN_MEETING", "IS_REPORT", "IS_TRANSFER", "IS_UPDATED", "NONE", "VC_MEETING_PRE_SETTING_VIEW", "VC_MEETING_PRE_VIEW", "VC_TYPE", "calEventCardClick", "", "eventId", "eventStartTime", "chatId", "clickValue", "calEventCardView", "chatIdMap", "", "isInvited", "", "isUpdated", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "calEventChatCreateConfirmClick", "calEventChatCreateConfirmView", "calEventDeleteConfirmClick", "isGroupRemain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "calEventDeleteConfirmView", "calEventDetailClick", "fileId", "fileType", "calEventDetailMeetingView", "isInMeeting", "calEventDetailView", "calEventFullCreateClick", "vcType", "hasDescription", "hasGroupAttendee", "hasArchitectureAttendee", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "calEventFullCreateView", "calEventMoreClick", "calEventMoreView", "isReport", "isTransfer", "isDelete", "deleteEventNotifyAttendeeDialogClick", "", "isSend", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "deleteEventNotifyAttendeeDialogView", "(Ljava/lang/String;Ljava/lang/Long;)V", "sendCalEventAttendeeListClick", "hitPointString", "(Ljava/lang/Boolean;)Ljava/lang/String;", "EventClickValue", "EventHitValue", "FileType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.c */
public final class CalendarEventHitPoint {

    /* renamed from: a */
    public static final CalendarEventHitPoint f83362a = new CalendarEventHitPoint();

    private CalendarEventHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124347a(String str, String str2, boolean z, boolean z2, boolean z3) {
        new HitPointEvent("cal_event_more_view").mo118761c(str).mo118762d(str2).mo118758a("is_report", String.valueOf(z)).mo118758a("is_transfer", String.valueOf(z2)).mo118758a("is_delete", String.valueOf(z3)).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124345a(String str, String str2, Map<String, ? extends Object> map, Boolean bool, Boolean bool2) {
        String str3;
        String valueOf;
        Object obj = null;
        Object obj2 = map != null ? map.get("chat_id") : null;
        if (obj2 instanceof String) {
            obj = obj2;
        }
        HitPointEvent e = new HitPointEvent("cal_event_card_view").mo118761c(str).mo118762d(str2).mo118763e((String) obj);
        String str4 = "none";
        if (bool == null || (str3 = String.valueOf(bool.booleanValue())) == null) {
            str3 = str4;
        }
        HitPointEvent a = e.mo118758a("is_invited", str3);
        if (!(bool2 == null || (valueOf = String.valueOf(bool2.booleanValue())) == null)) {
            str4 = valueOf;
        }
        a.mo118758a("is_updated", str4).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124342a(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str4, "clickValue");
        new HitPointEvent("cal_event_card_click").mo118761c(str).mo118762d(str2).mo118763e(str3).mo118757a(str4).mo118760b((str4.hashCode() == -765765692 && str4.equals("check_more_detail")) ? "cal_event_detail_view" : "none").mo118759a();
    }

    /* renamed from: a */
    public static /* synthetic */ void m124344a(String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        m124343a(str, str2, str3, str4, str5);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @JvmStatic
    /* renamed from: a */
    public static final void m124343a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        Intrinsics.checkParameterIsNotNull(str3, "clickValue");
        HitPointEvent a = new HitPointEvent("cal_event_detail_click").mo118761c(str).mo118762d(str2).mo118757a(str3);
        switch (str3.hashCode()) {
            case -2105877132:
                if (str3.equals("enter_vc")) {
                    str6 = "vc_meeting_pre_view";
                    break;
                }
                str6 = "none";
                break;
            case -2025450459:
                if (str3.equals("edit_event")) {
                    str6 = "cal_event_full_create_view";
                    break;
                }
                str6 = "none";
                break;
            case -1608006048:
                if (str3.equals("more_action")) {
                    str6 = "cal_event_more_view";
                    break;
                }
                str6 = "none";
                break;
            case -818885537:
                if (str3.equals("enter_chat")) {
                    str6 = "im_chat_main_view";
                    break;
                }
                str6 = "none";
                break;
            case -494081861:
                if (str3.equals("create_chat")) {
                    str6 = "cal_event_chat_create_confirm_view";
                    break;
                }
                str6 = "none";
                break;
            case -430231802:
                if (str3.equals("delete_event")) {
                    str6 = "cal_event_delete_confirm_view";
                    break;
                }
                str6 = "none";
                break;
            case -24632936:
                if (str3.equals("create_meeting_minutes")) {
                    str6 = "ccm_doc_file_page_view";
                    break;
                }
                str6 = "none";
                break;
            case 848192531:
                if (str3.equals("edit_vc_setting")) {
                    str6 = "vc_meeting_pre_setting_view";
                    break;
                }
                str6 = "none";
                break;
            default:
                str6 = "none";
                break;
        }
        HitPointEvent b = a.mo118760b(str6);
        if (str3.hashCode() == -24632936 && str3.equals("create_meeting_minutes")) {
            if (str4 != null) {
                b.mo118758a("file_id", HitPointUtil.f83371a.mo118765b(str4));
            }
            if (str5 != null) {
                switch (str5.hashCode()) {
                    case -903459084:
                        if (str5.equals("sheets")) {
                            str5 = "sheet";
                            break;
                        }
                        break;
                    case -899647262:
                        if (str5.equals("slides")) {
                            str5 = "slide";
                            break;
                        }
                        break;
                    case 3016401:
                        if (str5.equals("base")) {
                            str5 = "bitable";
                            break;
                        }
                        break;
                    case 3088955:
                        if (str5.equals("docs")) {
                            str5 = "doc";
                            break;
                        }
                        break;
                    case 676531631:
                        if (str5.equals("mindnotes")) {
                            str5 = "mindnote";
                            break;
                        }
                        break;
                }
            }
            b.mo118758a("file_type", str5);
        }
        b.mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124346a(String str, String str2, boolean z) {
        new HitPointEvent("cal_event_detail_meeting_view").mo118761c(str).mo118762d(str2).mo118758a("is_in_meeting", String.valueOf(z)).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124334a() {
        new HitPointEvent("cal_event_full_create_view").mo118759a();
    }

    /* renamed from: b */
    public final void mo118752b() {
        new HitPointEvent("cal_event_attendee_list_click").mo118757a("expand").mo118760b("none").mo118759a();
    }

    /* renamed from: a */
    private final String m124333a(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            return "true";
        }
        return "false";
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124348b(String str, String str2) {
        new HitPointEvent("cal_event_chat_create_confirm_view").mo118761c(str).mo118762d(str2).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124335a(String str, Long l) {
        String str2;
        HitPointEvent c = new HitPointEvent("cal_event_delete_notification_view").mo118761c(str);
        if (l != null) {
            str2 = String.valueOf(l.longValue());
        } else {
            str2 = null;
        }
        c.mo118762d(str2).mo118759a();
    }

    /* renamed from: c */
    public final void mo118753c(String str, String str2) {
        String str3 = str;
        if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "0")) {
            str = "none";
        }
        new HitPointEvent("cal_event_detail_view").mo118761c(str).mo118762d(str2).mo118758a("is_contain_day_calendar", String.valueOf(false)).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124337a(String str, String str2) {
        new HitPointEvent("cal_event_delete_confirm_view").mo118761c(str).mo118762d(str2).mo118759a();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124349b(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "clickValue");
        new HitPointEvent("cal_event_more_click").mo118761c(str).mo118762d(str2).mo118757a(str3).mo118760b("none").mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124340a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "clickValue");
        new HitPointEvent("cal_event_chat_create_confirm_click").mo118761c(str).mo118762d(str2).mo118757a(str3).mo118760b("im_chat_main_view").mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124336a(String str, Long l, String str2, Boolean bool) {
        String str3;
        HitPointEvent c = new HitPointEvent("cal_event_delete_notification_click").mo118761c(str);
        if (l != null) {
            str3 = String.valueOf(l.longValue());
        } else {
            str3 = null;
        }
        c.mo118762d(str3).mo118757a(str2).mo118760b("none").mo118758a("is_group_remain", HitPointUtil.m124399a(bool)).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124341a(String str, String str2, String str3, Boolean bool) {
        String valueOf;
        Intrinsics.checkParameterIsNotNull(str3, "clickValue");
        String str4 = "none";
        HitPointEvent b = new HitPointEvent("cal_event_delete_confirm_click").mo118761c(str).mo118762d(str2).mo118757a(str3).mo118760b(str4);
        if (!(bool == null || (valueOf = String.valueOf(bool.booleanValue())) == null)) {
            str4 = valueOf;
        }
        b.mo118758a("is_group_remain", str4).mo118759a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m124338a(java.lang.String r3, java.lang.String r4, java.lang.Boolean r5, java.lang.Boolean r6, java.lang.Boolean r7) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint.m124338a(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m124339a(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = null;
        }
        m124338a(str, str2, bool, bool2, bool3);
    }
}
