package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import com.bytedance.lark.pb.calendar.v1.BuildingFloorFilter;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/BuildingFloorViewDataImpl;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/BuildingFloorViewData;", "selectedBuildings", "", "Lcom/bytedance/lark/pb/calendar/v1/BuildingFloorFilter;", "pbBuildingMap", "", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "(Ljava/util/List;Ljava/util/Map;)V", "buildingViewDataList", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "getBuildingViewDataList", "()Ljava/util/List;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.b */
public final class BuildingFloorViewDataImpl implements BuildingFloorViewData {

    /* renamed from: a */
    public final List<BuildingFloorFilter> f78259a;

    /* renamed from: b */
    private final List<OneBuildingFloorViewData> f78260b;

    /* renamed from: c */
    private final Map<String, CalendarBuilding> f78261c;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.BuildingFloorViewData
    /* renamed from: a */
    public List<OneBuildingFloorViewData> mo112351a() {
        return this.f78260b;
    }

    public BuildingFloorViewDataImpl(List<BuildingFloorFilter> list, Map<String, CalendarBuilding> map) {
        Collection<CalendarBuilding> collection;
        ArrayList arrayList;
        List mutableList;
        List sortedWith;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f78259a = list;
        this.f78261c = map;
        if (map != null) {
            collection = map.values();
        } else {
            collection = null;
        }
        if (collection == null || (mutableList = CollectionsKt.toMutableList((Collection) collection)) == null || (sortedWith = CollectionsKt.sortedWith(mutableList, new Comparator<CalendarBuilding>(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.BuildingFloorViewDataImpl.C310531 */

            /* renamed from: a */
            final /* synthetic */ BuildingFloorViewDataImpl f78262a;

            {
                this.f78262a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0072 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0078 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x007d  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int compare(com.bytedance.lark.pb.calendar.v1.CalendarBuilding r7, com.bytedance.lark.pb.calendar.v1.CalendarBuilding r8) {
                /*
                // Method dump skipped, instructions count: 148
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.BuildingFloorViewDataImpl.C310531.compare(com.bytedance.lark.pb.calendar.v1.CalendarBuilding, com.bytedance.lark.pb.calendar.v1.CalendarBuilding):int");
            }
        })) == null) {
            arrayList = CollectionsKt.emptyList();
        } else {
            List<CalendarBuilding> list2 = sortedWith;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (CalendarBuilding calendarBuilding : list2) {
                ArrayList arrayList4 = new ArrayList();
                List<BuildingFloorFilter> list3 = this.f78259a;
                if (list3 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (T t : list3) {
                        if (Intrinsics.areEqual(t.building_id, calendarBuilding.id)) {
                            arrayList5.add(t);
                        }
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                boolean z6 = false;
                if (arrayList2 != null) {
                    ArrayList arrayList6 = arrayList2;
                    if (!(arrayList6 instanceof Collection) || !arrayList6.isEmpty()) {
                        Iterator it = arrayList6.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            List<String> list4 = ((BuildingFloorFilter) it.next()).needed_floors;
                            if (list4 == null || list4.isEmpty()) {
                                z5 = true;
                                continue;
                            } else {
                                z5 = false;
                                continue;
                            }
                            if (z5) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                String string = UIHelper.getString(R.string.Calendar_Common_All);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Calendar_Common_All)");
                arrayList4.add(new FloorViewData(string, true, z));
                List<String> list5 = calendarBuilding.floors;
                Intrinsics.checkExpressionValueIsNotNull(list5, "building.floors");
                for (T t2 : list5) {
                    ArrayList arrayList7 = arrayList2;
                    if (arrayList7 == null || arrayList7.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        List<String> list6 = ((BuildingFloorFilter) arrayList2.get(0)).needed_floors;
                        Intrinsics.checkExpressionValueIsNotNull(list6, "selectedBuilding[0].needed_floors");
                        List<String> list7 = list6;
                        if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                            Iterator<T> it2 = list7.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (Intrinsics.areEqual((Object) t2, (Object) it2.next())) {
                                        z3 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    z3 = false;
                    Intrinsics.checkExpressionValueIsNotNull(t2, "floor");
                    if (!z3 || z) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    arrayList4.add(new FloorViewData(t2, false, z4, 2, null));
                }
                ArrayList arrayList8 = arrayList2;
                if (arrayList8 == null || arrayList8.isEmpty()) {
                    z6 = true;
                }
                String str = calendarBuilding.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "building.id");
                String str2 = calendarBuilding.name;
                Intrinsics.checkExpressionValueIsNotNull(str2, "building.name");
                arrayList3.add(new OneBuildingFloorViewData(str, str2, !z6, arrayList4));
            }
            arrayList = arrayList3;
        }
        this.f78260b = arrayList;
    }
}
