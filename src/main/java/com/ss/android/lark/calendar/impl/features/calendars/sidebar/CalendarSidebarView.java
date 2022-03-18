package com.ss.android.lark.calendar.impl.features.calendars.sidebar;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.CalendarDetailGuideView;
import com.ss.android.lark.calendar.impl.features.common.helper.CalendarLogHelper;
import com.ss.android.lark.calendar.impl.features.settings.CalendarSettingActivity;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.framework.busevents.CalendarViewSwitchEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32501e;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\u0018\u0000 42\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0006\u0010\u0016\u001a\u00020\u0012J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\"\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190%H\u0016J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000eH\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0019H\u0016J\b\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\u0012H\u0002J\b\u00101\u001a\u00020\u0012H\u0002J\b\u00102\u001a\u00020\u0012H\u0002J\b\u00103\u001a\u00020\u0012H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "activity", "Landroid/app/Activity;", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter;", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mScrollToAccountRunnable", "Ljava/lang/Runnable;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewData;", "create", "", "destroy", "initRecycleView", "initSettingView", "onCaptured", "scrollToBlinkCalendar", "calendarId", "", "scrollToNewAccount", "newAccount", "scrollToPosition", "position", "", "count", "delay", "", "setActivity", "setCalendarSynced", "syncedCalendarIds", "", "setDependency", "vi", "vo", "setSyncedStatus", "serverId", "setUpdateCalendarErr", "syncErrorCalId", "showCalendarManagerDialog", "showCalendars", "showLocalCalendars", "startImportActivity", "startNewCalendarActivity", "startSubscribeActivity", "subscribePerfMonitor", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e */
public final class CalendarSidebarView implements CalendarSidebarContract.ICalendarSidebarView {

    /* renamed from: d */
    public static final Companion f76445d = new Companion(null);

    /* renamed from: a */
    public CalendarSidebarContract.IViewAction f76446a;

    /* renamed from: b */
    public Activity f76447b;

    /* renamed from: c */
    public final View f76448c;

    /* renamed from: e */
    private C30397a f76449e;

    /* renamed from: f */
    private LinearLayoutManager f76450f;

    /* renamed from: g */
    private CalendarSidebarContract.IViewData f76451g;

