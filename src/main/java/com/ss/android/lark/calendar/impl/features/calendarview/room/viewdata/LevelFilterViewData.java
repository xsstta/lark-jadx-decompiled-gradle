package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelTree;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fJ&\u0010\u0010\u001a\"\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\rj\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011`\u000fJ\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/LevelFilterViewData;", "", "resourceTree", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;)V", "getResourceTree", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "component1", "copy", "equals", "", "other", "getBreadList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "Lkotlin/collections/ArrayList;", "getLevelItemModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "kotlin.jvm.PlatformType", "getSelectedMeetingRoomList", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "hashCode", "", "setCurrentNode", "", "curNode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.f */
public final class LevelFilterViewData {

    /* renamed from: a */
    private final MultiLevelTree f78269a;

    public LevelFilterViewData() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LevelFilterViewData) && Intrinsics.areEqual(this.f78269a, ((LevelFilterViewData) obj).f78269a);
        }
        return true;
    }

    public int hashCode() {
        MultiLevelTree dVar = this.f78269a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "LevelFilterViewData(resourceTree=" + this.f78269a + ")";
    }

    /* renamed from: d */
    public final MultiLevelTree mo112372d() {
        return this.f78269a;
    }

    /* renamed from: b */
    public final ArrayList<MultiLevelNode> mo112370b() {
        MultiLevelNode bVar;
        ArrayList<MultiLevelNode> arrayList = new ArrayList<>();
        MultiLevelTree dVar = this.f78269a;
        if (dVar != null) {
            bVar = dVar.mo115840c();
        } else {
            bVar = null;
        }
        while (bVar != null) {
            arrayList.add(0, bVar);
            bVar = bVar.mo115819a();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ArrayList<ItemModel> mo112368a() {
        MultiLevelNode c;
        ArrayList<MultiLevelNode> g;
        MultiLevelTree dVar = this.f78269a;
        if (dVar == null || (c = dVar.mo115840c()) == null || (g = c.mo115831g()) == null) {
            return new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = g.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.mo115823b() != IBuildingContract.SelectState.NOT_OPTIONAL) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<MultiLevelNode> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (MultiLevelNode bVar : arrayList2) {
            arrayList3.add(new MultiLevelModel(bVar, 0, 2, null));
        }
        return new ArrayList<>(arrayList3);
    }

    /* renamed from: c */
    public final List<CalendarResource> mo112371c() {
        ArrayList<MultiRoomNode> b;
        List sortedWith;
        MultiLevelTree dVar = this.f78269a;
        if (dVar == null || (b = dVar.mo115839b()) == null || (sortedWith = CollectionsKt.sortedWith(b, C31055a.f78270a)) == null) {
            return null;
        }
        List<MultiRoomNode> list = sortedWith;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (MultiRoomNode eVar : list) {
            arrayList.add(eVar.mo115847f());
        }
        return arrayList;
    }

    public LevelFilterViewData(MultiLevelTree dVar) {
        this.f78269a = dVar;
    }

    /* renamed from: a */
    public final void mo112369a(MultiLevelNode bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "curNode");
        MultiLevelTree dVar = this.f78269a;
        if (dVar != null) {
            dVar.mo115838a(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.f$a */
    static final class C31055a<T> implements Comparator<MultiRoomNode> {

        /* renamed from: a */
        public static final C31055a f78270a = new C31055a();

        C31055a() {
        }

        /* renamed from: a */
        public final int compare(MultiRoomNode eVar, MultiRoomNode eVar2) {
            return (eVar.mo115848g() > eVar2.mo115848g() ? 1 : (eVar.mo115848g() == eVar2.mo115848g() ? 0 : -1));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LevelFilterViewData(MultiLevelTree dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dVar);
    }
}
