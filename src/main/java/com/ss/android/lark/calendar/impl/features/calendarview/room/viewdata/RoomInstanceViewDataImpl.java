package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.RoomViewInstance;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramModel;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0002J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\bR\u001b\u0010\n\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078VX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewDataImpl;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewData;", "dataDay", "", "queryTask", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramModel$QueryInstanceTask;", "roomInstanceList", "", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "(ILcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramModel$QueryInstanceTask;Ljava/util/List;)V", "BLUE_COLOR", "getBLUE_COLOR", "()I", "BLUE_COLOR$delegate", "Lkotlin/Lazy;", "GRAY_COLOR", "getGRAY_COLOR", "GRAY_COLOR$delegate", "isErrorData", "", "()Z", "refreshRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/IndexRange;", "getRefreshRange", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/IndexRange;", "roomsInstance", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomInstance;", "getRoomsInstance", "()Ljava/util/List;", "roomsInstance$delegate", "createRoomsInstance", "getColor", "roomInstance", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.n */
public final class RoomInstanceViewDataImpl implements RoomInstanceViewData {

    /* renamed from: b */
    public static final Companion f78303b = new Companion(null);

    /* renamed from: c */
    private final Lazy f78304c = LazyKt.lazy(C31057a.INSTANCE);

    /* renamed from: d */
    private final Lazy f78305d = LazyKt.lazy(C31059c.INSTANCE);

    /* renamed from: e */
    private final IndexRange f78306e;

    /* renamed from: f */
    private final boolean f78307f;

    /* renamed from: g */
    private final Lazy f78308g;

    /* renamed from: h */
    private final int f78309h;

    /* renamed from: i */
    private final RoomDiagramModel.QueryInstanceTask f78310i;

    /* renamed from: j */
    private final List<RoomViewInstance> f78311j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewDataImpl$Companion;", "", "()V", "TAG", "", "createEmptyData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.n$b */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewDataImpl$Companion$createEmptyData$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewData;", "isErrorData", "", "()Z", "refreshRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/IndexRange;", "getRefreshRange", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/IndexRange;", "roomsInstance", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomInstance;", "getRoomsInstance", "()Ljava/util/List;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.n$b$a */
        public static final class C31058a implements RoomInstanceViewData {

            /* renamed from: b */
            private final boolean f78312b;

            /* renamed from: c */
            private final IndexRange f78313c = new IndexRange(0, 0);

            /* renamed from: d */
            private final List<OneRoomInstance> f78314d = CollectionsKt.emptyList();

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData
            /* renamed from: a */
            public boolean mo112420a() {
                return this.f78312b;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData
            /* renamed from: b */
            public IndexRange mo112421b() {
                return this.f78313c;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData
            /* renamed from: c */
            public List<OneRoomInstance> mo112422c() {
                return this.f78314d;
            }

            C31058a() {
            }
        }

        private Companion() {
        }

        /* renamed from: a */
        public final RoomInstanceViewData mo112425a() {
            return new C31058a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final int m115858e() {
        return ((Number) this.f78304c.getValue()).intValue();
    }

    /* renamed from: f */
    private final int m115859f() {
        return ((Number) this.f78305d.getValue()).intValue();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData
    /* renamed from: c */
    public List<OneRoomInstance> mo112422c() {
        return (List) this.f78308g.getValue();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData
    /* renamed from: a */
    public boolean mo112420a() {
        return this.f78307f;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData
    /* renamed from: b */
    public IndexRange mo112421b() {
        return this.f78306e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.n$a */
    static final class C31057a extends Lambda implements Function0<Integer> {
        public static final C31057a INSTANCE = new C31057a();

        C31057a() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return C32634ae.m125178a(R.color.ud_B300);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.n$c */
    static final class C31059c extends Lambda implements Function0<Integer> {
        public static final C31059c INSTANCE = new C31059c();

        C31059c() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return C32634ae.m125178a(R.color.ud_N300);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomInstance;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.n$d */
    static final class C31060d extends Lambda implements Function0<List<? extends OneRoomInstance>> {
        final /* synthetic */ RoomInstanceViewDataImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31060d(RoomInstanceViewDataImpl nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.util.List<com.ss.android.lark.calendar.impl.features.calendarview.room.e.j>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends OneRoomInstance> invoke() {
            return this.this$0.mo112424d();
        }
    }

    /* renamed from: d */
    public final List<OneRoomInstance> mo112424d() {
        List<RoomViewInstance> list;
        boolean z;
        List<RoomViewInstance> list2 = this.f78311j;
        if (list2 != null) {
            list = CollectionsKt.filterNotNull(list2);
        } else {
            list = null;
        }
        List list3 = list;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<String> c = this.f78310i.mo112273c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c, 10));
            Iterator<T> it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(new OneRoomInstance(it.next(), this.f78309h, new ArrayList(0)));
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        for (RoomViewInstance roomViewInstance : list) {
            OneRoomInstance jVar = (OneRoomInstance) hashMap.get(roomViewInstance.resource_calendar_id);
            if (jVar == null) {
                String str = roomViewInstance.resource_calendar_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "instance.resource_calendar_id");
                jVar = new OneRoomInstance(str, this.f78309h, new ArrayList());
                String str2 = roomViewInstance.resource_calendar_id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "instance.resource_calendar_id");
                hashMap.put(str2, jVar);
            }
            Intrinsics.checkExpressionValueIsNotNull(jVar, "roomMap[instance.resourc…    newRoom\n            }");
            jVar.mo112398c().add(new OneInstance(Math.max(roomViewInstance.start_minute.intValue() + ((roomViewInstance.start_day.intValue() - this.f78309h) * CalendarWorkHourUtil.f83805a), 0), Math.min(roomViewInstance.end_minute.intValue() + ((roomViewInstance.end_day.intValue() - this.f78309h) * CalendarWorkHourUtil.f83805a), (int) CalendarWorkHourUtil.f83805a), mo112423a(roomViewInstance)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : this.f78310i.mo112273c()) {
            OneRoomInstance jVar2 = (OneRoomInstance) hashMap.get(t);
            if (jVar2 == null) {
                jVar2 = new OneRoomInstance(t, this.f78309h, new ArrayList());
            }
            arrayList2.add(jVar2);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final int mo112423a(RoomViewInstance roomViewInstance) {
        Intrinsics.checkParameterIsNotNull(roomViewInstance, "roomInstance");
        if (CalendarEvent.Category.RESOURCE_REQUISITION == roomViewInstance.category || CalendarEvent.Category.RESOURCE_STRATEGY == roomViewInstance.category) {
            return m115859f();
        }
        if (roomViewInstance.current_user_accessibility == RoomViewInstance.UserAccessibility.EVENT_VISIBILE || roomViewInstance.current_user_accessibility == RoomViewInstance.UserAccessibility.JOINED) {
            return m115858e();
        }
        return m115859f();
    }

    public RoomInstanceViewDataImpl(int i, RoomDiagramModel.QueryInstanceTask bVar, List<RoomViewInstance> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "queryTask");
        this.f78309h = i;
        this.f78310i = bVar;
        this.f78311j = list;
        this.f78306e = bVar.mo112271a();
        if (list == null) {
            z = true;
        } else {
            z = false;
        }
        this.f78307f = z;
        this.f78308g = LazyKt.lazy(new C31060d(this));
    }
}
