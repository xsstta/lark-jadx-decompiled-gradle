package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel;

import com.bytedance.lark.pb.calendar.v1.LevelContent;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001$BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u0006\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0005j\b\u0012\u0004\u0012\u00020\b`\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u0006HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0005j\b\u0012\u0004\u0012\u00020\b`\u0006HÆ\u0003JG\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0005j\b\u0012\u0004\u0012\u00020\b`\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0005j\b\u0012\u0004\u0012\u00020\b`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiBaseNode;", "levelContent", "Lcom/bytedance/lark/pb/calendar/v1/LevelContent;", "sonLevelNodeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sonRoomNodeList", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "(Lcom/bytedance/lark/pb/calendar/v1/LevelContent;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getLevelContent", "()Lcom/bytedance/lark/pb/calendar/v1/LevelContent;", "getSonLevelNodeList", "()Ljava/util/ArrayList;", "setSonLevelNodeList", "(Ljava/util/ArrayList;)V", "getSonRoomNodeList", "setSonRoomNodeList", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "onAddUpdateMultiLevelNodeState", "onSelectUpdateMultiLevelNodeState", "toString", "", "updateLowerLevelNodeState", "node", "state", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.c.b */
public final class MultiLevelNode extends MultiBaseNode {

    /* renamed from: a */
    public static final Companion f80774a = new Companion(null);

    /* renamed from: b */
    private final LevelContent f80775b;

    /* renamed from: c */
    private ArrayList<MultiLevelNode> f80776c;

    /* renamed from: d */
    private ArrayList<MultiRoomNode> f80777d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiLevelNode)) {
            return false;
        }
        MultiLevelNode bVar = (MultiLevelNode) obj;
        return Intrinsics.areEqual(this.f80775b, bVar.f80775b) && Intrinsics.areEqual(this.f80776c, bVar.f80776c) && Intrinsics.areEqual(this.f80777d, bVar.f80777d);
    }

    public int hashCode() {
        LevelContent levelContent = this.f80775b;
        int i = 0;
        int hashCode = (levelContent != null ? levelContent.hashCode() : 0) * 31;
        ArrayList<MultiLevelNode> arrayList = this.f80776c;
        int hashCode2 = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<MultiRoomNode> arrayList2 = this.f80777d;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MultiLevelNode(levelContent=" + this.f80775b + ", sonLevelNodeList=" + this.f80776c + ", sonRoomNodeList=" + this.f80777d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode$Companion;", "", "()V", "updateCurrentLevelNodeState", "", "node", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo115835a(MultiLevelNode bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "node");
            Iterator<MultiLevelNode> it = bVar.mo115831g().iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = C31764c.f80778a[it.next().mo115823b().ordinal()];
                if (i4 == 1) {
                    i++;
                } else if (i4 == 2) {
                    i2++;
                } else if (i4 == 3) {
                    i3++;
                }
            }
            Iterator<MultiRoomNode> it2 = bVar.mo115832h().iterator();
            while (it2.hasNext()) {
                int i5 = C31764c.f80779b[it2.next().mo115823b().ordinal()];
                if (i5 == 1) {
                    i++;
                } else if (i5 == 2) {
                    i2++;
                }
            }
            int size = bVar.mo115831g().size() + bVar.mo115832h().size();
            if (i + i2 == size && i > 0) {
                bVar.mo115821a(IBuildingContract.SelectState.ALL);
            } else if (i2 == size) {
                bVar.mo115821a(IBuildingContract.SelectState.NOT_OPTIONAL);
            } else if (i > 0 || i3 > 0) {
                bVar.mo115821a(IBuildingContract.SelectState.SELF);
            } else {
                bVar.mo115821a(IBuildingContract.SelectState.NONE);
            }
        }
    }

    /* renamed from: f */
    public final LevelContent mo115830f() {
        return this.f80775b;
    }

    /* renamed from: g */
    public final ArrayList<MultiLevelNode> mo115831g() {
        return this.f80776c;
    }

    /* renamed from: h */
    public final ArrayList<MultiRoomNode> mo115832h() {
        return this.f80777d;
    }

    /* renamed from: d */
    public final int mo115827d() {
        int a = m120473a(this, IBuildingContract.SelectState.NONE);
        for (MultiLevelNode a2 = mo115819a(); a2 != null; a2 = a2.mo115819a()) {
            f80774a.mo115835a(a2);
        }
        return a;
    }

    /* renamed from: e */
    public final int mo115828e() {
        int a = m120473a(this, IBuildingContract.SelectState.ALL);
        for (MultiLevelNode a2 = mo115819a(); a2 != null; a2 = a2.mo115819a()) {
            f80774a.mo115835a(a2);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo115825a(ArrayList<MultiLevelNode> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f80776c = arrayList;
    }

    /* renamed from: b */
    public final void mo115826b(ArrayList<MultiRoomNode> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f80777d = arrayList;
    }

    /* renamed from: a */
    private final int m120473a(MultiLevelNode bVar, IBuildingContract.SelectState selectState) {
        int i = 0;
        if (bVar.mo115823b() == IBuildingContract.SelectState.NOT_OPTIONAL) {
            return 0;
        }
        bVar.mo115821a(selectState);
        Iterator<MultiLevelNode> it = bVar.f80776c.iterator();
        while (it.hasNext()) {
            MultiLevelNode next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "levelNode");
            i += m120473a(next, selectState);
        }
        Iterator<MultiRoomNode> it2 = bVar.f80777d.iterator();
        while (it2.hasNext()) {
            MultiRoomNode next2 = it2.next();
            if (!(next2.mo115823b() == IBuildingContract.SelectState.NOT_OPTIONAL || next2.mo115823b() == selectState)) {
                next2.mo115821a(selectState);
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLevelNode(LevelContent levelContent, ArrayList<MultiLevelNode> arrayList, ArrayList<MultiRoomNode> arrayList2) {
        super(null, null, 0, 7, null);
        Intrinsics.checkParameterIsNotNull(levelContent, "levelContent");
        Intrinsics.checkParameterIsNotNull(arrayList, "sonLevelNodeList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "sonRoomNodeList");
        this.f80775b = levelContent;
        this.f80776c = arrayList;
        this.f80777d = arrayList2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiLevelNode(LevelContent levelContent, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(levelContent, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new ArrayList() : arrayList2);
    }
}
