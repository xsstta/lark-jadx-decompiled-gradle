package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import android.graphics.drawable.Drawable;
import com.bytedance.lark.pb.calendar.v1.BuildingFloorFilter;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.RoomViewFilterConfigs;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\n\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R#\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomFilterViewData;", "", "filterConfigs", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewFilterConfigs;", "buildingDict", "", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "equipmentDict", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomEquipment;", "hasSelectRoom", "", "(Lcom/bytedance/lark/pb/calendar/v1/RoomViewFilterConfigs;Ljava/util/Map;Ljava/util/Map;Z)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomFilterViewData;", "getData", "()Ljava/util/List;", "logoDrawable", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getLogoDrawable", "()Landroid/graphics/drawable/Drawable;", "logoDrawable$delegate", "Lkotlin/Lazy;", "getBuildingFilterData", "getCapacityFilterData", "getEquipmentFilterData", "getMultiLevelFilterViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.l */
public final class RoomFilterViewData {

    /* renamed from: a */
    private final Lazy f78296a = LazyKt.lazy(C31056a.INSTANCE);

    /* renamed from: b */
    private final RoomViewFilterConfigs f78297b;

    /* renamed from: c */
    private final Map<String, CalendarBuilding> f78298c;

    /* renamed from: d */
    private final Map<String, MeetingRoomEquipment> f78299d;

    /* renamed from: e */
    private final boolean f78300e;

    /* renamed from: b */
    private final Drawable m115849b() {
        return (Drawable) this.f78296a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.l$a */
    static final class C31056a extends Lambda implements Function0<Drawable> {
        public static final C31056a INSTANCE = new C31056a();

        C31056a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            return d;
        }
    }

    /* renamed from: c */
    private final OneRoomFilterViewData m115850c() {
        if (!C30022a.f74883b.mo112707o()) {
            return null;
        }
        String b = C32634ae.m125182b(R.string.Calendar_PCRooms_MeetingRoomsNode_TabButton);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(string…etingRoomsNode_TabButton)");
        return new OneRoomFilterViewData(3, null, b, this.f78300e);
    }

    /* renamed from: f */
    private final OneRoomFilterViewData m115853f() {
        int i;
        MeetingRoomFilter meetingRoomFilter;
        Integer num;
        RoomViewFilterConfigs roomViewFilterConfigs = this.f78297b;
        if (roomViewFilterConfigs == null || (meetingRoomFilter = roomViewFilterConfigs.meeting_room_filter) == null || (num = meetingRoomFilter.min_capacity) == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        if (i > 0) {
            return new OneRoomFilterViewData(2, m115849b(), String.valueOf(i), true);
        }
        String b = C32634ae.m125182b(R.string.Calendar_Edit_CapacityMobile);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(string…ndar_Edit_CapacityMobile)");
        return new OneRoomFilterViewData(2, null, b, false);
    }

    /* renamed from: a */
    public final List<OneRoomFilterViewData> mo112419a() {
        ArrayList arrayList = new ArrayList();
        OneRoomFilterViewData d = m115851d();
        if (d != null) {
            arrayList.add(d);
        }
        OneRoomFilterViewData c = m115850c();
        if (c != null) {
            arrayList.add(c);
        }
        OneRoomFilterViewData e = m115852e();
        if (e != null) {
            arrayList.add(e);
        }
        arrayList.add(m115853f());
        return arrayList;
    }

    /* renamed from: e */
    private final OneRoomFilterViewData m115852e() {
        boolean z;
        MeetingRoomFilter meetingRoomFilter;
        List<String> list;
        String str;
        if (this.f78299d.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        RoomViewFilterConfigs roomViewFilterConfigs = this.f78297b;
        if (!(roomViewFilterConfigs == null || (meetingRoomFilter = roomViewFilterConfigs.meeting_room_filter) == null || (list = meetingRoomFilter.need_equipments) == null)) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                MeetingRoomEquipment meetingRoomEquipment = this.f78299d.get(it.next());
                if (meetingRoomEquipment == null || (str = meetingRoomEquipment.i18n_name) == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            StringBuilder sb2 = (StringBuilder) CollectionsKt.joinTo$default(arrayList, sb, " · ", null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null);
        }
        String sb3 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb3, "equipmentStrBuilder.toString()");
        String str2 = sb3;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new OneRoomFilterViewData(1, null, sb3, true);
        }
        String b = C32634ae.m125182b(R.string.Calendar_Edit_Device);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(string.Calendar_Edit_Device)");
        return new OneRoomFilterViewData(1, null, b, false);
    }

    /* renamed from: d */
    private final OneRoomFilterViewData m115851d() {
        StringBuilder sb;
        boolean z;
        List<BuildingFloorFilter> list;
        String str;
        boolean z2;
        if (C30022a.f74883b.mo112707o()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        RoomViewFilterConfigs roomViewFilterConfigs = this.f78297b;
        if (roomViewFilterConfigs == null || (list = roomViewFilterConfigs.needed_building_floors) == null) {
            sb = null;
        } else {
            List<BuildingFloorFilter> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                CalendarBuilding calendarBuilding = this.f78298c.get(t.building_id);
                if (calendarBuilding == null || (str = calendarBuilding.name) == null) {
                    str = "";
                }
                StringBuilder sb3 = new StringBuilder();
                List<String> list3 = t.needed_floors;
                if (list3 != null) {
                    StringBuilder sb4 = (StringBuilder) CollectionsKt.joinTo$default(list3, sb3, ",", null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null);
                }
                if (sb3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(z2 ? str + " - " + UIHelper.getString(R.string.Calendar_Common_All) : str + " - " + ((Object) sb3));
            }
            sb = (StringBuilder) CollectionsKt.joinTo$default(arrayList, sb2, ",", null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null);
        }
        StringBuilder sb5 = sb;
        if (sb5 == null || sb5.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String b = C32634ae.m125182b(R.string.Calendar_MeetingRoom_BuildingAndFloor);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(string…ingRoom_BuildingAndFloor)");
            return new OneRoomFilterViewData(0, null, b, false);
        }
        String sb6 = sb2.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb6, "nameStrBuilder.toString()");
        return new OneRoomFilterViewData(0, null, sb6, true);
    }

    public RoomFilterViewData(RoomViewFilterConfigs roomViewFilterConfigs, Map<String, CalendarBuilding> map, Map<String, MeetingRoomEquipment> map2, boolean z) {
        Intrinsics.checkParameterIsNotNull(map, "buildingDict");
        Intrinsics.checkParameterIsNotNull(map2, "equipmentDict");
        this.f78297b = roomViewFilterConfigs;
        this.f78298c = map;
        this.f78299d = map2;
        this.f78300e = z;
    }
}
