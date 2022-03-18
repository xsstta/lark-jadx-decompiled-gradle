package com.ss.android.lark.calendar.impl.features.calendarview.main.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1170p;
import androidx.lifecycle.LifecycleOwner;
import butterknife.ButterKnife;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.DragSaveProcess;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarTabContainer;
import com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel;
import com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.ViewMode;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.EventDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.LocalDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarMainHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32490h;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.C32508b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.LongRange;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\fH$J\u001a\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0014J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020*H\u0016J\u001a\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020*H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8DX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/CalendarViewFragmentPreload;", "()V", "adapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment$DiagramControllerAdapter;", "getAdapter", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment$DiagramControllerAdapter;", "setAdapter", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment$DiagramControllerAdapter;)V", "diagramController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "getDiagramController", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "diagramController$delegate", "Lkotlin/Lazy;", "isViewModeChanged", "", "logTag", "", "subTag", "getSubTag", "()Ljava/lang/String;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/viewmodel/CalendarShellViewModel;", "createController", "doAction", ShareHitPoint.f121869d, "payload", "", "getTimeZone", "Ljava/util/TimeZone;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onPause", "onResume", "onViewCreated", "view", "preloadData", "DiagramControllerAdapter", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c */
public abstract class DiagramControllerAdapterFragment extends BaseFragment implements CalendarViewFragmentPreload, ActionDispatcher {

    /* renamed from: a */
    public final CalendarShellViewModel f77839a = CalendarShellViewModel.f77899a;

    /* renamed from: b */
    public boolean f77840b = true;

    /* renamed from: c */
    private final String f77841c = "CalendarShellView";

    /* renamed from: d */
    private final String f77842d = "";

    /* renamed from: e */
    private final Lazy f77843e = LazyKt.lazy(new C30910b(this));

    /* renamed from: f */
    private DiagramControllerAdapter f77844f;

    /* renamed from: g */
    private HashMap f77845g;