    /* renamed from: h */
    private Runnable f76452h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView$initRecycleView$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e$c */
    public static final class C30561c extends RecyclerView.OnScrollListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        }

        C30561c() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView$showCalendarManagerDialog$dialog$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog$Delegate;", "importCalendar", "", "newCalendar", "subscribeCalendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e$g */
    public static final class C30567g implements CalendarManagerDialog.Delegate {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarView f76463a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog.Delegate
        /* renamed from: b */
        public void mo109752b() {
            this.f76463a.mo110267e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog.Delegate
        /* renamed from: a */
        public void mo109751a() {
            this.f76463a.mo110266d();
            C32501e.m124356a("add_cal");
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog.Delegate
        /* renamed from: c */
        public void mo109753c() {
            this.f76463a.mo110268f();
            C32501e.m124356a("tripartite_add");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30567g(CalendarSidebarView eVar) {
            this.f76463a = eVar;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m113579h();
        m113580i();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Runnable runnable = this.f76452h;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\"\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView$initRecycleView$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter$OnRecyclerViewItemClickListener;", "onAddCalendarClick", "", "onCalendarItemClick", "calendarId", "", "isVisible", "", "isLocalCal", "onCalendarManageIconClick", "onGotoAccountManagePage", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onSelected", "select", "", "onSubscribeCalendarClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e$b */
    public static final class C30560b implements C30397a.AbstractC30399a {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarView f76453a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109743a() {
            C32501e.m124358a("add_cal", null, 2, null);
            this.f76453a.mo110265c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: b */
        public void mo109748b() {
            C32501e.m124358a("sub_cal", null, 2, null);
            this.f76453a.mo110267e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30560b(CalendarSidebarView eVar) {
            this.f76453a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109745a(AccountDataListItem aVar) {
            if (aVar != null) {
                CalendarSidebarView.m113575a(this.f76453a).mo110220a(aVar);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109744a(int i) {
            if (i == 0) {
                C32501e.m124358a("three_day_view", null, 2, null);
            } else if (i == 1) {
                C32501e.m124358a("day_view", null, 2, null);
            } else if (i == 2) {
                C32501e.m124358a("list_view", null, 2, null);
            } else if (i == 3) {
                C32501e.m124358a("month_view", null, 2, null);
            }
            EventBus.getDefault().trigger(new CalendarViewSwitchEvent(i));
            Activity activity = this.f76453a.f76447b;
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109746a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            C32501e.m124357a("calendar_detail", str);
            CalendarSidebarView.m113575a(this.f76453a).mo110221a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109747a(String str, boolean z, boolean z2) {
            String str2;
            if (str == null) {
                return;
            }
            if (z2) {
                CalendarSidebarView.m113575a(this.f76453a).mo110224b(str, z);
                return;
            }
            if (z) {
                str2 = "checkCal";
            } else {
                str2 = "uncheckCal";
            }
            Log.m165389i("CalendarSidebarView", C32673y.m125369a(str2));
            CalendarSidebarView.m113575a(this.f76453a).mo110222a(str, z);
        }
    }

    /* renamed from: d */
    public final void mo110266d() {
        CalendarSidebarContract.IViewAction eVar = this.f76446a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eVar.mo110219a();
    }

    /* renamed from: e */
    public final void mo110267e() {
        m113581j();
        CalendarSidebarContract.IViewAction eVar = this.f76446a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eVar.mo110223b();
    }

    /* renamed from: f */
    public final void mo110268f() {
        CalendarSidebarContract.IViewAction eVar = this.f76446a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eVar.mo110225c();
    }

    /* renamed from: g */
    public final void mo110269g() {
        List<DataListItem> list;
        CalendarLogHelper dVar = CalendarLogHelper.f78612a;
        C30397a aVar = this.f76449e;
        if (aVar != null) {
            list = aVar.mo109736b();
        } else {
            list = null;
        }
        dVar.mo112732a(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView$scrollToBlinkCalendar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e$e */
    static final class RunnableC30563e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30397a f76455a;

        /* renamed from: b */
        final /* synthetic */ CalendarSidebarView f76456b;

        /* renamed from: c */
        final /* synthetic */ String f76457c;

        RunnableC30563e(C30397a aVar, CalendarSidebarView eVar, String str) {
            this.f76455a = aVar;
            this.f76456b = eVar;
            this.f76457c = str;
        }

        public final void run() {
            ((RecyclerView) this.f76456b.f76448c.findViewById(R.id.calendarsRV)).addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarView.RunnableC30563e.C305641 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30563e f76458a;

                {
                    this.f76458a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                    if (i == 1) {
                        this.f76458a.f76455a.notifyDataSetChanged();
                        ((RecyclerView) this.f76458a.f76456b.f76448c.findViewById(R.id.calendarsRV)).removeOnScrollListener(this);
                    }
                }
            });
        }
    }

    /* renamed from: i */
    private final void m113580i() {
        ((LinearLayout) this.f76448c.findViewById(R.id.settingZone)).setOnClickListener(new View$OnClickListenerC30562d(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarView
    /* renamed from: b */
    public void mo110254b() {
        CalendarSidebarContract.IViewData fVar = this.f76451g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        List<DataListItem> c = fVar.mo110259c();
        C30397a aVar = this.f76449e;
        if (aVar != null) {
            aVar.mo109739c(c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e$f */
    public static final class RunnableC30565f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarView f76459a;

        /* renamed from: b */
        final /* synthetic */ int f76460b;

        /* renamed from: c */
        final /* synthetic */ int f76461c;

        RunnableC30565f(CalendarSidebarView eVar, int i, int i2) {
            this.f76459a = eVar;
            this.f76460b = i;
            this.f76461c = i2;
        }

        public final void run() {
            ((RecyclerView) this.f76459a.f76448c.findViewById(R.id.calendarsRV)).smoothScrollToPosition(this.f76460b + this.f76461c);
            ((RecyclerView) this.f76459a.f76448c.findViewById(R.id.calendarsRV)).postDelayed(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarView.RunnableC30565f.RunnableC305661 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30565f f76462a;

                {
                    this.f76462a = r1;
                }

                public final void run() {
                    ((RecyclerView) this.f76462a.f76459a.f76448c.findViewById(R.id.calendarsRV)).smoothScrollToPosition(this.f76462a.f76460b);
                }
            }, 1000);
        }
    }

    /* renamed from: j */
    private final void m113581j() {
        CalendarPerfMonitor.m124415a("key_subscribe_contact_calendar", "cal_perf_common", "scene_type", "subscribe_calendar", "extra_name", "contact_calendar");
        CalendarPerfMonitor.m124415a("key_subscribe_meetingroom_calendar", "cal_perf_common", "scene_type", "subscribe_calendar", "extra_name", "meetingroom_calendar");
        CalendarPerfMonitor.m124415a("key_subscribe_public_calendar", "cal_perf_common", "scene_type", "subscribe_calendar", "extra_name", "public_calendar");
    }

    /* renamed from: c */
    public final void mo110265c() {
        CalendarHitPoint.m124163v();
        Context context = this.f76448c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        new CalendarManagerDialog(context, new C30567g(this), true).mo109749a();
        C32501e.m124359b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarView
    /* renamed from: a */
    public void mo110251a() {
        CalendarSidebarContract.IViewData fVar = this.f76451g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        List<DataListItem> b = fVar.mo110258b();
        C30397a aVar = this.f76449e;
        if (aVar != null) {
            aVar.mo109737b(b);
        }
    }

    /* renamed from: h */
    private final void m113579h() {
        CalendarSidebarAdapter bVar = new CalendarSidebarAdapter();
        this.f76449e = bVar;
        if (bVar != null) {
            bVar.mo109732a();
        }
        C30397a aVar = this.f76449e;
        if (aVar != null) {
            aVar.mo109733a(new C30560b(this));
        }
        this.f76450f = new LinearLayoutManager(this.f76448c.getContext(), 1, false);
        RecyclerView recyclerView = (RecyclerView) this.f76448c.findViewById(R.id.calendarsRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.calendarsRV");
        recyclerView.setLayoutManager(this.f76450f);
        RecyclerView recyclerView2 = (RecyclerView) this.f76448c.findViewById(R.id.calendarsRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.calendarsRV");
        recyclerView2.setAdapter(this.f76449e);
        ((RecyclerView) this.f76448c.findViewById(R.id.calendarsRV)).addOnScrollListener(new C30561c());
        C30397a aVar2 = this.f76449e;
        if (aVar2 != null) {
            CalendarSidebarContract.IViewData fVar = this.f76451g;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            aVar2.mo109734a(fVar.mo110257a());
        }
        RecyclerView recyclerView3 = (RecyclerView) this.f76448c.findViewById(R.id.calendarsRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rootView.calendarsRV");
        FrameLayout frameLayout = (FrameLayout) this.f76448c.findViewById(R.id.fragmentContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.fragmentContainer");
        new CalendarDetailGuideView(recyclerView3, frameLayout);
    }

    /* renamed from: a */
    public final void mo110263a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f76447b = activity;
    }

    public CalendarSidebarView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f76448c = view;
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarSidebarContract.IViewAction m113575a(CalendarSidebarView eVar) {
        CalendarSidebarContract.IViewAction eVar2 = eVar.f76446a;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return eVar2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.e$d */
    public static final class View$OnClickListenerC30562d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarView f76454a;

        View$OnClickListenerC30562d(CalendarSidebarView eVar) {
            this.f76454a = eVar;
        }

        public final void onClick(View view) {
            C32501e.m124358a("calendar_main_setting", null, 2, null);
            C30022a.f74882a.appRouter().mo108210a(CalendarSettingActivity.class).mo108156b(this.f76454a.f76448c.getContext());
        }
    }

    /* renamed from: d */
    private final void m113578d(String str) {
        int i;
        C30397a aVar = this.f76449e;
        if (aVar != null) {
            i = aVar.getItemCount();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ((RecyclerView) this.f76448c.findViewById(R.id.calendarsRV)).findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition instanceof CalendarCellVH) {
                CalendarCellVH cVar = (CalendarCellVH) findViewHolderForAdapterPosition;
                if (Intrinsics.areEqual(str, cVar.mo109852d())) {
                    cVar.mo109853e();
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarView
    /* renamed from: b */
    public void mo110255b(String str) {
        int[] a;
        Intrinsics.checkParameterIsNotNull(str, "newAccount");
        C30397a aVar = this.f76449e;
        if (aVar != null && (a = aVar.mo109735a(str)) != null) {
            m113577a(this, a[0], a[1], 0, 4, null);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarView
    /* renamed from: c */
    public void mo110256c(String str) {
        int[] b;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        C30397a aVar = this.f76449e;
        if (aVar != null && (b = aVar.mo109738b(str)) != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "it.getBlinkCalendarPosit…calendarId) ?: return@let");
            m113576a(b[0], b[1], 500);
            UICallbackExecutor.executeDelayed(new RunnableC30563e(aVar, this, str), 500);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarView
    /* renamed from: a */
    public void mo110252a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "syncErrorCalId");
        m113578d(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarView
    /* renamed from: a */
    public void mo110253a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "syncedCalendarIds");
        for (String str : list) {
            m113578d(str);
        }
    }

    /* renamed from: a */
    public void mo109795a(CalendarSidebarContract.IViewData fVar, CalendarSidebarContract.IViewAction eVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "vi");
        Intrinsics.checkParameterIsNotNull(eVar, "vo");
        this.f76451g = fVar;
        this.f76446a = eVar;
    }

    /* renamed from: a */
    private final void m113576a(int i, int i2, long j) {
        LinearLayoutManager linearLayoutManager = this.f76450f;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        RunnableC30565f fVar = new RunnableC30565f(this, i, i2);
        this.f76452h = fVar;
        if (fVar != null) {
            UICallbackExecutor.removeCallbacks(fVar);
        }
        UICallbackExecutor.executeDelayed(this.f76452h, j);
    }

    /* renamed from: a */
    static /* synthetic */ void m113577a(CalendarSidebarView eVar, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j = 1000;
        }
        eVar.m113576a(i, i2, j);
    }
}
