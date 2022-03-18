package com.ss.android.lark.calendar.impl.features.calendarview.main.container;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarAppendView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.MonitorFirstDrawFrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.C32631ab;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30034ad;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u000223B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0014J\b\u0010$\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'J\b\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\u000e\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001bJ\u0006\u00101\u001a\u00020\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "containerAction", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer$IContainerAction;", "getContainerAction", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer$IContainerAction;", "setContainerAction", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer$IContainerAction;)V", "diagramContainer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/MonitorFirstDrawFrameLayout;", "getDiagramContainer", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/MonitorFirstDrawFrameLayout;", "eventAppendView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarAppendView;", "getEventAppendView", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarAppendView;", "mDiagramView", "Landroid/view/View;", "mIndicatorHeight", "", "mSDKSyncLoadingView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingView;", "mTitleHeight", "selectedEndTime", "", "selectedStartTime", "viewIndicator", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator;", "getViewIndicator", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator;", "addDiagramView", "", "diagramView", "appendViewClickHandler", "checkShowAppendEventGuide", "activity", "Landroid/app/Activity;", "createAndAddLoadingView", "perfLaunchMonitor", "removeLoadingView", "setSDKSyncLoadingVisible", "isShow", "", "setSelectedAppendTime", "startTime", "endTime", "showDialogWhenTimeZoneInvalid", "Companion", "IContainerAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.a */
public final class CalendarDiagramContainer {

    /* renamed from: a */
    public static final Companion f77790a = new Companion(null);

    /* renamed from: b */
    private final int f77791b;

    /* renamed from: c */
    private final int f77792c;

    /* renamed from: d */
    private IContainerAction f77793d;

    /* renamed from: e */
    private final ViewIndicator f77794e;

    /* renamed from: f */
    private final MonitorFirstDrawFrameLayout f77795f;

    /* renamed from: g */
    private View f77796g;

    /* renamed from: h */
    private final CalendarAppendView f77797h;

    /* renamed from: i */
    private RequestLoadingView f77798i;

    /* renamed from: j */
    private long f77799j = -1;

    /* renamed from: k */
    private long f77800k = -1;

    /* renamed from: l */
    private final Context f77801l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer$IContainerAction;", "", "onCalendarSelected", "", "onOpenAppendEventActivity", "startTime", "", "endTime", "onRoomSelected", "onStartActivity", "intent", "Landroid/content/Intent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.a$b */
    public interface IContainerAction {
        /* renamed from: a */
        void mo111872a();

        /* renamed from: a */
        void mo111873a(long j, long j2);

        /* renamed from: a */
        void mo111874a(Intent intent);

        /* renamed from: b */
        void mo111875b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer$Companion;", "", "()V", "MANAGE_APPLICATIONS", "", "SCHEME", "SETTINGS", "TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IContainerAction mo111857a() {
        return this.f77793d;
    }

    /* renamed from: b */
    public final ViewIndicator mo111863b() {
        return this.f77794e;
    }

    /* renamed from: c */
    public final MonitorFirstDrawFrameLayout mo111864c() {
        return this.f77795f;
    }

    /* renamed from: d */
    public final CalendarAppendView mo111865d() {
        return this.f77797h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer$perfLaunchMonitor$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.a$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC30891d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDiagramContainer f77805a;

        public void onGlobalLayout() {
            LaunchPerfMonitor.m124425b();
            this.f77805a.mo111864c().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC30891d(CalendarDiagramContainer aVar) {
            this.f77805a = aVar;
        }
    }

    /* renamed from: g */
    private final void m115226g() {
        this.f77795f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC30891d(this));
    }

    /* renamed from: i */
    private final void m115228i() {
        ViewParent viewParent;
        ViewParent viewParent2;
        RequestLoadingView requestLoadingView = this.f77798i;
        if (requestLoadingView != null) {
            if (requestLoadingView != null) {
                viewParent = requestLoadingView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                RequestLoadingView requestLoadingView2 = this.f77798i;
                if (requestLoadingView2 != null) {
                    viewParent2 = requestLoadingView2.getParent();
                } else {
                    viewParent2 = null;
                }
                if (viewParent2 != null) {
                    ((ViewGroup) viewParent2).removeView(this.f77798i);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        }
        this.f77798i = null;
    }

    /* renamed from: e */
    public final void mo111866e() {
        if (!C32631ab.m125168a()) {
            Log.m165389i("CalendarDiagramContainer", C32673y.m125369a("eventAdd"));
            IContainerAction bVar = this.f77793d;
            if (bVar != null) {
                bVar.mo111873a(this.f77799j, this.f77800k);
            }
            GeneralHitPoint.m124207a("create_event_btn", "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
            GeneralHitPoint.m124172J("full_create_event");
        }
    }

    /* renamed from: f */
    public final void mo111867f() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f77801l).title(R.string.Calendar_Toast_FailToCreateEvent)).message(R.string.Calendar_Alert_FailToGetTimezone)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_ManageApp, new DialogInterface$OnClickListenerC30892e(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, DialogInterface$OnClickListenerC30893f.f77807a)).show();
    }

