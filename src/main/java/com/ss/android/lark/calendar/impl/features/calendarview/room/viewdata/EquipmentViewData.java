package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/EquipmentViewData;", "", "sortEquipmentIds", "", "", "equipmentDict", "", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomEquipment;", "selectedEquipment", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "(Ljava/util/List;Ljava/util/Map;Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;)V", "equipmentList", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "getEquipmentList", "()Ljava/util/List;", "equipmentList$delegate", "Lkotlin/Lazy;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.c */
public final class EquipmentViewData {

    /* renamed from: a */
    private final Lazy f78263a;

    /* renamed from: a */
    public final List<EquipmentData> mo112354a() {
        return (List) this.f78263a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.c$a */
    static final class C31054a extends Lambda implements Function0<List<? extends EquipmentData>> {
        final /* synthetic */ Map $equipmentDict;
        final /* synthetic */ MeetingRoomFilter $selectedEquipment;
        final /* synthetic */ List $sortEquipmentIds;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31054a(List list, Map map, MeetingRoomFilter meetingRoomFilter) {
            super(0);
            this.$sortEquipmentIds = list;
            this.$equipmentDict = map;
            this.$selectedEquipment = meetingRoomFilter;
        }

        /* Return type fixed from 'java.util.List<com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.b>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends EquipmentData> invoke() {
            List<String> list;
            ArrayList arrayList = new ArrayList();
            for (String str : this.$sortEquipmentIds) {
                MeetingRoomEquipment meetingRoomEquipment = (MeetingRoomEquipment) this.$equipmentDict.get(str);
                if (meetingRoomEquipment != null) {
                    MeetingRoomFilter meetingRoomFilter = this.$selectedEquipment;
                    boolean z = false;
                    if (meetingRoomFilter != null && (list = meetingRoomFilter.need_equipments) != null) {
                        List<String> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (Intrinsics.areEqual(it.next(), str)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    String str2 = meetingRoomEquipment.i18n_name;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.i18n_name");
                    String str3 = meetingRoomEquipment.equipment_type;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "it.equipment_type");
                    arrayList.add(new EquipmentData(str, str2, str3, z));
                }
            }
            return CollectionsKt.toList(arrayList);
        }
    }

    public EquipmentViewData(List<String> list, Map<String, MeetingRoomEquipment> map, MeetingRoomFilter meetingRoomFilter) {
        Intrinsics.checkParameterIsNotNull(list, "sortEquipmentIds");
        Intrinsics.checkParameterIsNotNull(map, "equipmentDict");
        this.f78263a = LazyKt.lazy(new C31054a(list, map, meetingRoomFilter));
    }
}
