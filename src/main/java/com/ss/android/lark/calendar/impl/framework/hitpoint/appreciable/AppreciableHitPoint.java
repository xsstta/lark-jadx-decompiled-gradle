package com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001UB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0006\u0010'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u0006\u0010)\u001a\u00020\"J\u0006\u0010*\u001a\u00020\"J\u0006\u0010+\u001a\u00020\"J\u0006\u0010,\u001a\u00020\"J\u0006\u0010-\u001a\u00020\"J\u0006\u0010.\u001a\u00020\"J\u0006\u0010/\u001a\u00020\"J\u0006\u00100\u001a\u00020\"J\u0006\u00101\u001a\u00020\"J\u0006\u00102\u001a\u00020\"J\u0006\u00103\u001a\u00020\"J\u0006\u00104\u001a\u00020\"J\u0006\u00105\u001a\u00020\"J*\u00106\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u00107\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u000109H\u0002J\u0010\u0010:\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J\u0010\u0010;\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J\u0010\u0010<\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J\u0010\u0010=\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J\u0010\u0010>\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J\u0010\u0010?\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J\u0010\u0010@\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J\u0010\u0010A\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109J \u0010B\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0006\u0010C\u001a\u00020\"J\u0006\u0010D\u001a\u00020\"J\u0006\u0010E\u001a\u00020\"J\u0006\u0010F\u001a\u00020\"J\u0006\u0010G\u001a\u00020\"J\u0006\u0010H\u001a\u00020\"J\u0006\u0010I\u001a\u00020\"J\u0006\u0010J\u001a\u00020\"J\u0006\u0010K\u001a\u00020\"J\u0006\u0010L\u001a\u00020\"J\u0006\u0010M\u001a\u00020\"J\u0006\u0010N\u001a\u00020\"J\u0006\u0010O\u001a\u00020\"J\u0006\u0010P\u001a\u00020\"J\u0006\u0010Q\u001a\u00020\"J\u0006\u0010R\u001a\u00020\"J\u0006\u0010S\u001a\u00020\"J\u0006\u0010T\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R.\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001ej\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0004` X\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/appreciable/AppreciableHitPoint;", "", "()V", "E_ADD_FULL_EVENT", "", "E_CHECK_ATTENDEE", "E_CHECK_EVENT", "E_CLICK_TAB", "E_DELETE_EVENT", "E_EDIT_EVENT", "E_ENTER_MEETING", "E_ENTER_MINUTES", "E_ENTER_VIDEO", "E_REPLY_RSVP", "E_SAVE_EVENT", "E_SHARE_EVENT", "E_SWITCH_DIAGRAM", "P_BOT_CARD", "P_DAILY_DIAGRAM", "P_DIAGRAM", "P_EVENT_CREATE", "P_EVENT_DETAIL", "P_LIST_DIAGRAM", "P_MONTH_DIAGRAM", "P_THREE_DIAGRAM", "firstClickedTab", "", "firstDiagram", "isWaitSwitchDiagramEnding", "keyMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/framework/hitpoint/appreciable/AppreciableHitPoint$AppreciableKey;", "Lkotlin/collections/HashMap;", "appreciableEnd", "", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "event", "page", "appreciableEndBotCheckEventDetail", "appreciableEndBotReplyRSVP", "appreciableEndCheckAttendee", "appreciableEndCheckDiagram", "appreciableEndCheckEventDetail", "appreciableEndCreateEvent", "appreciableEndDeleteEvent", "appreciableEndEditEvent", "appreciableEndEnterMeeting", "appreciableEndEnterMinutes", "appreciableEndEnterVideo", "appreciableEndReplyRSVP", "appreciableEndSaveEvent", "appreciableEndShareEvent", "appreciableEndSwitchDiagram", "appreciableError", "userAction", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "appreciableErrorBotReplyRSVP", "appreciableErrorDeleteEvent", "appreciableErrorEnterMeeting", "appreciableErrorEnterMinutes", "appreciableErrorEnterVideo", "appreciableErrorReplyRSVP", "appreciableErrorSaveEvent", "appreciableErrorShareEvent", "appreciableStart", "appreciableStartBotCheckEventDetail", "appreciableStartBotReplyRSVP", "appreciableStartCheckAttendee", "appreciableStartCheckDailyDiagram", "appreciableStartCheckEventDetail", "appreciableStartCheckListDiagram", "appreciableStartCheckMonthDiagram", "appreciableStartCheckThreeDiagram", "appreciableStartCreateEvent", "appreciableStartDeleteEvent", "appreciableStartEditEvent", "appreciableStartEnterMeeting", "appreciableStartEnterMinutes", "appreciableStartEnterVideo", "appreciableStartReplyRSVP", "appreciableStartSaveEvent", "appreciableStartShareEvent", "appreciableStartSwitchDiagram", "AppreciableKey", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.a.a */
public final class AppreciableHitPoint {

    /* renamed from: a */
    public static final AppreciableHitPoint f83321a = new AppreciableHitPoint();

