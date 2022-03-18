package com.ss.android.lark.calendar.impl.features.calendarview.main.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.calendar.dependency.idependency.ICommonDependency;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarFeelGoodManager;
import com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface;
import com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel;
import com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.ViewMode;
import com.ss.android.lark.calendar.impl.features.common.widget.p1500b.C31164a;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarMainHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchMemoryMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.PerfHelper;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32487d;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32489g;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.C32508b;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30028g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002>?B\u0005¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0016H\u0002J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u00020\u0016H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\b\u00102\u001a\u00020\u0016H\u0016J\b\u00103\u001a\u00020\u0016H\u0002J\u001a\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u00106\u001a\u00020\u0016H\u0002J\u0010\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020(H\u0016J\b\u00109\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u0016H\u0002J\b\u0010;\u001a\u00020\u0016H\u0002J\b\u0010<\u001a\u00020\u0016H\u0002J\u0010\u0010=\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/CalendarShellViewFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarMainFragmentInterface;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "()V", "calendarFeelGoodManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager;", "getCalendarFeelGoodManager", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager;", "calendarFeelGoodManager$delegate", "Lkotlin/Lazy;", "shellView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/ShellView;", "subTag", "", "titleController", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/ITitleControllerProxy;", "viewModeFragmentManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/CalendarShellViewFragment$ViewModeFragmentManager;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/viewmodel/CalendarShellViewModel;", "appLinkToCalendar", "", "calendarMode", "", "targetDay", "(ILjava/lang/Integer;)V", "appLinkToMeetingRoom", "(Ljava/lang/Integer;)V", "appendEvent", "doAction", "", ShareHitPoint.f121869d, "payload", "", "handlePageSwitch", "preIsCalTab", "curIsCalTab", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onPause", "onResume", "onSelectedDateChanged", "onViewCreated", "view", "routeEventDetail", "setArgumentsFromSpec", "args", "showDialogWhenTimeZoneInvalid", "switchInCalendar", "switchOutCalendar", "syncViewMode", "updateTitleController", "Companion", "ViewModeFragmentManager", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a */
public final class CalendarShellViewFragment extends BaseFragment implements CalendarMainFragmentInterface, ActionDispatcher {

    /* renamed from: c */
    public static final Companion f77823c = new Companion(null);

    /* renamed from: a */
    public final CalendarShellViewModel f77824a = CalendarShellViewModel.f77899a;

    /* renamed from: b */
    public ShellView f77825b;

    /* renamed from: d */
    private final String f77826d = "ShellViewFragment";

    /* renamed from: e */
    private AbstractC30028g f77827e;

    /* renamed from: f */
    private final ViewModeFragmentManager f77828f = new ViewModeFragmentManager();

    /* renamed from: g */
    private final Lazy f77829g = LazyKt.lazy(C30897c.INSTANCE);

    /* renamed from: h */
    private HashMap f77830h;

    /* renamed from: e */
    private final CalendarFeelGoodManager m115270e() {
        return (CalendarFeelGoodManager) this.f77829g.getValue();
    }

    /* renamed from: d */
    public void mo111902d() {
        HashMap hashMap = this.f77830h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/CalendarShellViewFragment$Companion;", "", "()V", "ACTION_APPEND_EVENT", "", "ACTION_SELECT_CALENDAR", "ACTION_SELECT_MEETING_ROOM", "LOG_TAG", "MANAGE_APPLICATIONS", "SCHEME", "SETTINGS", "createCalendarFragment", "Landroidx/fragment/app/Fragment;", "calendarViewMode", "", "createMeetingRoomFragment", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/MeetingRoomDiagramFragment;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final MeetingRoomDiagramFragment mo111904a() {
            return new MeetingRoomDiagramFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo111903a(int i) {
            if (i == 0) {
                return new MultiDayDiagramFragment();
            }
            if (i == 1) {
                return new SingleDayDiagramFragment();
            }
            if (i == 2) {
                return new ListDiagramFragment();
            }
            if (i != 3) {
                return new MultiDayDiagramFragment();
            }
            return new MonthDiagramFragment();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\"\u0010\r\u001a\u00020\t2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0011H\bJ\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\t*\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\u0016\u001a\u00020\t*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/CalendarShellViewFragment$ViewModeFragmentManager;", "", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/CalendarShellViewFragment;)V", "calendarFragment", "Landroidx/fragment/app/Fragment;", "calendarViewMode", "", "meetingRoomFragment", "clearCalendarFragment", "", "preload", "requireCalendarFragment", "requireMeetingRoomFragment", "safeCommit", "actions", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "showCalendarFragment", "showMeetingRoomFragment", "hideFragment", "fragment", "showFragment", "containerViewId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$b */
    public final class ViewModeFragmentManager {

        /* renamed from: b */
        private int f77832b;

        /* renamed from: c */
        private Fragment f77833c;

        /* renamed from: d */
        private Fragment f77834d;

        /* renamed from: f */
        private final Fragment m115287f() {
            Fragment fragment = this.f77834d;
            if (fragment != null) {
                return fragment;
            }
            MeetingRoomDiagramFragment a = CalendarShellViewFragment.f77823c.mo111904a();
            this.f77834d = a;
            return a;
        }

        /* renamed from: e */
        private final Fragment m115286e() {
            if (CalendarShellViewFragment.this.f77824a.mo111970c().mo112002b() != this.f77832b) {
                this.f77832b = CalendarShellViewFragment.this.f77824a.mo111970c().mo112002b();
                this.f77833c = null;
            }
            Fragment fragment = this.f77833c;
            if (fragment != null) {
                return fragment;
            }
            Fragment a = CalendarShellViewFragment.f77823c.mo111903a(this.f77832b);
            this.f77833c = a;
            return a;
        }

        /* renamed from: a */
        public final void mo111905a() {
            Fragment fragment;
            if (CalendarShellViewFragment.this.f77824a.mo111970c().mo112001a()) {
                fragment = m115287f();
            } else {
                fragment = m115286e();
            }
            if (!(fragment instanceof CalendarViewFragmentPreload)) {
                fragment = null;
            }
            CalendarViewFragmentPreload bVar = (CalendarViewFragmentPreload) fragment;
            if (bVar != null) {
                bVar.mo111918a();
            }
            C30022a.f74882a.mainModuleDependency().mo108279b();
        }

        /* renamed from: b */
        public final void mo111906b() {
            if (CalendarShellViewFragment.this.isActive()) {
                FragmentTransaction beginTransaction = CalendarShellViewFragment.this.getChildFragmentManager().beginTransaction();
                m115285a(beginTransaction, this.f77834d);
                m115284a(beginTransaction, R.id.calendar_view_shell_calendar_container, m115286e());
                beginTransaction.commitAllowingStateLoss();
            }
        }

        /* renamed from: c */
        public final void mo111907c() {
            Fragment fragment = this.f77833c;
            if (fragment != null) {
                this.f77833c = null;
                if (CalendarShellViewFragment.this.isActive()) {
                    FragmentTransaction beginTransaction = CalendarShellViewFragment.this.getChildFragmentManager().beginTransaction();
                    beginTransaction.remove(fragment);
                    beginTransaction.commitAllowingStateLoss();
                }
            }
        }

        /* renamed from: d */
        public final void mo111908d() {
            if (CalendarShellViewFragment.this.isActive()) {
                FragmentTransaction beginTransaction = CalendarShellViewFragment.this.getChildFragmentManager().beginTransaction();
                m115285a(beginTransaction, this.f77833c);
                m115284a(beginTransaction, R.id.calendar_view_shell_meeting_room_container, m115287f());
                beginTransaction.commitAllowingStateLoss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewModeFragmentManager() {
            this.f77832b = CalendarShellViewFragment.this.f77824a.mo111970c().mo112002b();
        }

        /* renamed from: a */
        private final void m115285a(FragmentTransaction fragmentTransaction, Fragment fragment) {
            if (fragment != null && fragment.isAdded()) {
                fragmentTransaction.setMaxLifecycle(fragment, Lifecycle.State.STARTED);
            }
        }

        /* renamed from: a */
        private final void m115284a(FragmentTransaction fragmentTransaction, int i, Fragment fragment) {
            if (fragment.isAdded()) {
                fragmentTransaction.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            } else {
                fragmentTransaction.replace(i, fragment);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$c */
    static final class C30897c extends Lambda implements Function0<CalendarFeelGoodManager> {
        public static final C30897c INSTANCE = new C30897c();

        C30897c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarFeelGoodManager invoke() {
            if (C30022a.f74883b.mo112713u()) {
                return new CalendarFeelGoodManager();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$i */
    static final class RunnableC30903i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f77835a;

        RunnableC30903i(Context context) {
            this.f77835a = context;
        }

        public final void run() {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.CalendarShellViewFragment.RunnableC30903i.C309041 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30903i f77836a;

                {
                    this.f77836a = r1;
                }

                public final boolean queueIdle() {
                    C31164a.m116337a().mo112895a(this.f77836a.f77835a);
                    return false;
                }
            });
        }
    }

    /* renamed from: h */
    private final void m115273h() {
        CalendarFeelGoodManager e = m115270e();
        if (e != null) {
            e.mo110713a();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f77825b = null;
        mo111902d();
    }

    /* renamed from: b */
    public final void mo111900b() {
        AbstractC30028g gVar = this.f77827e;
        if (gVar != null) {
            gVar.mo108169a(C32646c.m125257a(this.f77824a.mo111995t()));
        }
        CalendarMainHitPoint.m124364a("day_change", null, null, 6, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.m165389i("CalendarShellView", this.f77826d + ": onPause");
        LaunchPerfMonitor.m124429d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.m165389i("CalendarShellView", this.f77826d + ": onResume");
    }

    public CalendarShellViewFragment() {
        Log.m165389i("CalendarShellView", "ShellViewFragment" + ": constructed");
    }

    /* renamed from: f */
    private final void m115271f() {
        Bundle bundle;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            Intent intent = activity.getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null && bundle.getBoolean("enter_calendar_tab_from_offline_push", false)) {
                C31238b.m116881d(activity, bundle);
                bundle.putBoolean("enter_calendar_tab_from_offline_push", false);
                Log.m165389i("CalendarShellView", "startEventDetailActivityFromOfflinePush");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.m165389i("CalendarShellView", this.f77826d + ": onDestroy");
        this.f77824a.mo111993r();
        CalendarFeelGoodManager e = m115270e();
        if (e != null) {
            e.mo110713a();
        }
    }

    /* renamed from: g */
    private final void m115272g() {
        if (this.f77824a.mo111970c().mo112001a()) {
            GeneralHitPoint.m124169B();
        } else {
            CalendarMainHitPoint.m124362a();
        }
        GeneralHitPoint.m124229b();
        int b = this.f77824a.mo111970c().mo112002b();
        if (b == 0) {
            AppreciableHitPoint.f83321a.mo118681c();
        } else if (b == 1) {
            AppreciableHitPoint.f83321a.mo118679b();
        } else if (b == 2) {
            AppreciableHitPoint.f83321a.mo118685e();
        } else if (b == 3) {
            AppreciableHitPoint.f83321a.mo118683d();
        }
        CalendarFeelGoodManager e = m115270e();
        if (e != null) {
            e.mo110714a(getActivity());
        }
    }

    /* renamed from: i */
    private final void m115274i() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            if (this.f77824a.mo111982o() <= 0 || this.f77824a.mo111991p() <= 0) {
                EditActivityEntrance.f79940a.mo114667a((Context) activity, this.f77824a.mo111995t(), true);
                return;
            }
            GeneralHitPoint.m124207a("instance_block", "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
            activity.startActivity(EditActivityEntrance.f79940a.mo114660a(activity, new long[]{this.f77824a.mo111982o(), this.f77824a.mo111991p()}));
        }
    }

    /* renamed from: a */
    public final void mo111899a() {
        ViewMode c = this.f77824a.mo111970c();
        Log.m165389i("CalendarShellView", "syncViewMode " + c);
        if (c.mo112001a()) {
            ShellView hVar = this.f77825b;
            if (hVar != null) {
                hVar.mo111950d();
            }
            this.f77828f.mo111908d();
            return;
        }
        ShellView hVar2 = this.f77825b;
        if (hVar2 != null) {
            hVar2.mo111949c();
        }
        this.f77828f.mo111906b();
    }

    /* renamed from: c */
    public final void mo111901c() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).title(R.string.Calendar_Toast_FailToCreateEvent)).message(R.string.Calendar_Alert_FailToGetTimezone)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_ManageApp, new DialogInterface$OnClickListenerC30906k(activity))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, DialogInterface$OnClickListenerC30907l.f77838a)).show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/viewmodel/ViewMode;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$d */
    static final class C30898d extends Lambda implements Function1<ViewMode, Unit> {
        final /* synthetic */ CalendarShellViewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30898d(CalendarShellViewFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ViewMode aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ViewMode aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            this.this$0.mo111899a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/busevents/AccountChangedEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$f */
    static final class C30900f extends Lambda implements Function1<C32485a, Unit> {
        final /* synthetic */ CalendarShellViewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30900f(CalendarShellViewFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32485a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C32485a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            ShellView hVar = this.this$0.f77825b;
            if (hVar != null) {
                hVar.mo111952f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/busevents/CalendarColdLaunchFinishEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$g */
    static final class C30901g extends Lambda implements Function1<C32487d, Unit> {
        final /* synthetic */ CalendarShellViewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30901g(CalendarShellViewFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32487d dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C32487d dVar) {
            ShellView hVar;
            Intrinsics.checkParameterIsNotNull(dVar, "it");
            if (this.this$0.isResumed() && (hVar = this.this$0.f77825b) != null) {
                hVar.mo111947a(this.this$0.getActivity());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/busevents/InvalidTimeZoneEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$h */
    static final class C30902h extends Lambda implements Function1<C32489g, Unit> {
        final /* synthetic */ CalendarShellViewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30902h(CalendarShellViewFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32489g gVar) {
            invoke(gVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C32489g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            this.this$0.mo111901c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$j */
    static final class C30905j extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ CalendarShellViewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30905j(CalendarShellViewFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final void invoke(int i) {
            this.this$0.mo111900b();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface
    /* renamed from: a */
    public void mo111855a(AbstractC30028g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "titleController");
        this.f77827e = gVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$e */
    static final class C30899e extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ CalendarShellViewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30899e(CalendarShellViewFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final void invoke(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "it");
            ShellView hVar = this.this$0.f77825b;
            if (hVar != null) {
                hVar.mo111951e();
            }
        }
    }

    /* renamed from: a */
    private final void m115269a(Integer num) {
        if (num != null) {
            this.f77824a.mo111968b(num.intValue());
        }
        this.f77824a.mo111994s();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        Log.m165389i("CalendarShellView", this.f77826d + ": onCreate");
        LaunchPerfMonitor.m124422a(PerfHelper.m124435a());
        LaunchPerfMonitor.m124421a();
        LaunchPerfMonitor.m124423a("CalendarShellView", String.valueOf(true));
        LaunchMemoryMonitor.m124419a(PerfHelper.m124435a());
        this.f77824a.mo111992q();
        this.f77828f.mo111905a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface
    /* renamed from: a */
    public void mo111854a(Bundle bundle) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bundle, "args");
        String string = bundle.getString("cal_tab_page_from");
        String string2 = bundle.getString("view_type");
        String string3 = bundle.getString("view_date");
        Log.m165389i("CalendarShellView", "setArgumentsFromSpec " + string + ", " + string2 + ", " + string3);
        if (!(!Intrinsics.areEqual(string, "from_app_link"))) {
            String str = string3;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            Integer num = null;
            if (!z) {
                try {
                    CalendarDate timeInSeconds = new CalendarDate().setTimeInSeconds(Long.parseLong(string3));
                    Intrinsics.checkExpressionValueIsNotNull(timeInSeconds, "CalendarDate().setTimeInSeconds(viewDate.toLong())");
                    num = Integer.valueOf(timeInSeconds.getJulianDay());
                } catch (NumberFormatException unused) {
                }
            }
            if (string2 != null) {
                switch (string2.hashCode()) {
                    case -1558685317:
                        if (string2.equals("three_day")) {
                            m115268a(0, num);
                            return;
                        }
                        break;
                    case 99228:
                        if (string2.equals("day")) {
                            m115268a(1, num);
                            return;
                        }
                        break;
                    case 3322014:
                        if (string2.equals("list")) {
                            m115268a(2, num);
                            return;
                        }
                        break;
                    case 104080000:
                        if (string2.equals("month")) {
                            m115268a(3, num);
                            return;
                        }
                        break;
                    case 942033467:
                        if (string2.equals("meeting")) {
                            m115269a(num);
                            return;
                        }
                        break;
                }
            }
            if (this.f77824a.mo111970c().mo112001a()) {
                m115269a(num);
            } else {
                m115268a(this.f77824a.mo111970c().mo112002b(), num);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$l */
    public static final class DialogInterface$OnClickListenerC30907l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC30907l f77838a = new DialogInterface$OnClickListenerC30907l();

        DialogInterface$OnClickListenerC30907l() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private final void m115268a(int i, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            this.f77828f.mo111907c();
            this.f77824a.mo111964a(intValue);
        }
        this.f77824a.mo111966a(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.a$k */
    public static final class DialogInterface$OnClickListenerC30906k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f77837a;

        DialogInterface$OnClickListenerC30906k(FragmentActivity fragmentActivity) {
            this.f77837a = fragmentActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f77837a.getPackageName(), null));
            intent.setClassName("com.android.settings", "com.android.settings.ManageApplications");
            this.f77837a.startActivity(intent);
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher
    public boolean doAction(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Log.m165389i("CalendarShellView", this.f77826d + ": doAction " + str);
        int hashCode = str.hashCode();
        if (hashCode != -1501879170) {
            if (hashCode != -255821991) {
                if (hashCode != 983886616 || !str.equals("ACTION_SELECT_CALENDAR")) {
                    return false;
                }
                CalendarShellViewModel.m115386a(this.f77824a, null, 1, null);
            } else if (!str.equals("ACTION_SELECT_MEETING_ROOM")) {
                return false;
            } else {
                this.f77824a.mo111994s();
            }
        } else if (!str.equals("ACTION_APPEND_EVENT")) {
            return false;
        } else {
            m115274i();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo111899a();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "viewLifecycleOwner");
        C32508b.m124448a(this.f77824a.mo111967b(), viewLifecycleOwner, new C30898d(this));
        C30905j jVar = new C30905j(this);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner2, "viewLifecycleOwner");
        C32508b.m124448a(this.f77824a.mo111971d(), viewLifecycleOwner2, jVar);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner3, "viewLifecycleOwner");
        C32508b.m124448a(this.f77824a.mo111972e(), viewLifecycleOwner3, jVar);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner4, "viewLifecycleOwner");
        C32508b.m124448a(this.f77824a.mo111981n(), viewLifecycleOwner4, new C30899e(this));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner5, "viewLifecycleOwner");
        C32508b.m124448a(this.f77824a.mo111975h(), viewLifecycleOwner5, new C30900f(this));
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner6, "viewLifecycleOwner");
        C32508b.m124448a(this.f77824a.mo111978k(), viewLifecycleOwner6, new C30901g(this));
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner7, "viewLifecycleOwner");
        C32508b.m124448a(this.f77824a.mo111979l(), viewLifecycleOwner7, new C30902h(this));
        m115271f();
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        Context applicationContext = context.getApplicationContext();
        ICommonDependency commonDependency = C30022a.f74882a.commonDependency();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "application");
        if (!commonDependency.mo108227a(applicationContext) && C30022a.f74883b.mo112698f()) {
            view.postDelayed(new RunnableC30903i(applicationContext), 3000);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface
    /* renamed from: a */
    public void mo111856a(boolean z, boolean z2) {
        Lifecycle.State state;
        Log.m165389i("CalendarShellView", "handlePageSwitch preIsCalTab = " + z + " curIsCalTab = " + z2);
        if (z != z2) {
            if (z2) {
                m115272g();
            } else {
                m115273h();
            }
            C30076a.m111290a().mo108427a(z2);
            C30022a.f74884c.mo108457c(z2);
            if (isActive()) {
                FragmentTransaction beginTransaction = getParentFragmentManager().beginTransaction();
                CalendarShellViewFragment aVar = this;
                if (z2) {
                    state = Lifecycle.State.RESUMED;
                } else {
                    state = Lifecycle.State.STARTED;
                }
                beginTransaction.setMaxLifecycle(aVar, state).commitAllowingStateLoss();
            }
        } else if (z2) {
            this.f77824a.mo111996u();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        LaunchPerfMonitor.m124428c("show_grid");
        Context context = layoutInflater.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "inflater.context");
        ShellView hVar = new ShellView(context);
        hVar.mo111948a(this);
        this.f77825b = hVar;
        return hVar;
    }
}
