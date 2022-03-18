package com.ss.android.vc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0004H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/ss/android/vc/entity/UpdateHistoryMeetings;", "", "updatedMeetings", "", "", "Lcom/ss/android/vc/entity/HistoryMeeting;", "addedMeetings", "", "deletedMeetings", "", "(Ljava/util/Map;Ljava/util/List;Ljava/util/Set;)V", "getAddedMeetings", "()Ljava/util/List;", "setAddedMeetings", "(Ljava/util/List;)V", "getDeletedMeetings", "()Ljava/util/Set;", "setDeletedMeetings", "(Ljava/util/Set;)V", "getUpdatedMeetings", "()Ljava/util/Map;", "setUpdatedMeetings", "(Ljava/util/Map;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.p */
public final class UpdateHistoryMeetings {

    /* renamed from: a */
    private Map<String, HistoryMeeting> f152548a;

    /* renamed from: b */
    private List<HistoryMeeting> f152549b;

    /* renamed from: c */
    private Set<String> f152550c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateHistoryMeetings)) {
            return false;
        }
        UpdateHistoryMeetings pVar = (UpdateHistoryMeetings) obj;
        return Intrinsics.areEqual(this.f152548a, pVar.f152548a) && Intrinsics.areEqual(this.f152549b, pVar.f152549b) && Intrinsics.areEqual(this.f152550c, pVar.f152550c);
    }

    public int hashCode() {
        Map<String, HistoryMeeting> map = this.f152548a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<HistoryMeeting> list = this.f152549b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Set<String> set = this.f152550c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "UpdateHistoryMeetings(updatedMeetings=" + this.f152548a.size() + ", addedMeetings=" + this.f152549b.size() + ", deletedMeetings=" + this.f152550c.size() + ')';
    }

    public UpdateHistoryMeetings(Map<String, HistoryMeeting> map, List<HistoryMeeting> list, Set<String> set) {
        Intrinsics.checkParameterIsNotNull(map, "updatedMeetings");
        Intrinsics.checkParameterIsNotNull(list, "addedMeetings");
        Intrinsics.checkParameterIsNotNull(set, "deletedMeetings");
        this.f152548a = map;
        this.f152549b = list;
        this.f152550c = set;
    }
}
