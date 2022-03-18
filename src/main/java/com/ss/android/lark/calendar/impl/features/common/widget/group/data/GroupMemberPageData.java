package com.ss.android.lark.calendar.impl.features.common.widget.group.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;", "", "hasMore", "", "pageOffset", "", "groupMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(ZLjava/lang/String;Ljava/util/List;)V", "getGroupMembers", "()Ljava/util/List;", "setGroupMembers", "(Ljava/util/List;)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getPageOffset", "()Ljava/lang/String;", "setPageOffset", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.data.b */
public final class GroupMemberPageData {

    /* renamed from: a */
    private boolean f78918a;

    /* renamed from: b */
    private String f78919b;

    /* renamed from: c */
    private List<CalendarEventAttendee> f78920c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupMemberPageData)) {
            return false;
        }
        GroupMemberPageData bVar = (GroupMemberPageData) obj;
        return this.f78918a == bVar.f78918a && Intrinsics.areEqual(this.f78919b, bVar.f78919b) && Intrinsics.areEqual(this.f78920c, bVar.f78920c);
    }

    public int hashCode() {
        boolean z = this.f78918a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f78919b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        List<CalendarEventAttendee> list = this.f78920c;
        if (list != null) {
            i5 = list.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        return "GroupMemberPageData(hasMore=" + this.f78918a + ", pageOffset=" + this.f78919b + ", groupMembers=" + this.f78920c + ")";
    }

    /* renamed from: a */
    public final boolean mo113180a() {
        return this.f78918a;
    }

    /* renamed from: b */
    public final String mo113181b() {
        return this.f78919b;
    }

    /* renamed from: c */
    public final List<CalendarEventAttendee> mo113182c() {
        return this.f78920c;
    }

    public GroupMemberPageData(boolean z, String str, List<CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(str, "pageOffset");
        Intrinsics.checkParameterIsNotNull(list, "groupMembers");
        this.f78918a = z;
        this.f78919b = str;
        this.f78920c = list;
    }
}
