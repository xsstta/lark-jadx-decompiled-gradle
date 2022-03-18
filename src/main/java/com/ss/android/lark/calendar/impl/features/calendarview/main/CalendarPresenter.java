package com.ss.android.lark.calendar.impl.features.calendarview.main;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.dependency.idependency.IAppLifeCycleDependency;
import com.ss.android.lark.calendar.impl.features.calendarview.C30663a;
import com.ss.android.lark.calendar.impl.features.calendarview.C30798e;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarPushManager;
import com.ss.android.lark.calendar.impl.features.calendarview.DragSaveProcess;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysDiagramPresenter;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.ListDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer;
import com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarTabContainer;
import com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel;
import com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramPresenter;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30668b;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.EventDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.LocalDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.busevents.CalendarViewSwitchEvent;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.ParamStoreData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarMainHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32486b;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32487d;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32489g;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32490h;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000×\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018*\u0001*\u0018\u0000 y2\u00020\u0001:\u0002yzB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u000208J\u0006\u0010:\u001a\u000208J\u0006\u0010;\u001a\u000208J\u0006\u0010<\u001a\u000208J\b\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\nH\u0002J\u000e\u0010A\u001a\n C*\u0004\u0018\u00010B0BJ\u0010\u0010D\u001a\u0002082\u0006\u0010E\u001a\u00020\u0005H\u0002J\b\u0010F\u001a\u000208H\u0002J\u0006\u0010G\u001a\u000208J\u001a\u0010G\u001a\u0002082\u0006\u0010H\u001a\u00020\u00052\b\u0010I\u001a\u0004\u0018\u00010\u0016H\u0002J\u0006\u0010J\u001a\u000208J\u0010\u0010J\u001a\u0002082\u0006\u0010E\u001a\u00020\u0005H\u0002J\u0006\u0010K\u001a\u000208J\u0012\u0010L\u001a\u0004\u0018\u00010\u00162\u0006\u0010H\u001a\u00020\u0005H\u0002J\u0010\u0010M\u001a\u0002082\u0006\u0010N\u001a\u00020OH\u0007J\u0010\u0010P\u001a\u0002082\u0006\u0010Q\u001a\u00020RH\u0007J\u0010\u0010S\u001a\u0002082\u0006\u0010T\u001a\u00020UH\u0007J\u0010\u0010V\u001a\u0002082\u0006\u0010W\u001a\u00020XH\u0007J\u0010\u0010Y\u001a\u0002082\u0006\u0010N\u001a\u00020ZH\u0007J\u0010\u0010[\u001a\u0002082\u0006\u0010\\\u001a\u00020]H\u0007J\u0010\u0010^\u001a\u0002082\u0006\u0010_\u001a\u00020`H\u0007J\u0006\u0010a\u001a\u000208J\u0010\u0010b\u001a\u0002082\u0006\u0010W\u001a\u00020cH\u0007J\u0006\u0010d\u001a\u000208J\u0006\u0010e\u001a\u000208J\b\u0010f\u001a\u000208H\u0002J\u0006\u0010g\u001a\u000208J\b\u0010h\u001a\u000208H\u0002J\b\u0010i\u001a\u000208H\u0002J\b\u0010j\u001a\u000208H\u0002J\b\u0010k\u001a\u000208H\u0002J\u000e\u0010l\u001a\u0002082\u0006\u0010m\u001a\u00020\u0018J\u0016\u0010n\u001a\u0002082\u0006\u0010@\u001a\u00020\n2\u0006\u0010o\u001a\u00020\nJ\u0006\u0010p\u001a\u000208J\u0006\u0010q\u001a\u000208J\u000e\u0010r\u001a\u0002082\u0006\u0010s\u001a\u00020\u001cJ\b\u0010t\u001a\u000208H\u0002J\b\u0010u\u001a\u000208H\u0002J\u0010\u0010v\u001a\u0002082\u0006\u0010w\u001a\u00020\u0005H\u0002J\u0006\u0010x\u001a\u000208R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020*X\u0004¢\u0006\u0004\n\u0002\u0010+R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R(\u00102\u001a\u0004\u0018\u0001012\b\u00100\u001a\u0004\u0018\u000101@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006{"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter;", "", "mContext", "Landroid/content/Context;", "mNumDays", "", "mDiagramContainer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer;", "(Landroid/content/Context;ILcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer;)V", "mAppLinkViewType", "", "mAppStateChangeListener", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "mCalendarDateLogic", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDateLogic;", "mCalendarPushManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarPushManager;", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mChangeCurrentDay", "Ljava/lang/Runnable;", "mCurrentDiagramController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "mDependency", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$IDependency;", "mDragSaveProcess", "Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess;", "mHasCheckSDKSync", "", "mIsCreate", "mIsDestroyed", "mIsFromAppLink", "mIsOnCalendarPage", "mIsRegisterReceiver", "mMaskScheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "mPushThrottle", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarPushThrottle;", "mRefreshAllPage", "mScheduleSDKCheckRunnable", "mStopCheckSDKSync", "mTimeZoneChangedReceiver", "com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$mTimeZoneChangedReceiver$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$mTimeZoneChangedReceiver$1;", "mViewDependency", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "getMViewDependency", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "value", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarTabContainer;", "tabContainer", "getTabContainer", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarTabContainer;", "setTabContainer", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarTabContainer;)V", "cancelScheduleRefreshMaskView", "", "checkShowCalendarSyncLoading", "clearAppendEvent", "create", "destroy", "getDiagramView", "Landroid/view/View;", "getIndexByViewType", "viewType", "getSelectedDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "kotlin.jvm.PlatformType", "handleSwitchMode", "index", "handleSysTimeZoneChanged", "initDiagramController", "numDay", "diagramController", "modifyTabProgressForAppLink", "moveToToday", "newDiagramController", "onAccountChanged", "accountChangedEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/AccountChangedEvent;", "onAppendEvent", "appendEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/AppendEvent;", "onAppendFailWhenTimeZoneInvalid", "invalidTimeZoneEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/InvalidTimeZoneEvent;", "onCalendarColdLaunchFinish", "event", "Lcom/ss/android/lark/calendar/impl/framework/busevents/CalendarColdLaunchFinishEvent;", "onCalendarViewSwitched", "Lcom/ss/android/lark/calendar/impl/framework/busevents/CalendarViewSwitchEvent;", "onNormalViewTimeZoneChanged", "timeZoneChanged", "Lcom/ss/android/lark/calendar/impl/framework/busevents/NormalViewTimeZoneChangedEvent;", "onReloadAllEvent", "reloadAllEvents", "Lcom/ss/android/lark/calendar/impl/framework/busevents/ReloadAllEvent;", "onResume", "onSettingChanged", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "preLoadDiskInstance", "preLoadInstance", "refreshAllPage", "refreshCurrentTimeLine", "registerAppLifeCycleObserver", "registerSystemTimeZoneReceiver", "resetTagOnAccountChange", "scheduleCheckSDKLoading", "setFragmentDependency", "dependency", "showViewByAppLink", "viewDate", "showViewTimeZoneGuide", "startScheduleRefreshMaskView", "switchMainTab", "isOnCalendarPage", "unRegisterAppLifeCycleObserver", "unRegisterSystemTimeZoneReceiver", "updateDateLogic", "numDays", "updateTabView", "Companion", "IDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarPresenter {

    /* renamed from: n */
    public static final Companion f77737n = new Companion(null);

    /* renamed from: A */
    private int f77738A;

    /* renamed from: a */
    public boolean f77739a;

    /* renamed from: b */
    public boolean f77740b;

    /* renamed from: c */
    public String f77741c = "";

    /* renamed from: d */
    public boolean f77742d;

    /* renamed from: e */
    public final C30663a f77743e;

    /* renamed from: f */
    public DragSaveProcess f77744f;

    /* renamed from: g */
    public IDiagramController f77745g;

    /* renamed from: h */
    public boolean f77746h;

    /* renamed from: i */
    public IDependency f77747i;

    /* renamed from: j */
    public C30798e f77748j;

    /* renamed from: k */
    public final Runnable f77749k;

    /* renamed from: l */
    public final Context f77750l;

    /* renamed from: m */
    public CalendarDiagramContainer f77751m;

    /* renamed from: o */
    private boolean f77752o;

    /* renamed from: p */
    private boolean f77753p;

    /* renamed from: q */
    private CalendarPushManager f77754q;

    /* renamed from: r */
    private CalendarTabContainer f77755r;

    /* renamed from: s */
    private final Runnable f77756s;

    /* renamed from: t */
    private IAppLifeCycleDependency.IAppStateChangeListener f77757t;

    /* renamed from: u */
    private ScheduledFuture<?> f77758u;

    /* renamed from: v */
    private final CallbackManager f77759v;

    /* renamed from: w */
    private final Runnable f77760w;

    /* renamed from: x */
    private boolean f77761x;

    /* renamed from: y */
    private final CalendarPresenter$mTimeZoneChangedReceiver$1 f77762y;

    /* renamed from: z */
    private final CalendarDaysContract.AbstractC30658d f77763z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$IDependency;", "", "getActivity", "Landroid/app/Activity;", "onCalendarViewSwitched", "", "refreshMonthTitle", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$b */
    public interface IDependency {
        /* renamed from: a */
        Activity mo111841a();

        /* renamed from: a */
        void mo111842a(CalendarDate calendarDate);

        /* renamed from: b */
        void mo111843b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$Companion;", "", "()V", "SDK_SYNC_CALENDAR_PERIOD", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final CalendarTabContainer mo111806a() {
        return this.f77755r;
    }

    /* renamed from: c */
    public final CalendarDaysContract.AbstractC30658d mo111813c() {
        return this.f77763z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$create$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarPushManager$IPushListener;", "onLoadAllCalendars", "", "onLoadCalendarsAndEvents", "onLoadEvents", "onRefreshTimeFormat", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$c */
    public static final class C30864c implements CalendarPushManager.IPushListener {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77764a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarPushManager.IPushListener
        /* renamed from: b */
        public void mo110867b() {
            C30076a.m111290a().mo108431c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarPushManager.IPushListener
        /* renamed from: d */
        public void mo110869d() {
            this.f77764a.f77748j.mo111490b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarPushManager.IPushListener
        /* renamed from: a */
        public void mo110866a() {
            IDiagramController iVar = this.f77764a.f77745g;
            if (iVar != null) {
                iVar.mo111004j();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarPushManager.IPushListener
        /* renamed from: c */
        public void mo110868c() {
            this.f77764a.f77748j.mo111490b();
            C30076a.m111290a().mo108431c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30864c(CalendarPresenter calendarPresenter) {
            this.f77764a = calendarPresenter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$create$2", "Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess$DragSaveListener;", "onActiveRefresh", "", "onCancelSave", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$d */
    public static final class C30865d implements DragSaveProcess.DragSaveListener {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77765a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.DragSaveProcess.DragSaveListener
        /* renamed from: b */
        public void mo111623b() {
            this.f77765a.f77748j.mo111491c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.DragSaveProcess.DragSaveListener
        /* renamed from: a */
        public void mo111622a() {
            EventBus.getDefault().trigger(new C32493l());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30865d(CalendarPresenter calendarPresenter) {
            this.f77765a = calendarPresenter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$initDiagramController$diagramDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramDelegate;", "addEventReloadTask", "", "cancelEventTransmit", "eventTransmit", "startTime", "", "endTime", "getCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getSelectedDate", "hideSdkSyncLoading", "moveLogicDateToToday", "refreshMonthTitle", "date", "saveNoRepeatEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "setTabProgress", "process", "", "setTabScrollByMoveToToday", "animDuration", "", "setTabScrollProgress", "startAppendViewAnimation", "updateSelectDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$f */
    public static final class C30867f implements IDiagramDelegate {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77767a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: e */
        public void mo111639e() {
            this.f77767a.f77743e.mo110703b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: g */
        public void mo111641g() {
            this.f77767a.f77748j.mo111491c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: c */
        public CalendarDate mo111637c() {
            CalendarDate a = this.f77767a.f77743e.mo110699a();
            Intrinsics.checkExpressionValueIsNotNull(a, "mCalendarDateLogic.selectedDate");
            return a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: d */
        public CalendarDate mo111638d() {
            CalendarDate d = this.f77767a.f77743e.mo110705d();
            Intrinsics.checkExpressionValueIsNotNull(d, "mCalendarDateLogic.currentDayDate");
            return d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: f */
        public void mo111640f() {
            this.f77767a.f77751m.mo111865d().mo110615a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: h */
        public void mo111642h() {
            this.f77767a.f77751m.mo111858a(-1, -1);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30867f(CalendarPresenter calendarPresenter) {
            this.f77767a = calendarPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111631a(float f) {
            CalendarTabContainer a = this.f77767a.mo111806a();
            if (a != null) {
                a.mo111881a(f);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: b */
        public void mo111636b(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "date");
            IDependency bVar = this.f77767a.f77747i;
            if (bVar != null) {
                bVar.mo111842a(calendarDate);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111632a(int i) {
            CalendarTabContainer a = this.f77767a.mo111806a();
            if (a != null) {
                a.mo111882a(i);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111634a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "date");
            this.f77767a.f77743e.mo110701a(calendarDate);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111633a(long j, long j2) {
            this.f77767a.f77751m.mo111858a(j, j2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate
        /* renamed from: a */
        public void mo111635a(CalendarEventInstance calendarEventInstance, long j, long j2) {
            Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
            if (j == calendarEventInstance.getStartTime() && j2 == calendarEventInstance.getEndTime()) {
                this.f77767a.mo111823m();
                return;
            }
            CalendarMainHitPoint.m124363a("change_event", calendarEventInstance.getEventServerId(), Long.valueOf(j));
            this.f77767a.f77744f.mo111616a(calendarEventInstance, j, j2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$j */
    static final class RunnableC30871j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77770a;

        RunnableC30871j(CalendarPresenter calendarPresenter) {
            this.f77770a = calendarPresenter;
        }

        public final void run() {
            this.f77770a.mo111840v();
        }
    }

    /* renamed from: d */
    public final void mo111814d() {
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo110989a();
        }
    }

    /* renamed from: f */
    public final void mo111816f() {
        m115156a(this.f77738A, this.f77745g);
    }

    /* renamed from: h */
    public final CalendarDate mo111818h() {
        return this.f77743e.mo110699a();
    }

    /* renamed from: m */
    public final void mo111823m() {
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo111002h();
        }
    }

    /* renamed from: p */
    public final void mo111834p() {
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo111003i();
        }
    }

    /* renamed from: q */
    public final void mo111835q() {
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo111006l();
        }
    }

    /* renamed from: r */
    public final void mo111836r() {
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo110999e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u0016J\u0010\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$initDiagramController$dateLogicData$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "getCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "kotlin.jvm.PlatformType", "getSelectedDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$e */
    public static final class C30866e implements IDateLogicData {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77766a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData
        /* renamed from: c */
        public CalendarDate mo111629c() {
            return this.f77766a.f77743e.mo110699a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData
        /* renamed from: d */
        public CalendarDate mo111630d() {
            return this.f77766a.f77743e.mo110705d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30866e(CalendarPresenter calendarPresenter) {
            this.f77766a = calendarPresenter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$h */
    static final class C30869h extends Lambda implements Function0<Activity> {
        final /* synthetic */ CalendarPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30869h(CalendarPresenter calendarPresenter) {
            super(0);
            this.this$0 = calendarPresenter;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Activity invoke() {
            IDependency bVar = this.this$0.f77747i;
            if (bVar != null) {
                return bVar.mo111841a();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$i */
    static final class RunnableC30870i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77769a;

        RunnableC30870i(CalendarPresenter calendarPresenter) {
            this.f77769a = calendarPresenter;
        }

        public final void run() {
            if (!this.f77769a.f77742d) {
                this.f77769a.mo111823m();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$mViewDependency$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "mDinaIternateBold", "Landroid/graphics/Typeface;", "getActivity", "Landroid/app/Activity;", "getActivityOptions", "Landroid/app/ActivityOptions;", "isOpenNearbyClick", "", "getDINAlternateBoldTypeface", "injectView", "", "annotationTarget", "", "container", "Landroid/view/View;", "startActivityByIntent", "intent", "Landroid/content/Intent;", "startAppendEventActivity", "selectedDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "context", "Landroid/content/Context;", "fromPlusBtn", "startEventDetailActivity", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "updateTabView", "currentDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$k */
    public static final class C30872k implements CalendarDaysContract.AbstractC30658d {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77771a;

        /* renamed from: a */
        public Activity mo111847a() {
            IDependency bVar = this.f77771a.f77747i;
            if (bVar != null) {
                return bVar.mo111841a();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30872k(CalendarPresenter calendarPresenter) {
            this.f77771a = calendarPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108518a(Object obj, View view) {
            Intrinsics.checkParameterIsNotNull(obj, "annotationTarget");
            Intrinsics.checkParameterIsNotNull(view, "container");
            ButterKnife.bind(obj, view);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108515a(Intent intent, boolean z) {
            Activity a;
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            GeneralHitPoint.m124207a("instance_block", "new", (CalendarEvent) null, (Calendar.Type) null, (String) null, 24, (Object) null);
            IDependency bVar = this.f77771a.f77747i;
            if (!(bVar == null || (a = bVar.mo111841a()) == null)) {
                a.startActivity(intent);
            }
            IDiagramController iVar = this.f77771a.f77745g;
            if (iVar != null) {
                iVar.mo111006l();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108517a(EventChipViewData eventChipViewData, boolean z) {
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "chipViewData");
            Activity a = mo111847a();
            if (a != null) {
                CalendarEventInstance calendarEventInstance = eventChipViewData.getCalendarEventInstance();
                Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "chipViewData.calendarEventInstance");
                if (calendarEventInstance.getSource() == CalendarEvent.Source.ANDROID) {
                    LocalDetailPresenter.f79413a.mo113913a(a, eventChipViewData);
                } else {
                    EventDetailPresenter.f79403a.mo113906a(a, eventChipViewData);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30658d
        /* renamed from: a */
        public void mo108516a(CalendarDate calendarDate, Context context, boolean z) {
            EditActivityEntrance.Companion aVar = EditActivityEntrance.f79940a;
            Context context2 = this.f77771a.f77750l;
            if (calendarDate == null) {
                calendarDate = this.f77771a.f77743e.mo110699a();
                Intrinsics.checkExpressionValueIsNotNull(calendarDate, "mCalendarDateLogic.selectedDate");
            }
            aVar.mo114667a(context2, calendarDate, z);
            IDiagramController iVar = this.f77771a.f77745g;
            if (iVar != null) {
                iVar.mo111006l();
            }
        }
    }

    /* renamed from: g */
    public final View mo111817g() {
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            return iVar.mo110995b();
        }
        return null;
    }

    /* renamed from: u */
    public final void mo111839u() {
        if (!this.f77753p) {
            this.f77753p = true;
            mo111840v();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$l */
    public static final class RunnableC30873l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77772a;

        RunnableC30873l(CalendarPresenter calendarPresenter) {
            this.f77772a = calendarPresenter;
        }

        public final void run() {
            CalendarPresenter calendarPresenter = this.f77772a;
            calendarPresenter.mo111807a(calendarPresenter.mo111805a(calendarPresenter.f77741c));
            this.f77772a.f77740b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$n */
    static final class RunnableC30875n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77775a;

        RunnableC30875n(CalendarPresenter calendarPresenter) {
            this.f77775a = calendarPresenter;
        }

        public final void run() {
            Activity activity;
            if (this.f77775a.f77746h) {
                CalendarDiagramContainer aVar = this.f77775a.f77751m;
                IDependency bVar = this.f77775a.f77747i;
                if (bVar != null) {
                    activity = bVar.mo111841a();
                } else {
                    activity = null;
                }
                aVar.mo111859a(activity);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$q */
    public static final class RunnableC30878q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77780a;

        RunnableC30878q(CalendarPresenter calendarPresenter) {
            this.f77780a = calendarPresenter;
        }

        public final void run() {
            IDiagramController iVar;
            try {
                if (C30022a.f74884c.mo108456c().isShowPastEventsMask() && (iVar = this.f77780a.f77745g) != null) {
                    iVar.mo111000f();
                }
            } catch (Exception e) {
                C3474b.m14692a(e);
            }
        }
    }

    /* renamed from: A */
    private final void m115154A() {
        this.f77751m.mo111864c().mo112581a();
        this.f77751m.mo111864c().invalidate();
    }

    /* renamed from: y */
    private final void m115162y() {
        if (this.f77757t == null) {
            this.f77757t = new C30876o(this);
        }
        IAppLifeCycleDependency.IAppStateChangeListener aVar = this.f77757t;
        if (aVar != null) {
            C30022a.f74882a.appLifeCycleDependency().mo108205a(aVar);
        }
    }

    /* renamed from: z */
    private final void m115163z() {
        mo111825o();
        IAppLifeCycleDependency.IAppStateChangeListener aVar = this.f77757t;
        if (aVar != null) {
            C30022a.f74882a.appLifeCycleDependency().mo108206b(aVar);
        }
    }

    /* renamed from: b */
    public final void mo111812b() {
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo111003i();
        }
        int i = this.f77738A;
        if (i == 1 || i == 3) {
            EventBus.getDefault().trigger(new C32490h());
        }
    }

    /* renamed from: j */
    public final void mo111820j() {
        if (this.f77743e.mo110704c()) {
            UICallbackExecutor.executeDelayed(this.f77756s, 100);
        }
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo111003i();
        }
    }

    /* renamed from: o */
    public final void mo111825o() {
        ScheduledFuture<?> scheduledFuture = this.f77758u;
        if (scheduledFuture == null) {
            return;
        }
        if (scheduledFuture == null || !scheduledFuture.isCancelled()) {
            ScheduledFuture<?> scheduledFuture2 = this.f77758u;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            this.f77758u = null;
        }
    }

    /* renamed from: s */
    public final void mo111837s() {
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("moveToToday"));
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo111001g();
        }
    }

    /* renamed from: t */
    public final void mo111838t() {
        if (this.f77740b) {
            UICallbackExecutor.executeDelayed(new RunnableC30873l(this), 500);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$g */
    static final class RunnableC30868g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77768a;

        RunnableC30868g(CalendarPresenter calendarPresenter) {
            this.f77768a = calendarPresenter;
        }

        public final void run() {
            this.f77768a.f77743e.mo110706e();
            IDiagramController iVar = this.f77768a.f77745g;
            if (iVar != null) {
                CalendarDate d = this.f77768a.f77743e.mo110705d();
                Intrinsics.checkExpressionValueIsNotNull(d, "mCalendarDateLogic.currentDayDate");
                iVar.mo110996b(d);
            }
            IDiagramController iVar2 = this.f77768a.f77745g;
            if (iVar2 != null) {
                iVar2.mo111001g();
            }
            CalendarTabContainer a = this.f77768a.mo111806a();
            if (a != null) {
                CalendarDate d2 = this.f77768a.f77743e.mo110705d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "mCalendarDateLogic.currentDayDate");
                a.mo111883a(d2);
            }
        }
    }

    /* renamed from: w */
    private final void m115160w() {
        Activity a;
        IDependency bVar = this.f77747i;
        if (bVar != null && (a = bVar.mo111841a()) != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            try {
                m115155a(a, this.f77762y, intentFilter);
                this.f77761x = true;
            } catch (Exception unused) {
                Log.m165383e("CalendarMainPresenter", C32673y.m125377c("RegisterReceiver failed"));
            }
        }
    }

    /* renamed from: x */
    private final void m115161x() {
        Activity a;
        IDependency bVar = this.f77747i;
        if (bVar != null && (a = bVar.mo111841a()) != null && this.f77761x) {
            try {
                a.unregisterReceiver(this.f77762y);
                this.f77761x = false;
            } catch (Exception unused) {
                Log.m165383e("CalendarMainPresenter", C32673y.m125377c("UnregisterReceiver failed"));
            }
        }
    }

    /* renamed from: e */
    public final void mo111815e() {
        boolean c = this.f77743e.mo110704c();
        this.f77743e.mo110708g();
        if (c) {
            UICallbackExecutor.executeDelayed(this.f77756s, 100);
        }
        LaunchPerfMonitor.m124428c("get_instance");
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            CalendarDate a = this.f77743e.mo110699a();
            Intrinsics.checkExpressionValueIsNotNull(a, "mCalendarDateLogic.selectedDate");
            iVar.mo110991a(a);
        }
    }

    /* renamed from: n */
    public final void mo111824n() {
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("startScheduleRefreshMaskView"));
        ScheduledFuture<?> scheduledFuture = this.f77758u;
        if (scheduledFuture == null || scheduledFuture == null || scheduledFuture.isCancelled()) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            this.f77758u = coreThreadPool.getScheduleThreadPool().scheduleAtFixedRate(new RunnableC30878q(this), 60000, 60000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: v */
    public final void mo111840v() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("CalendarMainPresenter", C32673y.m125376b(valueOf, "getPrimaryCalendarLoadingStatus", new String[0]));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = this.f77759v.wrapAndAddGetDataCallback(new C30877p(this, valueOf, "getPrimaryCalendarLoadingStatus"));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "mCallbackManager.wrapAnd…         }\n            })");
        aVar.mo118950b(wrapAndAddGetDataCallback);
    }

    /* renamed from: i */
    public final void mo111819i() {
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("create mIsCreate = " + this.f77752o));
        if (!this.f77752o) {
            this.f77752o = true;
            EventBus.getDefault().register(this);
            m115160w();
            CalendarPushManager dVar = new CalendarPushManager();
            this.f77754q = dVar;
            if (dVar != null) {
                dVar.mo110862a();
            }
            CalendarPushManager dVar2 = this.f77754q;
            if (dVar2 != null) {
                dVar2.mo110863a(new C30864c(this));
            }
            this.f77744f.mo111614a(new C30865d(this));
            m115162y();
            IDependency bVar = this.f77747i;
            if (bVar != null) {
                CalendarDate a = this.f77743e.mo110699a();
                Intrinsics.checkExpressionValueIsNotNull(a, "mCalendarDateLogic.selectedDate");
                bVar.mo111842a(a);
            }
        }
    }

    /* renamed from: k */
    public final void mo111821k() {
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("destroy mIsDestroyed = " + this.f77742d));
        if (!this.f77742d) {
            this.f77742d = true;
            this.f77752o = false;
            this.f77759v.cancelCallbacks();
            this.f77748j.mo111489a();
            CalendarPushManager dVar = this.f77754q;
            if (dVar != null) {
                dVar.mo110865b();
            }
            m115161x();
            UICallbackExecutor.removeCallbacks(this.f77756s);
            UICallbackExecutor.removeCallbacks(this.f77749k);
            EventBus.getDefault().unregister(this);
            m115163z();
        }
    }

    /* renamed from: l */
    public final void mo111822l() {
        int i = this.f77738A;
        if (i == 1) {
            CalendarTabContainer bVar = this.f77755r;
            if (bVar != null) {
                bVar.mo111884a(false, (float) this.f77743e.mo110699a().dayDiff(this.f77743e.mo110705d()));
            }
            ParamStoreData.f83351a.mo118743a("day");
        } else if (i == 4) {
            CalendarTabContainer bVar2 = this.f77755r;
            if (bVar2 != null) {
                bVar2.mo111884a(false, (float) this.f77743e.mo110699a().modifyDay(1).dayDiff(this.f77743e.mo110705d().modifyDay(1)));
            }
            ParamStoreData.f83351a.mo118743a("month");
        } else if (i != 31) {
            CalendarTabContainer bVar3 = this.f77755r;
            if (bVar3 != null) {
                bVar3.mo111884a(false, (float) this.f77743e.mo110699a().dayDiff(this.f77743e.mo110705d()));
            }
            ParamStoreData.f83351a.mo118743a("threeday");
        } else {
            CalendarTabContainer bVar4 = this.f77755r;
            if (bVar4 != null) {
                bVar4.mo111884a(true, (float) this.f77743e.mo110699a().dayDiff(this.f77743e.mo110705d()));
            }
            ParamStoreData.f83351a.mo118743a("list");
        }
        CalendarTabContainer bVar5 = this.f77755r;
        if (bVar5 != null) {
            CalendarDate d = this.f77743e.mo110705d();
            Intrinsics.checkExpressionValueIsNotNull(d, "mCalendarDateLogic.currentDayDate");
            bVar5.mo111883a(d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$registerAppLifeCycleObserver$1", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "onAppStateChange", "", "isAppFronted", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$o */
    public static final class C30876o implements IAppLifeCycleDependency.IAppStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77776a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30876o(CalendarPresenter calendarPresenter) {
            this.f77776a = calendarPresenter;
        }

        @Override // com.ss.android.lark.calendar.dependency.idependency.IAppLifeCycleDependency.IAppStateChangeListener
        /* renamed from: a */
        public void mo108207a(boolean z) {
            if (!z || !this.f77776a.f77746h) {
                this.f77776a.mo111825o();
            } else {
                this.f77776a.mo111824n();
            }
        }
    }

    /* renamed from: a */
    public final void mo111808a(IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f77747i = bVar;
    }

    /* renamed from: a */
    public final void mo111811a(boolean z) {
        this.f77746h = z;
        CalendarPushManager dVar = this.f77754q;
        if (dVar != null) {
            dVar.mo110864a(z);
        }
    }

    @Subscribe
    public final void onAppendFailWhenTimeZoneInvalid(C32489g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "invalidTimeZoneEvent");
        this.f77751m.mo111867f();
    }

    @Subscribe
    public final void onReloadAllEvent(C32493l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "reloadAllEvents");
        this.f77748j.mo111491c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$onAppendEvent$updateCalendarCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$m */
    public static final class C30874m implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f77773a;

        /* renamed from: b */
        final /* synthetic */ String f77774b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("CalendarMainPresenter", C32673y.m125373a(this.f77773a, this.f77774b, new String[0]));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarMainPresenter", C32673y.m125370a(this.f77773a, this.f77774b, errorResult));
        }

        C30874m(String str, String str2) {
            this.f77773a = str;
            this.f77774b = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$scheduleCheckSDKLoading$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isLoading", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter$p */
    public static final class C30877p implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CalendarPresenter f77777a;

        /* renamed from: b */
        final /* synthetic */ String f77778b;

        /* renamed from: c */
        final /* synthetic */ String f77779c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("CalendarMainPresenter", C32673y.m125370a(this.f77778b, this.f77779c, errorResult));
            this.f77777a.f77751m.mo111862a(false);
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("CalendarMainPresenter", C32673y.m125373a(this.f77778b, this.f77779c, "isLoading", String.valueOf(bool)));
            if (this.f77777a.f77739a) {
                this.f77777a.f77751m.mo111862a(false);
            } else if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                this.f77777a.f77751m.mo111862a(false);
            } else {
                this.f77777a.f77751m.mo111862a(true);
                UICallbackExecutor.executeDelayed(this.f77777a.f77749k, (long) LocationRequest.PRIORITY_INDOOR);
            }
        }

        C30877p(CalendarPresenter calendarPresenter, String str, String str2) {
            this.f77777a = calendarPresenter;
            this.f77778b = str;
            this.f77779c = str2;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCalendarColdLaunchFinish(C32487d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "event");
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC30875n(this), 200);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCalendarViewSwitched(CalendarViewSwitchEvent fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "accountChangedEvent");
        m115157b(fVar.mo118646a());
        IDependency bVar = this.f77747i;
        if (bVar != null) {
            bVar.mo111843b();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onSettingChanged(SettingChangedEvent mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "event");
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("onSettingChanged"));
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo110993a(mVar);
        }
    }

    /* renamed from: d */
    private final void m115159d(int i) {
        this.f77743e.mo110700a(i);
        if (i == 1 || i == 3) {
            this.f77743e.mo110702a(C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone());
            this.f77743e.mo110706e();
            return;
        }
        this.f77743e.mo110702a(TimeZone.getDefault());
        this.f77743e.mo110706e();
    }

    /* renamed from: b */
    private final void m115157b(int i) {
        this.f77738A = C30668b.m114025a(i);
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("handleSwitchMode mNumDays = " + this.f77738A));
        m115159d(this.f77738A);
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo110998d();
        }
        m115156a(this.f77738A, m115158c(this.f77738A));
        IDiagramController iVar2 = this.f77745g;
        if (iVar2 != null) {
            iVar2.mo110997c();
        }
        mo111822l();
    }

    /* renamed from: c */
    private final IDiagramController m115158c(int i) {
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("newDiagramController numDay = " + i));
        if (i != 1) {
            if (i == 31) {
                return new ListDiagramController();
            }
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return new MonthDiagramPresenter(new MonthDiagramModel());
            }
        }
        return DaysDiagramPresenter.f77048c.mo111011a(i);
    }

    /* renamed from: a */
    public final int mo111805a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C30668b.m114026b(this.f77738A);
        }
        switch (str.hashCode()) {
            case -1558685317:
                if (str.equals("three_day")) {
                    return 0;
                }
                break;
            case 99228:
                if (str.equals("day")) {
                    return 1;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    return 2;
                }
                break;
            case 104080000:
                if (str.equals("month")) {
                    return 3;
                }
                break;
        }
        return C30668b.m114026b(this.f77738A);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAccountChanged(C32485a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "accountChangedEvent");
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("onAccountChanged"));
        this.f77753p = false;
        this.f77739a = false;
        UICallbackExecutor.removeCallbacks(this.f77749k);
        this.f77751m.mo111862a(false);
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            iVar.mo111005k();
        }
        TimeZone safeMobileNormalViewTimezone = C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone();
        Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "CalendarDependencyHolder…eMobileNormalViewTimezone");
        String id = safeMobileNormalViewTimezone.getID();
        IDiagramController iVar2 = this.f77745g;
        if (iVar2 != null) {
            Intrinsics.checkExpressionValueIsNotNull(id, "timeZoneId");
            iVar2.mo110994a(id);
        }
        CalendarTabContainer bVar = this.f77755r;
        if (bVar != null) {
            CalendarDate d = this.f77743e.mo110705d();
            Intrinsics.checkExpressionValueIsNotNull(d, "mCalendarDateLogic.currentDayDate");
            bVar.mo111883a(d);
        }
        m115154A();
    }

    @Subscribe
    public final void onAppendEvent(C32486b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "appendEvent");
        String a = bVar.mo118637a();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("CalendarMainPresenter", C32673y.m125376b(valueOf, "updateCalendar", "calendar_id", a, "visibility", String.valueOf(true)));
        C30076a.m111290a().mo108425a(a, true, (IGetDataCallback<Boolean>) new C30874m(valueOf, "updateCalendar"));
        this.f77748j.mo111491c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onNormalViewTimeZoneChanged(C32490h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "timeZoneChanged");
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("onNormalViewTimeZoneChanged"));
        TimeZone safeMobileNormalViewTimezone = C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone();
        this.f77743e.mo110702a(safeMobileNormalViewTimezone);
        IDiagramController iVar = this.f77745g;
        if (iVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "timeZone");
            String id = safeMobileNormalViewTimezone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "timeZone.id");
            iVar.mo110994a(id);
        }
        CalendarTabContainer bVar = this.f77755r;
        if (bVar != null) {
            CalendarDate d = this.f77743e.mo110705d();
            Intrinsics.checkExpressionValueIsNotNull(d, "mCalendarDateLogic.currentDayDate");
            bVar.mo111883a(d);
        }
        EventBus.getDefault().trigger(new C32493l());
    }

    /* renamed from: a */
    public final void mo111807a(int i) {
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("modifyTabProgressForAppLink index = " + i));
        int a = C30668b.m114025a(i);
        if (a == 4) {
            CalendarTabContainer bVar = this.f77755r;
            if (bVar != null) {
                bVar.mo111884a(false, (float) this.f77743e.mo110699a().modifyDay(1).dayDiff(this.f77743e.mo110705d().modifyDay(1)));
            }
        } else if (a != 31) {
            CalendarTabContainer bVar2 = this.f77755r;
            if (bVar2 != null) {
                bVar2.mo111884a(false, (float) this.f77743e.mo110699a().dayDiff(this.f77743e.mo110705d()));
            }
        } else {
            CalendarTabContainer bVar3 = this.f77755r;
            if (bVar3 != null) {
                bVar3.mo111884a(true, (float) this.f77743e.mo110699a().dayDiff(this.f77743e.mo110705d()));
            }
        }
    }

    /* renamed from: a */
    public final void mo111809a(CalendarTabContainer bVar) {
        this.f77755r = bVar;
        if (bVar != null) {
            CalendarDate d = this.f77743e.mo110705d();
            Intrinsics.checkExpressionValueIsNotNull(d, "mCalendarDateLogic.currentDayDate");
            bVar.mo111883a(d);
        }
    }

    /* renamed from: a */
    private final void m115156a(int i, IDiagramController iVar) {
        IDependency bVar;
        Activity a;
        Log.m165389i("CalendarMainPresenter", C32673y.m125378d("initDiagramController numDay = " + i));
        if (iVar != null && (bVar = this.f77747i) != null && (a = bVar.mo111841a()) != null) {
            C30867f fVar = new C30867f(this);
            C30866e eVar = new C30866e(this);
            iVar.mo110990a(a);
            iVar.mo110992a(fVar, this.f77763z, eVar);
            this.f77745g = iVar;
        }
    }

    /* renamed from: a */
    public final void mo111810a(String str, String str2) {
        long j;
        Intrinsics.checkParameterIsNotNull(str, "viewType");
        Intrinsics.checkParameterIsNotNull(str2, "viewDate");
        CalendarDate calendarDate = new CalendarDate();
        if (!TextUtils.isEmpty(str2)) {
            try {
                j = Long.parseLong(str2);
            } catch (Exception unused) {
                Log.m165383e("CalendarMainPresenter", "invalid date");
                j = 0;
            }
            if (j != 0) {
                calendarDate = CalendarDate.getCalendarDate(j * ((long) 1000), this.f77743e.mo110707f());
                Intrinsics.checkExpressionValueIsNotNull(calendarDate, "CalendarDate.getCalendar…arDateLogic.viewTimeZone)");
            }
        }
        this.f77743e.mo110701a(calendarDate);
        this.f77741c = str;
        this.f77740b = true;
        int a = mo111805a(str);
        C30667a.m114019a(a);
        m115157b(a);
        IDependency bVar = this.f77747i;
        if (bVar != null) {
            bVar.mo111843b();
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m115155a(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return activity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public CalendarPresenter(Context context, int i, CalendarDiagramContainer aVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mDiagramContainer");
        this.f77750l = context;
        this.f77738A = i;
        this.f77751m = aVar;
        this.f77743e = new C30663a(i);
        this.f77744f = new DragSaveProcess(new C30869h(this));
        this.f77756s = new RunnableC30868g(this);
        this.f77759v = new CallbackManager();
        RunnableC30870i iVar = new RunnableC30870i(this);
        this.f77760w = iVar;
        this.f77748j = new C30798e(iVar);
        this.f77749k = new RunnableC30871j(this);
        this.f77762y = new CalendarPresenter$mTimeZoneChangedReceiver$1(this);
        this.f77763z = new C30872k(this);
        this.f77745g = m115158c(this.f77738A);
        int i2 = this.f77738A;
        if (i2 == 1) {
            str = "day";
        } else if (i2 == 31) {
            str = "list";
        } else if (i2 == 3) {
            str = "threeday";
        } else if (i2 != 4) {
            str = "no_value";
        } else {
            str = "month";
        }
        ParamStoreData.f83351a.mo118743a(str);
    }
}