    /* renamed from: b */
    private static final HashMap<AppreciableKey, String> f83322b = new HashMap<>();

    /* renamed from: c */
    private static String f83323c;

    /* renamed from: d */
    private static boolean f83324d = true;

    /* renamed from: e */
    private static boolean f83325e;

    private AppreciableHitPoint() {
    }

    /* renamed from: A */
    public final void mo118671A() {
        m124055a(Scene.CalEventDetail, "cal_enter_minutes", "cal_event_detail");
    }

    /* renamed from: B */
    public final void mo118672B() {
        m124057b(Scene.CalEventDetail, "cal_enter_minutes", "cal_event_detail");
    }

    /* renamed from: C */
    public final void mo118673C() {
        m124055a(Scene.CalEventDetail, "cal_check_attendee", "cal_event_detail");
    }

    /* renamed from: D */
    public final void mo118674D() {
        m124057b(Scene.CalEventDetail, "cal_check_attendee", "cal_event_detail");
    }

    /* renamed from: E */
    public final void mo118675E() {
        m124055a(Scene.CalEventEdit, "cal_save_event", "cal_event_create");
    }

    /* renamed from: F */
    public final void mo118676F() {
        m124057b(Scene.CalEventEdit, "cal_save_event", "cal_event_create");
    }

    /* renamed from: g */
    public final void mo118689g() {
        m124055a(Scene.CalEventEdit, "cal_edit_event", "cal_event_detail");
    }

    /* renamed from: h */
    public final void mo118691h() {
        m124057b(Scene.CalEventEdit, "cal_edit_event", "cal_event_detail");
    }

    /* renamed from: i */
    public final void mo118693i() {
        m124055a(Scene.CalEventEdit, "cal_add_full_event", "cal_diagram");
    }

    /* renamed from: j */
    public final void mo118694j() {
        m124057b(Scene.CalEventEdit, "cal_add_full_event", "cal_diagram");
    }

    /* renamed from: k */
    public final void mo118695k() {
        m124055a(Scene.CalEventDetail, "cal_check_event", "cal_diagram");
    }

    /* renamed from: l */
    public final void mo118696l() {
        m124057b(Scene.CalEventDetail, "cal_check_event", "cal_diagram");
    }

    /* renamed from: m */
    public final void mo118697m() {
        m124055a(Scene.CalBot, "cal_reply_rsvp", "cal_bot_card");
    }

    /* renamed from: n */
    public final void mo118698n() {
        m124057b(Scene.CalBot, "cal_reply_rsvp", "cal_bot_card");
    }

    /* renamed from: o */
    public final void mo118699o() {
        m124055a(Scene.CalBot, "cal_check_event", "cal_bot_card");
    }

    /* renamed from: p */
    public final void mo118700p() {
        m124057b(Scene.CalBot, "cal_check_event", "cal_bot_card");
    }

    /* renamed from: q */
    public final void mo118701q() {
        m124055a(Scene.CalEventDetail, "cal_share_event", "cal_event_detail");
    }

    /* renamed from: r */
    public final void mo118702r() {
        m124057b(Scene.CalEventDetail, "cal_share_event", "cal_event_detail");
    }

    /* renamed from: s */
    public final void mo118703s() {
        m124055a(Scene.CalEventDetail, "cal_delete_event", "cal_event_detail");
    }

    /* renamed from: t */
    public final void mo118704t() {
        m124057b(Scene.CalEventDetail, "cal_delete_event", "cal_event_detail");
    }

    /* renamed from: u */
    public final void mo118705u() {
        m124055a(Scene.CalEventDetail, "cal_reply_rsvp", "cal_event_detail");
    }

    /* renamed from: v */
    public final void mo118706v() {
        m124057b(Scene.CalEventDetail, "cal_reply_rsvp", "cal_event_detail");
    }

    /* renamed from: w */
    public final void mo118707w() {
        m124055a(Scene.CalEventDetail, "cal_enter_video", "cal_event_detail");
    }

    /* renamed from: x */
    public final void mo118708x() {
        m124057b(Scene.CalEventDetail, "cal_enter_video", "cal_event_detail");
    }

    /* renamed from: y */
    public final void mo118709y() {
        m124055a(Scene.CalEventDetail, "cal_enter_meeting", "cal_event_detail");
    }

