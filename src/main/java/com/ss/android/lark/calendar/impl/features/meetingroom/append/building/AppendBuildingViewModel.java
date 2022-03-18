package com.ss.android.lark.calendar.impl.features.meetingroom.append.building;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsResponse;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.BaseAppendViewModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BuildingModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.NoneResourceModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.BuildingResourceViewData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.RequestResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceDisplayStatus;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.service.MeetingRoomService;
import com.ss.android.lark.calendar.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JH\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190 2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\"H\u0002J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)H\u0002J\u0011\u0010*\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010+J1\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020)0.0-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190#H@ø\u0001\u0000¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\fH\u0016J\b\u00104\u001a\u00020\u0014H\u0016J\u0010\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u000207H\u0016J'\u00108\u001a\u00020\u00142\b\u00109\u001a\u0004\u0018\u00010\f2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010#H\u0016¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020\u0014H\u0002J\b\u0010>\u001a\u00020\u0014H\u0016J\u0010\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u0016H\u0016J\u0010\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u0019H\u0016J\b\u0010F\u001a\u00020\u0014H\u0016J\u0010\u0010G\u001a\u00020\u00142\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020\u0014H\u0002J\b\u0010L\u001a\u00020\u0014H\u0002J\b\u0010M\u001a\u00020\u0014H\u0002J\b\u0010N\u001a\u00020\u0014H\u0016J\u0018\u0010O\u001a\u00020\u00142\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010#H\u0002J\b\u0010R\u001a\u00020\u0014H\u0002J\u0010\u0010S\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u0010H\u0002J\b\u0010U\u001a\u00020\u0014H\u0002J\u001a\u0010V\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00192\b\b\u0002\u0010W\u001a\u00020\u0010H\u0002J\b\u0010X\u001a\u00020\u0014H\u0002J\u0010\u0010Y\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u0010H\u0002J \u0010Z\u001a\u00020\u00142\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010#2\u0006\u0010T\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingViewModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/BaseAppendViewModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/IBuildingAppendViewModel;", "()V", "appendBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingModel;", "getAppendBuildingModel", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingModel;", "appendBuildingModel$delegate", "Lkotlin/Lazy;", "changeMultiLoadingLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getChangeMultiLoadingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "isShowChosenAttendee", "", "()Z", "mSearchTimes", "changeBuildingMultipleSelectState", "", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BuildingModel;", "expandBuildings", "", "", "changeSingleSelectMode", "changeToMultipleSelectMode", "expandMultiOneBuildingMeetingRoom", "expandOneBuildingMeetingRoom", "expandOnePageBuildingMeetingRoom", "loadingBuildingIds", "", "resourceCacheMap", "", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "isDisableApprovalMeetingRoom", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "calendarResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "loadAllBuildingsByRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuildingMeetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/SdkResponse;", "", "buildingIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCalendarBuildingClicked", "onChangeSelectModel", "selectModel", "onConfirmMultipleSelectClicked", "onDeleteChosenResource", "deleteResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onFilterChanged", "capacity", "equipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "(Ljava/lang/Integer;Ljava/util/List;)V", "onFilterDataChanged", "onLoadErrTryAgainClicked", "onMeetingRoomClicked", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "onMultipleSelectExpandIconClicked", "clickBuildingModel", "onSearchKeyWordChanged", "searchText", "onSearchLoadMoreClicked", "onSearchResourceClicked", "onSelectAllClicked", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "rebuildAllBuildingItems", "rebuildCurrentBuildingItems", "rebuildMultiAllBuildingItems", "refresh", "refreshBuilding", "showBuildingList", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "refreshBuildingDisplayStatus", "refreshSearchFreeItemModels", "hasMore", "reloadExpandBuilding", "searchMeetingRoom", "isNewSearch", "startChange2MultiSelectMode", "updateMultiSearchItem", "updateSearchMeetingRoomData", "searchBuildings", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b */
public final class AppendBuildingViewModel extends BaseAppendViewModel {
    public static final Companion Companion = new Companion(null);
    private final Lazy appendBuildingModel$delegate = LazyKt.lazy(new C31970b(this));
    private final C1177w<Integer> changeMultiLoadingLiveData = new C1177w<>();
    public int mSearchTimes;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"loadAllBuildingsByRequest", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel", mo239173f = "AppendBuildingViewModel.kt", mo239174i = {0}, mo239175l = {86}, mo239176m = "loadAllBuildingsByRequest", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$e */
    public static final class C31973e extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AppendBuildingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31973e(AppendBuildingViewModel bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.loadAllBuildingsByRequest(this);
        }
    }

    public final AppendBuildingModel getAppendBuildingModel() {
        return (AppendBuildingModel) this.appendBuildingModel$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingViewModel$Companion;", "", "()V", "LOAD_BUILDING_RESOURCE_DELAY", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1177w<Integer> getChangeMultiLoadingLiveData() {
        return this.changeMultiLoadingLiveData;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$h */
    public static final class RunnableC31976h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppendBuildingViewModel f81748a;

        RunnableC31976h(AppendBuildingViewModel bVar) {
            this.f81748a = bVar;
        }

        public final void run() {
            this.f81748a.rebuildAllBuildingItems();
        }
    }

    private final void rebuildCurrentBuildingItems() {
        if (getSelectModel() != 1) {
            rebuildAllBuildingItems();
        } else {
            rebuildMultiAllBuildingItems();
        }
    }

    private final void rebuildMultiAllBuildingItems() {
        getAppendBuildingModel().mo116657l();
        refreshBuildingDisplayStatus();
    }

    public void onSearchLoadMoreClicked() {
        searchMeetingRoom(getInputSearchText(), false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$c */
    public static final class RunnableC31971c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppendBuildingViewModel f81744a;

        /* renamed from: b */
        final /* synthetic */ Map f81745b;

        /* renamed from: c */
        final /* synthetic */ BuildingModel f81746c;

        RunnableC31971c(AppendBuildingViewModel bVar, Map map, BuildingModel aVar) {
            this.f81744a = bVar;
            this.f81745b = map;
            this.f81746c = aVar;
        }

        public final void run() {
            if (!this.f81745b.containsKey(this.f81746c.mo116780c())) {
                this.f81744a.rebuildAllBuildingItems();
            }
        }
    }

    private final void changeSingleSelectMode() {
        setSelectModel(0);
        getAppendBuildingModel().mo116637a().clear();
        getAppendBuildingModel().mo116644b().clear();
        rebuildAllBuildingItems();
    }

    public final boolean isShowChosenAttendee() {
        List<CalendarEventAttendee> list;
        ResourceAppendFragmentData resourceAppendData = getResourceAppendData();
        if (resourceAppendData != null) {
            list = resourceAppendData.getChosenMeetingRooms();
        } else {
            list = null;
        }
        if (list != null) {
            return true;
        }
        return false;
    }

    public void onConfirmMultipleSelectClicked() {
        getFinishWithResourceLiveData().mo5929b(TuplesKt.to(false, getAppendBuildingModel().mo116653h()));
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.BaseAppendViewModel
    public void refresh() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C31974f(this, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$b */
    static final class C31970b extends Lambda implements Function0<AppendBuildingModel> {
        final /* synthetic */ AppendBuildingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31970b(AppendBuildingViewModel bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppendBuildingModel invoke() {
            List list;
            List<CalendarEventAttendee> chosenMeetingRooms;
            boolean isDisableApprovalMeetingRoom = this.this$0.isDisableApprovalMeetingRoom();
            boolean isRepeatOrExceptionEvent = this.this$0.isRepeatOrExceptionEvent();
            long eventDuration = this.this$0.getEventDuration();
            ResourceAppendFragmentData resourceAppendData = this.this$0.getResourceAppendData();
            if (resourceAppendData == null || (chosenMeetingRooms = resourceAppendData.getChosenMeetingRooms()) == null) {
                list = null;
            } else {
                list = CollectionsKt.toMutableList((Collection) chosenMeetingRooms);
            }
            return new AppendBuildingModel(isDisableApprovalMeetingRoom, isRepeatOrExceptionEvent, eventDuration, list);
        }
    }

    private final void onFilterDataChanged() {
        boolean z;
        if (getInputSearchText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            searchMeetingRoom$default(this, getInputSearchText(), false, 2, null);
        } else if (getSelectModel() == 1) {
            getAppendBuildingModel().mo116638a(getCapacity(), getEquipments());
            rebuildMultiAllBuildingItems();
        } else {
            reloadExpandBuilding();
        }
    }

    private final void startChange2MultiSelectMode() {
        boolean z;
        Map<String, List<AppendResourceData>> i = getAppendBuildingModel().mo116654i();
        if (i == null || i.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(true ^ z)) {
            i = null;
        }
        if (i != null) {
            changeToMultipleSelectMode();
        } else {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C31979k(this, null), 3, null);
        }
    }

    public final void changeToMultipleSelectMode() {
        setSelectModel(1);
        getAppendBuildingModel().mo116638a(getCapacity(), getEquipments());
        getAppendBuildingModel().mo116653h().clear();
        rebuildMultiAllBuildingItems();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.IBaseAppendViewModel
    public void onLoadErrTryAgainClicked() {
        boolean z;
        if (getInputSearchText().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            refresh();
            return;
        }
        getResourceDisplayStatus().mo5929b(ResourceDisplayStatus.LoadingStatusData.f81864a);
        searchMeetingRoom$default(this, getInputSearchText(), false, 2, null);
    }

    public final void rebuildAllBuildingItems() {
        List<CalendarEventAttendee> list;
        ResourceAppendFragmentData resourceAppendData = getResourceAppendData();
        if (resourceAppendData != null) {
            list = resourceAppendData.getChosenMeetingRooms();
        } else {
            list = null;
        }
        if (list != null) {
            getAppendBuildingModel().mo116656k();
        } else {
            getAppendBuildingModel().mo116655j();
        }
        refreshBuildingDisplayStatus();
    }

    private final void refreshBuildingDisplayStatus() {
        getResourceDisplayStatus().mo5929b(new ResourceDisplayStatus.BuildingDisplayStatus(getSelectModel(), getAppendBuildingModel().mo116653h().size(), new BuildingResourceViewData(new ArrayList(getAppendBuildingModel().mo116650e()), new ArrayList(getAppendBuildingModel().mo116651f()), getAppendBuildingModel().mo116636a(getSelectModel()))));
    }

    private final void reloadExpandBuilding() {
        int capacity = getCapacity();
        List<EquipmentData> equipments = getEquipments();
        getAppendBuildingModel().mo116641a(CollectionsKt.toMutableList((Collection) getAppendBuildingModel().mo116637a()));
        getAppendBuildingModel().mo116646b(CollectionsKt.toMutableList((Collection) getAppendBuildingModel().mo116644b()));
        UICallbackExecutor.executeDelayed(new RunnableC31976h(this), 200);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C31977i(this, capacity, equipments, null), 3, null);
    }

    private final void expandMultiOneBuildingMeetingRoom(BuildingModel aVar) {
        changeBuildingMultipleSelectState(aVar, getAppendBuildingModel().mo116637a());
    }

    public void onChangeSelectModel(int i) {
        if (i != 1) {
            changeSingleSelectMode();
        } else {
            startChange2MultiSelectMode();
        }
    }

    public void onSearchResourceClicked(MeetingRoomModel meetingRoomModel) {
        Intrinsics.checkParameterIsNotNull(meetingRoomModel, "meetingRoomModel");
        onSelectSingleResource(meetingRoomModel);
    }

    public void onCalendarBuildingClicked(BuildingModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "buildingModel");
        if (getSelectModel() != 0) {
            expandMultiOneBuildingMeetingRoom(aVar);
        } else {
            expandOneBuildingMeetingRoom(aVar);
        }
    }

    public void onDeleteChosenResource(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "deleteResource");
        List<CalendarEventAttendee> o = getAppendBuildingModel().mo116660o();
        if (o != null) {
            o.remove(calendarEventAttendee);
        }
        rebuildAllBuildingItems();
    }

    public final void refreshBuilding(List<CalendarBuilding> list) {
        List<CalendarBuilding> list2;
        AppendBuildingModel appendBuildingModel = getAppendBuildingModel();
        if (list == null || (list2 = CollectionsKt.sortedWith(list, C31975g.f81747a)) == null) {
            list2 = CollectionsKt.emptyList();
        }
        appendBuildingModel.mo116648c(list2);
        rebuildAllBuildingItems();
    }

    private final void expandOneBuildingMeetingRoom(BuildingModel aVar) {
        if (aVar.mo116784f() == 0) {
            expandOnePageBuildingMeetingRoom(aVar, getAppendBuildingModel().mo116637a(), getAppendBuildingModel().mo116647c(), getAppendBuildingModel().mo116652g());
        } else {
            expandOnePageBuildingMeetingRoom(aVar, getAppendBuildingModel().mo116644b(), getAppendBuildingModel().mo116649d(), getAppendBuildingModel().mo116652g());
        }
    }

    private final Pair<Boolean, NeedApprovalType> isDisableApprovalMeetingRoom(CalendarResource calendarResource) {
        boolean z;
        Pair<Boolean, NeedApprovalType> a = C32065c.m121947a(calendarResource, Long.valueOf(getEventDuration()));
        if (!isDisableApprovalMeetingRoom() || !isRepeatOrExceptionEvent() || !a.getFirst().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        return TuplesKt.to(Boolean.valueOf(z), a.getSecond());
    }

    public void onMultipleSelectExpandIconClicked(BuildingModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "clickBuildingModel");
        String c = aVar.mo116780c();
        if (getAppendBuildingModel().mo116637a().contains(c)) {
            getAppendBuildingModel().mo116637a().remove(c);
        } else {
            getAppendBuildingModel().mo116637a().add(aVar.mo116780c());
        }
        rebuildMultiAllBuildingItems();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.IBaseAppendViewModel
    public void onSearchKeyWordChanged(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "searchText");
        setInputSearchText(str);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            rebuildCurrentBuildingItems();
            return;
        }
        getResourceDisplayStatus().mo5929b(ResourceDisplayStatus.LoadingStatusData.f81864a);
        searchMeetingRoom$default(this, str, false, 2, null);
    }

    public void onSelectAllClicked(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        int i = C31980c.f81751c[selectState.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                getAppendBuildingModel().mo116658m();
            } else {
                getAppendBuildingModel().mo116659n();
            }
        }
        rebuildMultiAllBuildingItems();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel$refresh$1", mo239173f = "AppendBuildingViewModel.kt", mo239174i = {0}, mo239175l = {79}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$f */
    public static final class C31974f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AppendBuildingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31974f(AppendBuildingViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C31974f fVar = new C31974f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C31974f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IEditContract.RequestBuildingResultType requestBuildingResultType;
            int i;
            RequestResourceData requestResourceData;
            RequestResourceData requestResourceData2;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                ResourceAppendFragmentData resourceAppendData = this.this$0.getResourceAppendData();
                List<CalendarBuilding> list = null;
                if (resourceAppendData == null || (requestResourceData2 = resourceAppendData.getRequestResourceData()) == null) {
                    requestBuildingResultType = null;
                } else {
                    requestBuildingResultType = requestResourceData2.getRequestResultType();
                }
                if (requestBuildingResultType != null && ((i = C31980c.f81749a[requestBuildingResultType.ordinal()]) == 1 || i == 2)) {
                    AppendBuildingViewModel bVar = this.this$0;
                    ResourceAppendFragmentData resourceAppendData2 = bVar.getResourceAppendData();
                    if (!(resourceAppendData2 == null || (requestResourceData = resourceAppendData2.getRequestResourceData()) == null)) {
                        list = requestResourceData.getRequestBuildings();
                    }
                    bVar.refreshBuilding(list);
                } else {
                    AppendBuildingViewModel bVar2 = this.this$0;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (bVar2.loadAllBuildingsByRequest(this) == a) {
                        return a;
                    }
                }
            } else if (i2 == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    private final void updateMultiSearchItem(boolean z) {
        boolean z2;
        setSearchItemModelList(new ArrayList<>());
        ArrayList<AppendResourceData> searchMeetingRoomItems = getSearchMeetingRoomItems();
        if (searchMeetingRoomItems == null || searchMeetingRoomItems.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            getSearchItemModelList().add(new NoneResourceModel());
            return;
        }
        ArrayList<BaseModel> searchItemModelList = getSearchItemModelList();
        ArrayList<AppendResourceData> searchMeetingRoomItems2 = getSearchMeetingRoomItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(searchMeetingRoomItems2, 10));
        for (T t : searchMeetingRoomItems2) {
            arrayList.add(new MeetingRoomModel(t, isDisableApprovalMeetingRoom(t.mo116888b()), 0, null, MeetingRoomModel.MeetingRoomShowType.TYPE_SEARCH, 8, null));
        }
        searchItemModelList.addAll(arrayList);
        if (z) {
            getSearchItemModelList().add(new LoadMoreModel());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object loadAllBuildingsByRequest(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel.loadAllBuildingsByRequest(kotlin.coroutines.c):java.lang.Object");
    }

    public void onMeetingRoomClicked(MeetingRoomModel meetingRoomModel) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(meetingRoomModel, "meetingRoomModel");
        if (getInputSearchText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || getSelectModel() == 0) {
            onSelectSingleResource(meetingRoomModel);
        } else if (meetingRoomModel.mo116773i() != IBuildingContract.SelectState.NOT_OPTIONAL) {
            if (meetingRoomModel.mo116773i().isSelected()) {
                getAppendBuildingModel().mo116640a(meetingRoomModel.mo116770g());
            } else {
                getAppendBuildingModel().mo116645b(meetingRoomModel.mo116770g());
            }
            rebuildMultiAllBuildingItems();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel$expandOnePageBuildingMeetingRoom$2", mo239173f = "AppendBuildingViewModel.kt", mo239174i = {0}, mo239175l = {530}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$d */
    public static final class C31972d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BuildingModel $buildingModel;
        final /* synthetic */ List $loadingBuildingIds;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AppendBuildingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31972d(AppendBuildingViewModel bVar, BuildingModel aVar, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$buildingModel = aVar;
            this.$loadingBuildingIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C31972d dVar = new C31972d(this.this$0, this.$buildingModel, this.$loadingBuildingIds, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C31972d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<String, CalendarResource> map;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                AppendBuildingViewModel bVar = this.this$0;
                List<CalendarBuilding> listOf = CollectionsKt.listOf(this.$buildingModel.mo116782e());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10));
                for (CalendarBuilding calendarBuilding : listOf) {
                    String str = calendarBuilding.id;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.loadBuildingMeetingRoom(arrayList, this);
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
            if (iVar.mo119077b() != null) {
                map = null;
            } else {
                map = (Map) iVar.mo119076a();
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
            }
            this.this$0.getAppendBuildingModel().mo116642a(CollectionsKt.listOf(this.$buildingModel.mo116780c()), map);
            this.$loadingBuildingIds.remove(this.$buildingModel.mo116780c());
            this.this$0.rebuildAllBuildingItems();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel$reloadExpandBuilding$2", mo239173f = "AppendBuildingViewModel.kt", mo239174i = {0, 0}, mo239175l = {390}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "curAllExpandBuildings"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$i */
    public static final class C31977i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $preCapacity;
        final /* synthetic */ List $preEquipments;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AppendBuildingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31977i(AppendBuildingViewModel bVar, int i, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$preCapacity = i;
            this.$preEquipments = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C31977i iVar = new C31977i(this.this$0, this.$preCapacity, this.$preEquipments, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C31977i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<String> list;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                List<String> plus = CollectionsKt.plus((Collection) CollectionsKt.toList(this.this$0.getAppendBuildingModel().mo116637a()), (Iterable) CollectionsKt.toList(this.this$0.getAppendBuildingModel().mo116644b()));
                AppendBuildingViewModel bVar = this.this$0;
                this.L$0 = ahVar;
                this.L$1 = plus;
                this.label = 1;
                obj = bVar.loadBuildingMeetingRoom(plus, this);
                if (obj == a) {
                    return a;
                }
                list = plus;
            } else if (i == 1) {
                list = (List) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse iVar = (SdkResponse) obj;
            if (this.this$0.getCapacity() != this.$preCapacity || !CollectionUtils.isListSame(this.this$0.getEquipments(), this.$preEquipments)) {
                return Unit.INSTANCE;
            }
            this.this$0.getAppendBuildingModel().mo116642a(list, (Map) iVar.mo119076a());
            this.this$0.getAppendBuildingModel().mo116641a(new ArrayList());
            this.this$0.getAppendBuildingModel().mo116646b(new ArrayList());
            this.this$0.rebuildAllBuildingItems();
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel$searchMeetingRoom$1", mo239173f = "AppendBuildingViewModel.kt", mo239174i = {0, 0}, mo239175l = {422}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "meetingRoomFilter"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$j */
    public static final class C31978j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $curSearchRoomCounter;
        final /* synthetic */ String $searchText;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AppendBuildingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31978j(AppendBuildingViewModel bVar, String str, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$searchText = str;
            this.$curSearchRoomCounter = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C31978j jVar = new C31978j(this.this$0, this.$searchText, this.$curSearchRoomCounter, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C31978j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            List<CalendarBuilding> list;
            boolean z;
            Boolean bool;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Integer a2 = C69089a.m265839a(this.this$0.getCapacity());
                List<EquipmentData> equipments = this.this$0.getEquipments();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equipments, 10));
                Iterator<T> it = equipments.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo116059a());
                }
                MeetingRoomFilter meetingRoomFilter = new MeetingRoomFilter(a2, arrayList);
                String eventRRule = this.this$0.getEventRRule();
                this.L$0 = ahVar;
                this.L$1 = meetingRoomFilter;
                this.label = 1;
                obj2 = MeetingRoomService.f83548a.mo119066a(this.this$0.getEventStartTime(), this.this$0.getEventEndTime(), this.$searchText, this.this$0.mSearchTimes * 50, eventRRule, false, meetingRoomFilter, this);
                if (obj2 == a) {
                    return a;
                }
            } else if (i == 1) {
                MeetingRoomFilter meetingRoomFilter2 = (MeetingRoomFilter) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse iVar = (SdkResponse) obj2;
            if ((!Intrinsics.areEqual(this.$searchText, this.this$0.getInputSearchText())) || this.$curSearchRoomCounter < this.this$0.getSearchRoomCounter()) {
                Log.m165389i("AppendBuildingViewModel", C32673y.m125378d("old request back"));
            } else if (iVar.mo119077b() != null) {
                this.this$0.getResourceDisplayStatus().mo5929b(ResourceDisplayStatus.LoadErrStatusData.f81863a);
            } else {
                AppendBuildingViewModel bVar = this.this$0;
                SearchMeetingRoomsResponse searchMeetingRoomsResponse = (SearchMeetingRoomsResponse) iVar.mo119076a();
                if (searchMeetingRoomsResponse != null) {
                    list = searchMeetingRoomsResponse.buildings;
                } else {
                    list = null;
                }
                SearchMeetingRoomsResponse searchMeetingRoomsResponse2 = (SearchMeetingRoomsResponse) iVar.mo119076a();
                if (searchMeetingRoomsResponse2 == null || (bool = searchMeetingRoomsResponse2.has_more) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                bVar.updateSearchMeetingRoomData(list, z);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel$startChange2MultiSelectMode$3", mo239173f = "AppendBuildingViewModel.kt", mo239174i = {0}, mo239175l = {277}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$k */
    public static final class C31979k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AppendBuildingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31979k(AppendBuildingViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C31979k kVar = new C31979k(this.this$0, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C31979k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.getChangeMultiLoadingLiveData().mo5929b(C69089a.m265839a(1));
                MeetingRoomService hVar = MeetingRoomService.f83548a;
                long eventStartTime = this.this$0.getEventStartTime();
                long eventEndTime = this.this$0.getEventEndTime();
                this.L$0 = ahVar;
                this.label = 1;
                obj = hVar.mo119068a(eventStartTime, eventEndTime, this);
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
            if (iVar.mo119077b() != null) {
                this.this$0.getChangeMultiLoadingLiveData().mo5929b(C69089a.m265839a(2));
            } else {
                Map<String, CalendarResource> map = (Map) iVar.mo119076a();
                if (map != null) {
                    this.this$0.getAppendBuildingModel().mo116643a(map);
                    this.this$0.changeToMultipleSelectMode();
                }
                this.this$0.getChangeMultiLoadingLiveData().mo5929b(C69089a.m265839a(3));
            }
            return Unit.INSTANCE;
        }
    }

    private final void refreshSearchFreeItemModels(boolean z) {
        setSearchFreeItemModelList(new ArrayList<>());
        ArrayList<AppendResourceData> searchMeetingRoomItems = getSearchMeetingRoomItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(searchMeetingRoomItems, 10));
        for (T t : searchMeetingRoomItems) {
            arrayList.add(new MeetingRoomModel(t, isDisableApprovalMeetingRoom(t.mo116888b()), 0, null, MeetingRoomModel.MeetingRoomShowType.TYPE_SEARCH, 8, null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((MeetingRoomModel) obj).mo116765c()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            getSearchFreeItemModelList().add(new NoneResourceModel());
            return;
        }
        getSearchFreeItemModelList().addAll(arrayList3);
        if (z) {
            getSearchFreeItemModelList().add(new LoadMoreModel());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.b$g */
    public static final class C31975g<T> implements Comparator<CalendarBuilding> {

        /* renamed from: a */
        public static final C31975g f81747a = new C31975g();

        C31975g() {
        }

        /* renamed from: a */
        public final int compare(CalendarBuilding calendarBuilding, CalendarBuilding calendarBuilding2) {
            int intValue = calendarBuilding2.weight.intValue();
            Integer num = calendarBuilding.weight;
            Intrinsics.checkExpressionValueIsNotNull(num, "o1.weight");
            return intValue - num.intValue();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.IBaseAppendViewModel
    public void onFilterChanged(Integer num, List<EquipmentData> list) {
        if (num != null) {
            setCapacity(num.intValue());
        }
        if (list != null) {
            setEquipments(list);
        }
        onFilterDataChanged();
    }

    private final void changeBuildingMultipleSelectState(BuildingModel aVar, Set<String> set) {
        int i = C31980c.f81750b[aVar.mo116786h().ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2 || i == 3) {
                set.add(aVar.mo116780c());
            } else {
                z = false;
            }
            getAppendBuildingModel().mo116639a(aVar, z);
            rebuildMultiAllBuildingItems();
        }
    }

    private final void searchMeetingRoom(String str, boolean z) {
        setSearchRoomCounter(getSearchRoomCounter() + 1);
        int searchRoomCounter = getSearchRoomCounter();
        if (z) {
            this.mSearchTimes = 1;
        } else {
            this.mSearchTimes++;
        }
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C31978j(this, str, searchRoomCounter, null), 3, null);
    }

    public final void updateSearchMeetingRoomData(List<CalendarBuilding> list, boolean z) {
        setSearchMeetingRoomItems(new ArrayList<>());
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<CalendarResource> list2 = it.next().meeting_rooms;
                if (list2 != null) {
                    List<CalendarResource> list3 = list2;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (T t : list3) {
                        Intrinsics.checkExpressionValueIsNotNull(t, "it");
                        arrayList.add(new AppendResourceData(t, ""));
                    }
                    getSearchMeetingRoomItems().addAll(arrayList);
                }
            }
        }
        updateMultiSearchItem(z);
        refreshSearchFreeItemModels(z);
        getResourceDisplayStatus().mo5929b(new ResourceDisplayStatus.SearchResultDisplayStatus(getSearchFreeItemModelList(), getSearchItemModelList()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object loadBuildingMeetingRoom(List<String> list, Continuation<? super SdkResponse<Map<String, CalendarResource>>> cVar) {
        long j;
        String str;
        EventData eventData;
        EventData eventData2;
        Long a;
        EventData eventData3;
        Long a2;
        ResourceAppendFragmentData resourceAppendData = getResourceAppendData();
        long j2 = 0;
        if (resourceAppendData == null || (eventData3 = resourceAppendData.getEventData()) == null || (a2 = C69089a.m265840a(eventData3.getEventStartTime())) == null) {
            j = 0;
        } else {
            j = a2.longValue();
        }
        ResourceAppendFragmentData resourceAppendData2 = getResourceAppendData();
        if (!(resourceAppendData2 == null || (eventData2 = resourceAppendData2.getEventData()) == null || (a = C69089a.m265840a(eventData2.getEventEndTime())) == null)) {
            j2 = a.longValue();
        }
        ResourceAppendFragmentData resourceAppendData3 = getResourceAppendData();
        if (resourceAppendData3 == null || (eventData = resourceAppendData3.getEventData()) == null || (str = eventData.getRRule()) == null) {
            str = "";
        }
        Integer a3 = C69089a.m265839a(getCapacity());
        List<EquipmentData> equipments = getEquipments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equipments, 10));
        Iterator<T> it = equipments.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo116059a());
        }
        return MeetingRoomService.f83548a.mo119067a(j, j2, list, str, new MeetingRoomFilter(a3, arrayList), cVar);
    }

    private final void expandOnePageBuildingMeetingRoom(BuildingModel aVar, Set<String> set, List<String> list, Map<String, List<AppendResourceData>> map) {
        if (aVar.mo116785g()) {
            set.remove(aVar.mo116780c());
            rebuildAllBuildingItems();
            return;
        }
        set.add(aVar.mo116780c());
        list.add(aVar.mo116780c());
        UICallbackExecutor.executeDelayed(new RunnableC31971c(this, map, aVar), 200);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C31972d(this, aVar, list, null), 3, null);
    }

    static /* synthetic */ void searchMeetingRoom$default(AppendBuildingViewModel bVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bVar.searchMeetingRoom(str, z);
    }
}
