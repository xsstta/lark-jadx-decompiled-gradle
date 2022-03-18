package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomViewDataImpl;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomViewData;", "pbRoomData", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "buildingDict", "", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "(Ljava/util/List;Ljava/util/Map;)V", "isErrorData", "", "()Z", "setErrorData", "(Z)V", "roomItemsData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "getRoomItemsData", "()Ljava/util/List;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.p */
public final class RoomViewDataImpl implements RoomViewData {

    /* renamed from: a */
    private boolean f78315a;

    /* renamed from: b */
    private final List<OneRoomItemData> f78316b;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomViewData
    /* renamed from: b */
    public List<OneRoomItemData> mo112427b() {
        return this.f78316b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomViewData
    /* renamed from: a */
    public boolean mo112426a() {
        return this.f78315a;
    }

    /* renamed from: a */
    public void mo112428a(boolean z) {
        this.f78315a = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomEquipment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.p$a */
    static final class C31061a extends Lambda implements Function1<MeetingRoomEquipment, String> {
        public static final C31061a INSTANCE = new C31061a();

        C31061a() {
            super(1);
        }

        public final String invoke(MeetingRoomEquipment meetingRoomEquipment) {
            String str = meetingRoomEquipment.i18n_name;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.i18n_name");
            return str;
        }
    }

    public RoomViewDataImpl(List<CalendarResource> list, Map<String, CalendarBuilding> map) {
        boolean z;
        ArrayList arrayList;
        String str;
        CalendarBuilding calendarBuilding;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkParameterIsNotNull(map, "buildingDict");
        if (list == null) {
            z = true;
        } else {
            z = false;
        }
        mo112428a(z);
        if (list != null) {
            List<CalendarResource> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                StringBuilder sb = new StringBuilder();
                List<MeetingRoomEquipment> list3 = t.equipments;
                Intrinsics.checkExpressionValueIsNotNull(list3, "it.equipments");
                CollectionsKt.joinTo$default(list3, sb, "-", null, null, 0, null, C31061a.INSTANCE, 60, null);
                boolean a = SchemaHelper.f83746a.mo120311a(t.resource_schema);
                if (C30022a.f74883b.mo112707o()) {
                    str4 = t.name;
                    if (str4 == null) {
                        str = "";
                        String str5 = t.calendar_id;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "it.calendar_id");
                        Integer num = t.capacity;
                        Intrinsics.checkExpressionValueIsNotNull(num, "it.capacity");
                        int intValue = num.intValue();
                        calendarBuilding = map.get(t.building_id);
                        if (calendarBuilding != null || (str3 = calendarBuilding.name) == null) {
                            str2 = "";
                        } else {
                            str2 = str3;
                        }
                        String sb2 = sb.toString();
                        Intrinsics.checkExpressionValueIsNotNull(sb2, "equipmentStr.toString()");
                        OneRoomItemData kVar = new OneRoomItemData(str5, str, a, intValue, str2, sb2, 0, 0, null, 448, null);
                        kVar.mo112404a(C32514b.m124521a((CalendarResource) t));
                        arrayList2.add(kVar);
                    }
                } else {
                    str4 = t.floor_name + " - " + t.name;
                }
                str = str4;
                String str52 = t.calendar_id;
                Intrinsics.checkExpressionValueIsNotNull(str52, "it.calendar_id");
                Integer num2 = t.capacity;
                Intrinsics.checkExpressionValueIsNotNull(num2, "it.capacity");
                int intValue2 = num2.intValue();
                calendarBuilding = map.get(t.building_id);
                if (calendarBuilding != null) {
                }
                str2 = "";
                String sb22 = sb.toString();
                Intrinsics.checkExpressionValueIsNotNull(sb22, "equipmentStr.toString()");
                OneRoomItemData kVar2 = new OneRoomItemData(str52, str, a, intValue2, str2, sb22, 0, 0, null, 448, null);
                kVar2.mo112404a(C32514b.m124521a((CalendarResource) t));
                arrayList2.add(kVar2);
            }
            arrayList = arrayList2;
        } else {
            arrayList = CollectionsKt.emptyList();
        }
        this.f78316b = arrayList;
    }
}
