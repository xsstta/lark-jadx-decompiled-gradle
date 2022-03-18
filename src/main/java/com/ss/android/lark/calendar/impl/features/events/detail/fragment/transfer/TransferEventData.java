package com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;", "Ljava/io/Serializable;", "calendarId", "", "key", "originalTime", "", "isShareCalendarEvent", "", "organizerName", "organizerId", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)V", "getCalendarId", "()Ljava/lang/String;", "()Z", "getKey", "getOrganizerId", "getOrganizerName", "getOriginalTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TransferEventData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final String calendarId;
    private final boolean isShareCalendarEvent;
    private final String key;
    private final String organizerId;
    private final String organizerName;
    private final long originalTime;

    public static /* synthetic */ TransferEventData copy$default(TransferEventData transferEventData, String str, String str2, long j, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferEventData.calendarId;
        }
        if ((i & 2) != 0) {
            str2 = transferEventData.key;
        }
        if ((i & 4) != 0) {
            j = transferEventData.originalTime;
        }
        if ((i & 8) != 0) {
            z = transferEventData.isShareCalendarEvent;
        }
        if ((i & 16) != 0) {
            str3 = transferEventData.organizerName;
        }
        if ((i & 32) != 0) {
            str4 = transferEventData.organizerId;
        }
        return transferEventData.copy(str, str2, j, z, str3, str4);
    }

    public final String component1() {
        return this.calendarId;
    }

    public final String component2() {
        return this.key;
    }

    public final long component3() {
        return this.originalTime;
    }

    public final boolean component4() {
        return this.isShareCalendarEvent;
    }

    public final String component5() {
        return this.organizerName;
    }

    public final String component6() {
        return this.organizerId;
    }

    public final TransferEventData copy(String str, String str2, long j, boolean z, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(str3, "organizerName");
        return new TransferEventData(str, str2, j, z, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferEventData)) {
            return false;
        }
        TransferEventData transferEventData = (TransferEventData) obj;
        return Intrinsics.areEqual(this.calendarId, transferEventData.calendarId) && Intrinsics.areEqual(this.key, transferEventData.key) && this.originalTime == transferEventData.originalTime && this.isShareCalendarEvent == transferEventData.isShareCalendarEvent && Intrinsics.areEqual(this.organizerName, transferEventData.organizerName) && Intrinsics.areEqual(this.organizerId, transferEventData.organizerId);
    }

    public int hashCode() {
        String str = this.calendarId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.key;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.originalTime;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.isShareCalendarEvent;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i2 + i3) * 31;
        String str3 = this.organizerName;
        int hashCode3 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.organizerId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "TransferEventData(calendarId=" + this.calendarId + ", key=" + this.key + ", originalTime=" + this.originalTime + ", isShareCalendarEvent=" + this.isShareCalendarEvent + ", organizerName=" + this.organizerName + ", organizerId=" + this.organizerId + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData$Companion;", "", "()V", "empty", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.TransferEventData$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final TransferEventData mo113817a() {
            return new TransferEventData("", "", 0, false, "", null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getCalendarId() {
        return this.calendarId;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getOrganizerId() {
        return this.organizerId;
    }

    public final String getOrganizerName() {
        return this.organizerName;
    }

    public final long getOriginalTime() {
        return this.originalTime;
    }

    public final boolean isShareCalendarEvent() {
        return this.isShareCalendarEvent;
    }

    public TransferEventData(String str, String str2, long j, boolean z, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(str3, "organizerName");
        this.calendarId = str;
        this.key = str2;
        this.originalTime = j;
        this.isShareCalendarEvent = z;
        this.organizerName = str3;
        this.organizerId = str4;
    }
}
