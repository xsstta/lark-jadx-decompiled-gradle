package com.ss.android.lark.calendar.impl.features.common.widget.group.data;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0016J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData;", "Lcom/larksuite/framework/utils/diff/Diffable;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData$GroupDataType;", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData$GroupDataType;Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;)V", "getAttendeeData", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "setAttendeeData", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;)V", "getType", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData$GroupDataType;", "setType", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData$GroupDataType;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "isContentSame", "diffable", "isItemSame", "toString", "", "GroupDataType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupMemberUIData implements AbstractC26248b<GroupMemberUIData> {

    /* renamed from: a */
    private GroupDataType f78911a;

    /* renamed from: b */
    private IAttendeeMemberData f78912b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData$GroupDataType;", "", "(Ljava/lang/String;I)V", "ATTENDEE", "HIDE_TIP", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum GroupDataType {
        ATTENDEE,
        HIDE_TIP
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupMemberUIData)) {
            return false;
        }
        GroupMemberUIData groupMemberUIData = (GroupMemberUIData) obj;
        return Intrinsics.areEqual(this.f78911a, groupMemberUIData.f78911a) && Intrinsics.areEqual(this.f78912b, groupMemberUIData.f78912b);
    }

    public int hashCode() {
        GroupDataType groupDataType = this.f78911a;
        int i = 0;
        int hashCode = (groupDataType != null ? groupDataType.hashCode() : 0) * 31;
        IAttendeeMemberData cVar = this.f78912b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GroupMemberUIData(type=" + this.f78911a + ", attendeeData=" + this.f78912b + ")";
    }

    /* renamed from: a */
    public final GroupDataType mo113165a() {
        return this.f78911a;
    }

    /* renamed from: b */
    public final IAttendeeMemberData mo113167b() {
        return this.f78912b;
    }

    /* renamed from: a */
    public boolean isItemSame(GroupMemberUIData groupMemberUIData) {
        String str;
        Intrinsics.checkParameterIsNotNull(groupMemberUIData, "diffable");
        GroupDataType groupDataType = groupMemberUIData.f78911a;
        GroupDataType groupDataType2 = this.f78911a;
        if (groupDataType != groupDataType2) {
            return false;
        }
        if (groupDataType2 == GroupDataType.HIDE_TIP) {
            return true;
        }
        if (this.f78911a != GroupDataType.ATTENDEE) {
            return false;
        }
        IAttendeeMemberData cVar = groupMemberUIData.f78912b;
        String str2 = null;
        if (cVar != null) {
            str = cVar.mo113146d();
        } else {
            str = null;
        }
        IAttendeeMemberData cVar2 = this.f78912b;
        if (cVar2 != null) {
            str2 = cVar2.mo113146d();
        }
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: b */
    public boolean isContentSame(GroupMemberUIData groupMemberUIData) {
        Intrinsics.checkParameterIsNotNull(groupMemberUIData, "diffable");
        GroupDataType groupDataType = groupMemberUIData.f78911a;
        GroupDataType groupDataType2 = this.f78911a;
        if (groupDataType != groupDataType2) {
            return false;
        }
        if (groupDataType2 == GroupDataType.HIDE_TIP) {
            return true;
        }
        IAttendeeMemberData cVar = this.f78912b;
        IAttendeeMemberData cVar2 = groupMemberUIData.f78912b;
        if (cVar == null || cVar2 == null || cVar.mo113148f() != cVar2.mo113148f() || !Intrinsics.areEqual(cVar.mo113147e(), cVar2.mo113147e()) || !Intrinsics.areEqual(cVar.mo113144b(), cVar2.mo113144b()) || !Intrinsics.areEqual(cVar.mo113145c(), cVar2.mo113145c()) || cVar.mo113143a() != cVar2.mo113143a()) {
            return false;
        }
        return true;
    }

    public GroupMemberUIData(GroupDataType groupDataType, IAttendeeMemberData cVar) {
        Intrinsics.checkParameterIsNotNull(groupDataType, ShareHitPoint.f121869d);
        this.f78911a = groupDataType;
        this.f78912b = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupMemberUIData(GroupDataType groupDataType, IAttendeeMemberData cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupDataType, (i & 2) != 0 ? null : cVar);
    }
}
