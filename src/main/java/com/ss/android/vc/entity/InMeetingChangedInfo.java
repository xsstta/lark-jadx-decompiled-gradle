package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/entity/InMeetingChangedInfo;", "Ljava/io/Serializable;", "changes", "", "Lcom/ss/android/vc/entity/InMeetingData;", "(Ljava/util/List;)V", "getChanges", "()Ljava/util/List;", "setChanges", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InMeetingChangedInfo implements Serializable {
    private List<? extends InMeetingData> changes;

    public InMeetingChangedInfo() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.vc.entity.InMeetingChangedInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMeetingChangedInfo copy$default(InMeetingChangedInfo inMeetingChangedInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inMeetingChangedInfo.changes;
        }
        return inMeetingChangedInfo.copy(list);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.InMeetingData>, java.util.List<com.ss.android.vc.entity.InMeetingData> */
    public final List<InMeetingData> component1() {
        return this.changes;
    }

    public final InMeetingChangedInfo copy(List<? extends InMeetingData> list) {
        return new InMeetingChangedInfo(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InMeetingChangedInfo) && Intrinsics.areEqual(this.changes, ((InMeetingChangedInfo) obj).changes);
        }
        return true;
    }

    public int hashCode() {
        List<? extends InMeetingData> list = this.changes;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "InMeetingChangedInfo(changes=" + this.changes + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.InMeetingData>, java.util.List<com.ss.android.vc.entity.InMeetingData> */
    public final List<InMeetingData> getChanges() {
        return this.changes;
    }

    public final void setChanges(List<? extends InMeetingData> list) {
        this.changes = list;
    }

    public InMeetingChangedInfo(List<? extends InMeetingData> list) {
        this.changes = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InMeetingChangedInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
