package com.ss.android.lark.calendar.impl.features.meetingroom.append.building;

import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BuildingModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.ChosenMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadErrModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadingDataModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.NoneResourceModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.TypeTitleModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.C32004b;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32064b;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 n2\u00020\u0001:\u0001nB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJd\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u001a\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00130+2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0002J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J.\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00132\f\u0010I\u001a\b\u0012\u0004\u0012\u00020,0\u00132\u0006\u0010E\u001a\u00020D2\b\b\u0002\u0010J\u001a\u00020\u0003H\u0002J\u000e\u0010K\u001a\u00020L2\u0006\u0010E\u001a\u00020DJ\u001e\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020O2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0013H\u0002J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020S0R2\u0006\u0010N\u001a\u00020OH\u0002J\u0006\u0010T\u001a\u00020UJ\u0006\u0010V\u001a\u00020UJ\u0006\u0010W\u001a\u00020UJ\u0006\u0010X\u001a\u00020UJ\u0006\u0010Y\u001a\u00020UJ\u000e\u0010Z\u001a\u00020U2\u0006\u0010[\u001a\u00020,J\u0016\u0010\\\u001a\u00020U2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0016\u0010^\u001a\u00020U2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0003J\u0010\u0010b\u001a\u00020U2\u0006\u0010c\u001a\u00020`H\u0002J\u001c\u0010d\u001a\u00020U2\u0006\u0010e\u001a\u00020D2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0013J*\u0010f\u001a\u00020U2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0014\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020O\u0018\u00010+J\u001a\u0010i\u001a\u00020U2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020O0+J\u0010\u0010k\u001a\u00020U2\u0006\u0010l\u001a\u00020HH\u0002J\u000e\u0010m\u001a\u00020U2\u0006\u0010[\u001a\u00020,R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R,\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00130+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00101\u001a\u0012\u0012\u0004\u0012\u00020,02j\b\u0012\u0004\u0012\u00020,`3X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R,\u00108\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00130+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R.\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00130<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0016\"\u0004\bA\u0010\u0018¨\u0006o"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingModel;", "", "isDisableApprovalMeetingRoom", "", "isRepeatOrExceptionEvent", "eventDuration", "", "chosenMeetingRoom", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(ZZJLjava/util/List;)V", "allExpandBuildings", "", "", "getAllExpandBuildings", "()Ljava/util/Set;", "setAllExpandBuildings", "(Ljava/util/Set;)V", "allItemModels", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "getAllItemModels", "()Ljava/util/List;", "setAllItemModels", "(Ljava/util/List;)V", "allLoadingBuildingIds", "getAllLoadingBuildingIds", "setAllLoadingBuildingIds", "buildingList", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "getBuildingList", "setBuildingList", "getChosenMeetingRoom", "getEventDuration", "()J", "expandBuildings", "getExpandBuildings", "setExpandBuildings", "()Z", "loadingBuildingIds", "getLoadingBuildingIds", "setLoadingBuildingIds", "multiBuildingResourceMap", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "getMultiBuildingResourceMap", "()Ljava/util/Map;", "setMultiBuildingResourceMap", "(Ljava/util/Map;)V", "multipleSelectMeetingRoomList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMultipleSelectMeetingRoomList", "()Ljava/util/ArrayList;", "setMultipleSelectMeetingRoomList", "(Ljava/util/ArrayList;)V", "originalMultiBuildingResourceMap", "getOriginalMultiBuildingResourceMap", "setOriginalMultiBuildingResourceMap", "resourceMap", "", "getResourceMap", "setResourceMap", "validItemModels", "getValidItemModels", "setValidItemModels", "getAllItems", "pageIndex", "", "selectModel", "getChosenMeetingRoomItemModel", "getResourceItems", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "resources", "filterFreeResource", "getSelectAllState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "hasFilterResourceEquipments", "calendarResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "equipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "rebuildAllBuildingItems", "", "rebuildMultiAllBuildingItems", "rebuildSearchFilterBuildingItems", "selectAllResource", "unSelectAllResource", "unSelectResource", "eventMeetingRoomData", "updateAllItemSelectState", "updateItemList", "updateBuildingSelectData", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BuildingModel;", "selectResource", "updateBuildingSelectState", "model", "updateCurrentBuildingSource", "capacity", "updateLoadResourceMap", "updateBuildingIds", "resourceDataMap", "updateMultiOriginData", "originalMap", "updateResourceSelectState", "meetingRoomModel", "updateSelectResource", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.a */
public final class AppendBuildingModel {

    /* renamed from: a */
    public static final Companion f81726a = new Companion(null);

    /* renamed from: b */
    private Set<String> f81727b = new LinkedHashSet();

    /* renamed from: c */
    private Set<String> f81728c = new LinkedHashSet();

    /* renamed from: d */
    private List<String> f81729d = new ArrayList();

    /* renamed from: e */
    private List<String> f81730e = new ArrayList();

    /* renamed from: f */
    private List<? extends BaseModel> f81731f = CollectionsKt.emptyList();

    /* renamed from: g */
    private List<? extends BaseModel> f81732g = CollectionsKt.emptyList();

    /* renamed from: h */
    private List<CalendarBuilding> f81733h = CollectionsKt.emptyList();

    /* renamed from: i */
    private Map<String, List<AppendResourceData>> f81734i = new LinkedHashMap();

    /* renamed from: j */
    private ArrayList<AppendResourceData> f81735j = new ArrayList<>();

    /* renamed from: k */
    private Map<String, ? extends List<AppendResourceData>> f81736k = MapsKt.emptyMap();

    /* renamed from: l */
    private Map<String, ? extends List<AppendResourceData>> f81737l = MapsKt.emptyMap();

    /* renamed from: m */
    private final boolean f81738m;

    /* renamed from: n */
    private final boolean f81739n;

    /* renamed from: o */
    private final long f81740o;

    /* renamed from: p */
    private final List<CalendarEventAttendee> f81741p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Set<String> mo116637a() {
        return this.f81727b;
    }

    /* renamed from: b */
    public final Set<String> mo116644b() {
        return this.f81728c;
    }

    /* renamed from: c */
    public final List<String> mo116647c() {
        return this.f81729d;
    }

    /* renamed from: d */
    public final List<String> mo116649d() {
        return this.f81730e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel>, java.util.List<com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel> */
    /* renamed from: e */
    public final List<BaseModel> mo116650e() {
        return this.f81731f;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel>, java.util.List<com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel> */
    /* renamed from: f */
    public final List<BaseModel> mo116651f() {
        return this.f81732g;
    }

    /* renamed from: g */
    public final Map<String, List<AppendResourceData>> mo116652g() {
        return this.f81734i;
    }

    /* renamed from: h */
    public final ArrayList<AppendResourceData> mo116653h() {
        return this.f81735j;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.lark.calendar.impl.features.meetingroom.append.data.a>>, java.util.Map<java.lang.String, java.util.List<com.ss.android.lark.calendar.impl.features.meetingroom.append.data.a>> */
    /* renamed from: i */
    public final Map<String, List<AppendResourceData>> mo116654i() {
        return this.f81737l;
    }

    /* renamed from: o */
    public final List<CalendarEventAttendee> mo116660o() {
        return this.f81741p;
    }

    /* renamed from: a */
    public final void mo116639a(BuildingModel aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "buildingModel");
        if (z) {
            List<AppendResourceData> list = (List) this.f81736k.get(aVar.mo116780c());
            if (list != null) {
                for (AppendResourceData aVar2 : list) {
                    mo116645b(aVar2);
                }
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : this.f81735j) {
            if (!Intrinsics.areEqual(t.mo116888b().building_id, aVar.mo116780c())) {
                arrayList.add(t);
            }
        }
        this.f81735j = new ArrayList<>(arrayList);
    }

    /* renamed from: a */
    public final void mo116643a(Map<String, CalendarResource> map) {
        Intrinsics.checkParameterIsNotNull(map, "originalMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : this.f81733h) {
            String str = t.id;
            if (str == null) {
                str = "";
            }
            ArrayList arrayList = new ArrayList();
            for (T t2 : map.values()) {
                if (Intrinsics.areEqual(t2.building_id, t.id)) {
                    arrayList.add(t2);
                }
            }
            List<CalendarResource> sortedWith = CollectionsKt.sortedWith(arrayList, C31969c.f81743a);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
            for (CalendarResource calendarResource : sortedWith) {
                String str2 = t.name;
                Intrinsics.checkExpressionValueIsNotNull(str2, "building.name");
                arrayList2.add(new AppendResourceData(calendarResource, str2));
            }
            linkedHashMap.put(str, arrayList2);
        }
        this.f81737l = MapsKt.toMap(linkedHashMap);
    }

    /* renamed from: a */
    public final void mo116642a(List<String> list, Map<String, CalendarResource> map) {
        ArrayList arrayList;
        T t;
        Collection<CalendarResource> values;
        Intrinsics.checkParameterIsNotNull(list, "updateBuildingIds");
        for (T t2 : list) {
            Iterator<T> it = this.f81733h.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(t2, t.id)) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                Map<String, List<AppendResourceData>> map2 = this.f81734i;
                if (!(map == null || (values = map.values()) == null)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t4 : values) {
                        if (Intrinsics.areEqual(t4.building_id, t2)) {
                            arrayList2.add(t4);
                        }
                    }
                    List sortedWith = CollectionsKt.sortedWith(arrayList2, C31968b.f81742a);
                    if (sortedWith != null) {
                        List<CalendarResource> list2 = sortedWith;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (CalendarResource calendarResource : list2) {
                            String str = t3.name;
                            if (str == null) {
                                str = "";
                            }
                            arrayList3.add(new AppendResourceData(calendarResource, str));
                        }
                        arrayList = arrayList3;
                    }
                }
                map2.put(t2, arrayList);
            }
        }
    }

    /* renamed from: n */
    public final void mo116659n() {
        this.f81735j.clear();
    }

    /* renamed from: j */
    public final void mo116655j() {
        this.f81731f = m121653a(this.f81733h, CollectionsKt.toList(this.f81727b), this.f81729d, this.f81734i, 0, 0);
        this.f81732g = m121653a(this.f81733h, CollectionsKt.toList(this.f81728c), this.f81730e, this.f81734i, 1, 0);
    }

    /* renamed from: k */
    public final void mo116656k() {
        this.f81732g = CollectionsKt.plus((Collection) m121659p(), (Iterable) m121653a(this.f81733h, CollectionsKt.toList(this.f81728c), this.f81730e, this.f81734i, 1, 0));
    }

    /* renamed from: l */
    public final void mo116657l() {
        this.f81731f = m121653a(this.f81733h, CollectionsKt.toList(this.f81727b), CollectionsKt.emptyList(), this.f81736k, 0, 1);
        this.f81732g = m121653a(this.f81733h, CollectionsKt.toList(this.f81727b), CollectionsKt.emptyList(), this.f81736k, 1, 1);
        m121658d(this.f81731f);
        m121658d(this.f81732g);
    }

    /* renamed from: p */
    private final List<BaseModel> m121659p() {
        List<CalendarEventAttendee> list = this.f81741p;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            String b = C32634ae.m125182b(R.string.Calendar_Edit_ChosenRooms);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…alendar_Edit_ChosenRooms)");
            arrayList.add(new TypeTitleModel(R.drawable.calendar_icon_meeting_room_title_selected, b));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ChosenMeetingRoomModel(it.next()));
            }
        }
        String b2 = C32634ae.m125182b(R.string.Calendar_Edit_AllRooms);
        Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Edit_AllRooms)");
        arrayList.add(new TypeTitleModel(R.drawable.calendar_icon_meeting_room_title_all, b2));
        return arrayList;
    }

    /* renamed from: m */
    public final void mo116658m() {
        this.f81735j.clear();
        Iterator<T> it = this.f81733h.iterator();
        while (it.hasNext()) {
            List list = (List) this.f81736k.get(it.next().id);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (C32064b.m121944a(((AppendResourceData) obj).mo116888b(), this.f81738m, this.f81739n, this.f81740o)) {
                        arrayList.add(obj);
                    }
                }
                this.f81735j.addAll(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo116641a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f81729d = list;
    }

    /* renamed from: b */
    public final void mo116646b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f81730e = list;
    }

    /* renamed from: c */
    public final void mo116648c(List<CalendarBuilding> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f81733h = list;
    }

    /* renamed from: a */
    public final void mo116640a(AppendResourceData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "eventMeetingRoomData");
        this.f81735j.remove(aVar);
    }

    /* renamed from: a */
    private final void m121655a(MeetingRoomModel meetingRoomModel) {
        IBuildingContract.SelectState selectState;
        if (!meetingRoomModel.mo116765c()) {
            selectState = IBuildingContract.SelectState.NOT_OPTIONAL;
        } else if (this.f81735j.contains(meetingRoomModel.mo116770g())) {
            selectState = IBuildingContract.SelectState.ALL;
        } else {
            selectState = IBuildingContract.SelectState.NONE;
        }
        meetingRoomModel.mo116761a(selectState);
    }

    /* renamed from: a */
    private final Pair<Boolean, NeedApprovalType> m121654a(CalendarResource calendarResource) {
        boolean z;
        Pair<Boolean, NeedApprovalType> a = C32065c.m121947a(calendarResource, Long.valueOf(this.f81740o));
        if (!this.f81738m || !this.f81739n || !a.getFirst().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        return TuplesKt.to(Boolean.valueOf(z), a.getSecond());
    }

    /* renamed from: d */
    private final void m121658d(List<? extends BaseModel> list) {
        for (T t : list) {
            if (t instanceof MeetingRoomModel) {
                m121655a((MeetingRoomModel) t);
            } else if (t instanceof BuildingModel) {
                m121656a((BuildingModel) t);
            }
        }
    }

    /* renamed from: b */
    public final void mo116645b(AppendResourceData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "eventMeetingRoomData");
        if (C32064b.m121944a(aVar.mo116888b(), this.f81738m, this.f81739n, this.f81740o) && !this.f81735j.contains(aVar)) {
            this.f81735j.add(aVar);
        }
    }

    /* renamed from: a */
    private final void m121656a(BuildingModel aVar) {
        ArrayList arrayList;
        boolean z;
        IBuildingContract.SelectState selectState;
        Object obj;
        boolean z2;
        List list = (List) this.f81736k.get(aVar.mo116780c());
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (C32064b.m121944a(((AppendResourceData) obj2).mo116888b(), this.f81738m, this.f81739n, this.f81740o)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List list2 = arrayList;
        boolean z3 = false;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.mo116776a(IBuildingContract.SelectState.NOT_OPTIONAL);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t : this.f81735j) {
            T t2 = t;
            if (!Intrinsics.areEqual(t2.mo116888b().building_id, aVar.mo116782e().id) || !C32004b.m121832a(t2, this.f81738m, this.f81739n, this.f81740o)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                arrayList3.add(t);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            aVar.mo116776a(IBuildingContract.SelectState.NONE);
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z3 = true;
                break;
            }
            AppendResourceData aVar2 = (AppendResourceData) it.next();
            Iterator it2 = arrayList4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((AppendResourceData) obj).mo116888b().calendar_id, aVar2.mo116888b().calendar_id)) {
                    break;
                }
            }
            if (((AppendResourceData) obj) == null) {
                break;
            }
        }
        if (z3) {
            selectState = IBuildingContract.SelectState.ALL;
        } else {
            selectState = IBuildingContract.SelectState.SELF;
        }
        aVar.mo116776a(selectState);
    }

    /* renamed from: a */
    public final IBuildingContract.SelectState mo116636a(int i) {
        boolean z;
        T t;
        boolean z2 = true;
        if (i != 1) {
            return IBuildingContract.SelectState.NOT_OPTIONAL;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f81736k.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : it.next()) {
                if (C32004b.m121832a((AppendResourceData) obj, this.f81738m, this.f81739n, this.f81740o)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        if (arrayList.isEmpty()) {
            return IBuildingContract.SelectState.NOT_OPTIONAL;
        }
        ArrayList<AppendResourceData> arrayList3 = this.f81735j;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return IBuildingContract.SelectState.NONE;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AppendResourceData aVar = (AppendResourceData) it2.next();
            Iterator<T> it3 = this.f81735j.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    t = null;
                    break;
                }
                t = it3.next();
                if (Intrinsics.areEqual(t.mo116888b().calendar_id, aVar.mo116888b().calendar_id)) {
                    break;
                }
            }
            if (t == null) {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return IBuildingContract.SelectState.ALL;
        }
        return IBuildingContract.SelectState.SELF;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.a$b */
    public static final class C31968b<T> implements Comparator<CalendarResource> {

        /* renamed from: a */
        public static final C31968b f81742a = new C31968b();

        C31968b() {
        }

        /* renamed from: a */
        public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
            int intValue = calendarResource2.weight.intValue();
            Integer num = calendarResource.weight;
            Intrinsics.checkExpressionValueIsNotNull(num, "o1.weight");
            return intValue - num.intValue();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.a$c */
    public static final class C31969c<T> implements Comparator<CalendarResource> {

        /* renamed from: a */
        public static final C31969c f81743a = new C31969c();

        C31969c() {
        }

        /* renamed from: a */
        public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
            int intValue = calendarResource2.weight.intValue();
            Integer num = calendarResource.weight;
            Intrinsics.checkExpressionValueIsNotNull(num, "o1.weight");
            return intValue - num.intValue();
        }
    }

    /* renamed from: a */
    private final boolean m121657a(CalendarResource calendarResource, List<EquipmentData> list) {
        List<EquipmentData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo116059a());
        }
        ArrayList<String> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        List<MeetingRoomEquipment> list3 = calendarResource.equipments;
        if (list3 == null) {
            return false;
        }
        List<MeetingRoomEquipment> list4 = list3;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it2 = list4.iterator();
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

    /* renamed from: a */
    public final void mo116638a(int i, List<EquipmentData> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "equipments");
        if (!this.f81737l.isEmpty()) {
            Map<String, ? extends List<AppendResourceData>> map = this.f81737l;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (T t : map.entrySet()) {
                Object key = t.getKey();
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) t.getValue()) {
                    AppendResourceData aVar = (AppendResourceData) obj;
                    if (Intrinsics.compare(aVar.mo116888b().capacity.intValue(), i) < 0 || !m121657a(aVar.mo116888b(), list)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                linkedHashMap.put(key, arrayList);
            }
            this.f81736k = linkedHashMap;
        }
    }

    /* renamed from: a */
    private final List<MeetingRoomModel> m121652a(List<AppendResourceData> list, int i, boolean z) {
        List<AppendResourceData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            arrayList.add(new MeetingRoomModel(t, m121654a(t.mo116888b()), i, null, null, 24, null));
        }
        ArrayList arrayList2 = arrayList;
        if (!z) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((MeetingRoomModel) obj).mo116765c()) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public AppendBuildingModel(boolean z, boolean z2, long j, List<CalendarEventAttendee> list) {
        this.f81738m = z;
        this.f81739n = z2;
        this.f81740o = j;
        this.f81741p = list;
    }

    /* renamed from: a */
    private final List<BaseModel> m121653a(List<CalendarBuilding> list, List<String> list2, List<String> list3, Map<String, ? extends List<AppendResourceData>> map, int i, int i2) {
        boolean z;
        List<MeetingRoomModel> list4;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        List<CalendarBuilding> list5 = list;
        if (list5 == null || list5.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(new NoneResourceModel());
            return arrayList;
        }
        for (T t : list) {
            boolean contains = list2.contains(t.id);
            arrayList.add(new BuildingModel(t, i2, i, contains, null, 16, null));
            List<AppendResourceData> list6 = (List) map.get(t.id);
            if (list6 != null) {
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list4 = m121652a(list6, i2, z2);
            } else {
                list4 = null;
            }
            if (contains) {
                if (list3.contains(t.id)) {
                    arrayList.add(new LoadingDataModel());
                } else if (list4 == null) {
                    arrayList.add(new LoadErrModel());
                } else {
                    List<MeetingRoomModel> list7 = list4;
                    if (list7.isEmpty()) {
                        arrayList.add(new NoneResourceModel());
                    } else {
                        arrayList.addAll(list7);
                    }
                }
            }
        }
        return arrayList;
    }
}