    /* renamed from: h */
    private final void m115227h() {
        ViewParent viewParent;
        RequestLoadingView requestLoadingView = this.f77798i;
        if (requestLoadingView != null) {
            if (requestLoadingView != null) {
                viewParent = requestLoadingView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                RequestLoadingView requestLoadingView2 = this.f77798i;
                if (requestLoadingView2 != null) {
                    requestLoadingView2.bringToFront();
                }
                RequestLoadingView requestLoadingView3 = this.f77798i;
                if (requestLoadingView3 != null) {
                    requestLoadingView3.setVisibility(0);
                    return;
                }
                return;
            }
        }
        this.f77798i = new RequestLoadingView(this.f77801l, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = UIUtils.dp2px(this.f77801l, 128.0f);
        this.f77795f.addView(this.f77798i, layoutParams);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.a$c */
    public static final class View$OnClickListenerC30890c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDiagramContainer f77804a;

        View$OnClickListenerC30890c(CalendarDiagramContainer aVar) {
            this.f77804a = aVar;
        }

        public final void onClick(View view) {
            this.f77804a.mo111866e();
        }
    }

    /* renamed from: a */
    public final void mo111861a(IContainerAction bVar) {
        this.f77793d = bVar;
    }

    /* renamed from: a */
    public final void mo111859a(Activity activity) {
        C30022a.f74882a.guideModuleDependency().mo108241a(activity, this.f77797h.getAppendView(), new View$OnClickListenerC30890c(this));
    }

    /* renamed from: a */
    public final void mo111862a(boolean z) {
        if (z) {
            m115227h();
        } else {
            m115228i();
        }
    }

    /* renamed from: a */
    public final void mo111860a(View view) {
        Log.m165389i("CalendarDiagramContainer", C32673y.m125378d("addDiagramView diagramView = " + view));
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            View view2 = this.f77796g;
            if (view2 != null) {
                this.f77795f.removeView(view2);
            }
            this.f77796g = view;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = this.f77791b + this.f77792c;
            this.f77795f.addView(view, layoutParams);
            C30022a.f74882a.mainModuleDependency().mo108281d();
            this.f77797h.bringToFront();
            m115226g();
        }
    }

    public CalendarDiagramContainer(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77801l = context;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.calendar_view_title_height);
        this.f77791b = dimensionPixelSize;
        this.f77792c = context.getResources().getDimensionPixelSize(R.dimen.calendar_view_indicator_height);
        ViewIndicator viewIndicator = new ViewIndicator(context, null, 0, 6, null);
        this.f77794e = viewIndicator;
        MonitorFirstDrawFrameLayout monitorFirstDrawFrameLayout = new MonitorFirstDrawFrameLayout(context, null, 0, 6, null);
        this.f77795f = monitorFirstDrawFrameLayout;
        CalendarAppendView calendarAppendView = new CalendarAppendView(context, null);
        this.f77797h = calendarAppendView;
        ViewParent parent = calendarAppendView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(calendarAppendView);
            Log.m165383e("CalendarDiagramContainer", C32673y.m125378d("eventAppendView has parent"));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        monitorFirstDrawFrameLayout.addView(calendarAppendView, layoutParams);
        calendarAppendView.setClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer.View$OnClickListenerC308871 */

            /* renamed from: a */
            final /* synthetic */ CalendarDiagramContainer f77802a;

            {
                this.f77802a = r1;
            }

            public final void onClick(View view) {
                this.f77802a.mo111866e();
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dimensionPixelSize;
        monitorFirstDrawFrameLayout.addView(viewIndicator, layoutParams2);
        monitorFirstDrawFrameLayout.setFirstPageViewListener(new MonitorFirstDrawFrameLayout.FirstPageViewListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer.C308882 */

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.MonitorFirstDrawFrameLayout.FirstPageViewListener
            /* renamed from: a */
            public void mo111869a() {
                C30022a.f74882a.mainModuleDependency().mo108280c();
            }
        });
        viewIndicator.setClickListener(new ViewIndicator.IndicatorClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer.C308893 */

            /* renamed from: a */
            final /* synthetic */ CalendarDiagramContainer f77803a;

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator.IndicatorClickListener
            /* renamed from: a */
            public void mo111870a() {
                IContainerAction a = this.f77803a.mo111857a();
                if (a != null) {
                    a.mo111872a();
                }
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator.IndicatorClickListener
            /* renamed from: b */
            public void mo111871b() {
                IContainerAction a = this.f77803a.mo111857a();
                if (a != null) {
                    a.mo111875b();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f77803a = r1;
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.a$f */
    public static final class DialogInterface$OnClickListenerC30893f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC30893f f77807a = new DialogInterface$OnClickListenerC30893f();

        DialogInterface$OnClickListenerC30893f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo111858a(long j, long j2) {
        this.f77799j = j;
        this.f77800k = j2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.a.a$e */
    public static final class DialogInterface$OnClickListenerC30892e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDiagramContainer f77806a;

        DialogInterface$OnClickListenerC30892e(CalendarDiagramContainer aVar) {
            this.f77806a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            AbstractC30034ad adVar = C30022a.f74882a.settingDependency();
            Intrinsics.checkExpressionValueIsNotNull(adVar, "CalendarDependencyHolder…dency.settingDependency()");
            Context a = adVar.mo108177a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…ttingDependency().context");
            intent.setData(Uri.fromParts("package", a.getPackageName(), null));
            intent.setClassName("com.android.settings", "com.android.settings.ManageApplications");
            IContainerAction a2 = this.f77806a.mo111857a();
            if (a2 != null) {
                a2.mo111874a(intent);
            }
            dialogInterface.dismiss();
        }
    }
}
