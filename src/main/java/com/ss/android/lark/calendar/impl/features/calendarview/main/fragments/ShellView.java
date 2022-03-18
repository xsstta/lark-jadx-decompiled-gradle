package com.ss.android.lark.calendar.impl.features.calendarview.main.fragments;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.View$OnAttachStateChangeListenerC0913o;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarAppendView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001e\u001a\u00020\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/ShellView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator$IndicatorClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionDispatcher", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "getActionDispatcher", "()Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "setActionDispatcher", "(Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;)V", "addEventClickListener", "Landroid/view/View$OnClickListener;", "calendarFragmentContainer", "eventAppendView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarAppendView;", "meetingRoomFragmentContainer", "viewIndicator", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator;", "addEvent", "", "animateAppendButton", "monitorFirstContentDraw", "content", "Landroid/view/View;", "monitorFirstFrameDraw", "onCalendarSelected", "onRoomSelected", "selectCalendar", "selectRoom", "showAppendEventGuide", "Landroid/app/Activity;", "activity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.h */
public final class ShellView extends FrameLayout implements ViewIndicator.IndicatorClickListener {

    /* renamed from: a */
    private ActionDispatcher f77873a;

    /* renamed from: b */
    private final FrameLayout f77874b;

    /* renamed from: c */
    private final FrameLayout f77875c;

    /* renamed from: d */
    private final ViewIndicator f77876d;

    /* renamed from: e */
    private final CalendarAppendView f77877e;

    /* renamed from: f */
    private final View.OnClickListener f77878f;

    /* renamed from: e */
    public final void mo111951e() {
        this.f77877e.mo110615a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.h$b */
    public static final class RunnableC30923b implements Runnable {

        /* renamed from: a */
        public static final RunnableC30923b f77880a = new RunnableC30923b();

        RunnableC30923b() {
        }

        public final void run() {
            C30022a.f74882a.mainModuleDependency().mo108281d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.h$c */
    public static final class RunnableC30924c implements Runnable {

        /* renamed from: a */
        public static final RunnableC30924c f77881a = new RunnableC30924c();

        RunnableC30924c() {
        }

        public final void run() {
            C30022a.f74882a.mainModuleDependency().mo108280c();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator.IndicatorClickListener
    /* renamed from: b */
    public void mo111871b() {
        ActionDispatcher aVar = this.f77873a;
        if (aVar != null) {
            ActionDispatcher.C32507a.m124446a(aVar, "ACTION_SELECT_MEETING_ROOM", null, 2, null);
        }
    }

    /* renamed from: f */
    public final void mo111952f() {
        View$OnAttachStateChangeListenerC0913o.m4399a(this, RunnableC30924c.f77881a);
        invalidate();
    }

    /* renamed from: c */
    public final void mo111949c() {
        this.f77876d.mo112654c();
        this.f77874b.setVisibility(0);
        this.f77875c.setVisibility(8);
        m115346a(this.f77874b);
    }

    /* renamed from: d */
    public final void mo111950d() {
        this.f77876d.mo112655d();
        this.f77874b.setVisibility(8);
        this.f77875c.setVisibility(0);
        m115346a(this.f77875c);
    }

    /* renamed from: g */
    public final void mo111953g() {
        ActionDispatcher aVar = this.f77873a;
        if (aVar != null) {
            ActionDispatcher.C32507a.m124446a(aVar, "ACTION_APPEND_EVENT", null, 2, null);
        }
        GeneralHitPoint.m124207a("create_event_btn", "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
        GeneralHitPoint.m124172J("full_create_event");
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator.IndicatorClickListener
    /* renamed from: a */
    public void mo111870a() {
        ActionDispatcher aVar = this.f77873a;
        if (aVar != null) {
            ActionDispatcher.C32507a.m124446a(aVar, "ACTION_SELECT_CALENDAR", null, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo111948a(ActionDispatcher aVar) {
        this.f77873a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.h$a */
    static final class View$OnClickListenerC30922a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShellView f77879a;

        View$OnClickListenerC30922a(ShellView hVar) {
            this.f77879a = hVar;
        }

        public final void onClick(View view) {
            this.f77879a.mo111953g();
        }
    }

    /* renamed from: a */
    private final void m115346a(View view) {
        View$OnAttachStateChangeListenerC0913o.m4399a(view, RunnableC30923b.f77880a);
        view.invalidate();
    }

    /* renamed from: a */
    public final Activity mo111947a(Activity activity) {
        if (activity == null) {
            return null;
        }
        C30022a.f74882a.guideModuleDependency().mo108241a(activity, this.f77877e, this.f77878f);
        return activity;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShellView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f77874b = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f77875c = frameLayout2;
        ViewIndicator viewIndicator = new ViewIndicator(context, null, 0, 6, null);
        this.f77876d = viewIndicator;
        CalendarAppendView calendarAppendView = new CalendarAppendView(context, null);
        this.f77877e = calendarAppendView;
        View$OnClickListenerC30922a aVar = new View$OnClickListenerC30922a(this);
        this.f77878f = aVar;
        setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.calendar_view_title_height), 0, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.calendar_view_indicator_height);
        addView(viewIndicator, new FrameLayout.LayoutParams(-1, dimensionPixelSize));
        viewIndicator.setClickListener(this);
        frameLayout.setId(R.id.calendar_view_shell_calendar_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = dimensionPixelSize;
        addView(frameLayout, layoutParams);
        frameLayout2.setId(R.id.calendar_view_shell_meeting_room_container);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = dimensionPixelSize;
        addView(frameLayout2, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388693;
        addView(calendarAppendView, layoutParams3);
        calendarAppendView.setClickListener(aVar);
        mo111952f();
    }
}
