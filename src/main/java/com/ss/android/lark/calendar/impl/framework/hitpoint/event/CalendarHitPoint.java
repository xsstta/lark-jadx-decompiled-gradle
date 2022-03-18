package com.ss.android.lark.calendar.impl.framework.hitpoint.event;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Deprecated(message = "this class will be deprecated")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007H\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010\u001a\u001a\u00020\u0005H\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010\u001c\u001a\u00020\u0005H\u0007J\b\u0010\u001d\u001a\u00020\u0005H\u0007J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0011H\u0007J\b\u0010 \u001a\u00020\u0005H\u0007J\b\u0010!\u001a\u00020\u0005H\u0007J\b\u0010\"\u001a\u00020\u0005H\u0007J\b\u0010#\u001a\u00020\u0005H\u0007J\b\u0010$\u001a\u00020\u0005H\u0007J\b\u0010%\u001a\u00020\u0005H\u0007J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010(\u001a\u00020\u0005H\u0007J\b\u0010)\u001a\u00020\u0005H\u0007J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010+\u001a\u00020\u0005H\u0007J\b\u0010,\u001a\u00020\u0005H\u0007J\b\u0010-\u001a\u00020\u0005H\u0007J\b\u0010.\u001a\u00020\u0005H\u0007J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\u0018\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0007J\b\u00103\u001a\u00020\u0005H\u0007J\b\u00104\u001a\u00020\u0005H\u0007J\b\u00105\u001a\u00020\u0005H\u0007J\b\u00106\u001a\u00020\u0005H\u0007J\b\u00107\u001a\u00020\u0005H\u0007J\u0018\u00108\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0007J\u0010\u00109\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010:\u001a\u00020\u0005H\u0007J\b\u0010;\u001a\u00020\u0005H\u0007J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010=\u001a\u00020\u0005H\u0007J\b\u0010>\u001a\u00020\u0005H\u0007J\b\u0010?\u001a\u00020\u0005H\u0007J\b\u0010@\u001a\u00020\u0005H\u0007J\b\u0010A\u001a\u00020\u0005H\u0007J\b\u0010B\u001a\u00020\u0005H\u0007J \u0010C\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0007H\u0007J\b\u0010F\u001a\u00020\u0005H\u0007J\u0018\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0007J\b\u0010J\u001a\u00020\u0005H\u0007J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010L\u001a\u00020\u0005H\u0007J\b\u0010M\u001a\u00020\u0005H\u0007J\u0010\u0010N\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0007H\u0007J\b\u0010P\u001a\u00020\u0005H\u0007J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\b\u0010R\u001a\u00020\u0005H\u0007J\b\u0010S\u001a\u00020\u0005H\u0007J\b\u0010T\u001a\u00020\u0005H\u0007J\b\u0010U\u001a\u00020\u0005H\u0007J\u0010\u0010V\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0007H\u0007J\u0010\u0010W\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0007H\u0007J\u0010\u0010X\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0007H\u0007J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0007H\u0007J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0007H\u0007J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0007H\u0007J\b\u0010\\\u001a\u00020\u0005H\u0007J\b\u0010]\u001a\u00020\u0005H\u0007J\b\u0010^\u001a\u00020\u0005H\u0007J\b\u0010_\u001a\u00020\u0005H\u0007J\b\u0010`\u001a\u00020\u0005H\u0007J\u0010\u0010a\u001a\u00020\u00052\u0006\u0010b\u001a\u00020cH\u0007J\b\u0010d\u001a\u00020\u0005H\u0007J\b\u0010e\u001a\u00020\u0005H\u0007J\b\u0010f\u001a\u00020\u0005H\u0007J\b\u0010g\u001a\u00020\u0005H\u0007J\b\u0010h\u001a\u00020\u0005H\u0007J\u0010\u0010i\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007H\u0007J\b\u0010j\u001a\u00020\u0005H\u0007J\b\u0010k\u001a\u00020\u0005H\u0007J\b\u0010l\u001a\u00020\u0005H\u0007J\b\u0010m\u001a\u00020\u0005H\u0007J\b\u0010n\u001a\u00020\u0005H\u0007J\u0010\u0010o\u001a\u00020\u00052\u0006\u0010p\u001a\u00020\u0007H\u0007J\u0010\u0010q\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u0007H\u0007J\u0012\u0010s\u001a\u00020\u00052\b\u0010t\u001a\u0004\u0018\u00010uH\u0007J\u0010\u0010v\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u0007H\u0007J\u0010\u0010w\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u0011H\u0007J\b\u0010y\u001a\u00020\u0005H\u0007J\u0018\u0010z\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u0011H\u0007J\b\u0010|\u001a\u00020\u0005H\u0007J\b\u0010}\u001a\u00020\u0005H\u0007¨\u0006~"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event/CalendarHitPoint;", "Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event/BaseHitPoint;", "Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event/IHitPoint;", "()V", "safeSendEvent", "", "eventKey", "", "param", "Lorg/json/JSONObject;", "sendAsyncCreateCostTimeOnLaunch", "costTime", "", "sendAsyncPrepareCostTimeOnLaunch", "sendAsyncQueuingCostTimeOnLaunch", "sendCalendarDescriptionSizeCount", "length", "", "sendLocalCalendarAccCount", "accOncCount", "sendLocalCalendarOpenManual", "sendOnAllowLocalCalendar", "sendOnCalendarOpenView", "viewType", "sendOnCalendarProfileAppendEvent", "actionType", "sendOnCalendarProfileCreateEvent", "sendOnCalendarProfileMonth", "sendOnCalendarProfileSwitchMonth", "sendOnCheckAttendeeList", "sendOnChooseWeekStartDay", "weekDate", "sendOnClickArrangeTime", "sendOnClickArrangeToleft", "sendOnClickBannerBody", "sendOnClickBannerCloss", "sendOnClickBotDetail", "sendOnClickCalendarArrangeTimeSave", "sendOnClickCalendarCopy", "sendOnClickCalendarCreatorSettings", "sendOnClickCalendarImport", "sendOnClickCalendarMember", "sendOnClickCalendarPickDate", "sendOnClickCalendarProfile", "sendOnClickCalendarProfileCreate", "sendOnClickCalendarTimeSet", "sendOnClickCalendarWorkHour", "sendOnClickCalendarWorkHourSwitch", "sendOnClickChatMeetingMinute", "statusType", "editType", "sendOnClickCreateCalendar", "sendOnClickDetailMore", "sendOnClickDetailTransfer", "sendOnClickDrawerCellSetting", "sendOnClickDrawerSubscribe", "sendOnClickEventMeetingMinute", "sendOnClickGoogleSwitchBtn", "sendOnClickMeeting2ChatBannerBody", "sendOnClickMeeting2ChatBannerClose", "sendOnClickMultitask", "sendOnClickOrganizerOrCreator", "sendOnClickSettingManagerCalendar", "sendOnClickSettingWeekStart", "sendOnClickShareAttend", "sendOnClickShareForward", "sendOnClickShareLark", "sendOnClickSubscribeButton", "pageType", "subType", "sendOnClickUnsubscribe", "sendOnClickVideoMeeting", "beforeStart", "afterEnd", "sendOnCreateMeetingFromDetail", "sendOnCreateOrEditGoogleEvent", "sendOnDailyEventExpand", "sendOnDeleteEvent", "sendOnDeleteLocalEvent", "uuid", "sendOnDeleteMeeting", "sendOnDeleteOrUnsubscribeCalendar", "sendOnDetaiToMeeting", "sendOnDetailMoreDeleteEvent", "sendOnDisAllowLocalCalendar", "sendOnEditDeleteEvent", "sendOnEditLocalEventAlerts", "sendOnEditLocalEventDescription", "sendOnEditLocalEventRepeat", "sendOnEditLocalEventSite", "sendOnEditLocalEventTime", "sendOnEditLocalEventTitle", "sendOnEnterMeetingChat", "sendOnEventTransferConfirm", "sendOnFullAddEvent", "sendOnFullAddMeeting", "sendOnGoogleCal", "sendOnGoogleCalImport", "isCancelBind", "", "sendOnImportGoogleSuccess", "sendOnMeeting2ChatCancel", "sendOnMeeting2ChatConfirm", "sendOnMeetingUserFromDetail", "sendOnMonthlyAppendEvent", "sendOnMonthlySwitch", "sendOnNotifyBackToEdit", "sendOnNotifyCancelChanges", "sendOnNotifyClickNotSend", "sendOnNotifyClickSend", "sendOnOpenEventDetail", "sendOnPopupDelete", "sourceType", "sendOnReplyEventAction", "respType", "sendOnReplyEventInvitation", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "sendOnReplyMeetingAction", "sendOnShareMeetingEvent", "eventSpan", "sendOnSlideBarEnterEvent", "sendOnUnsubscribeCalendars", "unsubscribeCount", "sendOnUpdateMeeting", "sendOnVideoMeetingCardGotoEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.b.b */
public final class CalendarHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final CalendarHitPoint f83330a = new CalendarHitPoint();

    private CalendarHitPoint() {
    }

    @JvmStatic
    /* renamed from: A */
    public static final void m124099A() {
        f83330a.m124159r("cal_transfer_confirm");
    }

    @JvmStatic
    /* renamed from: B */
    public static final void m124100B() {
        f83330a.m124159r("cal_edit_delete");
    }

    @JvmStatic
    /* renamed from: C */
    public static final void m124101C() {
        f83330a.m124159r("cal_findtime");
    }

    @JvmStatic
    /* renamed from: D */
    public static final void m124102D() {
        f83330a.m124159r("cal_left");
    }

    @JvmStatic
    /* renamed from: E */
    public static final void m124103E() {
        f83330a.m124159r("cal_create_cal");
    }

    @JvmStatic
    /* renamed from: F */
    public static final void m124104F() {
        f83330a.m124159r("cal_settings");
    }

    @JvmStatic
    /* renamed from: G */
    public static final void m124105G() {
        f83330a.m124159r("cal_member_permission");
    }

    @JvmStatic
    /* renamed from: H */
    public static final void m124106H() {
        f83330a.m124159r("cal_profile");
    }

    @JvmStatic
    /* renamed from: I */
    public static final void m124107I() {
        f83330a.m124159r("cal_event_create");
    }

    @JvmStatic
    /* renamed from: J */
    public static final void m124108J() {
        f83330a.m124159r("cal_import");
    }

    @JvmStatic
    /* renamed from: K */
    public static final void m124109K() {
        f83330a.m124159r("cal_myworkhour");
    }

    @JvmStatic
    /* renamed from: L */
    public static final void m124110L() {
        f83330a.m124159r("cal_time_set");
    }

    @JvmStatic
    /* renamed from: M */
    public static final void m124111M() {
        f83330a.m124159r("cal_time_save");
    }

    @JvmStatic
    /* renamed from: N */
    public static final void m124112N() {
        f83330a.m124159r("cal_profile_create");
    }

    @JvmStatic
    /* renamed from: O */
    public static final void m124113O() {
        f83330a.m124159r("cal_video_event");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124124b() {
        f83330a.m124159r("cal_eventview");
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m124127c() {
        f83330a.m124159r("cal_levelup");
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m124134f() {
        f83330a.m124159r("cal_bot_detail");
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m124136g() {
        f83330a.m124159r("cal_share_lark");
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m124138h() {
        f83330a.m124159r("cal_share_attend");
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m124140i() {
        f83330a.m124159r("cal_share_lark");
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m124142j() {
        f83330a.m124159r("cal_daily_event_expand");
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m124144k() {
        f83330a.m124159r("cal_monthly_create_event");
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m124150n() {
        f83330a.m124159r("cal_event_detail_2mtg");
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m124152o() {
        f83330a.m124159r("cal_sidebar_event");
    }

    @JvmStatic
    /* renamed from: q */
    public static final void m124156q() {
        f83330a.m124159r("cal_local_grant_access_manual");
    }

    @JvmStatic
    /* renamed from: t */
    public static final void m124161t() {
        f83330a.m124159r("cal_detail_organizer");
    }

    @JvmStatic
    /* renamed from: u */
    public static final void m124162u() {
        f83330a.m124159r("cal_attendee_list");
    }

    @JvmStatic
    /* renamed from: v */
    public static final void m124163v() {
        f83330a.m124159r("cal_subscribe");
    }

    @JvmStatic
    /* renamed from: w */
    public static final void m124164w() {
        f83330a.m124159r("event_back_to_edit");
    }

    @JvmStatic
    /* renamed from: x */
    public static final void m124165x() {
        f83330a.m124159r("event_send");
    }

    @JvmStatic
    /* renamed from: y */
    public static final void m124166y() {
        f83330a.m124159r("event_do_not_send");
    }

    @JvmStatic
    /* renamed from: z */
    public static final void m124167z() {
        f83330a.m124159r("cal_week_start");
    }

    @JvmStatic
    /* renamed from: P */
    public static final void m124114P() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", "click");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …\n            Value.CLICK)");
        bVar.m124123a("cal_transform_banner", put);
    }

    @JvmStatic
    /* renamed from: Q */
    public static final void m124115Q() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", "close");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …\n            Value.CLOSE)");
        bVar.m124123a("cal_transform_banner", put);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m124130d() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("event_type", "event");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …\n            Value.EVENT)");
        bVar.m124123a("cal_delevent", put);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m124132e() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("event_type", "meeting");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …           Value.MEETING)");
        bVar.m124123a("cal_delevent", put);
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m124146l() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("event_banner", "body");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …       Value.BANNER_BODY)");
        bVar.m124123a("cal_banner_interact", put);
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m124148m() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("event_banner", "close");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …      Value.BANNER_CLOSS)");
        bVar.m124123a("cal_banner_interact", put);
    }

    @JvmStatic
    /* renamed from: p */
    public static final void m124154p() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("access_grant", "disallow");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …    Value.LOCAL_DISALLOW)");
        bVar.m124123a("cal_settings_show_local_calendar", put);
    }

    @JvmStatic
    /* renamed from: r */
    public static final void m124158r() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("entrance_type", "detail");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …            Value.DETAIL)");
        bVar.m124123a("cal_meeting_create", put);
    }

    @JvmStatic
    /* renamed from: s */
    public static final void m124160s() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("entrance_type", "detail");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …            Value.DETAIL)");
        bVar.m124123a("cal_meeting_user", put);
    }

    @JvmStatic
    /* renamed from: R */
    public static final void m124116R() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, "banner").put("action_type", "yes");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …E,\n            Value.YES)");
        bVar.m124123a("cal_transform_popup", put);
    }

    @JvmStatic
    /* renamed from: S */
    public static final void m124117S() {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, "banner").put("action_type", "no");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …PE,\n            Value.NO)");
        bVar.m124123a("cal_transform_popup", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124120a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "viewType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("slide_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …PE,\n            viewType)");
        bVar.m124123a("cal_monthly_switch_month", put);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m124128c(int i) {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("length_type", i);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …TYPE,\n            length)");
        bVar.m124123a("cal_descrip", put);
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m124141i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("source_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            sourceType)");
        bVar.m124123a("cal_popup_delete", put);
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m124143j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_create_settings", put);
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m124145k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_settings_action", put);
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m124151n(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_google_switch", put);
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m124153o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_workhourswitch", put);
    }

    @JvmStatic
    /* renamed from: q */
    public static final void m124157q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_copy", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124118a(int i) {
        String str;
        if (i == 1) {
            str = "this";
        } else if (i == 2) {
            str = "follow";
        } else if (i == 3) {
            str = "all";
        } else {
            return;
        }
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("event_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …_TYPE,\n            value)");
        bVar.m124123a("cal_meeting_share", put);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124125b(int i) {
        String str;
        if (i == 0) {
            str = "sun";
        } else if (i == 1) {
            str = "mon";
        } else if (i == 6) {
            str = "sat";
        } else {
            return;
        }
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("date_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …_TYPE,\n            value)");
        bVar.m124123a("cal_week_startday", put);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m124129c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("edit_info", "time").put("action_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …ION_ID,\n            uuid)");
        bVar.m124123a("cal_local_calendar_detail_edit", put);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m124131d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("edit_info", "alerts").put("action_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …ION_ID,\n            uuid)");
        bVar.m124123a("cal_local_calendar_detail_edit", put);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m124133e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("edit_info", "site").put("action_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …ION_ID,\n            uuid)");
        bVar.m124123a("cal_local_calendar_detail_edit", put);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m124135f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("edit_info", "repeat").put("action_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …ION_ID,\n            uuid)");
        bVar.m124123a("cal_local_calendar_detail_edit", put);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m124137g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("edit_info", "description").put("action_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …ION_ID,\n            uuid)");
        bVar.m124123a("cal_local_calendar_detail_edit", put);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m124139h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("edit_info", "delete").put("action_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …ION_ID,\n            uuid)");
        bVar.m124123a("cal_local_calendar_detail_edit", put);
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m124147l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_event", put);
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m124149m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_google_event_save", put);
    }

    @JvmStatic
    /* renamed from: p */
    public static final void m124155p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …,\n            actionType)");
        bVar.m124123a("cal_pick_date", put);
    }

    /* renamed from: r */
    private final void m124159r(String str) {
        try {
            C30022a.f74882a.statisticsDependency().mo108185a(str);
            Log.m165379d("CalendarHitPoint", "eventKey:" + str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124126b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("edit_info", "title").put("action_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …ION_ID,\n            uuid)");
        bVar.m124123a("cal_local_calendar_detail_edit", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124119a(long j, long j2) {
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("source_type", "detail").put("before_start", j).put("after_end", j2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …                afterEnd)");
        bVar.m124123a("cal_video", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124121a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "statusType");
        Intrinsics.checkParameterIsNotNull(str2, "editType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("status_type", str).put("edit_type", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …PE,\n            editType)");
        bVar.m124123a("cal_mtgsidebar_docs", put);
    }

    /* renamed from: a */
    private final void m124123a(String str, JSONObject jSONObject) {
        try {
            C30022a.f74882a.statisticsDependency().mo108186a(str, jSONObject);
            Log.m165379d("CalendarHitPoint", "eventKey:" + str + " param:" + jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124122a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        Intrinsics.checkParameterIsNotNull(str2, "pageType");
        Intrinsics.checkParameterIsNotNull(str3, "subType");
        CalendarHitPoint bVar = f83330a;
        JSONObject put = new JSONObject().put("action_type", str).put("page_type", str2).put("sub_type", str3);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\n      …\n                subType)");
        bVar.m124123a("cal_sub_action", put);
    }
}
