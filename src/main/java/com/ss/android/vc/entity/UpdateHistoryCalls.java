package com.ss.android.vc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/ss/android/vc/entity/UpdateHistoryCalls;", "", "updatedCalls", "", "", "Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;", "addedCalls", "", "deletedCalls", "", "(Ljava/util/Map;Ljava/util/List;Ljava/util/Set;)V", "getAddedCalls", "()Ljava/util/List;", "setAddedCalls", "(Ljava/util/List;)V", "getDeletedCalls", "()Ljava/util/Set;", "setDeletedCalls", "(Ljava/util/Set;)V", "getUpdatedCalls", "()Ljava/util/Map;", "setUpdatedCalls", "(Ljava/util/Map;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.o */
public final class UpdateHistoryCalls {

    /* renamed from: a */
    private Map<String, VCMeetingAbbrInfo> f152545a;

    /* renamed from: b */
    private List<VCMeetingAbbrInfo> f152546b;

    /* renamed from: c */
    private Set<String> f152547c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateHistoryCalls)) {
            return false;
        }
        UpdateHistoryCalls oVar = (UpdateHistoryCalls) obj;
        return Intrinsics.areEqual(this.f152545a, oVar.f152545a) && Intrinsics.areEqual(this.f152546b, oVar.f152546b) && Intrinsics.areEqual(this.f152547c, oVar.f152547c);
    }

    public int hashCode() {
        Map<String, VCMeetingAbbrInfo> map = this.f152545a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<VCMeetingAbbrInfo> list = this.f152546b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Set<String> set = this.f152547c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "UpdateHistoryCalls(updatedCalls=" + this.f152545a + ", addedCalls=" + this.f152546b + ", deletedCalls=" + this.f152547c + ")";
    }

    public UpdateHistoryCalls(Map<String, VCMeetingAbbrInfo> map, List<VCMeetingAbbrInfo> list, Set<String> set) {
        Intrinsics.checkParameterIsNotNull(map, "updatedCalls");
        Intrinsics.checkParameterIsNotNull(list, "addedCalls");
        Intrinsics.checkParameterIsNotNull(set, "deletedCalls");
        this.f152545a = map;
        this.f152546b = list;
        this.f152547c = set;
    }
}
