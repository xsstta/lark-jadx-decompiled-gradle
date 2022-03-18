package com.ss.android.lark.calendar.impl.features.common.featureswitch;

import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30048l;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b5\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0007J\u0006\u0010)\u001a\u00020\u0007J\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020\u0007J\u0006\u0010.\u001a\u00020\u0007J\u0006\u0010/\u001a\u00020\u0007J\u0006\u00100\u001a\u00020\u0007J\u0006\u00101\u001a\u00020\u0007J\u0006\u00102\u001a\u00020\u0007J\u0006\u00103\u001a\u00020\u0007J\u0006\u00104\u001a\u00020\u0007J\u0006\u00105\u001a\u00020\u0007J\u0006\u00106\u001a\u00020\u0007J\u0006\u00107\u001a\u00020\u0007J\u0006\u00108\u001a\u00020\u0007J\u0006\u00109\u001a\u00020\u0007J\u0006\u0010:\u001a\u00020\u0007R\u0013\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\r\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0013\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0013\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\bR\u001b\u0010\u0017\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u0019\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\bR\u000e\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/featureswitch/CalendarFeatureGating;", "", "()V", "fgDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IFeatureGatingDependency;", "Lorg/jetbrains/annotations/NotNull;", "isCalendarAddAttendeeDepartmentEnabled", "", "()Z", "isCalendarAddAttendeeDepartmentEnabled$delegate", "Lkotlin/Lazy;", "isCalendarCreateOptimiseEnable", "isCalendarCreateOptimiseEnable$delegate", "isCalendarMeetingStatusEnabled", "isCalendarMeetingStatusEnabled$delegate", "isCalendarRemarkDisable", "isCalendarRemarkDisable$delegate", "isCalendarResourceRefactorEnable", "isCalendarResourceRefactorEnable$delegate", "isDayDrawCanvasEnable", "isDayDrawCanvasEnable$delegate", "isFixChipStripeEnable", "isFixChipStripeEnable$delegate", "isGuideV2Enabled", "isGuideV2Enabled$delegate", "isNewCalendarMainViewEnable", "isNewCalendarMainViewEnable$delegate", "isTransferChatterPickerDisable", "isTransferChatterPickerDisable$delegate", "mIsCalendarEventSwitchEnable", "mIsInitCalendarEventSwitch", "mIsInitMultiTimeZoneFG", "mIsMultiTimeZoneEnable", "isCalendarCloseGoogle", "isCalendarEditPermission", "isCalendarEventVideoConfigEnable", "isCalendarInviteVirtualMail", "isCalendarLaunchPreloadEnable", "isCalendarLiveHostEnabled", "isCalendarMeetingDetailEnabled", "isCalendarMessageCardOptimize", "isCalendarResignedEnabled", "isCalendarTabFeelGoodEnabled", "isCalendarTransferOptimize", "isCalendarVcPreSettingEnabled", "isEnableMultiTimeZone", "isEventReplyButtonEnable", "isEventShareExternalEnable", "isEventShareWeChatDegraded", "isEventSwitchCalendarEnable", "isMeetingRoomLevelsEnabled", "isMeetingRoomMultiSelectEnabled", "isMeetingRoomsFilterEnabled", "isReportEventEnable", "isRoomProfileRefactorEnable", "isShowGoogleVideoMeeting", "isShowTrustPartyEntranceEnable", "isUserImportExchangeEnabled", "isWebviewPreload", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a */
public final class CalendarFeatureGating {

    /* renamed from: b */
    public static final Companion f78588b = new Companion(null);

    /* renamed from: q */
    private static final List<String> f78589q = CollectionsKt.listOf((Object[]) new String[]{"6960874476485492739", "6914821733941772289"});

    /* renamed from: a */
    public final AbstractC30048l f78590a;

    /* renamed from: c */
    private boolean f78591c;

    /* renamed from: d */
    private boolean f78592d;

    /* renamed from: e */
    private final Lazy f78593e = LazyKt.lazy(new C31124i(this));

    /* renamed from: f */
    private final Lazy f78594f = LazyKt.lazy(new C31119d(this));

    /* renamed from: g */
    private final Lazy f78595g = LazyKt.lazy(new C31117b(this));

    /* renamed from: h */
    private boolean f78596h;

    /* renamed from: i */
    private boolean f78597i;

    /* renamed from: j */
    private final Lazy f78598j = LazyKt.lazy(new C31123h(this));

    /* renamed from: k */
    private final Lazy f78599k = LazyKt.lazy(new C31118c(this));

    /* renamed from: l */
    private final Lazy f78600l = LazyKt.lazy(new C31120e(this));

