package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedLiveStatus;", "Ljava/io/Serializable;", "associated_event_id", "", "live_id", "live_status", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/LiveStatus;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/LiveStatus;J)V", "getAssociated_event_id", "()Ljava/lang/String;", "getLive_id", "getLive_status", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/LiveStatus;", "getVersion", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AssociatedLiveStatus implements Serializable {
    private final String associated_event_id;
    private final String live_id;
    private final LiveStatus live_status;
    private final long version;

    public static /* synthetic */ AssociatedLiveStatus copy$default(AssociatedLiveStatus associatedLiveStatus, String str, String str2, LiveStatus liveStatus, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = associatedLiveStatus.associated_event_id;
        }
        if ((i & 2) != 0) {
            str2 = associatedLiveStatus.live_id;
        }
        if ((i & 4) != 0) {
            liveStatus = associatedLiveStatus.live_status;
        }
        if ((i & 8) != 0) {
            j = associatedLiveStatus.version;
        }
        return associatedLiveStatus.copy(str, str2, liveStatus, j);
    }

    public final String component1() {
        return this.associated_event_id;
    }

    public final String component2() {
        return this.live_id;
    }

    public final LiveStatus component3() {
        return this.live_status;
    }

    public final long component4() {
        return this.version;
    }

    public final AssociatedLiveStatus copy(String str, String str2, LiveStatus liveStatus, long j) {
        Intrinsics.checkParameterIsNotNull(str, "associated_event_id");
        Intrinsics.checkParameterIsNotNull(str2, "live_id");
        Intrinsics.checkParameterIsNotNull(liveStatus, "live_status");
        return new AssociatedLiveStatus(str, str2, liveStatus, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssociatedLiveStatus)) {
            return false;
        }
        AssociatedLiveStatus associatedLiveStatus = (AssociatedLiveStatus) obj;
        return Intrinsics.areEqual(this.associated_event_id, associatedLiveStatus.associated_event_id) && Intrinsics.areEqual(this.live_id, associatedLiveStatus.live_id) && Intrinsics.areEqual(this.live_status, associatedLiveStatus.live_status) && this.version == associatedLiveStatus.version;
    }

    public int hashCode() {
        String str = this.associated_event_id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.live_id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        LiveStatus liveStatus = this.live_status;
        if (liveStatus != null) {
            i = liveStatus.hashCode();
        }
        long j = this.version;
        return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "AssociatedLiveStatus(associated_event_id=" + this.associated_event_id + ", live_id=" + this.live_id + ", live_status=" + this.live_status + ", version=" + this.version + ")";
    }

    public final String getAssociated_event_id() {
        return this.associated_event_id;
    }

    public final String getLive_id() {
        return this.live_id;
    }

    public final LiveStatus getLive_status() {
        return this.live_status;
    }

    public final long getVersion() {
        return this.version;
    }

    public AssociatedLiveStatus(String str, String str2, LiveStatus liveStatus, long j) {
        Intrinsics.checkParameterIsNotNull(str, "associated_event_id");
        Intrinsics.checkParameterIsNotNull(str2, "live_id");
        Intrinsics.checkParameterIsNotNull(liveStatus, "live_status");
        this.associated_event_id = str;
        this.live_id = str2;
        this.live_status = liveStatus;
        this.version = j;
    }
}
