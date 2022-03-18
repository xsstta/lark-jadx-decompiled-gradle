package com.ss.android.lark.calendar.impl.features.calendarview.room;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.C30804f;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import com.ss.android.lark.calendar.impl.features.calendarview.room.levelfilter.LevelFilterDialog;
import com.ss.android.lark.calendar.impl.features.calendarview.room.meetingroom.MeetingRoomAdapter;
import com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.BuildingDialog;
import com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.RoomFilterAdapter;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.BuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.EquipmentViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.LevelFilterViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneBuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneRoomItemData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomFilterViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomNestScrollingView;
import com.ss.android.lark.calendar.impl.features.calendarview.room.widget.RoomTipView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.MonthIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.WeekIndicator;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.CapacitySelectDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentSelectDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceEntrance;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020 H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u000fH\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0015H\u0002J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002J\u0010\u00101\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u00102\u001a\u00020 H\u0016J\u0012\u00103\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u00020 H\u0016J\u0012\u00107\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020\rH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView;", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/IRoomDiagramView;", "roomViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/IRoomViewModel;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/IRoomViewModel;)V", "mBuildingDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog;", "mFilterAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter;", "mInstanceLoadToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mIsCalendarTab", "", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getMLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "mLifecycleRegistry$delegate", "Lkotlin/Lazy;", "mMaimActivity", "Landroid/app/Activity;", "mMeetingRoomAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter;", "mProgress", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabScrollProgress;", "getMProgress", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabScrollProgress;", "mProgress$delegate", "mRoomNestScrollingView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/widget/RoomNestScrollingView;", "create", "", "context", "Landroid/content/Context;", "destroy", "getDiagramView", "Landroid/view/View;", "getLifecycle", "handleSelectDateChange", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "initCalendarViewPager", "initFilterRecyclerView", "initInstanceLoadingDialog", "activity", "initLifeCycle", "initLiveData", "initRefreshView", "initRoomRecyclerView", "moveToToday", "refreshWeekIndicator", "nullableDayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "resume", "setActivity", "switchTab", "isCalendarTab", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d */
public final class RoomDiagramView implements LifecycleOwner, IRoomDiagramView {

    /* renamed from: h */
    public static final Companion f78213h = new Companion(null);

    /* renamed from: a */
    public RoomNestScrollingView f78214a;

    /* renamed from: b */
    public BuildingDialog f78215b;

    /* renamed from: c */
    public RoomFilterAdapter f78216c;

    /* renamed from: d */
    public MeetingRoomAdapter f78217d;

    /* renamed from: e */
    public RequestLoadingDialog f78218e;

    /* renamed from: f */
    public boolean f78219f;

    /* renamed from: g */
    public final IRoomViewModel f78220g;

    /* renamed from: i */
    private Activity f78221i;

    /* renamed from: j */
    private final Lazy f78222j = LazyKt.lazy(C31049s.INSTANCE);

    /* renamed from: k */
    private final Lazy f78223k = LazyKt.lazy(new C31048r(this));

    /* renamed from: f */
    private final C30804f m115765f() {
        return (C30804f) this.f78222j.getValue();
    }

