package com.ss.android.lark.calendar.impl.features.calendarview.room;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.BuildingFloorFilter;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.GetBuildingsResponse;
import com.bytedance.lark.pb.calendar.v1.GetLocalRoomViewResourceDataResponse;
import com.bytedance.lark.pb.calendar.v1.GetResourceEquipmentsResponse;
import com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesResponse;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.PushRoomViewInstanceChangeNotification;
import com.bytedance.lark.pb.calendar.v1.RoomViewFilterConfigs;
import com.bytedance.lark.pb.calendar.v1.RoomViewInstance;
import com.bytedance.lark.pb.calendar.v1.UpdateRoomViewResourceDataResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramModel;
import com.ss.android.lark.calendar.impl.features.calendarview.room.util.RoomInstanceThrottle;
import com.ss.android.lark.calendar.impl.features.calendarview.room.util.RoomRefreshTimer;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.BuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.BuildingFloorViewDataImpl;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.EquipmentViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.LevelFilterViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneBuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomFilterViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewDataImpl;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomViewDataImpl;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.framework.busevents.BookRoomFinishEvent;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0004\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020%H\u0016J\b\u0010M\u001a\u00020%H\u0016J\b\u0010N\u001a\u00020JH\u0002J\b\u0010O\u001a\u00020JH\u0002J\b\u0010P\u001a\u00020JH\u0002J$\u0010Q\u001a\u00020J2\u0006\u0010R\u001a\u00020S2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020J0UH\u0002J.\u0010V\u001a\u00020J2\u0006\u0010W\u001a\u00020X2\u001c\b\u0002\u0010Y\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z\u0012\u0004\u0012\u00020J\u0018\u00010UH\u0002J\u0010\u0010\\\u001a\u00020J2\u0006\u0010]\u001a\u00020^H\u0007J\b\u0010_\u001a\u00020JH\u0016J\b\u0010`\u001a\u00020JH\u0016J\b\u0010a\u001a\u00020JH\u0016J\b\u0010b\u001a\u00020JH\u0016J\u0016\u0010c\u001a\u00020J2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020e0ZH\u0016J\u0010\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020\rH\u0016J\b\u0010h\u001a\u00020JH\u0016J\u0010\u0010i\u001a\u00020J2\u0006\u0010j\u001a\u00020kH\u0016J\b\u0010l\u001a\u00020JH\u0016J\u0016\u0010m\u001a\u00020J2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020o0ZH\u0016J\b\u0010p\u001a\u00020JH\u0016J\b\u0010q\u001a\u00020JH\u0016J\u0018\u0010r\u001a\u00020J2\u0006\u0010s\u001a\u00020\r2\u0006\u0010t\u001a\u00020\rH\u0016J\u0012\u0010u\u001a\u00020J2\b\u0010v\u001a\u0004\u0018\u00010wH\u0016J\u0010\u0010x\u001a\u00020J2\u0006\u0010y\u001a\u00020%H\u0016J\u0010\u0010z\u001a\u00020J2\u0006\u0010{\u001a\u00020|H\u0007J\b\u0010}\u001a\u00020JH\u0002J\b\u0010~\u001a\u00020JH\u0002J\b\u0010\u001a\u00020JH\u0016J\t\u0010\u0001\u001a\u00020JH\u0002J\t\u0010\u0001\u001a\u00020JH\u0002J\t\u0010\u0001\u001a\u00020JH\u0002R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\bR\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R#\u0010&\u001a\n (*\u0004\u0018\u00010'0'8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0014\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b:\u0010\u0014\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b?\u0010\u0014\u001a\u0004\b=\u0010>R\u000e\u0010@\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\bR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\bR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020%0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\b¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/IRoomViewModel;", "()V", "accountChanged", "Landroidx/lifecycle/MutableLiveData;", "", "getAccountChanged", "()Landroidx/lifecycle/MutableLiveData;", "buildingLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/BuildingFloorViewData;", "getBuildingLiveData", "capacityLiveData", "", "getCapacityLiveData", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "equipmentLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/EquipmentViewData;", "getEquipmentLiveData", "filterLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomFilterViewData;", "getFilterLiveData", "firstDayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "getFirstDayOfWeek", "isShowLunar", "levelFilterLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/LevelFilterViewData;", "getLevelFilterLiveData", "levelLoadingView", "getLevelLoadingView", "mCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mExecutorService", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getMExecutorService", "()Ljava/util/concurrent/ExecutorService;", "mExecutorService$delegate", "mInstanceThrottle", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomInstanceThrottle;", "getMInstanceThrottle", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomInstanceThrottle;", "mInstanceThrottle$delegate", "mModel", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramModel;", "getMModel", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramModel;", "mModel$delegate", "mRoomRefreshTimer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer;", "getMRoomRefreshTimer", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer;", "mRoomRefreshTimer$delegate", "mRoomViewInstanceChangeListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "getMRoomViewInstanceChangeListener", "()Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mRoomViewInstanceChangeListener$delegate", "mSelectDate", "meetingRoomLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomViewData;", "getMeetingRoomLiveData", "roomInstanceLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewData;", "getRoomInstanceLiveData", "selectDateChangeLiveData", "getSelectDateChangeLiveData", "create", "", "destroy", "getCurrentDate", "getSelectedDate", "loadAllLevelData", "loadBuildings", "loadEquipments", "loadOneRoomInstance", "bookRoomFinishEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/BookRoomFinishEvent;", "launchNextTimer", "Lkotlin/Function1;", "loadRoomViewInstances", "queryTask", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramModel$QueryInstanceTask;", "nextAction", "", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "onAccountChanged", "accountChangedEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/AccountChangedEvent;", "onBuildingDialogShow", "onCapacityDialogShow", "onCurrentDayChanged", "onEquipmentDialogShow", "onFilterBuildingChanged", "buildingsViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "onFilterCapacityChanged", "capacity", "onFilterChanged", "onFilterEquipmentChanged", "equipmentViewData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onFilterEquipmentCleared", "onFilterMultiLevelChanged", "selectedResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "onMultiLevelDialogShow", "onRefreshInstanceManually", "onRoomViewScrolling", "startIndex", "endIndex", "onSearchBuildingTextChanged", "keyWord", "", "onSelectDayChanged", "date", "onSettingChanged", "settingChangedEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "postFilterData", "postRoomData", "preLoadData", "preloadMultiLevelData", "refreshMultiLevelRoom", "refreshRoom", "Companion", "LoadingType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RoomDiagramViewModel extends AbstractC1142af implements IRoomViewModel {
    public static final Companion Companion = new Companion(null);
    private final C1177w<Boolean> accountChanged = new C1177w<>();
    private final C1177w<BuildingFloorViewData> buildingLiveData = new C1177w<>();
    private final C1177w<Integer> capacityLiveData = new C1177w<>();
    private final Lazy dispatcher$delegate = LazyKt.lazy(C30981c.INSTANCE);
    private final C1177w<EquipmentViewData> equipmentLiveData = new C1177w<>();
    private final C1177w<RoomFilterViewData> filterLiveData = new C1177w<>();
    private final C1177w<CalendarSetting.DayOfWeek> firstDayOfWeek = new C1177w<>();
    private final C1177w<Boolean> isShowLunar = new C1177w<>();
    private final C1177w<LevelFilterViewData> levelFilterLiveData = new C1177w<>();
    private final C1177w<Integer> levelLoadingView = new C1177w<>();
    private final CalendarDate mCurrentDate = new CalendarDate();
    private final Lazy mExecutorService$delegate = LazyKt.lazy(C30987i.INSTANCE);
    private final Lazy mInstanceThrottle$delegate = LazyKt.lazy(new C30988j(this));
    private final Lazy mModel$delegate = LazyKt.lazy(C30990k.INSTANCE);
    private final Lazy mRoomRefreshTimer$delegate = LazyKt.lazy(new C30991l(this));
    private final Lazy mRoomViewInstanceChangeListener$delegate = LazyKt.lazy(new C30993m(this));
    public final CalendarDate mSelectDate = new CalendarDate();
    private final C1177w<RoomViewData> meetingRoomLiveData = new C1177w<>();
    private final C1177w<RoomInstanceViewData> roomInstanceLiveData = new C1177w<>();
    private final C1177w<CalendarDate> selectDateChangeLiveData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramViewModel$LoadingType;", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LoadingType {
        public static final Companion Companion = Companion.f78136a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramViewModel$LoadingType$Companion;", "", "()V", "HIDDEN", "", "RETRY", "SHOWN", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$LoadingType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f78136a = new Companion();

            private Companion() {
            }
        }
    }

    private final ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    private final ExecutorService getMExecutorService() {
        return (ExecutorService) this.mExecutorService$delegate.getValue();
    }

    private final RoomRefreshTimer getMRoomRefreshTimer() {
        return (RoomRefreshTimer) this.mRoomRefreshTimer$delegate.getValue();
    }

    private final AbstractC32524a getMRoomViewInstanceChangeListener() {
        return (AbstractC32524a) this.mRoomViewInstanceChangeListener$delegate.getValue();
    }

    public final RoomInstanceThrottle getMInstanceThrottle() {
        return (RoomInstanceThrottle) this.mInstanceThrottle$delegate.getValue();
    }

    public final RoomDiagramModel getMModel() {
        return (RoomDiagramModel) this.mModel$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramViewModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1177w<Boolean> getAccountChanged() {
        return this.accountChanged;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<BuildingFloorViewData> getBuildingLiveData() {
        return this.buildingLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<Integer> getCapacityLiveData() {
        return this.capacityLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public CalendarDate getCurrentDate() {
        return this.mCurrentDate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<EquipmentViewData> getEquipmentLiveData() {
        return this.equipmentLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<RoomFilterViewData> getFilterLiveData() {
        return this.filterLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<CalendarSetting.DayOfWeek> getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<LevelFilterViewData> getLevelFilterLiveData() {
        return this.levelFilterLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<Integer> getLevelLoadingView() {
        return this.levelLoadingView;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<RoomViewData> getMeetingRoomLiveData() {
        return this.meetingRoomLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<RoomInstanceViewData> getRoomInstanceLiveData() {
        return this.roomInstanceLiveData;
    }

    public C1177w<CalendarDate> getSelectDateChangeLiveData() {
        return this.selectDateChangeLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public CalendarDate getSelectedDate() {
        return this.mSelectDate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public C1177w<Boolean> isShowLunar() {
        return this.isShowLunar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$k */
    static final class C30990k extends Lambda implements Function0<RoomDiagramModel> {
        public static final C30990k INSTANCE = new C30990k();

        C30990k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomDiagramModel invoke() {
            return new RoomDiagramModel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$m */
    static final class C30993m extends Lambda implements Function0<AbstractC32524a> {
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30993m(RoomDiagramViewModel roomDiagramViewModel) {
            super(0);
            this.this$0 = roomDiagramViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC32524a invoke() {
            return new AbstractC32524a(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel.C30993m.C309941 */

                /* renamed from: a */
                final /* synthetic */ C30993m f78138a;

                {
                    this.f78138a = r1;
                }

                @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
                public final void onPush(JSONObject jSONObject) {
                    Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    Log.m165389i("RoomDiagramViewModel", C32673y.m125374b("pushInstanceChange"));
                    Object obj = jSONObject.get("changed_resource");
                    if (!(obj instanceof PushRoomViewInstanceChangeNotification)) {
                        Log.m165383e("RoomDiagramViewModel", C32673y.m125374b("dataJson = " + jSONObject));
                        return;
                    }
                    Iterator<T> it = this.f78138a.this$0.getMModel().mo112259c(((PushRoomViewInstanceChangeNotification) obj).resource_calendar_ids).iterator();
                    while (it.hasNext()) {
                        RoomDiagramViewModel.loadRoomViewInstances$default(this.f78138a.this$0, it.next(), null, 2, null);
                    }
                }
            };
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onRefreshInstanceManually() {
        getMInstanceThrottle().mo112344a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$i */
    static final class C30987i extends Lambda implements Function0<ExecutorService> {
        public static final C30987i INSTANCE = new C30987i();

        C30987i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("BaseChipDataCache");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomInstanceThrottle;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$j */
    public static final class C30988j extends Lambda implements Function0<RoomInstanceThrottle> {
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30988j(RoomDiagramViewModel roomDiagramViewModel) {
            super(0);
            this.this$0 = roomDiagramViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomInstanceThrottle invoke() {
            return new RoomInstanceThrottle(new Function0<Unit>(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel.C30988j.C309891 */
                final /* synthetic */ C30988j this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    List<CalendarResource> f = this.this$0.this$0.getMModel().mo112263f();
                    boolean z = true;
                    if (f == null || !f.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        this.this$0.this$0.getRoomInstanceLiveData().mo5929b(RoomInstanceViewDataImpl.f78303b.mo112425a());
                        return;
                    }
                    Iterator<T> it = this.this$0.this$0.getMModel().mo112266i().iterator();
                    while (it.hasNext()) {
                        RoomDiagramViewModel.loadRoomViewInstances$default(this.this$0.this$0, it.next(), null, 2, null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$l */
    public static final class C30991l extends Lambda implements Function0<RoomRefreshTimer> {
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30991l(RoomDiagramViewModel roomDiagramViewModel) {
            super(0);
            this.this$0 = roomDiagramViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomRefreshTimer invoke() {
            return new RoomRefreshTimer(new Function0<Unit>(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel.C30991l.C309921 */
                final /* synthetic */ C30991l this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.this$0.refreshRoom();
                }
            });
        }
    }

    private final void preloadMultiLevelData() {
        getMModel().mo112269l();
        loadAllLevelData();
        loadEquipments();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onFilterEquipmentCleared() {
        getMModel().mo112247a((EquipmentData) null);
        postFilterData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$c */
    static final class C30981c extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C30981c INSTANCE = new C30981c();

        C30981c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-calendar-room");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…dPool(\"lk-calendar-room\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    private final void refreshMultiLevelRoom() {
        getMModel().mo112267j();
        postRoomData();
        getMInstanceThrottle().mo112344a();
    }

    public final void loadBuildings() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C30983e(this, null), 2, null);
    }

    public final void loadEquipments() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C30984f(this, null), 2, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onCapacityDialogShow() {
        int i;
        MeetingRoomFilter meetingRoomFilter;
        C1177w<Integer> capacityLiveData2 = getCapacityLiveData();
        RoomViewFilterConfigs b = getMModel().mo112255b();
        if (b == null || (meetingRoomFilter = b.meeting_room_filter) == null || (i = meetingRoomFilter.min_capacity) == null) {
            i = 0;
        }
        capacityLiveData2.mo5929b(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onCurrentDayChanged() {
        this.mCurrentDate.setJulianDay(new CalendarDate().getJulianDay());
        getMInstanceThrottle().mo112344a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onFilterChanged() {
        if (getMModel().mo112260c()) {
            refreshRoom();
        }
        getMModel().mo112253a(false);
    }

    public final void postRoomData() {
        getMeetingRoomLiveData().mo5926a(new RoomViewDataImpl(getMModel().mo112263f(), getMModel().mo112244a()));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$n */
    static final class RunnableC30995n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramViewModel f78139a;

        /* renamed from: b */
        final /* synthetic */ String f78140b;

        RunnableC30995n(RoomDiagramViewModel roomDiagramViewModel, String str) {
            this.f78139a = roomDiagramViewModel;
            this.f78140b = str;
        }

        public final void run() {
            List<BuildingFloorFilter> list;
            Map<String, CalendarBuilding> a = this.f78139a.getMModel().mo112243a(this.f78140b);
            RoomViewFilterConfigs b = this.f78139a.getMModel().mo112255b();
            if (b != null) {
                list = b.needed_building_floors;
            } else {
                list = null;
            }
            this.f78139a.getBuildingLiveData().mo5926a(new BuildingFloorViewDataImpl(list, a));
        }
    }

    private final void loadAllLevelData() {
        getLevelLoadingView().mo5926a((Integer) 0);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C30982d(this, null), 2, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void create() {
        getSelectDateChangeLiveData().mo5929b(this.mSelectDate);
        C30022a.f74884c.mo108450a(new C30980b(this));
        EventBus.getDefault().register(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_ROOM_VIEW_INSTANCE_CHANGE_NOTIFICATION, getMRoomViewInstanceChangeListener());
        getMRoomRefreshTimer().mo112348a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void destroy() {
        EventBus.getDefault().unregister(this);
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_ROOM_VIEW_INSTANCE_CHANGE_NOTIFICATION, getMRoomViewInstanceChangeListener());
        getDispatcher().close();
        getMInstanceThrottle().mo112345b();
        getMModel().mo112270m();
        getMRoomRefreshTimer().mo112349b();
        getMExecutorService().shutdown();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onBuildingDialogShow() {
        List<BuildingFloorFilter> list;
        Map map = MapsKt.toMap(getMModel().mo112244a());
        RoomViewFilterConfigs b = getMModel().mo112255b();
        if (b != null) {
            list = b.needed_building_floors;
        } else {
            list = null;
        }
        getBuildingLiveData().mo5926a(new BuildingFloorViewDataImpl(list, map));
        if (map.isEmpty()) {
            loadBuildings();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onEquipmentDialogShow() {
        MeetingRoomFilter meetingRoomFilter;
        C1177w<EquipmentViewData> equipmentLiveData2 = getEquipmentLiveData();
        List<String> e = getMModel().mo112262e();
        ConcurrentHashMap<String, MeetingRoomEquipment> d = getMModel().mo112261d();
        RoomViewFilterConfigs b = getMModel().mo112255b();
        if (b != null) {
            meetingRoomFilter = b.meeting_room_filter;
        } else {
            meetingRoomFilter = null;
        }
        equipmentLiveData2.mo5929b(new EquipmentViewData(e, d, meetingRoomFilter));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onMultiLevelDialogShow() {
        if (!getMModel().mo112265h()) {
            loadAllLevelData();
            return;
        }
        getLevelFilterLiveData().mo5926a(new LevelFilterViewData(getMModel().mo112264g()));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void preLoadData() {
        if (C30022a.f74883b.mo112707o()) {
            preloadMultiLevelData();
        } else {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C30998q(this, null), 2, null);
        }
    }

    public final void refreshRoom() {
        if (C30022a.f74883b.mo112707o()) {
            refreshMultiLevelRoom();
            return;
        }
        RoomViewFilterConfigs b = getMModel().mo112255b();
        if (b != null) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C30999r(this, b, null), 2, null);
        } else {
            Log.m165383e("RoomDiagramViewModel", C32673y.m125378d("filterConfig is null"));
        }
    }

    public final void postFilterData() {
        boolean z;
        RoomViewFilterConfigs b = getMModel().mo112255b();
        ConcurrentHashMap<String, CalendarBuilding> a = getMModel().mo112244a();
        ConcurrentHashMap<String, MeetingRoomEquipment> d = getMModel().mo112261d();
        List<CalendarResource> f = getMModel().mo112263f();
        if (f == null || f.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        getFilterLiveData().mo5926a(new RoomFilterViewData(b, a, d, !z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "instances", "", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$g */
    static final class C30985g extends Lambda implements Function1<List<? extends RoomViewInstance>, Unit> {
        final /* synthetic */ BookRoomFinishEvent $bookRoomFinishEvent;
        final /* synthetic */ Function1 $launchNextTimer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30985g(BookRoomFinishEvent cVar, Function1 function1) {
            super(1);
            this.$bookRoomFinishEvent = cVar;
            this.$launchNextTimer = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RoomViewInstance> list) {
            invoke((List<RoomViewInstance>) list);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            if (r8 == false) goto L_0x0055;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(java.util.List<com.bytedance.lark.pb.calendar.v1.RoomViewInstance> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "instances"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                java.util.Iterator r8 = r8.iterator()
            L_0x0009:
                boolean r0 = r8.hasNext()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x003f
                java.lang.Object r0 = r8.next()
                com.bytedance.lark.pb.calendar.v1.RoomViewInstance r0 = (com.bytedance.lark.pb.calendar.v1.RoomViewInstance) r0
                java.lang.String r3 = r0.event_key
                com.ss.android.lark.calendar.impl.framework.a.c r4 = r7.$bookRoomFinishEvent
                java.lang.String r4 = r4.mo118641d()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r3 == 0) goto L_0x003a
                java.lang.Long r0 = r0.original_time
                com.ss.android.lark.calendar.impl.framework.a.c r3 = r7.$bookRoomFinishEvent
                long r3 = r3.mo118642e()
                if (r0 != 0) goto L_0x0030
                goto L_0x003a
            L_0x0030:
                long r5 = r0.longValue()
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x003a
                r0 = 1
                goto L_0x003b
            L_0x003a:
                r0 = 0
            L_0x003b:
                if (r0 == 0) goto L_0x0009
                r8 = 1
                goto L_0x0040
            L_0x003f:
                r8 = 0
            L_0x0040:
                com.ss.android.lark.calendar.impl.framework.a.c r0 = r7.$bookRoomFinishEvent
                boolean r0 = r0.mo118638a()
                if (r0 == 0) goto L_0x004b
                if (r8 != 0) goto L_0x0056
                goto L_0x0055
            L_0x004b:
                com.ss.android.lark.calendar.impl.framework.a.c r0 = r7.$bookRoomFinishEvent
                boolean r0 = r0.mo118639b()
                if (r0 == 0) goto L_0x0055
                r1 = r8
                goto L_0x0056
            L_0x0055:
                r1 = 1
            L_0x0056:
                kotlin.jvm.functions.Function1 r8 = r7.$launchNextTimer
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                r8.invoke(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel.C30985g.invoke(java.util.List):void");
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onFilterBuildingChanged(List<OneBuildingFloorViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "buildingsViewData");
        getMModel().mo112249a(list);
        postFilterData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onFilterCapacityChanged(int i) {
        getMModel().mo112245a(i);
        postFilterData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onFilterEquipmentChanged(EquipmentData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "equipmentViewData");
        getMModel().mo112247a(bVar);
        postFilterData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onSearchBuildingTextChanged(String str) {
        getMExecutorService().execute(new RunnableC30995n(this, str));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onFilterMultiLevelChanged(List<CalendarResource> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedResource");
        getMModel().mo112257b(list);
        refreshRoom();
        postFilterData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onSelectDayChanged(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        this.mSelectDate.setJulianDay(calendarDate.getJulianDay());
        getSelectDateChangeLiveData().mo5929b(this.mSelectDate);
        getMInstanceThrottle().mo112344a();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAccountChanged(C32485a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "accountChangedEvent");
        Log.m165389i("RoomDiagramViewModel", C32673y.m125378d("onAccountChanged"));
        getMModel().mo112270m();
        postFilterData();
        postRoomData();
        preLoadData();
        getAccountChanged().mo5929b((Boolean) true);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onSettingChanged(SettingChangedEvent mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "settingChangedEvent");
        Log.m165389i("RoomDiagramViewModel", C32673y.m125378d("onSettingChanged"));
        if (mVar.mo118648b()) {
            C30022a.f74884c.mo108450a(new C30996o(this));
        }
        if (mVar.mo118649c()) {
            C30022a.f74884c.mo108450a(new C30997p(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$b */
    public static final class C30980b implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramViewModel f78137a;

        C30980b(RoomDiagramViewModel roomDiagramViewModel) {
            this.f78137a = roomDiagramViewModel;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            if (calendarSetting != null) {
                if (this.f78137a.getFirstDayOfWeek().mo5927b() != calendarSetting.getWeekStartDay()) {
                    this.f78137a.getFirstDayOfWeek().mo5929b(calendarSetting.getWeekStartDay());
                }
                if (!Intrinsics.areEqual(this.f78137a.isShowLunar().mo5927b(), Boolean.valueOf(calendarSetting.isShowLunarCalendar()))) {
                    this.f78137a.isShowLunar().mo5929b(Boolean.valueOf(calendarSetting.isShowLunarCalendar()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$loadAllLevelData$1", mo239173f = "RoomDiagramViewModel.kt", mo239174i = {0}, mo239175l = {181}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$d */
    public static final class C30982d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30982d(RoomDiagramViewModel roomDiagramViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = roomDiagramViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30982d dVar = new C30982d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30982d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<String, LevelRelatedInfo> map;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118920a("0", this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            T t = ((SdkSender.C53233d) obj).f131572a;
            if (t == null || (map = t.level_info) == null) {
                this.this$0.getLevelLoadingView().mo5926a(C69089a.m265839a(2));
            } else {
                this.this$0.getLevelLoadingView().mo5926a(C69089a.m265839a(1));
                this.this$0.getMModel().mo112250a(map);
                this.this$0.getMModel().mo112268k();
                this.this$0.getMModel().mo112258b(true);
                this.this$0.refreshRoom();
                this.this$0.postFilterData();
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$loadBuildings$1", mo239173f = "RoomDiagramViewModel.kt", mo239174i = {0}, mo239175l = {196}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$e */
    public static final class C30983e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30983e(RoomDiagramViewModel roomDiagramViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = roomDiagramViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30983e eVar = new C30983e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30983e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<String, CalendarBuilding> map;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118949b(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RoomDiagramModel mModel = this.this$0.getMModel();
            GetBuildingsResponse getBuildingsResponse = (GetBuildingsResponse) ((SdkResponse) obj).mo119076a();
            if (getBuildingsResponse != null) {
                map = getBuildingsResponse.buildings;
            } else {
                map = null;
            }
            RoomDiagramModel.m115683a(mModel, map, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$loadEquipments$1", mo239173f = "RoomDiagramViewModel.kt", mo239174i = {0}, mo239175l = {204}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$f */
    public static final class C30984f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30984f(RoomDiagramViewModel roomDiagramViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = roomDiagramViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30984f fVar = new C30984f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30984f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<String, MeetingRoomEquipment> map;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118957c(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse iVar = (SdkResponse) obj;
            RoomDiagramModel mModel = this.this$0.getMModel();
            GetResourceEquipmentsResponse getResourceEquipmentsResponse = (GetResourceEquipmentsResponse) iVar.mo119076a();
            List<String> list = null;
            if (getResourceEquipmentsResponse != null) {
                map = getResourceEquipmentsResponse.equipment_lists;
            } else {
                map = null;
            }
            GetResourceEquipmentsResponse getResourceEquipmentsResponse2 = (GetResourceEquipmentsResponse) iVar.mo119076a();
            if (getResourceEquipmentsResponse2 != null) {
                list = getResourceEquipmentsResponse2.equipment_ids;
            }
            mModel.mo112251a(map, list);
            this.this$0.postFilterData();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$o */
    static final class C30996o implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramViewModel f78141a;

        C30996o(RoomDiagramViewModel roomDiagramViewModel) {
            this.f78141a = roomDiagramViewModel;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            StringBuilder sb = new StringBuilder();
            sb.append("firstDayOfWeekChanged ");
            sb.append(this.f78141a.getFirstDayOfWeek().mo5927b());
            sb.append(", ");
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            sb.append(calendarSetting.getWeekStartDay());
            Log.m165389i("RoomDiagramViewModel", C32673y.m125378d(sb.toString()));
            if (this.f78141a.getFirstDayOfWeek().mo5927b() != calendarSetting.getWeekStartDay()) {
                this.f78141a.getFirstDayOfWeek().mo5929b(calendarSetting.getWeekStartDay());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$p */
    static final class C30997p implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramViewModel f78142a;

        C30997p(RoomDiagramViewModel roomDiagramViewModel) {
            this.f78142a = roomDiagramViewModel;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            StringBuilder sb = new StringBuilder();
            sb.append("alternateCalendarChanged ");
            sb.append(this.f78142a.isShowLunar().mo5927b());
            sb.append(", ");
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            sb.append(calendarSetting.isShowLunarCalendar());
            Log.m165389i("RoomDiagramViewModel", C32673y.m125378d(sb.toString()));
            if (!Intrinsics.areEqual(this.f78142a.isShowLunar().mo5927b(), Boolean.valueOf(calendarSetting.isShowLunarCalendar()))) {
                this.f78142a.isShowLunar().mo5929b(Boolean.valueOf(calendarSetting.isShowLunarCalendar()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$refreshRoom$1", mo239173f = "RoomDiagramViewModel.kt", mo239174i = {0}, mo239175l = {284}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$r */
    public static final class C30999r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RoomViewFilterConfigs $filterConfig;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30999r(RoomDiagramViewModel roomDiagramViewModel, RoomViewFilterConfigs roomViewFilterConfigs, Continuation cVar) {
            super(2, cVar);
            this.this$0 = roomDiagramViewModel;
            this.$filterConfig = roomViewFilterConfigs;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30999r rVar = new C30999r(this.this$0, this.$filterConfig, cVar);
            rVar.p$ = (CoroutineScope) obj;
            return rVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30999r) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Collection<CalendarResource> collection;
            Map<String, CalendarResource> map;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                RoomViewFilterConfigs roomViewFilterConfigs = this.$filterConfig;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118918a(roomViewFilterConfigs, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RoomDiagramModel mModel = this.this$0.getMModel();
            UpdateRoomViewResourceDataResponse updateRoomViewResourceDataResponse = (UpdateRoomViewResourceDataResponse) ((SdkResponse) obj).mo119076a();
            if (updateRoomViewResourceDataResponse == null || (map = updateRoomViewResourceDataResponse.resources) == null) {
                collection = null;
            } else {
                collection = map.values();
            }
            mModel.mo112248a(collection);
            this.this$0.postRoomData();
            this.this$0.getMInstanceThrottle().mo112344a();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$loadRoomViewInstances$1", mo239173f = "RoomDiagramViewModel.kt", mo239174i = {0}, mo239175l = {350}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$h */
    public static final class C30986h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ Function1 $nextAction;
        final /* synthetic */ RoomDiagramModel.QueryInstanceTask $queryTask;
        final /* synthetic */ long $startTime;
        final /* synthetic */ String $timeZoneId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30986h(RoomDiagramViewModel roomDiagramViewModel, RoomDiagramModel.QueryInstanceTask bVar, long j, long j2, String str, Function1 function1, Continuation cVar) {
            super(2, cVar);
            this.this$0 = roomDiagramViewModel;
            this.$queryTask = bVar;
            this.$startTime = j;
            this.$endTime = j2;
            this.$timeZoneId = str;
            this.$nextAction = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30986h hVar = new C30986h(this.this$0, this.$queryTask, this.$startTime, this.$endTime, this.$timeZoneId, this.$nextAction, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30986h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<RoomViewInstance> list;
            List list2;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                List<String> c = this.$queryTask.mo112273c();
                long j = this.$startTime;
                long j2 = this.$endTime;
                String str = this.$timeZoneId;
                Intrinsics.checkExpressionValueIsNotNull(str, "timeZoneId");
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118921a(c, j, j2, str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GetRoomViewInstancesResponse getRoomViewInstancesResponse = (GetRoomViewInstancesResponse) ((SdkResponse) obj).mo119076a();
            if (getRoomViewInstancesResponse != null) {
                list = getRoomViewInstancesResponse.room_view_instances;
            } else {
                list = null;
            }
            RoomInstanceViewDataImpl nVar = new RoomInstanceViewDataImpl(this.this$0.mSelectDate.getJulianDay(), this.$queryTask, list);
            if (this.this$0.getMModel().mo112254a(this.$queryTask)) {
                this.this$0.getRoomInstanceLiveData().mo5926a(nVar);
            }
            Function1 function1 = this.$nextAction;
            if (function1 != null) {
                if (list == null || (list2 = CollectionsKt.toList(list)) == null) {
                    list2 = CollectionsKt.emptyList();
                }
                Unit unit = (Unit) function1.invoke(list2);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$preLoadData$1", mo239173f = "RoomDiagramViewModel.kt", mo239174i = {0}, mo239175l = {156}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel$q */
    public static final class C30998q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RoomDiagramViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30998q(RoomDiagramViewModel roomDiagramViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = roomDiagramViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30998q qVar = new C30998q(this.this$0, cVar);
            qVar.p$ = (CoroutineScope) obj;
            return qVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30998q) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RoomViewFilterConfigs roomViewFilterConfigs;
            Map<String, CalendarBuilding> map;
            Map<String, CalendarResource> map2;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118922a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse iVar = (SdkResponse) obj;
            RoomDiagramModel mModel = this.this$0.getMModel();
            GetLocalRoomViewResourceDataResponse getLocalRoomViewResourceDataResponse = (GetLocalRoomViewResourceDataResponse) iVar.mo119076a();
            Collection<CalendarResource> collection = null;
            if (getLocalRoomViewResourceDataResponse != null) {
                roomViewFilterConfigs = getLocalRoomViewResourceDataResponse.room_view_filter_configs;
            } else {
                roomViewFilterConfigs = null;
            }
            mModel.mo112246a(roomViewFilterConfigs);
            RoomDiagramModel mModel2 = this.this$0.getMModel();
            GetLocalRoomViewResourceDataResponse getLocalRoomViewResourceDataResponse2 = (GetLocalRoomViewResourceDataResponse) iVar.mo119076a();
            if (getLocalRoomViewResourceDataResponse2 != null) {
                map = getLocalRoomViewResourceDataResponse2.buildings;
            } else {
                map = null;
            }
            mModel2.mo112252a(map, false);
            RoomDiagramModel mModel3 = this.this$0.getMModel();
            GetLocalRoomViewResourceDataResponse getLocalRoomViewResourceDataResponse3 = (GetLocalRoomViewResourceDataResponse) iVar.mo119076a();
            if (!(getLocalRoomViewResourceDataResponse3 == null || (map2 = getLocalRoomViewResourceDataResponse3.resources) == null)) {
                collection = map2.values();
            }
            mModel3.mo112248a(collection);
            this.this$0.postRoomData();
            this.this$0.postFilterData();
            this.this$0.loadBuildings();
            this.this$0.loadEquipments();
            this.this$0.refreshRoom();
            return Unit.INSTANCE;
        }
    }

    private final void loadOneRoomInstance(BookRoomFinishEvent cVar, Function1<? super Boolean, Unit> function1) {
        RoomDiagramModel.QueryInstanceTask b = getMModel().mo112256b(cVar.mo118640c());
        if (b != null) {
            loadRoomViewInstances(b, new C30985g(cVar, function1));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel
    public void onRoomViewScrolling(int i, int i2) {
        Iterator<T> it = getMModel().mo112242a(i, i2).iterator();
        while (it.hasNext()) {
            loadRoomViewInstances$default(this, it.next(), null, 2, null);
        }
    }

    private final void loadRoomViewInstances(RoomDiagramModel.QueryInstanceTask bVar, Function1<? super List<RoomViewInstance>, Unit> function1) {
        Log.m165389i("RoomDiagramViewModel", C32673y.m125378d("query instance " + bVar));
        if (!bVar.mo112273c().isEmpty()) {
            CalendarDate moveToDayStart = this.mSelectDate.moveToDayStart();
            Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "mSelectDate.moveToDayStart()");
            long timeInSeconds = moveToDayStart.getTimeInSeconds();
            CalendarDate moveToDayEnd = this.mSelectDate.moveToDayEnd();
            Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "mSelectDate.moveToDayEnd()");
            long timeInSeconds2 = moveToDayEnd.getTimeInSeconds();
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C30986h(this, bVar, timeInSeconds, timeInSeconds2, timeZone.getID(), function1, null), 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void loadRoomViewInstances$default(RoomDiagramViewModel roomDiagramViewModel, RoomDiagramModel.QueryInstanceTask bVar, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        roomDiagramViewModel.loadRoomViewInstances(bVar, function1);
    }
}
