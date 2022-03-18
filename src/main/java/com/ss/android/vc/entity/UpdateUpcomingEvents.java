package com.ss.android.vc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0004H\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/ss/android/vc/entity/UpdateUpcomingEvents;", "", "updatedEvents", "", "", "Lcom/ss/android/vc/entity/UpcomingEvent;", "deleteEventIds", "", "addedEvents", "", "(Ljava/util/Map;Ljava/util/Set;Ljava/util/List;)V", "getAddedEvents", "()Ljava/util/List;", "setAddedEvents", "(Ljava/util/List;)V", "getDeleteEventIds", "()Ljava/util/Set;", "setDeleteEventIds", "(Ljava/util/Set;)V", "getUpdatedEvents", "()Ljava/util/Map;", "setUpdatedEvents", "(Ljava/util/Map;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.q */
public final class UpdateUpcomingEvents {

    /* renamed from: a */
    private Map<String, UpcomingEvent> f152551a;

    /* renamed from: b */
    private Set<String> f152552b;

    /* renamed from: c */
    private List<UpcomingEvent> f152553c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUpcomingEvents)) {
            return false;
        }
        UpdateUpcomingEvents qVar = (UpdateUpcomingEvents) obj;
        return Intrinsics.areEqual(this.f152551a, qVar.f152551a) && Intrinsics.areEqual(this.f152552b, qVar.f152552b) && Intrinsics.areEqual(this.f152553c, qVar.f152553c);
    }

    public int hashCode() {
        Map<String, UpcomingEvent> map = this.f152551a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Set<String> set = this.f152552b;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        List<UpcomingEvent> list = this.f152553c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "UpdateUpcomingEvents(updatedEvents=" + this.f152551a.size() + ", deleteEventIds=" + this.f152552b.size() + ", addedEvents=" + this.f152553c.size() + ')';
    }

    public UpdateUpcomingEvents(Map<String, UpcomingEvent> map, Set<String> set, List<UpcomingEvent> list) {
        Intrinsics.checkParameterIsNotNull(map, "updatedEvents");
        Intrinsics.checkParameterIsNotNull(set, "deleteEventIds");
        Intrinsics.checkParameterIsNotNull(list, "addedEvents");
        this.f152551a = map;
        this.f152552b = set;
        this.f152553c = list;
    }
}