    /* renamed from: g */
    private final LifecycleRegistry m115766g() {
        return (LifecycleRegistry) this.f78223k.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabScrollProgress;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$s */
    static final class C31049s extends Lambda implements Function0<C30804f> {
        public static final C31049s INSTANCE = new C31049s();

        C31049s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C30804f invoke() {
            return new C30804f();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomDiagramView
    /* renamed from: a */
    public View mo112215a() {
        return this.f78214a;
    }

    /* renamed from: e */
    public LifecycleRegistry getLifecycle() {
        return m115766g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleRegistry;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$r */
    static final class C31048r extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ RoomDiagramView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31048r(RoomDiagramView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomDiagramView
    /* renamed from: d */
    public void mo112220d() {
        m115766g().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    /* renamed from: h */
    private final void m115767h() {
        m115766g().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        m115766g().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    /* renamed from: i */
    private final void m115768i() {
        RoomNestScrollingView roomNestScrollingView = this.f78214a;
        if (roomNestScrollingView != null) {
            ((ImageView) roomNestScrollingView.mo112430a(R.id.instanceRefreshView)).setOnClickListener(new View$OnClickListenerC31044n(this, roomNestScrollingView));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomDiagramView
    /* renamed from: b */
    public void mo112218b() {
        mo112320a(new CalendarDate());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView$initRoomRecyclerView$3", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$q */
    public static final class C31047q extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78246a;

        /* renamed from: b */
        final /* synthetic */ RoomNestScrollingView f78247b;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView recyclerView = (RecyclerView) this.f78247b.mo112430a(R.id.roomRecyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.roomRecyclerView");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                this.f78246a.f78220g.onRoomViewScrolling(linearLayoutManager.findFirstVisibleItemPosition() - 1, linearLayoutManager.findLastVisibleItemPosition() + 1);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        C31047q(RoomDiagramView dVar, RoomNestScrollingView roomNestScrollingView) {
            this.f78246a = dVar;
            this.f78247b = roomNestScrollingView;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomDiagramView
    /* renamed from: c */
    public void mo112219c() {
        if (!this.f78220g.getCurrentDate().sameDay(new CalendarDate())) {
            this.f78220g.onCurrentDayChanged();
            RoomNestScrollingView roomNestScrollingView = this.f78214a;
            if (roomNestScrollingView != null) {
                roomNestScrollingView.mo112431a(this.f78220g.getCurrentDate(), this.f78220g.getSelectedDate());
            }
            mo112321a(this.f78220g.getFirstDayOfWeek().mo5927b());
        }
    }

    /* renamed from: j */
    private final void m115769j() {
        RoomDiagramView dVar = this;
        this.f78220g.getFirstDayOfWeek().mo5923a(dVar, new C31027d(this));
        this.f78220g.isShowLunar().mo5923a(dVar, new C31029f(this));
        this.f78220g.getFilterLiveData().mo5923a(dVar, new C31030g(this));
        this.f78220g.getBuildingLiveData().mo5923a(dVar, new C31031h(this));
        this.f78220g.getLevelFilterLiveData().mo5923a(dVar, new C31034i(this));
        this.f78220g.getLevelLoadingView().mo5923a(dVar, new C31036j(this));
        this.f78220g.getEquipmentLiveData().mo5923a(dVar, new C31038k(this));
        this.f78220g.getCapacityLiveData().mo5923a(dVar, new C31041l(this));
        this.f78220g.getMeetingRoomLiveData().mo5923a(dVar, new C31043m(this));
        this.f78220g.getRoomInstanceLiveData().mo5923a(dVar, new C31028e(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomDiagramView
    /* renamed from: a */
    public void mo112217a(boolean z) {
        this.f78219f = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/LevelFilterViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$i */
    public static final class C31034i<T> implements AbstractC1178x<LevelFilterViewData> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78232a;

        C31034i(RoomDiagramView dVar) {
            this.f78232a = dVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "selectResource", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "invoke", "com/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView$initLiveData$5$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$i$a */
        public static final class C31035a extends Lambda implements Function1<List<? extends CalendarResource>, Unit> {
            final /* synthetic */ LevelFilterViewData $it$inlined;
            final /* synthetic */ C31034i this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31035a(C31034i iVar, LevelFilterViewData fVar) {
                super(1);
                this.this$0 = iVar;
                this.$it$inlined = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CalendarResource> list) {
                invoke((List<CalendarResource>) list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<CalendarResource> list) {
                Intrinsics.checkParameterIsNotNull(list, "selectResource");
                this.this$0.f78232a.f78220g.onFilterMultiLevelChanged(list);
            }
        }

        /* renamed from: a */
        public final void onChanged(LevelFilterViewData fVar) {
            RoomNestScrollingView roomNestScrollingView;
            Context context;
            if (fVar.mo112372d() != null && (roomNestScrollingView = this.f78232a.f78214a) != null && (context = roomNestScrollingView.getContext()) != null) {
                LevelFilterDialog aVar = new LevelFilterDialog(context, 0, 2, null);
                aVar.mo112224a(new C31035a(this, fVar));
                Intrinsics.checkExpressionValueIsNotNull(fVar, "it");
                aVar.mo112222a(fVar);
                aVar.show();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView$initFilterRecyclerView$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter$OnItemClickListener;", "onItemClick", "", "id", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$c */
    public static final class C31026c implements RoomFilterAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78224a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31026c(RoomDiagramView dVar) {
            this.f78224a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.RoomFilterAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo112315a(int i) {
            if (i == 0) {
                this.f78224a.f78220g.onBuildingDialogShow();
            } else if (i == 1) {
                this.f78224a.f78220g.onEquipmentDialogShow();
            } else if (i == 2) {
                this.f78224a.f78220g.onCapacityDialogShow();
            } else if (i == 3) {
                this.f78224a.f78220g.onMultiLevelDialogShow();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView$initRoomRecyclerView$1", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$o */
    public static final class C31045o extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78243a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31045o(RoomDiagramView dVar) {
            this.f78243a = dVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            this.f78243a.f78220g.onRoomViewScrolling(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomFilterViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$g */
    public static final class C31030g<T> implements AbstractC1178x<RoomFilterViewData> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78228a;

        C31030g(RoomDiagramView dVar) {
            this.f78228a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(RoomFilterViewData lVar) {
            RoomFilterAdapter dVar = this.f78228a.f78216c;
            if (dVar != null) {
                dVar.mo112314a(lVar.mo112419a());
            }
        }
    }

    /* renamed from: b */
    private final void m115761b(Activity activity) {
        RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog(activity);
        requestLoadingDialog.mo112590b();
        this.f78218e = requestLoadingDialog;
    }

    /* renamed from: a */
    public void mo112319a(Activity activity) {
        if (activity != null) {
            this.f78221i = activity;
            if (this.f78218e == null) {
                m115761b(activity);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$d */
    public static final class C31027d<T> implements AbstractC1178x<CalendarSetting.DayOfWeek> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78225a;

        C31027d(RoomDiagramView dVar) {
            this.f78225a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(CalendarSetting.DayOfWeek dayOfWeek) {
            RoomNestScrollingView roomNestScrollingView = this.f78225a.f78214a;
            if (roomNestScrollingView != null) {
                roomNestScrollingView.mo112431a(this.f78225a.f78220g.getCurrentDate(), this.f78225a.f78220g.getSelectedDate());
            }
            this.f78225a.mo112321a(dayOfWeek);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$f */
    public static final class C31029f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78227a;

        C31029f(RoomDiagramView dVar) {
            this.f78227a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            RoomNestScrollingView roomNestScrollingView = this.f78227a.f78214a;
            if (roomNestScrollingView != null) {
                roomNestScrollingView.mo112435b(Intrinsics.areEqual((Object) bool, (Object) true));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/EquipmentViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$k */
    public static final class C31038k<T> implements AbstractC1178x<EquipmentViewData> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78235a;

        C31038k(RoomDiagramView dVar) {
            this.f78235a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(EquipmentViewData cVar) {
            Context context;
            List<EquipmentData> a = cVar.mo112354a();
            RoomNestScrollingView roomNestScrollingView = this.f78235a.f78214a;
            if (roomNestScrollingView != null && (context = roomNestScrollingView.getContext()) != null) {
                EquipmentSelectDialog cVar2 = new EquipmentSelectDialog(context, 0, 2, null);
                cVar2.mo116067a(new EquipmentSelectDialog.OnEquipmentChangedListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView.C31038k.C310391 */

                    /* renamed from: a */
                    final /* synthetic */ C31038k f78236a;

                    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentSelectDialog.OnEquipmentChangedListener
                    /* renamed from: a */
                    public void mo112334a() {
                        this.f78236a.f78235a.f78220g.onFilterEquipmentCleared();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f78236a = r1;
                    }

                    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentSelectDialog.OnEquipmentChangedListener
                    /* renamed from: a */
                    public void mo112335a(EquipmentData bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "equipment");
                        GeneralHitPoint.f83331a.mo118717D("search_device");
                        this.f78236a.f78235a.f78220g.onFilterEquipmentChanged(bVar);
                    }
                });
                cVar2.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView.C31038k.DialogInterface$OnDismissListenerC310402 */

                    /* renamed from: a */
                    final /* synthetic */ C31038k f78237a;

                    {
                        this.f78237a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f78237a.f78235a.f78220g.onFilterChanged();
                    }
                });
                if (CollectionUtils.isNotEmpty(a)) {
                    cVar2.mo112221a().mo116074a(a);
                    cVar2.show();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "capacity", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$l */
    public static final class C31041l<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78238a;

        C31041l(RoomDiagramView dVar) {
            this.f78238a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Context context;
            RoomNestScrollingView roomNestScrollingView = this.f78238a.f78214a;
            if (roomNestScrollingView != null && (context = roomNestScrollingView.getContext()) != null) {
                CapacitySelectDialog aVar = new CapacitySelectDialog(context, 0, 2, null);
                aVar.mo116055a(new CapacitySelectDialog.OnCapacityChangedListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView.C31041l.C310421 */

                    /* renamed from: a */
                    final /* synthetic */ C31041l f78239a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f78239a = r1;
                    }

                    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.CapacitySelectDialog.OnCapacityChangedListener
                    /* renamed from: a */
                    public void mo112338a(int i) {
                        GeneralHitPoint.f83331a.mo118717D("search_num");
                        this.f78239a.f78238a.f78220g.onFilterCapacityChanged(i);
                        this.f78239a.f78238a.f78220g.onFilterChanged();
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(num, "capacity");
                aVar.mo116054a(num.intValue());
                aVar.show();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView$initRoomRecyclerView$2", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter$ItemClickListener;", "onClickItem", "", "roomData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$p */
    public static final class C31046p implements MeetingRoomAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78244a;

        /* renamed from: b */
        final /* synthetic */ Context f78245b;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.meetingroom.MeetingRoomAdapter.ItemClickListener
        /* renamed from: a */
        public void mo112239a(OneRoomItemData kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "roomData");
            GeneralHitPoint.f83331a.mo118718E(kVar.mo112406b());
            RoomInstanceEntrance.m122116a(this.f78245b, kVar.mo112411f(), kVar.mo112402a(), this.f78244a.f78220g.getSelectedDate().getJulianDay(), 0, 16, null);
        }

        C31046p(RoomDiagramView dVar, Context context) {
            this.f78244a = dVar;
            this.f78245b = context;
        }
    }

    public RoomDiagramView(IRoomViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "roomViewModel");
        this.f78220g = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "roomInstance", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$e */
    public static final class C31028e<T> implements AbstractC1178x<RoomInstanceViewData> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78226a;

        C31028e(RoomDiagramView dVar) {
            this.f78226a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(RoomInstanceViewData mVar) {
            boolean z;
            ImageView imageView;
            MeetingRoomAdapter aVar = this.f78226a.f78217d;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(mVar, "roomInstance");
                aVar.mo112237a(mVar);
            }
            RoomNestScrollingView roomNestScrollingView = this.f78226a.f78214a;
            if (!(roomNestScrollingView == null || (imageView = (ImageView) roomNestScrollingView.mo112430a(R.id.instanceRefreshView)) == null)) {
                imageView.clearAnimation();
            }
            if (!this.f78226a.f78219f || !C30667a.m114021c()) {
                z = false;
            } else {
                z = true;
            }
            if (!mVar.mo112420a() || !z) {
                RequestLoadingDialog requestLoadingDialog = this.f78226a.f78218e;
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.mo112593d(R.string.Calendar_MeetingRoom_Refreshed);
                    return;
                }
                return;
            }
            RequestLoadingDialog requestLoadingDialog2 = this.f78226a.f78218e;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.show();
            }
            RequestLoadingDialog requestLoadingDialog3 = this.f78226a.f78218e;
            if (requestLoadingDialog3 != null) {
                requestLoadingDialog3.mo112592c(R.string.Calendar_MeetingRoom_UnableToRefresh);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/BuildingFloorViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$h */
    public static final class C31031h<T> implements AbstractC1178x<BuildingFloorViewData> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78229a;

        C31031h(RoomDiagramView dVar) {
            this.f78229a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(BuildingFloorViewData aVar) {
            Context context;
            List<OneBuildingFloorViewData> a = aVar.mo112351a();
            if (this.f78229a.f78215b != null) {
                BuildingDialog aVar2 = this.f78229a.f78215b;
                if (aVar2 != null) {
                    aVar2.mo112282a(a);
                    return;
                }
                return;
            }
            RoomNestScrollingView roomNestScrollingView = this.f78229a.f78214a;
            if (roomNestScrollingView != null && (context = roomNestScrollingView.getContext()) != null) {
                BuildingDialog aVar3 = new BuildingDialog(context, 0, 2, null);
                this.f78229a.f78215b = aVar3;
                aVar3.mo112281a(new BuildingDialog.OnBuildingFloorListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView.C31031h.C310321 */

                    /* renamed from: a */
                    final /* synthetic */ C31031h f78230a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f78230a = r1;
                    }

                    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.BuildingDialog.OnBuildingFloorListener
                    /* renamed from: a */
                    public void mo112285a(String str) {
                        this.f78230a.f78229a.f78220g.onSearchBuildingTextChanged(str);
                    }

                    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.BuildingDialog.OnBuildingFloorListener
                    /* renamed from: a */
                    public void mo112286a(List<OneBuildingFloorViewData> list) {
                        Intrinsics.checkParameterIsNotNull(list, "selectBuildings");
                        GeneralHitPoint.f83331a.mo118717D("search_room");
                        this.f78230a.f78229a.f78220g.onFilterBuildingChanged(list);
                    }
                });
                aVar3.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView.C31031h.DialogInterface$OnDismissListenerC310332 */

                    /* renamed from: a */
                    final /* synthetic */ C31031h f78231a;

                    {
                        this.f78231a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f78231a.f78229a.f78220g.onFilterChanged();
                        this.f78231a.f78229a.f78215b = null;
                    }
                });
                aVar3.mo112282a(a);
                aVar3.show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$j */
    public static final class C31036j<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78233a;

        C31036j(RoomDiagramView dVar) {
            this.f78233a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            RoomNestScrollingView roomNestScrollingView = this.f78233a.f78214a;
            if (roomNestScrollingView == null) {
                return;
            }
            if (num != null && num.intValue() == 0) {
                CalendarLoadingView calendarLoadingView = (CalendarLoadingView) roomNestScrollingView.mo112430a(R.id.calendar_loading_view);
                Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.calendar_loading_view");
                calendarLoadingView.setVisibility(0);
                ((CalendarLoadingView) roomNestScrollingView.mo112430a(R.id.calendar_loading_view)).mo116402a();
            } else if (num != null && num.intValue() == 1) {
                CalendarLoadingView calendarLoadingView2 = (CalendarLoadingView) roomNestScrollingView.mo112430a(R.id.calendar_loading_view);
                Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView2, "rootView.calendar_loading_view");
                calendarLoadingView2.setVisibility(8);
                ((CalendarLoadingView) roomNestScrollingView.mo112430a(R.id.calendar_loading_view)).mo116404b();
            } else if (num != null && num.intValue() == 2) {
                ((CalendarLoadingView) roomNestScrollingView.mo112430a(R.id.calendar_loading_view)).setOnLoadingViewClickedListener(new CalendarLoadingView.AbstractC31882a(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView.C31036j.C310371 */

                    /* renamed from: a */
                    final /* synthetic */ C31036j f78234a;

                    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
                    /* renamed from: b */
                    public void mo110520b() {
                    }

                    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
                    /* renamed from: a */
                    public void mo110519a() {
                        this.f78234a.f78233a.f78220g.preLoadData();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f78234a = r1;
                    }
                });
                ((CalendarLoadingView) roomNestScrollingView.mo112430a(R.id.calendar_loading_view)).mo116405c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$n */
    public static final class View$OnClickListenerC31044n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78241a;

        /* renamed from: b */
        final /* synthetic */ RoomNestScrollingView f78242b;

        View$OnClickListenerC31044n(RoomDiagramView dVar, RoomNestScrollingView roomNestScrollingView) {
            this.f78241a = dVar;
            this.f78242b = roomNestScrollingView;
        }

        public final void onClick(View view) {
            RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(500);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setFillAfter(false);
            rotateAnimation.setStartOffset(10);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            ((ImageView) this.f78242b.mo112430a(R.id.instanceRefreshView)).startAnimation(rotateAnimation);
            RequestLoadingDialog requestLoadingDialog = this.f78241a.f78218e;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112585a(R.string.Calendar_MeetingRoom_Refreshing);
            }
            this.f78241a.f78220g.onRefreshInstanceManually();
        }
    }

    /* renamed from: b */
    private final void m115762b(Context context) {
        RoomNestScrollingView roomNestScrollingView = this.f78214a;
        if (roomNestScrollingView != null) {
            roomNestScrollingView.mo112432a(Intrinsics.areEqual((Object) this.f78220g.isShowLunar().mo5927b(), (Object) true));
            C31025b bVar = new C31025b(this);
            ((WeekIndicator) roomNestScrollingView.mo112430a(R.id.weekViewPager)).setDateChangeListener(bVar);
            ((MonthIndicator) roomNestScrollingView.mo112430a(R.id.monthViewPager)).setDateChangeListener(bVar);
            RoomNestScrollingView roomNestScrollingView2 = this.f78214a;
            if (roomNestScrollingView2 != null) {
                roomNestScrollingView2.mo112431a(this.f78220g.getCurrentDate(), this.f78220g.getSelectedDate());
            }
        }
    }

    /* renamed from: c */
    private final void m115763c(Context context) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.f78216c = new RoomFilterAdapter();
        RoomNestScrollingView roomNestScrollingView = this.f78214a;
        if (!(roomNestScrollingView == null || (recyclerView2 = (RecyclerView) roomNestScrollingView.mo112430a(R.id.filterRecyclerView)) == null)) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        RoomNestScrollingView roomNestScrollingView2 = this.f78214a;
        if (!(roomNestScrollingView2 == null || (recyclerView = (RecyclerView) roomNestScrollingView2.mo112430a(R.id.filterRecyclerView)) == null)) {
            recyclerView.setAdapter(this.f78216c);
        }
        RoomFilterAdapter dVar = this.f78216c;
        if (dVar != null) {
            dVar.mo112312a(new C31026c(this));
        }
    }

    /* renamed from: d */
    private final void m115764d(Context context) {
        RoomNestScrollingView roomNestScrollingView = this.f78214a;
        if (roomNestScrollingView != null) {
            ((RecyclerView) roomNestScrollingView.mo112430a(R.id.roomRecyclerView)).addOnScrollListener(new C31045o(this));
            MeetingRoomAdapter aVar = new MeetingRoomAdapter();
            aVar.mo112236a(new C31046p(this, context));
            aVar.registerAdapterDataObserver(new C31047q(this, roomNestScrollingView));
            this.f78217d = aVar;
            RecyclerView recyclerView = (RecyclerView) roomNestScrollingView.mo112430a(R.id.roomRecyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.roomRecyclerView");
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            RecyclerView recyclerView2 = (RecyclerView) roomNestScrollingView.mo112430a(R.id.roomRecyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.roomRecyclerView");
            recyclerView2.setAdapter(this.f78217d);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomDiagramView
    /* renamed from: a */
    public void mo112216a(Context context) {
        m115767h();
        if (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                this.f78221i = activity;
                m115761b(activity);
            }
            this.f78214a = new RoomNestScrollingView(context, null, 2, null);
            m115762b(context);
            m115763c(context);
            m115768i();
            m115764d(context);
            m115769j();
            m115765f().mo111607a(false);
            m115765f().mo111610c((float) this.f78220g.getSelectedDate().dayDiff(this.f78220g.getCurrentDate()));
            return;
        }
        Log.m165383e("RoomDiagramView", C32673y.m125378d("context is null"));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "roomData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$m */
    public static final class C31043m<T> implements AbstractC1178x<RoomViewData> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramView f78240a;

        C31043m(RoomDiagramView dVar) {
            this.f78240a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(RoomViewData oVar) {
            RoomNestScrollingView roomNestScrollingView = this.f78240a.f78214a;
            if (roomNestScrollingView == null) {
                return;
            }
            if (oVar.mo112426a()) {
                RecyclerView recyclerView = (RecyclerView) roomNestScrollingView.mo112430a(R.id.roomRecyclerView);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.roomRecyclerView");
                recyclerView.setVisibility(8);
                RoomTipView roomTipView = (RoomTipView) roomNestScrollingView.mo112430a(R.id.roomTipView);
                Intrinsics.checkExpressionValueIsNotNull(roomTipView, "rootView.roomTipView");
                roomTipView.setVisibility(0);
                ((RoomTipView) roomNestScrollingView.mo112430a(R.id.roomTipView)).mo112450a();
            } else if (oVar.mo112427b().isEmpty()) {
                RecyclerView recyclerView2 = (RecyclerView) roomNestScrollingView.mo112430a(R.id.roomRecyclerView);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.roomRecyclerView");
                recyclerView2.setVisibility(8);
                RoomTipView roomTipView2 = (RoomTipView) roomNestScrollingView.mo112430a(R.id.roomTipView);
                Intrinsics.checkExpressionValueIsNotNull(roomTipView2, "rootView.roomTipView");
                roomTipView2.setVisibility(0);
                ((RoomTipView) roomNestScrollingView.mo112430a(R.id.roomTipView)).mo112451b();
            } else {
                RecyclerView recyclerView3 = (RecyclerView) roomNestScrollingView.mo112430a(R.id.roomRecyclerView);
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                RoomTipView roomTipView3 = (RoomTipView) roomNestScrollingView.mo112430a(R.id.roomTipView);
                Intrinsics.checkExpressionValueIsNotNull(roomTipView3, "rootView.roomTipView");
                roomTipView3.setVisibility(8);
                MeetingRoomAdapter aVar = this.f78240a.f78217d;
                if (aVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(oVar, "roomData");
                    aVar.mo112238a(oVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo112320a(CalendarDate calendarDate) {
        if (calendarDate.getJulianDay() != this.f78220g.getSelectedDate().getJulianDay()) {
            GeneralHitPoint.f83331a.mo118717D("change_date");
        }
        this.f78220g.onSelectDayChanged(calendarDate);
        RoomNestScrollingView roomNestScrollingView = this.f78214a;
        if (roomNestScrollingView != null) {
            roomNestScrollingView.mo112431a(this.f78220g.getCurrentDate(), this.f78220g.getSelectedDate());
        }
        m115765f().mo111607a(false);
        m115765f().mo111608b((float) calendarDate.dayDiff(this.f78220g.getCurrentDate()));
        mo112321a(this.f78220g.getFirstDayOfWeek().mo5927b());
    }

    /* renamed from: a */
    public final void mo112321a(CalendarSetting.DayOfWeek dayOfWeek) {
        MonthIndicator monthIndicator;
        WeekIndicator weekIndicator;
        CalendarWeekIndicator calendarWeekIndicator;
        if (dayOfWeek == null) {
            dayOfWeek = CalendarSetting.DayOfWeek.SUNDAY;
        }
        CalendarDate currentDate = this.f78220g.getCurrentDate();
        int weeklyDayIndex = currentDate.getWeeklyDayIndex(dayOfWeek);
        CalendarDate selectedDate = this.f78220g.getSelectedDate();
        RoomNestScrollingView roomNestScrollingView = this.f78214a;
        boolean z = true;
        if (roomNestScrollingView == null || !roomNestScrollingView.mo112433a()) {
            z = selectedDate.getFirstDayOfTheWeek(dayOfWeek).sameDay(currentDate.getFirstDayOfTheWeek(dayOfWeek));
        } else if (!(selectedDate.getYear() == currentDate.getYear() && selectedDate.getMonth() == currentDate.getMonth())) {
            z = false;
        }
        RoomNestScrollingView roomNestScrollingView2 = this.f78214a;
        if (!(roomNestScrollingView2 == null || (calendarWeekIndicator = (CalendarWeekIndicator) roomNestScrollingView2.mo112430a(R.id.weekIndicator)) == null)) {
            calendarWeekIndicator.mo112909a(weeklyDayIndex, z, dayOfWeek);
        }
        RoomNestScrollingView roomNestScrollingView3 = this.f78214a;
        if (!(roomNestScrollingView3 == null || (weekIndicator = (WeekIndicator) roomNestScrollingView3.mo112430a(R.id.weekViewPager)) == null)) {
            weekIndicator.setFirstDayOfWeek(dayOfWeek);
        }
        RoomNestScrollingView roomNestScrollingView4 = this.f78214a;
        if (!(roomNestScrollingView4 == null || (monthIndicator = (MonthIndicator) roomNestScrollingView4.mo112430a(R.id.monthViewPager)) == null)) {
            monthIndicator.setFirstDayOfWeek(dayOfWeek);
        }
        RoomNestScrollingView roomNestScrollingView5 = this.f78214a;
        if (roomNestScrollingView5 != null) {
            roomNestScrollingView5.mo112439f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", C63690d.f160779a, "", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d$b */
    public static final class C31025b extends Lambda implements Function2<Integer, Boolean, Unit> {
        final /* synthetic */ RoomDiagramView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31025b(RoomDiagramView dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            invoke(num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z) {
            RoomDiagramView dVar = this.this$0;
            CalendarDate julianDay = new CalendarDate().setJulianDay(i);
            Intrinsics.checkExpressionValueIsNotNull(julianDay, "CalendarDate().setJulianDay(d)");
            dVar.mo112320a(julianDay);
        }
    }
}
