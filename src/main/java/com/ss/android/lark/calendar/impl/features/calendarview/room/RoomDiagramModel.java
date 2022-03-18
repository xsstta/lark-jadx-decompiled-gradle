package com.ss.android.lark.calendar.impl.features.calendarview.room;

import com.bytedance.lark.pb.calendar.v1.BuildingFloorFilter;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.RoomViewFilterConfigs;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.FloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.IndexRange;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneBuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelTree;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c */
public final class RoomDiagramModel {

    /* renamed from: a */
    public static final Companion f78163a = new Companion(null);

    /* renamed from: b */
    private volatile int f78164b;

    /* renamed from: c */
    private volatile int f78165c;

    /* renamed from: d */
    private int f78166d;

    /* renamed from: e */
    private final Lazy f78167e = LazyKt.lazy(C31012c.INSTANCE);

    /* renamed from: f */
    private volatile RoomViewFilterConfigs f78168f;

    /* renamed from: g */
    private volatile boolean f78169g;

    /* renamed from: h */
    private final Lazy f78170h = LazyKt.lazy(C31013d.INSTANCE);

    /* renamed from: i */
    private volatile ArrayList<String> f78171i;

    /* renamed from: j */
    private volatile ArrayList<CalendarResource> f78172j;

    /* renamed from: k */
    private volatile Boolean[] f78173k;

    /* renamed from: l */
    private MultiLevelTree f78174l;

    /* renamed from: m */
    private List<CalendarResource> f78175m;

    /* renamed from: n */
    private volatile Map<String, LevelRelatedInfo> f78176n;

    /* renamed from: o */
    private volatile boolean f78177o;

    /* renamed from: a */
    public final ConcurrentHashMap<String, CalendarBuilding> mo112244a() {
        return (ConcurrentHashMap) this.f78167e.getValue();
    }

