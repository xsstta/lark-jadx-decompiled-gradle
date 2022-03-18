package com.ss.android.lark.calendar.impl.features.common.widget.guide;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.GuidePopupWindow;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30050n;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u00010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jd\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0003JH\u0010\u001a\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0003J\u001c\u0010\u001f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010 \u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010!\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010\"\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J&\u0010#\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J(\u0010'\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u001c\u0010(\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010)\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010*\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0006\u0010+\u001a\u00020\nJ\u0006\u0010,\u001a\u00020\nJ\b\u0010-\u001a\u00020\u0006H\u0007J\u0006\u0010.\u001a\u00020\u0006J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/CalendarGuideManager;", "", "()V", "DELAY_MILLIS", "", "isShowedAddEmailGuide", "", "isShowedSwitchThirdPartCalendar", "sIsShowing", "checkForShowBubble", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "guideKey", "", "guideMsg", "arrowGravity", "", "arrowOffset", "leftText", "leftAction", "Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/GuideButtonAction;", "rightText", "rightAction", "checkForShowTip", "whichTip", "Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/GuidePopupWindow$WHICH;", "listener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/CalendarGuideManager$CheckAndShowGuideExecutedListener;", "checkToFindBuildingRoomGuide", "checkToFindRoomGuide", "checkToShowAddThirdPartCalendar", "checkToShowEditEventVideoConfigGuide", "checkToShowEditPageGuide", "switchCalendarAnchorView", "addEmailAttendeeAnchorView", "checkToShowPreVideoConferenceSetting", "checkToShowSwitchCalendar", "checkToShowViewAddEmailAttendee", "checkToShowViewTimeZoneFindTime", "checkToShowViewTimeZoneSwitchView", "completeAllCalendarDetailGuide", "completeCalendarListDetailGuide", "isShowingGuide", "needAllCalendarDetailGuide", "needCalendarListDetailGuide", "CheckAndShowGuideExecutedListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.guide.a */
public final class CalendarGuideManager {

    /* renamed from: a */
    public static final CalendarGuideManager f78922a = new CalendarGuideManager();

    /* renamed from: b */
    private static boolean f78923b;

    /* renamed from: c */
    private static boolean f78924c;

    /* renamed from: d */
    private static boolean f78925d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/CalendarGuideManager$CheckAndShowGuideExecutedListener;", "", "onCheckAndShowGuideExecuted", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.guide.a$a */
    public interface CheckAndShowGuideExecutedListener {
        /* renamed from: a */
        void mo113201a();
    }

    private CalendarGuideManager() {
    }

