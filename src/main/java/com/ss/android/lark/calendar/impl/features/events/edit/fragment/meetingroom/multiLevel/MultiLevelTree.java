package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.LevelContent;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0002J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00042\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0011j\b\u0012\u0004\u0012\u00020\u0019`\u00132\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "", "()V", "currentLevelNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "rootLevelNode", "buildMultiLevelNodeTree", "", "info", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "parentNode", "originalMultiLevelAndMeetRoomMap", "", "", "getCurrentLevelNode", "getRootLevelNode", "getSelectedMeetingRoomNodeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "Lkotlin/collections/ArrayList;", "getSelectedMeetingRoomNodeListByLevel", "node", "initMultiLevelNodeState", "", "selectMeetingRoomList", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "weight", "initTreeState", "setCurrentLevelNode", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.c.d */
public final class MultiLevelTree {

    /* renamed from: c */
    public static final Companion f80780c = new Companion(null);

    /* renamed from: a */
    public final MultiLevelNode f80781a;

    /* renamed from: b */
    public MultiLevelNode f80782b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree$Companion;", "", "()V", "ROOM_NODE_MIN_WEIGHT", "", "ROOT_LEVEL_ID", "", "buildTree", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "levelInfo", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "isAddTenantLevel", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.c.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MultiLevelTree mo115842a(Map<String, LevelRelatedInfo> map, boolean z) {
            Intrinsics.checkParameterIsNotNull(map, "levelInfo");
            MultiLevelTree dVar = new MultiLevelTree();
            MultiLevelNode bVar = dVar.f80781a;
            if (z) {
                String str = CalendarDetailService.f83432a.mo118837b().tenant_name;
                Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDetailService.ge…rTenantInfo().tenant_name");
                bVar = new MultiLevelNode(new LevelContent(str, "0"), null, null, 6, null);
                bVar.mo115822a(dVar.f80781a);
                dVar.f80781a.mo115825a(CollectionsKt.arrayListOf(bVar));
                dVar.f80782b = bVar;
            }
            LevelRelatedInfo levelRelatedInfo = map.get("0");
            if (levelRelatedInfo != null) {
                dVar.mo115837a(levelRelatedInfo, bVar, map);
            }
            dVar.mo115836a();
            return dVar;
        }
    }

    /* renamed from: c */
    public final MultiLevelNode mo115840c() {
        return this.f80782b;
    }

    /* renamed from: d */
    public final MultiLevelNode mo115841d() {
        return this.f80781a;
    }

    /* renamed from: b */
    public final ArrayList<MultiRoomNode> mo115839b() {
        return m120483b(this.f80781a);
    }

    /* renamed from: a */
    public final void mo115836a() {
        m120482a(this.f80781a, new ArrayList<>(), 1);
    }

    public MultiLevelTree() {
        MultiLevelNode bVar = new MultiLevelNode(new LevelContent(C32634ae.m125182b(R.string.Calendar_Edit_AllRooms), "0"), null, null, 6, null);
        this.f80781a = bVar;
        this.f80782b = bVar;
    }

    /* renamed from: a */
    public final void mo115838a(MultiLevelNode bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "node");
        this.f80782b = bVar;
    }

    /* renamed from: b */
    private final ArrayList<MultiRoomNode> m120483b(MultiLevelNode bVar) {
        ArrayList<MultiRoomNode> arrayList = new ArrayList<>();
        Iterator<MultiRoomNode> it = bVar.mo115832h().iterator();
        while (it.hasNext()) {
            MultiRoomNode next = it.next();
            if (next.mo115823b() == IBuildingContract.SelectState.ALL) {
                arrayList.add(next);
            }
        }
        Iterator<MultiLevelNode> it2 = bVar.mo115831g().iterator();
        while (it2.hasNext()) {
            MultiLevelNode next2 = it2.next();
            if (next2.mo115823b() == IBuildingContract.SelectState.ALL || next2.mo115823b() == IBuildingContract.SelectState.SELF) {
                Intrinsics.checkExpressionValueIsNotNull(next2, "level");
                arrayList.addAll(m120483b(next2));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final long m120482a(MultiLevelNode bVar, ArrayList<EventMeetingRoomData> arrayList, long j) {
        String str;
        Iterator<MultiRoomNode> it = bVar.mo115832h().iterator();
        while (it.hasNext()) {
            MultiRoomNode next = it.next();
            Iterator<EventMeetingRoomData> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    CalendarResource calendarResource = it2.next().getCalendarResource();
                    if (calendarResource != null) {
                        str = calendarResource.getCalendarId();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, next.mo115847f().calendar_id)) {
                        next.mo115821a(IBuildingContract.SelectState.ALL);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (next.mo115847f().status == CalendarResource.Status.BUSY) {
                next.mo115821a(IBuildingContract.SelectState.NOT_OPTIONAL);
            } else {
                next.mo115821a(IBuildingContract.SelectState.NONE);
            }
            next.mo115843b(j);
            j = 1 + j;
        }
        Iterator<MultiLevelNode> it3 = bVar.mo115831g().iterator();
        while (it3.hasNext()) {
            MultiLevelNode next2 = it3.next();
            Intrinsics.checkExpressionValueIsNotNull(next2, "level");
            j += m120482a(next2, arrayList, j);
        }
        MultiLevelNode.f80774a.mo115835a(bVar);
        return j;
    }

    /* renamed from: a */
    public final void mo115837a(LevelRelatedInfo levelRelatedInfo, MultiLevelNode bVar, Map<String, LevelRelatedInfo> map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<com.bytedance.lark.pb.calendar.v1.CalendarResource> list = levelRelatedInfo.son_resources;
        RandomAccess randomAccess = null;
        if (list != null) {
            List<com.bytedance.lark.pb.calendar.v1.CalendarResource> list2 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                MultiRoomNode eVar = new MultiRoomNode(t, 0, 2, null);
                eVar.mo115822a(bVar);
                Long l = levelRelatedInfo.resource_weight.get(t.calendar_id);
                if (l != null) {
                    eVar.mo115820a(l.longValue());
                }
                arrayList3.add(eVar);
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (!(arrayList instanceof ArrayList)) {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList<>();
        }
        bVar.mo115826b(arrayList4);
        List<LevelContent> list3 = levelRelatedInfo.son_level_infos;
        if (list3 != null) {
            List<LevelContent> list4 = list3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (T t2 : list4) {
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                MultiLevelNode bVar2 = new MultiLevelNode(t2, null, null, 6, null);
                bVar2.mo115822a(bVar);
                Long l2 = levelRelatedInfo.level_weight.get(t2.level_id);
                if (l2 != null) {
                    bVar2.mo115820a(l2.longValue());
                }
                LevelRelatedInfo levelRelatedInfo2 = map.get(t2.level_id);
                if (levelRelatedInfo2 != null) {
                    mo115837a(levelRelatedInfo2, bVar2, map);
                }
                arrayList5.add(bVar2);
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        if (arrayList2 instanceof ArrayList) {
            randomAccess = arrayList2;
        }
        ArrayList<MultiLevelNode> arrayList6 = (ArrayList) randomAccess;
        if (arrayList6 == null) {
            arrayList6 = new ArrayList<>();
        }
        bVar.mo115825a(arrayList6);
    }
}