    /* renamed from: z */
    public final void mo118710z() {
        m124057b(Scene.CalEventDetail, "cal_enter_meeting", "cal_event_detail");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/appreciable/AppreciableHitPoint$AppreciableKey;", "", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "event", "", "page", "(Lcom/ss/android/lark/appreciablelib/Scene;Ljava/lang/String;Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "getPage", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "equals", "", "other", "hashCode", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.a.a$a */
    public static final class AppreciableKey {

        /* renamed from: a */
        private final Scene f83326a;

        /* renamed from: b */
        private final String f83327b;

        /* renamed from: c */
        private final String f83328c;

        public int hashCode() {
            return Objects.hash(this.f83326a, this.f83327b, this.f83328c);
        }

        public boolean equals(Object obj) {
            if (obj instanceof AppreciableKey) {
                AppreciableKey aVar = (AppreciableKey) obj;
                if (this.f83326a != aVar.f83326a || !Intrinsics.areEqual(this.f83327b, aVar.f83327b) || !Intrinsics.areEqual(this.f83328c, aVar.f83328c)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public AppreciableKey(Scene scene, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            Intrinsics.checkParameterIsNotNull(str, "event");
            Intrinsics.checkParameterIsNotNull(str2, "page");
            this.f83326a = scene;
            this.f83327b = str;
            this.f83328c = str2;
        }
    }

    /* renamed from: b */
    public final void mo118679b() {
        if (f83324d) {
            m124055a(Scene.CalDiagram, "cal_click_tab", "cal_daily_diagram");
            f83323c = "cal_daily_diagram";
        }
    }

    /* renamed from: c */
    public final void mo118681c() {
        if (f83324d) {
            m124055a(Scene.CalDiagram, "cal_click_tab", "cal_three_diagram");
            f83323c = "cal_three_diagram";
        }
    }

    /* renamed from: d */
    public final void mo118683d() {
        if (f83324d) {
            m124055a(Scene.CalDiagram, "cal_click_tab", "cal_month_diagram");
            f83323c = "cal_month_diagram";
        }
    }

    /* renamed from: e */
    public final void mo118685e() {
        if (f83324d) {
            m124055a(Scene.CalDiagram, "cal_click_tab", "cal_list_diagram");
            f83323c = "cal_list_diagram";
        }
    }

    /* renamed from: f */
    public final void mo118687f() {
        String str;
        if (f83324d && (str = f83323c) != null) {
            f83321a.m124057b(Scene.CalDiagram, "cal_click_tab", str);
            f83324d = false;
        }
    }

    /* renamed from: a */
    public final void mo118677a() {
        if (f83325e) {
            m124057b(Scene.CalDiagram, "cal_switch_diagram", "cal_diagram");
            f83325e = false;
        }
    }

    /* renamed from: a */
    public final void mo118678a(ErrorResult errorResult) {
        m124056a(Scene.CalBot, "cal_reply_rsvp", "cal_bot_card", errorResult);
    }

    /* renamed from: b */
    public final void mo118680b(ErrorResult errorResult) {
        m124056a(Scene.CalEventDetail, "cal_share_event", "cal_event_detail", errorResult);
    }

    /* renamed from: c */
    public final void mo118682c(ErrorResult errorResult) {
        m124056a(Scene.CalEventDetail, "cal_delete_event", "cal_event_detail", errorResult);
    }

    /* renamed from: d */
    public final void mo118684d(ErrorResult errorResult) {
        m124056a(Scene.CalEventDetail, "cal_reply_rsvp", "cal_event_detail", errorResult);
    }

    /* renamed from: e */
    public final void mo118686e(ErrorResult errorResult) {
        m124056a(Scene.CalEventDetail, "cal_enter_video", "cal_event_detail", errorResult);
    }

    /* renamed from: f */
    public final void mo118688f(ErrorResult errorResult) {
        m124056a(Scene.CalEventDetail, "cal_enter_meeting", "cal_event_detail", errorResult);
    }

    /* renamed from: g */
    public final void mo118690g(ErrorResult errorResult) {
        m124056a(Scene.CalEventDetail, "cal_enter_minutes", "cal_event_detail", errorResult);
    }

    /* renamed from: h */
    public final void mo118692h(ErrorResult errorResult) {
        m124056a(Scene.CalEventEdit, "cal_save_event", "cal_event_create", errorResult);
    }

    /* renamed from: a */
    private final void m124055a(Scene scene, String str, String str2) {
        f83322b.put(new AppreciableKey(scene, str, str2), AppreciableKit.f73094h.mo103524a().mo103511a(Biz.Calendar, scene, str, str2, (Map<String, String>) null));
    }

    /* renamed from: b */
    private final void m124057b(Scene scene, String str, String str2) {
        HashMap<AppreciableKey, String> hashMap = f83322b;
        String str3 = hashMap.get(new AppreciableKey(scene, str, str2));
        if (str3 != null) {
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            Intrinsics.checkExpressionValueIsNotNull(str3, "it");
            a.mo103515a(str3);
            hashMap.put(new AppreciableKey(scene, str, str2), null);
        }
    }

    /* renamed from: a */
    private final void m124056a(Scene scene, String str, String str2, ErrorResult errorResult) {
        ErrorType errorType;
        Biz biz = Biz.Calendar;
        if (errorResult == null || errorResult.getErrorCode() != 10008) {
            errorType = ErrorType.Other;
        } else {
            errorType = ErrorType.Network;
        }
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(biz, scene, errorType, ErrorLevel.Fatal, str, str2, null, null, SmActions.ACTION_ONTHECALL_EXIT, null));
    }
}