    /* renamed from: e */
    public final boolean mo113198e() {
        return f78923b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/guide/CalendarGuideManager$checkToShowEditPageGuide$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/CalendarGuideManager$CheckAndShowGuideExecutedListener;", "onCheckAndShowGuideExecuted", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.guide.a$c */
    public static final class C31214c implements CheckAndShowGuideExecutedListener {

        /* renamed from: a */
        final /* synthetic */ Activity f78934a;

        /* renamed from: b */
        final /* synthetic */ View f78935b;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager.CheckAndShowGuideExecutedListener
        /* renamed from: a */
        public void mo113201a() {
            CalendarGuideManager.f78922a.mo113193c(this.f78934a, this.f78935b);
        }

        C31214c(Activity activity, View view) {
            this.f78934a = activity;
            this.f78935b = view;
        }
    }

    /* renamed from: d */
    public final void mo113195d() {
        C30022a.f74882a.guideModuleDependency().mo108242a("mobile_calendar_list_detail_guide");
    }

    /* renamed from: b */
    public final void mo113191b() {
        if (C30022a.f74883b.mo112687A()) {
            C30022a.f74882a.guideModuleDependency().mo108242a("all_calendar_detail_guide");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.guide.a$b */
    public static final class RunnableC31213b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f78926a;

        /* renamed from: b */
        final /* synthetic */ AbstractC30050n f78927b;

        /* renamed from: c */
        final /* synthetic */ String f78928c;

        /* renamed from: d */
        final /* synthetic */ Activity f78929d;

        /* renamed from: e */
        final /* synthetic */ String f78930e;

        /* renamed from: f */
        final /* synthetic */ int f78931f;

        /* renamed from: g */
        final /* synthetic */ int f78932g;

        /* renamed from: h */
        final /* synthetic */ CheckAndShowGuideExecutedListener f78933h;

        RunnableC31213b(View view, AbstractC30050n nVar, String str, Activity activity, String str2, int i, int i2, CheckAndShowGuideExecutedListener aVar) {
            this.f78926a = view;
            this.f78927b = nVar;
            this.f78928c = str;
            this.f78929d = activity;
            this.f78930e = str2;
            this.f78931f = i;
            this.f78932g = i2;
            this.f78933h = aVar;
        }

        public final void run() {
            if (this.f78926a.getVisibility() == 0) {
                this.f78927b.mo108243a(this.f78928c, this.f78929d, this.f78926a, this.f78930e, this.f78931f, this.f78932g);
            }
            CheckAndShowGuideExecutedListener aVar = this.f78933h;
            if (aVar != null) {
                aVar.mo113201a();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo113194c() {
        if (C30022a.f74883b.mo112687A()) {
            return C30022a.f74882a.guideModuleDependency().mo108244b("mobile_calendar_list_detail_guide");
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo113190a() {
        if (C30022a.f74883b.mo112687A()) {
            return C30022a.f74882a.guideModuleDependency().mo108244b("all_calendar_detail_guide");
        }
        return false;
    }

    /* renamed from: c */
    public final void mo113193c(Activity activity, View view) {
        if (!f78924c) {
            m116626a(this, activity, view, "all_calendar_add_email_attendee", GuidePopupWindow.WHICH.ADD_EMAIL_ATTENDEE, 80, 0, null, 64, null);
            f78924c = true;
        }
    }

    /* renamed from: d */
    public final void mo113196d(Activity activity, View view) {
        m116626a(this, activity, view, "event_detail_vc_pre_setting", GuidePopupWindow.WHICH.EVENT_VC_PRE_SETTING, 3, 0, null, 64, null);
    }

    /* renamed from: e */
    public final void mo113197e(Activity activity, View view) {
        m116626a(this, activity, view, "all_calendar_event_set_vc", GuidePopupWindow.WHICH.EVENT_VC_EDIT_CONFIG, 48, 0, null, 64, null);
    }

    /* renamed from: f */
    public final void mo113199f(Activity activity, View view) {
        m116626a(this, activity, view, "all_calendar_tab_findrooms", GuidePopupWindow.WHICH.FIND_ROOM, 48, 0, null, 64, null);
    }

    /* renamed from: g */
    public final void mo113200g(Activity activity, View view) {
        m116626a(this, activity, view, "all_calendar_tab_findrooms_building", GuidePopupWindow.WHICH.FIND_BUILDING_ROOM, 80, 0, null, 64, null);
    }

    /* renamed from: b */
    public final void mo113192b(Activity activity, View view) {
        m116626a(this, activity, view, "mobile_calendar_multi_timezone_find_time", GuidePopupWindow.WHICH.TIME_ZONE_FIND_TIME, 80, 0, null, 64, null);
    }

    /* renamed from: a */
    public final void mo113187a(Activity activity, View view) {
        if (C30022a.f74884c.mo108456c().isShowOtherTimeZone()) {
            m116626a(this, activity, view, "mobile_calendar_multi_timezone", GuidePopupWindow.WHICH.TIME_ZONE_SWITCH_VIEW, 80, 0, null, 64, null);
        }
    }

    /* renamed from: a */
    public final void mo113188a(Activity activity, View view, View view2) {
        if (f78925d) {
            mo113193c(activity, view2);
        } else {
            mo113189a(activity, view, new C31214c(activity, view2));
        }
    }

    /* renamed from: a */
    public final void mo113189a(Activity activity, View view, CheckAndShowGuideExecutedListener aVar) {
        if (!f78925d) {
            m116624a(activity, view, "all_calendar_switch_third_party", GuidePopupWindow.WHICH.SWITCH_THIRD_PART_CALENDAR, 48, UIHelper.dp2px(-8.0f), aVar);
            f78925d = true;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m116625a(CalendarGuideManager aVar, Activity activity, View view, CheckAndShowGuideExecutedListener aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        aVar.mo113189a(activity, view, aVar2);
    }

    /* renamed from: a */
    private final void m116624a(Activity activity, View view, String str, GuidePopupWindow.WHICH which, int i, int i2, CheckAndShowGuideExecutedListener aVar) {
        AbstractC30050n guideModuleDependency = C30022a.f74882a.guideModuleDependency();
        if (view != null && activity != null) {
            GuidePopupWindow.f78921a.mo113186a(which);
            view.postDelayed(new RunnableC31213b(view, guideModuleDependency, str, activity, C32634ae.m125182b(GuidePopupWindow.f78921a.mo113186a(which)), i, i2, aVar), 200);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m116626a(CalendarGuideManager aVar, Activity activity, View view, String str, GuidePopupWindow.WHICH which, int i, int i2, CheckAndShowGuideExecutedListener aVar2, int i3, Object obj) {
        CheckAndShowGuideExecutedListener aVar3;
        if ((i3 & 64) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar2;
        }
        aVar.m116624a(activity, view, str, which, i, i2, aVar3);
    }
}
