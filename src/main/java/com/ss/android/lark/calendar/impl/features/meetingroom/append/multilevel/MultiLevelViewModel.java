package com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.LevelContent;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsResponse;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelTree;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.BaseAppendViewModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelContentModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.NoneResourceModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceDisplayStatus;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.rustadapter.service.MeetingRoomService;
import com.ss.android.lark.calendar.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001`B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020&0+j\b\u0012\u0004\u0012\u00020&`,J\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0+j\b\u0012\u0004\u0012\u00020.`,J\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u00100\u001a\u00020\f2\u0006\u00101\u001a\u000202H\u0002J\u001c\u00103\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000205042\u0006\u00101\u001a\u000202H\u0002J\u0011\u00106\u001a\u000207H@ø\u0001\u0000¢\u0006\u0002\u00108J\u0010\u00109\u001a\u0002072\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010:\u001a\u000207H\u0016J'\u0010;\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010\u00182\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>H\u0016¢\u0006\u0002\u0010@J\b\u0010A\u001a\u000207H\u0016J\b\u0010B\u001a\u000207H\u0002J\u0010\u0010C\u001a\u0002072\u0006\u0010D\u001a\u00020&H\u0016J\u0010\u0010E\u001a\u0002072\u0006\u0010D\u001a\u00020&H\u0016J\u0010\u0010F\u001a\u0002072\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u0002072\u0006\u0010J\u001a\u00020\u0007H\u0016J\b\u0010K\u001a\u000207H\u0016J\u0010\u0010L\u001a\u0002072\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u0002072\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u000207H\u0016J\b\u0010S\u001a\u000207H\u0002J\b\u0010T\u001a\u000207H\u0002J\u001a\u0010U\u001a\u0002072\u0006\u0010J\u001a\u00020\u00072\b\b\u0002\u0010V\u001a\u00020\fH\u0002J\u001c\u0010W\u001a\u0002072\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002J\u0010\u0010Y\u001a\u0002072\u0006\u0010'\u001a\u00020&H\u0002J\u0010\u0010Z\u001a\u0002072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010[\u001a\u0002072\u0006\u0010\\\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\fH\u0002J(\u0010^\u001a\u0002072\u000e\u0010_\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010>2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0018H\u0002R&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/MultiLevelViewModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/BaseAppendViewModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/IMultiLevelAppendViewModel;", "()V", "cachePbMultiLevelData", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "getCachePbMultiLevelData", "()Landroidx/lifecycle/MutableLiveData;", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "multiLevelTree", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "getMultiLevelTree", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "setMultiLevelTree", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;)V", "multiSelectedRoomSize", "", "getMultiSelectedRoomSize", "()I", "setMultiSelectedRoomSize", "(I)V", "originalMultiLevelAndMeetRoomMap", "getOriginalMultiLevelAndMeetRoomMap", "()Ljava/util/Map;", "setOriginalMultiLevelAndMeetRoomMap", "(Ljava/util/Map;)V", "searchCursor", "getSearchCursor", "setSearchCursor", "findCurrentNodeByLevelContent", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "node", "levelContent", "Lcom/bytedance/lark/pb/calendar/v1/LevelContent;", "getBreadcrumbItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCurrentLevelAndRoomsItem", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "getFilterData", "hasFilterResourceEquipments", "calendarResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "isDisableApprovalMeetingRoom", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "loadAllBuildingsByRequest", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBreadcrumbItemClicked", "onConfirmSelectClicked", "onFilterChanged", "capacity", "equipments", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "(Ljava/lang/Integer;Ljava/util/List;)V", "onLoadErrTryAgainClicked", "onMultiFilterDataChanged", "onMultiLevelArrowClicked", "multiLevelNode", "onMultiLevelContentClicked", "onMultiMeetingRoomClicked", "multiRoomNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "onSearchKeyWordChanged", "searchText", "onSearchLoadMoreClicked", "onSearchResourceClicked", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "onSelectAllClicked", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "refresh", "refreshMultiLevelView", "resetMultiSelectRoomSize", "searchMultiMeetingRoom", "isNewSearch", "updateAllLevelAndMeetingRoomData", "levelInfoMap", "updateMultiLevelTreeCurrentNode", "updateMultiSearchItem", "updateMultiSelectRoomSize", "size", "isAdd", "updateSearchMeetingRoomData", "resource", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b */
public final class MultiLevelViewModel extends BaseAppendViewModel {
    public static final Companion Companion = new Companion(null);
    private final C1177w<Map<String, LevelRelatedInfo>> cachePbMultiLevelData = new C1177w<>();
    private boolean hasMore;
    private MultiLevelTree multiLevelTree = new MultiLevelTree();
    private int multiSelectedRoomSize;
    private Map<String, LevelRelatedInfo> originalMultiLevelAndMeetRoomMap = MapsKt.emptyMap();
    private int searchCursor;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"loadAllBuildingsByRequest", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel", mo239173f = "MultiLevelViewModel.kt", mo239174i = {0}, mo239175l = {83}, mo239176m = "loadAllBuildingsByRequest", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b$d */
    public static final class C32016d extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MultiLevelViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32016d(MultiLevelViewModel bVar, Continuation cVar) {
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

    private final void resetMultiSelectRoomSize() {
        this.multiSelectedRoomSize = 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/MultiLevelViewModel$Companion;", "", "()V", "SEARCH_BASE_COUNT", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1177w<Map<String, LevelRelatedInfo>> getCachePbMultiLevelData() {
        return this.cachePbMultiLevelData;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final MultiLevelTree getMultiLevelTree() {
        return this.multiLevelTree;
    }

    public final int getMultiSelectedRoomSize() {
        return this.multiSelectedRoomSize;
    }

    public final Map<String, LevelRelatedInfo> getOriginalMultiLevelAndMeetRoomMap() {
        return this.originalMultiLevelAndMeetRoomMap;
    }

    public final int getSearchCursor() {
        return this.searchCursor;
    }

    public void onSearchLoadMoreClicked() {
        searchMultiMeetingRoom(getInputSearchText(), false);
    }

    public MultiLevelViewModel() {
        setSelectModel(1);
    }

    public final ArrayList<MultiLevelNode> getBreadcrumbItems() {
        ArrayList<MultiLevelNode> arrayList = new ArrayList<>();
        for (MultiLevelNode c = this.multiLevelTree.mo115840c(); c != null; c = c.mo115819a()) {
            arrayList.add(0, c);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.BaseAppendViewModel
    public void refresh() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C32018f(this, null), 3, null);
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
        searchMultiMeetingRoom$default(this, getInputSearchText(), false, 2, null);
    }

    public final void refreshMultiLevelView() {
        getResourceDisplayStatus().mo5929b(new ResourceDisplayStatus.MultiLevelDisplayStatus(getCurrentLevelAndRoomsItem(), getBreadcrumbItems(), this.multiSelectedRoomSize, this.multiLevelTree.mo115840c().mo115823b()));
    }

    private final void onMultiFilterDataChanged() {
        boolean z;
        if (getInputSearchText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C32017e(this, null), 3, null);
            return;
        }
        LevelContent f = this.multiLevelTree.mo115840c().mo115830f();
        MultiLevelTree a = MultiLevelTree.f80780c.mo115842a(getFilterData(), false);
        this.multiLevelTree = a;
        MultiLevelNode findCurrentNodeByLevelContent = findCurrentNodeByLevelContent(a.mo115841d(), f);
        if (findCurrentNodeByLevelContent != null) {
            this.multiLevelTree.mo115838a(findCurrentNodeByLevelContent);
        }
        resetMultiSelectRoomSize();
        refreshMultiLevelView();
    }

    public void onConfirmSelectClicked() {
        ArrayList<MultiRoomNode> b = this.multiLevelTree.mo115839b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new AppendResourceData(it.next().mo115847f(), ""));
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            getFinishWithResourceLiveData().mo5929b(TuplesKt.to(false, arrayList2));
        }
    }

    public final ArrayList<BaseModel> getCurrentLevelAndRoomsItem() {
        boolean z;
        ArrayList<BaseModel> arrayList = new ArrayList<>();
        CollectionsKt.sortWith(this.multiLevelTree.mo115840c().mo115832h(), C32014b.f81891a);
        ArrayList<MultiRoomNode> h = this.multiLevelTree.mo115840c().mo115832h();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(h, 10));
        for (T t : h) {
            arrayList2.add(new MultiLevelMeetingRoomModel(t, isDisableApprovalMeetingRoom(t.mo115847f())));
        }
        arrayList.addAll(arrayList2);
        CollectionsKt.sortWith(this.multiLevelTree.mo115840c().mo115831g(), C32015c.f81892a);
        ArrayList<MultiLevelNode> g = this.multiLevelTree.mo115840c().mo115831g();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(g, 10));
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            arrayList3.add(new MultiLevelContentModel(it.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((MultiLevelContentModel) obj).mo116802b().mo115823b() != IBuildingContract.SelectState.NOT_OPTIONAL) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList4.add(obj);
            }
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo> getFilterData() {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel.getFilterData():java.util.Map");
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMultiSelectedRoomSize(int i) {
        this.multiSelectedRoomSize = i;
    }

    public final void setSearchCursor(int i) {
        this.searchCursor = i;
    }

    private final void updateMultiLevelTreeCurrentNode(MultiLevelNode bVar) {
        this.multiLevelTree.mo115838a(bVar);
    }

    public final void setMultiLevelTree(MultiLevelTree dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
        this.multiLevelTree = dVar;
    }

    public final void setOriginalMultiLevelAndMeetRoomMap(Map<String, LevelRelatedInfo> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.originalMultiLevelAndMeetRoomMap = map;
    }

    public void onBreadcrumbItemClicked(MultiLevelNode bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "node");
        updateMultiLevelTreeCurrentNode(bVar);
        refreshMultiLevelView();
    }

    public void onMultiLevelArrowClicked(MultiLevelNode bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "multiLevelNode");
        updateMultiLevelTreeCurrentNode(bVar);
        refreshMultiLevelView();
    }

    public void onSearchResourceClicked(MeetingRoomModel meetingRoomModel) {
        Intrinsics.checkParameterIsNotNull(meetingRoomModel, "meetingRoomModel");
        onSelectSingleResource(meetingRoomModel);
    }

    public final void updateAllLevelAndMeetingRoomData(Map<String, LevelRelatedInfo> map) {
        this.originalMultiLevelAndMeetRoomMap = map;
        this.multiLevelTree = MultiLevelTree.f80780c.mo115842a(getFilterData(), false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel$onMultiFilterDataChanged$1", mo239173f = "MultiLevelViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b$e */
    public static final class C32017e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MultiLevelViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32017e(MultiLevelViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32017e eVar = new C32017e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C32017e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.this$0.getResourceDisplayStatus().mo5929b(ResourceDisplayStatus.LoadingStatusData.f81864a);
                MultiLevelViewModel bVar = this.this$0;
                MultiLevelViewModel.searchMultiMeetingRoom$default(bVar, bVar.getInputSearchText(), false, 2, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            refreshMultiLevelView();
            return;
        }
        getResourceDisplayStatus().mo5929b(ResourceDisplayStatus.LoadingStatusData.f81864a);
        searchMultiMeetingRoom$default(this, str, false, 2, null);
    }

    public void onSelectAllClicked(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        int i = C32020c.f81895c[selectState.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                updateMultiSelectRoomSize(this.multiLevelTree.mo115840c().mo115828e(), true);
            } else {
                updateMultiSelectRoomSize(this.multiLevelTree.mo115840c().mo115827d(), false);
            }
        }
        refreshMultiLevelView();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel$refresh$1", mo239173f = "MultiLevelViewModel.kt", mo239174i = {0, 0}, mo239175l = {75}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "cacheLevelData"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b$f */
    public static final class C32018f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MultiLevelViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32018f(MultiLevelViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32018f fVar = new C32018f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C32018f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Map<String, LevelRelatedInfo> b = this.this$0.getCachePbMultiLevelData().mo5927b();
                if (b == null || b.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.this$0.updateAllLevelAndMeetingRoomData(b);
                    this.this$0.refreshMultiLevelView();
                } else {
                    MultiLevelViewModel bVar = this.this$0;
                    this.L$0 = ahVar;
                    this.L$1 = b;
                    this.label = 1;
                    if (bVar.loadAllBuildingsByRequest(this) == a) {
                        return a;
                    }
                }
            } else if (i == 1) {
                Map map = (Map) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean hasFilterResourceEquipments(CalendarResource calendarResource) {
        List<EquipmentData> equipments = getEquipments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equipments, 10));
        Iterator<T> it = equipments.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo116059a());
        }
        ArrayList<String> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        List<MeetingRoomEquipment> list = calendarResource.equipments;
        if (list == null) {
            return false;
        }
        List<MeetingRoomEquipment> list2 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().id);
        }
        ArrayList arrayList4 = arrayList3;
        for (String str : arrayList2) {
            if (!arrayList4.contains(str)) {
                return false;
            }
        }
        return true;
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

    public void onMultiLevelContentClicked(MultiLevelNode bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "multiLevelNode");
        int i = C32020c.f81893a[bVar.mo115823b().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                bVar.mo115821a(IBuildingContract.SelectState.ALL);
            } else {
                bVar.mo115821a(IBuildingContract.SelectState.NONE);
            }
            if (bVar.mo115823b().isSelected()) {
                updateMultiSelectRoomSize(bVar.mo115828e(), true);
            } else {
                updateMultiSelectRoomSize(bVar.mo115827d(), false);
            }
            refreshMultiLevelView();
        }
    }

    public void onMultiMeetingRoomClicked(MultiRoomNode eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "multiRoomNode");
        int i = C32020c.f81894b[eVar.mo115823b().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                eVar.mo115821a(IBuildingContract.SelectState.ALL);
            } else {
                eVar.mo115821a(IBuildingContract.SelectState.NONE);
            }
            if (eVar.mo115823b().isSelected()) {
                eVar.mo115844d();
                updateMultiSelectRoomSize(1, true);
            } else {
                eVar.mo115845e();
                updateMultiSelectRoomSize(1, false);
            }
            refreshMultiLevelView();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object loadAllBuildingsByRequest(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel.loadAllBuildingsByRequest(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel$searchMultiMeetingRoom$1", mo239173f = "MultiLevelViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {332}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "cursor", "meetingRoomFilter"}, mo239178s = {"L$0", "I$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b$g */
    public static final class C32019g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $curSearchRoomCounter;
        final /* synthetic */ String $searchText;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MultiLevelViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32019g(MultiLevelViewModel bVar, String str, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$searchText = str;
            this.$curSearchRoomCounter = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32019g gVar = new C32019g(this.this$0, this.$searchText, this.$curSearchRoomCounter, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C32019g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            Object obj2;
            List<CalendarResource> list;
            boolean z;
            Integer num;
            Boolean bool;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                i = this.this$0.getSearchCursor();
                Integer a2 = C69089a.m265839a(this.this$0.getCapacity());
                List<EquipmentData> equipments = this.this$0.getEquipments();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equipments, 10));
                Iterator<T> it = equipments.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo116059a());
                }
                MeetingRoomFilter meetingRoomFilter = new MeetingRoomFilter(a2, arrayList);
                MeetingRoomService hVar = MeetingRoomService.f83548a;
                long eventStartTime = this.this$0.getEventStartTime();
                long eventEndTime = this.this$0.getEventEndTime();
                String str = this.$searchText;
                String eventRRule = this.this$0.getEventRRule();
                this.L$0 = ahVar;
                this.I$0 = i;
                this.L$1 = meetingRoomFilter;
                this.label = 1;
                obj2 = hVar.mo119065a(eventStartTime, eventEndTime, str, 50, eventRRule, false, i, meetingRoomFilter, this);
                if (obj2 == a) {
                    return a;
                }
            } else if (i2 == 1) {
                MeetingRoomFilter meetingRoomFilter2 = (MeetingRoomFilter) this.L$1;
                int i3 = this.I$0;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                i = i3;
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse iVar = (SdkResponse) obj2;
            if ((!Intrinsics.areEqual(this.$searchText, this.this$0.getInputSearchText())) || this.$curSearchRoomCounter < this.this$0.getSearchRoomCounter()) {
                Log.m165389i("MultiLevelViewModel", C32673y.m125378d("old request back"));
            } else if (iVar.mo119077b() != null) {
                this.this$0.getResourceDisplayStatus().mo5929b(ResourceDisplayStatus.LoadErrStatusData.f81863a);
            } else {
                MultiLevelViewModel bVar = this.this$0;
                SearchMeetingRoomsForHierarchicalLevelsResponse searchMeetingRoomsForHierarchicalLevelsResponse = (SearchMeetingRoomsForHierarchicalLevelsResponse) iVar.mo119076a();
                if (searchMeetingRoomsForHierarchicalLevelsResponse != null) {
                    list = searchMeetingRoomsForHierarchicalLevelsResponse.resources;
                } else {
                    list = null;
                }
                SearchMeetingRoomsForHierarchicalLevelsResponse searchMeetingRoomsForHierarchicalLevelsResponse2 = (SearchMeetingRoomsForHierarchicalLevelsResponse) iVar.mo119076a();
                int i4 = 0;
                if (searchMeetingRoomsForHierarchicalLevelsResponse2 == null || (bool = searchMeetingRoomsForHierarchicalLevelsResponse2.has_more) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                bVar.updateSearchMeetingRoomData(list, z, i);
                MultiLevelViewModel bVar2 = this.this$0;
                SearchMeetingRoomsForHierarchicalLevelsResponse searchMeetingRoomsForHierarchicalLevelsResponse3 = (SearchMeetingRoomsForHierarchicalLevelsResponse) iVar.mo119076a();
                if (!(searchMeetingRoomsForHierarchicalLevelsResponse3 == null || (num = searchMeetingRoomsForHierarchicalLevelsResponse3.cursor) == null)) {
                    i4 = num.intValue();
                }
                bVar2.setSearchCursor(i4);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b$b */
    public static final class C32014b<T> implements Comparator<MultiRoomNode> {

        /* renamed from: a */
        public static final C32014b f81891a = new C32014b();

        C32014b() {
        }

        /* renamed from: a */
        public final int compare(MultiRoomNode eVar, MultiRoomNode eVar2) {
            return (eVar.mo115824c() > eVar2.mo115824c() ? 1 : (eVar.mo115824c() == eVar2.mo115824c() ? 0 : -1));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.b$c */
    public static final class C32015c<T> implements Comparator<MultiLevelNode> {

        /* renamed from: a */
        public static final C32015c f81892a = new C32015c();

        C32015c() {
        }

        /* renamed from: a */
        public final int compare(MultiLevelNode bVar, MultiLevelNode bVar2) {
            return (bVar.mo115824c() > bVar2.mo115824c() ? 1 : (bVar.mo115824c() == bVar2.mo115824c() ? 0 : -1));
        }
    }

    private final void updateMultiSelectRoomSize(int i, boolean z) {
        if (z) {
            this.multiSelectedRoomSize += i;
        } else {
            this.multiSelectedRoomSize -= i;
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
        onMultiFilterDataChanged();
    }

    private final void searchMultiMeetingRoom(String str, boolean z) {
        setSearchRoomCounter(getSearchRoomCounter() + 1);
        int searchRoomCounter = getSearchRoomCounter();
        if (z) {
            this.searchCursor = 0;
        }
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C32019g(this, str, searchRoomCounter, null), 3, null);
    }

    private final MultiLevelNode findCurrentNodeByLevelContent(MultiLevelNode bVar, LevelContent levelContent) {
        String str;
        LevelContent f;
        if (Intrinsics.areEqual(bVar.mo115830f().level_id, levelContent.level_id)) {
            return bVar;
        }
        MultiLevelNode bVar2 = null;
        Iterator<MultiLevelNode> it = bVar.mo115831g().iterator();
        while (it.hasNext()) {
            MultiLevelNode next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "currentNode");
            bVar2 = findCurrentNodeByLevelContent(next, levelContent);
            if (bVar2 == null || (f = bVar2.mo115830f()) == null) {
                str = null;
            } else {
                str = f.level_id;
            }
            if (Intrinsics.areEqual(str, levelContent.level_id)) {
                break;
            }
        }
        return bVar2;
    }

    public final void updateSearchMeetingRoomData(List<CalendarResource> list, boolean z, int i) {
        if (i == 0) {
            setSearchMeetingRoomItems(new ArrayList<>());
        }
        if (list != null) {
            List<CalendarResource> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new AppendResourceData(it.next(), ""));
            }
            getSearchMeetingRoomItems().addAll(arrayList);
        }
        updateMultiSearchItem(z);
        getResourceDisplayStatus().mo5929b(new ResourceDisplayStatus.SearchResultDisplayStatus(CollectionsKt.emptyList(), getSearchItemModelList()));
    }

    static /* synthetic */ void searchMultiMeetingRoom$default(MultiLevelViewModel bVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bVar.searchMultiMeetingRoom(str, z);
    }
}