    /* renamed from: d */
    public final ConcurrentHashMap<String, MeetingRoomEquipment> mo112261d() {
        return (ConcurrentHashMap) this.f78170h.getValue();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c$b */
    public static final class QueryInstanceTask {

        /* renamed from: a */
        private final IndexRange f78178a;

        /* renamed from: b */
        private final int f78179b;

        /* renamed from: c */
        private final List<String> f78180c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueryInstanceTask)) {
                return false;
            }
            QueryInstanceTask bVar = (QueryInstanceTask) obj;
            return Intrinsics.areEqual(this.f78178a, bVar.f78178a) && this.f78179b == bVar.f78179b && Intrinsics.areEqual(this.f78180c, bVar.f78180c);
        }

        public int hashCode() {
            IndexRange eVar = this.f78178a;
            int i = 0;
            int hashCode = (((eVar != null ? eVar.hashCode() : 0) * 31) + this.f78179b) * 31;
            List<String> list = this.f78180c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        /* renamed from: a */
        public final IndexRange mo112271a() {
            return this.f78178a;
        }

        /* renamed from: b */
        public final int mo112272b() {
            return this.f78179b;
        }

        /* renamed from: c */
        public final List<String> mo112273c() {
            return this.f78180c;
        }

        public String toString() {
            return "version = " + this.f78179b + "; range = [" + this.f78178a.mo112363b() + ", " + this.f78178a.mo112364c() + "]; calendarSize = " + this.f78180c.size();
        }

        public QueryInstanceTask(IndexRange eVar, int i, List<String> list) {
            Intrinsics.checkParameterIsNotNull(eVar, "indexRange");
            Intrinsics.checkParameterIsNotNull(list, "roomCalendarIds");
            this.f78178a = eVar;
            this.f78179b = i;
            this.f78180c = list;
        }
    }

    /* renamed from: b */
    public final RoomViewFilterConfigs mo112255b() {
        return this.f78168f;
    }

    /* renamed from: c */
    public final boolean mo112260c() {
        return this.f78169g;
    }

    /* renamed from: g */
    public final MultiLevelTree mo112264g() {
        return this.f78174l;
    }

    /* renamed from: h */
    public final boolean mo112265h() {
        return this.f78177o;
    }

    /* renamed from: a */
    public final void mo112251a(Map<String, MeetingRoomEquipment> map, List<String> list) {
        mo112261d().clear();
        if (map != null) {
            for (Map.Entry<String, MeetingRoomEquipment> entry : map.entrySet()) {
                String key = entry.getKey();
                MeetingRoomEquipment value = entry.getValue();
                String str = key;
                if (!(str == null || str.length() == 0) && value != null) {
                    mo112261d().put(key, value);
                }
            }
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (list != null) {
            for (T t : list) {
                if (t != null) {
                    arrayList.add(t);
                }
            }
        }
        this.f78171i = arrayList;
    }

    /* renamed from: a */
    public final void mo112248a(Collection<CalendarResource> collection) {
        if (collection != null) {
            ArrayList<CalendarResource> arrayList = new ArrayList<>();
            for (T t : collection) {
                if (t != null) {
                    arrayList.add(t);
                }
            }
            CollectionsKt.sortWith(arrayList, C31015f.f78182a);
            m115684a(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo112252a(Map<String, CalendarBuilding> map, boolean z) {
        if (map != null) {
            for (Map.Entry<String, CalendarBuilding> entry : map.entrySet()) {
                String key = entry.getKey();
                CalendarBuilding value = entry.getValue();
                if (!(key == null || value == null)) {
                    CalendarBuilding calendarBuilding = mo112244a().get(key);
                    if (z || (!z && calendarBuilding == null)) {
                        mo112244a().put(key, value);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo112249a(List<OneBuildingFloorViewData> list) {
        RoomViewFilterConfigs.C15984a newBuilder;
        RoomViewFilterConfigs.C15984a a;
        Intrinsics.checkParameterIsNotNull(list, "buildingsViewData");
        this.f78169g = true;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<FloorViewData> it = t.mo112382d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FloorViewData next = it.next();
                if (next.mo112357b() && next.mo112358c()) {
                    arrayList2.clear();
                    break;
                } else if (next.mo112358c()) {
                    arrayList2.add(next.mo112355a());
                }
            }
            arrayList.add(new BuildingFloorFilter.C15498a().mo56104a(t.mo112378a()).mo56105a(arrayList2).build());
        }
        RoomViewFilterConfigs roomViewFilterConfigs = this.f78168f;
        this.f78168f = (roomViewFilterConfigs == null || (newBuilder = roomViewFilterConfigs.newBuilder()) == null || (a = newBuilder.mo57538a(arrayList)) == null) ? null : a.build();
    }

    /* renamed from: a */
    public final boolean mo112254a(QueryInstanceTask bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "queryTask");
        ArrayList<CalendarResource> arrayList = this.f78172j;
        if (arrayList != null) {
            if (bVar.mo112271a().mo112362a() || bVar.mo112271a().mo112364c() >= arrayList.size()) {
                Log.m165383e("RoomDiagramModel", C32673y.m125378d("queryTask.IndexRange = " + bVar.mo112271a()));
            } else {
                int i = 0;
                for (T t : bVar.mo112273c()) {
                    int b = bVar.mo112271a().mo112363b() + i;
                    if (b >= arrayList.size()) {
                        Log.m165383e("RoomDiagramModel", C32673y.m125378d(" mRoomDataCache.size = " + arrayList.size() + "; queryTask.IndexRange = " + bVar.mo112271a()));
                        return false;
                    } else if (!Intrinsics.areEqual(arrayList.get(b).calendar_id, t)) {
                        Log.m165383e("RoomDiagramModel", C32673y.m125378d("calendar not match"));
                        return false;
                    } else {
                        i++;
                    }
                }
                if (bVar.mo112272b() != this.f78166d) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo112250a(Map<String, LevelRelatedInfo> map) {
        Intrinsics.checkParameterIsNotNull(map, "originTreeData");
        this.f78176n = map;
        this.f78174l = MultiLevelTree.f80780c.mo115842a(map, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c$c */
    public static final class C31012c extends Lambda implements Function0<ConcurrentHashMap<String, CalendarBuilding>> {
        public static final C31012c INSTANCE = new C31012c();

        C31012c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConcurrentHashMap<String, CalendarBuilding> invoke() {
            return new ConcurrentHashMap<>();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c$d */
    public static final class C31013d extends Lambda implements Function0<ConcurrentHashMap<String, MeetingRoomEquipment>> {
        public static final C31013d INSTANCE = new C31013d();

        C31013d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConcurrentHashMap<String, MeetingRoomEquipment> invoke() {
            return new ConcurrentHashMap<>();
        }
    }

    /* renamed from: f */
    public final List<CalendarResource> mo112263f() {
        ArrayList<CalendarResource> arrayList = this.f78172j;
        if (arrayList != null) {
            return CollectionsKt.toList(arrayList);
        }
        return null;
    }

    public RoomDiagramModel() {
        mo112269l();
    }

    /* renamed from: e */
    public final List<String> mo112262e() {
        List<String> list;
        ArrayList<String> arrayList = this.f78171i;
        if (arrayList == null || (list = CollectionsKt.toList(arrayList)) == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    /* renamed from: i */
    public final List<QueryInstanceTask> mo112266i() {
        Boolean[] boolArr = this.f78173k;
        if (boolArr != null) {
            int length = boolArr.length;
            for (int i = 0; i < length; i++) {
                boolArr[i] = false;
            }
        }
        return m115687n();
    }

    /* renamed from: l */
    public final void mo112269l() {
        if (C30022a.f74883b.mo112707o()) {
            mo112246a(new RoomViewFilterConfigs.C15984a().mo57537a(new MeetingRoomFilter.C15872a().mo57259a(new ArrayList()).mo57258a((Integer) 0).build()).build());
        }
    }

    /* renamed from: m */
    public final void mo112270m() {
        this.f78164b = 0;
        this.f78165c = 0;
        this.f78166d = 0;
        mo112244a().clear();
        this.f78168f = null;
        mo112261d().clear();
        ArrayList<String> arrayList = this.f78171i;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<CalendarResource> arrayList2 = this.f78172j;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f78173k = null;
        this.f78174l = null;
        this.f78177o = false;
    }

    /* renamed from: j */
    public final void mo112267j() {
        MeetingRoomFilter meetingRoomFilter;
        int i;
        List<CalendarResource> list = this.f78175m;
        if (list != null) {
            RoomViewFilterConfigs b = mo112255b();
            if (!(b == null || (meetingRoomFilter = b.meeting_room_filter) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    int intValue = t2.capacity.intValue();
                    Integer num = meetingRoomFilter.min_capacity;
                    boolean z = false;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (Intrinsics.compare(intValue, i) >= 0 && m115685a((CalendarResource) t2, meetingRoomFilter.need_equipments)) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(t);
                    }
                }
                list = CollectionsKt.toMutableList((Collection) arrayList);
            }
            m115684a(new ArrayList<>(list));
        }
    }

    /* renamed from: k */
    public final void mo112268k() {
        ArrayList<MultiRoomNode> b;
        List sortedWith;
        MultiLevelTree dVar = this.f78174l;
        if (dVar != null && (!dVar.mo115840c().mo115831g().isEmpty())) {
            dVar.mo115840c().mo115831g().get(0).mo115828e();
        }
        MultiLevelTree dVar2 = this.f78174l;
        if (!(dVar2 == null || (b = dVar2.mo115839b()) == null || (sortedWith = CollectionsKt.sortedWith(b, C31014e.f78181a)) == null)) {
            List<MultiRoomNode> list = sortedWith;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MultiRoomNode eVar : list) {
                arrayList.add(eVar.mo115847f());
            }
            mo112257b(arrayList);
        }
    }

    /* renamed from: n */
    private final List<QueryInstanceTask> m115687n() {
        boolean z;
        QueryInstanceTask b;
        QueryInstanceTask b2;
        if (this.f78172j == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList<CalendarResource> arrayList = this.f78172j;
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165383e("RoomDiagramModel", C32673y.m125378d("mRoomDataCache = null"));
            return CollectionsKt.emptyList();
        }
        Boolean[] boolArr = this.f78173k;
        if (boolArr != null) {
            int length = boolArr.length - 1;
            this.f78164b = Math.min(this.f78164b, length);
            this.f78165c = Math.min(this.f78165c, length);
            this.f78164b = Math.max(this.f78164b, 0);
            this.f78165c = Math.max(this.f78165c, 0);
            ArrayList arrayList2 = new ArrayList();
            int i = this.f78164b / 10;
            int i2 = this.f78165c / 10;
            int i3 = i * 10;
            QueryInstanceTask b3 = m115686b(i3, (i3 + 10) - 1);
            if (b3 != null) {
                arrayList2.add(b3);
            }
            if (i2 - i > 1 && (b2 = m115686b(i + 1 + 10, (i2 * 10) - 1)) != null) {
                arrayList2.add(b2);
            }
            if (i2 != i) {
                int i4 = i2 * 10;
                QueryInstanceTask b4 = m115686b(i4, (i4 + 10) - 1);
                if (b4 != null) {
                    arrayList2.add(b4);
                }
            }
            int i5 = (i2 + 1) * 10;
            if (i5 - this.f78165c < 2 && (b = m115686b(i5, (i5 + 10) - 1)) != null) {
                arrayList2.add(b);
            }
            if (this.f78164b - i3 < 2 && i > 0) {
                int i6 = (i - 1) * 10;
                QueryInstanceTask b5 = m115686b(i6, (i6 + 10) - 1);
                if (b5 != null) {
                    arrayList2.add(b5);
                }
            }
            return arrayList2;
        }
        Log.m165383e("RoomDiagramModel", C32673y.m125378d("mRoomHasInstanceFlag = null"));
        return CollectionsKt.emptyList();
    }

    /* renamed from: a */
    public final void mo112253a(boolean z) {
        this.f78169g = z;
    }

    /* renamed from: b */
    public final void mo112257b(List<CalendarResource> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedResource");
        this.f78175m = list;
    }

    /* renamed from: b */
    public final void mo112258b(boolean z) {
        this.f78177o = z;
    }

    /* renamed from: a */
    private final void m115684a(ArrayList<CalendarResource> arrayList) {
        this.f78172j = arrayList;
        int size = arrayList.size();
        Boolean[] boolArr = new Boolean[size];
        for (int i = 0; i < size; i++) {
            boolArr[i] = false;
        }
        this.f78173k = boolArr;
        this.f78166d++;
    }

    /* renamed from: b */
    public final QueryInstanceTask mo112256b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        ArrayList<CalendarResource> arrayList = this.f78172j;
        if (arrayList == null) {
            return null;
        }
        int i = -1;
        int i2 = 0;
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (Intrinsics.areEqual(str, it.next().calendar_id)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i < 0) {
            return null;
        }
        return new QueryInstanceTask(new IndexRange(i, i), this.f78166d, CollectionsKt.listOf(str));
    }

    /* renamed from: c */
    public final List<QueryInstanceTask> mo112259c(List<String> list) {
        ArrayList<CalendarResource> arrayList = this.f78172j;
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        Boolean[] boolArr = this.f78173k;
        if (boolArr == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (T t : list) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (!(!Intrinsics.areEqual(t, arrayList.get(i).calendar_id)) && i < boolArr.length && boolArr[i].booleanValue()) {
                        boolArr[i] = false;
                        QueryInstanceTask b = m115686b(i, i);
                        if (b != null) {
                            arrayList2.add(b);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final Map<String, CalendarBuilding> mo112243a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return MapsKt.toMap(mo112244a());
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, CalendarBuilding> entry : mo112244a().entrySet()) {
            String key = entry.getKey();
            CalendarBuilding value = entry.getValue();
            String str3 = value.name;
            if (str3 != null) {
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (lowerCase != null) {
                        String str4 = lowerCase;
                        if (str != null) {
                            String obj = StringsKt.trim((CharSequence) str2).toString();
                            if (obj != null) {
                                String lowerCase2 = obj.toLowerCase();
                                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                                if (StringsKt.contains$default((CharSequence) str4, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                                    hashMap.put(key, value);
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            String str5 = value.pinyin_name;
            if (str5 == null) {
                continue;
            } else if (str5 != null) {
                String lowerCase3 = str5.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase3, "(this as java.lang.String).toLowerCase()");
                if (lowerCase3 != null) {
                    String str6 = lowerCase3;
                    if (str != null) {
                        String obj2 = StringsKt.trim((CharSequence) str2).toString();
                        if (obj2 != null) {
                            String lowerCase4 = obj2.toLowerCase();
                            Intrinsics.checkExpressionValueIsNotNull(lowerCase4, "(this as java.lang.String).toLowerCase()");
                            if (StringsKt.contains$default((CharSequence) str6, (CharSequence) lowerCase4, false, 2, (Object) null)) {
                                hashMap.put(key, value);
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    continue;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo112245a(int i) {
        MeetingRoomFilter meetingRoomFilter;
        RoomViewFilterConfigs roomViewFilterConfigs;
        RoomViewFilterConfigs.C15984a newBuilder;
        RoomViewFilterConfigs.C15984a a;
        this.f78169g = true;
        RoomViewFilterConfigs roomViewFilterConfigs2 = this.f78168f;
        if (roomViewFilterConfigs2 == null || (meetingRoomFilter = roomViewFilterConfigs2.meeting_room_filter) == null) {
            meetingRoomFilter = new MeetingRoomFilter.C15872a().build();
        }
        MeetingRoomFilter a2 = meetingRoomFilter.newBuilder().mo57258a(Integer.valueOf(i)).build();
        RoomViewFilterConfigs roomViewFilterConfigs3 = this.f78168f;
        if (roomViewFilterConfigs3 == null || (newBuilder = roomViewFilterConfigs3.newBuilder()) == null || (a = newBuilder.mo57537a(a2)) == null) {
            roomViewFilterConfigs = null;
        } else {
            roomViewFilterConfigs = a.build();
        }
        this.f78168f = roomViewFilterConfigs;
    }

    /* renamed from: a */
    public final void mo112246a(RoomViewFilterConfigs roomViewFilterConfigs) {
        if (roomViewFilterConfigs != null) {
            this.f78168f = roomViewFilterConfigs;
            return;
        }
        this.f78168f = new RoomViewFilterConfigs.C15984a().build();
        Log.m165389i("RoomDiagramModel", C32673y.m125378d("filterConfigs is null"));
    }

    /* renamed from: a */
    public final void mo112247a(EquipmentData bVar) {
        ArrayList arrayList;
        MeetingRoomFilter meetingRoomFilter;
        MeetingRoomFilter meetingRoomFilter2;
        RoomViewFilterConfigs.C15984a newBuilder;
        RoomViewFilterConfigs.C15984a a;
        MeetingRoomFilter meetingRoomFilter3;
        List<String> list;
        MeetingRoomFilter meetingRoomFilter4;
        MeetingRoomFilter meetingRoomFilter5;
        RoomViewFilterConfigs.C15984a newBuilder2;
        RoomViewFilterConfigs.C15984a a2;
        this.f78169g = true;
        RoomViewFilterConfigs roomViewFilterConfigs = null;
        if (bVar == null) {
            RoomViewFilterConfigs roomViewFilterConfigs2 = this.f78168f;
            if (roomViewFilterConfigs2 == null || (meetingRoomFilter4 = roomViewFilterConfigs2.meeting_room_filter) == null) {
                meetingRoomFilter4 = new MeetingRoomFilter.C15872a().build();
            }
            MeetingRoomFilter.C15872a a3 = meetingRoomFilter4.newBuilder().mo57259a(new ArrayList());
            if (a3 != null) {
                meetingRoomFilter5 = a3.build();
            } else {
                meetingRoomFilter5 = null;
            }
            RoomViewFilterConfigs roomViewFilterConfigs3 = this.f78168f;
            if (!(roomViewFilterConfigs3 == null || (newBuilder2 = roomViewFilterConfigs3.newBuilder()) == null || (a2 = newBuilder2.mo57537a(meetingRoomFilter5)) == null)) {
                roomViewFilterConfigs = a2.build();
            }
            this.f78168f = roomViewFilterConfigs;
            return;
        }
        RoomViewFilterConfigs roomViewFilterConfigs4 = this.f78168f;
        if (roomViewFilterConfigs4 == null || (meetingRoomFilter3 = roomViewFilterConfigs4.meeting_room_filter) == null || (list = meetingRoomFilter3.need_equipments) == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list);
        }
        if (bVar.mo116063d()) {
            arrayList.add(bVar.mo116059a());
        } else {
            arrayList.remove(bVar.mo116059a());
        }
        RoomViewFilterConfigs roomViewFilterConfigs5 = this.f78168f;
        if (roomViewFilterConfigs5 == null || (meetingRoomFilter = roomViewFilterConfigs5.meeting_room_filter) == null) {
            meetingRoomFilter = new MeetingRoomFilter.C15872a().build();
        }
        MeetingRoomFilter.C15872a a4 = meetingRoomFilter.newBuilder().mo57259a(arrayList);
        if (a4 != null) {
            meetingRoomFilter2 = a4.build();
        } else {
            meetingRoomFilter2 = null;
        }
        RoomViewFilterConfigs roomViewFilterConfigs6 = this.f78168f;
        if (!(roomViewFilterConfigs6 == null || (newBuilder = roomViewFilterConfigs6.newBuilder()) == null || (a = newBuilder.mo57537a(meetingRoomFilter2)) == null)) {
            roomViewFilterConfigs = a.build();
        }
        this.f78168f = roomViewFilterConfigs;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c$e */
    public static final class C31014e<T> implements Comparator<MultiRoomNode> {

        /* renamed from: a */
        public static final C31014e f78181a = new C31014e();

        C31014e() {
        }

        /* renamed from: a */
        public final int compare(MultiRoomNode eVar, MultiRoomNode eVar2) {
            return (eVar.mo115848g() > eVar2.mo115848g() ? 1 : (eVar.mo115848g() == eVar2.mo115848g() ? 0 : -1));
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c$f */
    public static final class C31015f<T> implements Comparator<CalendarResource> {

        /* renamed from: a */
        public static final C31015f f78182a = new C31015f();

        C31015f() {
        }

        /* renamed from: a */
        public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
            int i;
            Integer num;
            Integer num2;
            int i2 = 0;
            if (calendarResource2 == null || (num2 = calendarResource2.weight) == null) {
                i = 0;
            } else {
                i = num2.intValue();
            }
            if (!(calendarResource == null || (num = calendarResource.weight) == null)) {
                i2 = num.intValue();
            }
            return i - i2;
        }
    }

    /* renamed from: a */
    public final List<QueryInstanceTask> mo112242a(int i, int i2) {
        this.f78164b = i;
        this.f78165c = i2;
        return m115687n();
    }

    /* renamed from: a */
    private final boolean m115685a(CalendarResource calendarResource, List<String> list) {
        boolean z;
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        List<MeetingRoomEquipment> list3 = calendarResource.equipments;
        if (list3 == null) {
            return false;
        }
        List<MeetingRoomEquipment> list4 = list3;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().id);
        }
        ArrayList arrayList2 = arrayList;
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!arrayList2.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final QueryInstanceTask m115686b(int i, int i2) {
        ArrayList<CalendarResource> arrayList;
        Integer num;
        Integer num2;
        boolean z;
        Boolean[] boolArr = this.f78173k;
        if (!(boolArr == null || (arrayList = this.f78172j) == null)) {
            if (boolArr.length != arrayList.size() || this.f78172j == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("roomDataCache.size = ");
                ArrayList<CalendarResource> arrayList2 = this.f78172j;
                if (arrayList2 != null) {
                    num = Integer.valueOf(arrayList2.size());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(", mRoomHasInstanceFlag.size = ");
                Boolean[] boolArr2 = this.f78173k;
                if (boolArr2 != null) {
                    num2 = Integer.valueOf(boolArr2.length);
                } else {
                    num2 = null;
                }
                sb.append(num2);
                Log.m165383e("RoomDiagramModel", C32673y.m125378d(sb.toString()));
            } else {
                int max = Math.max(0, i);
                int min = Math.min(arrayList.size() - 1, i2);
                if (max >= arrayList.size() || min >= arrayList.size()) {
                    return null;
                }
                if (max <= min) {
                    int i3 = max;
                    z = true;
                    while (true) {
                        z &= boolArr[i3].booleanValue();
                        if (i3 == min) {
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = true;
                }
                if (z) {
                    return null;
                }
                if (max <= min) {
                    int i4 = max;
                    while (true) {
                        boolArr[i4] = true;
                        if (i4 == min) {
                            break;
                        }
                        i4++;
                    }
                }
                List<CalendarResource> subList = arrayList.subList(max, min + 1);
                Intrinsics.checkExpressionValueIsNotNull(subList, "roomDataCache.subList(co…dex, correctEndIndex + 1)");
                List<CalendarResource> list = subList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().calendar_id);
                }
                return new QueryInstanceTask(new IndexRange(max, min), this.f78166d, arrayList3);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m115683a(RoomDiagramModel cVar, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        cVar.mo112252a(map, z);
    }
}