    /* renamed from: m */
    private final Lazy f78601m = LazyKt.lazy(new C31126k(this));

    /* renamed from: n */
    private final Lazy f78602n = LazyKt.lazy(new C31125j(this));

    /* renamed from: o */
    private final Lazy f78603o = LazyKt.lazy(new C31122g(this));

    /* renamed from: p */
    private final Lazy f78604p = LazyKt.lazy(new C31121f(this));

    /* renamed from: A */
    public final boolean mo112687A() {
        return ((Boolean) this.f78599k.getValue()).booleanValue();
    }

    /* renamed from: B */
    public final boolean mo112688B() {
        return ((Boolean) this.f78600l.getValue()).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo112689C() {
        return ((Boolean) this.f78601m.getValue()).booleanValue();
    }

    /* renamed from: D */
    public final boolean mo112690D() {
        return ((Boolean) this.f78602n.getValue()).booleanValue();
    }

    /* renamed from: E */
    public final boolean mo112691E() {
        return ((Boolean) this.f78603o.getValue()).booleanValue();
    }

    /* renamed from: F */
    public final boolean mo112692F() {
        return ((Boolean) this.f78604p.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo112701i() {
        return ((Boolean) this.f78594f.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo112702j() {
        return ((Boolean) this.f78595g.getValue()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo112706n() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo112709q() {
        return true;
    }

    /* renamed from: v */
    public final boolean mo112714v() {
        return ((Boolean) this.f78598j.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/featureswitch/CalendarFeatureGating$Companion;", "", "()V", "FEATURE_KEY_ANDROID_CALENDAR_ROOM_LEVELS", "", "FEATURE_KEY_ANDROID_MEETING_ROOM_FILTER", "FEATURE_KEY_CALENDAR_ATTENDEE_DEPARTMENT", "FEATURE_KEY_CALENDAR_CALENDARVIEW_DAY_DRAW", "FEATURE_KEY_CALENDAR_CALENDARVIEW_MAIN", "FEATURE_KEY_CALENDAR_CALENDAR_CREATE_OPTIMIZE", "FEATURE_KEY_CALENDAR_CALENDAR_DISABLE_REMARK", "FEATURE_KEY_CALENDAR_CLOSE_GOOGLE", "FEATURE_KEY_CALENDAR_EDIT_PERMISSION", "FEATURE_KEY_CALENDAR_EDIT_VIDEO_CONFIG", "FEATURE_KEY_CALENDAR_EVENT_MEETING_STATUS", "FEATURE_KEY_CALENDAR_EVENT_SWITCH", "FEATURE_KEY_CALENDAR_FIRST_TAB_PRELOAD", "FEATURE_KEY_CALENDAR_INVITE_VIRTUAL_MAIL", "FEATURE_KEY_CALENDAR_LIVE_HOST", "FEATURE_KEY_CALENDAR_MEETINGROOM_MULTISELECT", "FEATURE_KEY_CALENDAR_MEETING_DETAIL", "FEATURE_KEY_CALENDAR_MEETING_ROOM_REFACTOR", "FEATURE_KEY_CALENDAR_MESSAGE_CARD_OPTIMIZE", "FEATURE_KEY_CALENDAR_REPORT_EVENT", "FEATURE_KEY_CALENDAR_SHARE_EXTERNAL", "FEATURE_KEY_CALENDAR_SHARE_WECHAT_DEGRADED", "FEATURE_KEY_CALENDAR_TRANSFER_CHATTER_PICKER", "FEATURE_KEY_CALENDAR_TRANSFER_OPTIMIZE", "FEATURE_KEY_CALENDAR_VC_PRE_SETTING", "FEATURE_KEY_CAL_TAB_FEEL_GOOD", "FEATURE_KEY_CREATOR_RESIGNED", "FEATURE_KEY_FIX_CHIP", "FEATURE_KEY_GUIDE_V2", "FEATURE_KEY_MULTI_TIME_ZONE", "FEATURE_KEY_ROOM_PROFILE_REFACTOR", "FEATURE_KEY_SHOW_EVENT_REPLY_BUTTON", "FEATURE_KEY_SHOW_GOOGLE_VIDEO_MEETING", "FEATURE_KEY_SHOW_TRUST_PARTY_ENTRANCE", "FEATURE_KEY_USER_IMPORT_EXCHANGE", "FEATURE_KEY_WEBVIEW_PRELOAD", "GREENTOWN_TENANT_IDS", "", "mIsInitListOptimizeFG", "", "mIsInitOpenEventOptimizeFG", "mListOptimizeEnable", "mOpenEventOptimizeEnable", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo112693a() {
        return this.f78590a.mo108237a("feishu.report", false);
    }

    /* renamed from: b */
    public final boolean mo112694b() {
        return this.f78590a.mo108237a("calendar.close.google", false);
    }

    /* renamed from: d */
    public final boolean mo112696d() {
        return this.f78590a.mo108237a("calendar.google.video_meeting", false);
    }

    /* renamed from: e */
    public final boolean mo112697e() {
        return this.f78590a.mo108237a("calendar.invite.virtual_mail", false);
    }

    /* renamed from: f */
    public final boolean mo112698f() {
        return this.f78590a.mo108237a("calendar.android.webview.preload", true);
    }

    /* renamed from: g */
    public final boolean mo112699g() {
        return this.f78590a.mo108237a("calendar.share.external", false);
    }

    /* renamed from: h */
    public final boolean mo112700h() {
        return this.f78590a.mo108237a("calendar.share.wechat.degraded", true);
    }

    /* renamed from: l */
    public final boolean mo112704l() {
        return this.f78590a.mo108237a("calendar.live.host", false);
    }

    /* renamed from: m */
    public final boolean mo112705m() {
        return this.f78590a.mo108237a("calendar.vc.setting", true);
    }

    /* renamed from: p */
    public final boolean mo112708p() {
        return this.f78590a.mo108237a("lark.cal.transfer_event_opt", true);
    }

    /* renamed from: r */
    public final boolean mo112710r() {
        return this.f78590a.mo108237a("lark.cal.event_organizer_display_refactor", false);
    }

    /* renamed from: s */
    public final boolean mo112711s() {
        return this.f78590a.mo108237a("calendar.event_edit.video_meeting_config", false);
    }

    /* renamed from: t */
    public final boolean mo112712t() {
        return this.f78590a.mo108237a("calendar.exchange.import", false);
    }

    /* renamed from: u */
    public final boolean mo112713u() {
        return this.f78590a.mo108237a("calendar.cal.tab.feel.good", false);
    }

    /* renamed from: w */
    public final boolean mo112715w() {
        return this.f78590a.mo108237a("calendar.meetingroom.multiselect", false);
    }

    /* renamed from: x */
    public final boolean mo112716x() {
        return this.f78590a.mo108238b("calendar.room.profile.refactor", false);
    }

    /* renamed from: y */
    public final boolean mo112717y() {
        return this.f78590a.mo108238b("calendar.show.trust.party.entrance", true);
    }

    /* renamed from: z */
    public final boolean mo112718z() {
        return this.f78590a.mo108238b("calendar.event.reply_button", false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$b */
    static final class C31117b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31117b(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.attendee.department_460", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$c */
    static final class C31118c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31118c(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.calendar.create_optimize", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$d */
    static final class C31119d extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31119d(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.event.video_meeting_status", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$e */
    static final class C31120e extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31120e(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.calendar.disable_remark", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$f */
    static final class C31121f extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31121f(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.resource.refactor", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$g */
    static final class C31122g extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31122g(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.calendarview.day.draw", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$h */
    static final class C31123h extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31123h(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.fix.chip.stripe", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$i */
    static final class C31124i extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31124i(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108237a("calendar.guide.v2", true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$j */
    static final class C31125j extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31125j(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.calendarview.main", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.a$k */
    static final class C31126k extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CalendarFeatureGating this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31126k(CalendarFeatureGating aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.f78590a.mo108238b("calendar.transfer.chatter.picker", false);
        }
    }

    /* renamed from: c */
    public final boolean mo112695c() {
        if (!this.f78591c) {
            this.f78592d = this.f78590a.mo108237a("calendar.multi.time.zone.v2", false);
            this.f78591c = true;
        }
        return this.f78592d;
    }

    /* renamed from: k */
    public final boolean mo112703k() {
        if (!this.f78596h) {
            this.f78597i = this.f78590a.mo108237a("calendar.event.switch", false);
            this.f78596h = true;
        }
        return this.f78597i;
    }

    /* renamed from: o */
    public final boolean mo112707o() {
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        if (f78589q.contains(loginDependency.mo108271c())) {
            return true;
        }
        return this.f78590a.mo108238b("calendar.room.levels", false);
    }

    public CalendarFeatureGating() {
        AbstractC30048l featureGatingDependency = C30022a.f74882a.featureGatingDependency();
        Intrinsics.checkExpressionValueIsNotNull(featureGatingDependency, "CalendarDependencyHolder…featureGatingDependency()");
        this.f78590a = featureGatingDependency;
    }
}