    /* access modifiers changed from: protected */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001`B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020#J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u0004\u0018\u00010'J\u0006\u0010(\u001a\u00020#J\u0018\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0011H\u0016J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0011H\u0016J\b\u00101\u001a\u00020#H\u0016J\u0012\u00102\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u001c\u00102\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010'H\u0016J\b\u00106\u001a\u00020#H\u0016J\b\u00107\u001a\u00020#H\u0016J\b\u00108\u001a\u00020#H\u0016J\u0006\u00109\u001a\u00020#J\u000e\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0015J\u000e\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020#J\u0010\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0011H\u0016J \u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020D2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001aH\u0016J\u0010\u0010E\u001a\u00020#2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020\u000eH\u0016J\u0010\u0010J\u001a\u00020#2\u0006\u0010F\u001a\u00020GH\u0016J\u0018\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0015H\u0016J$\u0010O\u001a\u00020#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u0015H\u0016J\b\u0010S\u001a\u00020#H\u0016J\u001a\u0010T\u001a\u00020#2\b\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010N\u001a\u00020\u0015H\u0016J\u0006\u0010W\u001a\u00020#J\b\u0010X\u001a\u00020#H\u0002J\u0010\u0010Y\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0011H\u0016J\u000e\u0010Z\u001a\u00020#2\u0006\u0010[\u001a\u00020\\J\u0012\u0010]\u001a\u00020#2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0006\u0010^\u001a\u00020#J\u000e\u0010_\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aXD¢\u0006\u0002\n\u0000R.\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u00110\u00112\u000e\u0010\u001b\u001a\n \u001c*\u0004\u0018\u00010\u00110\u0011@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment$DiagramControllerAdapter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramDelegate;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess$DragSaveListener;", "activity", "Landroid/app/Activity;", "diagramController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "actionDispatcher", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "timeZone", "Ljava/util/TimeZone;", "selectedDay", "", "(Landroid/app/Activity;Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;Ljava/util/TimeZone;I)V", "currentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "dragSaveProcess", "Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess;", "isTabArrowUpDown", "", "()Z", "setTabArrowUpDown", "(Z)V", "refreshMaskIntervalMs", "", "value", "kotlin.jvm.PlatformType", "selectedDate", "setSelectedDate", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;)V", "tabContainer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarTabContainer;", "addEventReloadTask", "", "backToday", "cancelEventTransmit", "create", "Landroid/view/View;", "destroy", "eventTransmit", "startTime", "endTime", "getActivity", "getCurrentDate", "getDINAlternateBoldTypeface", "Landroid/graphics/Typeface;", "getSelectedDate", "hideSdkSyncLoading", "injectView", "annotationTarget", "", "container", "moveLogicDateToToday", "onActiveRefresh", "onCancelSave", "onHide", "onShow", "isViewModeChanged", "onViewCreated", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "refreshAllPage", "refreshMonthTitle", "date", "saveNoRepeatEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "setTabProgress", "process", "", "setTabScrollByMoveToToday", "animDuration", "setTabScrollProgress", "startActivityByIntent", "intent", "Landroid/content/Intent;", "isOpenNearbyClick", "startAppendEventActivity", "context", "Landroid/content/Context;", "fromPlusBtn", "startAppendViewAnimation", "startEventDetailActivity", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "updateAccount", "updateCurrentDate", "updateSelectDate", "updateSettings", "settings", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "updateTabView", "updateTimeFormat", "updateTimeZone", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$a */
    public static final class DiagramControllerAdapter implements CalendarDaysContract.AbstractC30658d, DragSaveProcess.DragSaveListener, IDateLogicData, IDiagramDelegate {

        /* renamed from: d */
        public static final Companion f77846d = new Companion(null);

        /* renamed from: a */
        public final long f77847a = 60000;

        /* renamed from: b */
        public final Activity f77848b;

        /* renamed from: c */
        public final IDiagramController f77849c;

        /* renamed from: e */
        private boolean f77850e;

        /* renamed from: f */
        private final DragSaveProcess f77851f = new DragSaveProcess(new C30908b(this));

        /* renamed from: g */
        private final CalendarTabContainer f77852g = new CalendarTabContainer();

        /* renamed from: h */
        private CalendarDate f77853h = new CalendarDate(this.f77856k);

        /* renamed from: i */
        private CalendarDate f77854i;

        /* renamed from: j */
        private final ActionDispatcher f77855j;

        /* renamed from: k */
        private TimeZone f77856k;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: b */
        public void mo111636b(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u00020\b*\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment$DiagramControllerAdapter$Companion;", "", "()V", "ACTION_ANIMATE_APPEND", "", "ACTION_CHANGE_SELECTED_DATE", "ACTION_CHANGE_SELECTED_TIME", "changeSelectedDate", "", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "selectedDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "changeSelectedTime", "range", "Lkotlin/ranges/LongRange;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final boolean mo111937a(ActionDispatcher aVar, CalendarDate calendarDate) {
                Intrinsics.checkParameterIsNotNull(aVar, "$this$changeSelectedDate");
                Intrinsics.checkParameterIsNotNull(calendarDate, "selectedDate");
                return aVar.doAction("ACTION_CHANGE_SELECTED_DATE", calendarDate);
            }

            /* renamed from: a */
            public final boolean mo111938a(ActionDispatcher aVar, LongRange nVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$this$changeSelectedTime");
                Intrinsics.checkParameterIsNotNull(nVar, "range");
                return aVar.doAction("ACTION_CHANGE_SELECTED_TIME", nVar);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.DragSaveProcess.DragSaveListener
        /* renamed from: a */
        public void mo111622a() {
            mo111936o();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.DragSaveProcess.DragSaveListener
        /* renamed from: b */
        public void mo111623b() {
            mo111936o();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate, com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData
        /* renamed from: d */
        public CalendarDate mo111630d() {
            return this.f77853h;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: g */
        public void mo111641g() {
            mo111936o();
        }

        /* renamed from: a */
        public final void mo111928a(boolean z) {
            this.f77850e = z;
        }

        /* renamed from: a */
        public final void mo111927a(TimeZone timeZone) {
            Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
            this.f77856k = timeZone;
            m115300c(new CalendarDate(this.f77854i, timeZone));
            CalendarDate calendarDate = new CalendarDate(timeZone);
            this.f77853h = calendarDate;
            this.f77852g.mo111883a(calendarDate);
            IDiagramController iVar = this.f77849c;
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "timeZone.id");
            iVar.mo110994a(id);
            this.f77849c.mo111003i();
            mo111936o();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108518a(Object obj, View view) {
            if (obj != null && view != null) {
                ButterKnife.bind(obj, view);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$a$b */
        static final class C30908b extends Lambda implements Function0<Activity> {
            final /* synthetic */ DiagramControllerAdapter this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30908b(DiagramControllerAdapter aVar) {
                super(0);
                this.this$0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Activity invoke() {
                return this.this$0.f77848b;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate, com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData
        /* renamed from: c */
        public CalendarDate mo111629c() {
            CalendarDate calendarDate = this.f77854i;
            Intrinsics.checkExpressionValueIsNotNull(calendarDate, "selectedDate");
            return calendarDate;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: e */
        public void mo111639e() {
            m115300c(mo111630d());
        }

        /* renamed from: j */
        public final void mo111931j() {
            this.f77849c.mo111006l();
        }

        /* renamed from: l */
        public final void mo111933l() {
            this.f77849c.mo111004j();
        }

        /* renamed from: m */
        public final void mo111934m() {
            this.f77849c.mo111005k();
        }

        /* renamed from: n */
        public final void mo111935n() {
            this.f77849c.mo111001g();
        }

        /* renamed from: o */
        public final void mo111936o() {
            this.f77849c.mo111002h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: f */
        public void mo111640f() {
            ActionDispatcher.C32507a.m124446a(this.f77855j, "ACTION_ANIMATE_APPEND", null, 2, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: h */
        public void mo111642h() {
            f77846d.mo111938a(this.f77855j, LongRange.f173258c.mo239428a());
        }

        /* renamed from: k */
        public final void mo111932k() {
            this.f77849c.mo110998d();
            this.f77849c.destroy();
            this.f77851f.mo111612a();
            mo111642h();
        }

        /* renamed from: p */
        private final void m115301p() {
            int julianDay = this.f77853h.getJulianDay();
            CalendarDate calendarDate = new CalendarDate(this.f77856k);
            this.f77853h = calendarDate;
            if (julianDay != calendarDate.getJulianDay()) {
                this.f77849c.mo110996b(this.f77853h);
                this.f77849c.mo111001g();
                this.f77852g.mo111883a(this.f77853h);
                this.f77852g.mo111881a((float) this.f77854i.dayDiff(this.f77853h));
            }
        }

        /* renamed from: i */
        public final View mo111930i() {
            this.f77851f.mo111614a(this);
            this.f77849c.mo110990a(this.f77848b);
            this.f77849c.mo110992a(this, this, this);
            this.f77849c.mo110997c();
            return this.f77849c.mo110995b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111631a(float f) {
            this.f77852g.mo111881a(f);
        }

        /* renamed from: c */
        private final void m115300c(CalendarDate calendarDate) {
            this.f77854i = calendarDate;
            Companion aVar = f77846d;
            ActionDispatcher aVar2 = this.f77855j;
            Intrinsics.checkExpressionValueIsNotNull(calendarDate, "value");
            aVar.mo111937a(aVar2, calendarDate);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111632a(int i) {
            this.f77852g.mo111882a(i);
        }

        /* renamed from: b */
        public final void mo111929b(boolean z) {
            if (z) {
                m115300c(this.f77854i);
                this.f77852g.mo111883a(this.f77853h);
                this.f77852g.mo111884a(this.f77850e, (float) this.f77854i.dayDiff(this.f77853h));
            }
            m115301p();
            this.f77849c.mo111003i();
            this.f77849c.mo110999e();
            this.f77849c.mo111000f();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment$DiagramControllerAdapter$onViewCreated$1", mo239173f = "DiagramControllerAdapterFragment.kt", mo239174i = {0}, mo239175l = {226}, mo239176m = "invokeSuspend", mo239177n = {"$this$launchWhenResumed"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$a$c */
        public static final class C30909c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ DiagramControllerAdapter this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30909c(DiagramControllerAdapter aVar, Continuation cVar) {
                super(2, cVar);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C30909c cVar2 = new C30909c(this.this$0, cVar);
                cVar2.p$ = (CoroutineScope) obj;
                return cVar2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                return ((C30909c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L_0x001c
                    if (r1 != r2) goto L_0x0014
                    java.lang.Object r1 = r5.L$0
                    kotlinx.coroutines.ah r1 = (kotlinx.coroutines.CoroutineScope) r1
                    kotlin.C69097g.m265891a(r6)
                    r6 = r5
                    goto L_0x0038
                L_0x0014:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L_0x001c:
                    kotlin.C69097g.m265891a(r6)
                    kotlinx.coroutines.ah r6 = r5.p$
                    r1 = r6
                    r6 = r5
                L_0x0023:
                    boolean r3 = kotlinx.coroutines.C69364ai.m266268a(r1)
                    if (r3 == 0) goto L_0x0046
                    com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$a r3 = r6.this$0
                    long r3 = r3.f77847a
                    r6.L$0 = r1
                    r6.label = r2
                    java.lang.Object r3 = kotlinx.coroutines.ar.m266295a(r3, r6)
                    if (r3 != r0) goto L_0x0038
                    return r0
                L_0x0038:
                    boolean r3 = kotlinx.coroutines.C69364ai.m266268a(r1)
                    if (r3 == 0) goto L_0x0023
                    com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$a r3 = r6.this$0
                    com.ss.android.lark.calendar.impl.features.calendarview.i r3 = r3.f77849c
                    r3.mo111000f()
                    goto L_0x0023
                L_0x0046:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment.DiagramControllerAdapter.C30909c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: a */
        public final void mo111925a(LifecycleOwner lifecycleOwner) {
            Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
            C1170p.m5399a(lifecycleOwner).mo6038a(new C30909c(this, null));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111634a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "date");
            m115300c(calendarDate);
        }

        /* renamed from: a */
        public final void mo111926a(SettingChangedEvent mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "settings");
            this.f77849c.mo110993a(mVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111633a(long j, long j2) {
            f77846d.mo111938a(this.f77855j, new LongRange(j, j2));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108515a(Intent intent, boolean z) {
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            GeneralHitPoint.m124207a("instance_block", "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
            this.f77848b.startActivity(intent);
            this.f77849c.mo111006l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108517a(EventChipViewData eventChipViewData, boolean z) {
            if (eventChipViewData != null) {
                CalendarEventInstance calendarEventInstance = eventChipViewData.getCalendarEventInstance();
                Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "chipViewData.calendarEventInstance");
                if (calendarEventInstance.getSource() == CalendarEvent.Source.ANDROID) {
                    LocalDetailPresenter.f79413a.mo113913a(this.f77848b, eventChipViewData);
                } else {
                    EventDetailPresenter.f79403a.mo113906a(this.f77848b, eventChipViewData);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108516a(CalendarDate calendarDate, Context context, boolean z) {
            EditActivityEntrance.Companion aVar = EditActivityEntrance.f79940a;
            Activity activity = this.f77848b;
            if (calendarDate == null) {
                calendarDate = this.f77854i;
                Intrinsics.checkExpressionValueIsNotNull(calendarDate, "this.selectedDate");
            }
            aVar.mo114667a(activity, calendarDate, z);
            this.f77849c.mo111006l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111635a(CalendarEventInstance calendarEventInstance, long j, long j2) {
            Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
            if (j == calendarEventInstance.getStartTime() && j2 == calendarEventInstance.getEndTime()) {
                mo111936o();
                return;
            }
            CalendarMainHitPoint.m124363a("change_event", calendarEventInstance.getEventServerId(), Long.valueOf(j));
            this.f77851f.mo111616a(calendarEventInstance, j, j2);
        }

        public DiagramControllerAdapter(Activity activity, IDiagramController iVar, ActionDispatcher aVar, TimeZone timeZone, int i) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(iVar, "diagramController");
            Intrinsics.checkParameterIsNotNull(aVar, "actionDispatcher");
            Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
            this.f77848b = activity;
            this.f77849c = iVar;
            this.f77855j = aVar;
            this.f77856k = timeZone;
            this.f77854i = new CalendarDate(this.f77856k).setJulianDay(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IDiagramController mo111920c() {
        return (IDiagramController) this.f77843e.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract IDiagramController mo111922e();

    /* renamed from: g */
    public void mo111924g() {
        HashMap hashMap = this.f77845g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo111919b() {
        return this.f77842d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final DiagramControllerAdapter mo111921d() {
        return this.f77844f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$b */
    static final class C30910b extends Lambda implements Function0<IDiagramController> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30910b(DiagramControllerAdapterFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final IDiagramController invoke() {
            return this.this$0.mo111922e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public TimeZone mo111923f() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        return timeZone;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.CalendarViewFragmentPreload
    /* renamed from: a */
    public void mo111918a() {
        String str = this.f77841c;
        Log.m165389i(str, mo111919b() + ": preloadData");
        mo111920c().mo110989a();
        Job unused = C69553g.m266944a(GlobalScope.f173453a, Dispatchers.m266326d(), null, new C30918j(this, null), 2, null);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        String str = this.f77841c;
        Log.m165389i(str, mo111919b() + ": onDestroyView");
        DiagramControllerAdapter aVar = this.f77844f;
        if (aVar != null) {
            aVar.mo111932k();
        }
        this.f77844f = null;
        mo111924g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        String str = this.f77841c;
        Log.m165389i(str, mo111919b() + ": onPause");
        DiagramControllerAdapter aVar = this.f77844f;
        if (aVar != null) {
            aVar.mo111931j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String str = this.f77841c;
        Log.m165389i(str, mo111919b() + ": onResume " + this.f77840b);
        DiagramControllerAdapter aVar = this.f77844f;
        if (aVar != null) {
            aVar.mo111929b(this.f77840b);
        }
        this.f77840b = false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/viewmodel/ViewMode;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$c */
    public static final class C30911c extends Lambda implements Function1<ViewMode, Unit> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30911c(DiagramControllerAdapterFragment cVar) {
            super(1);
            this.this$0 = cVar;
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
            this.this$0.f77840b = true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/busevents/NormalViewTimeZoneChangedEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$d */
    public static final class C30912d extends Lambda implements Function1<C32490h, Unit> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30912d(DiagramControllerAdapterFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32490h hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C32490h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "it");
            DiagramControllerAdapter d = this.this$0.mo111921d();
            if (d != null) {
                d.mo111927a(this.this$0.mo111923f());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/busevents/AccountChangedEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$g */
    public static final class C30915g extends Lambda implements Function1<C32485a, Unit> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30915g(DiagramControllerAdapterFragment cVar) {
            super(1);
            this.this$0 = cVar;
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
            DiagramControllerAdapter d = this.this$0.mo111921d();
            if (d != null) {
                d.mo111934m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$h */
    public static final class C30916h extends Lambda implements Function1<SettingChangedEvent, Unit> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30916h(DiagramControllerAdapterFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SettingChangedEvent mVar) {
            invoke(mVar);
            return Unit.INSTANCE;
        }

        public final void invoke(SettingChangedEvent mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "it");
            DiagramControllerAdapter d = this.this$0.mo111921d();
            if (d != null) {
                d.mo111926a(mVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$e */
    public static final class C30913e extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30913e(DiagramControllerAdapterFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            DiagramControllerAdapter d = this.this$0.mo111921d();
            if (d != null) {
                d.mo111933l();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$i */
    public static final class C30917i extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30917i(DiagramControllerAdapterFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final void invoke(Object obj) {
            DiagramControllerAdapter d = this.this$0.mo111921d();
            if (d != null) {
                d.mo111936o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$f */
    public static final class C30914f extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30914f(DiagramControllerAdapterFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final void invoke(Object obj) {
            DiagramControllerAdapter d;
            Intrinsics.checkParameterIsNotNull(obj, "it");
            if (this.this$0.isResumed() && (d = this.this$0.mo111921d()) != null) {
                d.mo111935n();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment$preloadData$1", mo239173f = "DiagramControllerAdapterFragment.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.c$j */
    static final class C30918j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ DiagramControllerAdapterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30918j(DiagramControllerAdapterFragment cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30918j jVar = new C30918j(this.this$0, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30918j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                LaunchPerfMonitor.m124428c("load_setting");
                C30022a.f74884c.mo108452a(true);
                LaunchPerfMonitor.m124430d("load_setting");
                LaunchPerfMonitor.m124428c("get_instance");
                CalendarDate julianDay = new CalendarDate(this.this$0.mo111923f()).setJulianDay(this.this$0.f77839a.mo111971d().mo118786a().intValue());
                IDiagramController c = this.this$0.mo111920c();
                Intrinsics.checkExpressionValueIsNotNull(julianDay, "date");
                c.mo110991a(julianDay);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher
    public boolean doAction(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Log.m165389i(this.f77841c, mo111919b() + ": doAction " + str);
        int hashCode = str.hashCode();
        if (hashCode != 341680001) {
            if (hashCode != 1943343852) {
                if (hashCode != 1943827979 || !str.equals("ACTION_CHANGE_SELECTED_TIME")) {
                    return false;
                }
                if (!(obj instanceof LongRange)) {
                    obj = null;
                }
                LongRange nVar = (LongRange) obj;
                if (nVar == null) {
                    return true;
                }
                if (nVar.mo239418e()) {
                    this.f77839a.mo111965a(-1L);
                    this.f77839a.mo111969b(-1L);
                    return true;
                }
                this.f77839a.mo111965a(nVar.mo239414a());
                this.f77839a.mo111969b(nVar.mo239415b());
                return true;
            } else if (!str.equals("ACTION_CHANGE_SELECTED_DATE")) {
                return false;
            } else {
                if (!(obj instanceof CalendarDate)) {
                    obj = null;
                }
                CalendarDate calendarDate = (CalendarDate) obj;
                if (calendarDate == null) {
                    return true;
                }
                this.f77839a.mo111964a(calendarDate.getJulianDay());
                return true;
            }
        } else if (!str.equals("ACTION_ANIMATE_APPEND")) {
            return false;
        } else {
            this.f77839a.mo111997v();
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        DiagramControllerAdapter aVar = this.f77844f;
        if (aVar != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "viewLifecycleOwner");
            aVar.mo111925a(viewLifecycleOwner);
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner2, "viewLifecycleOwner");
        C32508b.m124448a(this.f77839a.mo111967b(), viewLifecycleOwner2, new C30911c(this));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner3, "viewLifecycleOwner");
        C32508b.m124448a(this.f77839a.mo111973f(), viewLifecycleOwner3, new C30912d(this));
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner4, "viewLifecycleOwner");
        C32508b.m124448a(this.f77839a.mo111974g(), viewLifecycleOwner4, new C30913e(this));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner5, "viewLifecycleOwner");
        C32508b.m124448a(this.f77839a.mo111980m(), viewLifecycleOwner5, new C30914f(this));
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner6, "viewLifecycleOwner");
        C32508b.m124448a(this.f77839a.mo111975h(), viewLifecycleOwner6, new C30915g(this));
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner7, "viewLifecycleOwner");
        C32508b.m124448a(this.f77839a.mo111976i(), viewLifecycleOwner7, new C30916h(this));
        Observable<T> throttleLatest = this.f77839a.mo111977j().throttleLatest(1000, TimeUnit.MILLISECONDS);
        Intrinsics.checkExpressionValueIsNotNull(throttleLatest, "viewModel.eventsChangedE…L, TimeUnit.MILLISECONDS)");
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner8, "viewLifecycleOwner");
        C32508b.m124448a(throttleLatest, viewLifecycleOwner8, new C30917i(this));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        String str = this.f77841c;
        Log.m165389i(str, mo111919b() + ": onCreateView");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return null");
        LaunchPerfMonitor.m124428c("init_view");
        DiagramControllerAdapter aVar = new DiagramControllerAdapter(activity, mo111920c(), this, mo111923f(), this.f77839a.mo111971d().mo118786a().intValue());
        this.f77844f = aVar;
        View i = aVar.mo111930i();
        LaunchPerfMonitor.m124430d("init_view");
        return i;
    }
}
